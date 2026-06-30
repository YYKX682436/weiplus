package v74;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v74.g f433772d;

    public d(v74.g gVar) {
        this.f433772d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$mOnClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMRecyclerView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            v74.g gVar = this.f433772d;
            androidx.recyclerview.widget.RecyclerView recyclerView = gVar.f433789h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMRecyclerView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            int u07 = recyclerView != null ? recyclerView.u0(view) : -1;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick, pos=");
            sb6.append(u07);
            sb6.append(", itemCount=");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMLookbookCardInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMLookbookCardInfo$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            sb6.append(gVar.f433788g.c().size());
            com.tencent.mars.xlog.Log.i("AdLookbookLogic", sb6.toString());
            if (gVar.x(u07) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMOnItemClickListener$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
                v74.c cVar = gVar.f433795q;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMOnItemClickListener$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
                if (cVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mOnItemClickListener$1");
                    com.tencent.mars.xlog.Log.i("AdLookbookLogic", "onItemClick, pos=" + u07);
                    v74.k0 k0Var = ((v74.z) cVar).f433946a;
                    if (k0Var.h(view, u07)) {
                        v74.v0 a17 = v74.k0.a(k0Var);
                        a17.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
                        v74.u0 d17 = a17.d(u07);
                        int a18 = d17.a() + 1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                        d17.f433929h = a18;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                        com.tencent.mars.xlog.Log.i("AdLookbookStatistic", "onItemClick, pos=" + u07 + ", total=" + a17.d(u07).a());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
                    } else {
                        com.tencent.mars.xlog.Log.e("AdLookbookLogic", "onItemClick failed, pos=" + u07);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mOnItemClickListener$1");
                }
            } else {
                com.tencent.mars.xlog.Log.e("AdLookbookLogic", "onClick, itemInfo==null");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$mOnClickListener$1");
    }
}
