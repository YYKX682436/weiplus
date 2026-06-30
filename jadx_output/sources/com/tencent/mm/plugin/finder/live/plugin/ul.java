package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ul extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f114583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f114584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f114585f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114586g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(com.tencent.mm.plugin.finder.live.plugin.hm hmVar, androidx.recyclerview.widget.RecyclerView recyclerView, int i17, java.lang.String str) {
        super(0);
        this.f114583d = hmVar;
        this.f114584e = recyclerView;
        this.f114585f = i17;
        this.f114586g = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String str2 = this.f114586g;
        java.lang.String str3 = com.tencent.mm.plugin.finder.live.plugin.hm.T1;
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f114583d;
        hmVar.getClass();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        androidx.recyclerview.widget.f2 adapter = this.f114584e.getAdapter();
        bm2.a4 a4Var = adapter instanceof bm2.a4 ? (bm2.a4) adapter : null;
        if (a4Var != null) {
            a4Var.B(false);
        }
        com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView finderLiveGiftTagView = hmVar.f112834u;
        int i17 = finderLiveGiftTagView.selectedTabIndex;
        java.util.List list = finderLiveGiftTagView.f114756g;
        if (list == null || (str = (java.lang.String) list.get(i17)) == null) {
            str = "";
        }
        boolean b17 = kotlin.jvm.internal.o.b(str, str2);
        java.lang.String str4 = hmVar.f112831r;
        if (b17) {
            jz5.l C1 = hmVar.C1();
            java.util.List list2 = (java.util.List) C1.f302833d;
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) C1.f302834e;
            java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) hmVar.y1(list2, linkedHashMap, false).f302834e;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = linkedHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                linkedList.add(new java.util.LinkedList((java.util.Collection) ((java.util.Map.Entry) it.next()).getValue()));
            }
            if (a4Var != null) {
                int itemCount = a4Var.getItemCount();
                a4Var.E(list2, this.f114585f, linkedList, false);
                int itemCount2 = a4Var.getItemCount();
                int i18 = itemCount2 - itemCount;
                ae2.in inVar = ae2.in.f3688a;
                boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.H0).getValue()).r()).intValue() == 1;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[applyLoadMoreResultToAdapter] giftCache:");
                sb6.append(list2.size());
                sb6.append(", eachPage:");
                sb6.append(linkedList.size());
                sb6.append(", tabGifts:");
                java.util.List list3 = (java.util.List) linkedHashMap.get(str2);
                sb6.append(list3 != null ? list3.size() : 0);
                sb6.append(", oldCount:");
                sb6.append(itemCount);
                sb6.append(", newCount:");
                sb6.append(itemCount2);
                sb6.append(", added:");
                sb6.append(i18);
                sb6.append(", optEnabled:");
                sb6.append(z17);
                com.tencent.mars.xlog.Log.i(str4, sb6.toString());
                if (!z17 || i18 <= 0) {
                    a4Var.notifyDataSetChanged();
                } else {
                    a4Var.notifyItemRangeInserted(itemCount, i18);
                }
                com.tencent.mm.plugin.finder.live.plugin.hm.Q1(hmVar, str2, true, 0, i18, android.os.SystemClock.uptimeMillis() - uptimeMillis, false, 32, null);
            }
        } else {
            com.tencent.mars.xlog.Log.i(str4, "[applyLoadMoreResultToAdapter] tab changed, skip update. current:" + str + ", loaded:" + str2);
            hmVar.P1(str2, true, 0, 0, 0L, true);
        }
        return jz5.f0.f302826a;
    }
}
