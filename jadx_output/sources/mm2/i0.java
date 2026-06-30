package mm2;

/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f329131a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f329132b;

    /* renamed from: c, reason: collision with root package name */
    public final int f329133c;

    public i0(java.util.LinkedList linkedList, java.lang.String str, int i17) {
        this.f329131a = linkedList;
        this.f329132b = str;
        this.f329133c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.i0)) {
            return false;
        }
        mm2.i0 i0Var = (mm2.i0) obj;
        return kotlin.jvm.internal.o.b(this.f329131a, i0Var.f329131a) && kotlin.jvm.internal.o.b(this.f329132b, i0Var.f329132b) && this.f329133c == i0Var.f329133c;
    }

    public int hashCode() {
        java.util.LinkedList linkedList = this.f329131a;
        int hashCode = (linkedList == null ? 0 : linkedList.hashCode()) * 31;
        java.lang.String str = this.f329132b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f329133c);
    }

    public java.lang.String toString() {
        return "LiveCheerInfo(cheerIconInfo=" + this.f329131a + ", cheerBtnUrl=" + this.f329132b + ", enable=" + this.f329133c + ')';
    }
}
