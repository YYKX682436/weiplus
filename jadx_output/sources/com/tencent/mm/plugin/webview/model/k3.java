package com.tencent.mm.plugin.webview.model;

/* loaded from: classes15.dex */
public class k3 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.SendAuth.Options f182982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f182984c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f182985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f182986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182987f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.j3 f182988g;

    public k3(com.tencent.mm.plugin.webview.model.j3 j3Var, com.tencent.mm.opensdk.modelmsg.SendAuth.Options options, java.lang.String str, int i17, boolean z17, int i18, java.lang.String str2) {
        this.f182988g = j3Var;
        this.f182982a = options;
        this.f182983b = str;
        this.f182984c = i17;
        this.f182985d = z17;
        this.f182986e = i18;
        this.f182987f = str2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        this.f182988g.d(-2, this.f182982a, this.f182983b, this.f182984c, this.f182985d);
        com.tencent.mm.pluginsdk.model.app.j1.a(this.f182986e, this.f182987f, this.f182983b, 1, com.tencent.mm.pluginsdk.model.app.f5.a(this.f182984c), 4);
    }
}
