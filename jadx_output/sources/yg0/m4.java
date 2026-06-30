package yg0;

@j95.b
/* loaded from: classes.dex */
public final class m4 extends i95.w implements zg0.m3 {
    public java.lang.String wi(java.lang.String str) {
        r45.ca7 e17;
        if (com.tencent.mm.plugin.webview.ui.tools.media.e1.f185760k == null) {
            synchronized (com.tencent.mm.plugin.webview.ui.tools.media.e1.class) {
                if (com.tencent.mm.plugin.webview.ui.tools.media.e1.f185760k == null) {
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    com.tencent.mm.plugin.webview.ui.tools.media.e1 e1Var = new com.tencent.mm.plugin.webview.ui.tools.media.e1(context, null);
                    com.tencent.mm.plugin.webview.ui.tools.media.e1.f185760k = e1Var;
                    com.tencent.mm.sdk.event.IListener iListener = e1Var.f185765e;
                    if (iListener != null) {
                        iListener.alive();
                    }
                }
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.media.e1 e1Var2 = com.tencent.mm.plugin.webview.ui.tools.media.e1.f185760k;
        if (e1Var2 == null || (e17 = e1Var2.e(str)) == null) {
            return null;
        }
        return e17.f371406f;
    }
}
