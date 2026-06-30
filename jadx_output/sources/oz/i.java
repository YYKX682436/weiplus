package oz;

/* loaded from: classes12.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f350153d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f350155f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f350156g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oz.g f350157h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.storage.f9 f9Var, boolean z17, oz.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f350155f = f9Var;
        this.f350156g = z17;
        this.f350157h = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        oz.i iVar = new oz.i(this.f350155f, this.f350156g, this.f350157h, continuation);
        iVar.f350154e = obj;
        return iVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((oz.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f350153d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.storage.f9 f9Var = this.f350155f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            v70.w wVar = (v70.w) ((xs.d1) i95.n0.c(xs.d1.class));
            l70.d cj6 = wVar.cj(f9Var, s70.c.f403919g, true);
            if (cj6 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ScheduledDownloadExecutor", "downloadImage: abort, reason=paramsNull, msgId=" + f9Var.getMsgId());
                return f0Var;
            }
            cj6.f316816q = true;
            cj6.f316817r = this.f350156g;
            this.f350153d = 1;
            obj = wVar.bj(cj6, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        l70.e eVar = (l70.e) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScheduledDownloadExecutor", "downloadImage: done, msgId=" + f9Var.getMsgId() + ", ret=" + eVar.f316819b);
        this.f350157h.onResult(eVar.f316819b);
        return f0Var;
    }
}
