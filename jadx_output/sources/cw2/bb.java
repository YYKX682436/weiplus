package cw2;

/* loaded from: classes2.dex */
public final class bb {

    /* renamed from: a, reason: collision with root package name */
    public final long f223606a;

    /* renamed from: b, reason: collision with root package name */
    public final int f223607b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f223608c;

    public bb(long j17, int i17, java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        this.f223606a = j17;
        this.f223607b = i17;
        this.f223608c = source;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.bb)) {
            return false;
        }
        cw2.bb bbVar = (cw2.bb) obj;
        return this.f223606a == bbVar.f223606a && this.f223607b == bbVar.f223607b && kotlin.jvm.internal.o.b(this.f223608c, bbVar.f223608c);
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f223606a) * 31) + java.lang.Integer.hashCode(this.f223607b)) * 31) + this.f223608c.hashCode();
    }

    public java.lang.String toString() {
        return "SeekParams(seekTimeMs=" + this.f223606a + ", seekMode=" + this.f223607b + ", source=" + this.f223608c + ')';
    }

    public /* synthetic */ bb(long j17, int i17, java.lang.String str, int i18, kotlin.jvm.internal.i iVar) {
        this(j17, (i18 & 2) != 0 ? 1 : i17, (i18 & 4) != 0 ? "Default" : str);
    }
}
