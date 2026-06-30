package j5;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f297732a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Long f297733b;

    public e(java.lang.String str, long j17) {
        this.f297732a = str;
        this.f297733b = java.lang.Long.valueOf(j17);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5.e)) {
            return false;
        }
        j5.e eVar = (j5.e) obj;
        if (!this.f297732a.equals(eVar.f297732a)) {
            return false;
        }
        java.lang.Long l17 = eVar.f297733b;
        java.lang.Long l18 = this.f297733b;
        return l18 != null ? l18.equals(l17) : l17 == null;
    }

    public int hashCode() {
        int hashCode = this.f297732a.hashCode() * 31;
        java.lang.Long l17 = this.f297733b;
        return hashCode + (l17 != null ? l17.hashCode() : 0);
    }
}
