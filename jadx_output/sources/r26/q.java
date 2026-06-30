package r26;

/* loaded from: classes5.dex */
public final class q implements r26.m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.regex.Matcher f368909a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f368910b;

    /* renamed from: c, reason: collision with root package name */
    public final r26.l f368911c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f368912d;

    public q(java.util.regex.Matcher matcher, java.lang.CharSequence input) {
        kotlin.jvm.internal.o.g(matcher, "matcher");
        kotlin.jvm.internal.o.g(input, "input");
        this.f368909a = matcher;
        this.f368910b = input;
        this.f368911c = new r26.p(this);
    }

    public java.util.List a() {
        if (this.f368912d == null) {
            this.f368912d = new r26.n(this);
        }
        java.util.List list = this.f368912d;
        kotlin.jvm.internal.o.d(list);
        return list;
    }

    public e06.k b() {
        java.util.regex.Matcher matcher = this.f368909a;
        return e06.p.m(matcher.start(), matcher.end());
    }

    public java.lang.String c() {
        java.lang.String group = this.f368909a.group();
        kotlin.jvm.internal.o.f(group, "group(...)");
        return group;
    }

    public r26.m d() {
        java.util.regex.Matcher matcher = this.f368909a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        java.lang.CharSequence charSequence = this.f368910b;
        if (end > charSequence.length()) {
            return null;
        }
        java.util.regex.Matcher matcher2 = matcher.pattern().matcher(charSequence);
        kotlin.jvm.internal.o.f(matcher2, "matcher(...)");
        return r26.u.a(matcher2, end, charSequence);
    }
}
