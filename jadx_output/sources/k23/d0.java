package k23;

/* loaded from: classes12.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f303544a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup.LayoutParams f303545b;

    /* renamed from: c, reason: collision with root package name */
    public final k23.v2 f303546c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f303547d;

    /* renamed from: e, reason: collision with root package name */
    public final k23.w0 f303548e;

    /* renamed from: f, reason: collision with root package name */
    public final int f303549f;

    /* renamed from: g, reason: collision with root package name */
    public final int f303550g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f303551h;

    /* renamed from: i, reason: collision with root package name */
    public final k23.u2 f303552i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Integer[] f303553j;

    /* renamed from: k, reason: collision with root package name */
    public final k23.b0 f303554k;

    /* renamed from: l, reason: collision with root package name */
    public float f303555l;

    static {
        new k23.c0(null);
    }

    public d0(android.view.ViewGroup viewGroup, android.view.ViewGroup.LayoutParams layoutParams, k23.v2 v2Var, android.view.ViewGroup viewGroup2, k23.w0 w0Var, int i17, int i18, java.lang.String str, k23.u2 u2Var, java.lang.Integer[] numArr, k23.b0 b0Var, int i19, kotlin.jvm.internal.i iVar) {
        java.lang.Integer[] activityBarColor;
        android.view.ViewGroup viewGroup3 = (i19 & 8) != 0 ? null : viewGroup2;
        k23.w0 floatingVoiceScene = (i19 & 16) != 0 ? k23.w0.f303739i : w0Var;
        int i27 = (i19 & 32) != 0 ? 6 : i17;
        int i28 = (i19 & 64) != 0 ? 3 : i18;
        java.lang.String startButtonTitle = (i19 & 128) != 0 ? "" : str;
        k23.u2 specificStartBtnStyle = (i19 & 256) != 0 ? k23.u2.f303701d : u2Var;
        if ((i19 & 512) != 0) {
            int d17 = i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.f479158al2);
            activityBarColor = new java.lang.Integer[2];
            for (int i29 = 0; i29 < 2; i29++) {
                activityBarColor[i29] = java.lang.Integer.valueOf(d17);
            }
        } else {
            activityBarColor = numArr;
        }
        k23.b0 modeSwitchStyle = (i19 & 1024) != 0 ? k23.b0.f303519f : b0Var;
        kotlin.jvm.internal.o.g(floatingVoiceScene, "floatingVoiceScene");
        kotlin.jvm.internal.o.g(startButtonTitle, "startButtonTitle");
        kotlin.jvm.internal.o.g(specificStartBtnStyle, "specificStartBtnStyle");
        kotlin.jvm.internal.o.g(activityBarColor, "activityBarColor");
        kotlin.jvm.internal.o.g(modeSwitchStyle, "modeSwitchStyle");
        this.f303544a = viewGroup;
        this.f303545b = layoutParams;
        this.f303546c = v2Var;
        this.f303547d = viewGroup3;
        this.f303548e = floatingVoiceScene;
        this.f303549f = i27;
        this.f303550g = i28;
        this.f303551h = startButtonTitle;
        this.f303552i = specificStartBtnStyle;
        this.f303553j = activityBarColor;
        this.f303554k = modeSwitchStyle;
        this.f303555l = 0.6f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k23.d0)) {
            return false;
        }
        k23.d0 d0Var = (k23.d0) obj;
        return kotlin.jvm.internal.o.b(this.f303544a, d0Var.f303544a) && kotlin.jvm.internal.o.b(this.f303545b, d0Var.f303545b) && kotlin.jvm.internal.o.b(this.f303546c, d0Var.f303546c) && kotlin.jvm.internal.o.b(this.f303547d, d0Var.f303547d) && this.f303548e == d0Var.f303548e && this.f303549f == d0Var.f303549f && this.f303550g == d0Var.f303550g && kotlin.jvm.internal.o.b(this.f303551h, d0Var.f303551h) && this.f303552i == d0Var.f303552i && kotlin.jvm.internal.o.b(this.f303553j, d0Var.f303553j) && this.f303554k == d0Var.f303554k;
    }

    public int hashCode() {
        android.view.ViewGroup viewGroup = this.f303544a;
        int hashCode = (viewGroup == null ? 0 : viewGroup.hashCode()) * 31;
        android.view.ViewGroup.LayoutParams layoutParams = this.f303545b;
        int hashCode2 = (hashCode + (layoutParams == null ? 0 : layoutParams.hashCode())) * 31;
        k23.v2 v2Var = this.f303546c;
        int hashCode3 = (hashCode2 + (v2Var == null ? 0 : v2Var.hashCode())) * 31;
        android.view.ViewGroup viewGroup2 = this.f303547d;
        return ((((((((((((((hashCode3 + (viewGroup2 != null ? viewGroup2.hashCode() : 0)) * 31) + this.f303548e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f303549f)) * 31) + java.lang.Integer.hashCode(this.f303550g)) * 31) + this.f303551h.hashCode()) * 31) + this.f303552i.hashCode()) * 31) + java.util.Arrays.hashCode(this.f303553j)) * 31) + this.f303554k.hashCode();
    }

    public java.lang.String toString() {
        return "FTSFloatingVoiceInputParams(panelViewGroup=" + this.f303544a + ", panelLayoutParams=" + this.f303545b + ", listener=" + this.f303546c + ", btnContainerView=" + this.f303547d + ", floatingVoiceScene=" + this.f303548e + ", sceneType=" + this.f303549f + ", searchScene=" + this.f303550g + ", startButtonTitle=" + this.f303551h + ", specificStartBtnStyle=" + this.f303552i + ", activityBarColor=" + java.util.Arrays.toString(this.f303553j) + ", modeSwitchStyle=" + this.f303554k + ')';
    }
}
