package z7;

/* loaded from: classes16.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f470473a;

    /* renamed from: b, reason: collision with root package name */
    public final z7.l f470474b;

    public h(java.lang.String str, z7.l lVar) {
        this.f470473a = str;
        this.f470474b = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z7.h.class != obj.getClass()) {
            return false;
        }
        z7.h hVar = (z7.h) obj;
        return this.f470473a.equals(hVar.f470473a) && this.f470474b.equals(hVar.f470474b);
    }

    public int hashCode() {
        return ((this.f470473a.hashCode() + 31) * 31) + this.f470474b.hashCode();
    }
}
