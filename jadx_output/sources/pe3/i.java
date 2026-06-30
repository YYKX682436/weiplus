package pe3;

/* loaded from: classes7.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f353659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pe3.o f353660e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(pe3.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f353660e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pe3.i(this.f353660e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe3.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f353659d
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 3
            r4 = 2
            r5 = 1
            pe3.o r6 = r7.f353660e
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            kotlin.ResultKt.throwOnFailure(r8)
            goto L7b
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5f
        L23:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L39
        L27:
            kotlin.ResultKt.throwOnFailure(r8)
            se3.e r8 = r6.f353669e
            r7.f353659d = r5
            java.lang.String r1 = "frames"
            java.lang.String r5 = ""
            java.lang.Object r8 = r8.O6(r1, r5, r7)
            if (r8 != r0) goto L39
            return r0
        L39:
            se3.e r8 = r6.f353669e
            androidx.appcompat.app.AppCompatActivity r1 = r6.getActivity()
            java.lang.String r5 = "activity"
            kotlin.jvm.internal.o.g(r1, r5)
            pf5.z r5 = pf5.z.f353948a
            pf5.v r1 = r5.a(r1)
            java.lang.Class<pe3.h> r5 = pe3.h.class
            androidx.lifecycle.c1 r1 = r1.a(r5)
            pe3.h r1 = (pe3.h) r1
            java.lang.String r1 = r1.O6()
            r7.f353659d = r4
            java.lang.Object r8 = r8.P6(r1, r7)
            if (r8 != r0) goto L5f
            return r0
        L5f:
            se3.e r8 = r6.f353669e
            com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView r1 = r6.f353668d
            if (r1 == 0) goto L7c
            r7.f353659d = r3
            kotlinx.coroutines.flow.i2 r8 = r8.f406914d
            se3.c r3 = new se3.c
            r3.<init>(r1)
            kotlinx.coroutines.flow.q2 r8 = (kotlinx.coroutines.flow.q2) r8
            java.lang.Object r8 = r8.emit(r3, r7)
            if (r8 != r0) goto L77
            goto L78
        L77:
            r8 = r2
        L78:
            if (r8 != r0) goto L7b
            return r0
        L7b:
            return r2
        L7c:
            java.lang.String r8 = "frameSetView"
            kotlin.jvm.internal.o.o(r8)
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pe3.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
