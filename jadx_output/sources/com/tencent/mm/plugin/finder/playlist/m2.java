package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes14.dex */
public final class m2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.p2 f122370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f122371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f122372f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(com.tencent.mm.plugin.finder.playlist.p2 p2Var, int i17, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f122370d = p2Var;
        this.f122371e = i17;
        this.f122372f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.playlist.m2(this.f122370d, this.f122371e, this.f122372f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.playlist.m2 m2Var = (com.tencent.mm.plugin.finder.playlist.m2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        m2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f122370d.f122398d;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.notifyItemRangeInserted(this.f122371e, this.f122372f.size());
        com.tencent.mm.plugin.finder.playlist.p2 p2Var = this.f122370d;
        com.tencent.mm.plugin.finder.playlist.s2 s2Var = p2Var.f122397c;
        if (s2Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        s2Var.d().e(true);
        if (!p2Var.f122403i) {
            com.tencent.mm.plugin.finder.playlist.s2 s2Var2 = p2Var.f122397c;
            if (s2Var2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            s2Var2.d().E(true);
        }
        return jz5.f0.f302826a;
    }
}
