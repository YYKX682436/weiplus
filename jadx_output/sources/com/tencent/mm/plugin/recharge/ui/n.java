package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public abstract class n {
    public static com.tencent.mm.plugin.recharge.model.MallRechargeProduct a(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct = (com.tencent.mm.plugin.recharge.model.MallRechargeProduct) it.next();
            if (mallRechargeProduct.f155080q && mallRechargeProduct.a()) {
                return mallRechargeProduct;
            }
        }
        return (com.tencent.mm.plugin.recharge.model.MallRechargeProduct) list.get(0);
    }
}
