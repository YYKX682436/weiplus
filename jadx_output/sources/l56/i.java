package l56;

/* loaded from: classes13.dex */
public class i implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f316692d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f316693e;

    public i(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        n56.c.b(str, "Token can't be null");
        n56.c.b(str2, "Secret can't be null");
        this.f316692d = str;
        this.f316693e = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l56.i.class == obj.getClass()) {
            l56.i iVar = (l56.i) obj;
            if (this.f316692d.equals(iVar.f316692d) && this.f316693e.equals(iVar.f316693e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f316692d.hashCode() * 31) + this.f316693e.hashCode();
    }

    public java.lang.String toString() {
        return java.lang.String.format("Token[%s , %s]", this.f316692d, this.f316693e);
    }
}
