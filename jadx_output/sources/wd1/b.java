package wd1;

/* loaded from: classes7.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd1.a f444790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f444791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f444792g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f444793h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f444794i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f444795m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f444796n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f444797o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f444798p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f444799q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ wd1.c f444800r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(wd1.a aVar, int i17, int i18, int i19, int i27, int i28, int i29, long j17, com.tencent.mm.plugin.appbrand.y yVar, int i37, wd1.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444790e = aVar;
        this.f444791f = i17;
        this.f444792g = i18;
        this.f444793h = i19;
        this.f444794i = i27;
        this.f444795m = i28;
        this.f444796n = i29;
        this.f444797o = j17;
        this.f444798p = yVar;
        this.f444799q = i37;
        this.f444800r = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wd1.b(this.f444790e, this.f444791f, this.f444792g, this.f444793h, this.f444794i, this.f444795m, this.f444796n, this.f444797o, this.f444798p, this.f444799q, this.f444800r, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wd1.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r14.f444789d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 != r3) goto Le
            kotlin.ResultKt.throwOnFailure(r15)
            goto L38
        Le:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L16:
            kotlin.ResultKt.throwOnFailure(r15)
            wd1.a r15 = r14.f444790e
            if (r15 == 0) goto L3b
            int r5 = r14.f444791f
            int r6 = r14.f444792g
            int r7 = r14.f444793h
            int r8 = r14.f444794i
            int r9 = r14.f444795m
            int r10 = r14.f444796n
            long r11 = r14.f444797o
            r14.f444789d = r3
            r4 = r15
            wd1.k r4 = (wd1.k) r4
            r13 = r14
            java.lang.Object r15 = r4.b(r5, r6, r7, r8, r9, r10, r11, r13)
            if (r15 != r0) goto L38
            return r0
        L38:
            android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15
            goto L3c
        L3b:
            r15 = r2
        L3c:
            jz5.f0 r0 = jz5.f0.f302826a
            wd1.c r1 = r14.f444800r
            int r3 = r14.f444799q
            com.tencent.mm.plugin.appbrand.y r4 = r14.f444798p
            java.lang.String r5 = "Luggage.JsApiOperateSnapshotWebView"
            if (r15 != 0) goto L7f
            java.lang.String r15 = "takeSnapshot fail, bitmap is null"
            com.tencent.mars.xlog.Log.w(r5, r15)
            r1.getClass()
            boolean r15 = android.text.TextUtils.isEmpty(r2)
            if (r15 == 0) goto L59
            java.lang.String r2 = "fail:internal error"
        L59:
            if (r2 != 0) goto L5d
            java.lang.String r2 = ""
        L5d:
            java.lang.String r15 = com.tencent.mm.sdk.platformtools.z.f193105a
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            java.lang.String r5 = "errno"
            r6 = 4
            r15.put(r5, r6)     // Catch: java.lang.Exception -> L6b
            goto L77
        L6b:
            r5 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "MicroMsg.AppBrandJsApi"
            java.lang.String r7 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.tencent.mars.xlog.Log.e(r6, r7, r5)
        L77:
            java.lang.String r15 = r1.u(r2, r15)
            r4.a(r3, r15)
            return r0
        L7f:
            int r2 = r15.getByteCount()
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            r6 = 0
            r2.position(r6)
            r15.copyPixelsToBuffer(r2)
            r2.position(r6)
            gf.l0 r6 = gf.l0.f271115a
            r6.c(r15)
            int r6 = r15.getWidth()
            int r7 = r15.getHeight()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "takeSnapshot ok, bitmap is width: "
            r8.<init>(r9)
            int r9 = r15.getWidth()
            r8.append(r9)
            java.lang.String r9 = ", height:"
            r8.append(r9)
            int r15 = r15.getHeight()
            r8.append(r15)
            java.lang.String r15 = r8.toString()
            com.tencent.mars.xlog.Log.i(r5, r15)
            jc1.d r15 = jc1.f.f298912a
            jz5.l r5 = new jz5.l
            java.lang.String r8 = "data"
            r5.<init>(r8, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            jz5.l r6 = new jz5.l
            java.lang.String r8 = "width"
            r6.<init>(r8, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            jz5.l r7 = new jz5.l
            java.lang.String r8 = "height"
            r7.<init>(r8, r2)
            jz5.l[] r2 = new jz5.l[]{r5, r6, r7}
            java.util.Map r2 = kz5.c1.k(r2)
            java.lang.String r15 = r1.x(r4, r15, r2)
            r4.a(r3, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wd1.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
