package k84;

/* loaded from: classes4.dex */
public final class x5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f305332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f305333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c84.d f305334f;

    public x5(long j17, k84.c6 c6Var, c84.d dVar) {
        this.f305332d = j17;
        this.f305333e = c6Var;
        this.f305334f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        float f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialPatComponent$startFullScreenPag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long abs = java.lang.Math.abs(java.lang.System.currentTimeMillis() - this.f305332d);
        k84.c6 c6Var = this.f305333e;
        com.tencent.mars.xlog.Log.i(c6Var.j(), "pagView click!, timeInterval is " + abs);
        float f18 = (float) abs;
        mb4.a z17 = k84.c6.z(c6Var);
        if (z17 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFullScreenCanCloseDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AdPatInfo");
            f17 = z17.f325361f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullScreenCanCloseDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AdPatInfo");
        } else {
            f17 = 0.0f;
        }
        if (f18 > f17) {
            java.lang.String str = c6Var.j() + "dialog_dismiss";
            try {
                this.f305334f.dismiss();
            } catch (java.lang.Throwable th6) {
                ca4.q.c(str, th6);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialPatComponent$startFullScreenPag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$2");
    }
}
