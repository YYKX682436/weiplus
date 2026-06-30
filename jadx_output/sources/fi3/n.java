package fi3;

/* loaded from: classes10.dex */
public class n extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public volatile int f263045e;

    /* renamed from: f, reason: collision with root package name */
    public int f263046f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f263047g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f263048h = new java.lang.Object();

    public n(fi3.o oVar, fi3.m mVar) {
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "MediaCodecFFMpegTranscoder_Encoder";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f263046f == -1) {
            this.f263046f = android.os.Process.myTid();
            android.os.Process.setThreadPriority(android.os.Process.myTid(), -2);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxX264Encoder", "encodeTid: %s", java.lang.Integer.valueOf(this.f263046f));
        }
        this.f263045e = 0;
        synchronized (this.f263048h) {
            while (!this.f263047g) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxX264Encoder", "try trigger encode");
                int triggerEncodeForSegmentLock = com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.triggerEncodeForSegmentLock(java.lang.Math.max(0, this.f263045e), false);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxX264Encoder", "ing: trigger encode use %dms, Encode index[%d, %d), threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(this.f263045e), java.lang.Integer.valueOf(triggerEncodeForSegmentLock), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                if (triggerEncodeForSegmentLock == this.f263045e) {
                    try {
                        java.lang.Thread.sleep(10L);
                    } catch (java.lang.Exception unused) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMSightRemuxX264Encoder", "thread sleep error");
                    }
                }
                this.f263045e = triggerEncodeForSegmentLock;
            }
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            this.f263045e = com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.triggerEncodeForSegmentLock(this.f263045e, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxX264Encoder", "end: trigger encode use %dms, curEncode index %d, threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2), java.lang.Integer.valueOf(this.f263045e), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        }
    }
}
