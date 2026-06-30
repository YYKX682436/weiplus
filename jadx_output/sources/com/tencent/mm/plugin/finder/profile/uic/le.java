package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class le implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f123955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f123956b;

    public le(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        this.f123955a = viewGroup;
        this.f123956b = finderProfileTabUIC;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[5];
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", c17);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", b17);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        lVarArr[2] = new jz5.l("behaviour_session_id", Ri != null ? Ri : "");
        android.content.Context context = this.f123955a.getContext();
        com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI finderProfileUI = context instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) context : null;
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(finderProfileUI != null ? finderProfileUI.getD() : 32));
        lVarArr[4] = new jz5.l("finder_username", this.f123956b.F7());
        return kz5.c1.k(lVarArr);
    }
}
