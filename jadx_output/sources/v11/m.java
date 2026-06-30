package v11;

/* loaded from: classes11.dex */
public final class m extends v11.r {

    /* renamed from: a, reason: collision with root package name */
    public final v11.s f432441a;

    public m(v11.s sVar) {
        super(null);
        this.f432441a = sVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v11.m) && kotlin.jvm.internal.o.b(this.f432441a, ((v11.m) obj).f432441a);
    }

    public int hashCode() {
        v11.s sVar = this.f432441a;
        if (sVar == null) {
            return 0;
        }
        return sVar.hashCode();
    }

    public java.lang.String toString() {
        return "HorizontalRule(sourceRange=" + this.f432441a + ')';
    }
}
