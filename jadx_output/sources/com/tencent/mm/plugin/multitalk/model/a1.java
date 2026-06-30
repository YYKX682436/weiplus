package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class a1 implements com.tencent.mm.plugin.voip.ui.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.b1 f149874a;

    public a1(com.tencent.mm.plugin.multitalk.model.b1 b1Var) {
        this.f149874a = b1Var;
    }

    @Override // com.tencent.mm.plugin.voip.ui.e
    public boolean a() {
        com.tencent.mm.plugin.multitalk.model.b1 b1Var = this.f149874a;
        return b1Var.f149885f.y() || b1Var.f149885f.z();
    }

    @Override // com.tencent.mm.plugin.voip.ui.e
    public void b() {
        this.f149874a.f149885f.f150186y1 = false;
    }

    @Override // com.tencent.mm.plugin.voip.ui.e
    public void c(android.content.Intent intent, com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView) {
        com.tencent.mm.plugin.multitalk.model.b1 b1Var = this.f149874a;
        if (!b1Var.f149885f.z()) {
            baseSmallView.k(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h3d));
        } else {
            int i17 = b1Var.f149885f.f150181x;
            baseSmallView.l(java.lang.String.format("%02d:%02d", java.lang.Integer.valueOf(i17 / 60), java.lang.Integer.valueOf(i17 % 60)));
        }
    }

    @Override // com.tencent.mm.plugin.voip.ui.e
    public void d() {
        java.lang.String e17 = com.tencent.mm.plugin.multitalk.model.o2.e(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t);
        boolean B = com.tencent.mm.plugin.multitalk.model.e3.Ri().B();
        com.tencent.mm.plugin.multitalk.model.b1 b1Var = this.f149874a;
        boolean z17 = b1Var.f149884e;
        if (B && z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12917, e17, 2, 1);
        } else if (B) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12917, e17, 2, 2);
        } else if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12917, e17, 1, 1);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12917, e17, 1, 2);
        }
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.h2d, 0).show();
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).n(43, b1Var.f149883d, false);
        com.tencent.mm.plugin.multitalk.model.v0 v0Var = b1Var.f149885f;
        com.tencent.mm.plugin.multitalk.model.z zVar = v0Var.C;
        if (zVar != null) {
            zVar.r2();
        }
        v0Var.c(true);
        v0Var.b();
    }
}
