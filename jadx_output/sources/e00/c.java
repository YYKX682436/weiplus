package e00;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final bw5.qe0 f245745a;

    /* renamed from: b, reason: collision with root package name */
    public final long f245746b;

    public c(bw5.qe0 productInfo, long j17) {
        kotlin.jvm.internal.o.g(productInfo, "productInfo");
        this.f245745a = productInfo;
        this.f245746b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e00.c)) {
            return false;
        }
        e00.c cVar = (e00.c) obj;
        return kotlin.jvm.internal.o.b(this.f245745a, cVar.f245745a) && this.f245746b == cVar.f245746b;
    }

    public int hashCode() {
        return (this.f245745a.hashCode() * 31) + java.lang.Long.hashCode(this.f245746b);
    }

    public java.lang.String toString() {
        return "ProductInfoCache(productInfo=" + this.f245745a + ", cacheTimeSecond=" + this.f245746b + ')';
    }
}
