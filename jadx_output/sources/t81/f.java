package t81;

/* loaded from: classes4.dex */
public class f extends dm.p9 implements qj1.d {

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String[] f416358x;

    /* renamed from: y, reason: collision with root package name */
    public static final l75.e0 f416359y;

    static {
        java.lang.String[] strArr = {"appId", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE};
        f416358x = strArr;
        f416359y = dm.p9.initAutoDBInfo(t81.f.class);
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f416359y;
        sb6.append(e0Var.f316956e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f316956e = sb6.toString();
    }

    @Override // dm.p9, l75.f0
    public l75.e0 getDBInfo() {
        return f416359y;
    }

    @Override // qj1.d
    public java.lang.String[] getKeys() {
        return f416358x;
    }
}
