package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public final class d3 implements com.tencent.mm.model.gdpr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.f3 f182840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.e3 f182841c;

    public d3(java.lang.String str, com.tencent.mm.plugin.webview.model.f3 f3Var, com.tencent.mm.plugin.webview.model.e3 e3Var) {
        this.f182839a = str;
        this.f182840b = f3Var;
        this.f182841c = e3Var;
    }

    @Override // com.tencent.mm.model.gdpr.b
    public final void a(int i17) {
        p95.a.b(true, new com.tencent.mm.plugin.webview.model.c3(i17, this.f182839a, this.f182840b, this.f182841c));
    }
}
