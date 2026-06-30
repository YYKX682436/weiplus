package rx3;

/* loaded from: classes10.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx3.z f401072d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(rx3.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f401072d = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rx3.w(this.f401072d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rx3.w wVar = (rx3.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        wVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ((java.util.ArrayList) this.f401072d.f401055a).clear();
        return jz5.f0.f302826a;
    }
}
