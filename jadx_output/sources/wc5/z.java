package wc5;

/* loaded from: classes4.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.c0 f444668d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(wc5.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444668d = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wc5.z(this.f444668d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wc5.z zVar = (wc5.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        zVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List list = wc5.c0.f444539h;
        wc5.c0 c0Var = this.f444668d;
        c0Var.W6();
        c0Var.f444543g = kz5.p0.f313996d;
        return jz5.f0.f302826a;
    }
}
