package ni3;

/* loaded from: classes10.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final so2.j5 f337746a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f337747b;

    /* renamed from: c, reason: collision with root package name */
    public final cs2.p f337748c;

    public v0(so2.j5 data, java.lang.String mediaId, cs2.p taskInfo) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(taskInfo, "taskInfo");
        this.f337746a = data;
        this.f337747b = mediaId;
        this.f337748c = taskInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.v0)) {
            return false;
        }
        ni3.v0 v0Var = (ni3.v0) obj;
        return kotlin.jvm.internal.o.b(this.f337746a, v0Var.f337746a) && kotlin.jvm.internal.o.b(this.f337747b, v0Var.f337747b) && kotlin.jvm.internal.o.b(this.f337748c, v0Var.f337748c);
    }

    public int hashCode() {
        return (((this.f337746a.hashCode() * 31) + this.f337747b.hashCode()) * 31) + this.f337748c.hashCode();
    }

    public java.lang.String toString() {
        return "PreloadFeed(data=" + this.f337746a + ", mediaId=" + this.f337747b + ", taskInfo=" + this.f337748c + ')';
    }
}
