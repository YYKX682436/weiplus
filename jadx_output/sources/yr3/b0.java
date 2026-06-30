package yr3;

/* loaded from: classes11.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.e0 f464727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f464728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wr3.n0 f464729f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(yr3.e0 e0Var, r45.s5 s5Var, wr3.n0 n0Var, boolean z17) {
        super(1);
        this.f464727d = e0Var;
        this.f464728e = s5Var;
        this.f464729f = n0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.u5 u5Var;
        if (((java.lang.Boolean) obj).booleanValue()) {
            wr3.n0 n0Var = this.f464729f;
            yr3.e0 e0Var = this.f464727d;
            android.view.View view = e0Var.f464788h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = e0Var.f464791n;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            wr3.n0 n0Var2 = wr3.n0.f448843g;
            android.view.View view3 = e0Var.f464794q;
            if (n0Var == n0Var2) {
                a84.y0.p(view3, true);
            } else {
                a84.y0.p(view3, false);
            }
            r45.s5 s5Var = this.f464728e;
            r45.o5 o5Var = (r45.o5) s5Var.f385514i.f382754e.get(0);
            r45.l5 l5Var = s5Var.f385514i.f382753d;
            r45.u5 u5Var2 = o5Var.P;
            java.lang.String str = e0Var.f464785e;
            if (u5Var2 == null) {
                com.tencent.mars.xlog.Log.i(str, "detailInfo.finder_live == null");
            } else {
                yr3.w wVar = yr3.w.f465059a;
                android.content.Context context = e0Var.f464786f;
                android.widget.TextView textView = e0Var.f464792o;
                kotlin.jvm.internal.o.d(textView);
                android.widget.ImageView imageView = e0Var.f464793p;
                kotlin.jvm.internal.o.d(imageView);
                android.view.View view4 = e0Var.f464795r;
                kotlin.jvm.internal.o.d(view4);
                wVar.i(context, textView, imageView, s5Var, n0Var, view4);
                boolean z17 = (com.tencent.mm.sdk.platformtools.t8.K0(o5Var.f381921n) || com.tencent.mm.sdk.platformtools.t8.K0(o5Var.L)) ? false : true;
                android.view.View findViewById = e0Var.itemView.findViewById(com.tencent.mm.R.id.cb7);
                android.view.View findViewById2 = e0Var.itemView.findViewById(com.tencent.mm.R.id.cb8);
                if (z17) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View findViewById3 = e0Var.itemView.findViewById(com.tencent.mm.R.id.cbn);
                    android.widget.ImageView imageView2 = (android.widget.ImageView) e0Var.itemView.findViewById(com.tencent.mm.R.id.cbm);
                    com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) findViewById3.findViewById(com.tencent.mm.R.id.f4x);
                    com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget2 = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) findViewById3.findViewById(com.tencent.mm.R.id.exa);
                    android.widget.TextView textView2 = (android.widget.TextView) e0Var.itemView.findViewById(com.tencent.mm.R.id.cbo);
                    android.widget.TextView textView3 = (android.widget.TextView) e0Var.itemView.findViewById(com.tencent.mm.R.id.cbq);
                    textView2.setText(o5Var.f381913d);
                    textView3.setVisibility(8);
                    r45.nw1 g17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).g(u5Var2.f387031f);
                    eq1.h hVar = eq1.h.f255812a;
                    kotlin.jvm.internal.o.d(finderLiveOnliveWidget);
                    kotlin.jvm.internal.o.d(finderLiveOnliveWidget2);
                    hVar.j(g17, finderLiveOnliveWidget, finderLiveOnliveWidget2);
                    textView2.setTag(com.tencent.mm.R.id.bph, u5Var2.f387031f);
                    u5Var = u5Var2;
                    hVar.f(u5Var2.f387030e, u5Var2.f387031f, new yr3.c0(e0Var, u5Var2, textView2, finderLiveOnliveWidget, finderLiveOnliveWidget2, textView3));
                    android.content.Context context2 = e0Var.f464786f;
                    int B = i65.a.B(context2) - i65.a.b(context2, 16);
                    int i17 = (int) (B * 0.5625d);
                    android.view.ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ((android.view.ViewGroup.MarginLayoutParams) ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams)).height = i17;
                    com.tencent.mars.xlog.Log.i(str, "setCover, coverUrl = " + o5Var.L + ", cardHeight = " + i17 + ", cardWidth = " + B);
                    kotlin.jvm.internal.o.d(imageView2);
                    hVar.l(imageView2, o5Var.L, null);
                } else {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View findViewById4 = e0Var.itemView.findViewById(com.tencent.mm.R.id.cb7);
                    android.widget.ImageView imageView3 = (android.widget.ImageView) e0Var.itemView.findViewById(com.tencent.mm.R.id.cba);
                    android.widget.ImageView imageView4 = (android.widget.ImageView) e0Var.itemView.findViewById(com.tencent.mm.R.id.cbf);
                    android.widget.TextView textView4 = (android.widget.TextView) e0Var.itemView.findViewById(com.tencent.mm.R.id.cbg);
                    android.widget.TextView textView5 = (android.widget.TextView) e0Var.itemView.findViewById(com.tencent.mm.R.id.cbh);
                    android.widget.TextView textView6 = (android.widget.TextView) e0Var.itemView.findViewById(com.tencent.mm.R.id.cbe);
                    com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget3 = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) findViewById4.findViewById(com.tencent.mm.R.id.f4x);
                    com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget finderLiveOnliveWidget4 = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) findViewById4.findViewById(com.tencent.mm.R.id.exa);
                    textView4.setText(u5Var2.f387034i);
                    android.text.TextPaint paint = textView4.getPaint();
                    if (paint != null) {
                        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                    }
                    android.text.TextPaint paint2 = textView4.getPaint();
                    if (paint2 != null) {
                        paint2.setStrokeWidth(0.8f);
                    }
                    textView5.setText(u5Var2.f387041s);
                    textView6.setText("");
                    r45.nw1 g18 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).g(u5Var2.f387031f);
                    eq1.h hVar2 = eq1.h.f255812a;
                    kotlin.jvm.internal.o.d(finderLiveOnliveWidget3);
                    kotlin.jvm.internal.o.d(finderLiveOnliveWidget4);
                    hVar2.j(g18, finderLiveOnliveWidget3, finderLiveOnliveWidget4);
                    textView4.setTag(com.tencent.mm.R.id.bph, u5Var2.f387031f);
                    hVar2.f(u5Var2.f387030e, u5Var2.f387031f, new yr3.d0(e0Var, u5Var2, textView4, finderLiveOnliveWidget3, finderLiveOnliveWidget4, textView6));
                    kotlin.jvm.internal.o.d(imageView4);
                    kotlin.jvm.internal.o.d(imageView3);
                    hVar2.h(imageView4, imageView3, u5Var2.f387040r.f384546d, null);
                    u5Var = u5Var2;
                }
                e0Var.itemView.setOnClickListener(new yr3.a0(u5Var, e0Var));
            }
        }
        return jz5.f0.f302826a;
    }
}
