package ey2;

/* loaded from: classes2.dex */
public final class o2 {
    public o2(kotlin.jvm.internal.i iVar) {
    }

    public static /* synthetic */ java.lang.String b(ey2.o2 o2Var, long j17, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            j17 = 0;
        }
        return o2Var.a(j17, (i19 & 2) != 0 ? null : str, (i19 & 4) != 0 ? null : str2, (i19 & 8) != 0 ? 0 : i17, (i19 & 16) != 0 ? 0 : i18);
    }

    public final java.lang.String a(long j17, java.lang.String str, java.lang.String str2, int i17, int i18) {
        if (j17 != 0) {
            str = pm0.v.u(j17);
        } else if (str == null) {
            str = "0";
        }
        java.lang.String str3 = str + '_' + i17 + '_' + i18;
        if (str2 == null || str2.length() == 0) {
            return str3;
        }
        return str3 + '_' + str2;
    }
}
