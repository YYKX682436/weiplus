package iu1;

/* loaded from: classes9.dex */
public final class v implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iu1.a f294961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f294962f;

    public v(com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI, iu1.a aVar, int i17) {
        this.f294960d = cardHomePageNewUI;
        this.f294961e = aVar;
        this.f294962f = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294960d;
            androidx.appcompat.app.AppCompatActivity context = cardHomePageNewUI.getContext();
            java.lang.String string = cardHomePageNewUI.getString(com.tencent.mm.R.string.atb);
            iu1.a aVar = this.f294961e;
            int i18 = this.f294962f;
            db5.e1.G(context, string, "", false, new iu1.u(cardHomePageNewUI, aVar, i18));
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            r45.wt wtVar = aVar.f294831a;
            kotlin.jvm.internal.o.d(wtVar);
            g0Var.d(16324, 2, wtVar.f389427d, 0, 0, 8, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(cardHomePageNewUI.E));
        }
    }
}
