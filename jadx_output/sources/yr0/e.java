package yr0;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f464629a;

    /* renamed from: b, reason: collision with root package name */
    public yr0.f f464630b;

    public e(java.lang.Object obj, yr0.f status, int i17, kotlin.jvm.internal.i iVar) {
        status = (i17 & 2) != 0 ? yr0.f.f464631d : status;
        kotlin.jvm.internal.o.g(status, "status");
        this.f464629a = obj;
        this.f464630b = status;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr0.e)) {
            return false;
        }
        yr0.e eVar = (yr0.e) obj;
        return kotlin.jvm.internal.o.b(this.f464629a, eVar.f464629a) && this.f464630b == eVar.f464630b;
    }

    public int hashCode() {
        java.lang.Object obj = this.f464629a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f464630b.hashCode();
    }

    public java.lang.String toString() {
        return "CameraKitPreloadModel(preload=" + this.f464629a + ", status=" + this.f464630b + ')';
    }
}
