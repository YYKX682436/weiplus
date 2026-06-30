package dz4;

/* loaded from: classes11.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.u2 f245356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f245357e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(dz4.u2 u2Var, android.app.Activity activity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245356d = u2Var;
        this.f245357e = activity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz4.n2(this.f245356d, this.f245357e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dz4.n2 n2Var = (dz4.n2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.app.Activity activity = this.f245357e;
        java.lang.String string = activity.getString(com.tencent.mm.R.string.f489711k);
        dz4.u2 u2Var = this.f245356d;
        u2Var.f245427b = db5.e1.Q(activity, "", string, false, true, new dz4.m2(u2Var));
        return jz5.f0.f302826a;
    }
}
