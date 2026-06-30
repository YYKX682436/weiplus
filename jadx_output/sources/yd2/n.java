package yd2;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f461078a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f461079b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f461080c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f461081d;

    public n(java.lang.String toolCallId, java.lang.String name, java.lang.String version, java.lang.String str) {
        kotlin.jvm.internal.o.g(toolCallId, "toolCallId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(version, "version");
        this.f461078a = toolCallId;
        this.f461079b = name;
        this.f461080c = version;
        this.f461081d = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd2.n)) {
            return false;
        }
        yd2.n nVar = (yd2.n) obj;
        return kotlin.jvm.internal.o.b(this.f461078a, nVar.f461078a) && kotlin.jvm.internal.o.b(this.f461079b, nVar.f461079b) && kotlin.jvm.internal.o.b(this.f461080c, nVar.f461080c) && kotlin.jvm.internal.o.b(this.f461081d, nVar.f461081d);
    }

    public int hashCode() {
        int hashCode = ((((this.f461078a.hashCode() * 31) + this.f461079b.hashCode()) * 31) + this.f461080c.hashCode()) * 31;
        java.lang.String str = this.f461081d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "ToolCallData(toolCallId=" + this.f461078a + ", name=" + this.f461079b + ", version=" + this.f461080c + ", arguments=" + this.f461081d + ')';
    }
}
