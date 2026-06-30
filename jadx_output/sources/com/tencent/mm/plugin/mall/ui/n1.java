package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public abstract class n1 {
    public static int a(com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction) {
        if (mallFunction == null) {
            return 3;
        }
        bt4.f.b().f(mallFunction.f179819d);
        bt4.g.b().d(mallFunction.f179819d);
        if (mallFunction.f179827o != null) {
            bt4.f.b().d(mallFunction);
        }
        if ("wxpay://bizmall/mobile_recharge".equals(mallFunction.f179824i)) {
            return 0;
        }
        if ("wxpay://bizmall/weixin_hongbao".equals(mallFunction.f179824i)) {
            return 4;
        }
        if ("wxpay://bizmall/weixin_scan_qrcode".equals(mallFunction.f179824i)) {
            return 8;
        }
        if ("wxpay://bizmall/weixin_transfer".equals(mallFunction.f179824i)) {
            return 5;
        }
        if ("wxpay://bizmall/weixin_offline_pay".equals(mallFunction.f179824i)) {
            return 6;
        }
        if ("wxpay://bizmall/old_mobile_recharge".equals(mallFunction.f179824i)) {
            return 7;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallFunction.f179825m)) {
            return 1;
        }
        if ("wxpay://bizmall/f2f_hongbao".equals(mallFunction.f179824i)) {
            return 9;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MallIndexUIHelper", "doSelectFunction no jump");
        return 2;
    }
}
