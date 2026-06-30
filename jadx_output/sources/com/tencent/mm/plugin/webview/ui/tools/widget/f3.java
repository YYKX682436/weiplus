package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f187211f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f187212g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.p3 f187213h;

    public f3(com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        this.f187213h = p3Var;
        this.f187209d = str;
        this.f187210e = str2;
        this.f187211f = bundle;
        this.f187212g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f187213h.f187495f.f187554g.O(this.f187209d, this.f187210e, nw4.a.a(this.f187211f), this.f187212g);
    }
}
