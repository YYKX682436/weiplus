package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.l0 f136879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.finder.webview.l0 l0Var) {
        super(1);
        this.f136879d = l0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        oy2.s debugInfo = (oy2.s) obj;
        kotlin.jvm.internal.o.g(debugInfo, "debugInfo");
        com.tencent.mm.plugin.finder.webview.p0 p0Var = this.f136879d.f136892l;
        com.tencent.mm.plugin.finder.webview.FinderWebViewHelper finderWebViewHelper = p0Var instanceof com.tencent.mm.plugin.finder.webview.FinderWebViewHelper ? (com.tencent.mm.plugin.finder.webview.FinderWebViewHelper) p0Var : null;
        if (finderWebViewHelper == null) {
            return null;
        }
        finderWebViewHelper.reloadUrl(debugInfo.f350001a);
        return jz5.f0.f302826a;
    }
}
