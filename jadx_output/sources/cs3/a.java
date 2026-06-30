package cs3;

/* loaded from: classes9.dex */
public class a implements kv.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f222096d;

    public a(kv.e0 e0Var) {
        this.f222096d = new java.lang.ref.WeakReference(e0Var);
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        java.lang.ref.WeakReference weakReference = this.f222096d;
        if (weakReference.get() != null) {
            ((kv.e0) weakReference.get()).U(str);
        }
    }
}
