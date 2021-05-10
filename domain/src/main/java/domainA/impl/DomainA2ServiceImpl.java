package domainA.impl;

import domainA.DomainAContext;
import domainA.IDomainAService;
import domainA.helper.ContextHelper;
import domainB.api.DomainBEventMsg;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author gaolele
 */
@Component
public class DomainA2ServiceImpl implements IDomainAService {

    @Resource
    private ApplicationContext applicationContext;

    @Override
    public Object doService(DomainAContext domainAContext) {
        {
            //TODO server
        }
        DomainBEventMsg eventMsg = ContextHelper.convert(domainAContext);
        applicationContext.publishEvent(eventMsg);
        return true;
    }
}
