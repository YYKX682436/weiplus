package ty0;

/* loaded from: classes14.dex */
public final class a1 {

    /* renamed from: j, reason: collision with root package name */
    public static final ty0.a1 f422774j;

    /* renamed from: k, reason: collision with root package name */
    public static final ty0.a1 f422775k;

    /* renamed from: a, reason: collision with root package name */
    public final long f422776a;

    /* renamed from: b, reason: collision with root package name */
    public final long f422777b;

    /* renamed from: c, reason: collision with root package name */
    public final long f422778c;

    /* renamed from: d, reason: collision with root package name */
    public final long f422779d;

    /* renamed from: e, reason: collision with root package name */
    public final long f422780e;

    /* renamed from: f, reason: collision with root package name */
    public final long f422781f;

    /* renamed from: g, reason: collision with root package name */
    public final float f422782g;

    /* renamed from: h, reason: collision with root package name */
    public final float f422783h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f422784i;

    static {
        float f17 = 8;
        float f18 = 2 * f17;
        f422774j = new ty0.a1(rz0.a.c(com.tencent.mm.R.color.f479409yg, null, 1, null), rz0.a.c(com.tencent.mm.R.color.f479409yg, null, 1, null), rz0.a.c(com.tencent.mm.R.color.f479409yg, null, 1, null), rz0.a.c(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3, null, 1, null), rz0.a.c(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9, null, 1, null), rz0.a.c(com.tencent.mm.R.color.BW_100_Alpha_0_9, null, 1, null), com.tencent.mm.R.raw.icons_filled_music, 3 * f17, f18, true, null);
        f422775k = new ty0.a1(rz0.a.c(com.tencent.mm.R.color.BW_100_Alpha_0_0_5, null, 1, null), rz0.a.c(com.tencent.mm.R.color.f478518a0, null, 1, null), rz0.a.c(com.tencent.mm.R.color.f478517z, null, 1, null), rz0.a.c(com.tencent.mm.R.color.BW_100_Alpha_0_5, null, 1, null), rz0.a.c(com.tencent.mm.R.color.BW_100_Alpha_0_8, null, 1, null), rz0.a.c(com.tencent.mm.R.color.BW_100_Alpha_0_8, null, 1, null), com.tencent.mm.R.raw.icons_filled_music, f17 * 5, f18, false, null);
    }

    public a1(long j17, long j18, long j19, long j27, long j28, long j29, int i17, float f17, float f18, boolean z17, kotlin.jvm.internal.i iVar) {
        this.f422776a = j17;
        this.f422777b = j18;
        this.f422778c = j19;
        this.f422779d = j27;
        this.f422780e = j28;
        this.f422781f = j29;
        this.f422782g = f17;
        this.f422783h = f18;
        this.f422784i = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty0.a1)) {
            return false;
        }
        ty0.a1 a1Var = (ty0.a1) obj;
        return e1.y.c(this.f422776a, a1Var.f422776a) && e1.y.c(this.f422777b, a1Var.f422777b) && e1.y.c(this.f422778c, a1Var.f422778c) && e1.y.c(this.f422779d, a1Var.f422779d) && e1.y.c(this.f422780e, a1Var.f422780e) && e1.y.c(this.f422781f, a1Var.f422781f) && p2.h.a(this.f422782g, a1Var.f422782g) && p2.h.a(this.f422783h, a1Var.f422783h) && this.f422784i == a1Var.f422784i;
    }

    public int hashCode() {
        int i17 = e1.y.f246321l;
        return (((((((((((((((((java.lang.Long.hashCode(this.f422776a) * 31) + java.lang.Long.hashCode(this.f422777b)) * 31) + java.lang.Long.hashCode(this.f422778c)) * 31) + java.lang.Long.hashCode(this.f422779d)) * 31) + java.lang.Long.hashCode(this.f422780e)) * 31) + java.lang.Long.hashCode(this.f422781f)) * 31) + java.lang.Integer.hashCode(com.tencent.mm.R.raw.icons_filled_music)) * 31) + java.lang.Float.hashCode(this.f422782g)) * 31) + java.lang.Float.hashCode(this.f422783h)) * 31) + java.lang.Boolean.hashCode(this.f422784i);
    }

    public java.lang.String toString() {
        return "MusicSelectorTheme(selectorBgColor=" + ((java.lang.Object) e1.y.i(this.f422776a)) + ", cardBgColor=" + ((java.lang.Object) e1.y.i(this.f422777b)) + ", cardSelectedBgColor=" + ((java.lang.Object) e1.y.i(this.f422778c)) + ", soundsAnimationColor=" + ((java.lang.Object) e1.y.i(this.f422779d)) + ", textColor=" + ((java.lang.Object) e1.y.i(this.f422780e)) + ", movieOptionColor=" + ((java.lang.Object) e1.y.i(this.f422781f)) + ", musicIconRes=2131690961, cardEdgePadding=" + ((java.lang.Object) p2.h.b(this.f422782g)) + ", cardDividerPadding=" + ((java.lang.Object) p2.h.b(this.f422783h)) + ", showLrc=" + this.f422784i + ')';
    }
}
