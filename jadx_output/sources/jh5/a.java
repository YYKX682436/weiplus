package jh5;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final jh5.a f299861e = new jh5.a("", 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f299862a;

    /* renamed from: b, reason: collision with root package name */
    public final long f299863b;

    /* renamed from: c, reason: collision with root package name */
    public final long f299864c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f299865d;

    public a(java.lang.String keyword, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(keyword, "keyword");
        this.f299862a = keyword;
        this.f299863b = j17;
        this.f299864c = j18;
        this.f299865d = z17;
    }

    public final java.lang.String a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("keyword", this.f299862a);
        hashMap.put("messageLocalId", java.lang.Long.valueOf(this.f299863b));
        hashMap.put("randomSeed", java.lang.Long.valueOf(this.f299864c));
        hashMap.put("resume", java.lang.Boolean.valueOf(this.f299865d));
        java.lang.String gVar = new cl0.g(hashMap).toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        return gVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh5.a)) {
            return false;
        }
        jh5.a aVar = (jh5.a) obj;
        return kotlin.jvm.internal.o.b(this.f299862a, aVar.f299862a) && this.f299863b == aVar.f299863b && this.f299864c == aVar.f299864c && this.f299865d == aVar.f299865d;
    }

    public int hashCode() {
        return (((((this.f299862a.hashCode() * 31) + java.lang.Long.hashCode(this.f299863b)) * 31) + java.lang.Long.hashCode(this.f299864c)) * 31) + java.lang.Boolean.hashCode(this.f299865d);
    }

    public java.lang.String toString() {
        return "MagicEmojiEggExtData(keyword=" + this.f299862a + ", messageLocalId=" + this.f299863b + ", randomSeed=" + this.f299864c + ", resume=" + this.f299865d + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String keyword, long j17, long j18) {
        this(keyword, j17, j18, false);
        kotlin.jvm.internal.o.g(keyword, "keyword");
    }
}
