package zk;

/* loaded from: classes12.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f473389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.provider.ShareableChatRecordsProvider f473390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ co.d f473391f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.app.provider.ShareableChatRecordsProvider shareableChatRecordsProvider, co.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473390e = shareableChatRecordsProvider;
        this.f473391f = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zk.h(this.f473390e, this.f473391f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zk.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f473389d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            co.d dVar = this.f473391f;
            long l17 = dVar.l();
            java.lang.String talker = dVar.getTalker();
            this.f473389d = 1;
            obj = com.tencent.mm.app.provider.ShareableChatRecordsProvider.b(this.f473390e, l17, talker, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
