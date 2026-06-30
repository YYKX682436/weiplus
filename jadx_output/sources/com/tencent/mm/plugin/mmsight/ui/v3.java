package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class v3 implements qk.y7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.TestVideoEditUI f149437a;

    public v3(com.tencent.mm.plugin.mmsight.ui.TestVideoEditUI testVideoEditUI) {
        this.f149437a = testVideoEditUI;
    }

    @Override // qk.y7
    public void a(qk.g6 g6Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TestVideoEditUI", "[onSelectedFeature] features:%s", g6Var.name());
    }

    @Override // qk.y7
    public void b(qk.g6 g6Var, int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TestVideoEditUI", "[onSelectedDetailFeature] features:%s index:%s", g6Var.name(), java.lang.Integer.valueOf(i17));
    }

    @Override // qk.y7
    public void c(boolean z17) {
        com.tencent.mm.plugin.mmsight.ui.TestVideoEditUI testVideoEditUI = this.f149437a;
        if (z17) {
            testVideoEditUI.showVKB();
        } else {
            int i17 = com.tencent.mm.plugin.mmsight.ui.TestVideoEditUI.f149257e;
            testVideoEditUI.hideVKB(testVideoEditUI.getContentView());
        }
    }
}
