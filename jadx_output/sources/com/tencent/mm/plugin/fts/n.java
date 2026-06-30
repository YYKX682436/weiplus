package com.tencent.mm.plugin.fts;

/* loaded from: classes8.dex */
public class n implements t13.g {

    /* renamed from: k, reason: collision with root package name */
    public static int f137766k = 32;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f137767a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Vector f137768b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f137769c = true;

    /* renamed from: d, reason: collision with root package name */
    public int f137770d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f137771e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3[] f137772f = new com.tencent.mm.sdk.platformtools.n3[2];

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f137773g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f137774h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f137775i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Set f137776j;

    public n() {
        this.f137773g = null;
        this.f137774h = null;
        this.f137775i = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSImageLoader", "create SearchImageLoader");
        if (fp.h.c(19)) {
            f137766k = 64;
        } else {
            f137766k = 32;
        }
        this.f137767a = new java.util.concurrent.ConcurrentHashMap();
        this.f137768b = new java.util.Vector();
        this.f137773g = new java.util.concurrent.ConcurrentHashMap();
        this.f137774h = new java.util.concurrent.ConcurrentHashMap();
        this.f137776j = java.util.Collections.synchronizedSet(new java.util.HashSet());
        for (int i17 = 0; i17 < 2; i17++) {
            com.tencent.mm.sdk.platformtools.n3[] n3VarArr = this.f137772f;
            if (n3VarArr[i17] == null) {
                n3VarArr[i17] = new com.tencent.mm.sdk.platformtools.n3("SearchImageLoader_loadImage_handler");
            }
        }
        this.f137775i = new com.tencent.mm.sdk.platformtools.n3("SearchImageLoader_saveImage_handler");
    }

    public static void a(com.tencent.mm.plugin.fts.n nVar, java.lang.String str, java.lang.String str2, android.graphics.Bitmap bitmap) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = nVar.f137767a;
        if (concurrentHashMap.size() > f137766k) {
            nVar.f((java.lang.String) nVar.f137768b.lastElement());
        }
        com.tencent.mm.plugin.fts.j jVar = new com.tencent.mm.plugin.fts.j(nVar);
        jVar.f137420a = str2;
        jVar.f137421b = bitmap;
        concurrentHashMap.put(str, jVar);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(jVar.f137420a);
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            return;
        }
        nVar.f137775i.postDelayed(new com.tencent.mm.plugin.fts.m(nVar, jVar), 200L);
    }

    public void b() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f137767a;
        concurrentHashMap.size();
        h();
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            f((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
        }
        this.f137768b.clear();
        this.f137776j.clear();
    }

    public void c() {
        b();
        for (int i17 = 0; i17 < 2; i17++) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f137772f[i17];
            if (n3Var != null) {
                n3Var.quit();
            }
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f137773g;
        java.util.Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            try {
                ((java.io.ByteArrayOutputStream) it.next()).close();
            } catch (java.io.IOException unused) {
            }
        }
        concurrentHashMap.clear();
        this.f137774h.clear();
        this.f137775i.quit();
    }

    public java.lang.String d(java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "null";
        }
        sb6.append(str);
        if (str2 == null) {
            str2 = "null";
        }
        sb6.append(str2);
        sb6.append(z17);
        sb6.append(i17);
        sb6.append("_");
        sb6.append(i18);
        return "fts_search_" + kk.k.g(sb6.toString().getBytes());
    }

    public final android.graphics.Bitmap e(java.lang.String str) {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.fts.j jVar = (com.tencent.mm.plugin.fts.j) this.f137767a.get(str);
        if (jVar != null && (bitmap = jVar.f137421b) != null && !bitmap.isRecycled()) {
            java.util.Vector vector = this.f137768b;
            vector.remove(str);
            vector.add(0, str);
        }
        if (jVar == null) {
            return null;
        }
        return jVar.f137421b;
    }

    public final void f(java.lang.String str) {
        android.graphics.Bitmap bitmap;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f137767a;
        com.tencent.mm.plugin.fts.j jVar = (com.tencent.mm.plugin.fts.j) concurrentHashMap.get(str);
        this.f137768b.remove(str);
        concurrentHashMap.remove(str);
        if (jVar == null || (bitmap = jVar.f137421b) == null) {
            return;
        }
        if (!bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSImageLoader", "bitmap recycle %s", jVar.f137421b);
            jVar.f137421b.recycle();
        }
        jVar.f137421b = null;
    }

    public void g() {
        this.f137769c = false;
        h();
    }

    public void h() {
        for (int i17 = 0; i17 < 2; i17++) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f137772f[i17];
            if (n3Var != null) {
                n3Var.removeCallbacksAndMessages(null);
            }
        }
    }
}
