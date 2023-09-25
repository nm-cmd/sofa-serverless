package com.alipay.sofa.serverless.arklet.core.health.custom;

import com.alipay.sofa.ark.spi.model.Biz;
import com.alipay.sofa.ark.spi.model.BizState;
import com.alipay.sofa.ark.spi.service.biz.BizManagerService;
import com.alipay.sofa.serverless.arklet.core.health.custom.model.CustomBiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CustomBizManagerService implements BizManagerService {

    private final List<Biz> bizList = Arrays.asList(new Biz[]{
            new CustomBiz("masterBiz", "masterBizVersion"),
            new CustomBiz("testBiz1", "testBizVersion1"),
            new CustomBiz("testBiz1", "testBizVersion2"),
            new CustomBiz("testBiz2", "testBizVersion2"),
            new CustomBiz("testBiz3", "testBizVersion3")
    });

    public Biz getMasterBiz() {
        return bizList.get(0);
    }

    @Override
    public boolean registerBiz(Biz biz) {
        return false;
    }

    @Override
    public Biz unRegisterBiz(String s, String s1) {
        return null;
    }

    @Override
    public Biz unRegisterBizStrictly(String s, String s1) {
        return null;
    }

    @Override
    public List<Biz> getBiz(String s) {
        List<Biz> bizList = new ArrayList<>();
        for (Biz item : this.bizList) {
            if (s.equals(item.getBizName())) {
                bizList.add(item);
            }
        }
        return bizList;
    }

    @Override
    public Biz getBiz(String s, String s1) {
        Biz biz = null;
        for (Biz item : this.bizList) {
            if (s.equals(item.getBizName()) && s1.equals(item.getBizVersion())) {
                biz = item;
                break;
            }
        }
        return biz;
    }

    @Override
    public Biz getBizByIdentity(String s) {
        return null;
    }

    @Override
    public Biz getBizByClassLoader(ClassLoader classLoader) {
        return null;
    }

    @Override
    public Set<String> getAllBizNames() {
        return null;
    }

    @Override
    public Set<String> getAllBizIdentities() {
        return null;
    }

    @Override
    public List<Biz> getBizInOrder() {
        return bizList;
    }

    @Override
    public Biz getActiveBiz(String s) {
        return null;
    }

    @Override
    public boolean isActiveBiz(String s, String s1) {
        return false;
    }

    @Override
    public void activeBiz(String s, String s1) {

    }

    @Override
    public BizState getBizState(String s, String s1) {
        return null;
    }

    @Override
    public BizState getBizState(String s) {
        return null;
    }

    @Override
    public boolean removeAndAddBiz(Biz biz, Biz biz1) {
        return true;
    }

    @Override
    public ConcurrentHashMap<String, ConcurrentHashMap<String, Biz>> getBizRegistration() {
        return null;
    }
}
