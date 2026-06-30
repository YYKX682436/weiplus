package hr3;

/* loaded from: classes10.dex */
public final class yc extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI f284211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI recommendDeleteContactUI) {
        super(1);
        this.f284211d = recommendDeleteContactUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xb5.a viewModel = (xb5.a) obj;
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendDeleteContactUI", "itemCheckBoxClickListener:" + viewModel.f453006d + ' ' + viewModel.f453008f + ' ');
        int i17 = com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI.A;
        com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI recommendDeleteContactUI = this.f284211d;
        recommendDeleteContactUI.Z6();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("infrequentcontactsortpage_contact_selection_button", "view_clk", kz5.c1.k(new jz5.l("contacts_max_limit_sort_sessionid", recommendDeleteContactUI.W6()), new jz5.l("infrequentcontactsortpage_sessionid", recommendDeleteContactUI.f153805y), new jz5.l("wx_username", viewModel.f453006d)), 32337);
        return jz5.f0.f302826a;
    }
}
