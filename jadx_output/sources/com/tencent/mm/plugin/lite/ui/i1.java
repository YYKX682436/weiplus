package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public class i1 implements q80.s {
    public i1(com.tencent.mm.plugin.lite.ui.j1 j1Var) {
    }

    @Override // q80.s
    public void a(android.view.View view) {
        java.util.Map map = com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI.f144339m;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppListUI", "view-level liteapp open success");
    }

    @Override // q80.s
    public void fail() {
        java.util.Map map = com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI.f144339m;
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaLiteAppListUI", "view-level liteapp open failed");
    }
}
