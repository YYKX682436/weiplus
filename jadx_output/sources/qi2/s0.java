package qi2;

/* loaded from: classes3.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f363621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi2.w0 f363622e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(xg2.h hVar, kotlin.coroutines.Continuation continuation, qi2.w0 w0Var) {
        super(2, continuation);
        this.f363621d = hVar;
        this.f363622e = w0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qi2.s0(this.f363621d, continuation, this.f363622e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qi2.s0 s0Var = (qi2.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("FinderLivePkGiftSelectPanelWidget", "requestGiftPanelList fail: " + ((xg2.a) ((xg2.b) this.f363621d).f454381b));
        qi2.w0.y(this.f363622e);
        return jz5.f0.f302826a;
    }
}
