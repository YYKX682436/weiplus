package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class j7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k7 f116414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f116415b;

    public j7(com.tencent.mm.plugin.finder.live.view.k7 k7Var, boolean z17) {
        this.f116414a = k7Var;
        this.f116415b = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        boolean z17;
        r45.v71 v71Var;
        r45.j32 j32Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        boolean z18 = this.f116415b;
        com.tencent.mm.plugin.finder.live.view.k7 k7Var = this.f116414a;
        if (i17 != 0 || fVar.f70616b != 0 || (v71Var = (r45.v71) fVar.f70618d) == null || (j32Var = (r45.j32) v71Var.getCustom(4)) == null) {
            z17 = true;
        } else {
            java.util.LinkedList list = j32Var.getList(0);
            if (list != null) {
                z17 = j32Var.getInteger(1) == 1;
                if (z18) {
                    bm2.x5 x5Var = k7Var.Q;
                    if (x5Var != null) {
                        x5Var.f22432f = list;
                        x5Var.notifyDataSetChanged();
                    }
                } else {
                    bm2.x5 x5Var2 = k7Var.Q;
                    if (x5Var2 != null) {
                        java.util.LinkedList linkedList = x5Var2.f22432f;
                        int size = linkedList != null ? linkedList.size() : 0;
                        if (x5Var2.f22432f == null) {
                            x5Var2.f22432f = new java.util.LinkedList();
                        }
                        java.util.LinkedList linkedList2 = x5Var2.f22432f;
                        if (linkedList2 != null) {
                            linkedList2.addAll(list);
                        }
                        x5Var2.notifyItemRangeInserted(size, list.size());
                    }
                }
            } else {
                z17 = true;
            }
            int integer = j32Var.getInteger(2);
            android.widget.TextView textView = k7Var.L;
            if (textView != null) {
                textView.setText(((com.tencent.mm.ui.MMActivity) k7Var.f118183e).getResources().getString(com.tencent.mm.R.string.dyz, java.lang.Integer.valueOf(integer)));
            }
        }
        if (z17) {
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = k7Var.S;
            if (wxRefreshLayout != null) {
                wxRefreshLayout.e(true);
            }
        } else {
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout2 = k7Var.S;
            if (wxRefreshLayout2 != null) {
                wxRefreshLayout2.f();
            }
        }
        com.tencent.mars.xlog.Log.i(k7Var.H, "#loadData fromHead=" + z18 + ", hasMore=" + z17);
        return jz5.f0.f302826a;
    }
}
