package oj;

/* loaded from: classes4.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final oj.g0 f345705d = new oj.g0();

    public g0() {
        super(2);
    }

    public final long a(java.util.Map getInt, java.lang.String key) {
        kotlin.jvm.internal.o.g(getInt, "$this$getInt");
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.String str = (java.lang.String) getInt.get(key);
        if (str == null) {
            str = com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\d+").matcher(str);
        if (!matcher.find()) {
            return -2L;
        }
        java.lang.String group = matcher.group();
        kotlin.jvm.internal.o.f(group, "matcher.group()");
        return java.lang.Long.parseLong(group);
    }

    @Override // yz5.p
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.valueOf(a((java.util.Map) obj, (java.lang.String) obj2));
    }
}
