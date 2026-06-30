package yx5;

/* loaded from: classes7.dex */
public abstract class e {
    public static java.lang.String a(int i17) {
        if (i17 < 0 || 1440 <= i17) {
            by5.c4.f("ThrottleRemoteInformation", "getCdnConfigUrl, index is not in range.");
            return null;
        }
        return java.lang.String.format("%04d", java.lang.Integer.valueOf(i17)) + ".json";
    }
}
