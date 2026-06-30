package ym5;

/* loaded from: classes15.dex */
public final class s0 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.b1 f463514d;

    public s0(ym5.b1 b1Var) {
        this.f463514d = b1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        ym5.b1 b1Var = this.f463514d;
        if (kotlin.jvm.internal.o.b(b1Var.f463210a, v17)) {
            b1Var.f463219j = false;
            ym5.a1.a(v17.hashCode(), b1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        if (kotlin.jvm.internal.o.b(this.f463514d.f463210a, v17)) {
            ym5.b1 b17 = ym5.a1.b(v17);
            if (b17 != null) {
                b17.f463219j = true;
            }
            ym5.b1 c17 = ym5.a1.c(v17);
            if (c17 != null) {
                c17.f463219j = true;
            }
        }
    }
}
