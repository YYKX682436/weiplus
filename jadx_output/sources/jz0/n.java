package jz0;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f302608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC f302609e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f302609e = maasFakeVideoPlayUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jz0.n(this.f302609e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jz0.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f302608d;
        com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC = this.f302609e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f302608d = 1;
            if (com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC.O6(maasFakeVideoPlayUIC, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC.P6(maasFakeVideoPlayUIC, !(!maasFakeVideoPlayUIC.f69826o ? maasFakeVideoPlayUIC.U6() : false));
        return jz5.f0.f302826a;
    }
}
