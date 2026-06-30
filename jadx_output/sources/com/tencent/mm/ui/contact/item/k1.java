package com.tencent.mm.ui.contact.item;

/* loaded from: classes9.dex */
public final class k1 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f206888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.q1 f206889e;

    public k1(java.util.ArrayList arrayList, com.tencent.mm.ui.contact.item.q1 q1Var) {
        this.f206888d = arrayList;
        this.f206889e = q1Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        boolean z17;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f206888d;
        if (i17 >= arrayList.size() || i17 < 0) {
            com.tencent.mars.xlog.Log.e("RecentForwardListDataItem", "??? position:" + i17 + ", size:" + arrayList.size());
            return;
        }
        com.tencent.mm.ui.contact.w8 w8Var = ((com.tencent.mm.ui.contact.v8) arrayList.get(i17)).f207220d;
        int i18 = ((com.tencent.mm.ui.contact.v8) arrayList.get(i17)).f207221e;
        com.tencent.mm.ui.contact.item.q1 q1Var = this.f206889e;
        if (i18 == 1) {
            q1Var.i(!w8Var.f207235e);
            if (w8Var.f207235e) {
                com.tencent.mm.ui.mvvm.uic.conversation.recent.e.t();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("RecentForwardListDataItem", "onItemClick() called with: adapter = " + adapter + ", view = " + view + ", position = " + i17 + ", holder = " + holder + ", isDelete=" + w8Var.f207235e + ", isMulti=" + q1Var.f206836e);
        boolean z18 = w8Var.f207235e;
        java.lang.String str = w8Var.f207231a;
        if (z18) {
            com.tencent.mm.ui.contact.item.q1.g(q1Var, str, i17);
            com.tencent.mm.ui.mvvm.uic.conversation.recent.e.r(i17, str);
            return;
        }
        com.tencent.mm.ui.contact.item.f1 f1Var = q1Var.D;
        if (f1Var != null) {
            com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = ((dk5.w3) ((com.tencent.mm.ui.contact.m6) f1Var).f207025a.C).f234976a;
            if (selectConversationUI.E1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "ClickUser=%s", str);
                if (!selectConversationUI.F1.contains(str) && selectConversationUI.c8(true)) {
                    selectConversationUI.Y6();
                    z17 = false;
                    if (z17 && q1Var.f206836e) {
                        w8Var.f207233c = !w8Var.f207233c;
                    }
                    adapter.notifyItemChanged(i17);
                }
                selectConversationUI.V7(str, selectConversationUI.f206446d.getHeaderViewsCount());
                selectConversationUI.e8();
                selectConversationUI.b7().notifyDataSetChanged();
            } else {
                selectConversationUI.U1 = selectConversationUI.f206446d.getHeaderViewsCount();
                selectConversationUI.G7(str);
            }
            if (selectConversationUI.H1) {
                com.tencent.mm.modelstat.b.b(selectConversationUI.S1, 4);
            }
        }
        z17 = true;
        if (z17) {
            w8Var.f207233c = !w8Var.f207233c;
        }
        adapter.notifyItemChanged(i17);
    }
}
