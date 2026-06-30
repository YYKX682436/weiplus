package k56;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f304474a = java.util.regex.Pattern.compile("oauth_token=([^&]+)");

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f304475b = java.util.regex.Pattern.compile("oauth_token_secret=([^&]*)");

    public final java.lang.String a(java.lang.String str, java.util.regex.Pattern pattern) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() >= 1) {
            return n56.b.a(matcher.group(1));
        }
        throw new j56.b("Response body is incorrect. Can't extract token and secret from this: '" + str + "'", null);
    }
}
