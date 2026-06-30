package pw2;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f358685a;

    /* renamed from: b, reason: collision with root package name */
    public long f358686b;

    /* renamed from: c, reason: collision with root package name */
    public long f358687c;

    /* renamed from: d, reason: collision with root package name */
    public long f358688d;

    /* renamed from: e, reason: collision with root package name */
    public long f358689e;

    /* renamed from: f, reason: collision with root package name */
    public long f358690f;

    /* renamed from: g, reason: collision with root package name */
    public long f358691g;

    /* renamed from: h, reason: collision with root package name */
    public long f358692h;

    /* renamed from: i, reason: collision with root package name */
    public long f358693i;

    /* renamed from: j, reason: collision with root package name */
    public long f358694j;

    /* renamed from: k, reason: collision with root package name */
    public long f358695k;

    /* renamed from: l, reason: collision with root package name */
    public int f358696l;

    /* renamed from: m, reason: collision with root package name */
    public int f358697m;

    /* renamed from: n, reason: collision with root package name */
    public long f358698n;

    public final cl0.g a() {
        cl0.g gVar = new cl0.g();
        gVar.p("corePrepareTime", this.f358685a);
        gVar.p("corePreparedTime", this.f358688d);
        gVar.p("firstClipOpenedTime", this.f358686b);
        gVar.p("firstVideoPacketTime", this.f358687c);
        gVar.p("videoDecoderTime", this.f358689e);
        gVar.p("firstFrameRenderTime", this.f358690f);
        gVar.p("startPlayTime", this.f358691g);
        gVar.p("seekTime", this.f358692h);
        gVar.p("seekEndTime", this.f358693i);
        gVar.p("downloaderStartTime", this.f358694j);
        gVar.p("pauseTime", 0L);
        gVar.p("surfaceAvailableTime", this.f358695k);
        gVar.o("urlType", this.f358696l);
        gVar.o("isFocus", this.f358697m);
        gVar.p("targetStartPlayTime", this.f358698n);
        return gVar;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderPlayerActionStatistics{mCoreApiPrepareTimeMs=");
        sb6.append(this.f358685a);
        sb6.append(", mDownloaderStartTimeMs=(");
        sb6.append(this.f358694j);
        sb6.append(", ");
        long j17 = this.f358694j - this.f358685a;
        if (j17 < 0) {
            j17 = 0;
        }
        sb6.append(j17);
        sb6.append(") mCoreSchedulingThreadOnPreparedTimeMs=(");
        sb6.append(this.f358688d);
        sb6.append(", ");
        long j18 = this.f358688d - this.f358685a;
        sb6.append(j18 >= 0 ? j18 : 0L);
        sb6.append("), mInitFirstClipPositionETimeMs=(");
        sb6.append(this.f358686b);
        sb6.append(", ");
        sb6.append(this.f358686b - this.f358685a);
        sb6.append("), mFirstVideoPacketReadETimeMs=(");
        sb6.append(this.f358687c);
        sb6.append(", ");
        sb6.append(this.f358687c - this.f358685a);
        sb6.append(") mVideoDecoderOpenedTimeMs=(");
        sb6.append(this.f358689e);
        sb6.append(", ");
        sb6.append(this.f358689e - this.f358685a);
        sb6.append(") mFirstVideoFrameRenderETimeMs=(");
        sb6.append(this.f358690f);
        sb6.append(", ");
        sb6.append(this.f358690f - this.f358685a);
        sb6.append("), mStartPlayTimeMs=");
        sb6.append(this.f358691g);
        sb6.append(", mSeekTimeMs=");
        sb6.append(this.f358692h);
        sb6.append(", mSeekEndTimeMs=");
        sb6.append(this.f358693i);
        sb6.append(", mPauseTimeMs=0, urlType=");
        sb6.append(this.f358696l);
        sb6.append(" isFocus=");
        sb6.append(this.f358697m);
        return sb6.toString();
    }
}
