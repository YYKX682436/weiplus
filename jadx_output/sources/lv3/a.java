package lv3;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f321508a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f321509b;

    /* renamed from: c, reason: collision with root package name */
    public final long f321510c;

    public a(long j17, java.lang.String str, long j18) {
        this.f321508a = j17;
        this.f321509b = str;
        this.f321510c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv3.a)) {
            return false;
        }
        lv3.a aVar = (lv3.a) obj;
        return this.f321508a == aVar.f321508a && kotlin.jvm.internal.o.b(this.f321509b, aVar.f321509b) && this.f321510c == aVar.f321510c;
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f321508a) * 31;
        java.lang.String str = this.f321509b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.f321510c);
    }

    public java.lang.String toString() {
        return "MusicData(musicId=" + this.f321508a + ", musicUrl=" + this.f321509b + ", duration=" + this.f321510c + ')';
    }

    public /* synthetic */ a(long j17, java.lang.String str, long j18, int i17, kotlin.jvm.internal.i iVar) {
        this(j17, str, (i17 & 4) != 0 ? 0L : j18);
    }
}
