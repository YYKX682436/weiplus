package il2;

/* loaded from: classes.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f292078d;

    /* renamed from: e, reason: collision with root package name */
    public int f292079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ql1 f292080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f292081g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r45.ql1 ql1Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292080f = ql1Var;
        this.f292081g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new il2.q(this.f292080f, this.f292081g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((il2.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f292079e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r0 = r9.f292078d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto Lab
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            java.lang.Object r1 = r9.f292078d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L8f
        L29:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L6e
        L2d:
            kotlin.ResultKt.throwOnFailure(r10)
            r45.n02 r10 = new r45.n02
            r10.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r10.set(r4, r1)
            r45.ql1 r1 = new r45.ql1
            r1.<init>()
            r45.ql1 r6 = r9.f292080f
            r7 = 0
            int r8 = r6.getInteger(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r1.set(r7, r8)
            long r6 = r6.getLong(r5)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r1.set(r5, r6)
            r10.set(r3, r1)
            com.tencent.mm.modelbase.i r10 = r10.d()
            kotlinx.coroutines.p0 r1 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r1 = kotlinx.coroutines.internal.b0.f310484a
            r9.f292079e = r5
            java.lang.Object r10 = xg2.g.b(r10, r1, r9)
            if (r10 != r0) goto L6e
            return r0
        L6e:
            r1 = r10
            xg2.h r1 = (xg2.h) r1
            boolean r10 = r1 instanceof xg2.i
            if (r10 == 0) goto L8f
            oz5.l r10 = r1.f454392a
            if (r10 != 0) goto L7d
            oz5.l r10 = r9.getContext()
        L7d:
            il2.p r5 = new il2.p
            boolean r6 = r9.f292081g
            r5.<init>(r1, r2, r6)
            r9.f292078d = r1
            r9.f292079e = r4
            java.lang.Object r10 = kotlinx.coroutines.l.g(r10, r5, r9)
            if (r10 != r0) goto L8f
            return r0
        L8f:
            boolean r10 = r1 instanceof xg2.b
            if (r10 == 0) goto Lab
            oz5.l r10 = r1.f454392a
            if (r10 != 0) goto L9b
            oz5.l r10 = r9.getContext()
        L9b:
            il2.o r4 = new il2.o
            r4.<init>(r1, r2)
            r9.f292078d = r1
            r9.f292079e = r3
            java.lang.Object r10 = kotlinx.coroutines.l.g(r10, r4, r9)
            if (r10 != r0) goto Lab
            return r0
        Lab:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: il2.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
