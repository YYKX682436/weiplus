package zm5;

/* loaded from: classes14.dex */
public final class r0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f474259d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f474260e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f474261f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f474262g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f474263h;

    /* renamed from: i, reason: collision with root package name */
    public bm5.r1 f474264i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f474259d = jz5.h.b(new zm5.q0(activity));
        this.f474260e = jz5.h.b(new zm5.g0(this));
        this.f474262g = "";
    }

    public final fn5.n0 O6() {
        return (fn5.n0) ((jz5.n) this.f474259d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_SUG_QUERY_TEXT");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f474262g = stringExtra;
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_IS_INIT", false);
        this.f474263h = booleanExtra;
        aq.o.f12920a = false;
        if (booleanExtra) {
            this.f474261f = com.tencent.mm.ui.widget.dialog.u3.f(getActivity(), com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.fzr), false, 0, null);
            kotlinx.coroutines.y0 a17 = androidx.lifecycle.d1.a(this);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            kotlinx.coroutines.l.d(a17, p0Var, null, new zm5.i0(this, null), 2, null);
            kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(this), p0Var, null, new zm5.k0(this, null), 2, null);
        } else {
            aq.n nVar = aq.o.f12922c;
            if (nVar != null) {
                nVar.a(getActivity());
            }
        }
        O6().f264739y = this.f474263h;
        O6().D = true;
        ((com.tencent.mm.mm_compose.MMComposeView) ((jz5.n) this.f474260e).getValue()).setContent(u0.j.c(-923171977, true, new zm5.p0(this)));
        f65.o oVar = f65.o.f259912a;
        aq.n nVar2 = aq.o.f12922c;
        f65.o.f259920i = nVar2 != null && (nVar2.f12906a == aq.b.f12836e || aq.r0.f12953n == aq.c.f12845g) ? 1 : 2;
        aq.n nVar3 = aq.o.f12922c;
        f65.o.f259928q = nVar3 != null && (nVar3.f12906a == aq.b.f12836e || aq.r0.f12953n == aq.c.f12845g) ? 1 : 2;
        if (!(this.f474262g.length() > 0)) {
            O6().C = false;
            return;
        }
        O6().C = true;
        fn5.n0 O6 = O6();
        kotlin.jvm.internal.o.f(O6, "<get-viewModel>(...)");
        O6.P6(this.f474262g, null);
        java.lang.String text = this.f474262g;
        kotlin.jvm.internal.o.g(text, "text");
        f65.p.f259948o = text;
        f65.p.f259946m = 1;
        java.lang.String sessionId = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        f65.p.f259945l = sessionId;
        oVar.e(this.f474262g);
        oVar.f();
        oVar.b(4);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        aq.n nVar = aq.o.f12922c;
        if (nVar != null) {
            nVar.d();
        }
        bm5.r1 r1Var = this.f474264i;
        if (r1Var != null && (onGlobalLayoutListener = r1Var.f22731b) != null) {
            r1Var.f22730a.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        fn5.n0 O6 = O6();
        java.util.ArrayList arrayList = O6.f264731q;
        int size = arrayList.size();
        f65.n nVar2 = f65.n.f259909a;
        if (size > 0) {
            nVar2.d(arrayList.size());
            nVar2.g(arrayList.size());
            fn5.p0 p0Var = (fn5.p0) O6.f264729o.getValue();
            if (kotlin.jvm.internal.o.b(p0Var != null ? p0Var.name() : null, "PERSON")) {
                nVar2.e(O6.f264732r.size());
            }
        }
        nVar2.c(56);
        nVar2.c(57);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReportProvider", "reportTecSearchAction " + aq.o.f12920a);
        if (aq.o.f12920a) {
            return;
        }
        f65.p.f259934a.b(8);
    }
}
