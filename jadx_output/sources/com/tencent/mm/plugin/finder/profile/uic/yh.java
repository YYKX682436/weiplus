package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class yh implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC f124399a;

    public yh(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC finderProfileTingAudioWithCollectionUIC) {
        this.f124399a = finderProfileTingAudioWithCollectionUIC;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String string;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC finderProfileTingAudioWithCollectionUIC = this.f124399a;
        androidx.appcompat.app.AppCompatActivity context = finderProfileTingAudioWithCollectionUIC.getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[6];
        java.lang.String str3 = "";
        if (V6 == null || (str2 = V6.getString(2)) == null) {
            str2 = "";
        }
        jz5.l lVar = new jz5.l("finder_tab_context_id", str2);
        int i17 = 0;
        lVarArr[0] = lVar;
        if (V6 != null && (string = V6.getString(1)) != null) {
            str3 = string;
        }
        lVarArr[1] = new jz5.l("finder_context_id", str3);
        androidx.appcompat.app.AppCompatActivity activity = finderProfileTingAudioWithCollectionUIC.getActivity();
        com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI finderProfileUI = activity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) activity : null;
        if (finderProfileUI != null) {
            i17 = finderProfileUI.getD();
        } else if (V6 != null) {
            i17 = V6.getInteger(5);
        }
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(i17));
        lVarArr[3] = new jz5.l("profile_tab_name", finderProfileTingAudioWithCollectionUIC.getContext().getResources().getString(com.tencent.mm.R.string.f0d));
        lVarArr[4] = new jz5.l("profile_tab_type", 3);
        lVarArr[5] = new jz5.l("profile_whole_tab", 1);
        return kz5.c1.k(lVarArr);
    }
}
