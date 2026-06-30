package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qa0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wa0 f113983d;

    public qa0(com.tencent.mm.plugin.finder.live.plugin.wa0 wa0Var) {
        this.f113983d = wa0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.g7 g7Var = (mm2.g7) obj;
        if (g7Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.wa0 wa0Var = this.f113983d;
            wa0Var.v1();
            wa0Var.B1(g7Var.f329095b, g7Var.f329096c, g7Var.f329097d);
            wa0Var.f365323d.setAlpha(1.0f);
            if (!((mm2.n6) wa0Var.P0(mm2.n6.class)).f329293f || ((mm2.c1) wa0Var.P0(mm2.c1.class)).T) {
                com.tencent.mm.plugin.finder.live.plugin.wa0.t1(wa0Var);
            }
        }
    }
}
