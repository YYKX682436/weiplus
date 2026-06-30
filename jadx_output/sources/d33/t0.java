package d33;

/* loaded from: classes10.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f226273a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f226274b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Matrix f226275c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Matrix f226276d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Matrix f226277e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f226278f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f226279g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f226280h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f226281i;

    /* renamed from: j, reason: collision with root package name */
    public float f226282j;

    /* renamed from: k, reason: collision with root package name */
    public float f226283k;

    public t0(long j17, java.lang.String mediaPath) {
        kotlin.jvm.internal.o.g(mediaPath, "mediaPath");
        this.f226273a = j17;
        this.f226274b = mediaPath;
        this.f226275c = new android.graphics.Matrix();
        this.f226276d = new android.graphics.Matrix();
        this.f226277e = new android.graphics.Matrix();
        this.f226278f = new android.graphics.Rect();
        this.f226279g = new android.graphics.Rect();
        this.f226280h = new android.graphics.Rect();
        this.f226281i = new android.graphics.Rect();
        this.f226282j = 1.0f;
        this.f226283k = 1.0f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d33.t0)) {
            return false;
        }
        d33.t0 t0Var = (d33.t0) obj;
        return this.f226273a == t0Var.f226273a && kotlin.jvm.internal.o.b(this.f226274b, t0Var.f226274b);
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f226273a) * 31) + this.f226274b.hashCode();
    }

    public java.lang.String toString() {
        return "CropInfo(mediaId=" + this.f226273a + ", mediaPath=" + this.f226274b + ')';
    }
}
