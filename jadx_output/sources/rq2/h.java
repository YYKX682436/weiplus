package rq2;

/* loaded from: classes.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f398828d;

    /* renamed from: e, reason: collision with root package name */
    public int f398829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f398830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.jp1 f398831g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r45.qt2 qt2Var, r45.jp1 jp1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398830f = qt2Var;
        this.f398831g = jp1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rq2.h(this.f398830f, this.f398831g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rq2.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f398829e
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r0 = r8.f398828d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto La6
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            java.lang.Object r1 = r8.f398828d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L8a
        L29:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L6b
        L2d:
            kotlin.ResultKt.throwOnFailure(r9)
            r45.g22 r9 = new r45.g22
            r9.<init>()
            db2.t4 r1 = db2.t4.f228171a
            r6 = 11815(0x2e27, float:1.6556E-41)
            r45.qt2 r7 = r8.f398830f
            r45.kv0 r1 = r1.b(r6, r7)
            r9.set(r4, r1)
            r1 = 4
            java.util.LinkedList r1 = r9.getList(r1)
            r45.jp1 r6 = r8.f398831g
            r1.add(r6)
            zl2.q4 r1 = zl2.q4.f473933a
            r45.rn1 r1 = zl2.q4.d(r1, r5, r5, r2, r5)
            r9.set(r3, r1)
            java.lang.String r1 = "FinderLiveNewSquareStateReporter"
            java.lang.String r6 = " createCgi for enter"
            com.tencent.mars.xlog.Log.i(r1, r6)
            com.tencent.mm.modelbase.i r9 = r9.d()
            az2.j r9 = (az2.j) r9
            r8.f398829e = r4
            java.lang.Object r9 = xg2.g.d(r9, r5, r8, r4, r5)
            if (r9 != r0) goto L6b
            return r0
        L6b:
            r1 = r9
            xg2.h r1 = (xg2.h) r1
            boolean r9 = r1 instanceof xg2.i
            if (r9 == 0) goto L8a
            oz5.l r9 = r1.f454392a
            if (r9 != 0) goto L7a
            oz5.l r9 = r8.getContext()
        L7a:
            rq2.g r4 = new rq2.g
            r4.<init>(r1, r5)
            r8.f398828d = r1
            r8.f398829e = r3
            java.lang.Object r9 = kotlinx.coroutines.l.g(r9, r4, r8)
            if (r9 != r0) goto L8a
            return r0
        L8a:
            boolean r9 = r1 instanceof xg2.b
            if (r9 == 0) goto La6
            oz5.l r9 = r1.f454392a
            if (r9 != 0) goto L96
            oz5.l r9 = r8.getContext()
        L96:
            rq2.f r3 = new rq2.f
            r3.<init>(r1, r5)
            r8.f398828d = r1
            r8.f398829e = r2
            java.lang.Object r9 = kotlinx.coroutines.l.g(r9, r3, r8)
            if (r9 != r0) goto La6
            return r0
        La6:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rq2.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
