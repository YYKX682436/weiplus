package r26;

/* loaded from: classes5.dex */
public abstract class u {
    public static final r26.m a(java.util.regex.Matcher matcher, int i17, java.lang.CharSequence charSequence) {
        if (matcher.find(i17)) {
            return new r26.q(matcher, charSequence);
        }
        return null;
    }
}
