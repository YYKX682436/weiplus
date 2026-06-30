package com.tencent.mm.plugin.webview.core;

/* loaded from: classes7.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.h1 f181762d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.mm.plugin.webview.core.h1 h1Var) {
        super(0);
        this.f181762d = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17;
        try {
            java.lang.String a17 = kk.v.a((int) this.f181762d.f181839a);
            kotlin.jvm.internal.o.f(a17, "getString(...)");
            j17 = java.lang.Long.parseLong(a17);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebPageErrorMonitor", "uin parse error");
            j17 = 0;
        }
        return java.lang.Long.valueOf(j17);
    }
}
