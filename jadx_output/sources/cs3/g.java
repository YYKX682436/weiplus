package cs3;

/* loaded from: classes9.dex */
public class g implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f222111d;

    public g(l75.z0 z0Var) {
        this.f222111d = new java.lang.ref.WeakReference(z0Var);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        java.lang.ref.WeakReference weakReference = this.f222111d;
        if (weakReference.get() != null) {
            ((l75.z0) weakReference.get()).g(i17, a1Var, obj);
        }
    }
}
