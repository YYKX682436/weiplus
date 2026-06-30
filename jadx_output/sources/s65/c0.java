package s65;

/* loaded from: classes11.dex */
public class c0 implements q65.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s65.g0 f403437a;

    public c0(s65.g0 g0Var) {
        this.f403437a = g0Var;
    }

    @Override // q65.b
    public void a(int i17, int i18) {
        this.f403437a.f403458i.a(i17, i18);
    }

    @Override // q65.a
    public void b(long j17) {
        this.f403437a.f403458i.b(j17);
    }

    @Override // q65.a
    public void c(long j17) {
        this.f403437a.f403458i.c(j17);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: Exception -> 0x00da, TryCatch #0 {Exception -> 0x00da, blocks: (B:11:0x0035, B:15:0x0050, B:17:0x0054, B:19:0x005f, B:21:0x0063, B:23:0x0073, B:25:0x0086, B:27:0x008a, B:29:0x0098, B:31:0x00ab, B:33:0x003f, B:36:0x004b), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[Catch: Exception -> 0x00da, TryCatch #0 {Exception -> 0x00da, blocks: (B:11:0x0035, B:15:0x0050, B:17:0x0054, B:19:0x005f, B:21:0x0063, B:23:0x0073, B:25:0x0086, B:27:0x008a, B:29:0x0098, B:31:0x00ab, B:33:0x003f, B:36:0x004b), top: B:10:0x0035 }] */
    @Override // q65.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r7, int r8, r45.js5 r9) {
        /*
            r6 = this;
            java.lang.String r8 = "MicroMsg.NetSceneGetUpdatePackFromCDN"
            s65.g0 r0 = r6.f403437a
            if (r7 == 0) goto L2e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "scene error. netRet="
            r9.<init>(r1)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            com.tencent.mars.xlog.Log.e(r8, r9)
            r8 = -2
            if (r7 != r8) goto L21
            java.lang.String r7 = r0.d()
            com.tencent.mm.vfs.w6.h(r7)
        L21:
            int r7 = r0.f403459j
            int r7 = r7 + 1
            r0.f403459j = r7
            q65.b r7 = r0.f403458i
            r0.a(r7)
            goto Lec
        L2e:
            java.lang.String r7 = "scene success"
            com.tencent.mars.xlog.Log.i(r8, r7)
            r7 = 0
            r1 = -1
            java.lang.String r2 = r0.d()     // Catch: java.lang.Exception -> Lda
            java.lang.String r3 = r0.f192300d
            if (r2 != 0) goto L3f
        L3d:
            r2 = r7
            goto L50
        L3f:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> Lda
            r4.<init>(r2)     // Catch: java.lang.Exception -> Lda
            boolean r2 = r4.exists()     // Catch: java.lang.Exception -> Lda
            if (r2 != 0) goto L4b
            goto L3d
        L4b:
            long r4 = r4.length()     // Catch: java.lang.Exception -> Lda
            int r2 = (int) r4     // Catch: java.lang.Exception -> Lda
        L50:
            int r4 = r0.f192298b     // Catch: java.lang.Exception -> Lda
            if (r2 >= r4) goto L5f
            java.lang.String r2 = "scene continue;"
            com.tencent.mars.xlog.Log.i(r8, r2)     // Catch: java.lang.Exception -> Lda
            q65.b r2 = r0.f403458i     // Catch: java.lang.Exception -> Lda
            r0.a(r2)     // Catch: java.lang.Exception -> Lda
            return
        L5f:
            boolean r2 = r0.f403460k     // Catch: java.lang.Exception -> Lda
            if (r2 == 0) goto L8a
            java.lang.String r2 = r0.f403461l     // Catch: java.lang.Exception -> Lda
            java.lang.String r3 = r0.d()     // Catch: java.lang.Exception -> Lda
            java.lang.String r3 = s65.h0.a(r3)     // Catch: java.lang.Exception -> Lda
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> Lda
            if (r2 != 0) goto L86
            java.lang.String r2 = "pack md5 check error"
            com.tencent.mars.xlog.Log.e(r8, r2)     // Catch: java.lang.Exception -> Lda
            java.lang.String r2 = r0.d()     // Catch: java.lang.Exception -> Lda
            com.tencent.mm.vfs.w6.h(r2)     // Catch: java.lang.Exception -> Lda
            q65.b r2 = r0.f403458i     // Catch: java.lang.Exception -> Lda
            r3 = 2
            r2.d(r3, r1, r9)     // Catch: java.lang.Exception -> Lda
            return
        L86:
            s65.g0.e(r0, r9)     // Catch: java.lang.Exception -> Lda
            return
        L8a:
            java.lang.String r2 = r0.d()     // Catch: java.lang.Exception -> Lda
            java.lang.String r2 = s65.h0.a(r2)     // Catch: java.lang.Exception -> Lda
            boolean r2 = r3.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> Lda
            if (r2 != 0) goto Lab
            java.lang.String r2 = "update pack check error"
            com.tencent.mars.xlog.Log.e(r8, r2)     // Catch: java.lang.Exception -> Lda
            java.lang.String r2 = r0.d()     // Catch: java.lang.Exception -> Lda
            com.tencent.mm.vfs.w6.h(r2)     // Catch: java.lang.Exception -> Lda
            q65.b r2 = r0.f403458i     // Catch: java.lang.Exception -> Lda
            r2.d(r1, r1, r9)     // Catch: java.lang.Exception -> Lda
            return
        Lab:
            java.lang.String r2 = com.tencent.mm.sandbox.monitor.l.f192296f     // Catch: java.lang.Exception -> Lda
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lda
            r4.<init>()     // Catch: java.lang.Exception -> Lda
            r4.append(r3)     // Catch: java.lang.Exception -> Lda
            java.lang.String r5 = ".temp"
            r4.append(r5)     // Catch: java.lang.Exception -> Lda
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lda
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lda
            r5.<init>()     // Catch: java.lang.Exception -> Lda
            r5.append(r3)     // Catch: java.lang.Exception -> Lda
            java.lang.String r3 = ".apk"
            r5.append(r3)     // Catch: java.lang.Exception -> Lda
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Exception -> Lda
            s65.h0.b(r2, r4, r3)     // Catch: java.lang.Exception -> Lda
            q65.b r2 = r0.f403458i     // Catch: java.lang.Exception -> Lda
            r3 = 200(0xc8, float:2.8E-43)
            r2.d(r3, r7, r9)     // Catch: java.lang.Exception -> Lda
            goto Lec
        Lda:
            r2 = move-exception
            java.lang.String r3 = "error occured during pack processing"
            com.tencent.mars.xlog.Log.e(r8, r3)
            java.lang.String r3 = ""
            java.lang.Object[] r7 = new java.lang.Object[r7]
            com.tencent.mars.xlog.Log.printErrStackTrace(r8, r2, r3, r7)
            q65.b r7 = r0.f403458i
            r7.d(r1, r1, r9)
        Lec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s65.c0.d(int, int, r45.js5):void");
    }
}
