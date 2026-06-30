package h10;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f277999a;

    /* renamed from: b, reason: collision with root package name */
    public final float f278000b;

    /* renamed from: c, reason: collision with root package name */
    public final float f278001c;

    /* renamed from: d, reason: collision with root package name */
    public final float f278002d;

    public e(float f17, float f18, float f19, float f27) {
        this.f277999a = f17;
        this.f278000b = f18;
        this.f278001c = f19;
        this.f278002d = f27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h10.e)) {
            return false;
        }
        h10.e eVar = (h10.e) obj;
        return java.lang.Float.compare(this.f277999a, eVar.f277999a) == 0 && java.lang.Float.compare(this.f278000b, eVar.f278000b) == 0 && java.lang.Float.compare(this.f278001c, eVar.f278001c) == 0 && java.lang.Float.compare(this.f278002d, eVar.f278002d) == 0;
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f277999a) * 31) + java.lang.Float.hashCode(this.f278000b)) * 31) + java.lang.Float.hashCode(this.f278001c)) * 31) + java.lang.Float.hashCode(this.f278002d);
    }

    public java.lang.String toString() {
        return "Rect(left=" + this.f277999a + ", top=" + this.f278000b + ", right=" + this.f278001c + ", bottom=" + this.f278002d + ')';
    }
}
