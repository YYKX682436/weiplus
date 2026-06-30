package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f184746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184748f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(android.content.Context context, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f184746d = context;
        this.f184747e = str;
        this.f184748f = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f184747e;
        kotlin.jvm.internal.o.d(str);
        android.content.Context context = this.f184746d;
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String url = this.f184748f;
        kotlin.jvm.internal.o.g(url, "url");
        android.net.Uri parse = android.net.Uri.parse(url);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(str);
        u1Var.a(true);
        u1Var.b(new com.tencent.mm.plugin.webview.ui.tools.h3(parse, context));
        u1Var.e(com.tencent.mm.plugin.webview.ui.tools.i3.f184820d);
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
