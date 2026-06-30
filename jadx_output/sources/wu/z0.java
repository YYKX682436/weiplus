package wu;

/* loaded from: classes9.dex */
public final class z0 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        java.lang.String P;
        java.lang.String k17;
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.mvvm.MvvmView mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uxi);
        if (mvvmView == null || (P = item.f284997e.P()) == null) {
            return;
        }
        l15.c cVar = new l15.c();
        cVar.fromXml(P);
        z01.z zVar = new z01.z();
        v05.b k18 = cVar.k();
        u05.a aVar = k18 != null ? (u05.a) k18.getCustom(k18.f432315e + 60) : null;
        zVar.f469192d = aVar;
        zVar.f469193e = com.tencent.mm.R.drawable.d87;
        zVar.f469195g = new wu.x0(this, item);
        if (aVar != null && (k17 = aVar.k()) != null) {
            zVar.f469194f = new wu.y0(k17);
        }
        mvvmView.setViewModel(zVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String P = item.f284997e.P();
        if (P == null) {
            return;
        }
        l15.c cVar = new l15.c();
        cVar.fromXml(P);
        v05.b k17 = cVar.k();
        u05.a aVar = k17 != null ? (u05.a) k17.getCustom(k17.f432315e + 60) : null;
        java.lang.String username = aVar != null ? aVar.getUsername() : null;
        java.lang.String nickname = aVar != null ? aVar.getNickname() : null;
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            int h47 = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
            boolean R4 = com.tencent.mm.storage.z3.R4(username);
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
            if (h47 == 0) {
                if (n17 != null && n17.r2()) {
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(view.getContext());
                    ((qk.s6) gm0.j1.s(qk.s6.class)).U6(R4 ? 2 : 1, username, nickname);
                    return;
                }
            }
            if (h47 == 2) {
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(view.getContext());
                ((qk.s6) gm0.j1.s(qk.s6.class)).U6(R4 ? 2 : 1, username, nickname);
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", username);
        intent.putExtra("Contact_Alias", aVar != null ? aVar.j() : null);
        intent.putExtra("Contact_Nick", nickname);
        intent.putExtra("Contact_QuanPin", aVar != null ? aVar.q() : null);
        intent.putExtra("Contact_PyInitial", aVar != null ? aVar.u() : null);
        intent.putExtra("User_From_Fmessage", false);
        intent.putExtra("Contact_Scene", aVar != null ? java.lang.Integer.valueOf(aVar.getScene()) : null);
        intent.putExtra("Contact_FMessageCard", true);
        intent.putExtra("Contact_VUser_Info_Flag", aVar != null ? java.lang.Integer.valueOf(aVar.n()) : null);
        intent.putExtra("Contact_VUser_Info", aVar != null ? aVar.o() : null);
        intent.putExtra("Contact_BrandIconURL", aVar != null ? aVar.k() : null);
        intent.putExtra("Contact_Province", aVar != null ? aVar.getProvince() : null);
        intent.putExtra("Contact_City", aVar != null ? aVar.getCity() : null);
        intent.putExtra("Contact_Sex", aVar != null ? java.lang.Integer.valueOf(aVar.getSex()) : null);
        intent.putExtra("Contact_Signature", aVar != null ? aVar.w() : null);
        intent.putExtra("Contact_ShowUserName", false);
        intent.putExtra("Contact_KSnsIFlag", 0);
        j45.l.n(view.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, 1);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mvvm.MvvmView x17 = ((bf5.a) Ai).x(context);
        x17.setId(com.tencent.mm.R.id.uxi);
        containerView.addView(x17, -2, -2);
    }
}
