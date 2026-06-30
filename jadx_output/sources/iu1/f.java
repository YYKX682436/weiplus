package iu1;

/* loaded from: classes9.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wt f294865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wt f294866f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ iu1.m f294867g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f294868h;

    public f(com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI, r45.wt wtVar, r45.wt wtVar2, iu1.m mVar, int i17) {
        this.f294864d = cardHomePageNewUI;
        this.f294865e = wtVar;
        this.f294866f = wtVar2;
        this.f294867g = mVar;
        this.f294868h = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$setModel$1$headerClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "click header");
        com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294864d;
        cardHomePageNewUI.B = true;
        cardHomePageNewUI.C = 0;
        cardHomePageNewUI.f95182J = this.f294865e;
        r45.wt wtVar = this.f294866f;
        int i17 = wtVar.f389432i;
        if (i17 == 1) {
            android.content.Context context = this.f294867g.itemView.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            lu1.d.j((com.tencent.mm.ui.MMActivity) context, wtVar.f389433m, 0);
        } else if (i17 == 2) {
            r45.iu iuVar = wtVar.f389434n;
            lu1.d.f(iuVar.f377328d, iuVar.f377329e, iuVar.f377330f);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16324, 1, wtVar.f389427d, 0, 0, 1, java.lang.Integer.valueOf(this.f294868h), java.lang.Integer.valueOf(cardHomePageNewUI.E));
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$setModel$1$headerClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
