package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class r0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.jsapi.r0 f185376d = new com.tencent.mm.plugin.webview.ui.tools.jsapi.r0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.f340790a.get("productId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        boolean z17 = str == null || str.length() == 0;
        nw4.g gVar = env.f340863d;
        if (z17) {
            gVar.e(msg.f341013c, "invokeMiniProgramAPI:fail empty productId", null);
        } else {
            qk.c0 c0Var = new qk.c0(str);
            c0Var.f364155a = 12;
            c0Var.f364198g = 12;
            com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
            if (p6Var == null) {
                gVar.e(msg.f341013c, "invokeMiniProgramAPI:fail internal error", null);
                return true;
            }
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(env.f340860a, c0Var);
            gVar.e(msg.f341013c, "openStoreEmoticonDetailPage:ok", null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.wxmm.v2helper.EMethodOutputVolumeScaleEnable;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openStoreEmoticonDetailPage";
    }
}
