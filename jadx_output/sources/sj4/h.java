package sj4;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final sj4.h f408844a = new sj4.h();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f408845b;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("5", sj4.b.f408824a);
        hashMap.put("7", sj4.e.f408834a);
        f408845b = hashMap;
    }

    public final void a(java.util.List reqInfos, yz5.a callback) {
        kotlin.jvm.internal.o.g(reqInfos, "reqInfos");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (reqInfos.isEmpty()) {
            callback.invoke();
            return;
        }
        try {
            pj4.j0 j0Var = (pj4.j0) reqInfos.remove(0);
            sj4.c cVar = (sj4.c) f408845b.get(j0Var.f355139d);
            if (cVar != null) {
                cVar.a(j0Var, new sj4.f(reqInfos, callback));
            } else {
                a(reqInfos, callback);
            }
        } catch (java.lang.Throwable unused) {
            a(reqInfos, callback);
        }
    }
}
