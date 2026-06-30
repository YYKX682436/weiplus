package od;

/* loaded from: classes8.dex */
public class n implements od.m {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f344523b = java.util.regex.Pattern.compile("^<<//([a-z]{0,10})//>>");

    /* renamed from: a, reason: collision with root package name */
    public final od.l f344524a;

    public n(od.l lVar) {
        this.f344524a = lVar;
    }

    public java.lang.String a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.util.regex.Matcher matcher = f344523b.matcher(str);
        java.lang.String group = matcher.find() ? matcher.group(1) : null;
        if (group == null) {
            return null;
        }
        return this.f344524a.f344517b.a(str.replaceFirst("^<<//([a-z]{0,10})//>>", ""), group.equals("sync"));
    }
}
