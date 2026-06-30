package qr3;

/* loaded from: classes.dex */
public final class i extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f366090d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f366091e;

    public i(kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        qr3.i iVar = new qr3.i((kotlin.coroutines.Continuation) obj3);
        iVar.f366090d = (o01.a) obj;
        iVar.f366091e = (o01.a) obj2;
        return iVar.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return new jz5.l((o01.a) this.f366090d, (o01.a) this.f366091e);
    }
}
