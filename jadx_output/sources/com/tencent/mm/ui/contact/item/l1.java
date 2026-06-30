package com.tencent.mm.ui.contact.item;

/* loaded from: classes.dex */
public final class l1 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f206892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.q1 f206893e;

    public l1(java.util.ArrayList arrayList, com.tencent.mm.ui.contact.item.q1 q1Var) {
        this.f206892d = arrayList;
        this.f206893e = q1Var;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        androidx.recyclerview.widget.RecyclerView o17;
        com.tencent.mm.ui.contact.item.q1 q1Var;
        java.util.ArrayList arrayList;
        com.tencent.mm.ui.contact.v8 v8Var;
        com.tencent.mm.ui.contact.w8 w8Var;
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("RecentForwardListDataItem", "onItemLongClick() called with: adapter = " + adapter + ", view = " + view + ", position = " + i17 + ", holder = " + holder);
        if (((com.tencent.mm.ui.contact.v8) this.f206892d.get(i17)).f207221e != 1 && (o17 = holder.o()) != null && (arrayList = (q1Var = this.f206893e).C) != null && (v8Var = (com.tencent.mm.ui.contact.v8) arrayList.get(i17)) != null && (w8Var = v8Var.f207220d) != null && (str = w8Var.f207231a) != null) {
            rl5.r rVar = q1Var.F;
            if (rVar != null) {
                rVar.a();
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = o17.getLayoutManager();
            android.view.View findViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i17) : null;
            android.view.View findViewById = findViewByPosition != null ? findViewByPosition.findViewById(com.tencent.mm.R.id.a9o) : null;
            if (findViewById == null) {
                findViewById = findViewByPosition;
            }
            if (findViewById != null) {
                rl5.r rVar2 = new rl5.r(findViewById.getContext());
                rVar2.C = true;
                rVar2.L = new com.tencent.mm.ui.contact.item.m1(q1Var);
                q1Var.F = rVar2;
                int[] iArr = {0, 0};
                findViewById.getLocationInWindow(iArr);
                com.tencent.mm.ui.contact.item.n1 n1Var = new com.tencent.mm.ui.contact.item.n1(q1Var, str, i17);
                int f17 = i65.a.f(findViewById.getContext(), com.tencent.mm.R.dimen.f479646bl);
                rl5.r rVar3 = q1Var.F;
                if (rVar3 != null) {
                    int width = (int) (iArr[0] + (findViewById.getWidth() / 2.0f));
                    int i18 = iArr[1] - f17;
                    rVar3.f397354x = n1Var;
                    rVar3.f397338f = findViewByPosition;
                    if (!(findViewByPosition instanceof android.widget.TextView) && (width == 0 || i18 == 0)) {
                        rVar3.l();
                    }
                    rVar3.f397356z.clear();
                    rVar3.f397356z.b(0, com.tencent.mm.R.string.ify, com.tencent.mm.R.raw.icons_filled_delete);
                    if (width == 0 && i18 == 0) {
                        rVar3.m();
                    } else {
                        rVar3.n(width, i18);
                    }
                }
                com.tencent.mm.ui.mvvm.uic.conversation.recent.e.q(i17, str);
            }
        }
        return true;
    }
}
