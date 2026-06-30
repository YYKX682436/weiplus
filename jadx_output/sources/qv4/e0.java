package qv4;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qv4.k0 f366967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f366968e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(qv4.k0 k0Var, boolean z17) {
        super(0);
        this.f366967d = k0Var;
        this.f366968e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view;
        java.lang.Float f17;
        int floatValue;
        qv4.k0 k0Var = this.f366967d;
        java.util.List j17 = k0Var.j();
        java.util.Iterator it = j17.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            view = k0Var.f366987d;
            if (!hasNext) {
                i17 = -1;
                break;
            }
            if (((android.view.View) it.next()).getLeft() > view.getWidth()) {
                break;
            }
            i17++;
        }
        int size = j17.size();
        if (i17 >= (size <= 1 ? size : 1)) {
            android.view.View view2 = (android.view.View) j17.get(i17);
            int i18 = i17 - 1;
            android.view.View view3 = (android.view.View) j17.get(i18);
            int width = view.getWidth() - view3.getLeft();
            int right = view3.getRight() - view.getWidth();
            if (width < k0Var.l() || right < k0Var.l()) {
                float left = ((view2.getLeft() + k0Var.l()) - view.getWidth()) / i17;
                float f18 = k0Var.f366989f;
                if (f18 - left < 0.0f) {
                    float right2 = f18 - (((view3.getRight() - k0Var.l()) - view.getWidth()) / i18);
                    f17 = java.lang.Float.valueOf(right2 >= 0.0f ? right2 : 0.0f);
                    if (f17 != null && (floatValue = (int) f17.floatValue()) != k0Var.f366990g) {
                        k0Var.f366990g = floatValue;
                        k0Var.o(this.f366968e);
                    }
                    k0Var.n().setOnScrollChangeListener(new qv4.d0(k0Var));
                    return jz5.f0.f302826a;
                }
            }
        }
        f17 = null;
        if (f17 != null) {
            k0Var.f366990g = floatValue;
            k0Var.o(this.f366968e);
        }
        k0Var.n().setOnScrollChangeListener(new qv4.d0(k0Var));
        return jz5.f0.f302826a;
    }
}
