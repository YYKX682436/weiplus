package df2;

/* loaded from: classes3.dex */
public final class v4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f231581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.x4 f231582f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(long j17, df2.x4 x4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231581e = j17;
        this.f231582f = x4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.v4(this.f231581e, this.f231582f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.v4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231580d;
        long j17 = this.f231581e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("FinderLiveSwitchStreamGuideController", "dismissJob start after click");
            this.f231580d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveSwitchStreamGuideController", "dismiss after delay after click " + j17);
        this.f231582f.m7("delayDismissAfterClickJob", false);
        return jz5.f0.f302826a;
    }
}
