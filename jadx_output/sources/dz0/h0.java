package dz0;

/* loaded from: classes5.dex */
public final class h0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f244865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244867f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(java.lang.String str, com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f244866e = str;
        this.f244867f = maasSdkUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new dz0.h0(this.f244866e, this.f244867f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((dz0.h0) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f244865d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "switchTemplateWithBuildResult: start play " + this.f244866e);
            az0.n7 n7Var = this.f244867f.f69783d;
            if (n7Var != null) {
                this.f244865d = 1;
                obj = az0.n7.p(n7Var, null, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return jz5.f0.f302826a;
    }
}
