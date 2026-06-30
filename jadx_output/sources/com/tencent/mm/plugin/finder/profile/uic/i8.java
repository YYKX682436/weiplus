package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class i8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123790d;

    public i8(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f123790d = obVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String string;
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123790d;
        java.lang.String stringExtra = obVar.getIntent().getStringExtra("key_extra_info");
        java.lang.String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        androidx.appcompat.app.AppCompatActivity activity = obVar.getActivity();
        android.widget.FrameLayout finderProfileFollowBtn = obVar.h7().F;
        kotlin.jvm.internal.o.f(finderProfileFollowBtn, "finderProfileFollowBtn");
        java.lang.String finderUsername = obVar.getUsername();
        long j17 = obVar.Q1;
        android.app.Activity context = obVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean isSelf = ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelf();
        boolean fragmentMode = obVar.getFragmentMode();
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(activity);
        r45.qt2 V6 = e17 != null ? e17.V6() : null;
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        if (V6 != null && (string = V6.getString(1)) != null) {
            str = string;
        }
        jz5.o Tk = ((c61.l7) b6Var).Tk(str);
        int intValue = ((java.lang.Number) Tk.f302841d).intValue();
        int intValue2 = ((java.lang.Number) Tk.f302842e).intValue();
        jz5.l[] lVarArr = new jz5.l[13];
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(activity);
        lVarArr[0] = new jz5.l("behaviour_session_id", e18 != null ? e18.f135385q : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(activity);
        lVarArr[1] = new jz5.l("finder_context_id", e19 != null ? e19.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(activity);
        jz5.l lVar = new jz5.l("finder_tab_context_id", e27 != null ? e27.f135386r : null);
        int i17 = 2;
        lVarArr[2] = lVar;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e28 = iyVar.e(activity);
        lVarArr[3] = new jz5.l("comment_scene", e28 != null ? java.lang.Integer.valueOf(e28.f135380n) : null);
        lVarArr[4] = new jz5.l("finderusername", finderUsername);
        lVarArr[5] = new jz5.l("profile_state_type", java.lang.Integer.valueOf(isSelf ? 1 : 2));
        lVarArr[6] = new jz5.l("profile_screen_type", java.lang.Integer.valueOf(fragmentMode ? 2 : 1));
        lVarArr[7] = new jz5.l("extrainfo", stringExtra);
        if (activity.getIntent().getIntExtra("key_click_avatar_type", 0) == 1 || activity.getIntent().getIntExtra("key_enter_profile_type", 0) == 11) {
            i17 = 1;
        } else if (!activity.getIntent().getBooleanExtra("key_is_from_slide", false)) {
            i17 = 3;
        }
        lVarArr[8] = new jz5.l("enter_profile_method", java.lang.Integer.valueOf(i17));
        lVarArr[9] = new jz5.l("ref_commentscene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(7)) : null);
        lVarArr[10] = new jz5.l("enter_scene", java.lang.Integer.valueOf(intValue));
        lVarArr[11] = new jz5.l("enter_type", java.lang.Integer.valueOf(intValue2));
        lVarArr[12] = new jz5.l("ref_feedid", pm0.v.u(j17));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(finderProfileFollowBtn, "finder_profile_follow");
        aVar.gk(finderProfileFollowBtn, k17);
        aVar.ik(finderProfileFollowBtn, 40, 24617);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(finderProfileFollowBtn, 40, 1, false);
    }
}
