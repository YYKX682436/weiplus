package qg3;

/* loaded from: classes.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f362802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f362803e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(android.app.Activity activity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362803e = activity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qg3.a1 a1Var = new qg3.a1(this.f362803e, continuation);
        a1Var.f362802d = obj;
        return a1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qg3.a1 a1Var = (qg3.a1) create((xg2.a) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        pm0.v.X(new qg3.z0(this.f362803e, (xg2.a) this.f362802d));
        return jz5.f0.f302826a;
    }
}
