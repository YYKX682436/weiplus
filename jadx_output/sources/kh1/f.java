package kh1;

/* loaded from: classes13.dex */
public class f extends kh1.c {

    /* renamed from: g, reason: collision with root package name */
    public byte[] f307978g;

    /* renamed from: h, reason: collision with root package name */
    public java.io.OutputStream f307979h;

    /* renamed from: i, reason: collision with root package name */
    public int f307980i = 2;

    @Override // kh1.e
    public void close() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MP3AudioEncoder", "close");
        com.tencent.mm.plugin.appbrand.media.encode.Mp3EncodeJni.close();
        java.io.OutputStream outputStream = this.f307979h;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.MP3AudioEncoder", e17, "close", new java.lang.Object[0]);
                com.tencent.mm.plugin.appbrand.media.record.o0.a(20);
            }
            this.f307979h = null;
        }
    }

    @Override // kh1.e
    public boolean d(boolean z17, byte[] bArr, int i17) {
        int i18 = this.f307973b;
        if (i18 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.MP3AudioEncoder", "mMinBufferSize %d is invalid", java.lang.Integer.valueOf(i18));
            return false;
        }
        if (this.f307979h == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.MP3AudioEncoder", "mFileOutputStream is null");
            return false;
        }
        if (this.f307978g == null) {
            int i19 = (int) ((i18 * r2 * 1.25d) + 7200.0d);
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.MP3AudioEncoder", "channelCnt:%d, mMinBufferSize:%d, size:%d, ", java.lang.Integer.valueOf(this.f307980i), java.lang.Integer.valueOf(this.f307973b), java.lang.Integer.valueOf(i19));
            this.f307978g = new byte[i19];
        }
        int i27 = i17 / 2;
        short[] sArr = new short[i27];
        for (int i28 = 0; i28 < i27; i28++) {
            int i29 = i28 * 2;
            sArr[i28] = (short) (((bArr[i29 + 1] & 255) << 8) | (bArr[i29] & 255));
        }
        int encode = com.tencent.mm.plugin.appbrand.media.encode.Mp3EncodeJni.encode(sArr, sArr, i27, this.f307978g);
        if (encode <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.MP3AudioEncoder", "Mp3EncodeJni encode fail, encodedSize:%d", java.lang.Integer.valueOf(encode));
            return false;
        }
        try {
            this.f307979h.write(this.f307978g, 0, encode);
            e(this.f307978g, encode, false);
            return true;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.MP3AudioEncoder", e17, "encode write", new java.lang.Object[0]);
            com.tencent.mm.plugin.appbrand.media.record.o0.a(20);
            return false;
        }
    }

    @Override // kh1.e
    public void flush() {
        byte[] bArr;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MP3AudioEncoder", "flush");
        if (this.f307979h == null || (bArr = this.f307978g) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.MP3AudioEncoder", "flush, mFileOutputStream or mMp3Buffer is null");
            return;
        }
        int flush = com.tencent.mm.plugin.appbrand.media.encode.Mp3EncodeJni.flush(bArr);
        if (flush <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.MP3AudioEncoder", "flush fail, flushResult:%d", java.lang.Integer.valueOf(flush));
            return;
        }
        try {
            this.f307979h.write(this.f307978g, 0, flush);
            e(this.f307978g, flush, true);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.MP3AudioEncoder", e17, "flush write", new java.lang.Object[0]);
            com.tencent.mm.plugin.appbrand.media.record.o0.a(20);
        }
    }

    @Override // kh1.e
    public boolean init(java.lang.String str, int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MP3AudioEncoder", "init, filePath:%s, sampleRate:%d, channelCount:%d, bitRate:%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f307980i = i18;
        int init = com.tencent.mm.plugin.appbrand.media.encode.Mp3EncodeJni.init(i17, i18, i17, i19 / 1000, 5);
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MP3AudioEncoder", "Mp3EncodeJni.init ret :%d", java.lang.Integer.valueOf(init));
        if (init == -1) {
            com.tencent.mm.plugin.appbrand.media.record.o0.a(17);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MP3AudioEncoder", "lame MPEG version:%d", java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.media.encode.Mp3EncodeJni.getVersion()));
        try {
            this.f307979h = com.tencent.mm.vfs.w6.K(str, false);
            return true;
        } catch (java.io.FileNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.MP3AudioEncoder", e17, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, new java.lang.Object[0]);
            com.tencent.mm.plugin.appbrand.media.record.o0.a(18);
            return false;
        }
    }
}
