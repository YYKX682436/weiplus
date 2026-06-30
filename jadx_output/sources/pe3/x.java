package pe3;

/* loaded from: classes7.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f353684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pe3.g0 f353685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView f353686f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ se3.f f353687g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(pe3.g0 g0Var, com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView magicBrushSclDemoView, se3.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f353685e = g0Var;
        this.f353686f = magicBrushSclDemoView;
        this.f353687g = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pe3.x(this.f353685e, this.f353686f, this.f353687g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe3.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005e A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f353684d
            jz5.f0 r2 = jz5.f0.f302826a
            com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView r3 = r8.f353686f
            r4 = 3
            r5 = 2
            r6 = 1
            pe3.g0 r7 = r8.f353685e
            if (r1 == 0) goto L29
            if (r1 == r6) goto L25
            if (r1 == r5) goto L21
            if (r1 != r4) goto L19
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5e
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L4f
        L25:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L44
        L29:
            kotlin.ResultKt.throwOnFailure(r9)
            se3.e r9 = r7.f353658d
            r8.f353684d = r6
            kotlinx.coroutines.flow.i2 r9 = r9.f406914d
            se3.c r1 = new se3.c
            r1.<init>(r3)
            kotlinx.coroutines.flow.q2 r9 = (kotlinx.coroutines.flow.q2) r9
            java.lang.Object r9 = r9.emit(r1, r8)
            if (r9 != r0) goto L40
            goto L41
        L40:
            r9 = r2
        L41:
            if (r9 != r0) goto L44
            return r0
        L44:
            se3.e r9 = r7.f353658d
            r8.f353684d = r5
            java.lang.Object r9 = r9.N6(r3, r8)
            if (r9 != r0) goto L4f
            return r0
        L4f:
            se3.e r9 = r7.f353658d
            se3.f r1 = r8.f353687g
            java.lang.String r1 = r1.f406917b
            r8.f353684d = r4
            java.lang.Object r9 = r9.P6(r1, r8)
            if (r9 != r0) goto L5e
            return r0
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pe3.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
