package kf2;

/* loaded from: classes.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f307272d;

    /* renamed from: e, reason: collision with root package name */
    public int f307273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kf2.n f307274f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f307275g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f307276h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kf2.n nVar, long j17, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f307274f = nVar;
        this.f307275g = j17;
        this.f307276h = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kf2.m(this.f307274f, this.f307275g, this.f307276h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kf2.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f307273e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L30
            if (r2 == r5) goto L2a
            if (r2 == r4) goto L22
            if (r2 != r3) goto L1a
            java.lang.Object r1 = r0.f307272d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r21)
            goto Lac
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L22:
            java.lang.Object r2 = r0.f307272d
            xg2.h r2 = (xg2.h) r2
            kotlin.ResultKt.throwOnFailure(r21)
            goto L86
        L2a:
            kotlin.ResultKt.throwOnFailure(r21)
            r2 = r21
            goto L5e
        L30:
            kotlin.ResultKt.throwOnFailure(r21)
            db2.b1 r2 = new db2.b1
            r7 = 0
            r8 = 0
            android.content.Context r6 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r9 = "getContext(...)"
            kotlin.jvm.internal.o.f(r6, r9)
            java.lang.String r9 = xy2.c.e(r6)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 2043(0x7fb, float:2.863E-42)
            r19 = 0
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.f307273e = r5
            r6 = 0
            java.lang.Object r2 = xg2.g.d(r2, r6, r0, r5, r6)
            if (r2 != r1) goto L5e
            return r1
        L5e:
            xg2.h r2 = (xg2.h) r2
            kf2.n r8 = r0.f307274f
            long r9 = r0.f307275g
            int r11 = r0.f307276h
            boolean r5 = r2 instanceof xg2.i
            if (r5 == 0) goto L86
            oz5.l r5 = r2.f454392a
            if (r5 != 0) goto L72
            oz5.l r5 = r20.getContext()
        L72:
            r12 = r5
            kf2.l r13 = new kf2.l
            r7 = 0
            r5 = r13
            r6 = r2
            r5.<init>(r6, r7, r8, r9, r11)
            r0.f307272d = r2
            r0.f307273e = r4
            java.lang.Object r4 = kotlinx.coroutines.l.g(r12, r13, r0)
            if (r4 != r1) goto L86
            return r1
        L86:
            kf2.n r7 = r0.f307274f
            long r8 = r0.f307275g
            int r10 = r0.f307276h
            boolean r4 = r2 instanceof xg2.b
            if (r4 == 0) goto Lac
            oz5.l r4 = r2.f454392a
            if (r4 != 0) goto L98
            oz5.l r4 = r20.getContext()
        L98:
            r11 = r4
            kf2.k r12 = new kf2.k
            r6 = 0
            r4 = r12
            r5 = r2
            r4.<init>(r5, r6, r7, r8, r10)
            r0.f307272d = r2
            r0.f307273e = r3
            java.lang.Object r2 = kotlinx.coroutines.l.g(r11, r12, r0)
            if (r2 != r1) goto Lac
            return r1
        Lac:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kf2.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
