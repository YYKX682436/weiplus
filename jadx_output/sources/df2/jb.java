package df2;

/* loaded from: classes.dex */
public final class jb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230458d;

    /* renamed from: e, reason: collision with root package name */
    public int f230459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230460f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f230461g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.n72 f230462h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f230463i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230464m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ df2.zb f230465n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(java.lang.String str, long j17, r45.n72 n72Var, int i17, java.lang.String str2, df2.zb zbVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230460f = str;
        this.f230461g = j17;
        this.f230462h = n72Var;
        this.f230463i = i17;
        this.f230464m = str2;
        this.f230465n = zbVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.jb(this.f230460f, this.f230461g, this.f230462h, this.f230463i, this.f230464m, this.f230465n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.jb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f230459e
            df2.zb r2 = r12.f230465n
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L30
            if (r1 == r6) goto L2c
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r12.f230458d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r13)
            goto Ldb
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            java.lang.Object r1 = r12.f230458d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r13)
            goto Lbf
        L2c:
            kotlin.ResultKt.throwOnFailure(r13)
            goto La0
        L30:
            kotlin.ResultKt.throwOnFailure(r13)
            r45.l72 r13 = new r45.l72
            r13.<init>()
            db2.t4 r1 = db2.t4.f228171a
            r7 = 16416(0x4020, float:2.3004E-41)
            r45.kv0 r1 = r1.a(r7)
            r13.set(r6, r1)
            r1 = 4
            java.lang.String r7 = r12.f230460f
            r13.set(r1, r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = c01.z1.r()
            r1.append(r7)
            r7 = 95
            r1.append(r7)
            long r8 = r12.f230461g
            r1.append(r8)
            r1.append(r7)
            long r10 = java.lang.System.currentTimeMillis()
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r13.set(r3, r1)
            r45.n72 r1 = r12.f230462h
            int r1 = r1.f381129d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.set(r4, r1)
            r1 = 5
            java.lang.Long r7 = java.lang.Long.valueOf(r8)
            r13.set(r1, r7)
            r1 = 6
            int r7 = r12.f230463i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13.set(r1, r7)
            r1 = 7
            java.lang.String r7 = r12.f230464m
            r13.set(r1, r7)
            com.tencent.mm.modelbase.i r13 = r13.d()
            r12.f230459e = r6
            java.lang.Object r13 = xg2.g.d(r13, r5, r12, r6, r5)
            if (r13 != r0) goto La0
            return r0
        La0:
            r1 = r13
            xg2.h r1 = (xg2.h) r1
            boolean r13 = r1 instanceof xg2.i
            if (r13 == 0) goto Lbf
            oz5.l r13 = r1.f454392a
            if (r13 != 0) goto Laf
            oz5.l r13 = r12.getContext()
        Laf:
            df2.ib r6 = new df2.ib
            r6.<init>(r1, r5, r2)
            r12.f230458d = r1
            r12.f230459e = r4
            java.lang.Object r13 = kotlinx.coroutines.l.g(r13, r6, r12)
            if (r13 != r0) goto Lbf
            return r0
        Lbf:
            boolean r13 = r1 instanceof xg2.b
            if (r13 == 0) goto Ldb
            oz5.l r13 = r1.f454392a
            if (r13 != 0) goto Lcb
            oz5.l r13 = r12.getContext()
        Lcb:
            df2.hb r4 = new df2.hb
            r4.<init>(r1, r5, r2)
            r12.f230458d = r1
            r12.f230459e = r3
            java.lang.Object r13 = kotlinx.coroutines.l.g(r13, r4, r12)
            if (r13 != r0) goto Ldb
            return r0
        Ldb:
            jz5.f0 r13 = jz5.f0.f302826a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.jb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
