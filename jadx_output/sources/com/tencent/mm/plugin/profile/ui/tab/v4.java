package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class v4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.o4 f154623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154624e;

    public v4(com.tencent.mm.sdk.platformtools.o4 o4Var, com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        this.f154623d = o4Var;
        this.f154624e = contactWidgetTabBizInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "checkCrash clear crash flag");
        com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = this.f154624e;
        this.f154623d.G(contactWidgetTabBizInfo.f154217w, false);
        contactWidgetTabBizInfo.f154216v = false;
    }
}
