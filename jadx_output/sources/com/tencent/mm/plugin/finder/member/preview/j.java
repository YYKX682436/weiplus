package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.k f121232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.f2 f121233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderRefreshLayout f121234f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121235g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.member.preview.k kVar, androidx.recyclerview.widget.f2 f2Var, com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout, java.lang.String str) {
        super(1);
        this.f121232d = kVar;
        this.f121233e = f2Var;
        this.f121234f = finderRefreshLayout;
        this.f121235g = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList<r45.dr0> linkedList;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        r0 = null;
        java.util.ArrayList arrayList = null;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f121234f;
        if (fVar == null || !fVar.b()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#refresh fail error=");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderMemberPreviewFeedItemUIC", sb6.toString());
            return finderRefreshLayout.i(false);
        }
        r45.rr0 rr0Var = (r45.rr0) fVar.f70618d;
        com.tencent.mm.plugin.finder.member.preview.k kVar = this.f121232d;
        if (rr0Var != null && (linkedList = rr0Var.f385131d) != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.dr0 dr0Var : linkedList) {
                kotlin.jvm.internal.o.d(dr0Var);
                arrayList.add(new jo2.b(dr0Var, true, kVar.f121249q == 1, this.f121235g));
            }
        }
        kVar.f121240e.clear();
        if (arrayList != null) {
            kVar.f121240e.addAll(arrayList);
        }
        kVar.f121241f = ((r45.rr0) fVar.f70618d).f385132e;
        androidx.recyclerview.widget.f2 f2Var = this.f121233e;
        if (f2Var != null) {
            f2Var.notifyDataSetChanged();
        }
        if (((r45.rr0) fVar.f70618d).f385133f == 1) {
            finderRefreshLayout.i(true);
        } else {
            finderRefreshLayout.k();
        }
        finderRefreshLayout.getCommonConfig().f330193c = false;
        return jz5.f0.f302826a;
    }
}
