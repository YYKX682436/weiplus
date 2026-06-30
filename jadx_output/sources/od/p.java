package od;

/* loaded from: classes8.dex */
public interface p {
    void addJavascriptInterface(java.lang.Object obj, java.lang.String str);

    void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback);

    android.content.Context getContext();

    java.lang.String getUserAgent();
}
