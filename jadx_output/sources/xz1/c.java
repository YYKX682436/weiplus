package xz1;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final xz1.c f458176d = new xz1.c();

    public c() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("WebKit-Version", (java.lang.String) ((jz5.n) xz1.k.f458188m).getValue());
        jSONObject.put("User-Agent", "MMDevTools");
        jSONObject.put("Protocol-Version", "1.3");
        jSONObject.put("Browser", "chrome/70");
        jSONObject.put("Android-Package", com.tencent.mm.sdk.platformtools.x2.f193072b);
        return jSONObject.toString();
    }
}
