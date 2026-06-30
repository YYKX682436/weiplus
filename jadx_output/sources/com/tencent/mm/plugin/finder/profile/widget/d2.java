package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f124513a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f124514b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f124515c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.k0 f124516d;

    public d2(android.view.View header, androidx.appcompat.app.AppCompatActivity activity, boolean z17) {
        kotlin.jvm.internal.o.g(header, "header");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f124513a = activity;
        this.f124514b = z17;
        this.f124515c = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.c2(header));
        this.f124516d = new com.tencent.mm.plugin.finder.profile.widget.b2(this);
    }

    public final vb2.f0 a() {
        return (vb2.f0) ((jz5.n) this.f124515c).getValue();
    }

    public final void b(java.lang.String authorFinderUsername) {
        android.widget.FrameLayout finderProfileMemberBtn;
        android.widget.TextView finderProfileMemberBtnTv;
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        kk.l lVar = com.tencent.mm.plugin.finder.profile.uic.p2.f124101r;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) com.tencent.mm.plugin.finder.profile.uic.p2.f124101r.get(authorFinderUsername);
        r45.vr0 vr0Var = l2Var != null ? l2Var.f123932u : null;
        if (a().f434560d0.getVisibility() != 0) {
            a().O.f434611b.setVisibility(8);
            finderProfileMemberBtn = a().P.f434611b;
            kotlin.jvm.internal.o.f(finderProfileMemberBtn, "finderProfileMemberBtn");
            finderProfileMemberBtnTv = a().P.f434613d;
            kotlin.jvm.internal.o.f(finderProfileMemberBtnTv, "finderProfileMemberBtnTv");
        } else {
            a().P.f434611b.setVisibility(8);
            finderProfileMemberBtn = a().O.f434611b;
            kotlin.jvm.internal.o.f(finderProfileMemberBtn, "finderProfileMemberBtn");
            finderProfileMemberBtnTv = a().O.f434613d;
            kotlin.jvm.internal.o.f(finderProfileMemberBtnTv, "finderProfileMemberBtnTv");
            a().O.f434612c.setVisibility(8);
        }
        if (vr0Var == null) {
            finderProfileMemberBtn.setVisibility(8);
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.HeaderMemberWidget", "memberStatus %d visitorStatus %d", java.lang.Integer.valueOf(vr0Var.f388454d), java.lang.Integer.valueOf(vr0Var.f388455e));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(finderProfileMemberBtn, "member_zone");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(finderProfileMemberBtn, 40, 25496);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("finder_username", authorFinderUsername);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f124513a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(appCompatActivity);
        lVarArr[1] = new jz5.l("finder_tab_context_id", e17 != null ? e17.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(appCompatActivity);
        lVarArr[2] = new jz5.l("finder_context_id", e18 != null ? e18.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(appCompatActivity);
        lVarArr[3] = new jz5.l("behaviour_session_id", e19 != null ? e19.f135385q : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(appCompatActivity);
        lVarArr[4] = new jz5.l("comment_scene", e27 != null ? java.lang.Integer.valueOf(e27.f135380n) : null);
        ((cy1.a) rVar).gk(finderProfileMemberBtn, kz5.c1.k(lVarArr));
        int i17 = vr0Var.f388454d;
        if (i17 != 1 && i17 != 2) {
            finderProfileMemberBtn.setVisibility(8);
            return;
        }
        finderProfileMemberBtn.setVisibility(0);
        if (vr0Var.f388455e == 2 || kotlin.jvm.internal.o.b(authorFinderUsername, xy2.c.e(appCompatActivity))) {
            com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
            pm0.v.y(com.tencent.mm.plugin.finder.extension.reddot.aa.f105373k, appCompatActivity, this.f124516d);
        }
        com.tencent.mm.ui.bk.r0(finderProfileMemberBtnTv.getPaint(), 0.8f);
        finderProfileMemberBtn.setOnClickListener(new com.tencent.mm.plugin.finder.profile.widget.a2(this, vr0Var, authorFinderUsername));
    }
}
