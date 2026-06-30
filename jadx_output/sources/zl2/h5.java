package zl2;

/* loaded from: classes.dex */
public final class h5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f473807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f473808e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(xg2.h hVar, kotlin.coroutines.Continuation continuation, boolean z17) {
        super(2, continuation);
        this.f473807d = hVar;
        this.f473808e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zl2.h5(this.f473807d, continuation, this.f473808e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zl2.h5 h5Var = (zl2.h5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("QuotaUtil", "updateQuotaMoneySetting success " + this.f473808e);
        return jz5.f0.f302826a;
    }
}
