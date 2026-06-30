package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class e0 extends java.lang.Thread {

    /* renamed from: v, reason: collision with root package name */
    public static byte[] f149914v;

    /* renamed from: w, reason: collision with root package name */
    public static byte[] f149915w;

    /* renamed from: x, reason: collision with root package name */
    public static byte[] f149916x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f149917y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f149918z;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f149920e;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.model.d0 f149933u;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f149921f = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f149923h = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f149926n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f149927o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f149928p = {0, 0, 0, 1};

    /* renamed from: q, reason: collision with root package name */
    public int f149929q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f149930r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f149931s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f149932t = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f149924i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f149925m = true;

    /* renamed from: d, reason: collision with root package name */
    public wo.i1 f149919d = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f149922g = false;

    static {
        lp0.b.D();
        f149914v = null;
        f149915w = null;
        f149916x = null;
        f149917y = 640;
        f149918z = 480;
    }

    public e0(android.view.Surface surface) {
        if (surface != null) {
            this.f149920e = surface;
        }
    }

    public int a() {
        this.f149927o++;
        com.tencent.mars.xlog.Log.i("MeidaCodec[HWDec]", "[HW]:DecFrmError: I Req mIReqFlag = " + this.f149926n + ", mIsHWDecEnable = " + this.f149924i + ", mHWErrorDecFrmCount = " + this.f149927o);
        if (this.f149924i && this.f149927o <= 10) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(1);
            allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocate.put((byte) 1);
            this.f149926n = true;
            return 1;
        }
        int i17 = this.f149922g ? 16 : 8;
        java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(6);
        allocate2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocate2.putShort((short) 0);
        allocate2.putShort((short) i17);
        allocate2.putShort((short) 0);
        this.f149924i = false;
        this.f149925m = false;
        this.f149927o = 0;
        com.tencent.mars.xlog.Log.i("MeidaCodec[HWDec]", "[HW]: ErrFrm > threshold, end HWDec!!");
        return 0;
    }

    public final long b(byte[] bArr) {
        long c17 = c(bArr);
        long j17 = (1 + c17) >> 1;
        return c17 % 2 == 0 ? -j17 : j17;
    }

    public final long c(byte[] bArr) {
        int i17;
        long j17 = 0;
        long j18 = 0;
        while (true) {
            i17 = this.f149930r;
            if (i17 >= (this.f149929q << 3) || (bArr[i17 >> 3] & (128 >> (i17 & 7))) != 0) {
                break;
            }
            j18++;
            this.f149930r = i17 + 1;
        }
        this.f149930r = i17 + 1;
        for (int i18 = 0; i18 < j18; i18++) {
            j17 <<= 1;
            int i19 = this.f149930r;
            if ((bArr[i19 >> 3] & (128 >> (i19 & 7))) != 0) {
                j17++;
            }
            this.f149930r = i19 + 1;
        }
        return ((1 << ((int) j18)) - 1) + j17;
    }

    public java.lang.String d(byte[] bArr) {
        java.lang.String str = "";
        for (byte b17 : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            str = str + hexString;
        }
        return str;
    }

    public boolean e(byte[] bArr, int i17) {
        this.f149930r = 0;
        f(1L, bArr);
        f(2L, bArr);
        if (f(5L, bArr) != 7) {
            return false;
        }
        long f17 = f(8L, bArr);
        f(1L, bArr);
        f(1L, bArr);
        f(1L, bArr);
        f(1L, bArr);
        f(4L, bArr);
        f(8L, bArr);
        c(bArr);
        if (f17 == 100 || f17 == 110 || f17 == 122 || f17 == 144) {
            if (c(bArr) == 3) {
                f(1L, bArr);
            }
            c(bArr);
            c(bArr);
            f(1L, bArr);
            long[] jArr = new long[8];
            if (f(1L, bArr) != 0) {
                for (int i18 = 0; i18 < 8; i18++) {
                    jArr[i18] = f(1L, bArr);
                }
            }
        }
        c(bArr);
        long c17 = c(bArr);
        if (c17 == 0) {
            c(bArr);
        } else if (c17 == 1) {
            f(1L, bArr);
            b(bArr);
            b(bArr);
            int c18 = (int) c(bArr);
            long[] jArr2 = new long[c18];
            for (int i19 = 0; i19 < c18; i19++) {
                jArr2[i19] = b(bArr);
            }
        }
        c(bArr);
        f(1L, bArr);
        int c19 = ((int) (c(bArr) + 1)) * 16;
        int c27 = ((int) (c(bArr) + 1)) * 16;
        com.tencent.mars.xlog.Log.i("MeidaCodec[HWDec]", "newWidth[%d], newHeight[%d]", java.lang.Integer.valueOf(c19), java.lang.Integer.valueOf(c27));
        if (c19 == this.f149931s && c27 == this.f149932t) {
            return true;
        }
        this.f149931s = c19;
        this.f149932t = c27;
        com.tencent.mm.plugin.multitalk.model.d0 d0Var = this.f149933u;
        if (d0Var == null) {
            return true;
        }
        com.tencent.mm.plugin.multitalk.model.b3 b3Var = ((com.tencent.mm.plugin.multitalk.model.m3) d0Var).f150046a;
        b3Var.f149894g = c19;
        b3Var.f149895h = c27;
        return true;
    }

    public final long f(long j17, byte[] bArr) {
        long j18 = 0;
        int i17 = 0;
        while (true) {
            boolean z17 = ((long) i17) < j17;
            int i18 = this.f149930r;
            if (!z17 || !(i18 < (this.f149929q << 3))) {
                return j18;
            }
            j18 <<= 1;
            if ((bArr[i18 >> 3] & (128 >> (i18 & 7))) != 0) {
                j18++;
            }
            this.f149930r = i18 + 1;
            i17++;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        wo.i1 i1Var;
        while (!java.lang.Thread.interrupted() && this.f149924i) {
            if (this.f149919d != null && this.f149923h && this.f149925m) {
                try {
                    android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                    int g17 = this.f149919d.g(bufferInfo, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                    if (g17 != -3) {
                        if (g17 == -2) {
                            android.media.MediaFormat o17 = this.f149919d.o();
                            com.tencent.mars.xlog.Log.i("MeidaCodec[HWDec]", "DECODER_THREAD:: New format : " + o17);
                            o17.getInteger("width");
                            o17.getInteger("height");
                        } else if (g17 != -1) {
                            if (bufferInfo.size > 0) {
                                java.lang.System.currentTimeMillis();
                                this.f149919d.s(g17, true);
                                java.lang.System.currentTimeMillis();
                            } else {
                                this.f149919d.s(g17, false);
                            }
                        }
                    }
                } catch (java.lang.Exception e17) {
                    this.f149924i = false;
                    a();
                    com.tencent.mars.xlog.Log.e("MeidaCodec[HWDec]", " dequeueOutputBuffer/releaseOutputBuffer error:" + e17.toString());
                }
            } else {
                try {
                    java.lang.Thread.sleep(20L);
                } catch (java.lang.InterruptedException e18) {
                    com.tencent.mars.xlog.Log.e("MeidaCodec[HWDec]", " error:" + e18.toString());
                }
            }
        }
        if (this.f149924i || (i1Var = this.f149919d) == null) {
            return;
        }
        try {
            i1Var.y();
            this.f149919d.q();
            this.f149919d = null;
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MeidaCodec[HWDec]", " decoder stop  error:" + e19.toString());
        }
    }
}
