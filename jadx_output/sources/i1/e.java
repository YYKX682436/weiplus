package i1;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f286879a;

    /* renamed from: b, reason: collision with root package name */
    public final float f286880b;

    /* renamed from: c, reason: collision with root package name */
    public final float f286881c;

    /* renamed from: d, reason: collision with root package name */
    public final float f286882d;

    /* renamed from: e, reason: collision with root package name */
    public final float f286883e;

    /* renamed from: f, reason: collision with root package name */
    public final i1.o1 f286884f;

    /* renamed from: g, reason: collision with root package name */
    public final long f286885g;

    /* renamed from: h, reason: collision with root package name */
    public final int f286886h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f286887i;

    public e(java.lang.String str, float f17, float f18, float f19, float f27, i1.o1 o1Var, long j17, int i17, boolean z17, kotlin.jvm.internal.i iVar) {
        this.f286879a = str;
        this.f286880b = f17;
        this.f286881c = f18;
        this.f286882d = f19;
        this.f286883e = f27;
        this.f286884f = o1Var;
        this.f286885g = j17;
        this.f286886h = i17;
        this.f286887i = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.e)) {
            return false;
        }
        i1.e eVar = (i1.e) obj;
        if (!kotlin.jvm.internal.o.b(this.f286879a, eVar.f286879a) || !p2.h.a(this.f286880b, eVar.f286880b) || !p2.h.a(this.f286881c, eVar.f286881c)) {
            return false;
        }
        if (!(this.f286882d == eVar.f286882d)) {
            return false;
        }
        if ((this.f286883e == eVar.f286883e) && kotlin.jvm.internal.o.b(this.f286884f, eVar.f286884f) && e1.y.c(this.f286885g, eVar.f286885g)) {
            return (this.f286886h == eVar.f286886h) && this.f286887i == eVar.f286887i;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f286879a.hashCode() * 31) + java.lang.Float.hashCode(this.f286880b)) * 31) + java.lang.Float.hashCode(this.f286881c)) * 31) + java.lang.Float.hashCode(this.f286882d)) * 31) + java.lang.Float.hashCode(this.f286883e)) * 31) + this.f286884f.hashCode()) * 31;
        int i17 = e1.y.f246321l;
        return ((((hashCode + java.lang.Long.hashCode(this.f286885g)) * 31) + java.lang.Integer.hashCode(this.f286886h)) * 31) + java.lang.Boolean.hashCode(this.f286887i);
    }
}
