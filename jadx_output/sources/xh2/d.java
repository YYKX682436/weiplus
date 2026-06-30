package xh2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f454540a;

    /* renamed from: b, reason: collision with root package name */
    public final int f454541b;

    /* renamed from: c, reason: collision with root package name */
    public final float f454542c;

    public d(java.util.LinkedList dataList, int i17, float f17) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f454540a = dataList;
        this.f454541b = i17;
        this.f454542c = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh2.d)) {
            return false;
        }
        xh2.d dVar = (xh2.d) obj;
        return kotlin.jvm.internal.o.b(this.f454540a, dVar.f454540a) && this.f454541b == dVar.f454541b && java.lang.Float.compare(this.f454542c, dVar.f454542c) == 0;
    }

    public int hashCode() {
        return (((this.f454540a.hashCode() * 31) + java.lang.Integer.hashCode(this.f454541b)) * 31) + java.lang.Float.hashCode(this.f454542c);
    }

    public java.lang.String toString() {
        return "FinderLiveMicSeiData(dataList=" + this.f454540a + ", mode=" + this.f454541b + ", anchorVideoRate=" + this.f454542c + ')';
    }
}
