package r26;

/* loaded from: classes13.dex */
public abstract class j {
    public static final boolean a(java.lang.String str) {
        for (int i17 = 0; i17 < str.length(); i17++) {
            char charAt = str.charAt(i17);
            if (kotlin.jvm.internal.o.i(charAt, 128) >= 0 || java.lang.Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }
}
