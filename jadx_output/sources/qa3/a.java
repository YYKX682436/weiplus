package qa3;

/* loaded from: classes15.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f361035a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f361036b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f361037c;

    /* renamed from: d, reason: collision with root package name */
    public final long f361038d;

    public a(java.lang.String cmd, org.json.JSONObject jsonObject) {
        kotlin.jvm.internal.o.g(cmd, "cmd");
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
        this.f361035a = jsonObject;
        this.f361036b = "LiteAppTestCMD";
        this.f361037c = "appId";
        this.f361038d = jsonObject.has("timer") ? jsonObject.getLong("timer") : 0L;
    }

    public abstract void a(java.util.concurrent.CountDownLatch countDownLatch);

    public java.lang.String toString() {
        java.lang.String jSONObject = this.f361035a.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }
}
