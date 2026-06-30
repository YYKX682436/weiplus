package com.tencent.mm.plugin.finder.lottery.history;

/* loaded from: classes.dex */
public final class j extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.atr;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.z2 item = (so2.z2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        r45.q94 q94Var = item.f410731d;
        java.util.LinkedList list2 = q94Var.getList(1);
        kotlin.jvm.internal.o.f(list2, "getRecord_list(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((r45.xc5) next).getInteger(0) == 2) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        java.util.LinkedList list3 = q94Var.getList(1);
        kotlin.jvm.internal.o.f(list3, "getRecord_list(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list3) {
            if (((r45.xc5) obj).getInteger(0) == 1) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        android.content.Context context = holder.f293121e;
        if (size > 0 || size2 > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (size > 0) {
                sb6.append(context.getString(com.tencent.mm.R.string.nri, java.lang.Integer.valueOf(size)));
            }
            if (sb6.length() > 0) {
                sb6.append(",");
            }
            if (size2 > 0) {
                sb6.append(context.getString(com.tencent.mm.R.string.nre, java.lang.Integer.valueOf(size2)));
            }
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.ir6)).setText(context.getString(com.tencent.mm.R.string.nrf, sb6.toString()));
        } else {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.ir6)).setText("");
        }
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.irm)).setText(context.getString(com.tencent.mm.R.string.dqq, k35.m1.g(context.getString(com.tencent.mm.R.string.dqs), q94Var.getInteger(2) * 1000)));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
