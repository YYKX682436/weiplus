package dz0;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f244963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f244964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz0.v f244965f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f244966g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244967h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(boolean z17, dz0.v vVar, yz5.l lVar, com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244964e = z17;
        this.f244965f = vVar;
        this.f244966g = lVar;
        this.f244967h = maasSdkUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz0.p(this.f244964e, this.f244965f, this.f244966g, this.f244967h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f244963d
            r2 = 1
            dz0.v r3 = r5.f244965f
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L30
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r6 = r5.f244964e
            if (r6 == 0) goto L21
            r3.e()
        L21:
            kotlinx.coroutines.z r6 = r3.f245032d
            if (r6 == 0) goto L33
            r5.f244963d = r2
            kotlinx.coroutines.a0 r6 = (kotlinx.coroutines.a0) r6
            java.lang.Object r6 = r6.k(r5)
            if (r6 != r0) goto L30
            return r0
        L30:
            com.tencent.maas.instamovie.base.MJError r6 = (com.tencent.maas.instamovie.base.MJError) r6
            goto L34
        L33:
            r6 = 0
        L34:
            jz5.f0 r0 = jz5.f0.f302826a
            yz5.l r1 = r5.f244966g
            java.lang.String r2 = "MicroMsg.MJSegmentClipBehaviorHolder"
            if (r6 == 0) goto L48
            r3.getClass()
            java.lang.String r4 = "endSegmentClipping: failed, begin err"
            com.tencent.mars.xlog.Log.i(r2, r4)
            dz0.v.a(r3, r1, r6)
            return r0
        L48:
            r3.getClass()
            java.lang.String r6 = "endSegmentClipping: start"
            com.tencent.mars.xlog.Log.i(r2, r6)
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r6 = r5.f244967h
            az0.n7 r6 = r6.f69783d
            if (r6 == 0) goto L65
            dz0.o r2 = new dz0.o
            r2.<init>(r3, r1)
            az0.u5 r1 = new az0.u5
            r1.<init>(r2)
            com.tencent.maas.instamovie.MJMovieSession r6 = r6.f15742a
            r6.endClipping(r1)
        L65:
            r6 = 0
            r3.f245033e = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
