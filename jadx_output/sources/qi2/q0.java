package qi2;

/* loaded from: classes3.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.w0 f363603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f363604e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(qi2.w0 w0Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363603d = w0Var;
        this.f363604e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qi2.q0(this.f363603d, this.f363604e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qi2.q0 q0Var = (qi2.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        qi2.w0 w0Var = this.f363603d;
        w0Var.f363650n.clear();
        w0Var.f363650n.addAll(this.f363604e);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = w0Var.f363652p;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.notifyDataSetChanged();
        fg2.w0 w0Var2 = w0Var.f363649m;
        if (w0Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        w0Var2.f262387c.setVisibility(8);
        fg2.w0 w0Var3 = w0Var.f363649m;
        if (w0Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        w0Var3.f262388d.setVisibility(0);
        fg2.w0 w0Var4 = w0Var.f363649m;
        if (w0Var4 != null) {
            w0Var4.f262386b.setVisibility(8);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("uiBinding");
        throw null;
    }
}
