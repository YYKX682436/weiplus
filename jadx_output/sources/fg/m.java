package fg;

/* loaded from: classes7.dex */
public final class m implements com.tencent.mm.plugin.appbrand.widget.input.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg.g f261788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f261789b;

    public m(fg.g gVar, fg.b0 b0Var) {
        this.f261788a = gVar;
        this.f261789b = b0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p3
    public void a(int i17) {
        int c17 = this.f261788a.c();
        int i18 = i17 - c17;
        fg.b0 b0Var = this.f261789b;
        com.tencent.mars.xlog.Log.i(b0Var.f261724a, "OnHeightChangedListener, totalHeight: %d, lateSavedKeyboardPanelHeight: %d, currentKeyboardPanelHeight: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(b0Var.f261731h), java.lang.Integer.valueOf(c17));
        if (c17 == 0 || b0Var.f261731h == c17) {
            return;
        }
        b0Var.f261731h = c17;
        b0Var.f261732i = i17;
        sf.c cVar = sf.c.f406939a;
        com.tencent.mm.plugin.appbrand.page.oa oaVar = b0Var.f261727d;
        kotlin.jvm.internal.o.d(oaVar);
        com.tencent.mm.plugin.appbrand.jsapi.t a17 = oaVar.a();
        com.tencent.mm.plugin.appbrand.page.oa oaVar2 = b0Var.f261727d;
        kotlin.jvm.internal.o.d(oaVar2);
        cVar.a(a17, oaVar2.b(), new sf.b(i17, b0Var.d(i17), b0Var.f261735l, new fg.l(b0Var, i18)));
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.p3
    public android.widget.EditText b() {
        android.widget.EditText editText = this.f261789b.f261730g;
        kotlin.jvm.internal.o.d(editText);
        return editText;
    }
}
