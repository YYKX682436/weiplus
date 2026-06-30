package wo1;

/* loaded from: classes5.dex */
public final class i1 extends y9.i {

    /* renamed from: n, reason: collision with root package name */
    public final android.content.Context f447952n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.FrameLayout f447953o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f447954p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(android.content.Context ctx) {
        super(ctx, 0);
        kotlin.jvm.internal.o.g(ctx, "ctx");
        this.f447952n = ctx;
        this.f447953o = new android.widget.FrameLayout(ctx);
        this.f447954p = jz5.h.b(new wo1.f1(this));
    }

    public final void E() {
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
        android.widget.FrameLayout frameLayout = this.f447953o;
        frameLayout.setBackgroundResource(com.tencent.mm.R.drawable.b8p);
        super.setContentView(frameLayout, layoutParams);
        android.view.View findViewById = findViewById(android.R.id.content);
        kotlin.jvm.internal.o.d(findViewById);
        wo1.h1 h1Var = new wo1.h1(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.u(findViewById, h1Var);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(this.f447952n);
        ((com.google.android.material.bottomsheet.BottomSheetBehavior) ((jz5.n) this.f447954p).getValue()).C((int) (java.lang.Math.max(b17.y, b17.x) * 0.85d));
    }

    @Override // y9.i, androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        E();
        android.widget.FrameLayout frameLayout = this.f447953o;
        frameLayout.removeAllViews();
        frameLayout.addView(view);
    }

    @Override // y9.i, androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(int i17) {
        E();
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.f447952n);
        android.widget.FrameLayout frameLayout = this.f447953o;
        android.view.View inflate = from.inflate(i17, (android.view.ViewGroup) frameLayout, false);
        frameLayout.removeAllViews();
        frameLayout.addView(inflate);
    }

    @Override // y9.i, androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.o.g(view, "view");
        E();
        android.widget.FrameLayout frameLayout = this.f447953o;
        frameLayout.removeAllViews();
        frameLayout.addView(view, layoutParams);
    }
}
