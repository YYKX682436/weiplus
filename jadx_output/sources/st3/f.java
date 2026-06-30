package st3;

/* loaded from: classes10.dex */
public final class f implements java.io.Serializable {

    /* renamed from: f, reason: collision with root package name */
    public long f412535f;

    /* renamed from: g, reason: collision with root package name */
    public long f412536g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f412537h;

    /* renamed from: i, reason: collision with root package name */
    public int f412538i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f412539m;

    /* renamed from: n, reason: collision with root package name */
    public int f412540n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f412533d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f412534e = "";

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f412541o = new java.util.ArrayList();

    public final java.util.ArrayList a() {
        return this.f412541o;
    }

    public final java.lang.String b() {
        return this.f412534e;
    }

    public final java.lang.String c() {
        return this.f412533d;
    }

    public final long d() {
        return this.f412535f;
    }

    public final boolean e() {
        return this.f412537h;
    }

    public java.lang.String toString() {
        return "CaptureInfo(sourceVideoPath='" + this.f412533d + "', sourceThumb='" + this.f412534e + "', remuxStart=" + this.f412535f + ", remuxEnd=" + this.f412536g + ", isCaptureVideo=" + this.f412537h + ", audioMixType=" + this.f412538i + ", audioInfo=" + this.f412539m + ", videoRotate=" + this.f412540n + ')';
    }
}
