package nr2;

/* loaded from: classes2.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.i1 f339182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f339183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f339184f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(nr2.i1 i1Var, int i17, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339182d = i1Var;
        this.f339183e = i17;
        this.f339184f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr2.e1(this.f339182d, this.f339183e, this.f339184f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nr2.e1 e1Var = (nr2.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f339182d.f339213d;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.notifyItemRangeInserted(this.f339183e, this.f339184f.size());
        nr2.i1 i1Var = this.f339182d;
        nr2.l1 l1Var = i1Var.f339212c;
        if (l1Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        l1Var.d().e(true);
        if (!i1Var.f339217h) {
            nr2.l1 l1Var2 = i1Var.f339212c;
            if (l1Var2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            l1Var2.d().E(true);
        }
        return jz5.f0.f302826a;
    }
}
