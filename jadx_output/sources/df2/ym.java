package df2;

/* loaded from: classes3.dex */
public final class ym extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f231880e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.cn f231881f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym(long j17, df2.cn cnVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231880e = j17;
        this.f231881f = cnVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.ym(this.f231880e, this.f231881f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ym) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231879d;
        long j17 = this.f231880e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f231879d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        df2.cn cnVar = this.f231881f;
        com.tencent.mars.xlog.Log.i(cnVar.f229892p, "dismiss after delay " + j17);
        cnVar.n7("delayDismissJob", false);
        return jz5.f0.f302826a;
    }
}
