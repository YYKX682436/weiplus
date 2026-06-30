package fi3;

/* loaded from: classes10.dex */
public class g extends bi3.b {

    /* renamed from: b, reason: collision with root package name */
    public fi3.a f262980b;

    /* renamed from: c, reason: collision with root package name */
    public fi3.o f262981c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f262982d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f262983e;

    /* renamed from: f, reason: collision with root package name */
    public final int f262984f;

    /* renamed from: g, reason: collision with root package name */
    public final int f262985g;

    /* renamed from: h, reason: collision with root package name */
    public final int f262986h;

    /* renamed from: i, reason: collision with root package name */
    public final int f262987i;

    /* renamed from: j, reason: collision with root package name */
    public final int f262988j;

    /* renamed from: k, reason: collision with root package name */
    public final int f262989k;

    /* renamed from: l, reason: collision with root package name */
    public final int f262990l;

    /* renamed from: m, reason: collision with root package name */
    public final int f262991m;

    /* renamed from: n, reason: collision with root package name */
    public final long f262992n;

    /* renamed from: o, reason: collision with root package name */
    public final long f262993o;

    /* renamed from: p, reason: collision with root package name */
    public final int f262994p;

    /* renamed from: q, reason: collision with root package name */
    public int f262995q;

    /* renamed from: r, reason: collision with root package name */
    public int f262996r;

    /* renamed from: s, reason: collision with root package name */
    public final int f262997s;

    /* renamed from: t, reason: collision with root package name */
    public final int f262998t;

    /* renamed from: u, reason: collision with root package name */
    public gp.c f262999u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Point f263000v;

    /* renamed from: w, reason: collision with root package name */
    public int f263001w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Bitmap f263002x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f263003y;

    public g(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f262990l = -1;
        this.f262992n = -1L;
        this.f262993o = -1L;
        this.f262994p = -1;
        this.f263000v = null;
        this.f263003y = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && i17 > 0 && i18 > 0) {
            this.f262982d = str;
            this.f262983e = str2;
            this.f262986h = i17;
            this.f262987i = i18;
            this.f262988j = i19;
            this.f262994p = i27;
            this.f262997s = i28;
            this.f262998t = i29;
            int mp4RotateVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(str);
            this.f262989k = mp4RotateVFS;
            com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
            if (d17 != null) {
                this.f262984f = d17.f162384c;
                this.f262985g = d17.f162385d;
                this.f262990l = d17.f162382a;
                this.f262991m = d17.f162386e;
            }
            this.f262992n = 0L;
            this.f262993o = this.f262990l;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegX264Remuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s", str, str2, java.lang.Integer.valueOf(this.f262984f), java.lang.Integer.valueOf(this.f262985g), java.lang.Integer.valueOf(mp4RotateVFS), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27));
    }

    @Override // bi3.b
    public int a() {
        return 3;
    }

    @Override // bi3.b
    public int b() {
        int f17;
        int i17;
        int round = java.lang.Math.round(this.f262990l / 1000.0f);
        long j17 = this.f262992n;
        if (j17 >= 0) {
            long j18 = this.f262993o;
            if (j18 >= 0) {
                round = java.lang.Math.round(((float) (j18 - j17)) / 1000.0f) + 1;
            }
        }
        this.f263001w = com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.initDataBufLock(round);
        if (com.tencent.mm.modelvideoh265toh264.j.h(this.f262982d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegX264Remuxer", "ish265, create mediacodec decoder");
            this.f262980b = new fi3.j();
        } else {
            this.f262980b = new fi3.h();
        }
        int i18 = this.f262990l;
        if (i18 <= 0) {
            long j19 = this.f262992n;
            if (j19 >= 0) {
                long j27 = this.f262993o;
                if (j27 >= 0) {
                    f17 = this.f262980b.f(this.f262982d, j19, j27, this.f262991m);
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegX264Remuxer", "remux time error, videoDuration: %s, remuxStartTime: %s, remuxEndTime: %s", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(this.f262992n), java.lang.Long.valueOf(this.f262993o));
            com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.releaseDataBufLock(this.f263001w);
            return -1;
        }
        f17 = this.f262980b.f(this.f262982d, 0L, i18, this.f262991m);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegX264Remuxer", "decoder init ret: %s", java.lang.Integer.valueOf(f17));
        if (f17 < 0) {
            com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.releaseDataBufLock(this.f263001w);
            return -1;
        }
        int i19 = this.f262994p;
        if (i19 > 0 && i19 < (i17 = this.f262991m)) {
            this.f262980b.c((int) java.lang.Math.ceil(i17 / i19));
        }
        int i27 = this.f262994p;
        int min = i27 > 0 ? java.lang.Math.min(i27, this.f262991m) : this.f262991m;
        this.f262980b.b(new fi3.f(this));
        int i28 = this.f262984f;
        int i29 = this.f262985g;
        int i37 = this.f262986h;
        int i38 = this.f262987i;
        int i39 = this.f262988j;
        int i47 = com.tencent.mm.plugin.sight.base.d.f162407b;
        int i48 = this.f262997s;
        int i49 = this.f262998t;
        fi3.o oVar = new fi3.o(i28, i29, i37, i38, i39, min, 2, i47, i48, i49);
        this.f262981c = oVar;
        oVar.f263054f = 0;
        com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.initH264EncoderLock(i37, i38, min, i39, i47, 8, 2, 23.0f, i48, i49);
        oVar.f263049a = new fi3.n(oVar, null);
        ku5.u0 u0Var = ku5.t0.f312615d;
        fi3.n nVar = new fi3.n(oVar, null);
        oVar.f263049a = nVar;
        ((ku5.t0) u0Var).q(nVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxX264Encoder", "initAndStartEncoder");
        try {
            this.f262980b.d();
            fi3.n nVar2 = this.f262981c.f263049a;
            if (nVar2 != null) {
                nVar2.f263047g = true;
                try {
                    java.util.concurrent.Future future = nVar2.f449841d;
                    if (future != null && !future.isCancelled()) {
                        nVar2.f449841d.get();
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightRemuxX264Encoder", e17, "waitEncoderFinish, join error: %s", e17.getMessage());
                }
            }
            d();
            java.lang.String str = this.f262983e;
            if (this.f262989k > 0) {
                str = str + "tempRotate.mp4";
            }
            long j28 = this.f262990l;
            if (j28 <= 0) {
                j28 = this.f262993o - this.f262992n;
            }
            int muxingForX264Lock = com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.muxingForX264Lock(this.f262995q, 1024, 2, this.f262996r, str, (this.f262981c.f263054f * 1000.0f) / ((float) j28), (int) j28, null, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegX264Remuxer", "muxing ret: %s", java.lang.Integer.valueOf(muxingForX264Lock));
            int i57 = this.f262989k;
            if (i57 > 0) {
                com.tencent.mm.plugin.sight.base.SightVideoJNI.tagRotateVideoVFS(str, this.f262983e, i57);
                com.tencent.mm.vfs.w6.h(str);
            }
            com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.releaseDataBufLock(this.f263001w);
            ei3.x.f253187d.c();
            return muxingForX264Lock;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightFFMpegX264Remuxer", e18, "decode error: %s", e18.getMessage());
            return -1;
        }
    }

    @Override // bi3.b
    public void c(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            this.f263002x = bitmap;
        }
    }

    public final void d() {
        gp.c cVar = new gp.c();
        this.f262999u = cVar;
        try {
            cVar.k(this.f262982d);
            android.media.MediaFormat mediaFormat = null;
            java.lang.String str = null;
            int i17 = 0;
            while (true) {
                if (i17 >= this.f262999u.d()) {
                    i17 = -1;
                    break;
                }
                android.media.MediaFormat e17 = this.f262999u.e(i17);
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
            this.f262996r = mediaFormat.getInteger("channel-count");
            this.f262995q = mediaFormat.getInteger("sample-rate");
            this.f262999u.i(i17);
            long j17 = this.f262992n;
            if (j17 > 0) {
                this.f262999u.h(j17 * 1000, 0);
            }
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(mediaFormat.getInteger("max-input-size"));
            while (true) {
                allocateDirect.clear();
                int f17 = this.f262999u.f(allocateDirect, 0);
                if (f17 <= 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegX264Remuxer", "muxAudio size = %d. Saw eos.", java.lang.Integer.valueOf(f17));
                    return;
                }
                if (this.f262999u.b() >= this.f262993o * 1000) {
                    return;
                }
                if (this.f262999u.c() != i17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegX264Remuxer", "track index not match! break");
                    return;
                } else {
                    allocateDirect.position(0);
                    com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.writeAACDataLock(this.f263001w, allocateDirect, f17);
                    this.f262999u.a();
                }
            }
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightFFMpegX264Remuxer", e18, "muxAudio create extractor failed: %s", e18.getMessage());
        }
    }

    public g(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, long j17, long j18, int i28, int i29) {
        this.f262990l = -1;
        this.f262992n = -1L;
        this.f262993o = -1L;
        this.f262994p = -1;
        this.f263000v = null;
        this.f263003y = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && i17 > 0 && i18 > 0) {
            this.f262982d = str;
            this.f262983e = str2;
            this.f262986h = i17;
            this.f262987i = i18;
            this.f262988j = i19;
            this.f262994p = i27;
            this.f262997s = i28;
            this.f262998t = i29;
            int mp4RotateVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(str);
            this.f262989k = mp4RotateVFS;
            com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
            if (d17 != null) {
                this.f262984f = d17.f162384c;
                this.f262985g = d17.f162385d;
                this.f262991m = d17.f162386e;
            }
            this.f262992n = j17;
            this.f262993o = j18;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegX264Remuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s, startTimeMs: %s, endTimeMs: %s", str, str2, java.lang.Integer.valueOf(this.f262984f), java.lang.Integer.valueOf(this.f262985g), java.lang.Integer.valueOf(mp4RotateVFS), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27));
    }
}
