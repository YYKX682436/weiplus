package mm2;

/* loaded from: classes3.dex */
public final class r2 implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f329373d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f329374e;

    public r2(java.lang.String giftId, java.lang.String wishId) {
        kotlin.jvm.internal.o.g(giftId, "giftId");
        kotlin.jvm.internal.o.g(wishId, "wishId");
        this.f329373d = giftId;
        this.f329374e = wishId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.r2)) {
            return false;
        }
        mm2.r2 r2Var = (mm2.r2) obj;
        return kotlin.jvm.internal.o.b(this.f329373d, r2Var.f329373d) && kotlin.jvm.internal.o.b(this.f329374e, r2Var.f329374e);
    }

    public int hashCode() {
        return (this.f329373d.hashCode() * 31) + this.f329374e.hashCode();
    }

    public java.lang.String toString() {
        return "SendGiftData(giftId=" + this.f329373d + ", wishId=" + this.f329374e + ')';
    }
}
