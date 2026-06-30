package el2;

/* loaded from: classes3.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f253808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253809e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xg2.h hVar, kotlin.coroutines.Continuation continuation, el2.i0 i0Var) {
        super(2, continuation);
        this.f253808d = hVar;
        this.f253809e = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new el2.i(this.f253808d, continuation, this.f253809e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        el2.i iVar = (el2.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f253808d).f454381b;
        el2.i0 i0Var = this.f253809e;
        com.tencent.mars.xlog.Log.i(i0Var.H, "addNotice: getLivePrepare error: " + aVar2);
        db5.t7.makeText(i0Var.f118183e, com.tencent.mm.R.string.msg_net_error, 0).show();
        return jz5.f0.f302826a;
    }
}
