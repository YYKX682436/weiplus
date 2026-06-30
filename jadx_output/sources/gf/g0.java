package gf;

/* loaded from: classes7.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f271063a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f271064b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f271065c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f271066d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f271067e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f271068f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f271069g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f271070h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f271071i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f271072j;

    /* renamed from: k, reason: collision with root package name */
    public final gf.e0 f271073k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.skyline.jni.ISkylineExperiment f271074l;

    public g0(int i17, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37, boolean z38, boolean z39, gf.e0 isAccessibilityEnabled, com.tencent.skyline.jni.ISkylineExperiment iSkylineExperiment) {
        kotlin.jvm.internal.o.g(isAccessibilityEnabled, "isAccessibilityEnabled");
        this.f271063a = i17;
        this.f271064b = z17;
        this.f271065c = z18;
        this.f271066d = z19;
        this.f271067e = z27;
        this.f271068f = z28;
        this.f271069g = z29;
        this.f271070h = z37;
        this.f271071i = z38;
        this.f271072j = z39;
        this.f271073k = isAccessibilityEnabled;
        this.f271074l = iSkylineExperiment;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf.g0)) {
            return false;
        }
        gf.g0 g0Var = (gf.g0) obj;
        return this.f271063a == g0Var.f271063a && this.f271064b == g0Var.f271064b && this.f271065c == g0Var.f271065c && this.f271066d == g0Var.f271066d && this.f271067e == g0Var.f271067e && this.f271068f == g0Var.f271068f && this.f271069g == g0Var.f271069g && this.f271070h == g0Var.f271070h && this.f271071i == g0Var.f271071i && this.f271072j == g0Var.f271072j && kotlin.jvm.internal.o.b(this.f271073k, g0Var.f271073k) && kotlin.jvm.internal.o.b(this.f271074l, g0Var.f271074l);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((java.lang.Integer.hashCode(this.f271063a) * 31) + java.lang.Boolean.hashCode(this.f271064b)) * 31) + java.lang.Boolean.hashCode(this.f271065c)) * 31) + java.lang.Boolean.hashCode(this.f271066d)) * 31) + java.lang.Boolean.hashCode(this.f271067e)) * 31) + java.lang.Boolean.hashCode(this.f271068f)) * 31) + java.lang.Boolean.hashCode(this.f271069g)) * 31) + java.lang.Boolean.hashCode(this.f271070h)) * 31) + java.lang.Boolean.hashCode(this.f271071i)) * 31) + java.lang.Boolean.hashCode(this.f271072j)) * 31) + this.f271073k.hashCode()) * 31;
        com.tencent.skyline.jni.ISkylineExperiment iSkylineExperiment = this.f271074l;
        return hashCode + (iSkylineExperiment == null ? 0 : iSkylineExperiment.hashCode());
    }

    public java.lang.String toString() {
        return "Settings(renderBackend=" + this.f271063a + ", shouldUseChromiumCronet=" + this.f271064b + ", useJavaTimer=" + this.f271065c + ", enableNewImage=" + this.f271066d + ", enableSVGImage=" + this.f271067e + ", setupFlutterLogDelegate=" + this.f271068f + ", enableReport=" + this.f271069g + ", enableKeyboardDuplicateEventFilter=" + this.f271070h + ", delayDispatchSkylineGlobalReady=" + this.f271071i + ", delaySkylineWindowInit=" + this.f271072j + ", isAccessibilityEnabled=" + this.f271073k + ", skylineExperiment=" + this.f271074l + ')';
    }
}
