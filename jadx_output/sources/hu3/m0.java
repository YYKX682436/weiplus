package hu3;

/* loaded from: classes4.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f285155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(boolean z17, hu3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285155d = z17;
        this.f285156e = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hu3.m0(this.f285155d, this.f285156e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hu3.m0 m0Var = (hu3.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        m0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f285155d;
        hu3.n0 n0Var = this.f285156e;
        if (z17) {
            ((hu3.q0) ((jz5.n) n0Var.E).getValue()).b(i65.a.r(n0Var.f285160d.getContext(), com.tencent.mm.R.string.hth));
            ((hu3.q0) ((jz5.n) n0Var.E).getValue()).show();
        } else {
            ((hu3.q0) ((jz5.n) n0Var.E).getValue()).dismiss();
        }
        return jz5.f0.f302826a;
    }
}
