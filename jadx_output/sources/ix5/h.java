package ix5;

/* loaded from: classes16.dex */
public final class h implements hx5.c {

    /* renamed from: b, reason: collision with root package name */
    public static final ix5.h f295631b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f295632c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile android.content.Context f295633d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile java.io.File f295634e;

    /* renamed from: f, reason: collision with root package name */
    public static java.io.File f295635f;

    /* renamed from: g, reason: collision with root package name */
    public static java.io.File f295636g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile com.tencent.shadow.dynamic.host.DynamicPluginManager f295637h;

    /* renamed from: i, reason: collision with root package name */
    public static ix5.u f295638i;

    /* renamed from: j, reason: collision with root package name */
    public static final ix5.u f295639j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile ix5.s f295640k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.Map f295641l;

    static {
        ix5.u uVar;
        ix5.h hVar = new ix5.h();
        f295631b = hVar;
        f295632c = jz5.h.b(ix5.l.f295653d);
        synchronized (hVar) {
            if (f295638i == null) {
                f295638i = new ix5.u();
            }
            uVar = f295638i;
        }
        kotlin.jvm.internal.o.d(uVar);
        f295639j = uVar;
        f295640k = ix5.s.f295671d;
        f295641l = new java.util.LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ix5.h r6, java.util.Map r7, kotlin.coroutines.Continuation r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof ix5.o
            if (r0 == 0) goto L16
            r0 = r8
            ix5.o r0 = (ix5.o) r0
            int r1 = r0.f295663f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f295663f = r1
            goto L1b
        L16:
            ix5.o r0 = new ix5.o
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f295661d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f295663f
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r8 = "pkgPath"
            java.lang.Object r8 = r7.get(r8)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.o.e(r8, r2)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r4 = "pluginManagerMd5"
            java.lang.Object r4 = r7.get(r4)
            kotlin.jvm.internal.o.e(r4, r2)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "pluginLoaderMd5"
            java.lang.Object r7 = r7.get(r5)
            kotlin.jvm.internal.o.e(r7, r2)
            java.lang.String r7 = (java.lang.String) r7
            r0.f295663f = r3
            java.lang.Object r8 = r6.b(r8, r4, r7, r0)
            if (r8 != r1) goto L61
            goto L98
        L61:
            hx5.d r8 = (hx5.d) r8
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.o.g(r8, r6)
            jz5.l r6 = new jz5.l
            java.lang.String r7 = "appId"
            java.lang.String r0 = r8.f285707a
            r6.<init>(r7, r0)
            jz5.l r7 = new jz5.l
            java.lang.String r0 = "UUID"
            java.lang.String r1 = r8.f285708b
            r7.<init>(r0, r1)
            int r0 = r8.f285709c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            jz5.l r1 = new jz5.l
            java.lang.String r2 = "versionCode"
            r1.<init>(r2, r0)
            jz5.l r0 = new jz5.l
            java.lang.String r2 = "versionName"
            java.lang.String r8 = r8.f285710d
            r0.<init>(r2, r8)
            jz5.l[] r6 = new jz5.l[]{r6, r7, r1, r0}
            java.util.Map r1 = kz5.c1.k(r6)
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ix5.h.a(ix5.h, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, java.lang.String r10, java.lang.String r11, kotlin.coroutines.Continuation r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof ix5.i
            if (r0 == 0) goto L13
            r0 = r12
            ix5.i r0 = (ix5.i) r0
            int r1 = r0.f295646g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f295646g = r1
            goto L18
        L13:
            ix5.i r0 = new ix5.i
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f295644e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f295646g
            r3 = 0
            ix5.u r4 = ix5.h.f295639j
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L43
            if (r2 == r6) goto L39
            if (r2 == r5) goto L31
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            java.lang.Object r9 = r0.f295643d
            java.lang.Exception r9 = (java.lang.Exception) r9
            kotlin.ResultKt.throwOnFailure(r12)
            goto L73
        L39:
            java.lang.Object r9 = r0.f295643d
            ix5.h r9 = (ix5.h) r9
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Exception -> L41
            goto L57
        L41:
            r10 = move-exception
            goto L5a
        L43:
            kotlin.ResultKt.throwOnFailure(r12)
            ix5.j r12 = new ix5.j     // Catch: java.lang.Exception -> L5e
            r12.<init>(r9, r10, r11, r3)     // Catch: java.lang.Exception -> L5e
            r0.f295643d = r8     // Catch: java.lang.Exception -> L5e
            r0.f295646g = r6     // Catch: java.lang.Exception -> L5e
            java.lang.Object r12 = kotlinx.coroutines.l.g(r4, r12, r0)     // Catch: java.lang.Exception -> L5e
            if (r12 != r1) goto L56
            return r1
        L56:
            r9 = r8
        L57:
            hx5.d r12 = (hx5.d) r12     // Catch: java.lang.Exception -> L41
            return r12
        L5a:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L60
        L5e:
            r9 = move-exception
            r10 = r8
        L60:
            r0.f295643d = r9
            r0.f295646g = r5
            r10.getClass()
            ix5.k r10 = new ix5.k
            r10.<init>(r3)
            java.lang.Object r10 = kotlinx.coroutines.l.g(r4, r10, r0)
            if (r10 != r1) goto L73
            return r1
        L73:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ix5.h.b(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.tencent.shadow.core.common.Logger c() {
        java.lang.Object value = ((jz5.n) f295632c).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.shadow.core.common.Logger) value;
    }

    public java.util.Map d() {
        final kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kz5.q0 q0Var = kz5.q0.f314001d;
        h0Var.f310123d = q0Var;
        com.tencent.shadow.dynamic.host.DynamicPluginManager dynamicPluginManager = f295637h;
        if (dynamicPluginManager != null) {
            android.content.Context context = f295633d;
            kotlin.jvm.internal.o.d(context);
            dynamicPluginManager.process(context, "getQualityInfo", q0Var, new com.tencent.shadow.dynamic.host.EnterCallback() { // from class: ix5.h$$a
                @Override // com.tencent.shadow.dynamic.host.EnterCallback
                public final void onComplete(com.tencent.shadow.dynamic.host.ErrorInfo errorInfo, java.lang.Object obj) {
                    kotlin.jvm.internal.h0 infoMap = kotlin.jvm.internal.h0.this;
                    kotlin.jvm.internal.o.g(infoMap, "$infoMap");
                    if (obj == null || !(obj instanceof java.util.Map)) {
                        return;
                    }
                    infoMap.f310123d = (java.util.Map) obj;
                }
            });
        }
        return (java.util.Map) h0Var.f310123d;
    }

    public boolean e() {
        com.tencent.shadow.dynamic.host.DynamicPluginManager dynamicPluginManager = f295637h;
        if (dynamicPluginManager != null && dynamicPluginManager.isValid()) {
            return f295640k == ix5.s.f295673f;
        }
        f295640k = ix5.s.f295671d;
        return false;
    }

    public void f(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        f295633d = context.getApplicationContext();
        if (f295634e == null) {
            f295634e = new java.io.File(context.getFilesDir(), com.tencent.shadow.core.common.HostConstants.FRAMEWORK_APPID);
        }
        if (com.tencent.shadow.core.common.LoggerFactory.getILoggerFactory() == null) {
            com.tencent.shadow.core.common.LoggerFactory.setILoggerFactory(ix5.b.f295625b);
        }
    }

    public java.lang.Object g(java.lang.String str, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(f295639j, new ix5.n(str, map, null), continuation);
    }

    public java.lang.Object h(java.lang.String str, com.tencent.shadow.core.common.AppEventListener appEventListener, kotlin.coroutines.Continuation continuation) {
        java.lang.Object g17 = f295631b.g("setAppEventListener", kz5.c1.k(new jz5.l("appId", str), new jz5.l(com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, appEventListener)), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    public final void i(java.lang.String str, java.lang.Object obj) {
        c().info("setDelegate(" + str + ", " + obj + ')');
        f295641l.put(str, obj);
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, f295639j, null, new ix5.p(str, obj, null), 2, null);
    }

    public final void j(java.io.File file, java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String name = file.getName();
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                } else {
                    messageDigest.update(bArr, 0, read);
                }
            }
            vz5.b.a(fileInputStream, null);
            byte[] digest = messageDigest.digest();
            kotlin.jvm.internal.o.f(digest, "digest(...)");
            java.lang.String a07 = kz5.z.a0(digest, "", null, null, 0, null, ix5.r.f295670d, 30, null);
            if (r26.i0.p(a07, str, true)) {
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                c().info("[boot] md5 ok for " + name + ": " + a07 + ", cost " + currentTimeMillis2 + "ms");
                return;
            }
            c().error("[boot] md5 mismatch for " + name + ", expectedMd5=" + str + ", actualMd5=" + a07);
            com.tencent.shadow.dynamic.host.ErrorInfo errorInfo = hx5.e.f285711a;
            throw new com.tencent.wva.hostsdk.WVAException(hx5.e.f285716f, name + " md5 mismatch, expectedMd5=" + str + ", actualMd5=" + a07);
        } finally {
        }
    }
}
