package com.tencent.mm.plugin.magicbrush;

@j95.b
/* loaded from: classes.dex */
public final class g7 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public ye3.o f148008d;

    /* renamed from: f, reason: collision with root package name */
    public volatile d95.b0 f148010f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f148011g;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f148009e = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f148012h = new java.lang.Object();

    public final void Ai() {
        try {
            wi();
            d95.b0 b0Var = new d95.b0();
            java.lang.String str = gm0.j1.u().h() + "MBExternalVideoInfo.db";
            java.util.HashMap i17 = kz5.c1.i(new jz5.l(-2064292300, com.tencent.mm.plugin.magicbrush.f7.f147938a));
            if (b0Var.S(str, i17, true, true)) {
                this.f148010f = b0Var;
                this.f148011g = true;
                com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[doResetDatabase] database initialized successfully");
                return;
            }
            com.tencent.mars.xlog.Log.w("MB_External_surface_DB", "[doResetDatabase] first initialization failed, retry with initializer");
            d95.b0 a17 = ye3.j.f461221a.a(str, i17, true, true);
            if (a17 == null) {
                wi();
                this.f148011g = false;
                com.tencent.mars.xlog.Log.w("MB_External_surface_DB", "[doResetDatabase] retry initialization failed");
            } else {
                this.f148010f = a17;
                this.f148011g = true;
                com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[doResetDatabase] database initialized via retry");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MB_External_surface_DB", "[doResetDatabase] initialization failed", e17);
            wi();
            this.f148011g = false;
        }
    }

    public final ye3.o Bi() {
        gm0.j1.b().c();
        ye3.o oVar = this.f148008d;
        if (oVar != null) {
            return oVar;
        }
        synchronized (this.f148009e) {
            ye3.o oVar2 = this.f148008d;
            if (oVar2 != null) {
                return oVar2;
            }
            requireAccountInitialized();
            if (!this.f148011g) {
                Di();
            }
            d95.b0 b0Var = this.f148010f;
            if (b0Var == null) {
                return null;
            }
            ye3.o oVar3 = new ye3.o(b0Var);
            this.f148008d = oVar3;
            com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[getMediaCacheStorage] create new storage instance");
            return oVar3;
        }
    }

    public final void Di() {
        if (this.f148010f == null || !this.f148011g) {
            synchronized (this.f148012h) {
                if (this.f148010f != null && this.f148011g) {
                    com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[initializeDatabase] database already initialized");
                    return;
                }
                if (!gm0.j1.a()) {
                    com.tencent.mars.xlog.Log.w("MB_External_surface_DB", "[initializeDatabase] account not ready, skip initialization");
                    return;
                }
                com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[initializeDatabase] start initialization");
                Ai();
                com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[initializeDatabase] initialization completed, ready=" + this.f148011g);
            }
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[onAccountInitialized] start");
        Di();
        com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[onAccountInitialized] completed");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[onAccountReleased] start");
        synchronized (this.f148009e) {
            this.f148008d = null;
        }
        synchronized (this.f148012h) {
            com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[closeDb] start closing database");
            wi();
            com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[closeDb] database closed, ready=" + this.f148011g);
        }
        com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[onAccountReleased] completed");
    }

    public final void wi() {
        try {
            try {
                d95.b0 b0Var = this.f148010f;
                if (b0Var != null) {
                    b0Var.L();
                }
                com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "[closeDatabaseQuietly] database closed");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MB_External_surface_DB", "[closeDatabaseQuietly] close failed", e17);
            }
        } finally {
            this.f148010f = null;
            this.f148011g = false;
        }
    }
}
