package y36;

/* loaded from: classes11.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f459271a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c17) {
        if ('0' <= c17 && '9' >= c17) {
            return c17 - '0';
        }
        char c18 = 'a';
        if ('a' > c17 || 'f' < c17) {
            c18 = 'A';
            if ('A' > c17 || 'F' < c17) {
                throw new java.lang.IllegalArgumentException("Unexpected hex digit: " + c17);
            }
        }
        return (c17 - c18) + 10;
    }
}
