package com.tencent.mm.rfx.inner;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.rfx.inner.RfxHardwareDecoder f192237d;

    public d(com.tencent.mm.rfx.inner.RfxHardwareDecoder rfxHardwareDecoder) {
        this.f192237d = rfxHardwareDecoder;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.rfx.inner.RfxVideoSurface rfxVideoSurface;
        android.media.MediaCodec mediaCodec;
        android.media.MediaCodec mediaCodec2;
        com.tencent.mm.rfx.inner.RfxHardwareDecoder rfxHardwareDecoder = this.f192237d;
        try {
            mediaCodec2 = rfxHardwareDecoder.decoder;
            mediaCodec2.stop();
        } catch (java.lang.Exception unused) {
        }
        try {
            mediaCodec = rfxHardwareDecoder.decoder;
            mediaCodec.release();
        } catch (java.lang.Exception unused2) {
        }
        rfxHardwareDecoder.decoder = null;
        rfxVideoSurface = rfxHardwareDecoder.videoSurface;
        rfxVideoSurface.release();
    }
}
