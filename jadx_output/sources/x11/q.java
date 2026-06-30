package x11;

/* loaded from: classes12.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f451383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x11.t f451384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f2 f451385f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x11.t tVar, kotlinx.coroutines.f2 f2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f451384e = tVar;
        this.f451385f = f2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new x11.q(this.f451384e, this.f451385f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((x11.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        java.lang.StringBuilder sb6;
        java.lang.Object f17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f451383d;
        kotlinx.coroutines.f2 f2Var = this.f451385f;
        x11.t tVar = this.f451384e;
        boolean z18 = true;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                ah3.v vVar = new ah3.v(10);
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "tryBatchGetContact() called launch begin name:" + java.lang.Thread.currentThread().getName());
                x11.n nVar = new x11.n(tVar);
                x11.o oVar = new x11.o(tVar);
                x11.p pVar = new x11.p(tVar);
                this.f451383d = 1;
                f17 = kotlinx.coroutines.z0.f(new ah3.u(vVar, nVar, oVar, pVar, null), this);
                if (f17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                f17 = obj;
            }
            z17 = ((java.lang.Boolean) f17).booleanValue();
            try {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tryBatchGetContact() called launch end requestResult:");
                if (!z17) {
                    z18 = false;
                }
                sb7.append(z18);
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", sb7.toString());
                sb6 = new java.lang.StringBuilder("tryBatchGetContact() called finally end requestResult:");
            } catch (java.lang.Throwable th6) {
                th = th6;
                try {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneInit.dkInit", th, "tryBatchGetContact err", new java.lang.Object[0]);
                    sb6 = new java.lang.StringBuilder("tryBatchGetContact() called finally end requestResult:");
                    sb6.append(z17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", sb6.toString());
                    x11.g gVar = x11.t.D;
                    tVar.e(z17);
                    f2Var.close();
                    return jz5.f0.f302826a;
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "tryBatchGetContact() called finally end requestResult:" + z17);
                    x11.g gVar2 = x11.t.D;
                    tVar.e(z17);
                    f2Var.close();
                    throw th7;
                }
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            z17 = false;
        }
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", sb6.toString());
        x11.g gVar3 = x11.t.D;
        tVar.e(z17);
        f2Var.close();
        return jz5.f0.f302826a;
    }
}
