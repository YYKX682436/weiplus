package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f175030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175031f;

    public l(com.tencent.mm.plugin.topstory.ui.home.j jVar, java.lang.String str, android.content.Intent intent) {
        this.f175031f = jVar;
        this.f175029d = str;
        this.f175030e = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f175029d;
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175031f;
        jVar.Q = com.tencent.mm.plugin.topstory.ui.home.j.a(jVar, str);
        j45.l.n(jVar.f174986d, "webview", ".ui.tools.WebViewUI", this.f175030e, 16);
    }
}
