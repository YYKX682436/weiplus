package sf;

/* loaded from: classes7.dex */
public interface f {
    default java.lang.String a(jc1.d dVar) {
        return g(dVar.f298904b);
    }

    default java.lang.String b(jc1.d dVar, java.util.Map map) {
        return h(dVar.f298904b, map);
    }

    org.json.JSONObject c();

    default java.lang.String d(java.lang.String str, jc1.d dVar) {
        return g(str);
    }

    void e(sf.e eVar);

    void f();

    java.lang.String g(java.lang.String str);

    java.lang.String getAppId();

    android.content.Context getContext();

    java.lang.String h(java.lang.String str, java.util.Map map);

    void i(sf.e eVar);

    boolean j();

    boolean k();

    java.lang.String l();

    com.tencent.mm.plugin.appbrand.jsapi.l m();
}
