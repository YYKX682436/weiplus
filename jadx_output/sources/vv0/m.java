package vv0;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f440396a;

    /* renamed from: b, reason: collision with root package name */
    public final float f440397b;

    public m(java.lang.String filterID, float f17) {
        kotlin.jvm.internal.o.g(filterID, "filterID");
        this.f440396a = filterID;
        this.f440397b = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv0.m)) {
            return false;
        }
        vv0.m mVar = (vv0.m) obj;
        return kotlin.jvm.internal.o.b(this.f440396a, mVar.f440396a) && java.lang.Float.compare(this.f440397b, mVar.f440397b) == 0;
    }

    public int hashCode() {
        return (this.f440396a.hashCode() * 31) + java.lang.Float.hashCode(this.f440397b);
    }

    public java.lang.String toString() {
        return "MJSegmentFilterInfo(filterID=" + this.f440396a + ", intensity=" + this.f440397b + ')';
    }
}
