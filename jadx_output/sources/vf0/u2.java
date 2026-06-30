package vf0;

/* loaded from: classes12.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f436279a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f436280b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f436281c;

    /* renamed from: d, reason: collision with root package name */
    public final int f436282d;

    /* renamed from: e, reason: collision with root package name */
    public final vf0.r2 f436283e;

    /* renamed from: f, reason: collision with root package name */
    public final c01.h7 f436284f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f436285g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f436286h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f436287i;

    public u2(java.lang.String videoFileNamePure, java.lang.String videoPath, java.lang.String videoThumbPath, boolean z17, int i17, vf0.r2 crossParams, c01.h7 h7Var) {
        kotlin.jvm.internal.o.g(videoFileNamePure, "videoFileNamePure");
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(videoThumbPath, "videoThumbPath");
        kotlin.jvm.internal.o.g(crossParams, "crossParams");
        this.f436279a = videoPath;
        this.f436280b = videoThumbPath;
        this.f436281c = z17;
        this.f436282d = i17;
        this.f436283e = crossParams;
        this.f436284f = h7Var;
        if ((videoFileNamePure.length() > 0) && !r26.i0.y(videoFileNamePure, "NS", false)) {
            videoFileNamePure = "NS".concat(videoFileNamePure);
        }
        this.f436285g = videoFileNamePure;
        this.f436286h = jz5.h.b(new vf0.t2(this));
        this.f436287i = jz5.h.b(new vf0.s2(this));
    }

    public final boolean a() {
        c01.h7 h7Var = this.f436284f;
        if (h7Var == null || h7Var.f37227b <= 0) {
            return false;
        }
        java.lang.String str = h7Var.f37229d;
        return str != null && (r26.n0.N(str) ^ true);
    }

    public java.lang.String toString() {
        return "VideoSendElement(videoFileName='" + this.f436285g + "', videoPath='" + this.f436279a + "', videoThumbPath='" + this.f436280b + "', sendRawVideo=" + this.f436281c + ", videoFileLength=" + this.f436282d + ", crossParams=" + this.f436283e + ", forwardInfo=" + this.f436284f + ')';
    }

    public /* synthetic */ u2(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17, vf0.r2 r2Var, c01.h7 h7Var, int i18, kotlin.jvm.internal.i iVar) {
        this(str, str2, (i18 & 4) != 0 ? "" : str3, (i18 & 8) != 0 ? false : z17, (i18 & 16) != 0 ? 0 : i17, (i18 & 32) != 0 ? new vf0.r2(null, null, null, null, null, null, false, null, null, null, false, false, 4095, null) : r2Var, (i18 & 64) != 0 ? null : h7Var);
    }
}
