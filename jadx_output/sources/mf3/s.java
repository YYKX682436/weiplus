package mf3;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final mf3.k f326117a;

    /* renamed from: b, reason: collision with root package name */
    public final int f326118b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f326119c;

    public s(mf3.k data, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f326117a = data;
        this.f326118b = i17;
        this.f326119c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf3.s)) {
            return false;
        }
        mf3.s sVar = (mf3.s) obj;
        return kotlin.jvm.internal.o.b(this.f326117a, sVar.f326117a) && this.f326118b == sVar.f326118b && this.f326119c == sVar.f326119c;
    }

    public int hashCode() {
        return (((this.f326117a.hashCode() * 31) + java.lang.Integer.hashCode(this.f326118b)) * 31) + java.lang.Boolean.hashCode(this.f326119c);
    }

    public java.lang.String toString() {
        return "MediaBindContext(data=" + this.f326117a + ", position=" + this.f326118b + ", anchored=" + this.f326119c + ')';
    }
}
