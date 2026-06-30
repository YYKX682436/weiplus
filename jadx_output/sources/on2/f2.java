package on2;

/* loaded from: classes3.dex */
public final class f2 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.lottery.history.n f346906e;

    /* renamed from: f, reason: collision with root package name */
    public int f346907f;

    public f2(com.tencent.mm.plugin.finder.lottery.history.n presenter) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f346906e = presenter;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.atu;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        r45.gz1 gz1Var;
        r45.vd4 vd4Var;
        so2.b3 item = (so2.b3) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        holder.f293125i = item;
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d l17 = g1Var.l();
        r45.zy1 zy1Var = item.f410268d;
        mn2.n nVar = new mn2.n(zy1Var.getString(2), null, 2, null);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.isp);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        l17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f329961o));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.iss);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        boolean z18 = true;
        java.lang.String string = zy1Var.getString(1);
        ((ke0.e) xVar).getClass();
        android.content.Context context = holder.f293121e;
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
        java.lang.String string2 = zy1Var.getString(6);
        if (string2 == null || string2.length() == 0) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.isq)).setVisibility(8);
        } else {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.isq)).setText(zy1Var.getString(6));
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.isq)).setVisibility(0);
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.mld);
        com.tencent.mm.plugin.finder.lottery.history.n nVar2 = this.f346906e;
        int i19 = (!nVar2.f120848h || nVar2.f120849i || nVar2.f120850m) ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLotteryWinnerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLotteryWinnerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setOnClickListener(new on2.d2(item, holder, this));
        if (p18.getVisibility() == 0 && this.f346907f == 0) {
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f484939g03);
            this.f346907f = java.lang.Math.max(context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479714d7), ((int) textView2.getPaint().measureText(textView2.getText().toString())) + context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz));
        }
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.iss)).setPadding(0, 0, this.f346907f, 0);
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.isq)).setPadding(0, 0, this.f346907f, 0);
        android.view.View p19 = holder.p(com.tencent.mm.R.id.q39);
        r45.iz1 iz1Var = (r45.iz1) zy1Var.getCustom(7);
        int i27 = iz1Var != null && iz1Var.getBoolean(1) ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p19, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLotteryWinnerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLotteryWinnerData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) holder.p(com.tencent.mm.R.id.q6y);
        r45.iz1 iz1Var2 = (r45.iz1) zy1Var.getCustom(7);
        java.util.LinkedList list2 = iz1Var2 != null ? iz1Var2.getList(0) : null;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = nVar2.f122551d;
        kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader");
        r45.cz1 cz1Var = ((com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryListLoader) baseFeedLoader).f107489m;
        java.util.List list3 = (cz1Var == null || (gz1Var = (r45.gz1) cz1Var.getCustom(14)) == null || (vd4Var = (r45.vd4) gz1Var.getCustom(2)) == null) ? null : vd4Var.getList(1);
        if (list3 == null) {
            list3 = kz5.p0.f313996d;
        }
        if (list2 != null && !list2.isEmpty()) {
            z18 = false;
        }
        if (z18) {
            recyclerView.setVisibility(8);
            return;
        }
        recyclerView.setVisibility(0);
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        on2.c2 c2Var = adapter instanceof on2.c2 ? (on2.c2) adapter : null;
        if (c2Var != null) {
            java.util.List a17 = rn2.y2.f397925e.a(list2, list3);
            java.util.ArrayList arrayList3 = (java.util.ArrayList) c2Var.f346858d;
            arrayList3.clear();
            arrayList3.addAll(a17);
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) holder.p(com.tencent.mm.R.id.f484939g03)).getPaint(), 0.8f);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.mld);
        p17.post(new on2.e2(p17));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) holder.p(com.tencent.mm.R.id.q6y);
        recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView2.setAdapter(new on2.c2());
    }
}
