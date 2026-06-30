package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent f152749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.AnonymousClass2 f152750e;

    public w1(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.AnonymousClass2 anonymousClass2, com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent) {
        this.f152750e = anonymousClass2;
        this.f152749d = jsApiOfflineUserBindQueryResultCallBackEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.uh uhVar = this.f152749d.f54445g;
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.this.doSceneForceProgress(new ss4.d(uhVar.f8085a, uhVar.f8089e, uhVar.f8088d, uhVar.f8090f, uhVar.f8092h, uhVar.f8091g, 23, uhVar.f8086b, uhVar.f8087c, com.tencent.mm.plugin.appbrand.jsapi.m8.NAME, 1137));
    }
}
