package re2;

/* loaded from: classes3.dex */
public abstract class g0 {
    public static final void a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("Finder.CoLiveHelpPageHelper", "openLearnMore");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://channels-aladin.wxqcloud.qq.com/aladin/html/5938d9c5-a979-41dd-9a2e-e2e220741591.html?hexBackgroundColor=EDEDED#/");
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
