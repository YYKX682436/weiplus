package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class g0 {
    public static final int A;
    public static final java.lang.String[] B;

    /* renamed from: y, reason: collision with root package name */
    public static int f149958y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f149959z;

    /* renamed from: a, reason: collision with root package name */
    public int f149960a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f149961b;

    /* renamed from: c, reason: collision with root package name */
    public wo.i1 f149962c;

    /* renamed from: d, reason: collision with root package name */
    public android.media.MediaFormat f149963d;

    /* renamed from: e, reason: collision with root package name */
    public int f149964e;

    /* renamed from: f, reason: collision with root package name */
    public int f149965f;

    /* renamed from: g, reason: collision with root package name */
    public int f149966g;

    /* renamed from: h, reason: collision with root package name */
    public int f149967h;

    /* renamed from: i, reason: collision with root package name */
    public final int f149968i;

    /* renamed from: j, reason: collision with root package name */
    public int f149969j;

    /* renamed from: k, reason: collision with root package name */
    public int f149970k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f149971l;

    /* renamed from: m, reason: collision with root package name */
    public long f149972m;

    /* renamed from: n, reason: collision with root package name */
    public long f149973n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f149974o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f149975p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.x f149976q;

    /* renamed from: r, reason: collision with root package name */
    public int f149977r;

    /* renamed from: s, reason: collision with root package name */
    public int f149978s;

    /* renamed from: t, reason: collision with root package name */
    public int f149979t;

    /* renamed from: u, reason: collision with root package name */
    public int f149980u;

    /* renamed from: v, reason: collision with root package name */
    public int f149981v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.model.f0 f149982w;

    /* renamed from: x, reason: collision with root package name */
    public int f149983x;

    static {
        lp0.b.D();
        f149959z = 18;
        A = 19;
        B = new java.lang.String[]{"OMX.qcom.", "OMX.Exynos.", "OMX.hisi", "OMX.MTK", "OMX.sprd", "c2.exynos", "c2.qti", "c2.mtk", "c2.unisoc"};
    }

    public g0(int i17, int i18, int i19, int i27, int i28, java.lang.String str) {
        this.f149960a = 0;
        this.f149961b = "video/avc";
        this.f149968i = 1;
        this.f149971l = null;
        this.f149972m = 0L;
        this.f149973n = 0L;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f149974o = linkedList;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        this.f149975p = linkedList2;
        this.f149976q = null;
        this.f149977r = 0;
        this.f149978s = 8;
        this.f149979t = 0;
        this.f149980u = 0;
        this.f149981v = 0;
        this.f149983x = 0;
        com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "anlingao[multi_hw] MultiAvcEncoder width[%d], height[%d], framerate[%d], bitrate[%d], profileCfg[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), str);
        this.f149964e = i17;
        this.f149965f = i18;
        this.f149969j = i17;
        this.f149970k = i18;
        this.f149961b = str;
        this.f149966g = i19;
        this.f149967h = i27;
        this.f149968i = i28;
        f149958y = 0;
        this.f149972m = 0L;
        this.f149982w = new com.tencent.mm.plugin.multitalk.model.f0(this);
        this.f149962c = null;
        this.f149978s = 8;
        this.f149977r = 0;
        this.f149979t = 0;
        this.f149960a = 0;
        r45.hv3 hv3Var = new r45.hv3();
        hv3Var.f376467d = 1L;
        hv3Var.f376468e = 24;
        hv3Var.f376469f = 1L;
        hv3Var.f376470g = 24;
        hv3Var.f376471h = 0L;
        hv3Var.f376472i = 0;
        linkedList.add(hv3Var);
        linkedList2.add(0);
        this.f149971l = null;
        this.f149980u = 0;
        this.f149981v = 0;
        this.f149973n = 0L;
        try {
            d();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MultiAvcEncoder[HWEnc]", "mediacodec init error: " + e17.getMessage());
            this.f149960a = 2003;
        }
    }

    public int a(int i17, boolean z17, boolean z18, boolean z19) {
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.e("MultiAvcEncoder[HWEnc]", "Error targetCodec: " + i17);
            return -1;
        }
        com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "closecodec: targetCodec: " + i17 + "localClose: " + z17 + "remoteClose: " + z18 + "isEncoderTag: " + z19);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(6);
        allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) 2);
        allocate.putShort((short) i17);
        allocate.putShort((short) 0);
        return 1;
    }

    public int b(byte[] bArr, int i17, int i18, int i19) {
        byte[] bArr2;
        int i27;
        int i28;
        java.lang.String str;
        java.nio.ByteBuffer[] byteBufferArr;
        long j17;
        int i29;
        int i37;
        int i38;
        int i39;
        int i47;
        int i48;
        e(this.f149967h);
        com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "anlingao[multi_hw] m_CapW[%d], m_CapH[%d], w[%d], h[%d], m_width[%d], m_height[%d]", java.lang.Integer.valueOf(this.f149969j), java.lang.Integer.valueOf(this.f149970k), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f149964e), java.lang.Integer.valueOf(this.f149965f));
        if (i17 != this.f149969j || i18 != this.f149970k) {
            this.f149969j = i17;
            this.f149970k = i18;
            this.f149971l = new byte[((i17 * i18) * 3) / 2];
        }
        if (this.f149971l == null) {
            this.f149971l = new byte[((this.f149969j * this.f149970k) * 3) / 2];
        }
        com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "anlingao[multi_hw] m_CapW[%d], m_CapH[%d], w[%d], h[%d], m_width[%d], m_height[%d]", java.lang.Integer.valueOf(this.f149969j), java.lang.Integer.valueOf(this.f149970k), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f149964e), java.lang.Integer.valueOf(this.f149965f));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("steve: m_framerate: ");
        sb6.append(this.f149966g);
        sb6.append(", m_br_kbps:");
        sb6.append(this.f149967h);
        sb6.append(", format:");
        sb6.append(i19);
        sb6.append(", cSkipFlag:");
        com.tencent.mm.plugin.multitalk.model.f0 f0Var = this.f149982w;
        sb6.append((int) f0Var.f149949d);
        sb6.append(", m_width:");
        sb6.append(this.f149964e);
        sb6.append(", m_height:");
        sb6.append(this.f149965f);
        sb6.append(", w:");
        sb6.append(i17);
        sb6.append(", h:");
        sb6.append(i18);
        sb6.append(", rawFrame:");
        sb6.append(bArr);
        sb6.append(", yuv420sp:");
        sb6.append(this.f149971l);
        com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", sb6.toString());
        byte b17 = f0Var.f149949d;
        java.lang.String str2 = " error:";
        if (b17 != 0 || this.f149971l == null) {
            bArr2 = null;
            i27 = 0;
        } else {
            int i49 = this.f149969j;
            int i57 = this.f149970k;
            com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "anlingao[multi_hw] m_CapW[%d], m_CapH[%d], w[%d], h[%d], m_width[%d], m_height[%d]", java.lang.Integer.valueOf(i49), java.lang.Integer.valueOf(this.f149970k), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f149964e), java.lang.Integer.valueOf(this.f149965f));
            bArr2 = this.f149971l;
            int i58 = this.f149964e;
            int i59 = this.f149965f;
            this.f149983x = ((i58 * i59) * 3) >> 1;
            if (i58 == i49 && i59 == i57) {
                i27 = 0;
            } else {
                this.f149964e = i49;
                this.f149965f = i57;
                this.f149983x = ((i49 * i57) * 3) >> 1;
                try {
                    i48 = d();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MultiAvcEncoder[HWEnc]", "mediacodec init error: " + e17.getMessage());
                    this.f149960a = 2003;
                    i48 = -this.f149960a;
                }
                i27 = i48;
                if (i27 < 0) {
                    com.tencent.mars.xlog.Log.e("MultiAvcEncoder[HWEnc]", "mediacodec init failed, stop HW encoding! ret: " + i27);
                    try {
                        f();
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("MultiAvcEncoder[HWEnc]", " error:" + e18.toString());
                    }
                    return i27;
                }
            }
            int i66 = f149958y;
        }
        if (bArr2 == null || this.f149962c == null) {
            int i67 = this.f149980u;
            this.f149980u = i67 + 1;
            if (i67 <= 5) {
                return i27;
            }
            com.tencent.mars.xlog.Log.e("MultiAvcEncoder[HWEnc]", " anlingao[multi_hw] ENUM_AVCEncNULLPointer: 2006");
            i28 = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_END;
            this.f149960a = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_END;
        } else {
            try {
                this.f149980u = 0;
                java.lang.System.currentTimeMillis();
                java.nio.ByteBuffer[] k17 = this.f149962c.k();
                java.nio.ByteBuffer[] n17 = this.f149962c.n();
                int f17 = this.f149962c.f(-1L);
                com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "anlingao[multi_hw] inputBufferIndex: " + f17);
                if (f17 >= 0) {
                    long j18 = this.f149972m;
                    int min = java.lang.Math.min(java.lang.Math.max(this.f149966g, 15), 30);
                    if (j18 != 0) {
                        long j19 = this.f149973n;
                        if (j19 != 0) {
                            i47 = f17;
                            this.f149973n = j19 + (1000000 / min);
                            long j27 = this.f149973n;
                            com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "anlingao[multi_hw] pts: " + j27);
                            java.nio.ByteBuffer byteBuffer = k17[i47];
                            byteBuffer.clear();
                            byteBuffer.put(bArr2, 0, this.f149983x);
                            this.f149962c.p(i47, 0, this.f149983x, j27, 0);
                            this.f149972m++;
                        }
                    }
                    i47 = f17;
                    this.f149973n = 132L;
                    long j272 = this.f149973n;
                    com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "anlingao[multi_hw] pts: " + j272);
                    java.nio.ByteBuffer byteBuffer2 = k17[i47];
                    byteBuffer2.clear();
                    byteBuffer2.put(bArr2, 0, this.f149983x);
                    this.f149962c.p(i47, 0, this.f149983x, j272, 0);
                    this.f149972m++;
                }
                android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                long j28 = 12000;
                int g17 = this.f149962c.g(bufferInfo, j28);
                com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "anlingao[multi_hw] outputBufferIndex: " + g17);
                if (g17 == -2) {
                    com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "steve: encoder output format changed: " + this.f149962c.o());
                }
                com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "anlingao[multi_hw] outputBufferIndex: " + g17);
                while (g17 >= 0) {
                    java.nio.ByteBuffer byteBuffer3 = n17[g17];
                    byte[] bArr3 = new byte[bufferInfo.size];
                    byteBuffer3.get(bArr3);
                    com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "anlingao[multi_hw] bufferInfo.flags: " + bufferInfo.flags);
                    if (bufferInfo.flags == 2) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.String g18 = g(bArr3);
                        java.lang.String g19 = g(new byte[]{0, 0, 0, 1});
                        int i68 = 0;
                        while (true) {
                            int indexOf = g18.indexOf(g19, i68);
                            java.lang.String str3 = g18;
                            if (indexOf == -1) {
                                break;
                            }
                            int length = g19.length() + indexOf;
                            arrayList.add(java.lang.Integer.valueOf(indexOf / 2));
                            i68 = length;
                            g18 = str3;
                        }
                        r45.gv3 gv3Var = new r45.gv3();
                        if (arrayList.size() == 3 && this.f149961b.equalsIgnoreCase("video/hevc")) {
                            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue() + 4;
                            int intValue2 = ((java.lang.Integer) arrayList.get(1)).intValue() + 4;
                            byteBufferArr = n17;
                            int intValue3 = ((java.lang.Integer) arrayList.get(2)).intValue() + 4;
                            int i69 = (intValue2 - intValue) - 4;
                            int i76 = (intValue3 - intValue2) - 4;
                            i39 = bufferInfo.size - intValue3;
                            gv3Var.f375552g = new com.tencent.mm.protobuf.g(bArr3, intValue, i69);
                            i38 = i76;
                            i29 = intValue2;
                            i37 = intValue3;
                        } else {
                            byteBufferArr = n17;
                            if (arrayList.size() == 2) {
                                i29 = ((java.lang.Integer) arrayList.get(0)).intValue() + 4;
                                i37 = ((java.lang.Integer) arrayList.get(1)).intValue() + 4;
                                i38 = (i37 - i29) - 4;
                                i39 = bufferInfo.size - i37;
                            } else {
                                i29 = 0;
                                i37 = 0;
                                i38 = 0;
                                i39 = 0;
                            }
                        }
                        str = str2;
                        try {
                            j17 = j28;
                            if (this.f149977r != 1 && this.f149976q.b(bArr3)) {
                                this.f149979t = this.f149976q.f176912a;
                                this.f149978s = 1;
                                com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "steve:B-frames exist in High Profile, reset to Baseline!!!,maxAllowedProfile:" + this.f149978s + ", checkCodeForBSlice:" + this.f149979t);
                                try {
                                    return d();
                                } catch (java.lang.Exception e19) {
                                    com.tencent.mars.xlog.Log.e("MultiAvcEncoder[HWEnc]", "mediacodec reinit error: " + e19.getMessage());
                                    this.f149960a = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS;
                                    return -this.f149960a;
                                }
                            }
                            gv3Var.f375549d = 4;
                            gv3Var.f375550e = new com.tencent.mm.protobuf.g(bArr3, i29, i38);
                            gv3Var.f375551f = new com.tencent.mm.protobuf.g(bArr3, i37, i39);
                            int h17 = h(gv3Var.toByteArray(), bufferInfo.flags, gv3Var.toByteArray().length);
                            if (h17 < 0) {
                                return h17;
                            }
                            i27 = bufferInfo.flags;
                            f149958y++;
                            this.f149962c.s(g17, false);
                            long j29 = j17;
                            g17 = this.f149962c.g(bufferInfo, j29);
                            j28 = j29;
                            n17 = byteBufferArr;
                            str2 = str;
                        } catch (java.lang.Exception e27) {
                            e = e27;
                            com.tencent.mars.xlog.Log.e("MultiAvcEncoder[HWEnc]", str + e.toString());
                            i28 = 2004;
                            this.f149960a = 2004;
                            return -i28;
                        }
                    } else {
                        byteBufferArr = n17;
                        j17 = j28;
                        str = str2;
                        if (this.f149977r != 1 && this.f149976q.c(bArr3)) {
                            this.f149979t = this.f149976q.f176912a;
                            this.f149978s = 1;
                            com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "steve:B-frames exist in High Profile, reset to Baseline!!!,maxAllowedProfile:" + this.f149978s + ", checkCodeForBSlice:" + this.f149979t);
                            try {
                                return d();
                            } catch (java.lang.Exception e28) {
                                com.tencent.mars.xlog.Log.e("MultiAvcEncoder[HWEnc]", "mediacodec reinit error: " + e28.getMessage());
                                this.f149960a = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS;
                                return -this.f149960a;
                            }
                        }
                        int i77 = bufferInfo.flags;
                        if (i77 != 0 && i77 != 1) {
                            this.f149960a = com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION;
                            int i78 = -com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION;
                            com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "steve:unknown frame error!!! type:" + bufferInfo.flags + ", len:" + bufferInfo.size);
                            return i78;
                        }
                        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
                        allocate.putInt(bufferInfo.size - 4);
                        java.lang.System.arraycopy(allocate.order(java.nio.ByteOrder.BIG_ENDIAN).array(), 0, bArr3, 0, 4);
                        java.lang.System.currentTimeMillis();
                        r45.fv3 fv3Var = new r45.fv3();
                        fv3Var.f374621d = new com.tencent.mm.protobuf.g(bArr3, 0, bufferInfo.size);
                        fv3Var.f374622e = 1;
                        fv3Var.f374623f = this.f149974o;
                        java.util.LinkedList linkedList = this.f149975p;
                        linkedList.set(0, java.lang.Integer.valueOf(bufferInfo.size));
                        fv3Var.f374624g = linkedList;
                        int h18 = h(fv3Var.toByteArray(), bufferInfo.flags, fv3Var.toByteArray().length);
                        if (h18 < 0) {
                            return h18;
                        }
                        i27 = bufferInfo.flags;
                        f149958y++;
                        this.f149962c.s(g17, false);
                        long j292 = j17;
                        g17 = this.f149962c.g(bufferInfo, j292);
                        j28 = j292;
                        n17 = byteBufferArr;
                        str2 = str;
                    }
                }
                return i27;
            } catch (java.lang.Exception e29) {
                e = e29;
                str = str2;
            }
        }
        return -i28;
    }

    public void c() {
        com.tencent.mm.plugin.multitalk.model.f0 f0Var = this.f149982w;
        com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "anlingao[multi_hw] EMethodGetQosPara ret[%d], len[%d]", 0, java.lang.Integer.valueOf(f0Var.f149951f.length));
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(f0Var.f149951f);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        f0Var.f149946a = wrap.getShort();
        f0Var.f149947b = wrap.get();
        wrap.get();
        wrap.get();
        wrap.get();
        wrap.get();
        wrap.get();
        wrap.get();
        wrap.get();
        f0Var.f149948c = wrap.get();
        wrap.get();
        f0Var.f149949d = wrap.get();
        f0Var.f149950e = wrap.get();
        short s17 = f0Var.f149946a;
        if (this.f149967h != s17) {
            e(s17);
            com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "steve[QoS]: Update BR! frameID: " + f149958y + ", new_br: " + this.f149967h + ", tuneBR:" + ((int) s17));
            this.f149967h = s17;
        }
        if (1 == f0Var.f149950e && f149958y > 0) {
            if (this.f149962c != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("request-sync", 0);
                this.f149962c.v(bundle);
            }
            com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "steve[QoS]: Force I Frame! frameID: " + f149958y);
        }
        byte b17 = f0Var.f149947b;
        if (b17 != this.f149966g) {
            this.f149966g = b17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d3 A[Catch: Exception -> 0x0247, TryCatch #1 {Exception -> 0x0247, blocks: (B:80:0x01a4, B:82:0x01aa, B:84:0x01ae, B:86:0x01bc, B:94:0x01d3, B:96:0x01d7, B:99:0x01dd, B:102:0x01e4, B:108:0x0213, B:110:0x0237, B:112:0x023b), top: B:79:0x01a4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d() {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.model.g0.d():int");
    }

    public boolean e(int i17) {
        try {
            if (this.f149962c == null) {
                return false;
            }
            if (i17 <= 0) {
                i17 = 700;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("video-bitrate", i17 * 1000);
            this.f149962c.v(bundle);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MultiAvcEncoder[HWEnc]", "steve: setRates failed:" + e17);
            return false;
        }
    }

    public final void f() {
        try {
            wo.i1 i1Var = this.f149962c;
            if (i1Var != null) {
                i1Var.y();
                this.f149962c.q();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MultiAvcEncoder[HWEnc]", " error:" + e17.toString());
        }
    }

    public java.lang.String g(byte[] bArr) {
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

    public int h(byte[] bArr, int i17, int i18) {
        if (bArr == null) {
            return 0;
        }
        int i19 = this.f149961b.equalsIgnoreCase("video/hevc") ? A : f149959z;
        int D = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.D(bArr, this.f149964e, i17, i19 + 128);
        com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", "anlingao[multi_hw] ret[%d],  m_width[%d], m_height[%d], type[%d], format[%d]", java.lang.Integer.valueOf(D), java.lang.Integer.valueOf(this.f149964e), java.lang.Integer.valueOf(this.f149965f), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
        if (D >= 0) {
            this.f149981v = 0;
            return D;
        }
        int i27 = this.f149981v;
        this.f149981v = i27 + 1;
        if (i27 <= 5) {
            return 0;
        }
        this.f149960a = 2008;
        int i28 = -2008;
        com.tencent.mars.xlog.Log.e("MultiAvcEncoder[HWEnc]", "steve: hw send error for 5 times!! send ret = " + i28);
        return i28;
    }
}
