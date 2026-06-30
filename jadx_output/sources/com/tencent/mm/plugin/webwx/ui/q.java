package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class q implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f188058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f188059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188060f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI f188061g;

    public q(int i17, int i18, java.lang.String str, com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI loginDeviceListUI) {
        this.f188058d = i17;
        this.f188059e = i18;
        this.f188060f = str;
        this.f188061g = loginDeviceListUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = this.f188059e;
        java.lang.String str = this.f188060f;
        int i19 = this.f188058d;
        com.tencent.mm.modelsimple.m1 m1Var = new com.tencent.mm.modelsimple.m1(1, i19, i18, str);
        c01.d9.e().g(m1Var);
        com.tencent.mm.autogen.events.RtosWatchWebWXLogoutEvent rtosWatchWebWXLogoutEvent = new com.tencent.mm.autogen.events.RtosWatchWebWXLogoutEvent();
        rtosWatchWebWXLogoutEvent.f54719g.f6970a = i19;
        rtosWatchWebWXLogoutEvent.e();
        com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI loginDeviceListUI = this.f188061g;
        loginDeviceListUI.f187985g = db5.e1.Q(loginDeviceListUI.getContext(), loginDeviceListUI.getString(com.tencent.mm.R.string.f490573yv), loginDeviceListUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.webwx.ui.p(m1Var, loginDeviceListUI));
    }
}
