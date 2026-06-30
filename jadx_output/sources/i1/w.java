package i1;

/* loaded from: classes14.dex */
public final class w extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f287057c;

    /* renamed from: d, reason: collision with root package name */
    public final float f287058d;

    /* renamed from: e, reason: collision with root package name */
    public final float f287059e;

    /* renamed from: f, reason: collision with root package name */
    public final float f287060f;

    public w(float f17, float f18, float f19, float f27) {
        super(true, false, 2, null);
        this.f287057c = f17;
        this.f287058d = f18;
        this.f287059e = f19;
        this.f287060f = f27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.w)) {
            return false;
        }
        i1.w wVar = (i1.w) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287057c), java.lang.Float.valueOf(wVar.f287057c)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287058d), java.lang.Float.valueOf(wVar.f287058d)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287059e), java.lang.Float.valueOf(wVar.f287059e)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287060f), java.lang.Float.valueOf(wVar.f287060f));
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f287057c) * 31) + java.lang.Float.hashCode(this.f287058d)) * 31) + java.lang.Float.hashCode(this.f287059e)) * 31) + java.lang.Float.hashCode(this.f287060f);
    }

    public java.lang.String toString() {
        return "RelativeReflectiveCurveTo(dx1=" + this.f287057c + ", dy1=" + this.f287058d + ", dx2=" + this.f287059e + ", dy2=" + this.f287060f + ')';
    }
}
