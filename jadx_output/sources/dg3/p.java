package dg3;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final dg3.q f232337a;

    /* renamed from: b, reason: collision with root package name */
    public final int f232338b;

    /* renamed from: c, reason: collision with root package name */
    public final int f232339c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f232340d;

    public p(dg3.q type, int i17, int i18, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(type, "type");
        this.f232337a = type;
        this.f232338b = i17;
        this.f232339c = i18;
        this.f232340d = num;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg3.p)) {
            return false;
        }
        dg3.p pVar = (dg3.p) obj;
        return this.f232337a == pVar.f232337a && this.f232338b == pVar.f232338b && this.f232339c == pVar.f232339c && kotlin.jvm.internal.o.b(this.f232340d, pVar.f232340d);
    }

    public int hashCode() {
        int hashCode = ((((this.f232337a.hashCode() * 31) + java.lang.Integer.hashCode(this.f232338b)) * 31) + java.lang.Integer.hashCode(this.f232339c)) * 31;
        java.lang.Integer num = this.f232340d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public java.lang.String toString() {
        return "MenuItemConfig(type=" + this.f232337a + ", textRes=" + this.f232338b + ", iconRes=" + this.f232339c + ", iconColorRes=" + this.f232340d + ')';
    }
}
