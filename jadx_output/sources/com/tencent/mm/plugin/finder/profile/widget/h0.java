package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.k0 f124563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f124564e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.finder.profile.widget.k0 k0Var, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f124563d = k0Var;
        this.f124564e = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List incrementList = this.f124564e.getIncrementList();
        com.tencent.mm.plugin.finder.profile.widget.k0 k0Var = this.f124563d;
        k0Var.f124596f = incrementList;
        if (!(incrementList == null || incrementList.isEmpty())) {
            com.tencent.mm.plugin.finder.profile.view.FinderFollowMoreView a17 = k0Var.a();
            java.util.List list = k0Var.f124596f;
            kotlin.jvm.internal.o.d(list);
            a17.getClass();
            java.util.ArrayList arrayList = a17.f124442h;
            arrayList.clear();
            arrayList.addAll(list);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = a17.f124441g;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
        }
        return jz5.f0.f302826a;
    }
}
