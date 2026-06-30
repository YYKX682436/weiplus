package qn2;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f365129a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f365130b;

    public p(android.widget.TextView giftCount, android.widget.ImageView giftIcon) {
        kotlin.jvm.internal.o.g(giftCount, "giftCount");
        kotlin.jvm.internal.o.g(giftIcon, "giftIcon");
        this.f365129a = giftCount;
        this.f365130b = giftIcon;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn2.p)) {
            return false;
        }
        qn2.p pVar = (qn2.p) obj;
        return kotlin.jvm.internal.o.b(this.f365129a, pVar.f365129a) && kotlin.jvm.internal.o.b(this.f365130b, pVar.f365130b);
    }

    public int hashCode() {
        return (this.f365129a.hashCode() * 31) + this.f365130b.hashCode();
    }

    public java.lang.String toString() {
        return "ViewHolder(giftCount=" + this.f365129a + ", giftIcon=" + this.f365130b + ')';
    }
}
