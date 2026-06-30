package tp3;

/* loaded from: classes8.dex */
public abstract class b {
    public static java.lang.String a(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        int length = str.length();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(length);
        for (int i17 = 0; i17 < length; i17++) {
            sb6.append((char) ((byte) (((((byte) str.charAt(i17)) ^ (i17 - length)) ^ 60) & 255)));
        }
        return sb6.toString();
    }
}
