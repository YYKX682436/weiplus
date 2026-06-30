package zv0;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f476184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f476185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476186f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.j0 f476187g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zv0.f0 f476188h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(rv0.n1 n1Var, java.lang.String str, ex0.j0 j0Var, zv0.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f476185e = n1Var;
        this.f476186f = str;
        this.f476187g = j0Var;
        this.f476188h = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zv0.i(this.f476185e, this.f476186f, this.f476187g, this.f476188h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zv0.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r4.f476184d
            rv0.n1 r2 = r4.f476185e
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            kotlin.ResultKt.throwOnFailure(r5)
            goto L2f
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.ResultKt.throwOnFailure(r5)
            jz5.g r5 = r2.f400136x
            jz5.n r5 = (jz5.n) r5
            java.lang.Object r5 = r5.getValue()
            zv0.y r5 = (zv0.y) r5
            r4.f476184d = r3
            java.lang.String r1 = r4.f476186f
            java.lang.Object r5 = r5.c(r1, r4)
            if (r5 != r0) goto L2f
            return r0
        L2f:
            ex0.j0 r5 = r4.f476187g
            java.lang.String r5 = r5.r()
            if (r5 == 0) goto L73
            jz5.g r0 = r2.f400136x
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            zv0.y r0 = (zv0.y) r0
            r0.getClass()
            androidx.lifecycle.g0 r0 = r0.f476248c
            java.lang.Object r0 = r0.getValue()
            zv0.h0 r0 = (zv0.h0) r0
            r1 = 0
            if (r0 == 0) goto L71
            java.util.List r0 = r0.f476181a
            if (r0 == 0) goto L71
            java.util.Iterator r0 = r0.iterator()
        L57:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r0.next()
            r3 = r2
            zv0.r r3 = (zv0.r) r3
            com.tencent.maas.material.MJMaterialInfo r3 = r3.f476221a
            java.lang.String r3 = r3.f48224b
            boolean r3 = kotlin.jvm.internal.o.b(r3, r5)
            if (r3 == 0) goto L57
            r1 = r2
        L6f:
            zv0.r r1 = (zv0.r) r1
        L71:
            if (r1 != 0) goto L75
        L73:
            zv0.r r1 = zv0.r.f476220d
        L75:
            zv0.f0 r5 = r4.f476188h
            r5.setInitTransitionInfo(r1)
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zv0.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
