package iu1;

/* loaded from: classes9.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wt f294856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iu1.m f294857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.tt f294858g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f294859h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f294860i;

    public e(com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI, r45.wt wtVar, iu1.m mVar, r45.tt ttVar, int i17, int i18) {
        this.f294855d = cardHomePageNewUI;
        this.f294856e = wtVar;
        this.f294857f = mVar;
        this.f294858g = ttVar;
        this.f294859h = i17;
        this.f294860i = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$appendCouponView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294855d;
        cardHomePageNewUI.B = true;
        cardHomePageNewUI.C = 0;
        r45.wt wtVar = this.f294856e;
        cardHomePageNewUI.f95182J = wtVar;
        r45.tt ttVar = this.f294858g;
        java.lang.String user_card_id = ttVar.f386765d;
        kotlin.jvm.internal.o.f(user_card_id, "user_card_id");
        this.f294857f.w(user_card_id);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16324, 1, wtVar.f389427d, java.lang.Integer.valueOf(this.f294859h), ttVar.f386765d, 2, java.lang.Integer.valueOf(this.f294860i), java.lang.Integer.valueOf(cardHomePageNewUI.E));
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$appendCouponView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
