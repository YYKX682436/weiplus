package hr3;

/* loaded from: classes10.dex */
public final class zc extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI f284242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI recommendDeleteContactUI) {
        super(1);
        this.f284242d = recommendDeleteContactUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xb5.a viewModel = (xb5.a) obj;
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendDeleteContactUI", "itemClickListener:" + viewModel.f453006d + ' ' + viewModel.f453008f + ' ');
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", viewModel.f453006d);
        com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI recommendDeleteContactUI = this.f284242d;
        j45.l.n(recommendDeleteContactUI.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, 1);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        int i17 = com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI.A;
        ((cy1.a) rVar).Hj("infrequentcontactsortpage_contact_info_button", "view_clk", kz5.c1.k(new jz5.l("contacts_max_limit_sort_sessionid", recommendDeleteContactUI.W6()), new jz5.l("infrequentcontactsortpage_sessionid", recommendDeleteContactUI.f153805y), new jz5.l("wx_username", viewModel.f453006d)), 32337);
        return jz5.f0.f302826a;
    }
}
