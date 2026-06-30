package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class j7 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.o7 f134822e;

    public j7(com.tencent.mm.plugin.finder.viewmodel.component.o7 o7Var) {
        this.f134822e = o7Var;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.e6e;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.lang.String nickname;
        so2.j0 item = (so2.j0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.tencent.mm.plugin.finder.viewmodel.component.o7 o7Var = this.f134822e;
        android.app.Activity context = o7Var.getContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.zx0 zx0Var = item.f410438d;
        r45.vx0 vx0Var = (r45.vx0) zx0Var.getCustom(0);
        objArr[0] = vx0Var != null ? vx0Var.getString(1) : null;
        holder.s(com.tencent.mm.R.id.svt, context.getString(com.tencent.mm.R.string.lre, objArr));
        holder.s(com.tencent.mm.R.id.svs, holder.f293121e.getString(com.tencent.mm.R.string.o1a, java.lang.Integer.valueOf(zx0Var.getInteger(3)), java.lang.Integer.valueOf(zx0Var.getInteger(4))));
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.svi);
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (imageView != null) {
            g1Var.e().c(new mn2.q3(zx0Var.getString(2), com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329963q));
        }
        if (i17 == 0) {
            android.view.View p17 = holder.p(com.tencent.mm.R.id.o1u);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderContinueWatchUIC$ContinueWatchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderContinueWatchData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderContinueWatchUIC$ContinueWatchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderContinueWatchData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View p18 = holder.p(com.tencent.mm.R.id.o1u);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderContinueWatchUIC$ContinueWatchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderContinueWatchData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/viewmodel/component/FinderContinueWatchUIC$ContinueWatchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderContinueWatchData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        vo0.d a17 = g1Var.a();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) zx0Var.getCustom(6);
        java.lang.String str2 = "";
        if (finderContact == null || (str = finderContact.getHeadUrl()) == null) {
            str = "";
        }
        mn2.n nVar = new mn2.n(str, null, 2, null);
        android.view.View p19 = holder.p(com.tencent.mm.R.id.svq);
        kotlin.jvm.internal.o.f(p19, "getView(...)");
        a17.c(nVar, (android.widget.ImageView) p19, g1Var.h(mn2.f1.f329957h));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity context2 = o7Var.getContext();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) zx0Var.getCustom(6);
        if (finderContact2 != null && (nickname = finderContact2.getNickname()) != null) {
            str2 = nickname;
        }
        ((ke0.e) xVar).getClass();
        holder.s(com.tencent.mm.R.id.svr, com.tencent.mm.pluginsdk.ui.span.c0.i(context2, str2));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f460511a;
        android.view.View p27 = holder.p(com.tencent.mm.R.id.svo);
        kotlin.jvm.internal.o.f(p27, "getView(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) p27;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) zx0Var.getCustom(6);
        zy2.tb.a(m1Var, imageView2, finderContact3 != null ? finderContact3.getAuthInfo() : null, 0, 4, null);
        androidx.appcompat.app.AppCompatActivity context3 = o7Var.getActivity();
        kotlin.jvm.internal.o.g(context3, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
        lVarArr[1] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        r45.vx0 vx0Var2 = (r45.vx0) zx0Var.getCustom(0);
        lVarArr[2] = new jz5.l("collection_id", pm0.v.u(vx0Var2 != null ? vx0Var2.getLong(0) : 0L));
        lVarArr[3] = new jz5.l("collection_location_id", java.lang.Integer.valueOf(i17));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.e7(holder, item, k17));
        holder.itemView.setOnLongClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.i7(k17, o7Var, holder, item));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(holder.itemView, "continue_watch_collection_card");
        aVar.ik(holder.itemView, 32, 25496);
        aVar.gk(holder.itemView, k17);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.svh);
        if (p17 != null) {
            p17.setBackgroundColor(holder.f293121e.getColor(com.tencent.mm.R.color.f478491c));
            android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.rightMargin = 0;
            }
        }
    }
}
