package kf2;

/* loaded from: classes.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f307305d;

    /* renamed from: e, reason: collision with root package name */
    public int f307306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kf2.v f307307f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f307308g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f307309h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kf2.v vVar, long j17, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f307307f = vVar;
        this.f307308g = j17;
        this.f307309h = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kf2.u(this.f307307f, this.f307308g, this.f307309h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kf2.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f307306e
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L28
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r0 = r12.f307305d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r13)
            goto La8
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            java.lang.Object r1 = r12.f307305d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r13)
            goto L83
        L28:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L5b
        L2c:
            kotlin.ResultKt.throwOnFailure(r13)
            ke2.x r13 = new ke2.x
            kf2.v r1 = r12.f307307f
            df2.k r5 = r1.f307311a
            java.lang.Class<mm2.e1> r6 = mm2.e1.class
            androidx.lifecycle.c1 r5 = r5.business(r6)
            mm2.e1 r5 = (mm2.e1) r5
            long r7 = r5.f328983m
            df2.k r1 = r1.f307311a
            androidx.lifecycle.c1 r1 = r1.business(r6)
            mm2.e1 r1 = (mm2.e1) r1
            r45.nw1 r1 = r1.f328988r
            r5 = 0
            long r5 = r1.getLong(r5)
            r13.<init>(r7, r5)
            r12.f307306e = r4
            r1 = 0
            java.lang.Object r13 = xg2.g.d(r13, r1, r12, r4, r1)
            if (r13 != r0) goto L5b
            return r0
        L5b:
            r1 = r13
            xg2.h r1 = (xg2.h) r1
            kf2.v r7 = r12.f307307f
            long r8 = r12.f307308g
            int r10 = r12.f307309h
            boolean r13 = r1 instanceof xg2.i
            if (r13 == 0) goto L83
            oz5.l r13 = r1.f454392a
            if (r13 != 0) goto L70
            oz5.l r13 = r12.getContext()
        L70:
            kf2.t r11 = new kf2.t
            r6 = 0
            r4 = r11
            r5 = r1
            r4.<init>(r5, r6, r7, r8, r10)
            r12.f307305d = r1
            r12.f307306e = r3
            java.lang.Object r13 = kotlinx.coroutines.l.g(r13, r11, r12)
            if (r13 != r0) goto L83
            return r0
        L83:
            kf2.v r6 = r12.f307307f
            long r7 = r12.f307308g
            int r9 = r12.f307309h
            boolean r13 = r1 instanceof xg2.b
            if (r13 == 0) goto La8
            oz5.l r13 = r1.f454392a
            if (r13 != 0) goto L95
            oz5.l r13 = r12.getContext()
        L95:
            kf2.s r10 = new kf2.s
            r5 = 0
            r3 = r10
            r4 = r1
            r3.<init>(r4, r5, r6, r7, r9)
            r12.f307305d = r1
            r12.f307306e = r2
            java.lang.Object r13 = kotlinx.coroutines.l.g(r13, r10, r12)
            if (r13 != r0) goto La8
            return r0
        La8:
            jz5.f0 r13 = jz5.f0.f302826a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kf2.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
