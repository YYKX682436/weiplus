package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class n8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124003d;

    public n8(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f124003d = obVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f124003d;
        java.lang.String stringExtra = obVar.getIntent().getStringExtra("key_extra_info");
        if (stringExtra == null) {
            stringExtra = "";
        }
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Tj(obVar.h7().W0, 40, 1, false);
        cy1.a aVar2 = (cy1.a) aVar.ik(obVar.h7().W0, 40, 24617);
        aVar2.pk(obVar.h7().W0, "finder_profile_letter");
        android.widget.FrameLayout frameLayout = obVar.h7().W0;
        jz5.l[] lVarArr = new jz5.l[10];
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(obVar.getActivity());
        lVarArr[0] = new jz5.l("finder_tab_context_id", e17 != null ? e17.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(obVar.getActivity());
        lVarArr[1] = new jz5.l("finder_context_id", e18 != null ? e18.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(obVar.getActivity());
        lVarArr[2] = new jz5.l("behaviour_session_id", e19 != null ? e19.f135385q : null);
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(obVar.getContextObj().getInteger(7)));
        lVarArr[4] = new jz5.l("author_finder_username", obVar.getUsername());
        android.app.Activity context = obVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        lVarArr[5] = new jz5.l("profile_state_type", java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelf() ? 1 : 2));
        lVarArr[6] = new jz5.l("profile_screen_type", java.lang.Integer.valueOf(obVar.getFragmentMode() ? 2 : 1));
        lVarArr[7] = new jz5.l("extrainfo", stringExtra);
        lVarArr[8] = new jz5.l("feed_id", pm0.v.u(obVar.P1));
        lVarArr[9] = new jz5.l("session_buffer", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(obVar.P1, obVar.R1, obVar.getContextObj().getInteger(7)));
        aVar2.gk(frameLayout, kz5.c1.k(lVarArr));
    }
}
