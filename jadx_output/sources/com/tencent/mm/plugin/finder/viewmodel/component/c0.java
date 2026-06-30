package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f133938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.n0 f133939e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f133940f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(boolean z17, com.tencent.mm.plugin.finder.viewmodel.component.n0 n0Var, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f133938d = z17;
        this.f133939e = n0Var;
        this.f133940f = iResponse;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.c0(this.f133938d, this.f133939e, this.f133940f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.c0 c0Var = (com.tencent.mm.plugin.finder.viewmodel.component.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.recyclerview.widget.f2 adapter;
        java.util.List incrementList;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f133938d;
        com.tencent.mm.plugin.finder.viewmodel.component.n0 n0Var = this.f133939e;
        if (z17) {
            com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.plugin.finder.viewmodel.component.n0.f135226s;
            androidx.recyclerview.widget.RecyclerView recyclerView = n0Var.getRlLayout().getRecyclerView();
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = this.f133940f;
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null && (incrementList = iResponse.getIncrementList()) != null) {
                if (!(!incrementList.isEmpty())) {
                    incrementList = null;
                }
                if (incrementList != null) {
                    int size = n0Var.f135234n.size();
                    n0Var.f135234n.addAll(incrementList);
                    adapter.notifyItemRangeInserted(size, incrementList.size());
                }
            }
            if (iResponse.getHasMore()) {
                n0Var.getRlLayout().e(true);
            } else {
                n0Var.getRlLayout().f();
            }
        } else {
            com.tencent.mm.sdk.platformtools.r2 r2Var2 = com.tencent.mm.plugin.finder.viewmodel.component.n0.f135226s;
            n0Var.getRlLayout().e(false);
        }
        return jz5.f0.f302826a;
    }
}
