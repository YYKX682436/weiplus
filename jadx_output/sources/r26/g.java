package r26;

/* loaded from: classes13.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final r26.g f368880i = new r26.g(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

    /* renamed from: a, reason: collision with root package name */
    public final int f368881a;

    /* renamed from: b, reason: collision with root package name */
    public final int f368882b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f368883c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f368884d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f368885e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f368886f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f368887g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f368888h;

    public g(int i17, int i18, java.lang.String groupSeparator, java.lang.String byteSeparator, java.lang.String bytePrefix, java.lang.String byteSuffix) {
        kotlin.jvm.internal.o.g(groupSeparator, "groupSeparator");
        kotlin.jvm.internal.o.g(byteSeparator, "byteSeparator");
        kotlin.jvm.internal.o.g(bytePrefix, "bytePrefix");
        kotlin.jvm.internal.o.g(byteSuffix, "byteSuffix");
        this.f368881a = i17;
        this.f368882b = i18;
        this.f368883c = groupSeparator;
        this.f368884d = byteSeparator;
        this.f368885e = bytePrefix;
        this.f368886f = byteSuffix;
        boolean z17 = false;
        this.f368887g = i17 == Integer.MAX_VALUE && i18 == Integer.MAX_VALUE;
        if (bytePrefix.length() == 0) {
            if ((byteSuffix.length() == 0) && byteSeparator.length() <= 1) {
                z17 = true;
            }
        }
        this.f368888h = z17;
        if (r26.j.a(groupSeparator) || r26.j.a(byteSeparator) || r26.j.a(bytePrefix)) {
            return;
        }
        r26.j.a(byteSuffix);
    }

    public final java.lang.StringBuilder a(java.lang.StringBuilder sb6, java.lang.String indent) {
        kotlin.jvm.internal.o.g(sb6, "sb");
        kotlin.jvm.internal.o.g(indent, "indent");
        sb6.append(indent);
        sb6.append("bytesPerLine = ");
        sb6.append(this.f368881a);
        sb6.append(",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("bytesPerGroup = ");
        sb6.append(this.f368882b);
        sb6.append(",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("groupSeparator = \"");
        sb6.append(this.f368883c);
        sb6.append("\",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("byteSeparator = \"");
        sb6.append(this.f368884d);
        sb6.append("\",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("bytePrefix = \"");
        sb6.append(this.f368885e);
        sb6.append("\",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("byteSuffix = \"");
        sb6.append(this.f368886f);
        sb6.append("\"");
        return sb6;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("BytesHexFormat(\n");
        a(sb6, "    ");
        sb6.append('\n');
        sb6.append(")");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
