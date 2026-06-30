package te2;

/* loaded from: classes3.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f418156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.l f418157f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j17, te2.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418156e = j17;
        this.f418157f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.k(this.f418156e, this.f418157f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418155d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f418155d = 1;
            if (kotlinx.coroutines.k1.b(this.f418156e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAllowanceGiftBubblePresenter", "#updateBubbleInfo iconTickerJpb time to hide.");
        te2.b bVar = this.f418157f.f418186n;
        if (bVar != null) {
            ((te2.o) bVar).a();
        }
        return jz5.f0.f302826a;
    }
}
