package gk2;

/* loaded from: classes2.dex */
public abstract class g implements pf5.f {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.f f272479d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.l1 f272480e;

    public g(java.lang.String nameTag) {
        kotlin.jvm.internal.o.g(nameTag, "nameTag");
        gk2.f fVar = new gk2.f(hashCode(), nameTag);
        this.f272479d = fVar;
        androidx.lifecycle.l1 l1Var = new androidx.lifecycle.l1();
        this.f272480e = l1Var;
        com.tencent.mars.xlog.Log.i("LiveContext", "init " + hashCode() + " check map " + fVar);
        java.lang.reflect.Field declaredField = androidx.lifecycle.l1.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(l1Var);
        declaredField.set(l1Var, fVar);
        com.tencent.mars.xlog.Log.i("LiveContext", "init check map srcMap1:" + obj.hashCode() + " srcMap2:" + declaredField.get(l1Var).hashCode() + " storeMap:" + fVar.hashCode());
    }

    @Override // androidx.lifecycle.m1
    public androidx.lifecycle.l1 getViewModelStore() {
        return this.f272480e;
    }
}
