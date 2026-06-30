package hq0;

/* loaded from: classes7.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f283012a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f283013b;

    /* renamed from: c, reason: collision with root package name */
    public int f283014c;

    /* renamed from: d, reason: collision with root package name */
    public int f283015d;

    /* renamed from: e, reason: collision with root package name */
    public int f283016e;

    /* renamed from: f, reason: collision with root package name */
    public int f283017f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f283018g;

    /* renamed from: h, reason: collision with root package name */
    public cf3.d f283019h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f283020i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f283021j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f283022k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f283023l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f283024m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f283025n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f283026o;

    public j0(int i17, java.lang.String str, int i18, int i19, int i27, int i28, android.view.View view, cf3.d dVar, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37, int i29, kotlin.jvm.internal.i iVar) {
        int i37 = (i29 & 1) != 0 ? 0 : i17;
        java.lang.String frameSetId = (i29 & 2) != 0 ? "" : str;
        int i38 = (i29 & 4) != 0 ? 0 : i18;
        int i39 = (i29 & 8) != 0 ? 0 : i19;
        int i47 = (i29 & 16) != 0 ? 0 : i27;
        int i48 = (i29 & 32) != 0 ? 0 : i28;
        android.view.View view2 = (i29 & 64) != 0 ? null : view;
        cf3.d dVar2 = (i29 & 128) == 0 ? dVar : null;
        boolean z38 = (i29 & 256) != 0 ? false : z17;
        boolean z39 = (i29 & 512) != 0 ? false : z18;
        boolean z47 = (i29 & 1024) != 0 ? false : z19;
        boolean z48 = (i29 & 2048) != 0 ? false : z27;
        boolean z49 = (i29 & 4096) != 0 ? false : z28;
        boolean z57 = (i29 & 8192) != 0 ? false : z29;
        boolean z58 = (i29 & 16384) != 0 ? false : z37;
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        this.f283012a = i37;
        this.f283013b = frameSetId;
        this.f283014c = i38;
        this.f283015d = i39;
        this.f283016e = i47;
        this.f283017f = i48;
        this.f283018g = view2;
        this.f283019h = dVar2;
        this.f283020i = z38;
        this.f283021j = z39;
        this.f283022k = z47;
        this.f283023l = z48;
        this.f283024m = z49;
        this.f283025n = z57;
        this.f283026o = z58;
    }

    public final void a() {
        android.view.View view = this.f283018g;
        if (view == null || view.getLayoutParams() == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = this.f283016e;
        marginLayoutParams.height = this.f283017f;
        marginLayoutParams.topMargin = this.f283015d;
        marginLayoutParams.leftMargin = this.f283014c;
        view.setLayoutParams(marginLayoutParams);
    }

    public final java.lang.String b() {
        java.lang.String frameSetId = this.f283013b;
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        return frameSetId + '-' + this.f283012a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq0.j0)) {
            return false;
        }
        hq0.j0 j0Var = (hq0.j0) obj;
        return this.f283012a == j0Var.f283012a && kotlin.jvm.internal.o.b(this.f283013b, j0Var.f283013b) && this.f283014c == j0Var.f283014c && this.f283015d == j0Var.f283015d && this.f283016e == j0Var.f283016e && this.f283017f == j0Var.f283017f && kotlin.jvm.internal.o.b(this.f283018g, j0Var.f283018g) && kotlin.jvm.internal.o.b(this.f283019h, j0Var.f283019h) && this.f283020i == j0Var.f283020i && this.f283021j == j0Var.f283021j && this.f283022k == j0Var.f283022k && this.f283023l == j0Var.f283023l && this.f283024m == j0Var.f283024m && this.f283025n == j0Var.f283025n && this.f283026o == j0Var.f283026o;
    }

    public int hashCode() {
        int hashCode = ((((((((((java.lang.Integer.hashCode(this.f283012a) * 31) + this.f283013b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f283014c)) * 31) + java.lang.Integer.hashCode(this.f283015d)) * 31) + java.lang.Integer.hashCode(this.f283016e)) * 31) + java.lang.Integer.hashCode(this.f283017f)) * 31;
        android.view.View view = this.f283018g;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        cf3.d dVar = this.f283019h;
        return ((((((((((((((hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f283020i)) * 31) + java.lang.Boolean.hashCode(this.f283021j)) * 31) + java.lang.Boolean.hashCode(this.f283022k)) * 31) + java.lang.Boolean.hashCode(this.f283023l)) * 31) + java.lang.Boolean.hashCode(this.f283024m)) * 31) + java.lang.Boolean.hashCode(this.f283025n)) * 31) + java.lang.Boolean.hashCode(this.f283026o);
    }

    public java.lang.String toString() {
        return "MagicSclCanvas(canvasId=" + this.f283012a + ", frameSetId=" + this.f283013b + ", left=" + this.f283014c + ", top=" + this.f283015d + ", width=" + this.f283016e + ", height=" + this.f283017f + ", canvasView=" + this.f283018g + ", externalView=" + this.f283019h + ", pendingFirstFrame=" + this.f283020i + ", pendingRedraw=" + this.f283021j + ", surfaceDestroyNeedRedraw=" + this.f283022k + ", firstFrameRendered=" + this.f283023l + ", surfaceAvailable=" + this.f283024m + ", created=" + this.f283025n + ", preCreated=" + this.f283026o + ')';
    }
}
