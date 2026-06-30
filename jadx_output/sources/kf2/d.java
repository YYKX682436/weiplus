package kf2;

/* loaded from: classes.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f307209d;

    /* renamed from: e, reason: collision with root package name */
    public int f307210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f307211f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kf2.e f307212g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f307213h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f307214i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.Object obj, kf2.e eVar, long j17, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f307211f = obj;
        this.f307212g = eVar;
        this.f307213h = j17;
        this.f307214i = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kf2.d(this.f307211f, this.f307212g, this.f307213h, this.f307214i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kf2.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f307210e
            r3 = 3
            r4 = 2
            jz5.f0 r5 = jz5.f0.f302826a
            r6 = 1
            if (r2 == 0) goto L33
            if (r2 == r6) goto L2d
            if (r2 == r4) goto L24
            if (r2 != r3) goto L1c
            java.lang.Object r1 = r0.f307209d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r19)
            goto Lcf
        L1c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L24:
            java.lang.Object r2 = r0.f307209d
            xg2.h r2 = (xg2.h) r2
            kotlin.ResultKt.throwOnFailure(r19)
            goto Laa
        L2d:
            kotlin.ResultKt.throwOnFailure(r19)
            r2 = r19
            goto L82
        L33:
            kotlin.ResultKt.throwOnFailure(r19)
            kf2.w r2 = kf2.x.f307310c
            java.lang.String r7 = "audience_username"
            java.lang.Object r8 = r0.f307211f
            java.lang.String r14 = r2.c(r8, r7)
            if (r14 != 0) goto L43
            return r5
        L43:
            java.lang.String r7 = "enable"
            java.lang.Boolean r2 = r2.a(r8, r7)
            if (r2 == 0) goto Lcf
            boolean r16 = r2.booleanValue()
            ke2.j r2 = new ke2.j
            kf2.e r7 = r0.f307212g
            df2.k r8 = r7.f307311a
            java.lang.Class<mm2.e1> r9 = mm2.e1.class
            androidx.lifecycle.c1 r8 = r8.business(r9)
            mm2.e1 r8 = (mm2.e1) r8
            r45.nw1 r8 = r8.f328988r
            r10 = 0
            long r10 = r8.getLong(r10)
            df2.k r7 = r7.f307311a
            androidx.lifecycle.c1 r7 = r7.business(r9)
            mm2.e1 r7 = (mm2.e1) r7
            long r12 = r7.f328983m
            r15 = 2
            kf2.a r17 = new kf2.a
            r17.<init>()
            r9 = r2
            r9.<init>(r10, r12, r14, r15, r16, r17)
            r0.f307210e = r6
            r7 = 0
            java.lang.Object r2 = xg2.g.d(r2, r7, r0, r6, r7)
            if (r2 != r1) goto L82
            return r1
        L82:
            xg2.h r2 = (xg2.h) r2
            kf2.e r9 = r0.f307212g
            long r10 = r0.f307213h
            int r12 = r0.f307214i
            boolean r6 = r2 instanceof xg2.i
            if (r6 == 0) goto Laa
            oz5.l r6 = r2.f454392a
            if (r6 != 0) goto L96
            oz5.l r6 = r18.getContext()
        L96:
            r13 = r6
            kf2.c r14 = new kf2.c
            r8 = 0
            r6 = r14
            r7 = r2
            r6.<init>(r7, r8, r9, r10, r12)
            r0.f307209d = r2
            r0.f307210e = r4
            java.lang.Object r4 = kotlinx.coroutines.l.g(r13, r14, r0)
            if (r4 != r1) goto Laa
            return r1
        Laa:
            kf2.e r9 = r0.f307212g
            long r10 = r0.f307213h
            int r12 = r0.f307214i
            boolean r4 = r2 instanceof xg2.b
            if (r4 == 0) goto Lcf
            oz5.l r4 = r2.f454392a
            if (r4 != 0) goto Lbc
            oz5.l r4 = r18.getContext()
        Lbc:
            kf2.b r13 = new kf2.b
            r8 = 0
            r6 = r13
            r7 = r2
            r6.<init>(r7, r8, r9, r10, r12)
            r0.f307209d = r2
            r0.f307210e = r3
            java.lang.Object r2 = kotlinx.coroutines.l.g(r4, r13, r0)
            if (r2 != r1) goto Lcf
            return r1
        Lcf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kf2.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
