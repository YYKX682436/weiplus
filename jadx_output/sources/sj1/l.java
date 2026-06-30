package sj1;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static int f408371a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f408372b;

    /* renamed from: d, reason: collision with root package name */
    public static sj1.a f408374d;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f408373c = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final sj1.c f408375e = new sj1.k();

    public static final double a() {
        if (f408372b) {
            return com.luggage.trace.TracerJni.INSTANCE.nativeCurrentMicroseconds();
        }
        return 0.0d;
    }

    public static final void b(java.lang.String str) {
        sj1.b bVar;
        if (!f408372b || (bVar = (sj1.b) f408373c.get(str)) == null) {
            return;
        }
        bVar.flush();
    }

    public static final sj1.b c(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Luggage.LuggageTracer", "get instanceId:" + str);
        return (sj1.b) f408373c.get(str);
    }

    public static final void d(java.lang.String str, boolean z17) {
        int i17 = z17 ? 0 : f408371a;
        if (i17 != -1) {
            f408372b = true;
        }
        com.tencent.mars.xlog.Log.i("Luggage.LuggageTracer", "init instanceId:" + str);
        if (str == null) {
            com.tencent.mars.xlog.Log.w("Luggage.LuggageTracer", "init fail, instanceId is null, stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        } else if (f408374d == null || com.tencent.mm.vfs.w6.j(com.tencent.luggage.sdk.jsapi.component.service.h2.f47439a.c(com.tencent.luggage.sdk.jsapi.component.service.z1.f47567a))) {
            java.util.HashMap hashMap = f408373c;
            ((sj1.k) f408375e).getClass();
            hashMap.put(str, i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? sj1.g.f408366a : new com.tencent.mm.plugin.appbrand.qc() : sj1.j.f408370a : sj1.i.f408368b : new sj1.h());
        } else {
            com.tencent.mars.xlog.Log.w("Luggage.LuggageTracer", "init fail, dynamicSo and so not ready, stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            f408372b = false;
        }
    }

    public static final void e(java.lang.String str, java.lang.String category, java.lang.String name) {
        sj1.b bVar;
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
        if (!f408372b || (bVar = (sj1.b) f408373c.get(str)) == null) {
            return;
        }
        bVar.c(category, name);
    }

    public static final int f(java.lang.String str, java.lang.String category, java.lang.String name) {
        sj1.b bVar;
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
        if (!f408372b || (bVar = (sj1.b) f408373c.get(str)) == null) {
            return -1;
        }
        return bVar.k(category, name);
    }

    public static final void g(java.lang.String str) {
        sj1.b bVar;
        if (!f408372b || (bVar = (sj1.b) f408373c.get(str)) == null) {
            return;
        }
        bVar.g();
    }

    public static final void h(java.lang.String str, int i17) {
        sj1.b bVar;
        if (!f408372b || (bVar = (sj1.b) f408373c.get(str)) == null) {
            return;
        }
        bVar.j(i17);
    }

    public static final void i(java.lang.String str, java.lang.String category, java.lang.String name) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
        if (f408372b) {
            java.util.HashMap hashMap = f408373c;
            sj1.b bVar = (sj1.b) hashMap.get(str);
            if (bVar != null) {
                bVar.c(category, name);
            }
            sj1.b bVar2 = (sj1.b) hashMap.get(str);
            if (bVar2 != null) {
                bVar2.g();
            }
        }
    }

    public static final sj1.b j(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Luggage.LuggageTracer", "unInit instanceId:" + str);
        if (str != null) {
            return (sj1.b) f408373c.remove(str);
        }
        com.tencent.mars.xlog.Log.w("Luggage.LuggageTracer", "unInit fail, instanceId is null, stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        return null;
    }
}
