package domainB.doorway;

import domainB.api.DomainBEventMsg;
import domainB.helper.ContextHelper;
import domainB.service.DomainBContext;
import domainB.service.IDomainBService;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class DomainBImListener {
    @Resource
    private IDomainBService iDomainBService;

    @EventListener
    public void pkProcessListener(DomainBEventMsg domainBEventMsg) {

        DomainBContext domainBContext = ContextHelper.convert(domainBEventMsg);
        Object o = iDomainBService.doService(domainBContext);

    }
}
