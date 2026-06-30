package oz;

/* loaded from: classes12.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f350158d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f350160f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f350161g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oz.g f350162h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.storage.f9 f9Var, boolean z17, oz.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f350160f = f9Var;
        this.f350161g = z17;
        this.f350162h = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        oz.j jVar = new oz.j(this.f350160f, this.f350161g, this.f350162h, continuation);
        jVar.f350159e = obj;
        return jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((oz.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f350158d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.storage.f9 f9Var = this.f350160f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xf0.n nVar = xf0.s.f454216f;
            xf0.i U6 = nVar.a().U6(f9Var, xf0.f.f454163d, true);
            if (U6 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ScheduledDownloadExecutor", "downloadVideo: abort, reason=paramsNull, msgId=" + f9Var.getMsgId());
                return f0Var;
            }
            U6.f454190r = true;
            U6.f454191s = this.f350161g;
            xf0.s a17 = nVar.a();
            this.f350158d = 1;
            obj = a17.T6(U6, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        xf0.j jVar = (xf0.j) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScheduledDownloadExecutor", "downloadVideo: done, msgId=" + f9Var.getMsgId() + ", ret=" + jVar.f454193b);
        this.f350162h.onResult(jVar.f454193b);
        return f0Var;
    }
}
