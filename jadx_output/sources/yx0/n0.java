package yx0;

/* loaded from: classes5.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467467d;

    /* renamed from: e, reason: collision with root package name */
    public int f467468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467469f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f467470g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(yx0.b8 b8Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467469f = b8Var;
        this.f467470g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.n0(this.f467469f, this.f467470g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f467468e
            jz5.f0 r2 = jz5.f0.f302826a
            java.lang.String r3 = "MicroMsg.ShootComposingCorePlugin"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            java.lang.Object r0 = r7.f467467d
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L91
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L22:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L71
        L26:
            kotlin.ResultKt.throwOnFailure(r8)
            yx0.b8 r8 = r7.f467469f
            yx0.v r8 = r8.f467192s
            yx0.v r1 = yx0.v.f467700n
            if (r8 != r1) goto L3b
            yx0.m0 r8 = new yx0.m0
            yx0.b8 r1 = r7.f467469f
            r8.<init>(r1, r6)
            kotlinx.coroutines.l.f(r6, r8, r5, r6)
        L3b:
            yx0.b8 r8 = r7.f467469f
            yx0.v r8 = r8.f467192s
            yx0.v r1 = yx0.v.f467695f
            if (r8 == r1) goto L62
            yx0.b8 r8 = r7.f467469f
            yx0.v r8 = r8.f467192s
            yx0.v r1 = yx0.v.f467699m
            if (r8 != r1) goto L4c
            goto L62
        L4c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "clearMusic >> but state is "
            r8.<init>(r0)
            yx0.b8 r0 = r7.f467469f
            yx0.v r0 = r0.f467192s
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.tencent.mars.xlog.Log.i(r3, r8)
            return r2
        L62:
            yx0.b8 r8 = r7.f467469f
            pp0.p0 r8 = r8.K
            if (r8 == 0) goto L74
            r7.f467468e = r5
            java.lang.Object r8 = r8.O(r7)
            if (r8 != r0) goto L71
            return r0
        L71:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            goto L75
        L74:
            r8 = r6
        L75:
            yx0.b8 r1 = r7.f467469f
            r1.T = r6
            yx0.b8 r1 = r7.f467469f
            yx0.t r5 = yx0.t.f467646a
            r1.U = r5
            boolean r1 = r7.f467470g
            if (r1 == 0) goto L92
            yx0.b8 r1 = r7.f467469f
            r7.f467467d = r8
            r7.f467468e = r4
            java.lang.Object r1 = yx0.b8.o(r1, r7)
            if (r1 != r0) goto L90
            return r0
        L90:
            r0 = r8
        L91:
            r8 = r0
        L92:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "clearMusic >> "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.tencent.mars.xlog.Log.i(r3, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
