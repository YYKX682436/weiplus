package mx3;

/* loaded from: classes10.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx3.b f332546d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(nx3.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332546d = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx3.e0(this.f332546d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx3.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        vx3.i iVar = this.f332546d.f341359a;
        return iVar == null ? vx3.l.E.b() : iVar;
    }
}
