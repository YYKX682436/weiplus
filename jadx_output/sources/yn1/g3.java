package yn1;

/* loaded from: classes11.dex */
public final class g3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463676e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(yn1.a4 a4Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463675d = a4Var;
        this.f463676e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.g3(this.f463675d, this.f463676e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yn1.g3 g3Var = (yn1.g3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String A = kn1.k.A();
        yn1.a4 a4Var = this.f463675d;
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[getWifiNameAsync] wifiName=" + A);
        com.tencent.wechat.aff.migration.a aVar2 = a4Var.f463609d;
        if (aVar2 != null) {
            if (A == null) {
                A = "";
            }
            aVar2.K(this.f463676e, A);
        }
        return jz5.f0.f302826a;
    }
}
