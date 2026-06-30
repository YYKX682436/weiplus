package xg2;

/* loaded from: classes.dex */
public final class b extends xg2.h {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f454381b;

    /* renamed from: c, reason: collision with root package name */
    public final oz5.l f454382c;

    public b(java.lang.Object obj, oz5.l lVar) {
        super(lVar, null);
        this.f454381b = obj;
        this.f454382c = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg2.b)) {
            return false;
        }
        xg2.b bVar = (xg2.b) obj;
        return kotlin.jvm.internal.o.b(this.f454381b, bVar.f454381b) && kotlin.jvm.internal.o.b(this.f454382c, bVar.f454382c);
    }

    public int hashCode() {
        java.lang.Object obj = this.f454381b;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        oz5.l lVar = this.f454382c;
        return hashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "Fail(fail=" + this.f454381b + ", context=" + this.f454382c + ')';
    }
}
