package tc2;

/* loaded from: classes2.dex */
public final class g implements pf5.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f417144d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final tc2.f f417145e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.l1 f417146f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.y0 f417147g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f417148h;

    /* renamed from: i, reason: collision with root package name */
    public in5.s0 f417149i;

    /* renamed from: m, reason: collision with root package name */
    public in5.r f417150m;

    static {
        new tc2.e(null);
    }

    public g() {
        tc2.f fVar = new tc2.f(hashCode());
        this.f417145e = fVar;
        androidx.lifecycle.l1 l1Var = new androidx.lifecycle.l1();
        this.f417146f = l1Var;
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedControllerStore", "init " + hashCode() + " check map " + fVar);
        java.lang.reflect.Field declaredField = androidx.lifecycle.l1.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(l1Var);
        declaredField.set(l1Var, fVar);
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedControllerStore", "init check map srcMap1:" + obj.hashCode() + " srcMap2:" + declaredField.get(l1Var).hashCode() + " storeMap:" + fVar.hashCode());
    }

    public final tc2.c a(java.lang.Class bu6) {
        kotlin.jvm.internal.o.g(bu6, "bu");
        java.lang.String c17 = c(bu6);
        if (this.f417145e.containsKey(c17)) {
            return (tc2.c) new androidx.lifecycle.j1(getViewModel(), new tc2.d(this)).b(c17, bu6);
        }
        com.tencent.mars.xlog.Log.e("Finder.FinderFeedControllerStore", "get controller but not exist, key:" + c17);
        return null;
    }

    public final java.lang.Object b(java.lang.Class bu6) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(bu6, "bu");
        java.util.Collection values = this.f417145e.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            java.lang.Class<?>[] interfaces = ((androidx.lifecycle.c1) obj).getClass().getInterfaces();
            kotlin.jvm.internal.o.f(interfaces, "getInterfaces(...)");
            if (kz5.z.G(interfaces, bu6)) {
                break;
            }
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final java.lang.String c(java.lang.Class bu6) {
        kotlin.jvm.internal.o.g(bu6, "bu");
        java.lang.String canonicalName = bu6.getCanonicalName();
        if (canonicalName == null || canonicalName.length() == 0) {
            pm0.z.b(xy2.b.f458155b, "FinderFeedController_getKey_invalid", false, null, null, false, false, null, 124, null);
        }
        return "FinderFeedControllerStore:" + canonicalName;
    }

    @Override // androidx.lifecycle.m1
    /* renamed from: getViewModelStore */
    public androidx.lifecycle.l1 getViewModel() {
        return this.f417146f;
    }
}
