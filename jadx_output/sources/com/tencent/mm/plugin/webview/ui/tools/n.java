package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public final class n extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.n f185849d = new com.tencent.mm.plugin.webview.ui.tools.n();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String Z;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (env.f340862c != null) {
            zg0.q2 a17 = env.a();
            boolean z17 = false;
            if (a17 != null && (Z = ((com.tencent.mm.plugin.webview.core.r0) a17).Z()) != null && !hy4.i.p(Z)) {
                z17 = true;
            }
            if (z17) {
                try {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("key_on_secure_video_action_is_live", kotlin.jvm.internal.o.b(msg.f340790a.get("isLiveStream"), "true"));
                    com.tencent.mm.plugin.webview.stub.z0 b17 = env.b();
                    if (b17 != null) {
                        b17.i(121004, bundle);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReportSecureAction", "reportSecureAction ex " + e17.getMessage());
                }
            }
        }
        env.f340863d.e(msg.f341013c, "reportSecureAction:ok", new java.util.HashMap());
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return -2;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "reportSecureAction";
    }
}
