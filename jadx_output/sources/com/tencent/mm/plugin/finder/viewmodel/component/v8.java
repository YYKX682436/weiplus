package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class v8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f136218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e9 f136219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136220f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderCommentInfo f136221g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136222h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(com.tencent.mm.plugin.finder.viewmodel.component.e9 e9Var, in5.s0 s0Var, com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136219e = e9Var;
        this.f136220f = s0Var;
        this.f136221g = finderCommentInfo;
        this.f136222h = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.v8(this.f136219e, this.f136220f, this.f136221g, this.f136222h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.v8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f136218d
            java.lang.String r2 = "$holder"
            in5.s0 r3 = r9.f136220f
            r4 = 2
            r5 = 1
            com.tencent.mm.plugin.finder.viewmodel.component.e9 r6 = r9.f136219e
            if (r1 == 0) goto L22
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L16
            kotlin.ResultKt.throwOnFailure(r10)
            goto L76
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L66
        L22:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.jvm.internal.o.f(r3, r2)
            android.view.View r10 = r6.R6(r3)
            if (r10 == 0) goto L6b
            r9.f136218d = r5
            r6.getClass()
            kotlinx.coroutines.r r1 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r7 = pz5.f.b(r9)
            r1.<init>(r7, r5)
            r1.k()
            v65.n r5 = new v65.n
            r5.<init>(r1)
            android.view.ViewPropertyAnimator r10 = r10.animate()
            r7 = 0
            android.view.ViewPropertyAnimator r10 = r10.alpha(r7)
            r7 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r10 = r10.setDuration(r7)
            com.tencent.mm.plugin.finder.viewmodel.component.r8 r7 = new com.tencent.mm.plugin.finder.viewmodel.component.r8
            r7.<init>(r5)
            android.view.ViewPropertyAnimator r10 = r10.setListener(r7)
            r10.start()
            java.lang.Object r10 = r1.j()
            if (r10 != r0) goto L66
            return r0
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r10.booleanValue()
        L6b:
            r9.f136218d = r4
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r10 = kotlinx.coroutines.k1.b(r4, r9)
            if (r10 != r0) goto L76
            return r0
        L76:
            java.lang.String r10 = "nextTask"
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = r9.f136221g
            android.view.View r1 = r9.f136222h
            r6.k7(r10, r0, r1)
            r10 = 0
            r6.f134228r = r10
            kotlin.jvm.internal.o.f(r3, r2)
            com.tencent.mm.plugin.finder.viewmodel.component.db0 r0 = com.tencent.mm.plugin.finder.viewmodel.component.db0.f134119e
            com.tencent.mm.plugin.finder.viewmodel.component.ib0 r1 = com.tencent.mm.plugin.finder.viewmodel.component.ib0.f134731d
            r6.b7(r10, r3, r0, r1)
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.v8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
