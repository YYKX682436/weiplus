package ee5;

/* loaded from: classes5.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.h0 f251874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ee5.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251874d = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ee5.f0(this.f251874d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ee5.f0 f0Var = (ee5.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        f0Var.invokeSuspend(f0Var2);
        return f0Var2;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("go to show ");
        ee5.h0 h0Var = this.f251874d;
        sb6.append(h0Var.f251897f);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", sb6.toString());
        com.tencent.mm.ui.widget.dialog.u3 u3Var = h0Var.E;
        if (u3Var != null) {
            u3Var.show();
        }
        return jz5.f0.f302826a;
    }
}
