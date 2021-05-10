package domainB.helper;

import domainB.api.DomainBEventMsg;
import domainB.service.DomainBContext;

public class ContextHelper {

    public static DomainBContext convert(DomainBEventMsg domainBEventMsg) {
        return new DomainBContext();
    }
}
