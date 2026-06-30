package fk0;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f263259a;

    /* renamed from: b, reason: collision with root package name */
    public final int f263260b;

    /* renamed from: c, reason: collision with root package name */
    public final float f263261c;

    /* renamed from: d, reason: collision with root package name */
    public final int f263262d;

    /* renamed from: e, reason: collision with root package name */
    public final float f263263e;

    public a(java.lang.String ocrText, int i17, float f17, int i18, float f18) {
        kotlin.jvm.internal.o.g(ocrText, "ocrText");
        this.f263259a = ocrText;
        this.f263260b = i17;
        this.f263261c = f17;
        this.f263262d = i18;
        this.f263263e = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk0.a)) {
            return false;
        }
        fk0.a aVar = (fk0.a) obj;
        return kotlin.jvm.internal.o.b(this.f263259a, aVar.f263259a) && this.f263260b == aVar.f263260b && java.lang.Float.compare(this.f263261c, aVar.f263261c) == 0 && this.f263262d == aVar.f263262d && java.lang.Float.compare(this.f263263e, aVar.f263263e) == 0;
    }

    public int hashCode() {
        return (((((((this.f263259a.hashCode() * 31) + java.lang.Integer.hashCode(this.f263260b)) * 31) + java.lang.Float.hashCode(this.f263261c)) * 31) + java.lang.Integer.hashCode(this.f263262d)) * 31) + java.lang.Float.hashCode(this.f263263e);
    }

    public java.lang.String toString() {
        return "ScanCodeOcrResult{result.length: " + this.f263259a.length() + ", color: " + this.f263260b + ", colorScore: " + this.f263261c + ", cls: " + this.f263262d + ", clsScore: " + this.f263263e + '}';
    }
}
