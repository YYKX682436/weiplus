package l3;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f315283e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f315284a;

    /* renamed from: b, reason: collision with root package name */
    public final int f315285b;

    /* renamed from: c, reason: collision with root package name */
    public int f315286c;

    /* renamed from: d, reason: collision with root package name */
    public char f315287d;

    static {
        for (int i17 = 0; i17 < 1792; i17++) {
            f315283e[i17] = java.lang.Character.getDirectionality(i17);
        }
    }

    public a(java.lang.CharSequence charSequence, boolean z17) {
        this.f315284a = charSequence;
        this.f315285b = charSequence.length();
    }

    public byte a() {
        int i17 = this.f315286c - 1;
        java.lang.CharSequence charSequence = this.f315284a;
        char charAt = charSequence.charAt(i17);
        this.f315287d = charAt;
        if (java.lang.Character.isLowSurrogate(charAt)) {
            int codePointBefore = java.lang.Character.codePointBefore(charSequence, this.f315286c);
            this.f315286c -= java.lang.Character.charCount(codePointBefore);
            return java.lang.Character.getDirectionality(codePointBefore);
        }
        this.f315286c--;
        char c17 = this.f315287d;
        return c17 < 1792 ? f315283e[c17] : java.lang.Character.getDirectionality(c17);
    }
}
