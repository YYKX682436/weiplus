package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.f1 f187955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f187957f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.plugin.webview.webcompt.f1 f1Var, java.lang.String str, yz5.l lVar) {
        super(0);
        this.f187955d = f1Var;
        this.f187956e = str;
        this.f187957f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nw4.n nVar = (nw4.n) this.f187955d.f187811a.get();
        if (nVar != null) {
            com.tencent.mm.plugin.webview.webcompt.y0 y0Var = new com.tencent.mm.plugin.webview.webcompt.y0(this.f187957f);
            boolean e17 = com.tencent.mm.sdk.platformtools.u3.e();
            java.lang.String str = this.f187956e;
            if (e17) {
                nVar.f340887a.evaluateJavascript(str, y0Var);
            } else {
                com.tencent.mm.sdk.platformtools.u3.h(new nw4.j2(nVar, str, y0Var));
            }
        }
        return jz5.f0.f302826a;
    }
}
