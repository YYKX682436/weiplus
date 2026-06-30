package sf;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f406935a;

    /* renamed from: b, reason: collision with root package name */
    public final int f406936b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f406937c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f406938d;

    public b(int i17, int i18, java.lang.Integer num, yz5.a aVar) {
        this.f406935a = i17;
        this.f406936b = i18;
        this.f406937c = num;
        this.f406938d = aVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf.b)) {
            return false;
        }
        sf.b bVar = (sf.b) obj;
        return this.f406935a == bVar.f406935a && this.f406936b == bVar.f406936b && kotlin.jvm.internal.o.b(this.f406937c, bVar.f406937c) && kotlin.jvm.internal.o.b(this.f406938d, bVar.f406938d);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f406935a) * 31) + java.lang.Integer.hashCode(this.f406936b)) * 31;
        java.lang.Integer num = this.f406937c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        yz5.a aVar = this.f406938d;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "KeyboardHeightDispatchContent(keyboardHeight=" + this.f406935a + ", keyboardPanelHeight=" + this.f406936b + ", viewId=" + this.f406937c + ", dispatchCallback=" + this.f406938d + ')';
    }
}
