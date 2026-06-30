package in0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f292731a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f292732b;

    /* renamed from: c, reason: collision with root package name */
    public final float f292733c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f292734d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f292735e;

    /* renamed from: f, reason: collision with root package name */
    public final float f292736f;

    /* renamed from: g, reason: collision with root package name */
    public final float f292737g;

    /* renamed from: h, reason: collision with root package name */
    public final float f292738h;

    /* renamed from: i, reason: collision with root package name */
    public final float f292739i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f292740j;

    /* renamed from: k, reason: collision with root package name */
    public final int f292741k;

    public a(boolean z17, java.lang.String sdkUserId, float f17, java.lang.String gestureId, java.lang.String randomId, float f18, float f19, float f27, float f28, java.lang.String giftComboId, int i17) {
        kotlin.jvm.internal.o.g(sdkUserId, "sdkUserId");
        kotlin.jvm.internal.o.g(gestureId, "gestureId");
        kotlin.jvm.internal.o.g(randomId, "randomId");
        kotlin.jvm.internal.o.g(giftComboId, "giftComboId");
        this.f292731a = z17;
        this.f292732b = sdkUserId;
        this.f292733c = f17;
        this.f292734d = gestureId;
        this.f292735e = randomId;
        this.f292736f = f18;
        this.f292737g = f19;
        this.f292738h = f27;
        this.f292739i = f28;
        this.f292740j = giftComboId;
        this.f292741k = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in0.a)) {
            return false;
        }
        in0.a aVar = (in0.a) obj;
        return this.f292731a == aVar.f292731a && kotlin.jvm.internal.o.b(this.f292732b, aVar.f292732b) && java.lang.Float.compare(this.f292733c, aVar.f292733c) == 0 && kotlin.jvm.internal.o.b(this.f292734d, aVar.f292734d) && kotlin.jvm.internal.o.b(this.f292735e, aVar.f292735e) && java.lang.Float.compare(this.f292736f, aVar.f292736f) == 0 && java.lang.Float.compare(this.f292737g, aVar.f292737g) == 0 && java.lang.Float.compare(this.f292738h, aVar.f292738h) == 0 && java.lang.Float.compare(this.f292739i, aVar.f292739i) == 0 && kotlin.jvm.internal.o.b(this.f292740j, aVar.f292740j) && this.f292741k == aVar.f292741k;
    }

    public int hashCode() {
        return (((((((((((((((((((java.lang.Boolean.hashCode(this.f292731a) * 31) + this.f292732b.hashCode()) * 31) + java.lang.Float.hashCode(this.f292733c)) * 31) + this.f292734d.hashCode()) * 31) + this.f292735e.hashCode()) * 31) + java.lang.Float.hashCode(this.f292736f)) * 31) + java.lang.Float.hashCode(this.f292737g)) * 31) + java.lang.Float.hashCode(this.f292738h)) * 31) + java.lang.Float.hashCode(this.f292739i)) * 31) + this.f292740j.hashCode()) * 31) + java.lang.Integer.hashCode(this.f292741k);
    }

    public java.lang.String toString() {
        return "GestureSeiData(isSuccess=" + this.f292731a + ", sdkUserId=" + this.f292732b + ", aspect=" + this.f292733c + ", gestureId=" + this.f292734d + ", randomId=" + this.f292735e + ", transX=" + this.f292736f + ", transY=" + this.f292737g + ", rotation=" + this.f292738h + ", scale=" + this.f292739i + ", giftComboId=" + this.f292740j + ", renderMode=" + this.f292741k + ')';
    }
}
