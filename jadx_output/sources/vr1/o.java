package vr1;

/* loaded from: classes8.dex */
public final class o extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f439582d;

    /* renamed from: e, reason: collision with root package name */
    public final xr1.g f439583e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f439584f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f439585g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f439586h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f439587i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f439588m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f439589n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f439590o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f439591p;

    /* renamed from: q, reason: collision with root package name */
    public int f439592q;

    /* renamed from: r, reason: collision with root package name */
    public int f439593r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f439582d = new java.util.LinkedHashSet();
        this.f439583e = new xr1.g();
        this.f439587i = jz5.h.b(new vr1.b(this));
        this.f439588m = jz5.h.b(new vr1.n(this));
        this.f439589n = jz5.h.b(new vr1.i(activity));
        this.f439590o = jz5.h.b(new vr1.k(this, activity));
        this.f439591p = jz5.h.b(new vr1.j(this));
    }

    public final xm3.t0 O6() {
        return (xm3.t0) ((jz5.n) this.f439591p).getValue();
    }

    public final com.tencent.mm.plugin.mvvmlist.MvvmList P6() {
        return (com.tencent.mm.plugin.mvvmlist.MvvmList) ((jz5.n) this.f439590o).getValue();
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView getRecyclerView() {
        java.lang.Object value = ((jz5.n) this.f439588m).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) value;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        this.f439583e.f456193d = P6();
        getRecyclerView().setLayoutManager((androidx.recyclerview.widget.LinearLayoutManager) ((jz5.n) this.f439589n).getValue());
        getRecyclerView().setAdapter(O6());
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView = getRecyclerView();
        androidx.recyclerview.widget.z zVar = new androidx.recyclerview.widget.z();
        zVar.f12168c = 100L;
        zVar.f12169d = 150L;
        zVar.f12170e = 100L;
        recyclerView.setItemAnimator(zVar);
        getRecyclerView().setFlingSpeedFactor(80);
        O6().B = new vr1.c(this);
        this.f439584f = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f488218kv, (android.view.ViewGroup) getRecyclerView(), false);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f488216kt, (android.view.ViewGroup) null, false);
        this.f439585g = inflate;
        android.widget.TextView textView = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486537lm0) : null;
        this.f439586h = textView;
        android.text.TextPaint paint = textView != null ? textView.getPaint() : null;
        if (paint != null) {
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        android.text.TextPaint paint2 = textView != null ? textView.getPaint() : null;
        if (paint2 != null) {
            paint2.setStrokeWidth(0.8f);
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
        android.view.View decorView = ((com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI) activity).getWindow().getDecorView();
        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = ((java.lang.Number) ((jz5.n) this.f439587i).getValue()).intValue();
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "layoutParams.topMargin = " + layoutParams.topMargin);
        ((android.view.ViewGroup) decorView).addView(this.f439585g, layoutParams);
        O6().F = new vr1.e(this);
        getRecyclerView().i(new vr1.g(this));
    }
}
