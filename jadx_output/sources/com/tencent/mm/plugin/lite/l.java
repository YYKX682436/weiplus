package com.tencent.mm.plugin.lite;

/* loaded from: classes11.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f143870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kx5.k f143871e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kx5.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f143871e = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.lite.l(this.f143871e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.lite.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f143870d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "WxaRouter delegate await engineGroup");
            f50.y yVar = (f50.y) i95.n0.c(f50.y.class);
            this.f143870d = 1;
            e50.z0 z0Var = (e50.z0) yVar;
            z0Var.Zi();
            z0Var.Ui().a(z0Var.f249567q);
            kotlinx.coroutines.r2 r2Var = z0Var.f249560g;
            if (r2Var == null || (obj2 = ((kotlinx.coroutines.c3) r2Var).C(this)) != aVar) {
                obj2 = f0Var;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kx5.k kVar = this.f143871e;
        if (kVar != null) {
            kVar.a();
        }
        return f0Var;
    }
}
