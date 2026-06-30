package j44;

/* loaded from: classes4.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j44.j f297680d;

    public g(j44.j jVar) {
        this.f297680d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        k44.g d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper$initContentView$6");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenDownloadHelper$initContentView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j44.j jVar = this.f297680d;
        h44.b f17 = jVar.f();
        if (f17 == null || (d17 = f17.d()) == null) {
            str = null;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppDescUrl", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.DownloadInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppDescUrl", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.DownloadInfo");
            str = d17.f304082i;
        }
        jVar.n(str);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenDownloadHelper$initContentView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper$initContentView$6");
    }
}
