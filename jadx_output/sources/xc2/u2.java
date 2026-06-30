package xc2;

/* loaded from: classes2.dex */
public final class u2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f453311d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f453312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f453313f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453313f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        xc2.u2 u2Var = new xc2.u2(this.f453313f, continuation);
        u2Var.f453312e = obj;
        return u2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc2.u2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f453311d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f453312e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadTopicInfo: preload topic eventTopicId = ");
            long j17 = this.f453313f;
            sb6.append(j17);
            com.tencent.mars.xlog.Log.i("Finder.JumperUtils", sb6.toString());
            xc2.t2 t2Var = new xc2.t2(j17);
            oz5.l f11582e = y0Var.getF11582e();
            int i18 = kotlinx.coroutines.r2.O0;
            bz2.a aVar2 = new bz2.a(t2Var, (kotlinx.coroutines.r2) f11582e.get(kotlinx.coroutines.q2.f310571d), null, 4, null);
            this.f453311d = 1;
            if (ay1.l.h(aVar2, this) == aVar) {
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
