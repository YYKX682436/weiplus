package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class y5 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d6 f120414d;

    public y5(com.tencent.mm.plugin.finder.live.widget.d6 d6Var) {
        this.f120414d = d6Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.finder.live.widget.d6 d6Var = this.f120414d;
        java.util.Iterator it = d6Var.f118067i.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((cm2.p) next).f43373d == 2 && (wxRecyclerAdapter = d6Var.f118066h) != null) {
                wxRecyclerAdapter.notifyItemChanged(i17, str);
            }
            i17 = i18;
        }
    }
}
