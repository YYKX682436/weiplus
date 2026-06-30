package fr5;

/* loaded from: classes15.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f266024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fr5.f0 f266025e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.view.View view, fr5.f0 f0Var) {
        super(1);
        this.f266024d = view;
        this.f266025e = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        android.view.MotionEvent e17 = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(e17, "e");
        android.view.View view = this.f266024d;
        int scaledTouchSlop = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        fr5.f0 f0Var = this.f266025e;
        float f17 = scaledTouchSlop;
        if (zq5.l.b(f0Var.f265942g) < f17 && zq5.l.c(f0Var.f265942g) < f17) {
            if (view.isLongClickable()) {
                view.performLongClick();
                z17 = true;
            } else {
                z17 = false;
            }
            f0Var.f265937b = z17;
        }
        return jz5.f0.f302826a;
    }
}
