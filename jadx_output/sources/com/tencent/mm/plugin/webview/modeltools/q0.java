package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes7.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.modeltools.q0 f183337d = new com.tencent.mm.plugin.webview.modeltools.q0();

    public q0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = org.xwalk.core.XWalkEnvironment.k() != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPreloadRenderProcessHelper", "isMulti:" + z17);
        return java.lang.Boolean.valueOf(z17);
    }
}
