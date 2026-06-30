package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class g7 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q7 f151147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f151148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f151149f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fm3.u f151150g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f151151h;

    public g7(com.tencent.mm.plugin.mv.ui.uic.q7 q7Var, boolean z17, boolean z18, fm3.u uVar, boolean z19) {
        this.f151147d = q7Var;
        this.f151148e = z17;
        this.f151149f = z18;
        this.f151150g = uVar;
        this.f151151h = z19;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.mv.ui.uic.q7 q7Var = this.f151147d;
        boolean z17 = true;
        g4Var.j(201, q7Var.getContext().getString(com.tencent.mm.R.string.h4c), com.tencent.mm.R.raw.icons_outlined_mv_making_share, q7Var.getContext().getResources().getColor(com.tencent.mm.R.color.f478714f5), !this.f151148e);
        if (!this.f151149f) {
            g4Var.j(202, q7Var.getContext().getString(com.tencent.mm.R.string.h5d), com.tencent.mm.R.raw.icons_outlined_delete, q7Var.getContext().getResources().getColor(com.tencent.mm.R.color.f478714f5), !this.f151151h);
        } else if (fm3.u.A.e(this.f151150g)) {
            g4Var.j(203, q7Var.getContext().getString(com.tencent.mm.R.string.f492599h40), com.tencent.mm.R.raw.icons_outlined_report_problem, q7Var.getContext().getResources().getColor(com.tencent.mm.R.color.f478714f5), false);
        }
        g4Var.j(204, q7Var.getContext().getString(com.tencent.mm.R.string.h3i), com.tencent.mm.R.raw.finder_icons_screen_clear, q7Var.getContext().getResources().getColor(com.tencent.mm.R.color.f478714f5), false);
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if (!(i17 == 788529167 || i17 == 788529166) && !z65.c.a()) {
            z17 = false;
        }
        if (z17) {
            g4Var.j(205, "调试", com.tencent.mm.R.raw.icons_outlined_report_problem, q7Var.getContext().getResources().getColor(com.tencent.mm.R.color.f478714f5), false);
        }
    }
}
