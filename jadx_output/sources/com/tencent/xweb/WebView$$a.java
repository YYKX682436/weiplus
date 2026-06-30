package com.tencent.xweb;

/* loaded from: classes13.dex */
public final /* synthetic */ class WebView$$a implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx5.i f220201d;

    public /* synthetic */ WebView$$a(tx5.i iVar) {
        this.f220201d = iVar;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        com.tencent.xweb.f1 f1Var = com.tencent.xweb.WebView.f220189m;
        by5.c4.a("WebView", "initWebViewCoreComponentsWrapper, setting ProfileStore, CookieManager, WebStorage.");
        com.tencent.xweb.c0 a17 = com.tencent.xweb.c0.a();
        tx5.i iVar = this.f220201d;
        tx5.d profileStore = iVar.getProfileStore();
        a17.getClass();
        by5.a1.a();
        by5.c4.f("ProfileStore", "setProfileStoreWrapper:" + profileStore);
        a17.f220219a = profileStore;
        com.tencent.xweb.d g17 = com.tencent.xweb.d.g();
        tx5.b cookieManager = iVar.getCookieManager();
        g17.getClass();
        if (cookieManager == null) {
            by5.c4.g("CookieManager", "Constructing with null object.");
        } else {
            by5.c4.f("CookieManager", "setCookieManagerWrapper: " + cookieManager);
            g17.f220236a = cookieManager;
        }
        com.tencent.xweb.a1 c17 = com.tencent.xweb.a1.c();
        tx5.e e17 = iVar.e();
        c17.getClass();
        if (e17 == null) {
            by5.c4.g("WebStorage", "Constructing with null object.");
            return null;
        }
        by5.c4.f("WebStorage", "setWebStorageWrapper: " + e17);
        c17.f220207a = e17;
        return null;
    }
}
