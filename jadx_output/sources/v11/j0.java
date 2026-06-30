package v11;

/* loaded from: classes11.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f432416a;

    /* renamed from: b, reason: collision with root package name */
    public final int f432417b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f432418c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f432419d;

    /* renamed from: e, reason: collision with root package name */
    public final float f432420e;

    /* renamed from: f, reason: collision with root package name */
    public final int f432421f;

    /* renamed from: g, reason: collision with root package name */
    public final int f432422g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f432423h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f432424i;

    public j0(float f17, int i17, boolean z17, boolean z18, float f18, int i18, int i19, boolean z19, java.lang.Integer num) {
        this.f432416a = f17;
        this.f432417b = i17;
        this.f432418c = z17;
        this.f432419d = z18;
        this.f432420e = f18;
        this.f432421f = i18;
        this.f432422g = i19;
        this.f432423h = z19;
        this.f432424i = num;
    }

    public static v11.j0 a(v11.j0 j0Var, float f17, int i17, boolean z17, boolean z18, float f18, int i18, int i19, boolean z19, java.lang.Integer num, int i27, java.lang.Object obj) {
        float f19 = (i27 & 1) != 0 ? j0Var.f432416a : f17;
        int i28 = (i27 & 2) != 0 ? j0Var.f432417b : i17;
        boolean z27 = (i27 & 4) != 0 ? j0Var.f432418c : z17;
        boolean z28 = (i27 & 8) != 0 ? j0Var.f432419d : z18;
        float f27 = (i27 & 16) != 0 ? j0Var.f432420e : f18;
        int i29 = (i27 & 32) != 0 ? j0Var.f432421f : i18;
        int i37 = (i27 & 64) != 0 ? j0Var.f432422g : i19;
        boolean z29 = (i27 & 128) != 0 ? j0Var.f432423h : z19;
        java.lang.Integer num2 = (i27 & 256) != 0 ? j0Var.f432424i : num;
        j0Var.getClass();
        return new v11.j0(f19, i28, z27, z28, f27, i29, i37, z29, num2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.j0)) {
            return false;
        }
        v11.j0 j0Var = (v11.j0) obj;
        return java.lang.Float.compare(this.f432416a, j0Var.f432416a) == 0 && this.f432417b == j0Var.f432417b && this.f432418c == j0Var.f432418c && this.f432419d == j0Var.f432419d && java.lang.Float.compare(this.f432420e, j0Var.f432420e) == 0 && this.f432421f == j0Var.f432421f && this.f432422g == j0Var.f432422g && this.f432423h == j0Var.f432423h && kotlin.jvm.internal.o.b(this.f432424i, j0Var.f432424i);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((java.lang.Float.hashCode(this.f432416a) * 31) + java.lang.Integer.hashCode(this.f432417b)) * 31) + java.lang.Boolean.hashCode(this.f432418c)) * 31) + java.lang.Boolean.hashCode(this.f432419d)) * 31) + java.lang.Float.hashCode(this.f432420e)) * 31) + java.lang.Integer.hashCode(this.f432421f)) * 31) + java.lang.Integer.hashCode(this.f432422g)) * 31) + java.lang.Boolean.hashCode(this.f432423h)) * 31;
        java.lang.Integer num = this.f432424i;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public java.lang.String toString() {
        return "NativeMarkdownTextViewConfig(textSizeDp=" + this.f432416a + ", textColor=" + this.f432417b + ", isBold=" + this.f432418c + ", isMonospace=" + this.f432419d + ", lineSpacingMultiplier=" + this.f432420e + ", paddingHorizontalPx=" + this.f432421f + ", paddingVerticalPx=" + this.f432422g + ", enableLinkMovement=" + this.f432423h + ", highlightColor=" + this.f432424i + ')';
    }

    public /* synthetic */ j0(float f17, int i17, boolean z17, boolean z18, float f18, int i18, int i19, boolean z19, java.lang.Integer num, int i27, kotlin.jvm.internal.i iVar) {
        this(f17, i17, (i27 & 4) != 0 ? false : z17, (i27 & 8) != 0 ? false : z18, (i27 & 16) != 0 ? 1.0f : f18, (i27 & 32) != 0 ? 0 : i18, (i27 & 64) != 0 ? 0 : i19, (i27 & 128) != 0 ? false : z19, (i27 & 256) != 0 ? null : num);
    }
}
