package xm3;

/* loaded from: classes4.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f455385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f455387f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f455388g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f455389h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, java.lang.Object obj, int i17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455386e = mvvmList;
        this.f455387f = obj;
        this.f455388g = i17;
        this.f455389h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xm3.v(this.f455386e, this.f455387f, this.f455388g, this.f455389h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xm3.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f455385d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i(this.f455386e.c(), "check load more");
            com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f455386e;
            if (mvvmList.f152063m) {
                com.tencent.mars.xlog.Log.i(mvvmList.c(), "already loading");
            } else {
                int i18 = mvvmList.f152073w.get();
                java.lang.Object obj2 = this.f455387f;
                int i19 = this.f455388g;
                yz5.l lVar = this.f455389h;
                this.f455385d = 1;
                if (mvvmList.i(i18, obj2, i19, lVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
