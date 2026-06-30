package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f134310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f134311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.n0 f134312f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(boolean z17, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, com.tencent.mm.plugin.finder.viewmodel.component.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f134310d = z17;
        this.f134311e = iResponse;
        this.f134312f = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.f0(this.f134310d, this.f134311e, this.f134312f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.f0 f0Var = (com.tencent.mm.plugin.finder.viewmodel.component.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        f0Var.invokeSuspend(f0Var2);
        return f0Var2;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.recyclerview.widget.f2 adapter;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f134310d;
        com.tencent.mm.plugin.finder.viewmodel.component.n0 n0Var = this.f134312f;
        if (z17) {
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = this.f134311e;
            java.util.List incrementList = iResponse.getIncrementList();
            kotlin.jvm.internal.o.e(incrementList, "null cannot be cast to non-null type kotlin.collections.List<out com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListItem>");
            if (incrementList.isEmpty()) {
                com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.plugin.finder.viewmodel.component.n0.f135226s;
                n0Var.R6(true, false, false);
            } else {
                com.tencent.mm.sdk.platformtools.r2 r2Var2 = com.tencent.mm.plugin.finder.viewmodel.component.n0.f135226s;
                n0Var.getRlLayout().getCommonConfig().f330193c = false;
                androidx.recyclerview.widget.RecyclerView recyclerView = n0Var.getRlLayout().getRecyclerView();
                if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                    java.util.Iterator it = incrementList.iterator();
                    boolean z18 = false;
                    int i17 = 0;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        java.util.ArrayList arrayList = n0Var.f135234n;
                        if (hasNext) {
                            java.lang.Object next = it.next();
                            int i18 = i17 + 1;
                            if (i17 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            com.tencent.mm.plugin.finder.viewmodel.component.t tVar = (com.tencent.mm.plugin.finder.viewmodel.component.t) next;
                            if (i17 == 0) {
                                z18 = true;
                            }
                            com.tencent.mm.plugin.finder.viewmodel.component.t tVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.t) kz5.n0.a0(arrayList, i17);
                            if (!(tVar2 != null && tVar2.getItemId() == tVar.getItemId())) {
                                z18 = false;
                            }
                            ya2.h.f460484a.j(tVar.f135948d);
                            i17 = i18;
                        } else {
                            com.tencent.mars.xlog.Log.i("Finder.AccountRecommendListUIC", "finderUsername=" + n0Var.P6() + " isSameFirstPage=" + z18);
                            if (!z18) {
                                arrayList.clear();
                                arrayList.addAll(incrementList);
                                adapter.notifyDataSetChanged();
                            }
                        }
                    }
                }
                n0Var.R6(true, true, false);
            }
            com.tencent.mm.plugin.finder.viewmodel.component.n0.f135226s.put(n0Var.P6(), incrementList);
            if (iResponse.getHasMore()) {
                n0Var.getRlLayout().i(true);
            } else {
                n0Var.getRlLayout().k();
            }
        } else {
            com.tencent.mm.sdk.platformtools.r2 r2Var3 = com.tencent.mm.plugin.finder.viewmodel.component.n0.f135226s;
            n0Var.R6(false, true, false);
            n0Var.getRlLayout().i(false);
        }
        return jz5.f0.f302826a;
    }
}
