package ey2;

/* loaded from: classes2.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ey2.l0 f257422a = new ey2.l0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f257423b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f257424c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f257425d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f257426e;

    static {
        android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
        kotlin.jvm.internal.o.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        android.app.Application application = (android.app.Application) applicationContext;
        if (androidx.lifecycle.e1.f11621c == null) {
            androidx.lifecycle.e1.f11621c = new androidx.lifecycle.e1(application);
        }
        kotlin.jvm.internal.o.f(androidx.lifecycle.e1.f11621c, "getInstance(...)");
        f257425d = new java.lang.Object();
        f257426e = "FinderGlobalVMStore";
    }

    public final androidx.lifecycle.c1 a(java.lang.String key, java.lang.Class modelClass, androidx.lifecycle.f1 f1Var) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        synchronized (f257425d) {
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) f257423b;
            java.lang.Object obj = linkedHashMap.get(key);
            if (obj == null) {
                obj = new androidx.lifecycle.l1();
                linkedHashMap.put(key, obj);
            }
            androidx.lifecycle.l1 l1Var = (androidx.lifecycle.l1) obj;
            java.lang.String str = modelClass.getCanonicalName() + '_' + key;
            if (f1Var == null) {
                f1Var = (androidx.lifecycle.f1) ((java.util.LinkedHashMap) f257424c).get(str);
            }
            if (f1Var == null) {
                com.tencent.mars.xlog.Log.i(f257426e, "getViewModel is defaultFactory combinedKey:" + str);
                return null;
            }
            com.tencent.mars.xlog.Log.i(f257426e, "getViewModel combinedKey:" + str);
            return new androidx.lifecycle.j1(l1Var, f1Var).b(str, modelClass);
        }
    }
}
