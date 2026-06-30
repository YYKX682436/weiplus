package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class l6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.p6 f135024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f135025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f135026f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(com.tencent.mm.plugin.finder.viewmodel.component.p6 p6Var, int i17, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f135024d = p6Var;
        this.f135025e = i17;
        this.f135026f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.l6(this.f135024d, this.f135025e, this.f135026f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.l6 l6Var = (com.tencent.mm.plugin.finder.viewmodel.component.l6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.viewmodel.component.p6 p6Var = this.f135024d;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = p6Var.f135524m;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.notifyItemRangeInserted(this.f135025e, this.f135026f.size());
        p6Var.getRlLayout().e(true);
        if (!p6Var.f135529r) {
            p6Var.getRlLayout().E(true);
        }
        return jz5.f0.f302826a;
    }
}
