package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class l0 extends in5.r {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.textstatus.convert.topic.g0 f173306g = new com.tencent.mm.plugin.textstatus.convert.topic.g0(null);

    /* renamed from: h, reason: collision with root package name */
    public static final float f173307h = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);

    /* renamed from: i, reason: collision with root package name */
    public static final float f173308i;

    /* renamed from: m, reason: collision with root package name */
    public static final float f173309m;

    /* renamed from: n, reason: collision with root package name */
    public static final float f173310n;

    /* renamed from: o, reason: collision with root package name */
    public static final float f173311o;

    /* renamed from: p, reason: collision with root package name */
    public static final float f173312p;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.convert.topic.f0 f173313e;

    /* renamed from: f, reason: collision with root package name */
    public int f173314f;

    static {
        float dimension = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        f173308i = dimension;
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        float dimension2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
        f173309m = dimension2;
        float dimension3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
        f173310n = dimension3;
        if (bk4.i.a().K()) {
            dimension3 = dimension;
        }
        f173311o = dimension3;
        if (!bk4.i.a().K()) {
            dimension = dimension2;
        }
        f173312p = dimension;
    }

    public l0(int i17, com.tencent.mm.plugin.textstatus.convert.topic.f0 arrowCallback) {
        kotlin.jvm.internal.o.g(arrowCallback, "arrowCallback");
        this.f173313e = arrowCallback;
        this.f173314f = -1;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.epx;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.widget.LinearLayout linearLayout;
        com.tencent.mm.plugin.textstatus.convert.topic.l0 l0Var = this;
        nj4.c item = (nj4.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.google.android.flexbox.FlexboxLayout flexboxLayout = (com.google.android.flexbox.FlexboxLayout) holder.p(com.tencent.mm.R.id.iib);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        boolean K = bk4.i.a().K();
        float f17 = f173308i;
        float f18 = K ? f17 : f173310n;
        if (!bk4.i.a().K()) {
            f17 = f173309m;
        }
        java.lang.String str = null;
        if (bk4.i.a().K()) {
            android.view.ViewGroup.LayoutParams layoutParams = flexboxLayout.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart((int) f18);
            }
            if (layoutParams2 != null) {
                layoutParams2.setMarginEnd((int) f17);
            }
            flexboxLayout.setLayoutParams(layoutParams2);
        }
        int childCount = flexboxLayout.getChildCount();
        int i19 = l0Var.f173314f;
        int i27 = 0;
        if (childCount < i19) {
            flexboxLayout.removeAllViews();
            for (int i28 = 0; i28 < i19; i28++) {
                android.view.LayoutInflater.from(flexboxLayout.getContext()).inflate(com.tencent.mm.R.layout.f489570d06, flexboxLayout);
            }
        }
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.textstatus.convert.topic.k0(l0Var, holder, item));
        int i29 = l0Var.f173314f;
        int i37 = 0;
        while (i37 < i29) {
            mj4.h hVar = (mj4.h) kz5.n0.a0(item.f337936d.f5135b, i37);
            android.view.View childAt = flexboxLayout.getChildAt(i37);
            kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) childAt;
            if (hVar == null) {
                viewGroup.setVisibility(4);
            } else {
                viewGroup.setVisibility(i27);
                mj4.k kVar = (mj4.k) hVar;
                if (kotlin.jvm.internal.o.b(kVar.o(), "arrow@name")) {
                    ((android.widget.LinearLayout) viewGroup.findViewById(com.tencent.mm.R.id.ii7)).setVisibility(8);
                    android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.hk9);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i27));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert", "onBindItemView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/textstatus/model/topic/SameTopicFriendGroupColumItem;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(i27)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert", "onBindItemView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/textstatus/model/topic/SameTopicFriendGroupColumItem;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setOnClickListener(new com.tencent.mm.plugin.textstatus.convert.topic.h0(item, l0Var, findViewById, hVar));
                } else {
                    ((android.widget.LinearLayout) viewGroup.findViewById(com.tencent.mm.R.id.ii7)).setVisibility(i27);
                    android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.hk9);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert", "onBindItemView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/textstatus/model/topic/SameTopicFriendGroupColumItem;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(i27)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareGroupColumnConvert", "onBindItemView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/textstatus/model/topic/SameTopicFriendGroupColumItem;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String o17 = kVar.o();
                    ((sg3.a) v0Var).getClass();
                    java.lang.String e17 = c01.a2.e(o17);
                    java.lang.String o18 = kVar.o();
                    java.lang.String h17 = kVar.h();
                    android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.ooa);
                    if (textView != null) {
                        textView.setText(e17);
                    }
                    android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.ooa);
                    if (textView2 != null) {
                        if (kVar.z()) {
                            textView2.setTextColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.FG_2));
                        } else {
                            textView2.setTextColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.f478719fa));
                        }
                    }
                    android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.hke);
                    ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, o18, str);
                    imageView.setTag("status_avatar_".concat(o18));
                    ((android.widget.LinearLayout) viewGroup.findViewById(com.tencent.mm.R.id.ii7)).setOnClickListener(new com.tencent.mm.plugin.textstatus.convert.topic.i0(item, viewGroup, o18, imageView, hVar, h17));
                    if (1 == bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.textstatus.RepairerConfigTextStatusProfileShowDebugInfo()) && ((z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c) && (linearLayout = (android.widget.LinearLayout) viewGroup.findViewById(com.tencent.mm.R.id.ii7)) != null)) {
                        linearLayout.setOnLongClickListener(new com.tencent.mm.plugin.textstatus.convert.topic.j0(hVar, viewGroup));
                    }
                }
            }
            i37++;
            l0Var = this;
            str = null;
            i27 = 0;
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (this.f173314f <= 0) {
            com.tencent.mm.plugin.textstatus.convert.topic.g0 g0Var = f173306g;
            android.content.Context context = recyclerView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f173314f = g0Var.a(context);
        }
        com.google.android.flexbox.FlexboxLayout flexboxLayout = (com.google.android.flexbox.FlexboxLayout) holder.p(com.tencent.mm.R.id.iib);
        kotlin.jvm.internal.o.d(flexboxLayout);
        int i18 = this.f173314f;
        flexboxLayout.removeAllViews();
        for (int i19 = 0; i19 < i18; i19++) {
            android.view.LayoutInflater.from(flexboxLayout.getContext()).inflate(com.tencent.mm.R.layout.f489570d06, flexboxLayout);
        }
    }
}
