package tx0;

/* loaded from: classes.dex */
public abstract class a {
    public static final com.tencent.maas.moviecomposing.segments.GeographicInfo a(com.tencent.mm.modelgeo.Addr addr) {
        java.lang.String str;
        java.lang.String str2 = addr != null ? addr.f71213f : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = addr != null ? addr.f71212e : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String t17 = (addr == null || (str = addr.f71214g) == null) ? "" : r26.i0.t(str, "市", "", false);
        java.lang.String c17 = addr != null ? addr.c() : null;
        if (c17 == null) {
            c17 = "";
        }
        return new com.tencent.maas.moviecomposing.segments.GeographicInfo(str2, str3, t17, "", c17, addr != null ? addr.f71211d : null);
    }
}
