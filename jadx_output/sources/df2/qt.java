package df2;

/* loaded from: classes3.dex */
public final class qt extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f231188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.wt f231189f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt(long j17, df2.wt wtVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231188e = j17;
        this.f231189f = wtVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.qt(this.f231188e, this.f231189f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.qt) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231187d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkDismissAfterReserve: dismiss after click, delay=");
            long j17 = this.f231188e;
            sb6.append(j17);
            com.tencent.mars.xlog.Log.i("LiveReserveNoticeGuideController", sb6.toString());
            this.f231187d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        df2.wt wtVar = this.f231189f;
        wtVar.n7("dismissAfterReserve", false);
        wtVar.f231713s = null;
        return jz5.f0.f302826a;
    }
}
