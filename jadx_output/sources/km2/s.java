package km2;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f309217a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f309218b;

    /* renamed from: c, reason: collision with root package name */
    public final int f309219c;

    /* renamed from: d, reason: collision with root package name */
    public int f309220d;

    /* renamed from: e, reason: collision with root package name */
    public int f309221e;

    public s(int i17, java.lang.String str, int i18, int i19, int i27, int i28, kotlin.jvm.internal.i iVar) {
        str = (i28 & 2) != 0 ? "" : str;
        i27 = (i28 & 16) != 0 ? 0 : i27;
        this.f309217a = i17;
        this.f309218b = str;
        this.f309219c = i18;
        this.f309220d = i19;
        this.f309221e = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.s)) {
            return false;
        }
        km2.s sVar = (km2.s) obj;
        return this.f309217a == sVar.f309217a && kotlin.jvm.internal.o.b(this.f309218b, sVar.f309218b) && this.f309219c == sVar.f309219c && this.f309220d == sVar.f309220d && this.f309221e == sVar.f309221e;
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f309217a) * 31;
        java.lang.String str = this.f309218b;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f309219c)) * 31) + java.lang.Integer.hashCode(this.f309220d)) * 31) + java.lang.Integer.hashCode(this.f309221e);
    }

    public java.lang.String toString() {
        return "subtitle:" + this.f309218b + ",index:" + this.f309219c + ",duration:" + this.f309220d;
    }
}
