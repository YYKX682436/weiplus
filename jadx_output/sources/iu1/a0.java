package iu1;

/* loaded from: classes9.dex */
public final class a0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xt f294839e;

    public a0(com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI, r45.xt xtVar) {
        this.f294838d = cardHomePageNewUI;
        this.f294839e = xtVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294838d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) cardHomePageNewUI.getContext(), 1, false);
        r45.xt xtVar = this.f294839e;
        k0Var.f211872n = new iu1.y(xtVar);
        k0Var.f211881s = new iu1.z(xtVar, cardHomePageNewUI);
        k0Var.v();
        return false;
    }
}
