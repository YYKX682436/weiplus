package fq5;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f265673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wedrop.ui.code.TransferFileUIC f265674e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265674e = transferFileUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fq5.k(this.f265674e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fq5.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f265673d;
        com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC = this.f265674e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            jq5.l lVar = jq5.n.f301282a;
            android.app.Activity context = transferFileUIC.getContext();
            this.f265673d = 1;
            obj = lVar.g(context, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            jq5.b.f301255a.b().G("is_first_receive", false);
            transferFileUIC.U6();
        }
        return jz5.f0.f302826a;
    }
}
