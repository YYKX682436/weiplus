package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class m5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFansListUI f129506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v51 f129507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI, r45.v51 v51Var) {
        super(0);
        this.f129506d = finderFansListUI;
        this.f129507e = v51Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList list = this.f129507e.getList(5);
        int i17 = com.tencent.mm.plugin.finder.ui.FinderFansListUI.D;
        com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI = this.f129506d;
        finderFansListUI.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fans contact ");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderFansListUI", sb6.toString());
        if (list != null) {
            java.util.ArrayList arrayList = finderFansListUI.f128569w;
            arrayList.addAll(list);
            com.tencent.mm.plugin.finder.ui.e eVar = finderFansListUI.f128568v;
            eVar.c(arrayList);
            eVar.notifyDataSetChanged();
        }
        if (!finderFansListUI.f128570x) {
            com.tencent.mm.plugin.finder.ui.FinderFansListUI.c7(finderFansListUI);
        }
        return jz5.f0.f302826a;
    }
}
