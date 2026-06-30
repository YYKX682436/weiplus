package df2;

/* loaded from: classes3.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f230445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.k1 f230446f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(long j17, df2.k1 k1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230445e = j17;
        this.f230446f = k1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.j1(this.f230445e, this.f230446f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230444d;
        long j17 = this.f230445e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("FinderCreateLiveGuideController", "dismissJob start");
            this.f230444d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("FinderCreateLiveGuideController", "dismiss after delay " + j17);
        this.f230446f.m7("delayDismissWithoutActionJob", false);
        return jz5.f0.f302826a;
    }
}
