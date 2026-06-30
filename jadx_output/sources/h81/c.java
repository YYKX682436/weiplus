package h81;

/* loaded from: classes10.dex */
public class c implements bi3.a {
    public bi3.b a(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, long j17, long j18, int i28, int i29) {
        int i37 = wo.v1.f447829i.f447696j;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightPresendRemuxerImpl", "get, configRemuxerType: %s", java.lang.Integer.valueOf(i37));
        if (i37 != -1) {
            if (i37 == 1) {
                return new fi3.e(str, str2, i17, i18, i19, i27, j17, j18);
            }
            if (i37 == 2) {
                return new fi3.g(str, str2, i17, i18, i19, i27, j17, j18, i28, i29);
            }
        }
        return fp.h.c(19) ? new fi3.e(str, str2, i17, i18, i19, i27, j17, j18) : new fi3.g(str, str2, i17, i18, i19, i27, j17, j18, i28, i29);
    }
}
