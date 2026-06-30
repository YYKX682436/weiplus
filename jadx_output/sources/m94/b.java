package m94;

/* loaded from: classes4.dex */
public final class b extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f325068d = kz5.p0.f313996d;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        int i17 = this.f325068d.isEmpty() ? 0 : Integer.MAX_VALUE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        return i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        r45.d96 d96Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        m94.a holder = (m94.a) k3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (this.f325068d.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        } else {
            int x17 = i17 % x();
            com.tencent.mars.xlog.Log.i("ScaleRecyclerAdapter", "onBindViewHolder, validPos is " + x17);
            if (holder.getItemViewType() == 0) {
                r45.i96 i96Var = (r45.i96) this.f325068d.get(x17);
                java.lang.String str = (i96Var == null || (d96Var = i96Var.f376852d) == null) ? null : d96Var.f372253d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemImage", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter$ItemViewHolder");
                android.widget.ImageView imageView = holder.f325067d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemImage", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter$ItemViewHolder");
                a84.m.a(str, imageView);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = new com.tencent.mm.ui.widget.RoundCornerFrameLayout(context);
        c44.a.l();
        if (roundCornerFrameLayout.getLayoutParams() == null) {
            c44.a.o();
            roundCornerFrameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = roundCornerFrameLayout.getLayoutParams();
            layoutParams.width = -1;
            roundCornerFrameLayout.setLayoutParams(layoutParams);
        }
        c44.a.l();
        if (roundCornerFrameLayout.getLayoutParams() == null) {
            c44.a.o();
            roundCornerFrameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = roundCornerFrameLayout.getLayoutParams();
            layoutParams2.height = -1;
            roundCornerFrameLayout.setLayoutParams(layoutParams2);
        }
        roundCornerFrameLayout.setRadius(c44.b.a(8));
        m94.a aVar = new m94.a(roundCornerFrameLayout);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setViewType", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter$ItemViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setViewType", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter$ItemViewHolder");
        if (i17 == 0) {
            android.widget.ImageView imageView = new android.widget.ImageView(parent.getContext());
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setItemImage", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter$ItemViewHolder");
            aVar.f325067d = imageView;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setItemImage", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter$ItemViewHolder");
            c44.a.l();
            c44.a.l();
            roundCornerFrameLayout.addView(imageView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        return aVar;
    }

    public final int x() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRealCount", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        int size = this.f325068d.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRealCount", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
        return size;
    }
}
