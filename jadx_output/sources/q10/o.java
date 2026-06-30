package q10;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.s7 f359527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.d5 f359528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f359529f;

    public o(bw5.s7 s7Var, bw5.d5 d5Var, int i17) {
        this.f359527d = s7Var;
        this.f359528e = d5Var;
        this.f359529f = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r0 == null) goto L20;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
            bw5.s7 r1 = r5.f359527d
            if (r1 == 0) goto La
            java.lang.String r2 = r1.b()
            goto Lb
        La:
            r2 = r0
        Lb:
            java.lang.String r3 = "routeName"
            if (r1 == 0) goto L3c
            java.lang.String r1 = r1.c()
            if (r1 == 0) goto L3c
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L25
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L25
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r4.optString(r3)     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = kotlin.Result.m521constructorimpl(r1)     // Catch: java.lang.Throwable -> L25
            goto L30
        L25:
            r1 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m521constructorimpl(r1)
        L30:
            boolean r4 = kotlin.Result.m527isFailureimpl(r1)
            if (r4 == 0) goto L37
            goto L38
        L37:
            r0 = r1
        L38:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L3e
        L3c:
            java.lang.String r0 = ""
        L3e:
            jz5.l r1 = new jz5.l
            java.lang.String r4 = "bizName"
            r1.<init>(r4, r2)
            jz5.l r2 = new jz5.l
            r2.<init>(r3, r0)
            jz5.l[] r0 = new jz5.l[]{r1, r2}
            java.util.Map r0 = kz5.c1.k(r0)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            r1 = 0
            java.lang.String r2 = ";"
            java.lang.String r3 = ","
            java.lang.String r0 = r26.i0.t(r0, r2, r3, r1)
            y02.w0 r1 = y02.x0.f458634d
            y02.v0 r1 = r1.a()
            if (r1 == 0) goto L79
            bw5.d5 r2 = r5.f359528e
            int r3 = r5.f359529f
            r1.p1(r2, r3, r0)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q10.o.run():void");
    }
}
