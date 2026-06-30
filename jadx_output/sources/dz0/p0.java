package dz0;

/* loaded from: classes.dex */
public final class p0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244969e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f244969e = str;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        dz0.p0 p0Var = new dz0.p0(this.f244969e, (kotlin.coroutines.Continuation) obj3);
        p0Var.f244968d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        p0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "buildTemplate: " + this.f244969e + " catch " + ((java.lang.Throwable) this.f244968d));
        return jz5.f0.f302826a;
    }
}
