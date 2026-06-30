package yn1;

/* loaded from: classes11.dex */
public final class a3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f463604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f463605f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(yn1.a4 a4Var, java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463603d = a4Var;
        this.f463604e = str;
        this.f463605f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.a3(this.f463603d, this.f463604e, this.f463605f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yn1.a3 a3Var = (yn1.a3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17 = this.f463605f;
        yn1.a4 a4Var = this.f463603d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            a4Var.b().d(this.f463604e);
            com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[disconnectDeviceAsync] success=true");
            com.tencent.wechat.aff.migration.a aVar2 = a4Var.f463609d;
            if (aVar2 != null) {
                aVar2.i(j17, true);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(a4Var.f463606a, "[disconnectDeviceAsync] error", e17);
            com.tencent.wechat.aff.migration.a aVar3 = a4Var.f463609d;
            if (aVar3 != null) {
                aVar3.i(j17, false);
            }
        }
        return jz5.f0.f302826a;
    }
}
