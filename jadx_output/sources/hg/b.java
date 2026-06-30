package hg;

/* loaded from: classes7.dex */
public class b implements com.tencent.mm.plugin.appbrand.widget.input.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hg.h f281276a;

    public b(hg.h hVar) {
        this.f281276a = hVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p3
    public void a(int i17) {
        hg.h hVar = this.f281276a;
        com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var = hVar.f281299c;
        if (u3Var == null) {
            return;
        }
        int minimumHeight = u3Var.getMinimumHeight();
        final int i18 = i17 - minimumHeight;
        com.tencent.mars.xlog.Log.i("WebViewExtendTextAreaClient", "OnHeightChangedListener, totalHeight: %d, lateSavedKeyboardPanelHeight: %d, currentKeyboardPanelHeight: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(hVar.f281301e), java.lang.Integer.valueOf(minimumHeight));
        if (minimumHeight == 0 || hVar.f281301e == minimumHeight) {
            return;
        }
        hVar.f281301e = minimumHeight;
        hVar.f281302f = i17;
        sf.c.f406939a.a(hVar.f281297a.a(), hVar.f281297a.b(), new sf.b(i17, hVar.c(i17), java.lang.Integer.valueOf(hVar.f281304h), new yz5.a() { // from class: hg.b$$a
            @Override // yz5.a
            public final java.lang.Object invoke() {
                hg.b bVar = hg.b.this;
                bVar.getClass();
                int i19 = i18;
                bVar.f281276a.onKeyboardHeightChanged(i19 > 0, i19, false);
                return null;
            }
        }));
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p3
    public android.widget.EditText b() {
        return this.f281276a.f281300d;
    }
}
