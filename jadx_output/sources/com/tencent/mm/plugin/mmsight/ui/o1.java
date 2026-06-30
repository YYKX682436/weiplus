package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class o1 implements qk.y7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.a2 f149379a;

    public o1(com.tencent.mm.plugin.mmsight.ui.a2 a2Var) {
        this.f149379a = a2Var;
    }

    @Override // qk.y7
    public void a(qk.g6 g6Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightVideoEditor", "photoEditor [onSelectedFeature] features:%s", g6Var.name());
        if (g6Var == qk.g6.CROP_VIDEO) {
            com.tencent.mm.plugin.mmsight.ui.a2.a(this.f149379a, true);
        }
    }

    @Override // qk.y7
    public void b(qk.g6 g6Var, int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightVideoEditor", "photoEditor [onSelectedDetailFeature] features:%s index:%s", g6Var.name(), java.lang.Integer.valueOf(i17));
    }

    @Override // qk.y7
    public void c(boolean z17) {
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.f149379a;
        if (z17) {
            a2Var.f149274j.showVKB();
        } else {
            a2Var.f149274j.hideVKB(a2Var.f149273i);
        }
    }
}
