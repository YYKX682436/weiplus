package o25;

/* loaded from: classes8.dex */
public abstract class y {
    public static int a(java.lang.String str) {
        return ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).fj(false, str, false, false);
    }

    public static int b(java.lang.String str) {
        int lastIndexOf = str.lastIndexOf(".");
        return a((lastIndexOf < 0 || lastIndexOf >= str.length() + (-1)) ? "" : str.substring(lastIndexOf + 1));
    }
}
