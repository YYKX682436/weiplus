package om2;

/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f346385a;

    /* renamed from: b, reason: collision with root package name */
    public final int f346386b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f346387c;

    public w(java.lang.String version, int i17, com.tencent.mm.protobuf.g noteContent) {
        kotlin.jvm.internal.o.g(version, "version");
        kotlin.jvm.internal.o.g(noteContent, "noteContent");
        this.f346385a = version;
        this.f346386b = i17;
        this.f346387c = noteContent;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.w)) {
            return false;
        }
        om2.w wVar = (om2.w) obj;
        return kotlin.jvm.internal.o.b(this.f346385a, wVar.f346385a) && this.f346386b == wVar.f346386b && kotlin.jvm.internal.o.b(this.f346387c, wVar.f346387c);
    }

    public int hashCode() {
        return (((this.f346385a.hashCode() * 31) + java.lang.Integer.hashCode(this.f346386b)) * 31) + this.f346387c.hashCode();
    }

    public java.lang.String toString() {
        return "version " + this.f346385a + " compressType: " + this.f346386b + " noteContent: " + this.f346387c.f192156a.length;
    }
}
