package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public abstract class e0 {
    public abstract kotlinx.coroutines.internal.d a();

    public final boolean b(kotlinx.coroutines.internal.e0 e0Var) {
        kotlinx.coroutines.internal.d a17;
        kotlinx.coroutines.internal.d a18 = a();
        return (a18 == null || (a17 = e0Var.a()) == null || a18.g() >= a17.g()) ? false : true;
    }

    public abstract java.lang.Object c(java.lang.Object obj);

    public java.lang.String toString() {
        return getClass().getSimpleName() + '@' + kotlinx.coroutines.c1.a(this);
    }
}
