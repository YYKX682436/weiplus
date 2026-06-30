package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class x1 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f182010a;

    public x1(com.tencent.mm.plugin.webview.core.e3 e3Var) {
        this.f182010a = e3Var;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        return nf.z.d(url, "weixin://critical_update/");
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 25L, 1L, true);
        com.tencent.mm.plugin.webview.core.e3.d1(this.f182010a, 1);
        return true;
    }
}
