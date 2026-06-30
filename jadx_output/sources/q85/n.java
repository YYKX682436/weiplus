package q85;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q85.s f360820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f360821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q85.s sVar, e0.f1 f1Var) {
        super(1);
        this.f360820d = sVar;
        this.f360821e = f1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        e1.e0 graphicsLayer = (e1.e0) obj;
        kotlin.jvm.internal.o.g(graphicsLayer, "$this$graphicsLayer");
        q85.s sVar = this.f360820d;
        sVar.getClass();
        e0.f1 lazyListState = this.f360821e;
        kotlin.jvm.internal.o.g(lazyListState, "lazyListState");
        int d17 = lazyListState.d();
        androidx.lifecycle.j0 j0Var = sVar.f360833c;
        if (d17 == 0) {
            int e17 = lazyListState.e() - sVar.f360831a;
            if (e17 >= 0) {
                float f17 = e17 / sVar.f360832b;
                if (f17 > 1.0d) {
                    j0Var.setValue(java.lang.Float.valueOf(1.0f));
                } else {
                    j0Var.setValue(java.lang.Float.valueOf(f17));
                }
            } else {
                j0Var.setValue(java.lang.Float.valueOf(0.0f));
            }
        }
        java.lang.Float f18 = (java.lang.Float) j0Var.getValue();
        kotlin.jvm.internal.o.d(f18);
        ((e1.x0) graphicsLayer).f246297f = f18.floatValue();
        return jz5.f0.f302826a;
    }
}
