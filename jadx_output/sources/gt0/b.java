package gt0;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Integer f275364a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Integer f275365b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Integer f275366c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Boolean f275367d;

    public b(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool, int i17, kotlin.jvm.internal.i iVar) {
        num = (i17 & 1) != 0 ? 0 : num;
        num2 = (i17 & 2) != 0 ? 0 : num2;
        num3 = (i17 & 4) != 0 ? 0 : num3;
        bool = (i17 & 8) != 0 ? null : bool;
        this.f275364a = num;
        this.f275365b = num2;
        this.f275366c = num3;
        this.f275367d = bool;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt0.b)) {
            return false;
        }
        gt0.b bVar = (gt0.b) obj;
        return kotlin.jvm.internal.o.b(this.f275364a, bVar.f275364a) && kotlin.jvm.internal.o.b(this.f275365b, bVar.f275365b) && kotlin.jvm.internal.o.b(this.f275366c, bVar.f275366c) && kotlin.jvm.internal.o.b(this.f275367d, bVar.f275367d);
    }

    public int hashCode() {
        java.lang.Integer num = this.f275364a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Integer num2 = this.f275365b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.f275366c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.Boolean bool = this.f275367d;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FpsConfigItem(lowerFps=" + this.f275364a + ", upperFps=" + this.f275365b + ", curFps=" + this.f275366c + ", useFixMode=" + this.f275367d + ')';
    }
}
