package rx4;

/* loaded from: classes8.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f401341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(rx4.h2 h2Var) {
        super(0);
        this.f401341d = h2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rx4.h2 h2Var = this.f401341d;
        float f17 = h2Var.getActivity().getResources().getDisplayMetrics().density;
        android.widget.ScrollView scrollView = h2Var.f401174p;
        if (scrollView != null) {
            rx4.h2.T6(h2Var, scrollView, f17);
            scrollView.post(new rx4.x1(h2Var, scrollView, f17));
        }
        return jz5.f0.f302826a;
    }
}
