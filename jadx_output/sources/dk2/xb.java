package dk2;

/* loaded from: classes3.dex */
public final class xb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.ac f234354d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(dk2.ac acVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f234354d = acVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.xb(this.f234354d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dk2.xb xbVar = (dk2.xb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        xbVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f234354d.c();
        return jz5.f0.f302826a;
    }
}
