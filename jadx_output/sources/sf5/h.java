package sf5;

/* loaded from: classes10.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final sf5.l f407638a;

    public h(sf5.l stateTransform) {
        kotlin.jvm.internal.o.g(stateTransform, "stateTransform");
        this.f407638a = stateTransform;
    }

    public kotlinx.coroutines.flow.i2 a(kotlinx.coroutines.y0 lifecycleScope, int i17) {
        kotlin.jvm.internal.o.g(lifecycleScope, "lifecycleScope");
        this.f407638a.getClass();
        kotlinx.coroutines.flow.i2 a17 = kotlinx.coroutines.flow.r2.a(i17, Integer.MAX_VALUE, u26.u.DROP_OLDEST);
        kotlinx.coroutines.l.d(lifecycleScope, null, null, new sf5.f(this, a17, null), 3, null);
        return a17;
    }

    public abstract java.lang.Object b(kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation);
}
