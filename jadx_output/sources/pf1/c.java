package pf1;

/* loaded from: classes7.dex */
public interface c extends gb1.l {
    @Override // gb1.l
    default void d(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        try {
            data.put("webviewId", hashCode());
        } catch (org.json.JSONException unused) {
        }
    }

    android.view.View getAndroidView();

    pf1.d getWebView();
}
