package ph3;

/* loaded from: classes14.dex */
public class p extends ph3.i {
    public boolean A;
    public long B;
    public float C;
    public long D;

    /* renamed from: w, reason: collision with root package name */
    public android.view.Surface f354456w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f354457x;

    /* renamed from: y, reason: collision with root package name */
    public int f354458y;

    /* renamed from: z, reason: collision with root package name */
    public int f354459z;

    public p(ph3.h hVar, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        super(hVar, n3Var);
        this.f354457x = false;
        this.A = false;
        this.B = 0L;
        this.C = 1.0f;
        this.D = -1L;
    }

    @Override // ph3.i
    public ph3.g b(java.lang.String str) {
        return null;
    }

    @Override // ph3.i
    public void g(android.media.MediaFormat mediaFormat, java.lang.String str, int i17) {
        int mp4RotateVFS;
        boolean z17;
        super.g(mediaFormat, str, i17);
        this.f354459z = mediaFormat.getInteger("height");
        this.f354458y = mediaFormat.getInteger("width");
        if (mediaFormat.containsKey("rotation-degrees")) {
            mp4RotateVFS = mediaFormat.getInteger("rotation-degrees");
            z17 = true;
        } else {
            mp4RotateVFS = ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).getMp4RotateVFS(this.f354404d);
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoTrackDataSource", "%s it don't contains rotation key. degrees [%d]", i(), java.lang.Integer.valueOf(mp4RotateVFS));
            z17 = false;
        }
        if (java.lang.Math.abs(mp4RotateVFS) == 90 || java.lang.Math.abs(mp4RotateVFS) == 270) {
            int i18 = this.f354458y;
            this.f354458y = this.f354459z;
            this.f354459z = i18;
        }
        int i19 = z17 ? 0 : mp4RotateVFS;
        this.f354403c.obtainMessage(4, this.f354458y, this.f354459z, java.lang.Integer.valueOf(i19)).sendToTarget();
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTrackDataSource", "%s video size[%d, %d] degrees[%d]", i(), java.lang.Integer.valueOf(this.f354458y), java.lang.Integer.valueOf(this.f354459z), java.lang.Integer.valueOf(i19));
    }

    @Override // ph3.i
    public boolean h(wo.i1 i1Var) {
        int i17;
        if (i1Var == null) {
            return false;
        }
        if (this.f354456w == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoTrackDataSource", "%s decoder configure surface but surface is null.", i());
            this.f354457x = false;
        } else {
            this.f354457x = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTrackDataSource", "%s handleDecoderBeforeStart", i());
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTrackDataSource", "%s before prepare init decoder, surface valid: %s", i(), java.lang.Boolean.valueOf(this.f354456w.isValid()));
        gp.c cVar = this.f354414n;
        i1Var.a((cVar == null || (i17 = this.f354412l) <= -1) ? this.f354409i : cVar.e(i17), this.f354456w, null, 0);
        this.B = 0L;
        return false;
    }

    @Override // ph3.i
    public boolean n(long j17, long j18, wo.i1 i1Var, java.nio.ByteBuffer byteBuffer, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
        i();
        long j19 = bufferInfo.presentationTimeUs;
        if (this.f354401a == 10) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoTrackDataSource", "%s video track flush surface", i());
            i1Var.s(i17, true);
            t(4);
            return true;
        }
        if (this.f354401a == 6) {
            long j27 = j17 - (bufferInfo.presentationTimeUs / 1000);
            i();
            if (j27 <= 30) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoTrackDataSource", "%s precision seek done to surface", i());
                i1Var.s(i17, true);
                if (this.A) {
                    t(7);
                    this.A = false;
                }
                this.A = true;
            } else {
                i1Var.s(i17, false);
            }
            return true;
        }
        int i18 = this.f354401a;
        if (!(i18 == 3 || i18 == 5 || i18 == 7)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoTrackDataSource", "%s it no need process buffer now state %d", i(), java.lang.Integer.valueOf(this.f354401a));
            return false;
        }
        long j28 = bufferInfo.presentationTimeUs / 1000;
        long elapsedRealtime = ((((float) j28) / this.C) - ((float) j17)) - ((float) (android.os.SystemClock.elapsedRealtime() - j18));
        i();
        if (elapsedRealtime < -30) {
            i();
            i1Var.s(i17, false);
            this.f354402b.f354393h = 0L;
            return true;
        }
        if (elapsedRealtime >= 30) {
            i();
            return false;
        }
        this.f354402b.f354390e = bufferInfo.presentationTimeUs;
        if (elapsedRealtime > 11) {
            try {
                java.lang.Thread.sleep(elapsedRealtime - 10);
            } catch (java.lang.Exception unused) {
            }
        }
        int i19 = this.f354401a;
        if (!(i19 == 3 || i19 == 5 || i19 == 7)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoTrackDataSource", "%s it no need process buffer now state %d", i(), java.lang.Integer.valueOf(this.f354401a));
            return false;
        }
        if (java.lang.Math.abs(j28 - this.B) > 1000 || this.B <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoTrackDataSource", "%s finish to process index[%d] time[%d] to surface", i(), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j28));
            this.B = j28;
        }
        i1Var.s(i17, true);
        return true;
    }

    @Override // ph3.i
    public boolean r(int i17, long j17) {
        i();
        ph3.h hVar = this.f354402b;
        boolean z17 = hVar.f354394i;
        if (!hVar.f354394i || i17 != 1 || this.D == j17) {
            return false;
        }
        boolean a17 = a(j17, -1L);
        this.D = j17;
        return a17;
    }

    @Override // ph3.i
    public java.lang.String u() {
        return "video";
    }

    public final void v() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTrackDataSource", "%s change surface below 23", i());
        if (this.f354415o != null) {
            p();
            ph3.h hVar = this.f354402b;
            a(hVar.f354390e, -1L);
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s start to prepare decoder mime[%s]", i(), this.f354410j);
                wo.i1 c17 = wo.i1.c(this.f354410j);
                this.f354415o = c17;
                h(c17);
                this.f354415o.x();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TrackDataSource", e17, "%s prepare decoder init decoder error ", i());
                hVar.d("video");
            }
        }
    }
}
