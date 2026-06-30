package com.tencent.xweb.sys;

/* loaded from: classes13.dex */
public class l implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.sys.q f220562d;

    public l(com.tencent.xweb.sys.q qVar) {
        this.f220562d = qVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        by5.c4.f("SysWebFactory", "getCookieManager, not yet init, try create CookieManager");
        android.webkit.CookieManager.getInstance();
        return this.f220562d.h();
    }
}
