package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes4.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f170977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f170978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f170979f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f170980g;

    public b1(com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout overScrollLinearout, int i17, int i18, int i19, int i27) {
        this.f170977d = i17;
        this.f170978e = i18;
        this.f170979f = i19;
        this.f170980g = i27;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("the onScrollChanged: l is ");
        sb6.append(this.f170977d);
        sb6.append(", t is ");
        int i17 = this.f170978e;
        sb6.append(i17);
        sb6.append(", old l is ");
        sb6.append(this.f170979f);
        sb6.append(", oldt is ");
        int i18 = this.f170980g;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.w("OverScrollLinearout", sb6.toString());
        com.tencent.mm.autogen.events.SnsAdBonusSlideEvent snsAdBonusSlideEvent = new com.tencent.mm.autogen.events.SnsAdBonusSlideEvent();
        am.vu vuVar = snsAdBonusSlideEvent.f54787g;
        vuVar.getClass();
        vuVar.f8221a = i17;
        vuVar.getClass();
        vuVar.f8222b = i18;
        snsAdBonusSlideEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout$1");
    }
}
