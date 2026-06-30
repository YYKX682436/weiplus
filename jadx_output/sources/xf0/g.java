package xf0;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final xf0.i f454166a;

    /* renamed from: b, reason: collision with root package name */
    public final xf0.h f454167b;

    /* renamed from: c, reason: collision with root package name */
    public float f454168c;

    public g(xf0.i params, xf0.h type) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(type, "type");
        this.f454166a = params;
        this.f454167b = type;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf0.g)) {
            return false;
        }
        xf0.g gVar = (xf0.g) obj;
        return kotlin.jvm.internal.o.b(this.f454166a, gVar.f454166a) && this.f454167b == gVar.f454167b;
    }

    public int hashCode() {
        return (this.f454166a.hashCode() * 31) + this.f454167b.hashCode();
    }

    public java.lang.String toString() {
        return "MsgVideoDownloadEvent(params=" + this.f454166a + ", type=" + this.f454167b + ')';
    }
}
