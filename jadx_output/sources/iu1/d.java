package iu1;

/* loaded from: classes9.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wt f294848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iu1.m f294849f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.tt f294850g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f294851h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f294852i;

    public d(com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI, r45.wt wtVar, iu1.m mVar, r45.tt ttVar, int i17, int i18) {
        this.f294847d = cardHomePageNewUI;
        this.f294848e = wtVar;
        this.f294849f = mVar;
        this.f294850g = ttVar;
        this.f294851h = i17;
        this.f294852i = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$appendCouponView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294847d;
        cardHomePageNewUI.B = true;
        cardHomePageNewUI.C = 0;
        r45.wt wtVar = this.f294848e;
        cardHomePageNewUI.f95182J = wtVar;
        r45.tt ttVar = this.f294850g;
        java.lang.String user_card_id = ttVar.f386765d;
        kotlin.jvm.internal.o.f(user_card_id, "user_card_id");
        this.f294849f.w(user_card_id);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16324, 1, wtVar.f389427d, java.lang.Integer.valueOf(this.f294851h), ttVar.f386765d, 2, java.lang.Integer.valueOf(this.f294852i), java.lang.Integer.valueOf(cardHomePageNewUI.E));
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$appendCouponView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
