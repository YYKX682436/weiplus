package e00;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final bw5.ue0 f245750a;

    /* renamed from: b, reason: collision with root package name */
    public final long f245751b;

    public d(bw5.ue0 shopCard, long j17) {
        kotlin.jvm.internal.o.g(shopCard, "shopCard");
        this.f245750a = shopCard;
        this.f245751b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e00.d)) {
            return false;
        }
        e00.d dVar = (e00.d) obj;
        return kotlin.jvm.internal.o.b(this.f245750a, dVar.f245750a) && this.f245751b == dVar.f245751b;
    }

    public int hashCode() {
        return (this.f245750a.hashCode() * 31) + java.lang.Long.hashCode(this.f245751b);
    }

    public java.lang.String toString() {
        return "ShopCardCache(shopCard=" + this.f245750a + ", cacheTimeSecond=" + this.f245751b + ')';
    }
}
