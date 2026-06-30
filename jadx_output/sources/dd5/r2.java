package dd5;

/* loaded from: classes9.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b15.c f229276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f229277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(b15.c cVar, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229276d = cVar;
        this.f229277e = f9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dd5.r2(this.f229276d, this.f229277e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dd5.r2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent walletQueryRemittanceStatusEvent = new com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent();
        am.y10 y10Var = walletQueryRemittanceStatusEvent.f54971g;
        b15.c cVar = this.f229276d;
        y10Var.f8421a = cVar.y();
        walletQueryRemittanceStatusEvent.e();
        int A0 = this.f229277e.A0();
        boolean z17 = true;
        am.z10 z10Var = walletQueryRemittanceStatusEvent.f54972h;
        if (A0 == 1) {
            z17 = z10Var.f8506b;
        } else if (z10Var.f8506b) {
            z17 = false;
        }
        int i17 = z10Var.f8505a;
        boolean z18 = i17 != -2 ? z17 : false;
        if (i17 <= 0) {
            i17 = cVar.t();
        }
        return new jz5.l(java.lang.Boolean.valueOf(z18), new java.lang.Integer(i17));
    }
}
