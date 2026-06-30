package org.webrtc;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001d"}, d2 = {"Lorg/webrtc/PerformanceInspector;", "", "", "resetAll", "Ljz5/f0;", "reset", "", "currentTicks", "notifyAnimationFrameStart", "onBackground", "Lorg/webrtc/PerformanceStatistics;", "performance", "flush", "Ljava/util/concurrent/atomic/AtomicInteger;", "frameCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "lastFrameTick", "J", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "frameTimeRecords", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "lastNFrameTimeTotal", "frameTimeTotal", "jankFrameTimeTotal", "jank", "bigJank", "<init>", "()V", "Companion", "libmmwebrtc_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes13.dex */
public final class PerformanceInspector {
    public static final double BigJankFrameCheckTime = 125.0d;
    public static final int JankCheckFrameCount = 3;
    public static final double JankFrameCheckTime = 83.33333333333333d;
    public static final java.lang.String TAG = "WebRTC.PerformanceInspector";
    private long frameTimeTotal;
    private long jankFrameTimeTotal;
    private long lastFrameTick;
    private long lastNFrameTimeTotal;
    private final java.util.concurrent.atomic.AtomicInteger frameCounter = new java.util.concurrent.atomic.AtomicInteger(-1);
    private final java.util.concurrent.ConcurrentLinkedQueue<java.lang.Long> frameTimeRecords = new java.util.concurrent.ConcurrentLinkedQueue<>();
    private final java.util.concurrent.atomic.AtomicInteger jank = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.util.concurrent.atomic.AtomicInteger bigJank = new java.util.concurrent.atomic.AtomicInteger(0);

    private final long currentTicks() {
        return android.os.SystemClock.elapsedRealtime();
    }

    private final void reset(boolean z17) {
        this.frameTimeTotal = 0L;
        this.jankFrameTimeTotal = 0L;
        this.jank.set(0);
        this.bigJank.set(0);
        if (z17) {
            this.frameCounter.set(-1);
            this.lastNFrameTimeTotal = 0L;
            this.lastFrameTick = 0L;
            this.frameTimeRecords.clear();
        }
    }

    public final void flush(org.webrtc.PerformanceStatistics performance) {
        kotlin.jvm.internal.o.g(performance, "performance");
        performance.jank = this.jank.get();
        performance.bigJank = this.bigJank.get();
        long j17 = this.frameTimeTotal;
        performance.stutter = j17 > 0 ? this.jankFrameTimeTotal / j17 : 0.0d;
        reset(false);
    }

    public final void notifyAnimationFrameStart() {
        long currentTicks = currentTicks();
        if (this.frameCounter.incrementAndGet() == 0) {
            this.lastFrameTick = currentTicks;
            return;
        }
        long j17 = currentTicks - this.lastFrameTick;
        this.frameTimeTotal += j17;
        if (this.frameTimeRecords.size() < 3) {
            this.frameTimeRecords.add(java.lang.Long.valueOf(j17));
            this.lastNFrameTimeTotal += j17;
        } else {
            if (3 * j17 > 2 * this.lastNFrameTimeTotal) {
                double d17 = j17;
                if (d17 > 83.33333333333333d) {
                    this.jank.getAndIncrement();
                    this.jankFrameTimeTotal += j17;
                }
                if (d17 > 125.0d) {
                    this.bigJank.getAndIncrement();
                }
            }
            java.lang.Long front = this.frameTimeRecords.remove();
            this.frameTimeRecords.add(java.lang.Long.valueOf(j17));
            long j18 = this.lastNFrameTimeTotal;
            kotlin.jvm.internal.o.f(front, "front");
            this.lastNFrameTimeTotal = j18 + (j17 - front.longValue());
        }
        this.lastFrameTick = currentTicks;
    }

    public final void onBackground() {
        reset(true);
    }
}
