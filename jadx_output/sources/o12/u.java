package o12;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f342183a;

    /* renamed from: b, reason: collision with root package name */
    public final o12.y f342184b;

    /* renamed from: c, reason: collision with root package name */
    public final int f342185c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f342186d;

    /* renamed from: e, reason: collision with root package name */
    public final float f342187e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f342188f;

    /* renamed from: g, reason: collision with root package name */
    public float f342189g;

    /* renamed from: h, reason: collision with root package name */
    public float f342190h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f342191i;

    public u(java.lang.String text, o12.y style, int i17, android.graphics.Rect bounds, float f17, android.graphics.Rect viewBounds, float f18, float f19, boolean z17) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(style, "style");
        kotlin.jvm.internal.o.g(bounds, "bounds");
        kotlin.jvm.internal.o.g(viewBounds, "viewBounds");
        this.f342183a = text;
        this.f342184b = style;
        this.f342185c = i17;
        this.f342186d = bounds;
        this.f342187e = f17;
        this.f342188f = viewBounds;
        this.f342189g = f18;
        this.f342190h = f19;
        this.f342191i = z17;
    }

    public static o12.u a(o12.u uVar, java.lang.String str, o12.y yVar, int i17, android.graphics.Rect rect, float f17, android.graphics.Rect rect2, float f18, float f19, boolean z17, int i18, java.lang.Object obj) {
        java.lang.String text = (i18 & 1) != 0 ? uVar.f342183a : str;
        o12.y style = (i18 & 2) != 0 ? uVar.f342184b : yVar;
        int i19 = (i18 & 4) != 0 ? uVar.f342185c : i17;
        android.graphics.Rect bounds = (i18 & 8) != 0 ? uVar.f342186d : rect;
        float f27 = (i18 & 16) != 0 ? uVar.f342187e : f17;
        android.graphics.Rect viewBounds = (i18 & 32) != 0 ? uVar.f342188f : rect2;
        float f28 = (i18 & 64) != 0 ? uVar.f342189g : f18;
        float f29 = (i18 & 128) != 0 ? uVar.f342190h : f19;
        boolean z18 = (i18 & 256) != 0 ? uVar.f342191i : z17;
        uVar.getClass();
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(style, "style");
        kotlin.jvm.internal.o.g(bounds, "bounds");
        kotlin.jvm.internal.o.g(viewBounds, "viewBounds");
        return new o12.u(text, style, i19, bounds, f27, viewBounds, f28, f29, z18);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o12.u)) {
            return false;
        }
        o12.u uVar = (o12.u) obj;
        return kotlin.jvm.internal.o.b(this.f342183a, uVar.f342183a) && kotlin.jvm.internal.o.b(this.f342184b, uVar.f342184b) && this.f342185c == uVar.f342185c && kotlin.jvm.internal.o.b(this.f342186d, uVar.f342186d) && java.lang.Float.compare(this.f342187e, uVar.f342187e) == 0 && kotlin.jvm.internal.o.b(this.f342188f, uVar.f342188f) && java.lang.Float.compare(this.f342189g, uVar.f342189g) == 0 && java.lang.Float.compare(this.f342190h, uVar.f342190h) == 0 && this.f342191i == uVar.f342191i;
    }

    public int hashCode() {
        return (((((((((((((((this.f342183a.hashCode() * 31) + this.f342184b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f342185c)) * 31) + this.f342186d.hashCode()) * 31) + java.lang.Float.hashCode(this.f342187e)) * 31) + this.f342188f.hashCode()) * 31) + java.lang.Float.hashCode(this.f342189g)) * 31) + java.lang.Float.hashCode(this.f342190h)) * 31) + java.lang.Boolean.hashCode(this.f342191i);
    }

    public java.lang.String toString() {
        return "TextDecoration(text=" + this.f342183a + ", style=" + this.f342184b + ", color=" + this.f342185c + ", bounds=" + this.f342186d + ", viewRatio=" + this.f342187e + ", viewBounds=" + this.f342188f + ", scale=" + this.f342189g + ", rotation=" + this.f342190h + ", positioned=" + this.f342191i + ')';
    }
}
