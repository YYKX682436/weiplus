package kotlin.jvm.internal;

/* loaded from: classes14.dex */
public abstract class a implements kotlin.jvm.internal.k, java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f310102d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Class f310103e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f310104f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f310105g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f310106h;

    /* renamed from: i, reason: collision with root package name */
    public final int f310107i;

    /* renamed from: m, reason: collision with root package name */
    public final int f310108m;

    public a(int i17, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i18) {
        this.f310102d = obj;
        this.f310103e = cls;
        this.f310104f = str;
        this.f310105g = str2;
        this.f310106h = (i18 & 1) == 1;
        this.f310107i = i17;
        this.f310108m = i18 >> 1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.jvm.internal.a)) {
            return false;
        }
        kotlin.jvm.internal.a aVar = (kotlin.jvm.internal.a) obj;
        return this.f310106h == aVar.f310106h && this.f310107i == aVar.f310107i && this.f310108m == aVar.f310108m && kotlin.jvm.internal.o.b(this.f310102d, aVar.f310102d) && kotlin.jvm.internal.o.b(this.f310103e, aVar.f310103e) && this.f310104f.equals(aVar.f310104f) && this.f310105g.equals(aVar.f310105g);
    }

    @Override // kotlin.jvm.internal.k
    public int getArity() {
        return this.f310107i;
    }

    public int hashCode() {
        java.lang.Object obj = this.f310102d;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        java.lang.Class cls = this.f310103e;
        return ((((((((((hashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f310104f.hashCode()) * 31) + this.f310105g.hashCode()) * 31) + (this.f310106h ? 1231 : 1237)) * 31) + this.f310107i) * 31) + this.f310108m;
    }

    public java.lang.String toString() {
        return kotlin.jvm.internal.i0.f310124a.h(this);
    }
}
