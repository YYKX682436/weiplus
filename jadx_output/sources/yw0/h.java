package yw0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ou0.b f466556a;

    /* renamed from: b, reason: collision with root package name */
    public final float f466557b;

    public h(ou0.b flag, float f17) {
        kotlin.jvm.internal.o.g(flag, "flag");
        this.f466556a = flag;
        this.f466557b = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw0.h)) {
            return false;
        }
        yw0.h hVar = (yw0.h) obj;
        return kotlin.jvm.internal.o.b(this.f466556a, hVar.f466556a) && java.lang.Float.compare(this.f466557b, hVar.f466557b) == 0;
    }

    public int hashCode() {
        return (this.f466556a.hashCode() * 31) + java.lang.Float.hashCode(this.f466557b);
    }

    public java.lang.String toString() {
        return "SnapFlag(flag=" + this.f466556a + ", snapValue=" + this.f466557b + ')';
    }
}
