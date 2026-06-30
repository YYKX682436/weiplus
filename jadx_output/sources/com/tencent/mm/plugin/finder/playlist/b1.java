package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f122264e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.mm.plugin.finder.playlist.s1 s1Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f122263d = s1Var;
        this.f122264e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.playlist.b1(this.f122263d, this.f122264e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.playlist.b1 b1Var = (com.tencent.mm.plugin.finder.playlist.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.playlist.s1 s1Var = this.f122263d;
        com.tencent.mm.plugin.finder.playlist.l0 l0Var = s1Var.f122425e;
        if (l0Var == null) {
            kotlin.jvm.internal.o.o("viewCallBack");
            throw null;
        }
        l0Var.v();
        com.tencent.mm.plugin.finder.playlist.l0 l0Var2 = s1Var.f122425e;
        if (l0Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallBack");
            throw null;
        }
        l0Var2.B(new com.tencent.mm.plugin.finder.playlist.a1(s1Var));
        yz5.l lVar = this.f122264e;
        if (lVar != null) {
            s1Var.f122422b.f122296a.clear();
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = s1Var.f122426f;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter.notifyDataSetChanged();
            lVar.invoke(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
