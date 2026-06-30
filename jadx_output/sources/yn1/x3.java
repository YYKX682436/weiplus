package yn1;

/* loaded from: classes11.dex */
public final class x3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f463918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f463920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f463921g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(yn1.a4 a4Var, java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463919e = a4Var;
        this.f463920f = str;
        this.f463921g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.x3(this.f463919e, this.f463920f, this.f463921g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.x3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f463918d;
        long j17 = this.f463921g;
        boolean z17 = true;
        yn1.a4 a4Var = this.f463919e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                yn1.z0 z0Var = yn1.z0.f463933a;
                vn1.m b17 = a4Var.b();
                java.lang.String str = this.f463920f;
                this.f463918d = 1;
                obj = z0Var.s(b17, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            com.tencent.wechat.aff.migration.a aVar2 = a4Var.f463609d;
            if (aVar2 != null) {
                if (!booleanValue) {
                    z17 = false;
                }
                aVar2.x(j17, z17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(a4Var.f463606a, "[startBLEScanningAsync] error", e17);
            com.tencent.wechat.aff.migration.a aVar3 = a4Var.f463609d;
            if (aVar3 != null) {
                aVar3.x(j17, false);
            }
        }
        return jz5.f0.f302826a;
    }
}
