package fg;

/* loaded from: classes7.dex */
public final class s implements com.tencent.mm.plugin.appbrand.widget.input.k2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f261807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f261808e;

    public s(fg.b0 b0Var) {
        this.f261808e = b0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public void a(boolean z17) {
        com.tencent.mm.plugin.appbrand.jsapi.t a17;
        android.view.View contentView;
        com.tencent.mm.plugin.appbrand.jsapi.t a18;
        fg.b0 b0Var = this.f261808e;
        if (b0Var.e(b0Var.f261740q)) {
            com.tencent.mars.xlog.Log.w(b0Var.f261724a, "is keyboard showing: " + b0Var.f261733j + ", state change: " + z17);
            return;
        }
        this.f261807d = z17;
        com.tencent.mm.plugin.appbrand.page.oa oaVar = b0Var.f261727d;
        if (((oaVar == null || (a18 = oaVar.a()) == null) ? null : a18.getContentView()) == null || sf.c.f406939a.b()) {
            b(z17);
            return;
        }
        if (b0Var.f261737n) {
            return;
        }
        b0Var.f261737n = true;
        com.tencent.mm.plugin.appbrand.page.oa oaVar2 = b0Var.f261727d;
        if (oaVar2 == null || (a17 = oaVar2.a()) == null || (contentView = a17.getContentView()) == null) {
            return;
        }
        contentView.postDelayed(new fg.q(b0Var, this), b0Var.f261725b);
    }

    public final void b(boolean z17) {
        fg.b0 b0Var = this.f261808e;
        fg.g b17 = b0Var.b(null);
        if (b17 != null) {
            android.widget.EditText editText = b0Var.f261730g;
            if (editText != null) {
                if (z17) {
                    b17.h(editText);
                } else {
                    b17.e(editText);
                }
            }
            b17.d(z17 ? b0Var.f261732i : 0);
        }
        sf.c cVar = sf.c.f406939a;
        com.tencent.mm.plugin.appbrand.page.oa oaVar = b0Var.f261727d;
        kotlin.jvm.internal.o.d(oaVar);
        com.tencent.mm.plugin.appbrand.jsapi.t a17 = oaVar.a();
        com.tencent.mm.plugin.appbrand.page.oa oaVar2 = b0Var.f261727d;
        kotlin.jvm.internal.o.d(oaVar2);
        cVar.a(a17, oaVar2.b(), new sf.b(z17 ? b0Var.f261732i : 0, b0Var.d(b0Var.f261732i), b0Var.f261735l, new fg.p(b0Var, z17)));
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public void d(int i17) {
        int i18;
        fg.b0 b0Var = this.f261808e;
        boolean z17 = (i17 == 0 || (i18 = b0Var.f261732i) == 0 || i17 == i18) ? false : true;
        b0Var.f261732i = i17;
        if (z17) {
            sf.c cVar = sf.c.f406939a;
            com.tencent.mm.plugin.appbrand.page.oa oaVar = b0Var.f261727d;
            kotlin.jvm.internal.o.d(oaVar);
            com.tencent.mm.plugin.appbrand.jsapi.t a17 = oaVar.a();
            com.tencent.mm.plugin.appbrand.page.oa oaVar2 = b0Var.f261727d;
            kotlin.jvm.internal.o.d(oaVar2);
            cVar.a(a17, oaVar2.b(), new sf.b(i17, b0Var.d(i17), b0Var.f261735l, new fg.r(b0Var, i17)));
        }
        fg.g b17 = b0Var.b(null);
        if (b17 != null) {
            b17.d(i17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public int getHeight() {
        return this.f261808e.f261732i;
    }
}
