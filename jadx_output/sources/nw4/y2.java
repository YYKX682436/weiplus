package nw4;

/* loaded from: classes.dex */
public class y2 extends nw4.a {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f341012b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f341013c;

    /* renamed from: d, reason: collision with root package name */
    public org.json.JSONObject f341014d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Bundle f341015e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protocal.JsapiPermissionWrapper f341016f;

    /* renamed from: g, reason: collision with root package name */
    public nw4.e f341017g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f341018h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f341019i;

    public static android.os.Bundle b(java.util.Map map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.lang.String str : map.keySet()) {
            java.lang.Object obj = map.get(str);
            if (obj instanceof java.lang.String[]) {
                bundle.putStringArray(str, (java.lang.String[]) obj);
            } else if (obj instanceof android.os.Bundle) {
                bundle.putBundle(str, (android.os.Bundle) obj);
            } else {
                bundle.putString(str, java.lang.String.valueOf(obj));
            }
        }
        return bundle;
    }

    public java.util.Map c() {
        return this.f341018h;
    }
}
