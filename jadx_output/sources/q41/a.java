package q41;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f360025a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f360026b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f360027c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f360028d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f360029e;

    public a(int i17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        this.f360025a = i17;
        this.f360026b = str;
        this.f360027c = str2;
        this.f360028d = z17;
        this.f360029e = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q41.a)) {
            return false;
        }
        q41.a aVar = (q41.a) obj;
        return this.f360025a == aVar.f360025a && kotlin.jvm.internal.o.b(this.f360026b, aVar.f360026b) && kotlin.jvm.internal.o.b(this.f360027c, aVar.f360027c) && this.f360028d == aVar.f360028d && this.f360029e == aVar.f360029e;
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f360025a) * 31;
        java.lang.String str = this.f360026b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f360027c;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f360028d)) * 31) + java.lang.Boolean.hashCode(this.f360029e);
    }

    public java.lang.String toString() {
        return "OpenImKefuToolbarItemInfo(type=" + this.f360025a + ", name=" + this.f360026b + ", url=" + this.f360027c + ", isTransparent=" + this.f360028d + ", isModal=" + this.f360029e + ')';
    }
}
