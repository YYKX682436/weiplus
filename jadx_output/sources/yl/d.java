package yl;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f462932a;

    /* renamed from: b, reason: collision with root package name */
    public final java.io.OutputStream f462933b;

    /* renamed from: c, reason: collision with root package name */
    public int f462934c;

    public d(java.lang.String str, int i17, int i18, int i19) {
        this.f462932a = str;
        try {
            java.io.OutputStream K = com.tencent.mm.vfs.w6.K(str, false);
            this.f462933b = K;
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(44);
            allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(1179011410);
            allocate.putInt(0);
            allocate.putInt(1163280727);
            allocate.putInt(544501094);
            int i27 = 16;
            allocate.putInt(16);
            allocate.putShort((short) 1);
            allocate.putShort((short) i17);
            allocate.putInt(i18);
            allocate.putInt(i18 * i17 * (i19 == 2 ? 2 : 1));
            allocate.putShort((short) (i17 * (i19 == 2 ? 2 : 1)));
            if (i19 != 2) {
                i27 = 8;
            }
            allocate.putShort((short) i27);
            allocate.putInt(1635017060);
            allocate.putInt(0);
            this.f462934c = 44;
            K.write(allocate.array());
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PcmWriter", "create file failed: " + e17.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Throwable, java.io.IOException] */
    public void a() {
        try {
            this.f462933b.close();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PcmWriter", "close file failed: " + e17.getMessage());
        }
        int i17 = 0;
        i17 = 0;
        i17 = 0;
        i17 = 0;
        i17 = 0;
        i17 = 0;
        i17 = 0;
        java.io.RandomAccessFile randomAccessFile = null;
        randomAccessFile = null;
        randomAccessFile = null;
        try {
            try {
                randomAccessFile = com.tencent.mm.vfs.w6.B(this.f462932a, true);
                randomAccessFile.seek(4L);
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
                allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                allocate.putInt(this.f462934c - 8);
                randomAccessFile.write(allocate.array());
                allocate.rewind();
                allocate.putInt(this.f462934c - 42);
                randomAccessFile.seek(40L);
                randomAccessFile.write(allocate.array());
                try {
                    randomAccessFile.close();
                    randomAccessFile = randomAccessFile;
                } catch (java.io.IOException e18) {
                    ?? r27 = new java.lang.Object[0];
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PcmWriter", e18, "", r27);
                    i17 = r27;
                    randomAccessFile = e18;
                }
            } catch (java.lang.Throwable th6) {
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (java.io.IOException e19) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PcmWriter", e19, "", new java.lang.Object[i17]);
                    }
                }
                throw th6;
            }
        } catch (java.io.FileNotFoundException e27) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PcmWriter", e27, "", new java.lang.Object[0]);
            randomAccessFile = randomAccessFile;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                    randomAccessFile = randomAccessFile;
                } catch (java.io.IOException e28) {
                    ?? r28 = new java.lang.Object[0];
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PcmWriter", e28, "", r28);
                    i17 = r28;
                    randomAccessFile = e28;
                }
            }
        } catch (java.io.IOException e29) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PcmWriter", e29, "", new java.lang.Object[0]);
            randomAccessFile = randomAccessFile;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                    randomAccessFile = randomAccessFile;
                } catch (java.io.IOException e37) {
                    ?? r29 = new java.lang.Object[0];
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PcmWriter", e37, "", r29);
                    i17 = r29;
                    randomAccessFile = e37;
                }
            }
        }
    }

    public boolean b(byte[] bArr, int i17) {
        java.io.OutputStream outputStream = this.f462933b;
        if (outputStream == null) {
            return false;
        }
        try {
            outputStream.write(bArr, 0, i17);
            this.f462934c += i17;
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PcmWriter", "write to file failed: " + e17.getMessage());
            return false;
        }
    }
}
