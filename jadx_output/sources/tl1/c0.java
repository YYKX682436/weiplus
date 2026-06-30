package tl1;

/* loaded from: classes13.dex */
public abstract class c0 {
    public static int[] a(java.lang.String str) {
        java.lang.String[] split;
        int i17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (split = str.split(":")) != null && split.length == 2) {
            boolean z17 = false;
            int i18 = -1;
            try {
                i17 = java.lang.Integer.parseInt(split[0], 10);
            } catch (java.lang.Exception unused) {
                i17 = -1;
            }
            try {
                i18 = java.lang.Integer.parseInt(split[1], 10);
            } catch (java.lang.Exception unused2) {
            }
            if (i17 >= 0 && i17 <= 23) {
                if (i18 >= 0 && i18 <= 59) {
                    z17 = true;
                }
                if (z17) {
                    return new int[]{i17, i18};
                }
            }
        }
        return null;
    }
}
