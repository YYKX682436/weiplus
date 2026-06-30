package iu1;

/* loaded from: classes9.dex */
public final class z implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.xt f294980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294981e;

    public z(r45.xt xtVar, com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI) {
        this.f294980d = xtVar;
        this.f294981e = cardHomePageNewUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            r45.xt xtVar = this.f294980d;
            int i18 = xtVar.f390385e;
            if (i18 == 1) {
                lu1.d.j(this.f294981e, xtVar.f390386f, 0);
            } else {
                if (i18 != 2) {
                    return;
                }
                r45.iu iuVar = xtVar.f390387g;
                lu1.d.f(iuVar.f377328d, iuVar.f377329e, iuVar.f377330f);
            }
        }
    }
}
