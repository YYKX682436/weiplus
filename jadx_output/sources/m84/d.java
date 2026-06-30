package m84;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m84.u f324769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f324770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f324771f;

    public d(m84.u uVar, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f324769d = uVar;
        this.f324770e = adClickActionInfo;
        this.f324771f = snsInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$bindIntroClickArea$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent$bindIntroClickArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        m84.u uVar = this.f324769d;
        java.lang.String j17 = uVar.j();
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f324770e;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f324771f;
        try {
            adClickActionInfo.f162569a = 42;
            w64.n K = uVar.K();
            if (K != null) {
                K.o(adClickActionInfo, snsInfo, 0);
            }
            w64.n K2 = uVar.K();
            if (K2 != null) {
                K2.k(view);
            }
            com.tencent.mars.xlog.Log.i(uVar.j(), "click stage one intro, scene=" + adClickActionInfo.f162569a);
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent$bindIntroClickArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$bindIntroClickArea$1");
    }
}
