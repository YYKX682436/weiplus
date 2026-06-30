package if1;

/* loaded from: classes4.dex */
public abstract class d {
    public static void a(android.view.View view, org.json.JSONObject jSONObject) {
        if (view == null || jSONObject == null || !jSONObject.has("accessibility") || !jSONObject.optBoolean("accessibility", false)) {
            return;
        }
        view.setAccessibilityDelegate(new if1.c(jSONObject.optString("ariaLabel", ""), jSONObject.optString("ariaRole", "")));
    }
}
