package pu1;

/* loaded from: classes13.dex */
public final class b extends es0.d {

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Integer f358418o;

    /* renamed from: p, reason: collision with root package name */
    public final pu1.a f358419p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f358420q;

    /* renamed from: r, reason: collision with root package name */
    public int f358421r;

    public b() {
        super(false, 1, null);
        this.f358419p = new pu1.a();
        this.f358420q = new java.util.ArrayList();
    }

    public final void c() {
        this.f256313c = com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH;
        this.f256312b = (((int) (com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH * (this.f256312b / this.f256313c))) / 16) * 16;
        this.f256314d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_screec_cast_pc_video_bitrate, 4000) * 1000;
        this.f256317g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_screec_cast_pc_video_iframe_interval, 3);
    }

    @Override // es0.d
    public java.lang.String toString() {
        return "mVideoWidth:" + this.f256312b + "  mVideoHeight : " + this.f256313c + " mBitRate : " + this.f256314d + " , mFps : " + this.f256315e + ' ';
    }
}
