package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class b60 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f117840d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f117841e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f117842f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f117843g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z60 f117844h;

    public b60(com.tencent.mm.plugin.finder.live.widget.z60 z60Var, yz5.l onTabSelected) {
        kotlin.jvm.internal.o.g(onTabSelected, "onTabSelected");
        this.f117844h = z60Var;
        this.f117840d = onTabSelected;
        this.f117841e = kz5.p0.f313996d;
        this.f117842f = "";
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f117841e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f117843g = recyclerView;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.live.widget.z50 holder = (com.tencent.mm.plugin.finder.live.widget.z50) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.live.widget.y50 y50Var = (com.tencent.mm.plugin.finder.live.widget.y50) this.f117841e.get(i17);
        com.tencent.mm.plugin.finder.live.widget.z60 z60Var = this.f117844h;
        boolean z17 = com.tencent.mm.plugin.finder.live.widget.z60.a(z60Var) && !kotlin.jvm.internal.o.b(y50Var.f120415a, "co_live");
        boolean b17 = kotlin.jvm.internal.o.b(y50Var.f120415a, this.f117842f);
        holder.f120527d.setText(y50Var.f120416b);
        android.view.View view = holder.itemView;
        java.lang.String str = y50Var.f120415a;
        view.setTag(str);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.finder.live.widget.b60 b60Var = holder.f120529f;
        android.content.Context context = b60Var.f117844h.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.widget.TextView textView = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.vc8);
        if (textView != null) {
            textView.setTextColor(context.getColor(z17 ? com.tencent.mm.R.color.f478520a84 : b17 ? com.tencent.mm.R.color.Brand_100 : com.tencent.mm.R.color.adg));
            if (b17) {
                com.tencent.mm.ui.bk.s0(textView.getPaint());
            } else {
                com.tencent.mm.ui.bk.t0(textView.getPaint());
            }
        }
        int color = context.getColor(b17 ? com.tencent.mm.R.color.Brand_Alpha_0_1 : android.R.color.transparent);
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "setTabBackgroundColor: color=" + (b17 ? "Brand_Alpha_0_1" : com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT) + ", isSelected=" + b17);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(context.getResources().getDisplayMetrics().density * 8.0f);
        itemView.setBackground(gradientDrawable);
        if (kotlin.jvm.internal.o.b(str, "video")) {
            android.content.Context context2 = b60Var.f117844h.getContext();
            androidx.appcompat.app.AppCompatActivity appCompatActivity = context2 instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context2 : null;
            if (appCompatActivity != null) {
                ll2.e.l(ll2.e.f319133a, appCompatActivity, "startlive.more.video", holder.f120528e, null, null, 24, null);
            }
        } else {
            android.view.View view2 = holder.f120528e;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$TabListAdapter$TabViewHolder", "bind", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$TabItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$TabListAdapter$TabViewHolder", "bind", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$TabItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (true ^ this.f117841e.isEmpty()) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f117843g;
            int width = recyclerView != null ? recyclerView.getWidth() : 0;
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f117843g;
            int paddingLeft = recyclerView2 != null ? recyclerView2.getPaddingLeft() : 0;
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f117843g;
            int paddingRight = width - (paddingLeft + (recyclerView3 != null ? recyclerView3.getPaddingRight() : 0));
            if (paddingRight > 0) {
                layoutParams.width = paddingRight / this.f117841e.size();
            } else {
                layoutParams.width = -2;
            }
        } else {
            layoutParams.width = -2;
        }
        holder.itemView.setLayoutParams(layoutParams);
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.a60(z60Var, y50Var, this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488997ec3, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.finder.live.widget.z50(this, inflate);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f117843g = null;
    }
}
