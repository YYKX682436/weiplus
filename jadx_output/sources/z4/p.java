package z4;

/* loaded from: classes13.dex */
public abstract class p {
    public static void a(android.webkit.SafeBrowsingResponse safeBrowsingResponse, boolean z17) {
        safeBrowsingResponse.backToSafety(z17);
    }

    public static android.net.Uri b() {
        return android.webkit.WebView.getSafeBrowsingPrivacyPolicyUrl();
    }

    public static void c(android.webkit.SafeBrowsingResponse safeBrowsingResponse, boolean z17) {
        safeBrowsingResponse.proceed(z17);
    }

    public static void d(java.util.List<java.lang.String> list, android.webkit.ValueCallback<java.lang.Boolean> valueCallback) {
        android.webkit.WebView.setSafeBrowsingWhitelist(list, valueCallback);
    }

    public static void e(android.webkit.SafeBrowsingResponse safeBrowsingResponse, boolean z17) {
        safeBrowsingResponse.showInterstitial(z17);
    }

    public static void f(android.content.Context context, android.webkit.ValueCallback<java.lang.Boolean> valueCallback) {
        android.webkit.WebView.startSafeBrowsing(context, valueCallback);
    }
}
