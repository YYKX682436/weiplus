package fs1;

/* loaded from: classes7.dex */
public final class g implements jh0.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mu4.h0 f266283a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f266284b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266285c;

    public g(mu4.h0 h0Var, yz5.p pVar, java.lang.String str) {
        this.f266283a = h0Var;
        this.f266284b = pVar;
        this.f266285c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (z65.c.a() != false) goto L12;
     */
    @Override // jh0.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = r10.f266285c
            yz5.p r1 = r10.f266284b
            java.lang.Class<jh0.t> r2 = jh0.t.class
            i95.m r2 = i95.n0.c(r2)
            jh0.t r2 = (jh0.t) r2
            jh0.q r2 = (jh0.q) r2
            r2.getClass()
            vz4.x r2 = vz4.h.f441735b
            r3 = 0
            r2.g(r3)
            r2 = 1
            if (r11 == 0) goto L23
            int r4 = r11.length()
            if (r4 != 0) goto L21
            goto L23
        L21:
            r4 = r3
            goto L24
        L23:
            r4 = r2
        L24:
            if (r4 != 0) goto L2e
            java.lang.String r4 = com.tencent.mm.sdk.platformtools.z.f193105a
            boolean r4 = z65.c.a()
            if (r4 == 0) goto L53
        L2e:
            java.lang.String r11 = "brandService"
            com.tencent.mm.sdk.platformtools.o4 r11 = com.tencent.mm.sdk.platformtools.o4.R(r11)
            java.lang.String r4 = "GameCenterJsPath"
            java.lang.String r11 = r11.t(r4)
            if (r11 != 0) goto L3e
            java.lang.String r11 = ""
        L3e:
            int r4 = r11.length()
            if (r4 <= 0) goto L45
            goto L46
        L45:
            r2 = r3
        L46:
            if (r2 == 0) goto L4d
            java.lang.String r11 = com.tencent.mm.vfs.w6.M(r11)
            goto L53
        L4d:
            java.lang.String r11 = "gamecenter_jscore.js"
            java.lang.String r11 = ik1.f.e(r11)
        L53:
            fs1.f r2 = new fs1.f     // Catch: java.lang.Exception -> L62
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L62
            com.tencent.mm.plugin.appbrand.jsruntime.r r4 = fs1.j.f266292e     // Catch: java.lang.Exception -> L62
            if (r4 == 0) goto L9d
            com.tencent.mm.plugin.appbrand.jsruntime.n r4 = (com.tencent.mm.plugin.appbrand.jsruntime.n) r4     // Catch: java.lang.Exception -> L62
            r4.evaluateJavascript(r11, r2)     // Catch: java.lang.Exception -> L62
            goto L9d
        L62:
            r11 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = "MicroMsg.GamePrefetchJsCoreAdapter"
            java.lang.String r4 = "[game-web-prefetch] inject gamecenter_jscore.js excpetion"
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r11, r4, r2)
            mu4.c0 r2 = new mu4.c0
            r2.<init>()
            mu4.h0 r3 = r10.f266283a
            r3.a(r2)
            java.lang.String r2 = fs1.j.f266294g
            java.lang.String r3 = fs1.j.f266295h
            java.lang.String r4 = r11.getMessage()
            if (r4 == 0) goto L8c
            r5 = 44
            r6 = 46
            r7 = 0
            r8 = 4
            r9 = 0
            java.lang.String r11 = r26.i0.u(r4, r5, r6, r7, r8, r9)
            goto L8d
        L8c:
            r11 = 0
        L8d:
            jx3.f r4 = jx3.f.INSTANCE
            r5 = 20821(0x5155, float:2.9176E-41)
            java.lang.Object[] r11 = new java.lang.Object[]{r2, r3, r11}
            r4.d(r5, r11)
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r1.invoke(r11, r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fs1.g.a(java.lang.String):void");
    }
}
