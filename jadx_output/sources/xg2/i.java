package xg2;

/* loaded from: classes.dex */
public final class i extends xg2.h {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f454393b;

    /* renamed from: c, reason: collision with root package name */
    public final oz5.l f454394c;

    public i(java.lang.Object obj, oz5.l lVar) {
        super(lVar, null);
        this.f454393b = obj;
        this.f454394c = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg2.i)) {
            return false;
        }
        xg2.i iVar = (xg2.i) obj;
        return kotlin.jvm.internal.o.b(this.f454393b, iVar.f454393b) && kotlin.jvm.internal.o.b(this.f454394c, iVar.f454394c);
    }

    public int hashCode() {
        java.lang.Object obj = this.f454393b;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        oz5.l lVar = this.f454394c;
        return hashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "Success(suc=" + this.f454393b + ", context=" + this.f454394c + ')';
    }
}
