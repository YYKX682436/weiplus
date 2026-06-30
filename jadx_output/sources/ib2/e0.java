package ib2;

/* loaded from: classes2.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib2.i0 f290107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f290108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f290109f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ib2.i0 i0Var, int i17, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290107d = i0Var;
        this.f290108e = i17;
        this.f290109f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ib2.e0(this.f290107d, this.f290108e, this.f290109f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ib2.e0 e0Var = (ib2.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f290107d.f290122d;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.notifyItemRangeInserted(this.f290108e, this.f290109f.size());
        ib2.i0 i0Var = this.f290107d;
        ib2.l0 l0Var = i0Var.f290121c;
        if (l0Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        l0Var.d().e(true);
        if (!i0Var.f290126h) {
            ib2.l0 l0Var2 = i0Var.f290121c;
            if (l0Var2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            l0Var2.d().E(true);
        }
        return jz5.f0.f302826a;
    }
}
