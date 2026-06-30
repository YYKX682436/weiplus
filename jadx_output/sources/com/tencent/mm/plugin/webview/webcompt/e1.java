package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.f1 f187790d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.webview.webcompt.f1 f1Var) {
        super(0);
        this.f187790d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.webcompt.l0 l0Var = (com.tencent.mm.plugin.webview.webcompt.l0) com.tencent.mm.plugin.webview.webcompt.f1.f187807o.poll();
        if (l0Var == null) {
            l0Var = new com.tencent.mm.plugin.webview.webcompt.l0();
        }
        this.f187790d.f187813c = true;
        return l0Var;
    }
}
