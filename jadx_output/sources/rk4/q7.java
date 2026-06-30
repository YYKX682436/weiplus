package rk4;

/* loaded from: classes11.dex */
public final class q7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f396939d;

    /* renamed from: e, reason: collision with root package name */
    public int f396940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f396941f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f396942g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396943h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(rk4.k8 k8Var, byte[] bArr, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396941f = k8Var;
        this.f396942g = bArr;
        this.f396943h = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.q7(this.f396941f, this.f396942g, this.f396943h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.q7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a3 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r11 = r15
            pz5.a r12 = pz5.a.f359186d
            int r0 = r11.f396940e
            r8 = 3
            r6 = 2
            jz5.f0 r13 = jz5.f0.f302826a
            r7 = 1
            if (r0 == 0) goto L2e
            if (r0 == r7) goto L28
            if (r0 == r6) goto L1f
            if (r0 != r8) goto L17
            kotlin.ResultKt.throwOnFailure(r16)
            goto La3
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1f:
            java.lang.Object r0 = r11.f396939d
            pi0.l1 r0 = (pi0.l1) r0
            kotlin.ResultKt.throwOnFailure(r16)
            r1 = r0
            goto L85
        L28:
            kotlin.ResultKt.throwOnFailure(r16)
            r0 = r16
            goto L4c
        L2e:
            kotlin.ResultKt.throwOnFailure(r16)
            rk4.u6 r0 = rk4.k8.f396788r
            rk4.k8 r0 = r11.f396941f
            boolean r0 = r0.v()
            if (r0 != 0) goto L3c
            return r13
        L3c:
            rk4.k8 r0 = r11.f396941f
            r1 = 0
            r2 = 0
            r4 = 3
            r5 = 0
            r11.f396940e = r7
            r3 = r15
            java.lang.Object r0 = rk4.k8.m(r0, r1, r2, r3, r4, r5)
            if (r0 != r12) goto L4c
            return r12
        L4c:
            r9 = r0
            pi0.l1 r9 = (pi0.l1) r9
            jz5.l r0 = new jz5.l
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r7)
            java.lang.String r2 = "inAudio"
            r0.<init>(r2, r1)
            jz5.l r1 = new jz5.l
            java.lang.String r2 = "finderSleepModeJumpInfo"
            byte[] r3 = r11.f396942g
            r1.<init>(r2, r3)
            jz5.l[] r0 = new jz5.l[]{r0, r1}
            java.util.Map r3 = kz5.c1.l(r0)
            rk4.k8 r0 = r11.f396941f
            java.lang.String r2 = "only_refresh"
            r4 = 0
            r7 = 4
            r10 = 0
            r11.f396939d = r9
            r11.f396940e = r6
            r1 = r9
            r5 = r15
            r6 = r7
            r7 = r10
            java.lang.Object r0 = rk4.k8.K(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r12) goto L84
            return r12
        L84:
            r1 = r9
        L85:
            rk4.k8 r0 = r11.f396941f
            android.content.Context r2 = r11.f396943h
            rk4.u6 r3 = rk4.k8.f396788r
            r3 = 0
            boolean r3 = r0.G(r3)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 60
            r10 = 0
            r14 = 0
            r11.f396939d = r14
            r11.f396940e = r8
            r8 = r15
            rk4.k8.P(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r13 != r12) goto La3
            return r12
        La3:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.q7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
