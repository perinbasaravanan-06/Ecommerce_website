package com.ecommerce.domain;

public enum AccountStatus {

    PENDING_VERIFICATION,  // account is created but not yet verified
    ACTIVE,               //account is active and in good standing
    SUSPENDED,           //account is temporarily suspended dud to violation
    DEACTIVATED,        //account is deactivated user may have chosen to deactivate it
    BANNED,            //account is permanently banned due to severe violation
    CLOSED            //account is permanently closed  due to user request

}
