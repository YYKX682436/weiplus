package ws1;

/* loaded from: classes7.dex */
public final class e implements hw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f448988a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xs1.d f448989b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xs1.b f448990c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f448992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448993f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448994g;

    public e(xs1.d dVar, xs1.b bVar, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3) {
        this.f448989b = dVar;
        this.f448990c = bVar;
        this.f448991d = str;
        this.f448992e = j17;
        this.f448993f = str2;
        this.f448994g = str3;
    }

    @Override // hw4.a
    public int a(com.tencent.mm.network.j2 connection, com.tencent.mars.cdn.CronetLogic.ResponseHeader responseHeader, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(connection, "connection");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherHttpDownloader", "downloadUrl onCronetReceiveHeader statusCode: " + i17 + ", session: " + this.f448992e);
        java.util.HashMap hashMap = this.f448988a;
        if ((i17 == 200 || i17 == 304 || i17 == 301 || i17 == 302) && hashMap.isEmpty()) {
            e(connection, i17, hashMap);
        }
        xs1.b bVar = this.f448990c;
        if (bVar.a(connection, i17, hashMap)) {
            return 0;
        }
        bVar.b(connection, new xs1.e(this.f448994g, false, hashMap));
        return -99;
    }

    @Override // hw4.a
    public void b(com.tencent.mm.network.j2 connection, java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
        kotlin.jvm.internal.o.g(connection, "connection");
    }

    @Override // hw4.a
    public void c(com.tencent.mm.network.j2 connection, java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        kotlin.jvm.internal.o.g(connection, "connection");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadUrl onCronetTaskCompleted statusCode: %s, session: %s, fileSize:");
        java.lang.String str3 = this.f448991d;
        sb6.append(com.tencent.mm.vfs.w6.k(str3));
        java.lang.String sb7 = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = cronetTaskResult != null ? java.lang.Integer.valueOf(cronetTaskResult.statusCode) : null;
        objArr[1] = java.lang.Long.valueOf(this.f448992e);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherHttpDownloader", sb7, objArr);
        xs1.b bVar = this.f448990c;
        java.lang.String str4 = this.f448994g;
        java.lang.String str5 = this.f448993f;
        java.util.HashMap hashMap = this.f448988a;
        if (cronetTaskResult != null) {
            int i17 = cronetTaskResult.statusCode;
            if (i17 != 200) {
                if (i17 == 301 || i17 == 302) {
                    if (hashMap.isEmpty()) {
                        e(connection, cronetTaskResult.statusCode, hashMap);
                    }
                    bVar.a(connection, cronetTaskResult.statusCode, hashMap);
                }
            } else if (com.tencent.mm.vfs.w6.x(str3, str5, true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherHttpDownloader", "downloadUrl save file success:" + str4 + " to " + str5 + " fileSize:" + com.tencent.mm.vfs.w6.k(str5));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebPrefetcherHttpDownloader", "downloadUrl save file failed:" + str4 + " to " + str3);
            }
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str3);
        if (r6Var.m()) {
            r6Var.l();
        }
        boolean j17 = com.tencent.mm.vfs.w6.j(str5);
        xs1.e eVar = new xs1.e(str4, j17, hashMap);
        if (j17) {
            if (!(str5 == null || str5.length() == 0)) {
                eVar.f456303c = new com.tencent.mm.vfs.r6(str5);
            }
        }
        bVar.b(connection, eVar);
    }

    @Override // hw4.a
    public void d(com.tencent.mm.network.j2 connection) {
        kotlin.jvm.internal.o.g(connection, "connection");
        xs1.d dVar = this.f448989b;
        if (dVar.f456297b.m()) {
            if (!r26.n0.N(dVar.f456300e)) {
                connection.h("x-wx-if-none-match", dVar.f456300e);
            }
            if (!r26.n0.N(dVar.f456299d)) {
                connection.h("if-none-match", dVar.f456299d);
            }
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String a17 = hy4.w.f286200f.a();
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 t2Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94445a;
        connection.h("User-Agent", ik1.l0.a(context, a17, (hy4.w) ((jz5.n) com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94449e).getValue()));
        connection.f72040f = 10000;
        connection.f72039e = 3000;
        this.f448990c.c(connection);
    }

    public final void e(com.tencent.mm.network.j2 j2Var, int i17, java.util.HashMap hashMap) {
        synchronized (j2Var) {
            java.util.Map map = j2Var.f72052r;
            kotlin.jvm.internal.o.f(map, "getHeaderFields(...)");
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.util.List list = (java.util.List) entry.getValue();
                if (!kotlin.jvm.internal.o.b(str, "status")) {
                    kotlin.jvm.internal.o.d(str);
                    java.util.Locale locale = java.util.Locale.getDefault();
                    kotlin.jvm.internal.o.f(locale, "getDefault(...)");
                    java.lang.String lowerCase = str.toLowerCase(locale);
                    kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                    kotlin.jvm.internal.o.d(list);
                    hashMap.put(lowerCase, list);
                }
            }
            if (i17 == 304) {
                hashMap.put("status", kz5.b0.c("200"));
            } else {
                hashMap.put("status", kz5.b0.c(java.lang.String.valueOf(i17)));
            }
        }
    }
}
