package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class xy extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.iz f136503e;

    public xy(com.tencent.mm.plugin.finder.viewmodel.component.iz izVar) {
        this.f136503e = izVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.e6e;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        int i19;
        int i27;
        int i28;
        int i29;
        java.lang.String nickname;
        so2.j0 item = (so2.j0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.tencent.mm.plugin.finder.viewmodel.component.iz izVar = this.f136503e;
        android.app.Activity context = izVar.getContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.zx0 zx0Var = item.f410438d;
        r45.vx0 vx0Var = (r45.vx0) zx0Var.getCustom(0);
        objArr[0] = vx0Var != null ? vx0Var.getString(1) : null;
        holder.s(com.tencent.mm.R.id.svt, context.getString(com.tencent.mm.R.string.lre, objArr));
        holder.s(com.tencent.mm.R.id.svs, izVar.getContext().getString(com.tencent.mm.R.string.o1a, java.lang.Integer.valueOf(zx0Var.getInteger(3)), java.lang.Integer.valueOf(zx0Var.getInteger(4))));
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.svi);
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (imageView != null) {
            g1Var.e().c(new mn2.q3(zx0Var.getString(2), com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329963q));
        }
        vo0.d a17 = g1Var.a();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) zx0Var.getCustom(6);
        java.lang.String str2 = "";
        if (finderContact == null || (str = finderContact.getHeadUrl()) == null) {
            str = "";
        }
        mn2.n nVar = new mn2.n(str, null, 2, null);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.svq);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        a17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f329957h));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity context2 = izVar.getContext();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) zx0Var.getCustom(6);
        if (finderContact2 != null && (nickname = finderContact2.getNickname()) != null) {
            str2 = nickname;
        }
        ((ke0.e) xVar).getClass();
        holder.s(com.tencent.mm.R.id.svr, com.tencent.mm.pluginsdk.ui.span.c0.i(context2, str2));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f460511a;
        android.view.View p18 = holder.p(com.tencent.mm.R.id.svo);
        kotlin.jvm.internal.o.f(p18, "getView(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) p18;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) zx0Var.getCustom(6);
        zy2.tb.a(m1Var, imageView2, finderContact3 != null ? finderContact3.getAuthInfo() : null, 0, 4, null);
        java.util.ArrayList arrayList = izVar.f134774g;
        boolean z18 = i17 != 0 && (i17 == 4 || i17 == arrayList.size() - 1);
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            android.content.Context context3 = holder.f293121e;
            if (i17 == 0) {
                if (arrayList.size() == 1) {
                    com.tencent.mm.ui.ah a18 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    java.lang.System.nanoTime();
                    boolean z19 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    int i37 = a18.f197135a;
                    if (!z19 && i37 > (i29 = a18.f197136b)) {
                        i37 = i29;
                    }
                    layoutParams.width = i37 - context3.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
                } else {
                    com.tencent.mm.ui.ah a19 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    java.lang.System.nanoTime();
                    boolean z27 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    int i38 = a19.f197135a;
                    if (!z27 && i38 > (i28 = a19.f197136b)) {
                        i38 = i28;
                    }
                    layoutParams.width = i38 - context3.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479715d8);
                }
                holder.itemView.setPadding(context3.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), holder.itemView.getPaddingTop(), holder.itemView.getPaddingRight(), holder.itemView.getPaddingBottom());
            } else if (z18) {
                holder.itemView.setPadding(context3.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479648bn), holder.itemView.getPaddingTop(), holder.itemView.getPaddingRight(), holder.itemView.getPaddingBottom());
                com.tencent.mm.ui.ah a27 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                java.lang.System.nanoTime();
                boolean z28 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                int i39 = a27.f197135a;
                if (!z28 && i39 > (i27 = a27.f197136b)) {
                    i39 = i27;
                }
                layoutParams.width = i39 - context3.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479648bn);
            } else {
                holder.itemView.setPadding(context3.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479648bn), holder.itemView.getPaddingTop(), holder.itemView.getPaddingRight(), holder.itemView.getPaddingBottom());
                com.tencent.mm.ui.ah a28 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                java.lang.System.nanoTime();
                boolean z29 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
                java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                int i47 = a28.f197135a;
                if (!z29 && i47 > (i19 = a28.f197136b)) {
                    i47 = i19;
                }
                layoutParams.width = i47 - context3.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479718db);
            }
        }
        if (z18) {
            android.view.View p19 = holder.p(com.tencent.mm.R.id.svb);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p19, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC$ContinueWatchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderContinueWatchData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC$ContinueWatchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderContinueWatchData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View p27 = holder.p(com.tencent.mm.R.id.svb);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p27, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC$ContinueWatchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderContinueWatchData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC$ContinueWatchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderContinueWatchData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (i17 == 4 && arrayList.size() > 5) {
            android.view.View p28 = holder.p(com.tencent.mm.R.id.svl);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p28, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC$ContinueWatchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderContinueWatchData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC$ContinueWatchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderContinueWatchData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.r(com.tencent.mm.R.id.svm, com.tencent.mm.R.string.f8u);
        } else if (i17 == arrayList.size() - 1) {
            android.view.View p29 = holder.p(com.tencent.mm.R.id.svl);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p29, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC$ContinueWatchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderContinueWatchData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p29.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p29, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfContinueWatchUIC$ContinueWatchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderContinueWatchData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.r(com.tencent.mm.R.id.svm, com.tencent.mm.R.string.o1_);
        }
        androidx.appcompat.app.AppCompatActivity context4 = izVar.getActivity();
        kotlin.jvm.internal.o.g(context4, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context4 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context4).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
        lVarArr[1] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        r45.vx0 vx0Var2 = (r45.vx0) zx0Var.getCustom(0);
        lVarArr[2] = new jz5.l("collection_id", pm0.v.u(vx0Var2 != null ? vx0Var2.getLong(0) : 0L));
        lVarArr[3] = new jz5.l("collection_location_id", java.lang.Integer.valueOf(i17));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.vy(izVar, item, k17));
        holder.itemView.setOnLongClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.wy(izVar, holder, item, k17));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(holder.itemView, "continue_watch_collection_card");
        aVar.ik(holder.itemView, 32, 25496);
        aVar.gk(holder.itemView, k17);
    }
}
