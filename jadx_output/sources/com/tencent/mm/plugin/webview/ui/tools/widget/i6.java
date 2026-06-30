package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class i6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.n f187270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f187271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f187273g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f187274h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f187275i;

    public i6(nw4.n nVar, com.tencent.mm.plugin.webview.permission.w wVar, java.lang.String str, long j17, int i17, float f17) {
        this.f187270d = nVar;
        this.f187271e = wVar;
        this.f187272f = str;
        this.f187273g = j17;
        this.f187274h = i17;
        this.f187275i = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.permission.w wVar;
        if (this.f187270d == null || (wVar = this.f187271e) == null || !wVar.c().f(42)) {
            return;
        }
        this.f187270d.C(this.f187272f, this.f187273g, this.f187274h, this.f187275i);
    }
}
