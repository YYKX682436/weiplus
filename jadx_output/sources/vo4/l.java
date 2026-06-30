package vo4;

/* loaded from: classes10.dex */
public final class l extends vo4.b {
    public long A;

    /* renamed from: p, reason: collision with root package name */
    public android.view.Surface f438651p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.SurfaceTexture f438652q;

    /* renamed from: r, reason: collision with root package name */
    public android.media.MediaExtractor f438653r;

    /* renamed from: s, reason: collision with root package name */
    public android.media.MediaCodec f438654s;

    /* renamed from: t, reason: collision with root package name */
    public android.media.MediaFormat f438655t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f438656u;

    /* renamed from: v, reason: collision with root package name */
    public int f438657v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f438658w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f438659x;

    /* renamed from: y, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f438660y;

    /* renamed from: z, reason: collision with root package name */
    public int f438661z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i17, int i18, int i19, com.tencent.mm.plugin.vlog.model.p1 material) {
        super(i17, i18, i19, material, false, 16, null);
        kotlin.jvm.internal.o.g(material, "material");
        this.f438656u = "";
        this.f438657v = -1;
        this.f438660y = new android.media.MediaCodec.BufferInfo();
        this.f438661z = -1;
        this.A = -1L;
    }

    @Override // vo4.b
    public void a(boolean z17) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109 A[EDGE_INSN: B:46:0x0109->B:47:0x0109 BREAK  A[LOOP:0: B:2:0x0007->B:35:0x0007], SYNTHETIC] */
    @Override // vo4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(long r21, boolean r23) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vo4.l.b(long, boolean):void");
    }

    @Override // vo4.b
    public void c() {
        this.f438616o = true;
        this.f438652q = new android.graphics.SurfaceTexture(this.f438602a);
        this.f438651p = new android.view.Surface(this.f438652q);
        com.tencent.mm.plugin.vlog.model.p0 p0Var = this.f438605d;
        int mp4RotateVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(p0Var.f175710c);
        this.f438613l = mp4RotateVFS;
        if (mp4RotateVFS == 90) {
            this.f438613l = 1;
        } else if (mp4RotateVFS == 180) {
            this.f438613l = 2;
        } else if (mp4RotateVFS == 270) {
            this.f438613l = 3;
        }
        android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();
        mediaExtractor.setDataSource(p0Var.f175710c);
        int trackCount = mediaExtractor.getTrackCount();
        int i17 = 0;
        while (true) {
            if (i17 >= trackCount) {
                break;
            }
            android.media.MediaFormat trackFormat = mediaExtractor.getTrackFormat(i17);
            kotlin.jvm.internal.o.f(trackFormat, "getTrackFormat(...)");
            java.lang.String string = trackFormat.getString("mime");
            kotlin.jvm.internal.o.d(string);
            if (r26.i0.y(string, "video", false)) {
                this.f438607f = trackFormat.getInteger("width");
                this.f438608g = trackFormat.getInteger("height");
                java.lang.String string2 = trackFormat.getString("mime");
                kotlin.jvm.internal.o.d(string2);
                this.f438656u = string2;
                this.f438655t = trackFormat;
                this.f438657v = i17;
                break;
            }
            i17++;
        }
        mediaExtractor.release();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepare video, rotate = ");
        sb6.append(this.f438613l);
        sb6.append(", width = ");
        sb6.append(this.f438607f);
        sb6.append(", height = ");
        sb6.append(this.f438608g);
        sb6.append(", startTime = ");
        sb6.append(p0Var.f175708a);
        sb6.append(", endTime = ");
        sb6.append(p0Var.f175709b);
        sb6.append(", videoStartTime = ");
        kotlin.jvm.internal.o.e(p0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoMaterial");
        sb6.append(((com.tencent.mm.plugin.vlog.model.p1) p0Var).f175711d);
        sb6.append(", videoEndTime = ");
        sb6.append(((com.tencent.mm.plugin.vlog.model.p1) p0Var).f175712e);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", sb6.toString());
    }

    @Override // vo4.b
    public void d(long j17) {
        if (this.f438615n) {
            return;
        }
        this.f438615n = true;
        java.lang.System.currentTimeMillis();
        android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();
        this.f438653r = mediaExtractor;
        mediaExtractor.setDataSource(this.f438605d.f175710c);
        android.media.MediaExtractor mediaExtractor2 = this.f438653r;
        if (mediaExtractor2 != null) {
            mediaExtractor2.selectTrack(this.f438657v);
        }
        android.media.MediaExtractor mediaExtractor3 = this.f438653r;
        if (mediaExtractor3 != null) {
            mediaExtractor3.seekTo(g(j17) * 1000, 0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[debug video] play seekTime :");
        sb6.append(g(j17));
        sb6.append(", real seekTime: ");
        android.media.MediaExtractor mediaExtractor4 = this.f438653r;
        sb6.append(mediaExtractor4 != null ? java.lang.Long.valueOf(mediaExtractor4.getSampleTime()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", sb6.toString());
        if (this.f438655t != null) {
            android.media.MediaCodec createDecoderByType = android.media.MediaCodec.createDecoderByType(this.f438656u);
            this.f438654s = createDecoderByType;
            if (createDecoderByType != null) {
                createDecoderByType.configure(this.f438655t, this.f438651p, (android.media.MediaCrypto) null, 0);
            }
            android.media.MediaCodec mediaCodec = this.f438654s;
            if (mediaCodec != null) {
                mediaCodec.start();
            }
        }
        this.A = -1L;
        this.f438661z = -1;
        this.f438658w = false;
        this.f438659x = false;
        java.lang.System.currentTimeMillis();
    }

    @Override // vo4.b
    public void e() {
        this.f438615n = false;
        try {
            android.media.MediaExtractor mediaExtractor = this.f438653r;
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
            android.media.MediaCodec mediaCodec = this.f438654s;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
            android.media.MediaCodec mediaCodec2 = this.f438654s;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
            }
            android.view.Surface surface = this.f438651p;
            if (surface != null) {
                surface.release();
            }
            android.graphics.SurfaceTexture surfaceTexture = this.f438652q;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e17, "release error", new java.lang.Object[0]);
        }
        this.f438651p = null;
        this.f438652q = null;
        this.f438653r = null;
        this.f438654s = null;
        this.f438655t = null;
        this.f438616o = false;
    }

    @Override // vo4.b
    public void f() {
        this.f438615n = false;
        try {
            android.media.MediaCodec mediaCodec = this.f438654s;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
            android.media.MediaCodec mediaCodec2 = this.f438654s;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
            }
            this.f438654s = null;
            android.media.MediaExtractor mediaExtractor = this.f438653r;
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
            this.f438653r = null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e17, "stop error", new java.lang.Object[0]);
        }
    }

    public final long g(long j17) {
        com.tencent.mm.plugin.vlog.model.p0 p0Var = this.f438605d;
        kotlin.jvm.internal.o.e(p0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoMaterial");
        return ((com.tencent.mm.plugin.vlog.model.p1) p0Var).f175711d + j17;
    }
}
