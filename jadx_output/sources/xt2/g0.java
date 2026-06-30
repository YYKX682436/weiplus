package xt2;

/* loaded from: classes3.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f456759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopCountDownAnimView f456760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f456761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.t42 f456762g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f456763h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopCountDownAnimView finderLiveShopCountDownAnimView, long j17, r45.t42 t42Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f456760e = finderLiveShopCountDownAnimView;
        this.f456761f = j17;
        this.f456762g = t42Var;
        this.f456763h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.g0(this.f456760e, this.f456761f, this.f456762g, this.f456763h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f456759d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopCountDownAnimView finderLiveShopCountDownAnimView = this.f456760e;
            long j17 = this.f456761f;
            r45.t42 t42Var = this.f456762g;
            java.lang.String str = this.f456763h;
            this.f456759d = 1;
            if (com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopCountDownAnimView.a(finderLiveShopCountDownAnimView, j17, t42Var, str, this) == aVar) {
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
