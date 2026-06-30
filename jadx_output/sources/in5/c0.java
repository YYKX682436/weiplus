package in5;

/* loaded from: classes8.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f293017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(in5.n0 n0Var) {
        super(0);
        this.f293017d = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in5.n0 n0Var = this.f293017d;
        n0Var.getClass();
        boolean z17 = false;
        try {
            java.lang.reflect.Field declaredField = androidx.recyclerview.widget.f2.class.getDeclaredField("mObservable");
            declaredField.setAccessible(true);
            java.lang.reflect.Constructor<?> declaredConstructor = declaredField.get(n0Var).getClass().getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
            kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type android.database.Observable<androidx.recyclerview.widget.RecyclerView.AdapterDataObserver>");
            android.database.Observable observable = (android.database.Observable) newInstance;
            n0Var.f293099f = observable;
            declaredField.set(n0Var, observable);
            if (n0Var.f293099f != null) {
                z17 = true;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("RecyclerViewAdapterEx", th6, "", new java.lang.Object[0]);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
