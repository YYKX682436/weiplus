package q1;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f359486a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Float[] f359487b;

    public d(int i17) {
        this.f359486a = i17;
        java.lang.Float[] fArr = new java.lang.Float[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            fArr[i18] = java.lang.Float.valueOf(0.0f);
        }
        this.f359487b = fArr;
    }

    public final float a(q1.d a17) {
        kotlin.jvm.internal.o.g(a17, "a");
        float f17 = 0.0f;
        for (int i17 = 0; i17 < this.f359486a; i17++) {
            f17 += this.f359487b[i17].floatValue() * a17.f359487b[i17].floatValue();
        }
        return f17;
    }
}
