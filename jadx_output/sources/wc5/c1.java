package wc5;

/* loaded from: classes10.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.k1 f444544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xm3.t0 f444545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f444546f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(wc5.k1 k1Var, xm3.t0 t0Var, com.tencent.mm.ui.widget.dialog.f4 f4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444544d = k1Var;
        this.f444545e = t0Var;
        this.f444546f = f4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wc5.c1(this.f444544d, this.f444545e, this.f444546f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wc5.c1 c1Var = (wc5.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        uc5.b bVar = new uc5.b(true);
        xm3.t0 t0Var = this.f444545e;
        wc5.k1 k1Var = this.f444544d;
        wc5.k1.T6(k1Var, t0Var, bVar);
        k1Var.f444592e = k1Var.U6().size();
        k1Var.X6();
        this.f444546f.dismiss();
        return jz5.f0.f302826a;
    }
}
