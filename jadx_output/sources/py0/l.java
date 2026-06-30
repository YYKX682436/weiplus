package py0;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f358995d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ py0.y f358997f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358998g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(py0.y yVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f358997f = yVar;
        this.f358998g = str;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        py0.l lVar = new py0.l(this.f358997f, this.f358998g, (kotlin.coroutines.Continuation) obj3);
        lVar.f358996e = (java.lang.Throwable) obj2;
        return lVar.invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r4.f358995d
            r2 = 1
            py0.y r3 = r4.f358997f
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r4.f358996e
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L34
        L13:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1b:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.f358996e
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            kotlinx.coroutines.r2 r1 = r3.f359034i
            if (r1 == 0) goto L35
            r4.f358996e = r5
            r4.f358995d = r2
            kotlinx.coroutines.c3 r1 = (kotlinx.coroutines.c3) r1
            java.lang.Object r1 = r1.C(r4)
            if (r1 != r0) goto L33
            return r0
        L33:
            r0 = r5
        L34:
            r5 = r0
        L35:
            py0.f0 r0 = r3.P6()
            r0.dismiss()
            java.lang.String r0 = "MaasBaseUILogicUIC"
            if (r5 != 0) goto L6c
            r5 = 3
            r3.S6(r5)
            java.lang.Class<pp0.h0> r5 = pp0.h0.class
            i95.m r5 = i95.n0.c(r5)
            pp0.h0 r5 = (pp0.h0) r5
            yy0.m0 r5 = (yy0.m0) r5
            java.lang.String r1 = r4.f358998g
            java.lang.String r5 = r5.Ai(r1)
            r3.R6(r1, r5)
            android.app.Activity r5 = r3.getContext()
            r1 = -1
            r5.setResult(r1)
            android.app.Activity r5 = r3.getContext()
            r5.finish()
            java.lang.String r5 = "export successful"
            com.tencent.mars.xlog.Log.i(r0, r5)
            goto L78
        L6c:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "maas error"
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r5, r2, r1)
            r5 = 4
            r3.S6(r5)
        L78:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: py0.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
