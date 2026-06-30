package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class xc extends com.tencent.mm.plugin.finder.profile.uic.f6 {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f124353e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f124354f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f124355g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f124356h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f124357i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f124358m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f124359n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f124360o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f124361p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.lifecycle.k0 f124362q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f124353e = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.nc(this));
        this.f124354f = new java.util.HashMap();
        this.f124355g = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.oc(this));
        ae2.in inVar = ae2.in.f3688a;
        this.f124356h = ((java.lang.Number) ae2.in.G5.r()).intValue() != 1 && com.tencent.mm.ui.bk.A();
        this.f124362q = new com.tencent.mm.plugin.finder.profile.uic.pc(this);
    }

    public static final void O6(com.tencent.mm.plugin.finder.profile.uic.xc xcVar, java.lang.String str, android.content.Context context) {
        xcVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[7];
        int i17 = 0;
        lVarArr[0] = new jz5.l("view_id", "profile_post_acionsheet_camera");
        lVarArr[1] = new jz5.l("behaviour_session_id", V6 != null ? V6.getString(0) : null);
        lVarArr[2] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
        lVarArr[3] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
        lVarArr[4] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        lVarArr[5] = new jz5.l("parententerscene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(8)) : null);
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("ProfileActionSheetPublish");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("ProfileActionSheetPublish");
        if (I0 != null && L0 != null && ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(true)) {
            i17 = 1;
        }
        lVarArr[6] = new jz5.l("is_red_dot", java.lang.Integer.valueOf(i17));
        ((cy1.a) rVar).Ej(str, kz5.c1.k(lVarArr), 25496);
    }

    public final void P6() {
        if (hz2.d.f286313a.a("post")) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        java.lang.String str = gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis();
        int R6 = R6();
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        boolean z17 = false;
        p2Var.W(p2Var.i(context, R6, false));
        p2Var.R(str);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int integer = nyVar != null ? nyVar.V6().getInteger(8) : 0;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setParentEnterScene(integer);
        }
        p2Var.D(context, false, R6);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (((sr2.l5) pf5.z.f353948a.a(activity).a(sr2.l5.class)).Q6(new com.tencent.mm.plugin.finder.profile.uic.jc(this), new com.tencent.mm.plugin.finder.profile.uic.kc(this))) {
            p2Var.T(str, null);
            if (((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Vi()) {
                bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
                int R62 = R6();
                ((b92.u2) vVar).getClass();
                us2.u.n(R62, false);
                ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ui("FinderPersonalProfilePagePostingButton", R6, 0, str, true);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_finder_post_router", 2);
                intent.putExtra("key_finder_post_from", 1);
                intent.putExtra("key_finder_post_id", str);
                intent.putExtra("KEY_FINDER_USERNAME_SELF", getUsername());
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yk(getContext(), intent, 132, 10);
                intent.putExtra("KEY_FINDER_MJ_PUBLISHER_SHOW_MOVIE_COMPOSING_ENTRANCE", true);
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).gk(getActivity(), intent);
                return;
            }
            com.tencent.mm.ui.widget.dialog.k0 fj6 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).fj(context, getUsername(), R6());
            r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("ProfilePublish");
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("ProfilePublish");
            if (I0 != null && L0 != null && ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(true)) {
                z17 = true;
            }
            if (z17) {
                r45.f03 I02 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("ProfilePublish");
                com.tencent.mm.plugin.finder.extension.reddot.jb L02 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("ProfilePublish");
                if (I02 != null && L02 != null) {
                    com.tencent.mm.plugin.finder.report.x2.f125429a.e("3", L02, I02, 2, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
                }
            }
            fj6.f211872n = new com.tencent.mm.plugin.finder.profile.uic.qc(this, context, z17);
            fj6.f211881s = new com.tencent.mm.plugin.finder.profile.uic.rc(this, context, str);
            fj6.f211854d = com.tencent.mm.plugin.finder.profile.uic.sc.f124213d;
            fj6.v();
        }
    }

    public final void Q6() {
        boolean z17;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        sr2.l5 l5Var = (sr2.l5) pf5.z.f353948a.a(activity).a(sr2.l5.class);
        com.tencent.mm.plugin.finder.profile.uic.lc lcVar = new com.tencent.mm.plugin.finder.profile.uic.lc(this);
        l5Var.getClass();
        l5Var.f411628h = lcVar;
        if (l5Var.f411624d != null) {
            z17 = true;
        } else {
            l5Var.P6();
            z17 = false;
        }
        if (z17) {
            zy2.m8 m8Var = (zy2.m8) ((jz5.n) this.f124355g).getValue();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("POST_BTN_CLICK_SCENE_KEY", 2);
            ((im2.p4) m8Var).R6(intent);
        }
    }

    public final int R6() {
        return s92.c.f404992a.a(null, 5) ? 9 : 2;
    }

    public final void S6(android.content.Context context, android.view.View view, java.lang.String str, boolean z17, ly1.a aVar) {
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.pk(view, str);
        aVar2.ik(view, 40, 25496);
        aVar2.ok(view, 300L);
        if (z17) {
            aVar2.Tj(view, 40, 1, false);
        }
        long longExtra = getIntent().getLongExtra("key_ref_feed_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_ref_feed_dup_flag");
        int intExtra = getIntent().getIntExtra("key_ref_comment_scene", 0);
        java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(longExtra, stringExtra, intExtra);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        aVar2.Ai(view, new com.tencent.mm.plugin.finder.profile.uic.mc(nyVar != null ? nyVar.V6() : null, longExtra, intExtra, ek6));
        if (aVar != null) {
            aVar2.Ai(view, aVar);
        }
    }

    public final void T6(int i17) {
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        jz5.g gVar = this.f124355g;
        zy2.zb.qd(zbVar, i17, ((im2.p4) ((zy2.m8) ((jz5.n) gVar).getValue())).f292497q.f463009b, ((im2.p4) ((zy2.m8) ((jz5.n) gVar).getValue())).f292497q.f463010c, null, 8, null);
    }

    public final java.lang.String getUsername() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).getUsername();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z17 = false;
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127905r0).getValue()).r()).intValue() == 1;
        if ((!r26.n0.N(getUsername())) && g92.b.f269769e.G2(getUsername())) {
            z17 = true;
        }
        if (g92.b.f269769e.v(getUsername()) && z18 && z17) {
            com.tencent.mars.xlog.Log.i("FinderProfilePostUIC", "MaasCamTemplatePreload - preloadCameraTemplateListAndDownloadFirst");
            ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).cj(R6());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f124353e = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.nc(this));
        this.f124354f = new java.util.HashMap();
        this.f124355g = jz5.h.b(new com.tencent.mm.plugin.finder.profile.uic.oc(this));
        ae2.in inVar = ae2.in.f3688a;
        this.f124356h = ((java.lang.Number) ae2.in.G5.r()).intValue() != 1 && com.tencent.mm.ui.bk.A();
        this.f124362q = new com.tencent.mm.plugin.finder.profile.uic.pc(this);
    }
}
