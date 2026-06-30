package pn4;

/* loaded from: classes14.dex */
public final class e1 implements y21.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f357082a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f357083b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f357084c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f357085d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f357086e;

    /* renamed from: f, reason: collision with root package name */
    public pn4.u0 f357087f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f357088g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f357089h;

    /* renamed from: i, reason: collision with root package name */
    public final pn4.t0 f357090i;

    /* renamed from: j, reason: collision with root package name */
    public int f357091j;

    /* renamed from: k, reason: collision with root package name */
    public int f357092k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f357093l;

    public e1(long j17, java.lang.String transText, java.lang.String fileBasePath, kotlinx.coroutines.y0 scope) {
        kotlin.jvm.internal.o.g(transText, "transText");
        kotlin.jvm.internal.o.g(fileBasePath, "fileBasePath");
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f357082a = j17;
        this.f357083b = transText;
        this.f357084c = fileBasePath;
        this.f357085d = scope;
        this.f357086e = "MicroMsg.TextTransToVoiceStream-" + j17;
        this.f357087f = pn4.u0.f357229d;
        this.f357088g = new java.util.ArrayList();
        this.f357090i = new pn4.t0();
        this.f357093l = new java.util.ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f4, code lost:
    
        if (r1 == pz5.a.f359186d) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x011b -> B:12:0x011e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0125 -> B:13:0x012e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(pn4.e1 r20, r45.ih6 r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.e1.c(pn4.e1, r45.ih6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(pn4.e1 r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof pn4.d1
            if (r0 == 0) goto L16
            r0 = r6
            pn4.d1 r0 = (pn4.d1) r0
            int r1 = r0.f357074g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f357074g = r1
            goto L1b
        L16:
            pn4.d1 r0 = new pn4.d1
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f357072e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f357074g
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f357071d
            pn4.e1 r5 = (pn4.e1) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L75
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.ResultKt.throwOnFailure(r6)
            r45.hh6 r6 = new r45.hh6
            r6.<init>()
            r2 = 0
            java.lang.String r4 = r5.f357083b
            r6.set(r2, r4)
            com.tencent.mm.modelbase.l r2 = new com.tencent.mm.modelbase.l
            r2.<init>()
            r4 = 11791(0x2e0f, float:1.6523E-41)
            r2.f70667d = r4
            java.lang.String r4 = "/cgi-bin/micromsg-bin/submit_asynctts"
            r2.f70666c = r4
            r2.f70664a = r6
            r6 = 5000(0x1388, float:7.006E-42)
            r2.f70672i = r6
            r45.ih6 r6 = new r45.ih6
            r6.<init>()
            r2.f70665b = r6
            com.tencent.mm.modelbase.o r6 = r2.a()
            com.tencent.mm.modelbase.i r2 = new com.tencent.mm.modelbase.i
            r2.<init>()
            r2.p(r6)
            r0.f357071d = r5
            r0.f357074g = r3
            java.lang.Object r6 = rm0.h.b(r2, r0)
            if (r6 != r1) goto L75
            goto Lb5
        L75:
            com.tencent.mm.modelbase.f r6 = (com.tencent.mm.modelbase.f) r6
            boolean r0 = r6.b()
            r1 = 0
            if (r0 != 0) goto La7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "submit error err type: "
            r0.<init>(r2)
            int r2 = r6.f70615a
            r0.append(r2)
            java.lang.String r2 = " code: "
            r0.append(r2)
            int r2 = r6.f70616b
            r0.append(r2)
            java.lang.String r2 = " msg: "
            r0.append(r2)
            java.lang.String r6 = r6.f70617c
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.i(r6)
            goto Lb5
        La7:
            com.tencent.mm.protobuf.f r6 = r6.f70618d
            r45.ih6 r6 = (r45.ih6) r6
            if (r6 != 0) goto Lb4
            java.lang.String r6 = "submit resp is null"
            r5.i(r6)
            goto Lb5
        Lb4:
            r1 = r6
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.e1.d(pn4.e1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(pn4.e1 r5, int r6, com.tencent.mm.protobuf.g r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.e1.j(pn4.e1, int, com.tencent.mm.protobuf.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x006a, code lost:
    
        if ((((long) ((java.lang.Number) r2.f302841d).intValue()) <= r10) != false) goto L23;
     */
    @Override // y21.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float a(long r10) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.e1.a(long):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // y21.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(byte[] r8, int r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof pn4.v0
            if (r0 == 0) goto L13
            r0 = r10
            pn4.v0 r0 = (pn4.v0) r0
            int r1 = r0.f357238g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f357238g = r1
            goto L18
        L13:
            pn4.v0 r0 = new pn4.v0
            r0.<init>(r7, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.f357236e
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f357238g
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r8 = r6.f357235d
            pn4.e1 r8 = (pn4.e1) r8
            kotlin.ResultKt.throwOnFailure(r10)
            goto L62
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            kotlin.ResultKt.throwOnFailure(r10)
            pn4.u0 r10 = r7.f357087f
            int r10 = r10.ordinal()
            if (r10 == 0) goto L4f
            if (r10 == r2) goto L4f
            r1 = 2
            if (r10 == r1) goto L4f
            r8 = 3
            if (r10 != r8) goto L49
            r8 = 0
            goto L6e
        L49:
            jz5.j r8 = new jz5.j
            r8.<init>()
            throw r8
        L4f:
            pn4.t0 r1 = r7.f357090i
            int r3 = r7.f357091j
            r5 = 1
            r6.f357235d = r7
            r6.f357238g = r2
            r2 = r8
            r4 = r9
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L61
            return r0
        L61:
            r8 = r7
        L62:
            java.lang.Number r10 = (java.lang.Number) r10
            int r9 = r10.intValue()
            int r10 = r8.f357091j
            int r10 = r10 + r9
            r8.f357091j = r10
            r8 = r9
        L6e:
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.e1.b(byte[], int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // y21.b
    public void close() {
        java.lang.String str = this.f357086e;
        com.tencent.mars.xlog.Log.i(str, "close");
        if (this.f357087f != pn4.u0.f357230e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set state from ");
            sb6.append(this.f357087f);
            sb6.append(" to ");
            pn4.u0 u0Var = pn4.u0.f357232g;
            sb6.append(u0Var);
            com.tencent.mars.xlog.Log.w(str, sb6.toString());
            h(u0Var);
        }
        this.f357089h = null;
        this.f357090i.b();
    }

    public final java.lang.String e() {
        return this.f357084c + "/stream/" + this.f357082a + ".ext";
    }

    public final java.lang.String f() {
        return this.f357084c + "/stream/" + this.f357082a;
    }

    public final java.lang.String g() {
        return this.f357084c + "/stream/" + this.f357082a + ".tmp";
    }

    public final void h(pn4.u0 u0Var) {
        yz5.l lVar;
        com.tencent.mars.xlog.Log.i(this.f357086e, "current state trans from " + this.f357087f + " to " + u0Var);
        if (u0Var != this.f357087f && (lVar = this.f357089h) != null) {
            lVar.invoke(u0Var);
        }
        this.f357087f = u0Var;
    }

    public final void i(java.lang.String str) {
        h(pn4.u0.f357232g);
        com.tencent.mm.vfs.w6.h(f());
        com.tencent.mm.vfs.w6.h(g());
        com.tencent.mars.xlog.Log.e(this.f357086e, "trans error cause " + str);
    }
}
