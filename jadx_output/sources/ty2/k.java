package ty2;

/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final bw5.o5 f423073a;

    /* renamed from: b, reason: collision with root package name */
    public final int f423074b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f423075c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f423076d;

    public k(bw5.o5 showBoxItem, int i17, java.lang.Integer num, android.view.View view) {
        kotlin.jvm.internal.o.g(showBoxItem, "showBoxItem");
        this.f423073a = showBoxItem;
        this.f423074b = i17;
        this.f423075c = num;
        this.f423076d = view;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty2.k)) {
            return false;
        }
        ty2.k kVar = (ty2.k) obj;
        return kotlin.jvm.internal.o.b(this.f423073a, kVar.f423073a) && this.f423074b == kVar.f423074b && kotlin.jvm.internal.o.b(this.f423075c, kVar.f423075c) && kotlin.jvm.internal.o.b(this.f423076d, kVar.f423076d);
    }

    public int hashCode() {
        int hashCode = ((this.f423073a.hashCode() * 31) + java.lang.Integer.hashCode(this.f423074b)) * 31;
        java.lang.Integer num = this.f423075c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        android.view.View view = this.f423076d;
        return hashCode2 + (view != null ? view.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ShowBoxItemView(showBoxItem=" + this.f423073a + ", id=" + this.f423074b + ", itemWidth=" + this.f423075c + ", view=" + this.f423076d + ')';
    }
}
