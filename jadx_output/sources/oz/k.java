package oz;

/* loaded from: classes12.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f350163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f350164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oz.g f350165f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f350166g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.storage.f9 f9Var, oz.g gVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f350164e = f9Var;
        this.f350165f = gVar;
        this.f350166g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new oz.k(this.f350164e, this.f350165f, this.f350166g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((oz.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object ij6;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f350163d;
        com.tencent.mm.storage.f9 f9Var = this.f350164e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dg0.f fVar = (dg0.f) i95.n0.c(dg0.f.class);
            java.lang.String z07 = f9Var.z0();
            java.lang.String str = z07 == null ? "" : z07;
            java.lang.String Q0 = f9Var.Q0();
            cg0.a aVar2 = new cg0.a(str, Q0 == null ? "" : Q0, f9Var.getMsgId(), f9Var.I0(), f9Var.getCreateTime(), false, 32, null);
            aVar2.f41041h = true;
            aVar2.f41042i = this.f350166g;
            this.f350163d = 1;
            ij6 = ((ig0.o) fVar).ij(aVar2, this);
            if (ij6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            ij6 = obj;
        }
        cg0.b bVar = (cg0.b) ij6;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScheduledDownloadExecutor", "downloadVoice: done, msgId=" + f9Var.getMsgId() + ", result=" + bVar.f41043a);
        this.f350165f.onResult(bVar.f41043a == cg0.c.f41044d ? 0 : -1);
        return jz5.f0.f302826a;
    }
}
