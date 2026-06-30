package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.k f121228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.f2 f121229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderRefreshLayout f121230f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121231g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.member.preview.k kVar, androidx.recyclerview.widget.f2 f2Var, com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout, java.lang.String str) {
        super(1);
        this.f121228d = kVar;
        this.f121229e = f2Var;
        this.f121230f = finderRefreshLayout;
        this.f121231g = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList<r45.dr0> linkedList;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        r1 = null;
        java.util.ArrayList arrayList = null;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f121230f;
        if (fVar == null || !fVar.b()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#loadMoreData fail error=");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderMemberPreviewFeedItemUIC", sb6.toString());
            finderRefreshLayout.e(false);
        } else {
            r45.rr0 rr0Var = (r45.rr0) fVar.f70618d;
            com.tencent.mm.plugin.finder.member.preview.k kVar = this.f121228d;
            if (rr0Var != null && (linkedList = rr0Var.f385131d) != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                for (r45.dr0 dr0Var : linkedList) {
                    kotlin.jvm.internal.o.d(dr0Var);
                    arrayList.add(new jo2.b(dr0Var, true, kVar.f121249q == 1, this.f121231g));
                }
            }
            if (arrayList != null) {
                kVar.f121240e.addAll(arrayList);
                androidx.recyclerview.widget.f2 f2Var = this.f121229e;
                if (f2Var != null) {
                    f2Var.notifyItemRangeInserted(kVar.f121240e.size() - arrayList.size(), arrayList.size());
                }
            }
            r45.rr0 rr0Var2 = (r45.rr0) fVar.f70618d;
            kVar.f121241f = rr0Var2.f385132e;
            if (rr0Var2.f385133f == 1) {
                finderRefreshLayout.e(true);
            } else {
                finderRefreshLayout.f();
            }
        }
        return finderRefreshLayout;
    }
}
