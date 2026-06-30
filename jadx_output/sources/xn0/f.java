package xn0;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final kn0.e f455420a;

    /* renamed from: b, reason: collision with root package name */
    public final int f455421b;

    public f(kn0.e liveQosInfo, int i17) {
        kotlin.jvm.internal.o.g(liveQosInfo, "liveQosInfo");
        this.f455420a = liveQosInfo;
        this.f455421b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn0.f)) {
            return false;
        }
        xn0.f fVar = (xn0.f) obj;
        return kotlin.jvm.internal.o.b(this.f455420a, fVar.f455420a) && this.f455421b == fVar.f455421b;
    }

    public int hashCode() {
        return (this.f455420a.hashCode() * 31) + java.lang.Integer.hashCode(this.f455421b);
    }

    public java.lang.String toString() {
        return "FLVQualitySample(liveQosInfo=" + this.f455420a + ", blockCnt=" + this.f455421b + ')';
    }
}
