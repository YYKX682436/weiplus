package k91;

/* loaded from: classes4.dex */
public enum h3 {
    ;

    public static r45.t8 a(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("AppConfig");
        r45.t8 t8Var = new r45.t8();
        if (optJSONObject != null) {
            org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("VersionList");
            t8Var.f386203d = new java.util.LinkedList();
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i17);
                    r45.yy6 yy6Var = new r45.yy6();
                    yy6Var.f391513d = optJSONObject2.optInt("type");
                    yy6Var.f391514e = optJSONObject2.optInt("version");
                    t8Var.f386203d.add(yy6Var);
                }
            }
        }
        return t8Var;
    }

    public static k91.h3 valueOf(java.lang.String str) {
        android.support.v4.media.f.a(java.lang.Enum.valueOf(k91.h3.class, str));
        return null;
    }
}
