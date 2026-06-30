package im1;

/* loaded from: classes15.dex */
public final class i implements yf.h {

    /* renamed from: b, reason: collision with root package name */
    public final yf.i f292196b;

    public i(yf.t weEffectManager) {
        yf.i h1Var;
        kotlin.jvm.internal.o.g(weEffectManager, "weEffectManager");
        if (weEffectManager instanceof im1.y) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MakeupApplyAdapter", "weEffectManager is IWeEffectWorkaroundManager");
            h1Var = ((im1.i) ((im1.y) weEffectManager).f292239d).f292196b;
        } else {
            h1Var = new yf.h1(weEffectManager);
        }
        this.f292196b = h1Var;
    }

    @Override // yf.i
    public void b(yf.r type, java.lang.String path) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(path, "path");
        this.f292196b.b(type, path);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    @Override // yf.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(yf.c r10) {
        /*
            r9 = this;
            java.lang.String r0 = "info"
            kotlin.jvm.internal.o.g(r10, r0)
            im1.j r0 = im1.j.f292197b
            r0.getClass()
            com.tencent.mm.vfs.r6 r1 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.r6 r2 = r0.a()
            java.lang.String r3 = r0.c(r10)
            r1.<init>(r2, r3)
            boolean r2 = r1.m()
            r3 = 1
            r4 = 0
            java.lang.String r5 = "MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic"
            r6 = 0
            if (r2 != 0) goto L33
            java.lang.String r2 = r1.o()
            boolean r2 = com.tencent.mm.vfs.w6.u(r2)
            if (r2 != 0) goto L33
            java.lang.String r10 = "convert2PathImpl, create resDir fail"
            com.tencent.mars.xlog.Log.w(r5, r10)
            goto Lcd
        L33:
            im1.d r2 = new im1.d
            r2.<init>()
            float r7 = r10.f461314a
            r2.f292173a = r7
            int r7 = r10.f461315b
            r2.f292174b = r7
            yf.b r7 = r10.f461316c
            int r7 = r7.f461307d
            r2.f292175c = r7
            com.tencent.mm.vfs.r6 r7 = new com.tencent.mm.vfs.r6
            java.lang.String r10 = r10.f461317d
            r7.<init>(r10)
            com.tencent.mm.vfs.r6 r10 = r0.b(r1, r7)
            if (r10 == 0) goto L58
            java.lang.String r10 = r10.getName()
            goto L59
        L58:
            r10 = r6
        L59:
            java.lang.String r0 = ""
            if (r10 != 0) goto L5e
            r10 = r0
        L5e:
            r2.f292176d = r10
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r8 = r2.f292173a
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L6a
            r7 = r3
            goto L6b
        L6a:
            r7 = r4
        L6b:
            if (r7 != 0) goto L7f
            r7 = -1
            int r8 = r2.f292175c
            if (r7 == r8) goto L7f
            int r10 = r10.length()
            if (r10 <= 0) goto L7a
            r10 = r3
            goto L7b
        L7a:
            r10 = r4
        L7b:
            if (r10 == 0) goto L7f
            r10 = r3
            goto L80
        L7f:
            r10 = r4
        L80:
            if (r10 != 0) goto L8f
            java.lang.String r10 = "convert2PathImpl, flattenInfo is invalid"
            com.tencent.mars.xlog.Log.w(r5, r10)
            java.lang.String r10 = r1.o()
            com.tencent.mm.vfs.w6.f(r10)
            goto Lcd
        L8f:
            com.tencent.mm.vfs.r6 r10 = new com.tencent.mm.vfs.r6
            java.lang.String r5 = "config.json"
            r10.<init>(r1, r5)
            java.lang.String r10 = r10.o()
            java.lang.String r5 = "getAbsolutePath(...)"
            kotlin.jvm.internal.o.f(r10, r5)
            org.json.JSONObject r2 = r2.b()     // Catch: java.lang.Exception -> Lbd
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lbd
            java.lang.String r5 = "toString(...)"
            kotlin.jvm.internal.o.f(r2, r5)     // Catch: java.lang.Exception -> Lbd
            java.nio.charset.Charset r5 = r26.c.f368865a     // Catch: java.lang.Exception -> Lbd
            byte[] r2 = r2.getBytes(r5)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r5 = "getBytes(...)"
            kotlin.jvm.internal.o.f(r2, r5)     // Catch: java.lang.Exception -> Lbd
            int r5 = r2.length     // Catch: java.lang.Exception -> Lbd
            com.tencent.mm.vfs.w6.S(r10, r2, r4, r5)     // Catch: java.lang.Exception -> Lbd
            goto Lc5
        Lbd:
            r10 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r5 = "MicroMsg.BaseJsonObject"
            com.tencent.mars.xlog.Log.printErrStackTrace(r5, r10, r0, r2)
        Lc5:
            java.lang.String r10 = r1.o()
            java.lang.String r6 = com.tencent.mm.vfs.w6.i(r10, r4)
        Lcd:
            if (r6 == 0) goto Ld7
            yf.r r10 = yf.r.MAKEUP_BLUSHER_STICK
            yf.i r0 = r9.f292196b
            r0.b(r10, r6)
            goto Ld8
        Ld7:
            r3 = r4
        Ld8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: im1.i.c(yf.c):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    @Override // yf.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(yf.f r10) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im1.i.f(yf.f):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    @Override // yf.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(yf.g r10) {
        /*
            r9 = this;
            java.lang.String r0 = "info"
            kotlin.jvm.internal.o.g(r10, r0)
            im1.j r0 = im1.j.f292197b
            r0.getClass()
            com.tencent.mm.vfs.r6 r1 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.r6 r2 = r0.a()
            java.lang.String r3 = r0.c(r10)
            r1.<init>(r2, r3)
            boolean r2 = r1.m()
            r3 = 1
            r4 = 0
            java.lang.String r5 = "MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic"
            r6 = 0
            if (r2 != 0) goto L33
            java.lang.String r2 = r1.o()
            boolean r2 = com.tencent.mm.vfs.w6.u(r2)
            if (r2 != 0) goto L33
            java.lang.String r10 = "convert2PathImpl, create resDir fail"
            com.tencent.mars.xlog.Log.w(r5, r10)
            goto Lc2
        L33:
            im1.g r2 = new im1.g
            r2.<init>()
            int r7 = r10.f461350a
            r2.f292186a = r7
            float r7 = r10.f461351b
            r2.f292187b = r7
            com.tencent.mm.vfs.r6 r7 = new com.tencent.mm.vfs.r6
            java.lang.String r10 = r10.f461352c
            r7.<init>(r10)
            com.tencent.mm.vfs.r6 r10 = r0.b(r1, r7)
            if (r10 == 0) goto L52
            java.lang.String r10 = r10.getName()
            goto L53
        L52:
            r10 = r6
        L53:
            java.lang.String r0 = ""
            if (r10 != 0) goto L58
            r10 = r0
        L58:
            r2.f292188c = r10
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r8 = r2.f292187b
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L64
            r7 = r3
            goto L65
        L64:
            r7 = r4
        L65:
            if (r7 != 0) goto L74
            int r10 = r10.length()
            if (r10 <= 0) goto L6f
            r10 = r3
            goto L70
        L6f:
            r10 = r4
        L70:
            if (r10 == 0) goto L74
            r10 = r3
            goto L75
        L74:
            r10 = r4
        L75:
            if (r10 != 0) goto L84
            java.lang.String r10 = "convert2PathImpl, flattenInfo is invalid"
            com.tencent.mars.xlog.Log.w(r5, r10)
            java.lang.String r10 = r1.o()
            com.tencent.mm.vfs.w6.f(r10)
            goto Lc2
        L84:
            com.tencent.mm.vfs.r6 r10 = new com.tencent.mm.vfs.r6
            java.lang.String r5 = "config.json"
            r10.<init>(r1, r5)
            java.lang.String r10 = r10.o()
            java.lang.String r5 = "getAbsolutePath(...)"
            kotlin.jvm.internal.o.f(r10, r5)
            org.json.JSONObject r2 = r2.b()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lb2
            java.lang.String r5 = "toString(...)"
            kotlin.jvm.internal.o.f(r2, r5)     // Catch: java.lang.Exception -> Lb2
            java.nio.charset.Charset r5 = r26.c.f368865a     // Catch: java.lang.Exception -> Lb2
            byte[] r2 = r2.getBytes(r5)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r5 = "getBytes(...)"
            kotlin.jvm.internal.o.f(r2, r5)     // Catch: java.lang.Exception -> Lb2
            int r5 = r2.length     // Catch: java.lang.Exception -> Lb2
            com.tencent.mm.vfs.w6.S(r10, r2, r4, r5)     // Catch: java.lang.Exception -> Lb2
            goto Lba
        Lb2:
            r10 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r5 = "MicroMsg.BaseJsonObject"
            com.tencent.mars.xlog.Log.printErrStackTrace(r5, r10, r0, r2)
        Lba:
            java.lang.String r10 = r1.o()
            java.lang.String r6 = com.tencent.mm.vfs.w6.i(r10, r4)
        Lc2:
            if (r6 == 0) goto Lcc
            yf.r r10 = yf.r.MAKEUP_FACE_CONTOUR
            yf.i r0 = r9.f292196b
            r0.b(r10, r6)
            goto Lcd
        Lcc:
            r3 = r4
        Lcd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: im1.i.g(yf.g):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c8  */
    @Override // yf.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(yf.c0 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "info"
            kotlin.jvm.internal.o.g(r8, r0)
            im1.j r0 = im1.j.f292197b
            r0.getClass()
            com.tencent.mm.vfs.r6 r1 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.r6 r2 = r0.a()
            java.lang.String r0 = r0.c(r8)
            r1.<init>(r2, r0)
            boolean r0 = r1.m()
            r2 = 1
            r3 = 0
            java.lang.String r4 = "MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic"
            if (r0 != 0) goto L31
            java.lang.String r0 = r1.o()
            boolean r0 = com.tencent.mm.vfs.w6.u(r0)
            if (r0 != 0) goto L31
            java.lang.String r8 = "convert2PathImpl, create resDir fail"
            com.tencent.mars.xlog.Log.w(r4, r8)
            goto L84
        L31:
            im1.h r0 = new im1.h
            r0.<init>()
            float r5 = r8.f461319a
            r0.f292189a = r5
            yf.y r5 = r8.f461320b
            int r6 = r5.f461471a
            r0.f292190b = r6
            int r6 = r5.f461472b
            r0.f292191c = r6
            int r5 = r5.f461473c
            r0.f292192d = r5
            yf.a0 r5 = r8.f461321c
            int r5 = r5.f461293d
            r0.f292193e = r5
            int r5 = r8.f461322d
            r0.f292194f = r5
            yf.b0 r8 = r8.f461323e
            r8.getClass()
            r0.f292195g = r3
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r0.f292189a
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L63
            r8 = r2
            goto L64
        L63:
            r8 = r3
        L64:
            if (r8 != 0) goto L75
            int r8 = r0.f292190b
            r5 = -1
            if (r5 == r8) goto L75
            int r8 = r0.f292191c
            if (r5 == r8) goto L75
            int r8 = r0.f292192d
            if (r5 == r8) goto L75
            r8 = r2
            goto L76
        L75:
            r8 = r3
        L76:
            if (r8 != 0) goto L86
            java.lang.String r8 = "convert2PathImpl, flattenInfo is invalid"
            com.tencent.mars.xlog.Log.w(r4, r8)
            java.lang.String r8 = r1.o()
            com.tencent.mm.vfs.w6.f(r8)
        L84:
            r8 = 0
            goto Lc6
        L86:
            com.tencent.mm.vfs.r6 r8 = new com.tencent.mm.vfs.r6
            java.lang.String r4 = "config.json"
            r8.<init>(r1, r4)
            java.lang.String r8 = r8.o()
            java.lang.String r4 = "getAbsolutePath(...)"
            kotlin.jvm.internal.o.f(r8, r4)
            org.json.JSONObject r0 = r0.b()     // Catch: java.lang.Exception -> Lb4
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Lb4
            java.lang.String r4 = "toString(...)"
            kotlin.jvm.internal.o.f(r0, r4)     // Catch: java.lang.Exception -> Lb4
            java.nio.charset.Charset r4 = r26.c.f368865a     // Catch: java.lang.Exception -> Lb4
            byte[] r0 = r0.getBytes(r4)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r4 = "getBytes(...)"
            kotlin.jvm.internal.o.f(r0, r4)     // Catch: java.lang.Exception -> Lb4
            int r4 = r0.length     // Catch: java.lang.Exception -> Lb4
            com.tencent.mm.vfs.w6.S(r8, r0, r3, r4)     // Catch: java.lang.Exception -> Lb4
            goto Lbe
        Lb4:
            r8 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r4 = "MicroMsg.BaseJsonObject"
            java.lang.String r5 = ""
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r8, r5, r0)
        Lbe:
            java.lang.String r8 = r1.o()
            java.lang.String r8 = com.tencent.mm.vfs.w6.i(r8, r3)
        Lc6:
            if (r8 == 0) goto Ld0
            yf.r r0 = yf.r.MAKEUP_LIP_STICK
            yf.i r1 = r7.f292196b
            r1.b(r0, r8)
            goto Ld1
        Ld0:
            r2 = r3
        Ld1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: im1.i.h(yf.c0):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    @Override // yf.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i(yf.d r11) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im1.i.i(yf.d):boolean");
    }
}
