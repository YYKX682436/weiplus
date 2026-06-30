package lp2;

/* loaded from: classes2.dex */
public final class d implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageUI f320281a;

    public d(com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageUI finderLiveFindPageUI) {
        this.f320281a = finderLiveFindPageUI;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        oa.i k17;
        com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageUI finderLiveFindPageUI = this.f320281a;
        android.view.View view = finderLiveFindPageUI.f121509v.f206301h;
        com.google.android.material.tabs.TabLayout tabLayout = view != null ? (com.google.android.material.tabs.TabLayout) view.findViewById(com.tencent.mm.R.id.nv8) : null;
        java.lang.Object obj = (tabLayout == null || (k17 = tabLayout.k(tabLayout != null ? tabLayout.getSelectedTabPosition() : 0)) == null) ? null : k17.f343778a;
        qp2.i iVar = obj instanceof qp2.i ? (qp2.i) obj : null;
        int i17 = iVar != null ? iVar.f365786c : -1;
        jz5.l[] lVarArr = new jz5.l[2];
        android.content.Intent intent = finderLiveFindPageUI.getIntent();
        lVarArr[0] = new jz5.l("enter_from_type", intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("enter_from_type", -1)) : null);
        lVarArr[1] = new jz5.l("live_tab_id", java.lang.Integer.valueOf(i17));
        return kz5.c1.k(lVarArr);
    }
}
