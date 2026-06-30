package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class q3 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f187510b = java.util.regex.Pattern.compile(".*#.*wechat_redirect");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f187511a;

    public q3(java.lang.String str) {
        this.f187511a = null;
        this.f187511a = str;
    }

    public int a(java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMWebViewClient", "getReason fail, url is null");
            return 0;
        }
        if (str.equals(this.f187511a) && z17) {
            return 0;
        }
        return f187510b.matcher(str).find() ? 2 : 1;
    }
}
