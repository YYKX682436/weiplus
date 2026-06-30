package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f140361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f140362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f140363f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f140364g;

    public m(java.lang.String str, int i17, int i18, boolean z17) {
        this.f140361d = str;
        this.f140362e = i17;
        this.f140363f = i18;
        this.f140364g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f140362e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = this.f140363f;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.String str = this.f140361d;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameControlCmdParser", "MicroMsg.Wepkg message pkgid:%s, downloadTriggerType:%d, downloadType:%d", str, valueOf, valueOf2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.autogen.events.WepkgNotifyEvent wepkgNotifyEvent = new com.tencent.mm.autogen.events.WepkgNotifyEvent();
        am.t20 t20Var = wepkgNotifyEvent.f54992g;
        t20Var.f7969a = 1;
        t20Var.f7970b = str;
        t20Var.f7973e = i17;
        t20Var.f7974f = i18;
        wepkgNotifyEvent.e();
        if (this.f140364g) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(858L, 15L, 1L, false);
        }
    }
}
