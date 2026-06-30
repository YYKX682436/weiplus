package i55;

/* loaded from: classes8.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f288854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i55.k f288855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f288856f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i55.k kVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f288855e = kVar;
        this.f288856f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new i55.j(this.f288855e, this.f288856f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((i55.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f288854d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f288854d = 1;
            if (kotlinx.coroutines.k1.b(50L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                i55.b.d(this.f288855e, "onPageResume_delay_check", this.f288856f, null, false, 12, null);
                int i18 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabExposureLogic", "Layout check completed after 50ms delay end", null);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        i55.b.d(this.f288855e, "onPageResume_delay_check", this.f288856f, null, false, 12, null);
        int i19 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabExposureLogic", "Layout check completed after 50ms delay", null);
        this.f288854d = 2;
        if (kotlinx.coroutines.k1.b(50L, this) == aVar) {
            return aVar;
        }
        i55.b.d(this.f288855e, "onPageResume_delay_check", this.f288856f, null, false, 12, null);
        int i182 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabExposureLogic", "Layout check completed after 50ms delay end", null);
        return jz5.f0.f302826a;
    }
}
