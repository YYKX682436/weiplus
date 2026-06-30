package com.tencent.mm.ui;

/* loaded from: classes13.dex */
public class u7 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        if (com.tencent.mm.ui.v7.f211108a == null) {
            com.tencent.mm.ui.v7.f211108a = new com.hihonor.easygo.sdk.EasyGo(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        com.tencent.mm.ui.v7.f211109b = com.tencent.mm.ui.v7.f211108a.init(new java.lang.String[]{"magicwindow"});
        com.tencent.mm.ui.bk.y0();
        if (com.tencent.mm.ui.bk.v0() && !com.tencent.mm.ui.v7.f211110c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HonorUtil", "update setLoginStatus!");
            com.tencent.mm.ui.v7.e(1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HonorUtil", "initEasyGoManager normal device!! retList: %s", com.tencent.mm.ui.v7.f211109b);
    }
}
