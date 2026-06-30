package u11;

/* loaded from: classes12.dex */
public abstract class c {
    public static java.lang.String a(java.lang.String str) {
        return (str.startsWith("+886") || str.startsWith("+86")) ? "zh-TW" : (str.startsWith("+852") || str.startsWith("+853")) ? "zh-HK" : str.startsWith("+81") ? "ja" : str.startsWith("+82") ? "ko" : str.startsWith("+66") ? "th" : str.startsWith("+84") ? "vi" : str.startsWith("+62") ? dm.i4.COL_ID : str.startsWith("+55") ? "pt" : str.startsWith("+34") ? "es-419" : "en";
    }

    public static boolean b(java.lang.String str) {
        return str != null && str.length() > 1 && str.startsWith("+") && !str.startsWith("+86");
    }

    public static boolean c() {
        if (i()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
            if (yp5.a.f464409a.a()) {
                return true;
            }
        }
        return false;
    }

    public static boolean d() {
        return (c01.z1.f() == 0 && i()) ? false : true;
    }

    public static boolean e(java.lang.String str) {
        return !com.tencent.mm.sdk.platformtools.t8.K0(str) && new java.util.HashSet(java.util.Arrays.asList("43,32,359,357,420,385,45,372,358,33,49,30,36,353,39,371,40,370,352,356,31,48,351,421,386,34,46,44,354,423,47,41,90".split(","))).contains(str);
    }

    public static boolean f(java.lang.String str) {
        return !com.tencent.mm.sdk.platformtools.t8.K0(str) && new java.util.HashSet(java.util.Arrays.asList("AT,BE,BG,CY,CZ,HR,DK,EE,FI,FR,DE,GR,HU,IE,IT,LV,RO,LT,LU,MT,NL,PL,PT,SK,SI,ES,SE,GB,IS,LI,NO,CH,TR".split(","))).contains(str.toUpperCase());
    }

    public static boolean g() {
        return (com.tencent.mm.sdk.platformtools.m2.j() || com.tencent.mm.sdk.platformtools.m2.d().equals("en")) ? false : true;
    }

    public static boolean h() {
        if (com.tencent.mm.sdk.platformtools.m2.d().equals("zh_CN")) {
            return java.util.TimeZone.getDefault().getRawOffset() != java.util.TimeZone.getTimeZone("GMT+08:00").getRawOffset();
        }
        return true;
    }

    public static boolean i() {
        return com.tencent.mm.sdk.platformtools.t8.P0(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }
}
