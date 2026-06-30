package com.tencent.mm.plugin.webview.core;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        super(0);
        this.f181994d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f181994d.d0().getStringExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
    }
}
