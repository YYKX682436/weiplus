package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class rr extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f119666d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f119667e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f119668f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerView f119669g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f119670h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f119671i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f119672m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f119673n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f119674o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f119675p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f119676q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f119677r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f119678s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f119679t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.LinearLayout f119680u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f119681v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f119682w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f119683x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f119684y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f119685z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr(com.tencent.mm.plugin.finder.live.widget.et etVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f119685z = etVar;
        this.f119666d = (com.tencent.mm.ui.widget.imageview.WeImageView) itemView.findViewById(com.tencent.mm.R.id.u7g);
        this.f119667e = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.uuc);
        this.f119668f = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.uuf);
        this.f119669g = (com.tencent.mm.view.recyclerview.WxRecyclerView) itemView.findViewById(com.tencent.mm.R.id.utp);
        this.f119670h = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.uts);
        this.f119671i = itemView.findViewById(com.tencent.mm.R.id.utr);
        this.f119672m = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.utq);
        this.f119673n = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.utu);
        this.f119674o = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.uto);
        this.f119675p = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.utw);
        this.f119676q = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.utx);
        this.f119677r = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.utz);
        this.f119678s = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.f486419uu0);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) itemView.findViewById(com.tencent.mm.R.id.f486421uu2);
        ((android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.hq7)).setText(etVar.f118183e.getString(com.tencent.mm.R.string.nrd));
        this.f119679t = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.owj);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) itemView.findViewById(com.tencent.mm.R.id.f486420uu1);
        ((android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.hq7)).setText(etVar.f118183e.getString(com.tencent.mm.R.string.f491547nq0));
        this.f119680u = linearLayout2;
        this.f119681v = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.owj);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) linearLayout2.findViewById(com.tencent.mm.R.id.h5n);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(weImageView, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(weImageView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel$PrizeItemViewHolder", "<init>", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        weImageView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(weImageView, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel$PrizeItemViewHolder", "<init>", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(weImageView, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.qr(etVar));
        this.f119682w = weImageView;
        this.f119683x = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.f486423uu4);
        this.f119684y = itemView.findViewById(com.tencent.mm.R.id.f486424uu5);
    }
}
