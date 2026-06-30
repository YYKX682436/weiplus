package r26;

/* loaded from: classes13.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final r26.h f368889e = new r26.h("", "", false, 1);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f368890a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f368891b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f368892c;

    /* renamed from: d, reason: collision with root package name */
    public final int f368893d;

    public h(java.lang.String prefix, java.lang.String suffix, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(suffix, "suffix");
        this.f368890a = prefix;
        this.f368891b = suffix;
        this.f368892c = z17;
        this.f368893d = i17;
        if (!(prefix.length() == 0) || suffix.length() == 0) {
        }
        if (r26.j.a(prefix)) {
            return;
        }
        r26.j.a(suffix);
    }

    public final java.lang.StringBuilder a(java.lang.StringBuilder sb6, java.lang.String indent) {
        kotlin.jvm.internal.o.g(sb6, "sb");
        kotlin.jvm.internal.o.g(indent, "indent");
        sb6.append(indent);
        sb6.append("prefix = \"");
        sb6.append(this.f368890a);
        sb6.append("\",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("suffix = \"");
        sb6.append(this.f368891b);
        sb6.append("\",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("removeLeadingZeros = ");
        sb6.append(this.f368892c);
        sb6.append(',');
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("minLength = ");
        sb6.append(this.f368893d);
        return sb6;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("NumberHexFormat(\n");
        a(sb6, "    ");
        sb6.append('\n');
        sb6.append(")");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
