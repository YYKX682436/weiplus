package j5;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f297747a;

    /* renamed from: b, reason: collision with root package name */
    public final int f297748b;

    public i(java.lang.String str, int i17) {
        this.f297747a = str;
        this.f297748b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5.i)) {
            return false;
        }
        j5.i iVar = (j5.i) obj;
        if (this.f297748b != iVar.f297748b) {
            return false;
        }
        return this.f297747a.equals(iVar.f297747a);
    }

    public int hashCode() {
        return (this.f297747a.hashCode() * 31) + this.f297748b;
    }
}
