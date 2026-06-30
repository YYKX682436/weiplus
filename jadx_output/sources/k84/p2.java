package k84;

/* loaded from: classes4.dex */
public final class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w64.n f305178e;

    public p2(k84.d4 d4Var, w64.n nVar) {
        this.f305177d = d4Var;
        this.f305178e = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adsocial/AdFireworkCheerComponent$bindInfo$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.ViewGroup U = this.f305177d.U();
        boolean z17 = false;
        if (U != null && U.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            this.f305178e.k(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdFireworkCheerComponent$bindInfo$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$4");
    }
}
