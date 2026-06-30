package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.f1 f187937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187939f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187940g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.webview.webcompt.f1 f1Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(0);
        this.f187937d = f1Var;
        this.f187938e = str;
        this.f187939f = str2;
        this.f187940g = str3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.webcompt.f1 f1Var = this.f187937d;
        com.tencent.mm.plugin.appbrand.jsruntime.r f17 = f1Var.f(this.f187938e);
        if (f17 != null) {
            f1Var.h(f17, "WeixinWebCompt._dispatch('" + this.f187939f + "', " + this.f187940g + ')');
        }
        return jz5.f0.f302826a;
    }
}
