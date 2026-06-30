package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class m1 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.m1 f186352d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.m1();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("clipboard");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        android.content.ClipData primaryClip = ((android.content.ClipboardManager) systemService).getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            android.content.ClipData.Item itemAt = primaryClip.getItemAt(0);
            java.lang.CharSequence text = itemAt.getText();
            if (text != null) {
                hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, text);
            }
            java.lang.String htmlText = itemAt.getHtmlText();
            if (htmlText != null) {
                hashMap.put("htmlText", htmlText);
            }
        }
        pm0.v.X(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.l1(env));
        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", hashMap);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 404;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return be1.r.NAME;
    }
}
