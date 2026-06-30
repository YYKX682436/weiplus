package o35;

/* loaded from: classes.dex */
public enum b {
    ;

    public static java.lang.String a(java.util.Map map) {
        if (map == null) {
            return "null";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "null";
            }
            sb6.append(str);
            sb6.append(" : ");
            java.util.List<java.lang.String> list = (java.util.List) entry.getValue();
            if (list != null && list.size() > 0) {
                for (java.lang.String str2 : list) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb6.append(str2);
                    sb6.append("|");
                }
            }
            sb6.append("\n");
        }
        return sb6.toString();
    }

    public static o35.b valueOf(java.lang.String str) {
        android.support.v4.media.f.a(java.lang.Enum.valueOf(o35.b.class, str));
        return null;
    }
}
