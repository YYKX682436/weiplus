package qf2;

/* loaded from: classes10.dex */
public final class s1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362568d;

    /* renamed from: e, reason: collision with root package name */
    public int f362569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f362570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.u4 f362571g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(qf2.y1 y1Var, dk2.u4 u4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362570f = y1Var;
        this.f362571g = u4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.s1(this.f362570f, this.f362571g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.s1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003b -> B:5:0x003e). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f362569e
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            int r1 = r7.f362568d
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            goto L3e
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = 30
            r1 = r8
            r8 = r7
        L1f:
            r3 = 0
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.na> r4 = com.tencent.mm.plugin.finder.live.plugin.na.class
            qf2.y1 r5 = r8.f362570f
            if (r1 < 0) goto L41
            com.tencent.mm.plugin.finder.live.plugin.l r4 = r5.R6(r4)
            com.tencent.mm.plugin.finder.live.plugin.na r4 = (com.tencent.mm.plugin.finder.live.plugin.na) r4
            if (r4 == 0) goto L31
            r4.A1(r1, r3)
        L31:
            r8.f362568d = r1
            r8.f362569e = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r3 = kotlinx.coroutines.k1.b(r3, r8)
            if (r3 != r0) goto L3e
            return r0
        L3e:
            int r1 = r1 + (-1)
            goto L1f
        L41:
            java.lang.String r0 = "FinderLiveMicAnchorBattlePkController"
            java.lang.String r1 = "finishPublicity"
            com.tencent.mars.xlog.Log.i(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "transPublicityFinish oriState: "
            r1.<init>(r6)
            dk2.u4 r8 = r8.f362571g
            int r6 = r8.f234158e
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r6 = r8.f234169p
            com.tencent.mars.xlog.Log.i(r6, r1)
            r1 = 7
            r8.f234158e = r1
            com.tencent.mm.plugin.finder.live.plugin.l r8 = r5.R6(r4)
            com.tencent.mm.plugin.finder.live.plugin.na r8 = (com.tencent.mm.plugin.finder.live.plugin.na) r8
            if (r8 == 0) goto L6e
            r8.A1(r3, r2)
        L6e:
            jz5.l r8 = r5.f362657m
            if (r8 == 0) goto L88
            java.lang.Object r1 = r8.f302833d
            r45.im1 r1 = (r45.im1) r1
            if (r1 == 0) goto L88
            java.lang.String r2 = "finishPublicity show next battle"
            com.tencent.mars.xlog.Log.i(r0, r2)
            java.lang.Class<mm2.o4> r0 = mm2.o4.class
            androidx.lifecycle.c1 r0 = r5.business(r0)
            mm2.o4 r0 = (mm2.o4) r0
            qf2.y1.c7(r5, r0, r1, r8)
        L88:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.s1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
