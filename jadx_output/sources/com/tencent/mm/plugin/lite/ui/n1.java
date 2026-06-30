package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes11.dex */
public class n1 implements q80.f0 {
    public n1(com.tencent.mm.plugin.lite.ui.o1 o1Var) {
    }

    @Override // q80.f0
    public void fail() {
        java.util.Map map = com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI.f144339m;
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaLiteAppListUI", "page-level liteapp open failed");
    }

    @Override // q80.f0
    public boolean listenOnCreate() {
        return true;
    }

    @Override // q80.f0
    public void onCreate(long j17, java.lang.String str) {
        java.util.Map map = com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI.f144339m;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppListUI", "page-level liteapp onCreate %d %s", java.lang.Long.valueOf(j17), str);
    }

    @Override // q80.f0
    public void success() {
        java.util.Map map = com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI.f144339m;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppListUI", "page-level liteapp open success");
    }
}
