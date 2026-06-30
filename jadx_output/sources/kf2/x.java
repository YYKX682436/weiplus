package kf2;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: c, reason: collision with root package name */
    public static final kf2.w f307310c = new kf2.w(null);

    /* renamed from: a, reason: collision with root package name */
    public final df2.k f307311a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.lite.s f307312b;

    public x(df2.k controller, com.tencent.mm.plugin.lite.s liteAppStore) {
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(liteAppStore, "liteAppStore");
        this.f307311a = controller;
        this.f307312b = liteAppStore;
    }

    public final void a(long j17, int i17, xg2.a it) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(it, "it");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        rm0.j jVar = it.f454379a;
        jSONObject.put("errType", jVar != null ? jVar.f397424e : -999);
        jSONObject.put("errCode", jVar != null ? jVar.f397425f : -999);
        if (jVar == null || (str = jVar.f397426g) == null) {
            str = "";
        }
        jSONObject.put("errMsg", str);
        this.f307312b.c(j17, i17, jSONObject.toString());
    }

    public final void b(long j17, int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", 0);
        this.f307312b.c(j17, i17, jSONObject.toString());
    }

    public final void c(long j17, int i17, com.tencent.mm.protobuf.f pb6) {
        kotlin.jvm.internal.o.g(pb6, "pb");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", android.util.Base64.encodeToString(pb6.toByteArray(), 0));
        this.f307312b.c(j17, i17, jSONObject.toString());
    }

    public abstract boolean d(long j17, java.lang.String str, java.lang.Object obj, int i17);

    public abstract java.lang.String e();
}
