package yn1;

/* loaded from: classes9.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463625e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(yn1.r2 r2Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463624d = r2Var;
        this.f463625e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.c2(this.f463624d, this.f463625e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yn1.c2 c2Var = (yn1.c2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String A = kn1.k.A();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[getWifiNameAsync] wifiName=" + A);
        com.tencent.wechat.aff.migration.g gVar = this.f463624d.f463810a;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
        if (A == null) {
            A = "";
        }
        gVar.K(this.f463625e, A);
        return jz5.f0.f302826a;
    }
}
