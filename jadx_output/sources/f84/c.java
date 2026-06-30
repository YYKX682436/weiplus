package f84;

/* loaded from: classes4.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f84.d f260176d;

    public c(f84.d dVar) {
        this.f260176d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$mOnClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        f84.d dVar = this.f260176d;
        if (view != null) {
            try {
                dVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMRecyclerView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMRecyclerView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                androidx.recyclerview.widget.RecyclerView recyclerView = dVar.f260179f;
                int u07 = recyclerView != null ? recyclerView.u0(view) : -1;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick, pos=");
                sb6.append(u07);
                sb6.append(", itemCount=");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAdBrandTopicInfo", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAdBrandTopicInfo", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                java.util.List b17 = dVar.f260178e.b();
                sb6.append(b17 != null ? java.lang.Integer.valueOf(b17.size()) : null);
                com.tencent.mars.xlog.Log.i("AdBrandTopicAdapter", sb6.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItemData", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                f84.b0 x17 = dVar.x(u07);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItemData", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                if (x17 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMOnItemClickListener$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                    f84.b bVar = dVar.f260181h;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMOnItemClickListener$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                    if (bVar != null) {
                        ((f84.o) bVar).a(view, u07, x17);
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("AdBrandTopicAdapter", "onClick, itemInfo==null");
                }
            } catch (java.lang.Throwable th6) {
                ca4.q.c("AdBrandTopicAdapter", th6);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$mOnClickListener$1");
    }
}
