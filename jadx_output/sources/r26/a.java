package r26;

/* loaded from: classes10.dex */
public abstract class a {
    public static final int a(int i17) {
        boolean z17 = false;
        if (2 <= i17 && i17 < 37) {
            z17 = true;
        }
        if (z17) {
            return i17;
        }
        throw new java.lang.IllegalArgumentException("radix " + i17 + " was not in valid range " + new e06.k(2, 36));
    }

    public static final boolean b(char c17) {
        return java.lang.Character.isWhitespace(c17) || java.lang.Character.isSpaceChar(c17);
    }
}
