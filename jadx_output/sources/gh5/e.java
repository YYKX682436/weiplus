package gh5;

/* loaded from: classes5.dex */
public final class e extends n3.j2 implements n3.k0 {

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f271980c;

    /* renamed from: d, reason: collision with root package name */
    public n3.g3 f271981d;

    /* renamed from: e, reason: collision with root package name */
    public e3.d f271982e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f271983f;

    public e() {
        super(0);
        this.f271982e = e3.d.f247043e;
    }

    @Override // n3.k0
    public n3.g3 a(android.view.View v17, n3.g3 insets) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(insets, "insets");
        this.f271980c = v17;
        this.f271981d = insets;
        e3.d a17 = insets.a(this.f271983f ? 8 : 10);
        kotlin.jvm.internal.o.f(a17, "getInsets(...)");
        this.f271982e = a17;
        v17.setPadding(a17.f247044a, a17.f247045b, a17.f247046c, a17.f247047d);
        com.tencent.mars.xlog.Log.i("MicroMsg.BottomSheetKeyboardAnimationCallback", "onApplyWindowInsets: " + this.f271982e.f247047d);
        n3.g3 CONSUMED = n3.g3.f334337b;
        kotlin.jvm.internal.o.f(CONSUMED, "CONSUMED");
        return CONSUMED;
    }

    @Override // n3.j2
    public void b(n3.s2 animation) {
        android.view.View view;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.BottomSheetKeyboardAnimationCallback", "onEnd");
        if (this.f271983f && (animation.a() & 8) != 0) {
            this.f271983f = false;
            if (this.f271981d != null && (view = this.f271980c) != null) {
                kotlin.jvm.internal.o.d(view);
                n3.g3 g3Var = this.f271981d;
                kotlin.jvm.internal.o.d(g3Var);
                n3.l1.b(view, g3Var);
            }
        }
        android.view.View view2 = this.f271980c;
        if (view2 == null) {
            return;
        }
        view2.setTranslationY(0.0f);
    }

    @Override // n3.j2
    public void c(n3.s2 animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.BottomSheetKeyboardAnimationCallback", "onPrepare");
        if ((animation.a() & 8) != 0) {
            this.f271983f = true;
        }
    }

    @Override // n3.j2
    public n3.g3 d(n3.g3 insets, java.util.List runningAnimations) {
        kotlin.jvm.internal.o.g(insets, "insets");
        kotlin.jvm.internal.o.g(runningAnimations, "runningAnimations");
        e3.d a17 = insets.a(8);
        kotlin.jvm.internal.o.f(a17, "getInsets(...)");
        e3.d a18 = insets.a(2);
        kotlin.jvm.internal.o.f(a18, "getInsets(...)");
        e3.d c17 = e3.d.c(this.f271982e, e3.d.c(a17, a18));
        android.view.View view = this.f271980c;
        if (view != null) {
            view.setTranslationY(c17.f247047d);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onProgress: ");
        android.view.View view2 = this.f271980c;
        sb6.append(view2 != null ? java.lang.Float.valueOf(view2.getTranslationY()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BottomSheetKeyboardAnimationCallback", sb6.toString());
        return insets;
    }
}
