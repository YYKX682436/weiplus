package com.tencent.mm.ui;

/* loaded from: classes13.dex */
public class el implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        if (com.tencent.mm.ui.fl.f208605a == null) {
            com.tencent.mm.ui.fl.f208605a = new com.huawei.easygo.sdk.EasyGo(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        com.tencent.mm.ui.fl.f208606b = com.tencent.mm.ui.fl.f208605a.init(new java.lang.String[]{"magicwindow"});
        com.tencent.mm.ui.bk.y0();
        if (com.tencent.mm.ui.bk.v0() && !com.tencent.mm.ui.fl.f208607c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.huaweiUtil", "update setLoginStatus!");
            com.tencent.mm.ui.fl.f(1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.huaweiUtil", "initEasyGoManager normal device!! retList: %s", com.tencent.mm.ui.fl.f208606b);
    }
}
