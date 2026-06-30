package l56;

/* loaded from: classes13.dex */
public class c extends l56.f {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f316677g;

    public c(l56.j jVar, java.lang.String str) {
        super(jVar, str);
        this.f316677g = new java.util.HashMap();
    }

    public void d(java.lang.String str, java.lang.String str2) {
        java.util.Map map = this.f316677g;
        if (!str.startsWith("oauth_") && !str.equals("scope")) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("OAuth parameters must either be '%s' or start with '%s'", "scope", "oauth_"));
        }
        ((java.util.HashMap) map).put(str, str2);
    }

    public java.lang.String toString() {
        return java.lang.String.format("@OAuthRequest(%s, %s)", this.f316682b, this.f316681a);
    }
}
