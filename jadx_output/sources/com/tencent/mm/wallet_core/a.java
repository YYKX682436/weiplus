package com.tencent.mm.wallet_core;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f213791a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.SparseArray f213792b = new android.util.SparseArray();

    public static void a(android.app.Activity activity) {
        com.tencent.mm.wallet_core.h g17 = g(activity);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = activity;
        objArr[1] = g17 == null ? "" : g17.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "backProcess to1 context: %s procname %s", objArr);
        if (g17 != null) {
            g17.c(activity, 0);
        }
    }

    public static void b(android.app.Activity activity, int i17) {
        if (activity == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ProcessManager", "hy: back context is null");
        }
        com.tencent.mm.wallet_core.h g17 = g(activity);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = activity;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = g17 == null ? "" : g17.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "backProcess to1 context: %s errCode %s procname %s ", objArr);
        if (g17 != null) {
            g17.c(activity, i17);
        } else {
            if (activity.isFinishing()) {
                return;
            }
            activity.finish();
        }
    }

    public static void c(android.app.Activity activity, android.os.Bundle bundle, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "endProcess with errCode : " + i17);
        if (activity == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ProcessManager", "hy: end context is null");
        }
        if (bundle != null) {
            bundle.putInt("key_process_err_code", i17);
        }
        com.tencent.mm.wallet_core.h g17 = g(activity);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = activity;
        objArr[1] = bundle == null ? "" : bundle.toString();
        objArr[2] = g17 != null ? g17.e() : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "endProcess to1 context: %s bundle: %s procName %s", objArr);
        if (g17 != null) {
            g17.f(activity, bundle);
        } else {
            if (activity.isFinishing()) {
                return;
            }
            activity.finish();
        }
    }

    public static void d(android.app.Activity activity, android.os.Bundle bundle) {
        com.tencent.mm.wallet_core.h g17 = g(activity);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = activity;
        objArr[1] = bundle == null ? "" : bundle.toString();
        objArr[2] = g17 != null ? g17.e() : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "forwardProcess to1 context: %s bundle: %s procName %s", objArr);
        if (g17 != null) {
            g17.o(activity, 0, bundle);
        }
    }

    public static android.os.Bundle e(android.app.Activity activity) {
        com.tencent.mm.wallet_core.h g17 = g(activity);
        return g17 != null ? g17.f213801c : new android.os.Bundle();
    }

    public static java.util.List f(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.SparseArray sparseArray = f213792b;
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mm.wallet_core.h hVar = (com.tencent.mm.wallet_core.h) sparseArray.valueAt(i17);
            if (str.equals(hVar.e())) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public static com.tencent.mm.wallet_core.h g(android.app.Activity activity) {
        if (activity == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ProcessManager", "hy: ac is null");
            return null;
        }
        if (activity.getIntent() != null) {
            return (com.tencent.mm.wallet_core.h) f213792b.get(activity.getIntent().getIntExtra("process_id", 0));
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ProcessManager", "hy: get intent is null");
        return null;
    }

    public static void h(java.lang.String str, java.lang.Class cls) {
        java.util.Map map = f213791a;
        if (!((java.util.concurrent.ConcurrentHashMap) map).containsKey(str)) {
            ((java.util.concurrent.ConcurrentHashMap) map).put(str, cls);
        } else {
            throw new java.lang.IllegalArgumentException("register process fail, exist process=" + str);
        }
    }

    public static void i(int i17) {
        f213792b.remove(i17);
    }

    public static void j(android.app.Activity activity, java.lang.Class cls, android.os.Bundle bundle, com.tencent.mm.wallet_core.g gVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "startProcess to1 context:%s proc name: %s bundle %s", activity, cls.getSimpleName(), bundle == null ? "" : bundle.toString());
        try {
            if ((activity instanceof com.tencent.mm.wallet_core.ui.WalletBaseUI) && gVar != null) {
                ((com.tencent.mm.wallet_core.ui.WalletBaseUI) activity).keepProcessEnd(gVar);
            }
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            if (bundle.getLong("key_SessionId", 0L) == 0) {
                bundle.putLong("key_SessionId", java.lang.System.currentTimeMillis());
            }
            com.tencent.mm.wallet_core.h hVar = (com.tencent.mm.wallet_core.h) cls.newInstance();
            hVar.f213801c.putAll(bundle);
            hVar.f213799a = new java.lang.ref.WeakReference(gVar);
            hVar.f213800b = new java.lang.ref.WeakReference(activity);
            hVar.A(activity, bundle);
            f213792b.put(cls.hashCode(), hVar);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ProcessManager", e17, "", new java.lang.Object[0]);
        }
    }

    public static void k(android.app.Activity activity, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, com.tencent.mm.wallet_core.g gVar) {
        try {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = activity;
            objArr[1] = str2;
            objArr[2] = bundle == null ? "" : bundle.toString();
            com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "startProcess to2 context:%s proc name: %s bundle %s", objArr);
            java.lang.Class cls = (java.lang.Class) ((java.util.concurrent.ConcurrentHashMap) f213791a).get(str2);
            if (cls != null) {
                j(activity, cls, bundle, gVar);
                return;
            }
            java.lang.String format = java.lang.String.format("start process=%s fail, process not register or plugin no import", str2);
            com.tencent.mars.xlog.Log.e("MicroMsg.ProcessManager", format);
            db5.t7.makeText(activity, format, 1).show();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProcessManager", "plugin load failed : " + e17.toString());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ProcessManager", e17, "", new java.lang.Object[0]);
        }
    }
}
