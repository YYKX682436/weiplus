package com.tencent.mm.plugin.webview.model;

/* loaded from: classes15.dex */
public class l3 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.i3 f182994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.SendAuth.Options f182996c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f182997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182999f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f183000g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.j3 f183001h;

    public l3(com.tencent.mm.plugin.webview.model.j3 j3Var, com.tencent.mm.plugin.webview.model.i3 i3Var, java.lang.String str, com.tencent.mm.opensdk.modelmsg.SendAuth.Options options, int i17, java.lang.String str2, java.lang.String str3, int i18) {
        this.f183001h = j3Var;
        this.f182994a = i3Var;
        this.f182995b = str;
        this.f182996c = options;
        this.f182997d = i17;
        this.f182998e = str2;
        this.f182999f = str3;
        this.f183000g = i18;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        this.f183001h.e(this.f182994a, this.f182995b, this.f182996c);
        com.tencent.mm.pluginsdk.model.app.j1.a(this.f182997d, this.f182998e, this.f182999f, 1, com.tencent.mm.pluginsdk.model.app.f5.a(this.f183000g), 3);
    }
}
