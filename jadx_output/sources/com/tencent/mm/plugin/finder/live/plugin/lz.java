package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class lz implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.oz f113449d;

    public lz(com.tencent.mm.plugin.finder.live.plugin.oz ozVar) {
        this.f113449d = ozVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.g7 g7Var = (mm2.g7) obj;
        if (g7Var != null) {
            int i17 = g7Var.f329096c;
            int i18 = g7Var.f329097d;
            com.tencent.mm.plugin.finder.live.plugin.oz ozVar = this.f113449d;
            ozVar.t1(g7Var.f329095b, i17, i18);
            int i19 = g7Var.f329094a;
            com.tencent.mm.plugin.finder.live.util.CommonCircleIndicator commonCircleIndicator = ozVar.f113804p;
            commonCircleIndicator.a(i19);
            if (((mm2.w) ozVar.P0(mm2.w.class)).O6()) {
                return;
            }
            commonCircleIndicator.setAlpha(1.0f);
        }
    }
}
