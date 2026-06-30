package wu;

/* loaded from: classes9.dex */
public final class s extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.mvvm.MvvmView mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uxi);
        if (mvvmView == null) {
            return;
        }
        z01.j jVar = new z01.j();
        m15.a f17 = vu.a.f(item);
        jVar.f469059d = f17;
        jVar.f469060e = com.tencent.mm.R.drawable.d87;
        jVar.f469062g = new wu.q(this, item);
        java.lang.String w17 = f17.w();
        if (w17 == null || r26.n0.N(w17)) {
            w17 = f17.k();
            if (w17 == null || r26.n0.N(w17)) {
                w17 = f17.l();
            }
        }
        if (w17 != null) {
            jVar.f469061f = new wu.r(w17);
        }
        mvvmView.setViewModel(jVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.storage.y8 i17 = com.tencent.mm.storage.y8.i(vu.a.f(item).toXml());
        java.lang.String str = i17.f196358a;
        java.lang.String str2 = i17.f196359b;
        if (com.tencent.mm.sdk.platformtools.f9.SessionOa.k(view.getContext(), null)) {
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
                int h47 = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
                boolean R4 = com.tencent.mm.storage.z3.R4(str);
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                if (h47 == 0) {
                    if (n17 != null && n17.r2()) {
                        ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(view.getContext());
                        ((qk.s6) gm0.j1.s(qk.s6.class)).U6(R4 ? 2 : 1, str, str2);
                        return;
                    }
                }
                if (h47 == 2) {
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(view.getContext());
                    ((qk.s6) gm0.j1.s(qk.s6.class)).U6(R4 ? 2 : 1, str, str2);
                    return;
                }
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", i17.f196358a);
            intent.putExtra("Contact_Alias", i17.f196360c);
            intent.putExtra("Contact_Nick", i17.f196359b);
            intent.putExtra("Contact_QuanPin", i17.f196361d);
            intent.putExtra("Contact_PyInitial", i17.f196362e);
            intent.putExtra("Contact_Uin", i17.f196367j);
            intent.putExtra("Contact_Mobile_MD5", i17.f196365h);
            intent.putExtra("Contact_full_Mobile_MD5", i17.f196366i);
            intent.putExtra("Contact_QQNick", i17.g());
            intent.putExtra("User_From_Fmessage", false);
            intent.putExtra("Contact_Scene", i17.f196364g);
            intent.putExtra("Contact_FMessageCard", true);
            intent.putExtra("Contact_RemarkName", i17.f196369l);
            intent.putExtra("Contact_VUser_Info_Flag", i17.f196374q);
            intent.putExtra("Contact_VUser_Info", i17.f196375r);
            intent.putExtra("Contact_BrandIconURL", i17.f196376s);
            intent.putExtra("Contact_Province", i17.f());
            intent.putExtra("Contact_City", i17.b());
            intent.putExtra("Contact_Sex", i17.f196372o);
            intent.putExtra("Contact_Signature", i17.f196373p);
            intent.putExtra("Contact_ShowUserName", false);
            intent.putExtra("Contact_KSnsIFlag", 0);
            j45.l.n(view.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, 1);
        }
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mvvm.MvvmView i18 = ((bf5.a) Ai).i(context);
        i18.setId(com.tencent.mm.R.id.uxi);
        containerView.addView(i18, -2, -2);
    }
}
