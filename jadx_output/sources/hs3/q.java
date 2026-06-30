package hs3;

/* loaded from: classes.dex */
public abstract class q {
    public static java.lang.String a(java.lang.String str, java.lang.String str2, java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
            sb6.append(str + "");
        }
        sb6.append(str2);
        if (map == null) {
            return sb6.toString();
        }
        sb6.append('?');
        boolean z17 = true;
        for (java.lang.String str3 : map.keySet()) {
            java.lang.String str4 = (java.lang.String) map.get(str3);
            sb6.append(z17 ? "" : "&");
            sb6.append(java.net.URLEncoder.encode(str3, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
            sb6.append('=');
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str4 == null) {
                str4 = "";
            }
            sb6.append(java.net.URLEncoder.encode(str4, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
            z17 = false;
        }
        return sb6.toString();
    }
}
