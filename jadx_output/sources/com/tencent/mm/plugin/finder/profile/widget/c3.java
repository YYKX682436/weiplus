package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class c3 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.f3 f124501a;

    public c3(com.tencent.mm.plugin.finder.profile.widget.f3 f3Var) {
        this.f124501a = f3Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).yk(5, 1, "");
            zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
            com.tencent.mm.plugin.finder.profile.widget.f3 f3Var = this.f124501a;
            r45.f03 b07 = nk6.b0("FinderProfileBanner", xy2.c.e(f3Var.f124539a));
            com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "FinderProfileBanner", xy2.c.e(f3Var.f124539a), false, false, 12, null);
            if (S0 != null && b07 != null) {
                com.tencent.mm.plugin.finder.report.x2.i(com.tencent.mm.plugin.finder.report.x2.f125429a, "3", S0, b07, 1, f3Var.f124540b, 0, null, 0, 0, 480, null);
            }
            com.tencent.mm.plugin.finder.profile.widget.f3.a(f3Var, 0);
        }
    }
}
