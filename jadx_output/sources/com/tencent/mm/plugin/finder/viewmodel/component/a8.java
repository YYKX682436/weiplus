package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class a8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e8 f133741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f133742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f133743f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(com.tencent.mm.plugin.finder.viewmodel.component.e8 e8Var, int i17, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f133741d = e8Var;
        this.f133742e = i17;
        this.f133743f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.a8(this.f133741d, this.f133742e, this.f133743f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.a8 a8Var = (com.tencent.mm.plugin.finder.viewmodel.component.a8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.viewmodel.component.e8 e8Var = this.f133741d;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = e8Var.f134211m;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.notifyItemRangeInserted(this.f133742e, this.f133743f.size());
        e8Var.getRlLayout().e(true);
        if (!e8Var.f134215q) {
            e8Var.getRlLayout().E(true);
        }
        return jz5.f0.f302826a;
    }
}
