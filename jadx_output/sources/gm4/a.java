package gm4;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final gm4.a f273557a;

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.o4 f273558b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f273559c;

    static {
        gm4.a aVar = new gm4.a();
        f273557a = aVar;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            boolean a17 = gm0.j1.a();
            java.lang.String d17 = aVar.d();
            if (f273558b == null) {
                f273558b = com.tencent.mm.sdk.platformtools.o4.M(d17);
                f273559c = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TingLocalStorage", "initMMKV %s, key: %s, mmkv: %s, cost: %s", java.lang.Boolean.valueOf(a17), d17, f273558b, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingLocalStorage", e17, "checkInitMMKV exception", new java.lang.Object[0]);
            f273559c = false;
        }
    }

    public final boolean a(java.lang.String key, boolean z17) {
        kotlin.jvm.internal.o.g(key, "key");
        if (f273559c) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = f273558b;
            return o4Var != null ? o4Var.getBoolean(key, z17) : z17;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.TingLocalStorage", "not init");
        return z17;
    }

    public final byte[] b(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        if (!f273559c) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingLocalStorage", "not init");
            return null;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = f273558b;
        if (o4Var != null) {
            return o4Var.j(key);
        }
        return null;
    }

    public final int c(java.lang.String key, int i17) {
        kotlin.jvm.internal.o.g(key, "key");
        if (f273559c) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = f273558b;
            return o4Var != null ? o4Var.getInt(key, i17) : i17;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.TingLocalStorage", "not init");
        return i17;
    }

    public final java.lang.String d() {
        if (!gm0.j1.a()) {
            return "_ting_local_storage_mmkv";
        }
        return c01.z1.r() + "_ting_local_storage_mmkv";
    }

    public final java.lang.String e(java.lang.String key, java.lang.String str) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(key, "key");
        if (f273559c) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = f273558b;
            return (o4Var == null || (string = o4Var.getString(key, str)) == null) ? str : string;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.TingLocalStorage", "not init");
        return str;
    }

    public final void f(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.sdk.platformtools.o4 o4Var = f273558b;
        if (o4Var != null) {
            o4Var.remove(key);
        }
    }

    public final void g(java.lang.String key, boolean z17) {
        kotlin.jvm.internal.o.g(key, "key");
        if (!f273559c) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingLocalStorage", "not init");
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = f273558b;
        if (o4Var != null) {
            o4Var.putBoolean(key, z17);
        }
    }

    public final void h(java.lang.String key, byte[] bArr) {
        kotlin.jvm.internal.o.g(key, "key");
        if (!f273559c) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingLocalStorage", "not init");
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = f273558b;
        if (o4Var != null) {
            o4Var.H(key, bArr);
        }
    }

    public final void i(java.lang.String key, int i17) {
        kotlin.jvm.internal.o.g(key, "key");
        if (!f273559c) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingLocalStorage", "not init");
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = f273558b;
        if (o4Var != null) {
            o4Var.putInt(key, i17);
        }
    }

    public final void j(java.lang.String key, java.lang.String str) {
        kotlin.jvm.internal.o.g(key, "key");
        if (!f273559c) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingLocalStorage", "not init");
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = f273558b;
        if (o4Var != null) {
            o4Var.putString(key, str);
        }
    }
}
