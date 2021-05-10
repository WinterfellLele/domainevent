package domainA.helper;

import domainA.DomainAContext;
import domainB.api.DomainBEventMsg;

public class ContextHelper {

    public static DomainBEventMsg convert(DomainAContext domainAContext){
        return new DomainBEventMsg();
    }
}
