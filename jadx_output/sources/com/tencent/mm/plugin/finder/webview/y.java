package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.FinderWebViewHelper f136936d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.finder.webview.FinderWebViewHelper finderWebViewHelper) {
        super(3);
        this.f136936d = finderWebViewHelper;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.f136936d.onCreateBoxWebViewEnd(((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), ((java.lang.Boolean) obj3).booleanValue());
        return jz5.f0.f302826a;
    }
}
