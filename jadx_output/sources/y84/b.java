package y84;

/* loaded from: classes4.dex */
public final class b extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f460014d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f460015e;

    /* renamed from: f, reason: collision with root package name */
    public final y84.l3 f460016f;

    /* renamed from: g, reason: collision with root package name */
    public final int f460017g;

    /* renamed from: h, reason: collision with root package name */
    public final int f460018h;

    public b(android.content.Context mContext, com.tencent.mm.plugin.sns.storage.SnsInfo mSnsInfo, y84.l3 mRandomSelectCardAdInfo, androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(mSnsInfo, "mSnsInfo");
        kotlin.jvm.internal.o.g(mRandomSelectCardAdInfo, "mRandomSelectCardAdInfo");
        this.f460014d = mContext;
        this.f460015e = mSnsInfo;
        this.f460016f = mRandomSelectCardAdInfo;
        this.f460017g = i17;
        this.f460018h = i18;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        return Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        y84.a holder = (y84.a) k3Var;
        android.content.Context context = this.f460014d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        kotlin.jvm.internal.o.g(holder, "holder");
        try {
            com.tencent.mars.xlog.Log.i("AdRandomSelectCardAdapter", "onBindHolder, view.hash is " + holder.itemView.hashCode() + ", pos=" + i17);
            if (holder.getItemViewType() == 0) {
                y84.o3 o3Var = this.f460016f.f460146m;
                r45.jj4 a17 = o3Var != null ? o3Var.a() : null;
                com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardImage", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter$ItemViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardImage", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter$ItemViewHolder");
                android.widget.ImageView imageView = holder.f460008f;
                int hashCode = context.hashCode();
                com.tencent.mm.storage.s7 s7Var = com.tencent.mm.storage.s7.f195308l;
                s7Var.f195313b = this.f460015e.getTimeLine().CreateTime;
                hj6.W(a17, imageView, -1, hashCode, s7Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter$ItemViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter$ItemViewHolder");
                com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = holder.f460007e;
                if (roundCornerFrameLayout != null) {
                    roundCornerFrameLayout.setRadius(i65.a.b(context, 3));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter$ItemViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter$ItemViewHolder");
                android.widget.FrameLayout frameLayout = holder.f460006d;
                java.lang.Object layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.width = this.f460017g;
                    marginLayoutParams.height = this.f460018h;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter$ItemViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter$ItemViewHolder");
                if (frameLayout != null) {
                    frameLayout.requestLayout();
                }
            } else {
                com.tencent.mars.xlog.Log.e("AdRandomSelectCardAdapter", "onBindViewHolder, wrong view type");
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdRandomSelectCardAdapter", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        y84.a aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        android.content.Context context = this.f460014d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        kotlin.jvm.internal.o.g(parent, "parent");
        try {
            android.view.View inflate = i17 == 0 ? android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.en8, parent, false) : new android.view.View(context);
            com.tencent.mars.xlog.Log.i("AdRandomSelectCardAdapter", "onCreateHolder, view.hash is " + inflate.hashCode());
            aVar = new y84.a(inflate, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdRandomSelectCardAdapter", th6);
            aVar = new y84.a(new android.view.View(context), i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardAdapter");
        return aVar;
    }
}
