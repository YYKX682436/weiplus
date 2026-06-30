package qe2;

/* loaded from: classes10.dex */
public final class b extends androidx.recyclerview.widget.f2 {
    public final com.tencent.mm.plugin.finder.live.widget.e0 S1;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f362033d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f362034e;

    public b(android.content.Context context, java.util.List items, com.tencent.mm.plugin.finder.live.widget.e0 panel) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(panel, "panel");
        this.f362033d = context;
        this.f362034e = items;
        this.S1 = panel;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f362034e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        ya2.b2 b17;
        qe2.f holder = (qe2.f) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        qe2.c cell = (qe2.c) this.f362034e.get(i17);
        android.content.Context context = this.f362033d;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(cell, "cell");
        com.tencent.mm.plugin.finder.live.widget.e0 panel = this.S1;
        kotlin.jvm.internal.o.g(panel, "panel");
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.a().c(new mn2.n(cell.f362037c, null, 2, null), holder.f362045d, yo0.i.f464094o.a());
        java.lang.String str = cell.f362036b;
        android.widget.TextView textView = holder.f362046e;
        textView.setText(str);
        com.tencent.mm.ui.fk.a(textView);
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = cell.f362039e;
        if (finderAuthInfo == null) {
            java.lang.String str2 = cell.f362035a;
            finderAuthInfo = (!(str2.length() > 0) || (b17 = ya2.h.f460484a.b(str2)) == null) ? null : b17.field_authInfo;
        }
        java.lang.String authProfession = finderAuthInfo != null ? finderAuthInfo.getAuthProfession() : null;
        boolean z17 = authProfession == null || authProfession.length() == 0;
        android.widget.ImageView imageView = holder.f362049h;
        if (z17) {
            android.view.View view = holder.f362048g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
        } else {
            android.view.View view2 = holder.f362048g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            holder.f362047f.setText(finderAuthInfo != null ? finderAuthInfo.getAuthProfession() : null);
            int authIconType = finderAuthInfo != null ? finderAuthInfo.getAuthIconType() : 0;
            if (authIconType > 0) {
                imageView.setVisibility(0);
                java.lang.String authIconUrl = finderAuthInfo != null ? finderAuthInfo.getAuthIconUrl() : null;
                if (!(authIconUrl == null || authIconUrl.length() == 0)) {
                    vo0.d e17 = g1Var.e();
                    kotlin.jvm.internal.o.d(finderAuthInfo);
                    e17.c(new mn2.q3(finderAuthInfo.getAuthIconUrl(), com.tencent.mm.plugin.finder.storage.y90.f128355e), imageView, g1Var.h(mn2.f1.B));
                } else if (authIconType == 1 || authIconType == 2) {
                    imageView.setImageResource(com.tencent.mm.R.raw.icons_filled_star_identify_sold);
                } else {
                    imageView.setVisibility(8);
                }
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z18 = cell.f362040f;
        android.view.View view3 = holder.f362050i;
        if (z18) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setOnClickListener(null);
        } else {
            boolean z19 = cell.f362038d;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f362052n;
            android.widget.TextView textView2 = holder.f362051m;
            if (z19) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setBackgroundResource(com.tencent.mm.R.drawable.f481718a34);
                weImageView.setVisibility(8);
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
                textView2.setText(context.getString(com.tencent.mm.R.string.f492274fw4));
                view3.setOnClickListener(null);
            } else {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder", "bind", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorCellItem;Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setBackgroundResource(com.tencent.mm.R.drawable.f481717a33);
                weImageView.setVisibility(0);
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
                textView2.setText(context.getString(com.tencent.mm.R.string.f493712oq5));
                com.tencent.mm.ui.fk.a(textView2);
                view3.setOnClickListener(new qe2.d(context, cell));
            }
        }
        holder.itemView.setOnClickListener(new qe2.e(panel, context, cell));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.e9t, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new qe2.f(inflate);
    }
}
