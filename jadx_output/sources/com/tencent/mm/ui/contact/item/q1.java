package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public final class q1 extends com.tencent.mm.ui.contact.item.a {
    public java.util.ArrayList C;
    public com.tencent.mm.ui.contact.item.f1 D;
    public com.tencent.mm.ui.contact.item.g1 E;
    public rl5.r F;
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter G;
    public final jz5.g H;
    public final jz5.g I;

    public q1(int i17) {
        super(9, i17);
        this.H = jz5.h.b(new com.tencent.mm.ui.contact.item.o1(this));
        this.I = jz5.h.b(new com.tencent.mm.ui.contact.item.p1(this));
    }

    public static final void g(com.tencent.mm.ui.contact.item.q1 q1Var, java.lang.String str, int i17) {
        b95.j Ai;
        q1Var.getClass();
        com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation pluginMessengerFoundation = (com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class);
        if (pluginMessengerFoundation != null && (Ai = pluginMessengerFoundation.Ai()) != null) {
            Ai.a(str);
        }
        java.util.ArrayList arrayList = q1Var.C;
        if (arrayList != null) {
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = q1Var.G;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
        com.tencent.mm.ui.contact.item.g1 g1Var = q1Var.E;
        if (g1Var != null) {
            com.tencent.mm.ui.contact.p6 p6Var = ((com.tencent.mm.ui.contact.n6) g1Var).f207041a;
            p6Var.f207094y++;
            if (p6Var.f207095z.isEmpty()) {
                p6Var.f207095z = str;
            } else {
                p6Var.f207095z += "｜" + str;
            }
        }
        java.util.ArrayList arrayList2 = q1Var.C;
        if (arrayList2 != null && com.tencent.mm.ui.contact.t8.a(arrayList2)) {
            return;
        }
        q1Var.h(false, (com.tencent.mm.ui.contact.item.h1) ((jz5.n) q1Var.H).getValue());
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public void a(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar) {
        java.util.ArrayList arrayList = this.C;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.ui.contact.item.RecentForwardListDataItem$fillingDataItem$1$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mars.xlog.Log.i("RecentForwardListDataItem", "getItemConvert, type:" + type);
                return new com.tencent.mm.ui.contact.s8(new com.tencent.mm.ui.contact.item.j1(com.tencent.mm.ui.contact.item.q1.this));
            }
        }, arrayList, false);
        this.G = wxRecyclerAdapter;
        wxRecyclerAdapter.f293105o = new com.tencent.mm.ui.contact.item.k1(arrayList, this);
        wxRecyclerAdapter.f293104n = new com.tencent.mm.ui.contact.item.l1(arrayList, this);
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public com.tencent.mm.ui.contact.item.c b() {
        return (com.tencent.mm.ui.contact.item.i1) ((jz5.n) this.I).getValue();
    }

    public final void h(boolean z17, com.tencent.mm.ui.contact.item.h1 h1Var) {
        int i17 = z17 ? 0 : 8;
        android.widget.LinearLayout linearLayout = h1Var.f206874a;
        if (linearLayout != null) {
            linearLayout.setVisibility(i17);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = h1Var.f206875b;
        if (recyclerView != null) {
            recyclerView.setVisibility(i17);
        }
        android.widget.TextView textView = h1Var.f206876c;
        if (textView == null) {
            return;
        }
        textView.setVisibility(i17);
    }

    public final void i(boolean z17) {
        java.util.ArrayList arrayList = this.C;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.ui.contact.v8) it.next()).f207220d.f207235e = z17;
            }
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.G;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
    }
}
