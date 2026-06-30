package q75;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.regex.Pattern f360606c = java.util.regex.Pattern.compile("([a-zA-Z*-.0-9]+/[a-zA-Z*-.0-9]+)");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f360607a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f360608b;

    public e(java.lang.String str, java.lang.String str2) {
        this.f360607a = str;
        this.f360608b = str2;
    }

    public static q75.e a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.util.regex.Matcher matcher = f360606c.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        java.lang.String group = matcher.group(0);
        java.lang.String trim = str.contains("charset=") ? str.substring(str.indexOf("charset=") + 8).trim() : null;
        if (android.text.TextUtils.isEmpty(trim)) {
            trim = com.tencent.mapsdk.internal.rv.f51270c;
        }
        return new q75.e(group, trim);
    }

    public java.lang.String toString() {
        return "ContentType{mimeType='" + this.f360607a + "', charset='" + this.f360608b + "'}";
    }
}
