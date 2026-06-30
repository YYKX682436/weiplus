package qv4;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f366970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qv4.k0 f366971e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(android.view.View view, qv4.k0 k0Var) {
        super(0);
        this.f366970d = view;
        this.f366971e = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f366970d;
        int right = view.getRight();
        qv4.k0 k0Var = this.f366971e;
        int width = right - k0Var.n().getWidth();
        int left = view.getLeft() - k0Var.n().getScrollX();
        if (k0Var.n().getScrollX() < width || left < 0) {
            android.widget.HorizontalScrollView n17 = k0Var.n();
            if (width < 0) {
                width = 0;
            }
            n17.smoothScrollTo(width, 0);
        }
        return jz5.f0.f302826a;
    }
}
