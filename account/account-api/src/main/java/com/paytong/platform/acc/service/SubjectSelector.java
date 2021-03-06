/* 
 * AcctSubjectMapHandler.java  
 * 
 * version 1.0
 *
 * 2015年8月21日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.paytong.platform.acc.service;

import java.util.List;

import com.paytong.platform.acc.bean.BusiAcct;
import com.paytong.platform.acc.bean.BusiAcctSubjectMappingBean;
import com.paytong.platform.acc.bean.Subject;
import com.paytong.platform.acc.exception.BusiAcctToSubjectMappingNullException;
import com.paytong.platform.member.commons.enums.BusinessActorType;
import com.paytong.platform.member.commons.service.impl.BusinessActor;

/**
 * Class Description
 *
 * @author yangying
 * @version
 * @date 2015年8月21日 下午5:53:59
 * @since
 */
public interface SubjectSelector {
    /**
     * 通过 会员类型 用途 业务账户号 得到科目
     * 
     * @param busiActor
     * @param busiAcct
     * @return
     * @throws BusiAcctToSubjectMappingNullException
     */
    public Subject select(BusinessActor busiActor, BusiAcct busiAcct)
            throws BusiAcctToSubjectMappingNullException;

    /**
     * Get a list of busiAcctSubjectMapping which need to open default by
     * businessActorType
     * 
     * @param businessActorType
     * @return list of parent subject
     */
    public List<BusiAcctSubjectMappingBean> getDefaultList(BusinessActorType businessActorType)
            throws BusiAcctToSubjectMappingNullException;
}
