package m84;

/* loaded from: classes4.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m84.u f324759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f324760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f324761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f324762g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f324763h;

    public c(m84.u uVar, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, int i17, int i18, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f324759d = uVar;
        this.f324760e = adClickActionInfo;
        this.f324761f = i17;
        this.f324762g = i18;
        this.f324763h = snsInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$bindClickArea$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent$bindClickArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        m84.u uVar = this.f324759d;
        java.lang.String j17 = uVar.j();
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f324760e;
        int i17 = this.f324761f;
        int i18 = this.f324762g;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f324763h;
        try {
            adClickActionInfo.f162608t0 = m84.u.B(uVar, adClickActionInfo.f162608t0, i17);
            adClickActionInfo.f162569a = i18;
            w64.n K = uVar.K();
            if (K != null) {
                K.o(adClickActionInfo, snsInfo, i17);
            }
            w64.n K2 = uVar.K();
            if (K2 != null) {
                K2.k(view);
            }
            com.tencent.mars.xlog.Log.i(uVar.j(), "click area, scene=" + i18 + ", subClickPos=" + i17);
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent$bindClickArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$bindClickArea$1");
    }
}
