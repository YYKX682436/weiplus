package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class vl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f136254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.zl f136255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f136256f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(boolean z17, com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136254d = z17;
        this.f136255e = zlVar;
        this.f136256f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.vl(this.f136254d, this.f136255e, this.f136256f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.vl vlVar = (com.tencent.mm.plugin.finder.viewmodel.component.vl) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vlVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f136254d;
        java.util.List list = this.f136256f;
        com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar = this.f136255e;
        if (z17) {
            java.util.ArrayList feeds = zlVar.f136691f.f122296a;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = zlVar.f136700r;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            boolean z18 = !list.isEmpty();
            kotlin.jvm.internal.o.g(feeds, "feeds");
            so2.j5 j5Var = (so2.j5) kz5.n0.k0(feeds);
            if (j5Var != null && (j5Var instanceof qr2.f)) {
                kz5.h0.E(feeds);
                if (z18) {
                    wxRecyclerAdapter.notifyItemRemoved(feeds.size());
                }
            }
            int size = zlVar.f136691f.f122296a.size();
            zlVar.f136691f.f122296a.addAll(list);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = zlVar.f136700r;
            if (wxRecyclerAdapter2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter2.notifyItemRangeInserted(size, list.size());
        } else {
            java.util.ArrayList feeds2 = zlVar.f136691f.f122296a;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = zlVar.f136700r;
            if (wxRecyclerAdapter3 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            boolean z19 = !list.isEmpty();
            kotlin.jvm.internal.o.g(feeds2, "feeds");
            so2.j5 j5Var2 = (so2.j5) kz5.n0.Z(feeds2);
            if (j5Var2 != null && (j5Var2 instanceof qr2.i)) {
                kz5.h0.C(feeds2);
                if (z19) {
                    wxRecyclerAdapter3.notifyItemRemoved(0);
                }
            }
            zlVar.f136691f.f122296a.addAll(0, list);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter4 = zlVar.f136700r;
            if (wxRecyclerAdapter4 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter4.notifyItemRangeInserted(0, list.size());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.zl.P6(zlVar, z17);
        return jz5.f0.f302826a;
    }
}
