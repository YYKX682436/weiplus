package wj5;

/* loaded from: classes5.dex */
public final class e0 extends wj5.c {

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.ref.WeakReference f446793h;

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f446794e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.tipsbar.d f446795f;

    /* renamed from: g, reason: collision with root package name */
    public final yj5.c0 f446796g;

    public e0(yb5.d ui6, com.tencent.mm.ui.tipsbar.d shareData, yj5.c0 processor) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(shareData, "shareData");
        kotlin.jvm.internal.o.g(processor, "processor");
        this.f446794e = ui6;
        this.f446795f = shareData;
        this.f446796g = processor;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488394s4;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        xj5.n item = (xj5.n) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.omd);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f483487b03);
        com.tencent.mm.ui.anim.content.AnimTextView animTextView = (com.tencent.mm.ui.anim.content.AnimTextView) holder.p(com.tencent.mm.R.id.ole);
        ak5.g0 g0Var = (ak5.g0) i95.n0.c(ak5.g0.class);
        com.tencent.mm.storage.db dbVar = item.f454915u;
        java.lang.String Di = g0Var.Di(dbVar.t0(), dbVar.w0().f372608i);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(Di);
        sb6.append(": ");
        java.lang.String MsgSummary = dbVar.w0().f372607h;
        kotlin.jvm.internal.o.f(MsgSummary, "MsgSummary");
        sb6.append(r26.i0.u(MsgSummary, '\n', ' ', false, 4, null));
        textView.setText(sb6.toString());
        boolean C = c01.v1.C(this.f446794e.x(), en1.a.a());
        if (C) {
            animTextView.setVisibility(0);
        } else {
            animTextView.setVisibility(8);
        }
        com.tencent.mm.ui.tipsbar.d dVar = this.f446795f;
        if (dVar.a()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/TopMsgTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/TopMsgTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            animTextView.setVisibility(8);
        }
        kotlin.jvm.internal.o.d(animTextView);
        p(animTextView, false);
        animTextView.setOnClickListener(new wj5.b0(this, animTextView, holder, item));
        holder.itemView.setOnClickListener(new wj5.c0(this, animTextView, item, holder));
        if (C) {
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            itemView.setOnLongClickListener(null);
        } else {
            android.view.View itemView2 = holder.itemView;
            kotlin.jvm.internal.o.f(itemView2, "itemView");
            n(itemView2, i17, dVar, new wj5.d0(item));
        }
    }

    @Override // wj5.c, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final void p(com.tencent.mm.ui.anim.content.AnimTextView animTextView, boolean z17) {
        kotlin.jvm.internal.o.g(animTextView, "<this>");
        if (q(animTextView)) {
            java.lang.String string = animTextView.getContext().getResources().getString(com.tencent.mm.R.string.jz_);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            int color = animTextView.getContext().getResources().getColor(com.tencent.mm.R.color.f478524a5);
            animTextView.tText = string;
            animTextView.tTextColor = color;
            animTextView.tPaddingLeft = 0;
            animTextView.tPaddingRight = 0;
            animTextView.tBackgroundRes = com.tencent.mm.R.drawable.afm;
            animTextView.tBackgroundShow = false;
            animTextView.tDuration = 200L;
            animTextView.b(z17);
            animTextView.setTag(java.lang.Boolean.FALSE);
        }
        r(animTextView);
    }

    public final boolean q(com.tencent.mm.ui.anim.content.AnimTextView animTextView) {
        kotlin.jvm.internal.o.g(animTextView, "<this>");
        java.lang.Object tag = animTextView.getTag();
        return kotlin.jvm.internal.o.b(tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null, java.lang.Boolean.TRUE);
    }

    public final void r(com.tencent.mm.ui.anim.content.AnimTextView animTextView) {
        kotlin.jvm.internal.o.g(animTextView, "<this>");
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(animTextView, q(animTextView) ? "group_msg_set_top_bar_remove_confirm" : "group_msg_set_top_bar_remove");
        aVar.ik(animTextView, 8, 26356);
    }
}
