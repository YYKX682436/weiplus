package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class pe implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f124128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f124129b;

    public pe(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC) {
        this.f124128a = viewGroup;
        this.f124129b = finderProfileTabUIC;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        android.content.Context context = this.f124128a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        jz5.l[] lVarArr = new jz5.l[5];
        java.lang.String str5 = "";
        if (nyVar == null || (str2 = nyVar.f135386r) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str2);
        if (nyVar == null || (str3 = nyVar.f135382p) == null) {
            str3 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str3);
        if (nyVar != null && (str4 = nyVar.f135385q) != null) {
            str5 = str4;
        }
        lVarArr[2] = new jz5.l("behaviour_session_id", str5);
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(nyVar != null ? nyVar.f135380n : 0));
        lVarArr[4] = new jz5.l("finder_username", this.f124129b.F7());
        return kz5.c1.k(lVarArr);
    }
}
