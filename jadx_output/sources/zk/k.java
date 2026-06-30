package zk;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f473398d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f473399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.provider.ShareableChatRecordsProvider f473400f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f473401g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.app.provider.ShareableChatRecordsProvider shareableChatRecordsProvider, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473400f = shareableChatRecordsProvider;
        this.f473401g = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        zk.k kVar = new zk.k(this.f473400f, this.f473401g, continuation);
        kVar.f473399e = obj;
        return kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zk.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f473398d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f473399e;
            zk.j jVar = new zk.j(this.f473400f, this.f473401g, null);
            this.f473399e = y0Var;
            this.f473398d = 1;
            obj = kotlinx.coroutines.a4.c(15000L, jVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List list = (java.util.List) obj;
        if (list != null) {
            return list;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ShareableChatRecordsProvider", "[!] writeCdnInfos: getCdnInfos timeout");
        return kz5.p0.f313996d;
    }
}
