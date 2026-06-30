package r01;

/* loaded from: classes4.dex */
public abstract class w1 {
    public static java.lang.String a(java.lang.String str, int i17, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mmkv_biztransfer");
        sb6.append(str);
        sb6.append("_");
        sb6.append(i17);
        if (str2 != null) {
            sb6.append("_");
            sb6.append(str2);
        }
        return sb6.toString();
    }
}
