package wq3;

/* loaded from: classes15.dex */
public abstract class h {
    public static java.lang.String a(android.content.Context context, r45.gm0 gm0Var) {
        if (gm0Var.f375362e <= 0) {
            return context.getString(com.tencent.mm.R.string.gsf);
        }
        return gm0Var.f375361d + " " + b(gm0Var.f375362e, gm0Var.f375363f);
    }

    public static java.lang.String b(double d17, java.lang.String str) {
        return ("CNY".equals(str) || "1".equals(str) || com.tencent.mm.sdk.platformtools.t8.K0(str)) ? java.lang.String.format("¥%.2f", java.lang.Double.valueOf(d17 / 100.0d)) : java.lang.String.format("%s%.2f", str, java.lang.Double.valueOf(d17 / 100.0d));
    }

    public static java.lang.String c(int i17, int i18, java.lang.String str) {
        return i17 == i18 ? b(i17, str) : java.lang.String.format("%s~%s", b(i18, str), b(i17, str));
    }
}
