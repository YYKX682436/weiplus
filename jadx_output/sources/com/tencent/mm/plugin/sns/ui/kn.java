package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class kn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f169641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f169642f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity f169643g;

    public kn(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity, java.lang.String str, int i17, int i18) {
        this.f169643g = snsOnlineVideoActivity;
        this.f169640d = str;
        this.f169641e = i17;
        this.f169642f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$12");
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity = this.f169643g;
        t21.d3.k(com.tencent.mm.plugin.sns.model.y6.i(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.X6(snsOnlineVideoActivity), (r45.jj4) com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.U6(snsOnlineVideoActivity).getTimeLine().ContentObj.f369840h.get(0)), pInt, new com.tencent.mm.pointers.PInt());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15534, this.f169640d, com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.U6(snsOnlineVideoActivity).getTimeLine().Id, java.lang.Integer.valueOf(this.f169641e), java.lang.Integer.valueOf(pInt.value * 1000), java.lang.Integer.valueOf(this.f169642f * 1000));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$12");
    }
}
