package com.tencent.mm.plugin.sight.base;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: b */
    public static final com.tencent.mm.plugin.sight.base.g f162413b = new com.tencent.mm.plugin.sight.base.g(null);

    /* renamed from: c */
    public static final java.lang.Object f162414c = new java.lang.Object();

    /* renamed from: a */
    public final int f162415a;

    public h(int i17) {
        this.f162415a = i17;
    }

    public static final com.tencent.mm.plugin.sight.base.h a(int i17, int i18, int i19, float f17, boolean z17, boolean z18) {
        com.tencent.mm.plugin.sight.base.h hVar;
        synchronized (f162414c) {
            hVar = new com.tencent.mm.plugin.sight.base.h(com.tencent.mm.plugin.sight.base.SightVideoJNI.initDataBufferForCapture(i17, i18, true, i19, f17, z17 ? 5 : 1, 8, 2, 23.0f, 0, 0, true, z17, z18, com.tencent.mm.plugin.sight.base.c.b()));
        }
        return hVar;
    }

    public static /* synthetic */ void e(com.tencent.mm.plugin.sight.base.h hVar, java.nio.ByteBuffer byteBuffer, int i17, long j17, int i18, int i19, int i27, int i28, java.lang.Object obj) {
        hVar.d(byteBuffer, i17, j17, (i28 & 8) != 0 ? -1 : i18, (i28 & 16) != 0 ? -1 : i19, (i28 & 32) != 0 ? -1 : i27);
    }

    public final int b(java.lang.String str, int i17, float f17, boolean z17, int i18, int i19) {
        synchronized (f162414c) {
            try {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                try {
                    int muxVideo = com.tencent.mm.plugin.sight.base.SightVideoJNI.muxVideo(this.f162415a, kk.w.a(str, false), i17, f17, z17, i18, i19);
                    com.tencent.mm.plugin.sight.base.c.f(muxVideo, elapsedRealtime);
                    return muxVideo;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        }
    }

    public final void c() {
        synchronized (f162414c) {
            com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseBigSightDataBuffer(this.f162415a);
        }
    }

    public final void d(java.nio.ByteBuffer byteBuffer, int i17, long j17, int i18, int i19, int i27) {
        synchronized (f162414c) {
            if (i18 == -1 && i19 == -1) {
                if (i27 == -1) {
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.writeAACData(this.f162415a, byteBuffer, i17, j17);
                } else {
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.writeAACDataWithADTS(this.f162415a, byteBuffer, i17, j17, i18, i19, i27);
                }
            }
            com.tencent.mm.plugin.sight.base.SightVideoJNI.writeAACDataWithADTS(this.f162415a, byteBuffer, i17, j17, i18, i19, i27);
        }
    }

    public final void f(long j17) {
        synchronized (f162414c) {
            com.tencent.mm.plugin.sight.base.SightVideoJNI.writeDtsData(this.f162415a, j17);
        }
    }

    public java.lang.String toString() {
        java.lang.String format = java.lang.String.format("bufId:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.f162415a)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
