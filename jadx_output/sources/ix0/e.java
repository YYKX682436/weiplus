package ix0;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f295293d;

    /* renamed from: e, reason: collision with root package name */
    public int f295294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw0.c f295295f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ix0.g f295296g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.Segment f295297h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(dw0.c cVar, ix0.g gVar, com.tencent.maas.moviecomposing.segments.Segment segment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295295f = cVar;
        this.f295296g = gVar;
        this.f295297h = segment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ix0.e(this.f295295f, this.f295296g, this.f295297h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ix0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r9 = pz5.a.f359186d
            int r0 = r12.f295294e
            r7 = 3
            r1 = 2
            com.tencent.maas.moviecomposing.segments.Segment r2 = r12.f295297h
            r3 = 1
            ix0.g r10 = r12.f295296g
            if (r0 == 0) goto L2d
            if (r0 == r3) goto L29
            if (r0 == r1) goto L20
            if (r0 != r7) goto L18
            kotlin.ResultKt.throwOnFailure(r13)
            goto L87
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L20:
            java.lang.Object r0 = r12.f295293d
            com.tencent.maas.model.time.MJTime r0 = (com.tencent.maas.model.time.MJTime) r0
            kotlin.ResultKt.throwOnFailure(r13)
            r2 = r0
            goto L6f
        L29:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L43
        L2d:
            kotlin.ResultKt.throwOnFailure(r13)
            dw0.c r0 = r12.f295295f
            boolean r0 = r0.b()
            if (r0 == 0) goto L43
            r12.f295294e = r3
            java.lang.String r0 = "onTimbreAudition"
            java.lang.Object r0 = r10.j(r2, r0, r12)
            if (r0 != r9) goto L43
            return r9
        L43:
            com.tencent.maas.model.time.MJTime r8 = r2.A()
            java.lang.String r0 = "getPresentationStartTime(...)"
            kotlin.jvm.internal.o.f(r8, r0)
            gx0.bf r0 = r10.f295308d
            com.tencent.maas.model.time.MJTimeRange r2 = r2.B()
            java.lang.String r4 = "getPresentationTimeRange(...)"
            kotlin.jvm.internal.o.f(r2, r4)
            r0.o7(r2, r3)
            gx0.bf r0 = r10.f295308d
            r2 = 0
            r3 = 0
            r5 = 5
            r6 = 0
            r12.f295293d = r8
            r12.f295294e = r1
            r1 = r2
            r2 = r8
            r4 = r12
            java.lang.Object r0 = gx0.bf.d7(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r9) goto L6e
            return r9
        L6e:
            r2 = r8
        L6f:
            gx0.bf r0 = r10.f295308d
            r1 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            r8 = 25
            r11 = 0
            r6 = 0
            r12.f295293d = r6
            r12.f295294e = r7
            r6 = r12
            r7 = r8
            r8 = r11
            java.lang.Object r0 = gx0.bf.r7(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r9) goto L87
            return r9
        L87:
            gx0.bf r0 = r10.f295308d
            com.tencent.maas.model.time.MJTimeRange r1 = com.tencent.maas.model.time.MJTimeRange.PositiveInfiniteTimeRange
            java.lang.String r2 = "PositiveInfiniteTimeRange"
            kotlin.jvm.internal.o.f(r1, r2)
            r2 = 0
            r0.o7(r1, r2)
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ix0.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
