package du3;

/* loaded from: classes3.dex */
public final class i1 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f243618f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f243619g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f243620h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f243621i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f243622m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f243623n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f243624o;

    /* renamed from: p, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f243625p;

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.r2 f243626q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(ju3.d0 status, android.view.ViewGroup parent) {
        super(status, null);
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f243618f = parent;
        this.f243619g = jz5.h.b(new du3.w0(this));
        this.f243620h = jz5.h.b(new du3.f1(this));
        this.f243621i = jz5.h.b(new du3.g1(this));
        this.f243622m = jz5.h.b(new du3.u0(this));
        this.f243623n = jz5.h.b(new du3.v0(this));
        this.f243624o = jz5.h.b(new du3.h1(this));
        this.f243625p = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
    }

    public final android.view.View A() {
        java.lang.Object value = ((jz5.n) this.f243619g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.widget.TextView B() {
        java.lang.Object value = this.f243621i.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final hk0.u0 C() {
        return (hk0.u0) this.f243624o.getValue();
    }

    @Override // yt3.r2
    public void onAttach() {
        C().Z6(4, new du3.b1(this));
        this.f243626q = kotlinx.coroutines.l.d(this.f243625p, null, null, new du3.e1(this, null), 3, null);
    }

    @Override // yt3.r2
    public void onDetach() {
        kotlinx.coroutines.r2 r2Var = this.f243626q;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        z(false);
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        java.lang.Object value = ((jz5.n) this.f243620h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.view.View) value).setOnClickListener(new du3.x0(this));
        B().setOnClickListener(new du3.y0(this));
        java.lang.Object value2 = ((jz5.n) this.f243622m).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.view.View) value2).setOnClickListener(new du3.z0(this));
        java.lang.Object value3 = ((jz5.n) this.f243623n).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((android.view.View) value3).setOnClickListener(new du3.a1(this));
        z(false);
        android.view.ViewGroup.LayoutParams layoutParams = A().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin += com.tencent.mm.ui.bl.c(A().getContext());
        A().setLayoutParams(layoutParams2);
    }

    public final void z(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoCropPlugin", "changeUndoState >> " + z17);
        B().setEnabled(z17);
        B().setTextColor(i65.a.d(this.f243618f.getContext(), z17 ? com.tencent.mm.R.color.f479273ac5 : com.tencent.mm.R.color.ac6));
    }
}
