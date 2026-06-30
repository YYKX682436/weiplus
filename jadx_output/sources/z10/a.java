package z10;

/* loaded from: classes9.dex */
public final class a extends y10.a {

    /* renamed from: c, reason: collision with root package name */
    public final y02.o f469262c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
        int i17 = y02.p.f458625d;
        this.f469262c = (y02.o) urgen.ur_E2DE.UR_B83C.UR_21C5(180000L);
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        com.tencent.mm.protobuf.g b17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.content.Context c17 = context.c();
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("ECS_O.NativeHandler.openArticle", "open article failed, context.context is null");
            callback.c("context.context is null");
            return;
        }
        try {
            bw5.v7 g17 = jumpInfo.g();
            jz5.f0 f0Var = null;
            if (g17 != null && (b17 = g17.b()) != null) {
                bw5.z5 parseFrom = new bw5.z5().parseFrom(b17.g());
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("open article: ");
                sb6.append(parseFrom.f35829r[9] ? parseFrom.f35826o : "");
                sb6.append(", url: ");
                sb6.append(parseFrom.getUrl());
                com.tencent.mars.xlog.Log.i("ECS_O.NativeHandler.openArticle", sb6.toString());
                z20.e eVar = z20.e.f469543e;
                z20.b bVar = new z20.b();
                bVar.f469537a = eVar;
                bw5.q9 q9Var = new bw5.q9();
                q9Var.f31999d = "ecso_open";
                q9Var.f32013u[1] = true;
                q9Var.c(java.lang.System.currentTimeMillis());
                q9Var.b(2);
                bVar.f469538b = q9Var;
                bVar.f(java.lang.String.valueOf(context.f357555e));
                bVar.c("open_article");
                bVar.e(kz5.b1.e(new jz5.l("url", parseFrom.getUrl())));
                bVar.a();
                ((zv.a) ((zq1.b0) i95.n0.c(zq1.b0.class))).wi(parseFrom, context.d(), c17);
                callback.d(null);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("ECS_O.NativeHandler.openArticle", "open article failed, nativeInfo.params is null");
                callback.c("nativeInfo.params is null");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ECS_O.NativeHandler.openArticle", e17, "open article failed", new java.lang.Object[0]);
            callback.c("open article failed");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:3:0x0012, B:5:0x0019, B:7:0x001f, B:9:0x0030, B:13:0x0048, B:16:0x004c, B:19:0x0069), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:3:0x0012, B:5:0x0019, B:7:0x001f, B:9:0x0030, B:13:0x0048, B:16:0x004c, B:19:0x0069), top: B:2:0x0012 }] */
    @Override // y10.a, t10.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(pq.a r6, bw5.x7 r7, bw5.l8 r8, t10.d r9) {
        /*
            r5 = this;
            java.lang.String r8 = "ECS_O.NativeHandler.openArticle"
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r6 = "jumpInfo"
            kotlin.jvm.internal.o.g(r7, r6)
            java.lang.String r6 = "callback"
            kotlin.jvm.internal.o.g(r9, r6)
            r6 = 0
            bw5.v7 r7 = r7.g()     // Catch: java.lang.Exception -> L74
            r0 = 0
            if (r7 == 0) goto L67
            com.tencent.mm.protobuf.g r7 = r7.b()     // Catch: java.lang.Exception -> L74
            if (r7 == 0) goto L67
            bw5.z5 r1 = new bw5.z5     // Catch: java.lang.Exception -> L74
            r1.<init>()     // Catch: java.lang.Exception -> L74
            byte[] r7 = r7.g()     // Catch: java.lang.Exception -> L74
            bw5.z5 r7 = r1.parseFrom(r7)     // Catch: java.lang.Exception -> L74
            y02.o r1 = r5.f469262c     // Catch: java.lang.Exception -> L74
            if (r1 == 0) goto L45
            kotlin.jvm.internal.o.d(r7)     // Catch: java.lang.Exception -> L74
            java.lang.String r2 = s10.b.a(r7)     // Catch: java.lang.Exception -> L74
            y02.p r1 = (y02.p) r1     // Catch: java.lang.Exception -> L74
            long r3 = r1.getCppPointer()     // Catch: java.lang.Exception -> L74
            boolean r1 = urgen.ur_E2DE.UR_B83C.UR_B590(r3, r2)     // Catch: java.lang.Exception -> L74
            r2 = 1
            if (r1 != r2) goto L45
            goto L46
        L45:
            r2 = r6
        L46:
            if (r2 != 0) goto L4c
            r9.d(r0)     // Catch: java.lang.Exception -> L74
            return
        L4c:
            java.lang.Class<zq1.a0> r1 = zq1.a0.class
            lm0.a r1 = gm0.j1.s(r1)     // Catch: java.lang.Exception -> L74
            zq1.a0 r1 = (zq1.a0) r1     // Catch: java.lang.Exception -> L74
            java.lang.String r2 = r7.getUrl()     // Catch: java.lang.Exception -> L74
            int r7 = r7.f35823i     // Catch: java.lang.Exception -> L74
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L74
            yq1.z r1 = (yq1.z) r1     // Catch: java.lang.Exception -> L74
            r4 = 2
            r1.d(r2, r7, r4, r3)     // Catch: java.lang.Exception -> L74
            r9.d(r0)     // Catch: java.lang.Exception -> L74
            jz5.f0 r0 = jz5.f0.f302826a     // Catch: java.lang.Exception -> L74
        L67:
            if (r0 != 0) goto L7f
            java.lang.String r7 = "preload article failed, nativeInfo.params is null"
            com.tencent.mars.xlog.Log.e(r8, r7)     // Catch: java.lang.Exception -> L74
            java.lang.String r7 = "nativeInfo.params is null"
            r9.c(r7)     // Catch: java.lang.Exception -> L74
            goto L7f
        L74:
            r7 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r0 = "preload article failed"
            com.tencent.mars.xlog.Log.printErrStackTrace(r8, r7, r0, r6)
            r9.c(r0)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z10.a.c(pq.a, bw5.x7, bw5.l8, t10.d):void");
    }
}
