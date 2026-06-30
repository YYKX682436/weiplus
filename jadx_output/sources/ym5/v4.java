package ym5;

/* loaded from: classes2.dex */
public final class v4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f463556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463558f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(long j17, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463557e = j17;
        this.f463558f = refreshLoadMoreLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ym5.v4(this.f463557e, this.f463558f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ym5.v4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f463556d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f463556d = 1;
            if (kotlinx.coroutines.k1.b(this.f463557e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RLMoreLayout", "requestOptLayout recoverVerticalScroll");
        this.f463558f.setForbidVerticalScroll(false);
        return jz5.f0.f302826a;
    }
}
