package hr0;

/* loaded from: classes8.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public static final hr0.v f283336d = new hr0.v();

    public v() {
        super(4);
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        ((java.lang.Number) obj).intValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        java.lang.String str2 = (java.lang.String) obj4;
        if (com.tencent.mm.xlog.app.XLogSetup.hasInit && kotlin.jvm.internal.o.b(com.tencent.mm.xlog.app.XLogSetup.isLogcatOpen, java.lang.Boolean.FALSE)) {
            java.lang.String str3 = "LOGCAT-" + str;
            if (intValue != 2 && intValue != 3) {
                if (intValue == 4) {
                    com.tencent.mars.xlog.Log.i(str3, str2);
                } else if (intValue == 5) {
                    com.tencent.mars.xlog.Log.w(str3, str2);
                } else if (intValue != 6) {
                    com.tencent.mars.xlog.Log.e("LOGCAT-" + intValue + '-' + str, str2);
                } else {
                    com.tencent.mars.xlog.Log.e(str3, str2);
                }
            }
        }
        return 0;
    }
}
