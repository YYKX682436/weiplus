package tl3;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.MusicPlayReportStruct f420296a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f420297b = "1.0";

    public static void a() {
        com.tencent.mm.autogen.mmdata.rpt.MusicPlayReportStruct musicPlayReportStruct = f420296a;
        if (musicPlayReportStruct == null) {
            return;
        }
        musicPlayReportStruct.k();
    }

    public static java.lang.String b(java.lang.String[] strArr) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i17 = 0; i17 < strArr.length; i17++) {
            stringBuffer.append(strArr[i17]);
            if (i17 != strArr.length - 1) {
                stringBuffer.append("|");
            }
        }
        return stringBuffer.toString();
    }

    public static void c() {
        if (f420296a == null) {
            return;
        }
        f420296a.p(b(new java.lang.String[]{java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), f420297b, "end/stop", "1.0", java.lang.String.valueOf(b21.m.a().f17338b)}));
        a();
    }
}
