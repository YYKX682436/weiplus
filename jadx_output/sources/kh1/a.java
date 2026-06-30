package kh1;

/* loaded from: classes13.dex */
public class a extends kh1.c {

    /* renamed from: g, reason: collision with root package name */
    public wo.i1 f307970g;

    /* renamed from: h, reason: collision with root package name */
    public android.media.MediaCodec.BufferInfo f307971h;

    @Override // kh1.e
    public void close() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AACAudioEncoder", "close");
        wo.i1 i1Var = this.f307970g;
        if (i1Var != null) {
            i1Var.y();
            this.f307970g.q();
            this.f307970g = null;
        }
        com.tencent.mm.plugin.appbrand.media.encode.M4aAudioFormatJni.closeM4aFile();
    }

    @Override // kh1.e
    public boolean d(boolean z17, byte[] bArr, int i17) {
        if (bArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AACAudioEncoder", "pcm is null");
            return false;
        }
        if (this.f307970g == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AACAudioEncoder", "mEncoder is null");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AACAudioEncoder", "encodePCMToAAC endOfStream:%b", java.lang.Boolean.valueOf(z17));
        java.nio.ByteBuffer[] k17 = this.f307970g.k();
        java.nio.ByteBuffer[] n17 = this.f307970g.n();
        int f17 = this.f307970g.f(100L);
        if (f17 >= 0) {
            java.nio.ByteBuffer byteBuffer = k17[f17];
            byteBuffer.clear();
            byteBuffer.put(bArr);
            byteBuffer.position(0);
            byteBuffer.limit(bArr.length);
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AACAudioEncoder", "inputBufferIndex:%d, data length:%d", java.lang.Integer.valueOf(f17), java.lang.Integer.valueOf(bArr.length));
            if (z17) {
                this.f307970g.p(f17, 0, bArr.length, java.lang.System.nanoTime(), 4);
            } else {
                this.f307970g.p(f17, 0, bArr.length, java.lang.System.nanoTime(), 0);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.AACAudioEncoder", "inputBufferIndex %d", java.lang.Integer.valueOf(f17));
        }
        while (true) {
            int g17 = this.f307970g.g(this.f307971h, 100L);
            if (g17 == -1) {
                return true;
            }
            if (g17 == -3) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Record.AACAudioEncoder", "output buff change");
                n17 = this.f307970g.n();
            } else if (g17 == -2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Record.AACAudioEncoder", "encoder output format changed: " + this.f307970g.o());
            } else if (g17 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Record.AACAudioEncoder", "unexpected result from encoder.dequeueOutputBuffer: %s", java.lang.Integer.valueOf(g17));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Record.AACAudioEncoder", "outputBufferIndex %d", java.lang.Integer.valueOf(g17));
                java.nio.ByteBuffer byteBuffer2 = n17[g17];
                if (byteBuffer2 == null) {
                    throw new java.lang.RuntimeException("outputBuffer " + g17 + " was null");
                }
                android.media.MediaCodec.BufferInfo bufferInfo = this.f307971h;
                if ((bufferInfo.flags & 2) != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Record.AACAudioEncoder", "flags is BUFFER_FLAG_CODEC_CONFIG, don't writ data into file");
                } else {
                    int i18 = bufferInfo.size;
                    byte[] bArr2 = new byte[i18];
                    byteBuffer2.get(bArr2, 0, i18);
                    int writeAudioBuff = com.tencent.mm.plugin.appbrand.media.encode.M4aAudioFormatJni.writeAudioBuff(bArr2, i18);
                    e(bArr2, i18, false);
                    if (writeAudioBuff == 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AACAudioEncoder", "writeAudioBuff buff ok,");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AACAudioEncoder", "writeAudioBuff buff fail,");
                    }
                }
                this.f307970g.s(g17, false);
                if ((this.f307971h.flags & 4) != 0) {
                    if (z17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Record.AACAudioEncoder", "reach the end, and end to encode the data");
                        return true;
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.Record.AACAudioEncoder", "reached end of stream unexpectedly");
                    return true;
                }
            }
        }
    }

    public final void f(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AACAudioEncoder", "initCodec");
        this.f307971h = new android.media.MediaCodec.BufferInfo();
        android.media.MediaFormat createAudioFormat = android.media.MediaFormat.createAudioFormat("audio/mp4a-latm", i17, i18);
        createAudioFormat.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, i19);
        createAudioFormat.setInteger("aac-profile", 2);
        wo.i1 d17 = wo.i1.d("audio/mp4a-latm", false);
        this.f307970g = d17;
        d17.a(createAudioFormat, null, null, 1);
        this.f307970g.x();
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AACAudioEncoder", "encoder start to work");
    }

    @Override // kh1.e
    public void flush() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AACAudioEncoder", "flush");
        e(new byte[0], 0, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    @Override // kh1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean init(java.lang.String r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            java.lang.String r0 = "initCodec"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r1, r2, r3}
            java.lang.String r2 = "MicroMsg.Record.AACAudioEncoder"
            java.lang.String r3 = "init, filePath:%s, sampleRate:%d, channelCount:%d, bitRate:%d"
            com.tencent.mars.xlog.Log.i(r2, r3, r1)
            r1 = -1
            r3 = 0
            r5.f(r7, r8, r9)     // Catch: java.lang.Exception -> L20 java.io.IOException -> L27
            r9 = r3
            goto L2e
        L20:
            r9 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r9, r0, r4)
            goto L2d
        L27:
            r9 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r9, r0, r4)
        L2d:
            r9 = r1
        L2e:
            if (r9 != r1) goto L3b
            java.lang.String r6 = "initCodec  fail,"
            com.tencent.mars.xlog.Log.i(r2, r6)
            r6 = 21
            com.tencent.mm.plugin.appbrand.media.record.o0.a(r6)
            return r3
        L3b:
            java.lang.String r9 = "initCodec ok"
            com.tencent.mars.xlog.Log.i(r2, r9)
            r9 = 2
            int r6 = com.tencent.mm.plugin.appbrand.media.encode.M4aAudioFormatJni.createM4aFile(r6, r8, r7, r9)
            if (r6 != 0) goto L4e
            java.lang.String r6 = "createM4aFile m4a jni api ok,"
            com.tencent.mars.xlog.Log.i(r2, r6)
            r6 = 1
            return r6
        L4e:
            java.lang.String r6 = "createM4aFile m4a jni api fail,"
            com.tencent.mars.xlog.Log.i(r2, r6)
            r6 = 22
            com.tencent.mm.plugin.appbrand.media.record.o0.a(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kh1.a.init(java.lang.String, int, int, int):boolean");
    }
}
