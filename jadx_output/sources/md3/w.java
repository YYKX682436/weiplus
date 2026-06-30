package md3;

/* loaded from: classes4.dex */
public final class w extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "preloadFinderVideo";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        org.json.JSONArray optJSONArray = data.optJSONArray("preloadFinderList");
        if (optJSONArray != null) {
            c75.c.d(optJSONArray, md3.v.f325862d);
        }
    }
}
