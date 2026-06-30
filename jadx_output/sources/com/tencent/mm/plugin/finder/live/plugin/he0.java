package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class he0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.le0 f112803d;

    public he0(com.tencent.mm.plugin.finder.live.plugin.le0 le0Var) {
        this.f112803d = le0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.g7 g7Var = (mm2.g7) obj;
        if (g7Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.le0 le0Var = this.f112803d;
            com.tencent.mars.xlog.Log.i(le0Var.f113390s, "initPlugin onPageSelect");
            le0Var.x1(((mm2.c1) le0Var.P0(mm2.c1.class)).L9(), false);
            le0Var.v1(g7Var.f329095b, g7Var.f329096c, g7Var.f329097d);
            if (((mm2.w) le0Var.P0(mm2.w.class)).O6()) {
                return;
            }
            le0Var.f113387p.setAlpha(1.0f);
        }
    }
}
