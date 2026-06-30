package xh4;

/* loaded from: classes.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f454619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.app.Activity activity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f454619d = activity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xh4.n(this.f454619d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xh4.n nVar = (xh4.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.app.Activity activity = this.f454619d;
        db5.t7.h(activity, activity.getString(com.tencent.mm.R.string.k68));
        return jz5.f0.f302826a;
    }
}
