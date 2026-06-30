package p74;

/* loaded from: classes4.dex */
public final class c extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView f352520d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f352521e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f352522f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f352523g;

    /* renamed from: h, reason: collision with root package name */
    public p74.a f352524h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f352525i;

    public c(com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView recyclerView, com.tencent.mm.plugin.sns.storage.SnsInfo mSnsInfo) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(mSnsInfo, "mSnsInfo");
        this.f352520d = recyclerView;
        this.f352521e = mSnsInfo;
        this.f352522f = recyclerView.getContext();
        this.f352523g = new java.util.ArrayList();
        this.f352525i = new java.util.LinkedHashMap();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardAdapter", "initializeAdapterData error: " + th6.getMessage());
        }
        if (mSnsInfo.getAdXml() == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.AdSlideCardAdapter", "initializeAdapterData: snsInfo or adXml is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
            return;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = mSnsInfo.getAdXml();
        kotlin.jvm.internal.o.f(adXml, "getAdXml(...)");
        s34.a1 a1Var = adXml.adSliderFullCardInfo;
        if (a1Var != null && !a84.b0.b(a1Var.resInfoList)) {
            java.util.List<s34.x0> resInfoList = adXml.adSliderFullCardInfo.resInfoList;
            kotlin.jvm.internal.o.f(resInfoList, "resInfoList");
            this.f352523g = kz5.n0.V0(resInfoList);
            com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardAdapter", "initializeAdapterData: success, card count = " + this.f352523g.size());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
            return;
        }
        com.tencent.mars.xlog.Log.w("SnsAd.AdSlideCardAdapter", "initializeAdapterData: adSliderFullCardInfo or resInfoList is null/empty!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
        int size = this.f352523g.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
        return size;
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
        long j17 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
        return j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0122  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r18, int r19) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p74.c.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f352522f).inflate(com.tencent.mm.R.layout.eoo, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        p74.g gVar = new p74.g(inflate);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
        return gVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewDetachedFromWindow(androidx.recyclerview.widget.k3 k3Var) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
        p74.g holder = (p74.g) k3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            a84.y0.c(holder.k());
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("SnsAd.AdSlideCardAdapter", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
    }

    public final void x(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemPlayingState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
        this.f352525i.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewHolderByPosition", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
        p74.g gVar = (p74.g) this.f352520d.p0(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewHolderByPosition", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
        if (gVar != null) {
            y(gVar, z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemPlayingState", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
    }

    public final void y(p74.g gVar, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updatePlayButtonVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
        if (gVar.j() != null) {
            if (z17) {
                a84.y0.p(gVar.j(), false);
            } else {
                a84.y0.p(gVar.j(), true);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePlayButtonVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
    }
}
