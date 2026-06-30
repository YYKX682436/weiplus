package e00;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final bw5.x7 f245738a;

    /* renamed from: b, reason: collision with root package name */
    public final long f245739b;

    public b(bw5.x7 jumpInfo, long j17) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        this.f245738a = jumpInfo;
        this.f245739b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e00.b)) {
            return false;
        }
        e00.b bVar = (e00.b) obj;
        return kotlin.jvm.internal.o.b(this.f245738a, bVar.f245738a) && this.f245739b == bVar.f245739b;
    }

    public int hashCode() {
        return (this.f245738a.hashCode() * 31) + java.lang.Long.hashCode(this.f245739b);
    }

    public java.lang.String toString() {
        return "JumpInfoCache(jumpInfo=" + this.f245738a + ", cacheTimeSecond=" + this.f245739b + ')';
    }
}
