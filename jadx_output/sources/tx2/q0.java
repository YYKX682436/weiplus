package tx2;

/* loaded from: classes10.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f422639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.notice.NoticeStatusView f422640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f422641f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f422640e = noticeStatusView;
        this.f422641f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tx2.q0(this.f422640e, this.f422641f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tx2.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f422639d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.h32 h32Var = (r45.h32) this.f422641f.invoke();
            this.f422639d = 1;
            int i18 = com.tencent.mm.plugin.finder.view.notice.NoticeStatusView.f132732w;
            if (this.f422640e.b(h32Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
