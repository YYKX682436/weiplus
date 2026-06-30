package t00;

/* loaded from: classes.dex */
public interface r0 {
    t00.m a();

    default boolean b() {
        return false;
    }

    void c(int i17, android.content.Context context, org.json.JSONObject jSONObject, c00.n3 n3Var, org.json.JSONObject jSONObject2);

    default boolean d(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        return false;
    }

    default void e(int i17, org.json.JSONObject data, org.json.JSONObject jSONObject, c00.q3 envHandler) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(envHandler, "envHandler");
    }

    default org.json.JSONObject f(int i17, android.content.Context context, org.json.JSONObject data, c00.q3 envHandler) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(envHandler, "envHandler");
        return null;
    }

    default boolean g() {
        return this instanceof t00.h;
    }
}
