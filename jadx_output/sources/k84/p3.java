package k84;

/* loaded from: classes3.dex */
public final class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f305180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mb4.r f305181f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c84.d f305182g;

    public p3(k84.d4 d4Var, long j17, mb4.r rVar, c84.d dVar) {
        this.f305179d = d4Var;
        this.f305180e = j17;
        this.f305181f = rVar;
        this.f305182g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adsocial/AdFireworkCheerComponent$startFullScreenPag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i(this.f305179d.j(), "pagView click!");
        float abs = (float) java.lang.Math.abs(java.lang.System.currentTimeMillis() - this.f305180e);
        mb4.r rVar = this.f305181f;
        rVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFullScreenCanCloseDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        float f17 = rVar.f325468o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullScreenCanCloseDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        if (abs > f17) {
            this.f305182g.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdFireworkCheerComponent$startFullScreenPag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$2");
    }
}
