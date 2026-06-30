package pr0;

/* loaded from: classes.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f357890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.Runnable runnable, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357890d = runnable;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pr0.m(this.f357890d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pr0.m mVar = (pr0.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Runnable runnable = this.f357890d;
        if (runnable != null) {
            runnable.run();
        }
        return jz5.f0.f302826a;
    }
}
