package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes7.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.n f186369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186370e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(nw4.n nVar, java.lang.String str) {
        super(0);
        this.f186369d = nVar;
        this.f186370e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0.f186402e;
        java.lang.String str2 = this.f186370e;
        if (str2 == null) {
            str2 = "";
        }
        this.f186369d.e(str, str2, null);
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0.f186402e = "";
        return jz5.f0.f302826a;
    }
}
