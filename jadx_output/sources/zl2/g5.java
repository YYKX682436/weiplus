package zl2;

/* loaded from: classes.dex */
public final class g5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f473790d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(xg2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473790d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zl2.g5(this.f473790d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zl2.g5 g5Var = (zl2.g5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("QuotaUtil", "updateQuotaMoneySetting fail " + ((xg2.a) ((xg2.b) this.f473790d).f454381b));
        return jz5.f0.f302826a;
    }
}
