package qr2;

/* loaded from: classes2.dex */
public final class c extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f366067e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.playlist.z1 f366068f;

    /* renamed from: g, reason: collision with root package name */
    public final int f366069g;

    public c(boolean z17, com.tencent.mm.plugin.finder.playlist.z1 z1Var, int i17, kotlin.jvm.internal.i iVar) {
        int i18;
        boolean z18 = true;
        this.f366067e = (i17 & 1) != 0 ? false : z17;
        this.f366068f = z1Var;
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.A()) {
            z18 = false;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i19 = a17.f197135a;
        if (!z18 && i19 > (i18 = a17.f197136b)) {
            i19 = i18;
        }
        this.f366069g = i19;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dik;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        r45.vx0 vx0Var;
        com.tencent.mm.plugin.finder.playlist.z1 item = (com.tencent.mm.plugin.finder.playlist.z1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = holder.f293121e;
        int dimension = (this.f366069g - ((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479734dr))) / 2;
        if (dimension > 0) {
            android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
            layoutParams.width = dimension;
            holder.itemView.setLayoutParams(layoutParams);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f484050cu2);
        r45.dm2 object_extend = item.getFeedObject().getFeedObject().getObject_extend();
        java.lang.String string = (object_extend == null || (vx0Var = (r45.vx0) object_extend.getCustom(0)) == null) ? null : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lt9, java.lang.Integer.valueOf(vx0Var.getInteger(6)));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(string);
        sb6.append(' ');
        sb6.append(com.tencent.mm.sdk.platformtools.t8.K0(item.getFeedObject().getDescription()) ? "" : item.getFeedObject().getDescriptionSpan());
        java.lang.String sb7 = sb6.toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(sb7)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(sb7);
        }
        if (this.f366067e) {
            textView.setTextColor(context.getColor(com.tencent.mm.R.color.UN_BW_100_Alpha_0_8));
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.nhh);
        com.tencent.mm.plugin.finder.playlist.z1 z1Var = (com.tencent.mm.plugin.finder.playlist.z1) holder.f293125i;
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        if (z1Var.f122508d) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.f484050cu2)).setAlpha(0.06f);
            textView2.setVisibility(0);
            android.view.View p17 = holder.p(com.tencent.mm.R.id.qn6);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/playlist/horizontal/FinderHorizontalCollectionFeedConvert", "refreshSelectedItem", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/playlist/horizontal/FinderHorizontalCollectionFeedConvert", "refreshSelectedItem", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.f484050cu2)).setAlpha(1.0f);
            textView2.setVisibility(8);
            android.view.View p18 = holder.p(com.tencent.mm.R.id.qn6);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/playlist/horizontal/FinderHorizontalCollectionFeedConvert", "refreshSelectedItem", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/playlist/horizontal/FinderHorizontalCollectionFeedConvert", "refreshSelectedItem", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        dy1.a.i(itemView, "biz_feed_collection");
        android.view.View itemView2 = holder.itemView;
        kotlin.jvm.internal.o.f(itemView2, "itemView");
        dy1.a.a(itemView2, new qr2.b(V6, item, this));
        android.view.View itemView3 = holder.itemView;
        kotlin.jvm.internal.o.f(itemView3, "itemView");
        dy1.a.l(itemView3, 40, 25496);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
