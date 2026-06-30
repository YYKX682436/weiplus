package zq5;

/* loaded from: classes11.dex */
public abstract class d {
    public static final long a(int i17, int i18) {
        long j17 = (i18 & io.flutter.embedding.android.KeyboardMap.kValueMask) | (i17 << 32);
        int i19 = zq5.c.f475058c;
        return j17;
    }

    public static final java.lang.String b(long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = zq5.c.f475058c;
        sb6.append((int) (j17 >> 32));
        sb6.append('x');
        sb6.append(zq5.c.a(j17));
        return sb6.toString();
    }
}
