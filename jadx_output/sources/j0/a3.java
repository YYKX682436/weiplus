package j0;

/* loaded from: classes13.dex */
public abstract class a3 {
    public static final int a(java.lang.CharSequence charSequence, int i17) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        int length = charSequence.length();
        for (int i18 = i17 + 1; i18 < length; i18++) {
            if (charSequence.charAt(i18) == '\n') {
                return i18;
            }
        }
        return charSequence.length();
    }
}
