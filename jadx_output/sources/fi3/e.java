package fi3;

/* loaded from: classes10.dex */
public class e extends bi3.b {

    /* renamed from: b, reason: collision with root package name */
    public fi3.a f262955b;

    /* renamed from: c, reason: collision with root package name */
    public fi3.l f262956c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f262957d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f262958e;

    /* renamed from: f, reason: collision with root package name */
    public final int f262959f;

    /* renamed from: g, reason: collision with root package name */
    public final int f262960g;

    /* renamed from: h, reason: collision with root package name */
    public final int f262961h;

    /* renamed from: i, reason: collision with root package name */
    public final int f262962i;

    /* renamed from: j, reason: collision with root package name */
    public final int f262963j;

    /* renamed from: k, reason: collision with root package name */
    public final int f262964k;

    /* renamed from: l, reason: collision with root package name */
    public final int f262965l;

    /* renamed from: m, reason: collision with root package name */
    public final int f262966m;

    /* renamed from: n, reason: collision with root package name */
    public final long f262967n;

    /* renamed from: o, reason: collision with root package name */
    public final long f262968o;

    /* renamed from: p, reason: collision with root package name */
    public final int f262969p;

    /* renamed from: q, reason: collision with root package name */
    public int f262970q;

    /* renamed from: r, reason: collision with root package name */
    public int f262971r;

    /* renamed from: s, reason: collision with root package name */
    public gp.c f262972s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Point f262973t;

    /* renamed from: u, reason: collision with root package name */
    public int f262974u;

    /* renamed from: v, reason: collision with root package name */
    public android.os.HandlerThread f262975v;

    /* renamed from: w, reason: collision with root package name */
    public fi3.d f262976w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Bitmap f262977x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f262978y;

    public e(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27) {
        this.f262965l = -1;
        this.f262967n = -1L;
        this.f262968o = -1L;
        this.f262969p = -1;
        this.f262973t = null;
        this.f262978y = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && i17 > 0 && i18 > 0) {
            this.f262957d = str;
            this.f262958e = str2;
            this.f262961h = i17;
            this.f262962i = i18;
            this.f262963j = i19;
            this.f262969p = i27;
            int mp4RotateVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(str);
            this.f262964k = mp4RotateVFS;
            com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
            if (d17 != null) {
                this.f262959f = d17.f162384c;
                this.f262960g = d17.f162385d;
                this.f262965l = d17.f162382a;
                this.f262966m = d17.f162386e;
            }
            this.f262967n = 0L;
            this.f262968o = this.f262965l;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s", str, str2, java.lang.Integer.valueOf(this.f262959f), java.lang.Integer.valueOf(this.f262960g), java.lang.Integer.valueOf(mp4RotateVFS), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27));
    }

    @Override // bi3.b
    public int a() {
        return 1;
    }

    @Override // bi3.b
    public int b() {
        long j17;
        int f17;
        java.lang.String str;
        int i17 = this.f262965l;
        int round = java.lang.Math.round(i17 / 1000.0f);
        long j18 = this.f262967n;
        long j19 = this.f262968o;
        if (j18 >= 0 && j19 >= 0) {
            round = java.lang.Math.round(((float) (j19 - j18)) / 1000.0f) + 1;
        }
        this.f262974u = com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.initDataBufLock(round);
        if (com.tencent.mm.modelvideoh265toh264.j.h(this.f262957d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "ish265, create mediacodec decoder");
            this.f262955b = new fi3.j();
        } else {
            this.f262955b = new fi3.h();
        }
        if (i17 <= 0) {
            j17 = j18;
            long j27 = this.f262967n;
            if (j27 >= 0) {
                long j28 = this.f262968o;
                if (j28 >= 0) {
                    f17 = this.f262955b.f(this.f262957d, j27, j28, this.f262966m);
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "remux time error, videoDuration: %s, remuxStartTime: %s, remuxEndTime: %s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j19));
            com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.releaseDataBufLock(this.f262974u);
            return -1;
        }
        j17 = j18;
        f17 = this.f262955b.f(this.f262957d, 0L, i17, this.f262966m);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "decoder init ret: %s", java.lang.Integer.valueOf(f17));
        if (f17 < 0) {
            com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.releaseDataBufLock(this.f262974u);
            return -1;
        }
        int i18 = this.f262969p;
        int i19 = this.f262966m;
        if (i18 > 0 && i18 < i19) {
            this.f262955b.c((int) java.lang.Math.ceil(i19 / i18));
        }
        if (i18 > 0) {
            i19 = java.lang.Math.min(i18, i19);
        }
        this.f262956c = new fi3.l(this.f262959f, this.f262960g, this.f262961h, this.f262962i, this.f262963j, 1, i19);
        this.f262955b.b(new fi3.b(this));
        fi3.l lVar = this.f262956c;
        lVar.f263024b = new fi3.c(this);
        try {
            int i27 = this.f262974u;
            lVar.getClass();
            try {
                lVar.f263023a = i27;
                lVar.b();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "init error: %s, try to re-init again", e17.getMessage());
                try {
                    lVar.b();
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "re-init again error: %s", e18.getMessage());
                    di3.x.f();
                }
            }
            fi3.l lVar2 = this.f262956c;
            lVar2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "Start");
            lVar2.f263038p = true;
            this.f262955b.d();
            this.f262975v.quitSafely();
            this.f262975v.join();
            this.f262976w = null;
            d();
            int i28 = this.f262964k;
            java.lang.String str2 = this.f262958e;
            if (i28 > 0) {
                str = str2 + "tempRotate.mp4";
            } else {
                str = str2;
            }
            long j29 = i17;
            if (j29 <= 0) {
                j29 = j19 - j17;
            }
            int muxingLock = com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.muxingLock(this.f262974u, this.f262970q, 1024, 2, this.f262971r, str, (this.f262956c.f263028f * 1000.0f) / ((float) j29), null, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "muxing ret: %s", java.lang.Integer.valueOf(muxingLock));
            if (i28 > 0) {
                com.tencent.mm.plugin.sight.base.SightVideoJNI.tagRotateVideoVFS(str, str2, i28);
                com.tencent.mm.vfs.w6.h(str);
            }
            com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.releaseDataBufLock(this.f262974u);
            ei3.x.f253187d.c();
            return muxingLock;
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightFFMpegMediaCodecRemuxer", e19, "decode error: %s", e19.getMessage());
            return -1;
        }
    }

    @Override // bi3.b
    public void c(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            this.f262977x = bitmap;
        }
    }

    public final void d() {
        gp.c cVar = new gp.c();
        this.f262972s = cVar;
        try {
            cVar.k(this.f262957d);
            android.media.MediaFormat mediaFormat = null;
            java.lang.String str = null;
            int i17 = 0;
            while (true) {
                if (i17 >= this.f262972s.d()) {
                    i17 = -1;
                    break;
                }
                android.media.MediaFormat e17 = this.f262972s.e(i17);
                java.lang.String string = e17.getString("mime");
                if (string.startsWith("audio/")) {
                    mediaFormat = e17;
                    str = string;
                    break;
                } else {
                    i17++;
                    str = string;
                }
            }
            if (i17 < 0 || mediaFormat == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            this.f262971r = mediaFormat.getInteger("channel-count");
            this.f262970q = mediaFormat.getInteger("sample-rate");
            this.f262972s.i(i17);
            long j17 = this.f262967n;
            if (j17 > 0) {
                this.f262972s.h(j17 * 1000, 0);
            }
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(mediaFormat.getInteger("max-input-size"));
            while (true) {
                allocateDirect.clear();
                int f17 = this.f262972s.f(allocateDirect, 0);
                if (f17 <= 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "muxAudio size = %d. Saw eos.", java.lang.Integer.valueOf(f17));
                    return;
                }
                if (this.f262972s.b() >= this.f262968o * 1000) {
                    return;
                }
                if (this.f262972s.c() != i17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "track index not match! break");
                    return;
                } else {
                    allocateDirect.position(0);
                    com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.writeAACDataLock(this.f262974u, allocateDirect, f17);
                    this.f262972s.a();
                }
            }
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightFFMpegMediaCodecRemuxer", e18, "muxAudio create extractor failed: %s", e18.getMessage());
        }
    }

    public e(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, long j17, long j18) {
        this.f262965l = -1;
        this.f262967n = -1L;
        this.f262968o = -1L;
        this.f262969p = -1;
        this.f262973t = null;
        this.f262978y = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && i17 > 0 && i18 > 0) {
            this.f262957d = str;
            this.f262958e = str2;
            this.f262961h = i17;
            this.f262962i = i18;
            this.f262963j = i19;
            this.f262969p = i27;
            int mp4RotateVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(str);
            this.f262964k = mp4RotateVFS;
            com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
            if (d17 != null) {
                this.f262959f = d17.f162384c;
                this.f262960g = d17.f162385d;
                this.f262966m = d17.f162386e;
            }
            this.f262967n = j17;
            this.f262968o = j18;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s, startTimeMs: %s, endTimeMs: %s", str, str2, java.lang.Integer.valueOf(this.f262959f), java.lang.Integer.valueOf(this.f262960g), java.lang.Integer.valueOf(mp4RotateVFS), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27));
    }
}
