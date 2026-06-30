package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class f extends java.lang.Thread {
    public static final int A;
    public static final int B;

    /* renamed from: x, reason: collision with root package name */
    public static byte[] f176476x;

    /* renamed from: y, reason: collision with root package name */
    public static byte[] f176477y;

    /* renamed from: z, reason: collision with root package name */
    public static byte[] f176478z;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f176480e;

    /* renamed from: w, reason: collision with root package name */
    public boolean f176495w;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f176481f = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f176483h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f176484i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f176485m = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f176488p = true;

    /* renamed from: q, reason: collision with root package name */
    public int f176489q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f176490r = false;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.g1 f176491s = null;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f176492t = {0, 0, 0, 1};

    /* renamed from: n, reason: collision with root package name */
    public boolean f176486n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f176487o = true;

    /* renamed from: d, reason: collision with root package name */
    public wo.i1 f176479d = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f176482g = false;

    /* renamed from: u, reason: collision with root package name */
    public int f176493u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f176494v = 0;

    static {
        lp0.b.D();
        f176476x = null;
        f176477y = null;
        f176478z = null;
        A = 640;
        B = 480;
    }

    public f(android.view.Surface surface) {
        this.f176495w = false;
        this.f176495w = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_voip_setpriority, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.AvcDecoder", "mSetPriorityFlag: " + this.f176495w);
        if (surface != null) {
            this.f176480e = surface;
        }
    }

    public int a() {
        this.f176489q++;
        com.tencent.mars.xlog.Log.i("MicroMsg.AvcDecoder", "[HW]:DecFrmError: I Req mIReqFlag = " + this.f176488p + ", mIsHWDecEnable = " + this.f176486n + ", mHWErrorDecFrmCount = " + this.f176489q);
        if (!this.f176486n || this.f176489q > 64) {
            if (this.f176482g) {
                this.f176483h = true;
                this.f176491s.b(4, true, false);
            } else {
                this.f176484i = true;
                this.f176491s.b(8, true, false);
            }
            if (this.f176483h && this.f176484i) {
                this.f176487o = false;
            }
            if (this.f176482g) {
                this.f176494v |= 64;
            } else {
                this.f176493u |= 64;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AvcDecoder", "[HW]: ErrFrm > threshold, end HWDec!!");
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(1);
        allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocate.put((byte) 1);
        this.f176491s.f176532x.setAppCmd(28, allocate.array(), 1);
        this.f176488p = true;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0351, code lost:
    
        if (r2 != 39) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0365, code lost:
    
        r2 = 'P';
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0362, code lost:
    
        if (r3 != 6) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(byte[] r22, int r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voip.model.f.b(byte[], int, boolean, boolean):int");
    }

    public void c() {
        if (this.f176479d != null) {
            this.f176485m = false;
        }
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
        return d(bArr).indexOf(d(new byte[]{0, 0, 3}), i17) != -1;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        wo.i1 i1Var;
        while (!java.lang.Thread.interrupted() && this.f176486n) {
            if (this.f176479d != null && this.f176485m && this.f176487o) {
                try {
                    android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                    int g17 = this.f176479d.g(bufferInfo, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                    if (g17 != -3) {
                        if (g17 == -2) {
                            android.media.MediaFormat o17 = this.f176479d.o();
                            com.tencent.mars.xlog.Log.i("MicroMsg.AvcDecoder", "DECODER_THREAD:: New format : " + o17);
                            int integer = o17.getInteger("width");
                            int integer2 = o17.getInteger("height");
                            vq4.b0 b0Var = vq4.b0.f439270a;
                            if (o17.containsKey("crop-left") && o17.containsKey("crop-right")) {
                                integer = (o17.getInteger("crop-right") + 1) - o17.getInteger("crop-left");
                            }
                            if (o17.containsKey("crop-top") && o17.containsKey("crop-bottom")) {
                                integer2 = (o17.getInteger("crop-bottom") + 1) - o17.getInteger("crop-top");
                            }
                            com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176491s;
                            if (g1Var != null) {
                                g1Var.U.post(new com.tencent.mm.plugin.voip.model.p0(g1Var, integer2, integer));
                            }
                        } else if (g17 != -1) {
                            if (bufferInfo.size > 0) {
                                java.lang.System.currentTimeMillis();
                                this.f176479d.s(g17, true);
                                java.lang.System.currentTimeMillis();
                            } else {
                                this.f176479d.s(g17, false);
                            }
                        }
                    }
                } catch (java.lang.Exception e17) {
                    if (this.f176482g) {
                        this.f176494v |= 128;
                    } else {
                        this.f176493u |= 128;
                    }
                    a();
                    com.tencent.mars.xlog.Log.e("MicroMsg.AvcDecoder", " dequeueOutputBuffer/releaseOutputBuffer error:" + e17.toString());
                }
            } else {
                try {
                    java.lang.Thread.sleep(20L);
                } catch (java.lang.InterruptedException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AvcDecoder", " error:" + e18.toString());
                }
            }
        }
        if (this.f176486n || (i1Var = this.f176479d) == null) {
            return;
        }
        try {
            i1Var.y();
            this.f176479d.q();
            this.f176479d = null;
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AvcDecoder", " decoder stop  error:" + e19.toString());
        }
    }
}
