package fi3;

/* loaded from: classes10.dex */
public class h implements fi3.a {

    /* renamed from: a, reason: collision with root package name */
    public fi3.p f263004a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f263005b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f263006c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f263007d = 0;

    /* renamed from: e, reason: collision with root package name */
    public double f263008e;

    @Override // fi3.a
    public android.graphics.Point a() {
        return new android.graphics.Point(com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.ffmpegGetVideoWidthLock(), com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.ffmpegGetVideoHeightLock());
    }

    @Override // fi3.a
    public void b(fi3.p pVar) {
        this.f263004a = pVar;
    }

    @Override // fi3.a
    public void c(int i17) {
        this.f263008e = i17;
    }

    @Override // fi3.a
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FFMpegTranscodeDecoder", "startDecodeBlockLoop");
        this.f263006c = true;
        this.f263007d = 0;
        while (this.f263006c) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            this.f263005b = com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.ffmpegGetNextVideoFrameDataLock(this.f263005b);
            android.os.SystemClock.elapsedRealtime();
            boolean ffmpegCheckIfReachEndTimestampLock = com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.ffmpegCheckIfReachEndTimestampLock();
            int i17 = this.f263007d + 1;
            this.f263007d = i17;
            fi3.p pVar = this.f263004a;
            if (pVar != null) {
                byte[] bArr = this.f263005b;
                pVar.a(bArr, bArr == null || ffmpegCheckIfReachEndTimestampLock, (long) (i17 * this.f263008e * 1000.0d));
            }
            if (this.f263005b == null || ffmpegCheckIfReachEndTimestampLock) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FFMpegTranscodeDecoder", "ret buffer is null or reachEnd? %s", java.lang.Boolean.valueOf(ffmpegCheckIfReachEndTimestampLock));
                com.tencent.mars.xlog.Log.i("MicroMsg.FFMpegTranscodeDecoder", "decode finish, frame count: %s", java.lang.Integer.valueOf(this.f263007d));
                this.f263006c = false;
                return;
            }
        }
    }

    @Override // fi3.a
    public int e() {
        return 2;
    }

    @Override // fi3.a
    public int f(java.lang.String str, long j17, long j18, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FFMpegTranscodeDecoder", "initDecoder, srcFilePath: %s, start: %s, end: %s, videoFps: %s", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17));
        this.f263008e = 1000.0d / i17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return -1;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int ffmpegOpenAndSeekFileLock = com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.ffmpegOpenAndSeekFileLock(str, j17 * 1000.0d, j18 * 1000.0d);
        com.tencent.mars.xlog.Log.i("MicroMsg.FFMpegTranscodeDecoder", "ffmpegOpenAndSeekFile used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return ffmpegOpenAndSeekFileLock;
    }
}
