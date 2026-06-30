package j33;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final j33.p f297451a = new j33.p();

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r26.n0.B(r6, "video", true) == true) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l a(java.lang.String r10) {
        /*
            r9 = this;
            com.tencent.mm.vfs.z7 r0 = com.tencent.mm.vfs.z7.a(r10)
            r1 = 0
            java.lang.String r2 = r0.f213279f
            if (r2 == 0) goto L22
            java.lang.String r6 = com.tencent.mm.vfs.e8.l(r2, r1, r1)
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L22
            com.tencent.mm.vfs.z7 r2 = new com.tencent.mm.vfs.z7
            java.lang.String r4 = r0.f213277d
            java.lang.String r5 = r0.f213278e
            java.lang.String r7 = r0.f213280g
            java.lang.String r8 = r0.f213281h
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = r2
        L22:
            com.tencent.mm.vfs.b3 r2 = com.tencent.mm.vfs.a3.f212781a
            r3 = 0
            com.tencent.mm.vfs.z2 r0 = r2.m(r0, r3)
            boolean r2 = r0.a()
            if (r2 != 0) goto L31
            r0 = r1
            goto L49
        L31:
            com.tencent.mm.vfs.q2 r2 = r0.f213266a
            java.lang.String r0 = r0.f213267b
            java.lang.String r4 = r2.D(r0, r1)
            if (r4 == 0) goto L45
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r0 = r0.canRead()
            goto L49
        L45:
            boolean r0 = r2.F(r0)
        L49:
            if (r0 == 0) goto Lb5
            gp.c r0 = new gp.c
            r0.<init>()
            r0.k(r10)     // Catch: java.lang.Exception -> La9
            int r10 = r0.d()
            r2 = r1
        L58:
            java.lang.String r4 = "mime"
            if (r2 >= r10) goto L82
            android.media.MediaFormat r5 = r0.e(r2)
            java.lang.String r6 = "getTrackFormat(...)"
            kotlin.jvm.internal.o.f(r5, r6)
            boolean r6 = r5.containsKey(r4)
            if (r6 == 0) goto L7f
            java.lang.String r6 = r5.getString(r4)
            if (r6 == 0) goto L7b
            java.lang.String r7 = "video"
            r8 = 1
            boolean r6 = r26.n0.B(r6, r7, r8)
            if (r6 != r8) goto L7b
            goto L7c
        L7b:
            r8 = r1
        L7c:
            if (r8 == 0) goto L7f
            goto L83
        L7f:
            int r2 = r2 + 1
            goto L58
        L82:
            r5 = r3
        L83:
            r10 = -1
            if (r5 == 0) goto L9c
            java.lang.String r1 = "profile"
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L92
            int r10 = r5.getInteger(r1)
        L92:
            boolean r1 = r5.containsKey(r4)
            if (r1 == 0) goto L9c
            java.lang.String r3 = r5.getString(r4)
        L9c:
            r0.g()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            jz5.l r0 = new jz5.l
            r0.<init>(r3, r10)
            return r0
        La9:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unable to set source "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        Lb5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unable to read "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j33.p.a(java.lang.String):jz5.l");
    }

    public final boolean b(java.lang.String path) {
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(path, "path");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(a(path));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        jz5.l lVar = new jz5.l(null, -1);
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = lVar;
        }
        jz5.l lVar2 = (jz5.l) m521constructorimpl;
        boolean p17 = r26.i0.p("video/hevc", (java.lang.String) lVar2.f302833d, true);
        java.lang.Object obj = lVar2.f302834e;
        return p17 ? ((java.lang.Number) obj).intValue() == 1 : (r26.i0.p("video/avc", (java.lang.String) lVar2.f302833d, true) && ((java.lang.Number) obj).intValue() == 16) ? false : true;
    }
}
