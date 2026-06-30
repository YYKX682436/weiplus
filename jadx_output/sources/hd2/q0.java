package hd2;

/* loaded from: classes2.dex */
public final class q0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment f280518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f280519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280520f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280521g;

    public q0(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment, android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        this.f280518d = finderProfileCardFragment;
        this.f280519e = activity;
        this.f280520f = str;
        this.f280521g = str2;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        android.app.Activity context = this.f280519e;
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment = this.f280518d;
        if (itemId != 1) {
            if (itemId != 2) {
                if (itemId == 4) {
                    intent.putExtra("key_finder_post_router", 16);
                } else if (itemId != 10012) {
                    if (finderProfileCardFragment.f110056t.containsKey(java.lang.Integer.valueOf(menuItem.getItemId()))) {
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        ya2.i1.f460495a.a(context, (r45.xa5) finderProfileCardFragment.f110056t.get(java.lang.Integer.valueOf(menuItem.getItemId())));
                    }
                }
            }
            pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
            int i18 = com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment.f110049v;
            finderProfileCardFragment.getClass();
            ((yy0.m7) l0Var).Ui("FinderPersonalProfilePageActionSheetAlbumPickingButton", 105, 0, ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj(), false);
            intent.putExtra("key_finder_post_router", 3);
            intent.putExtra("key_maas_entrance", 2);
            com.tencent.mm.plugin.finder.report.p2.f125237a.G("andr_Post_ActionSheet_Album", null);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 1, "post_actionsheet_album", "", nyVar != null ? nyVar.V6() : null, null, 16, null);
        } else {
            pp0.l0 l0Var2 = (pp0.l0) i95.n0.c(pp0.l0.class);
            int i19 = com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment.f110049v;
            finderProfileCardFragment.getClass();
            ((yy0.m7) l0Var2).Ui("FinderPersonalProfilePageActionSheetShootingButton", 105, 0, ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj(), true);
            intent.putExtra("key_finder_post_router", 2);
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) c18;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var2, 1, "post_acionsheet_camera", "", nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
            com.tencent.mm.plugin.finder.report.p2.f125237a.G("andr_Post_ActionSheet_Camera", null);
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("ProfileActionSheetPublish");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("PersonalCenterActionSheetPost");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("ProfilePublish");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("TLCamera");
        }
        intent.putExtra("key_finder_post_from", 1);
        intent.putExtra("key_finder_post_id", this.f280520f);
        intent.putExtra("KEY_FINDER_USERNAME_SELF", this.f280521g);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yk(context, intent, 132, 10);
        finderProfileCardFragment.s0(context, intent, menuItem.getItemId() == 2 ? 100 : 99);
    }
}
