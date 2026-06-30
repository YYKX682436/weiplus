package gs0;

/* loaded from: classes10.dex */
public final class c extends gs0.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.media.MediaFormat mediaFormat, yz5.q frameEncodeCallback, yz5.a frameEncodeEndCallback) {
        super(mediaFormat, frameEncodeCallback, frameEncodeEndCallback);
        kotlin.jvm.internal.o.g(mediaFormat, "mediaFormat");
        kotlin.jvm.internal.o.g(frameEncodeCallback, "frameEncodeCallback");
        kotlin.jvm.internal.o.g(frameEncodeEndCallback, "frameEncodeEndCallback");
        this.f274965c.x();
    }

    @Override // gs0.a
    public void c(byte[] data, long j17, boolean z17) {
        boolean z18;
        kotlin.jvm.internal.o.g(data, "data");
        try {
            synchronized (this.f274970h) {
                if (this.f274967e) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACEncoder", "sendDataToEncoder end now");
                    return;
                }
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                this.f274968f = android.os.SystemClock.elapsedRealtime();
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACEncoder", "sendDataToEncoder, pcmData size:" + data.length + ", pts:" + j17 + ", isLast:" + z17);
                int f17 = this.f274965c.f(100L);
                if (f17 < 0) {
                    d();
                }
                if (f17 >= 0) {
                    java.nio.ByteBuffer byteBuffer = this.f274965c.k()[f17];
                    if (byteBuffer != null) {
                        byteBuffer.clear();
                    }
                    if (byteBuffer != null) {
                        byteBuffer.position(0);
                    }
                    if (byteBuffer != null) {
                        byteBuffer.put(data);
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACEncoder", "last, send EOS and try delay stop encoder");
                        b();
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACEncoder", "EOS received in sendAudioToEncoder");
                        this.f274965c.p(f17, 0, data.length, j17, 4);
                    } else {
                        this.f274965c.p(f17, 0, data.length, j17, 0);
                    }
                }
                d();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecAACEncoder", e17, "", new java.lang.Object[0]);
        }
    }

    public final void d() {
        try {
            synchronized (this.f274970h) {
                if (this.f274967e) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACEncoder", "drainEncoder end now");
                    return;
                }
                android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                while (true) {
                    int g17 = this.f274965c.g(bufferInfo, 100L);
                    if (g17 == -1) {
                        return;
                    }
                    if (g17 == -2) {
                        android.media.MediaFormat o17 = this.f274965c.o();
                        kotlin.jvm.internal.o.f(o17, "getOutputFormat(...)");
                        this.f274966d = o17;
                        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACEncoder", "dstMediaFormat change: %s", o17);
                    } else if (g17 < 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecAACEncoder", "unexpected encoderOutputBufferIndex: %s", java.lang.Integer.valueOf(g17));
                    } else {
                        if ((bufferInfo.flags & 2) != 0) {
                            bufferInfo.size = 0;
                        }
                        java.nio.ByteBuffer byteBuffer = this.f274965c.n()[g17];
                        if (byteBuffer == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecAACEncoder", "ERROR, retrieve encoderOutputBuffer is null!!");
                            return;
                        }
                        if (bufferInfo.size > 0) {
                            a(byteBuffer, bufferInfo);
                        }
                        this.f274965c.s(g17, false);
                        if ((bufferInfo.flags & 4) != 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACEncoder", "receive EOS!");
                            this.f274965c.y();
                            this.f274965c.q();
                            return;
                        }
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecAACEncoder", e17, "drainEncoder error: %s", e17.getMessage());
        }
    }
}
