package tc5;

/* loaded from: classes10.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f417565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.n2 f417566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI f417567f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kotlinx.coroutines.flow.n2 n2Var, com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417566e = n2Var;
        this.f417567f = msgHistoryGalleryUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tc5.m(this.f417566e, this.f417567f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((tc5.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f417565d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            tc5.l lVar = new tc5.l(this.f417567f);
            this.f417565d = 1;
            if (this.f417566e.a(lVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
