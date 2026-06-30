package j44;

/* loaded from: classes4.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j44.j f297681d;

    public h(j44.j jVar) {
        this.f297681d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Integer e17;
        j44.a j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper$initContentView$7");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenDownloadHelper$initContentView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j44.j jVar = this.f297681d;
        jVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCurrentDownloadStatus", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        int i17 = jVar.f297706x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCurrentDownloadStatus", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        int i18 = 0;
        if (i17 == 2 && (j17 = jVar.j()) != null) {
            ((com.tencent.mm.plugin.sns.ad.download.DownloadHelper) j17).l(false);
        }
        jVar.t(jVar.g());
        h44.b f17 = jVar.f();
        if (f17 != null && (e17 = f17.e()) != null) {
            i18 = e17.intValue();
        }
        a44.m.c(i18, 10, jVar.f(), null, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenDownloadHelper$initContentView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper$initContentView$7");
    }
}
