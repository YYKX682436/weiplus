package xm3;

/* loaded from: classes.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f455308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MMSearchLiveList f455309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f455310f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.mvvmlist.MMSearchLiveList mMSearchLiveList, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f455309e = mMSearchLiveList;
        this.f455310f = obj;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xm3.f(this.f455309e, this.f455310f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xm3.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f455308d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.mvvmlist.MMSearchLiveList mMSearchLiveList = this.f455309e;
            kotlinx.coroutines.flow.j a17 = mMSearchLiveList.A.a(mMSearchLiveList.f152060g, new xm3.v0(this.f455310f, mMSearchLiveList.f152073w.get(), 0, mMSearchLiveList.f152058e.f455359d));
            xm3.e eVar = new xm3.e(mMSearchLiveList);
            this.f455308d = 1;
            if (a17.a(eVar, this) == aVar) {
                return aVar;
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
