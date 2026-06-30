package md3;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final md3.v f325862d = new md3.v();

    public v() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject jsonObject = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
        java.lang.String optString = jsonObject.optString("exportId");
        java.lang.String optString2 = jsonObject.optString("nonceId");
        java.lang.String optString3 = jsonObject.optString("objectId");
        i95.m c17 = i95.n0.c(zy2.a7.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        kotlin.jvm.internal.o.d(optString);
        zy2.a7.Ea((zy2.a7) c17, optString, optString2, 65, 1, 0, 16, null);
        com.tencent.mars.xlog.Log.i("MBJsApiPreloadFinderVideo", "tryPreloadFinderVideo exportId=" + optString + " nonceId=" + optString2 + " objectId=" + optString3);
        return jz5.f0.f302826a;
    }
}
