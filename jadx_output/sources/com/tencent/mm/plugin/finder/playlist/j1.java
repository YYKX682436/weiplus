package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f122329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f122331f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(boolean z17, com.tencent.mm.plugin.finder.playlist.s1 s1Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f122329d = z17;
        this.f122330e = s1Var;
        this.f122331f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.playlist.j1(this.f122329d, this.f122330e, this.f122331f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.playlist.j1 j1Var = (com.tencent.mm.plugin.finder.playlist.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f122329d;
        java.util.List list = this.f122331f;
        com.tencent.mm.plugin.finder.playlist.s1 s1Var = this.f122330e;
        if (z17) {
            int size = s1Var.f122422b.f122296a.size();
            s1Var.f122422b.f122296a.addAll(list);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = s1Var.f122426f;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter.notifyItemRangeInserted(size, list.size());
        } else {
            s1Var.f122422b.f122296a.addAll(0, list);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = s1Var.f122426f;
            if (wxRecyclerAdapter2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
        s1Var.g(z17, list.size());
        return jz5.f0.f302826a;
    }
}
