package df2;

/* loaded from: classes3.dex */
public final class m4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f230755f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.r4 f230756g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(java.lang.String str, long j17, df2.r4 r4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230754e = str;
        this.f230755f = j17;
        this.f230756g = r4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.m4(this.f230754e, this.f230755f, this.f230756g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.m4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230753d;
        long j17 = this.f230755f;
        java.lang.String str = this.f230754e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("FinderLiveSubscribeNextLiveGuideController", "dismissDelay " + str + " start delay " + j17);
            this.f230753d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveSubscribeNextLiveGuideController", "dismissDelay " + str + " after delay " + j17);
        this.f230756g.m7(str, false);
        return jz5.f0.f302826a;
    }
}
