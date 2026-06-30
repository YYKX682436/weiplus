package dd5;

/* loaded from: classes9.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b15.c f229287d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(b15.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229287d = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dd5.s2(this.f229287d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dd5.s2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.autogen.events.WalletQueryHbStatusEvent walletQueryHbStatusEvent = new com.tencent.mm.autogen.events.WalletQueryHbStatusEvent();
        walletQueryHbStatusEvent.f54969g.f8253a = this.f229287d.p();
        walletQueryHbStatusEvent.e();
        am.x10 x10Var = walletQueryHbStatusEvent.f54970h;
        return new jz5.o(new java.lang.Integer(x10Var.f8335a), new java.lang.Integer(x10Var.f8336b), new java.lang.Integer(x10Var.f8337c));
    }
}
