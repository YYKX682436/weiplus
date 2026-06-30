package qj1;

/* loaded from: classes7.dex */
public abstract class c {
    public static java.lang.String a(java.lang.String[] strArr) {
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        return "," + (str.replaceFirst(",", "") + " )");
    }
}
