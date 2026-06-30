package dz0;

/* loaded from: classes5.dex */
public final class j1 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f244897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244898e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f244898e = maasSdkUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new dz0.j1(this.f244898e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((dz0.j1) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f244897d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "onResume: delay execute");
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = this.f244898e;
            az0.n7 n7Var = maasSdkUIC.f69783d;
            if (n7Var != null) {
                com.tencent.maas.model.time.MJTime mJTime = maasSdkUIC.f69800x;
                kotlin.jvm.internal.o.f(mJTime, "access$getCurPlayTime$p(...)");
                this.f244897d = 1;
                obj = az0.n7.p(n7Var, mJTime, null, this, 2, null);
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
