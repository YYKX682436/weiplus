package u9;

/* loaded from: classes15.dex */
public class i extends y8.c {
    public static final int[] W1 = {1920, 1600, 1440, 1280, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, td1.q.CTRL_INDEX, 640, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH, 480};
    public android.view.Surface A1;
    public int B1;
    public boolean C1;
    public long D1;
    public long E1;
    public int F1;
    public int G1;
    public int H1;
    public float I1;
    public int J1;
    public int K1;
    public int L1;
    public float M1;
    public int N1;
    public int O1;
    public int P1;
    public float Q1;
    public boolean R1;
    public int S1;
    public u9.h T1;
    public long U1;
    public int V1;
    public final android.content.Context X;
    public final u9.k Y;
    public final u9.s Z;

    /* renamed from: l1, reason: collision with root package name */
    public final long[] f425746l1;

    /* renamed from: p0, reason: collision with root package name */
    public final long f425747p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.google.android.exoplayer2.Format[] f425748p1;

    /* renamed from: x0, reason: collision with root package name */
    public final int f425749x0;

    /* renamed from: x1, reason: collision with root package name */
    public u9.g f425750x1;

    /* renamed from: y0, reason: collision with root package name */
    public final boolean f425751y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f425752y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.view.Surface f425753z1;

    public i(android.content.Context context, y8.e eVar, long j17, p8.b bVar, boolean z17, android.os.Handler handler, u9.t tVar, int i17) {
        super(2, eVar, bVar, z17);
        this.f425747p0 = j17;
        this.f425749x0 = i17;
        this.X = context.getApplicationContext();
        this.Y = new u9.k(context);
        this.Z = new u9.s(handler, tVar);
        this.f425751y0 = t9.d0.f416498a <= 22 && "foster".equals(t9.d0.f416499b) && "NVIDIA".equals(t9.d0.f416500c);
        this.f425746l1 = new long[10];
        this.U1 = -9223372036854775807L;
        this.D1 = -9223372036854775807L;
        this.J1 = -1;
        this.K1 = -1;
        this.M1 = -1.0f;
        this.I1 = -1.0f;
        this.B1 = 1;
        this.N1 = -1;
        this.O1 = -1;
        this.Q1 = -1.0f;
        this.P1 = -1;
    }

    public static boolean K(boolean z17, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.Format format2) {
        if (!format.f44080i.equals(format2.f44080i)) {
            return false;
        }
        int i17 = format.f44087s;
        if (i17 == -1) {
            i17 = 0;
        }
        int i18 = format2.f44087s;
        if (i18 == -1) {
            i18 = 0;
        }
        if (i17 == i18) {
            return z17 || (format.f44084p == format2.f44084p && format.f44085q == format2.f44085q);
        }
        return false;
    }

    public static int M(com.google.android.exoplayer2.Format format) {
        if (format.f44081m == -1) {
            return N(format.f44080i, format.f44084p, format.f44085q);
        }
        java.util.List list = format.f44082n;
        int size = list.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            i17 += ((byte[]) list.get(i18)).length;
        }
        return format.f44081m + i17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0057. Please report as an issue. */
    public static int N(java.lang.String str, int i17, int i18) {
        char c17;
        int i19;
        if (i17 == -1 || i18 == -1) {
            return -1;
        }
        str.getClass();
        int i27 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_H263)) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case 1187890754:
                if (str.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MP4V)) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c17 = 3;
                    break;
                }
                c17 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c17 = 4;
                    break;
                }
                c17 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c17 = 5;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        switch (c17) {
            case 0:
            case 2:
            case 4:
                i19 = i17 * i18;
                i27 = 2;
                return (i19 * 3) / (i27 * 2);
            case 1:
            case 5:
                i19 = i17 * i18;
                return (i19 * 3) / (i27 * 2);
            case 3:
                if ("BRAVIA 4K 2015".equals(t9.d0.f416501d)) {
                    return -1;
                }
                i19 = (((i17 + 16) - 1) / 16) * (((i18 + 16) - 1) / 16) * 16 * 16;
                i27 = 2;
                return (i19 * 3) / (i27 * 2);
            default:
                return -1;
        }
    }

    @Override // y8.c
    public void A(com.google.android.exoplayer2.Format format) {
        super.A(format);
        u9.s sVar = this.Z;
        if (sVar.f425791b != null) {
            sVar.f425790a.post(new u9.n(sVar, format));
        }
        float f17 = format.f44088t;
        if (f17 == -1.0f) {
            f17 = 1.0f;
        }
        this.I1 = f17;
        int i17 = format.f44087s;
        if (i17 == -1) {
            i17 = 0;
        }
        this.H1 = i17;
    }

    @Override // y8.c
    public void C(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        boolean z17 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.J1 = z17 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z17 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.K1 = integer;
        float f17 = this.I1;
        this.M1 = f17;
        if (t9.d0.f416498a >= 21) {
            int i17 = this.H1;
            if (i17 == 90 || i17 == 270) {
                int i18 = this.J1;
                this.J1 = integer;
                this.K1 = i18;
                this.M1 = 1.0f / f17;
            }
        } else {
            this.L1 = this.H1;
        }
        mediaCodec.setVideoScalingMode(this.B1);
    }

    @Override // y8.c
    public void D(o8.g gVar) {
        if (t9.d0.f416498a >= 23 || !this.R1) {
            return;
        }
        P();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015c  */
    @Override // y8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean F(long r25, long r27, android.media.MediaCodec r29, java.nio.ByteBuffer r30, int r31, int r32, long r33, boolean r35) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.i.F(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }

    @Override // y8.c
    public void G() {
        try {
            super.G();
            android.view.Surface surface = this.A1;
            if (surface != null) {
                if (this.f425753z1 == surface) {
                    this.f425753z1 = null;
                }
                surface.release();
                this.A1 = null;
            }
        } catch (java.lang.Throwable th6) {
            if (this.A1 != null) {
                android.view.Surface surface2 = this.f425753z1;
                android.view.Surface surface3 = this.A1;
                if (surface2 == surface3) {
                    this.f425753z1 = null;
                }
                surface3.release();
                this.A1 = null;
            }
            throw th6;
        }
    }

    @Override // y8.c
    public boolean I(y8.a aVar) {
        return this.f425753z1 != null || R(aVar.f459793d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00c0, code lost:
    
        if ("2".equals(r7) != false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b0  */
    @Override // y8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int J(y8.e r13, com.google.android.exoplayer2.Format r14) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.i.J(y8.e, com.google.android.exoplayer2.Format):int");
    }

    public final void L() {
        android.media.MediaCodec mediaCodec;
        this.C1 = false;
        if (t9.d0.f416498a < 23 || !this.R1 || (mediaCodec = this.f459808v) == null) {
            return;
        }
        this.T1 = new u9.h(this, mediaCodec, null);
    }

    public final void O() {
        if (this.F1 > 0) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j17 = elapsedRealtime - this.E1;
            int i17 = this.F1;
            u9.s sVar = this.Z;
            if (sVar.f425791b != null) {
                sVar.f425790a.post(new u9.o(sVar, i17, j17));
            }
            this.F1 = 0;
            this.E1 = elapsedRealtime;
        }
    }

    public void P() {
        if (this.C1) {
            return;
        }
        this.C1 = true;
        android.view.Surface surface = this.f425753z1;
        u9.s sVar = this.Z;
        if (sVar.f425791b != null) {
            sVar.f425790a.post(new u9.q(sVar, surface));
        }
    }

    public final void Q() {
        int i17 = this.J1;
        if (i17 == -1 && this.K1 == -1) {
            return;
        }
        if (this.N1 == i17 && this.O1 == this.K1 && this.P1 == this.L1 && this.Q1 == this.M1) {
            return;
        }
        int i18 = this.K1;
        int i19 = this.L1;
        float f17 = this.M1;
        u9.s sVar = this.Z;
        if (sVar.f425791b != null) {
            sVar.f425790a.post(new u9.p(sVar, i17, i18, i19, f17));
        }
        this.N1 = this.J1;
        this.O1 = this.K1;
        this.P1 = this.L1;
        this.Q1 = this.M1;
    }

    public final boolean R(boolean z17) {
        return t9.d0.f416498a >= 23 && !this.R1 && (!z17 || com.google.android.exoplayer2.video.DummySurface.a(this.X));
    }

    @Override // m8.a, m8.g
    public void b(int i17, java.lang.Object obj) {
        if (i17 != 1) {
            if (i17 == 4) {
                int intValue = ((java.lang.Integer) obj).intValue();
                this.B1 = intValue;
                android.media.MediaCodec mediaCodec = this.f459808v;
                if (mediaCodec != null) {
                    mediaCodec.setVideoScalingMode(intValue);
                    return;
                }
                return;
            }
            return;
        }
        android.view.Surface surface = (android.view.Surface) obj;
        if (surface == null) {
            android.view.Surface surface2 = this.A1;
            if (surface2 != null) {
                surface = surface2;
            } else {
                y8.a aVar = this.f459809w;
                if (aVar != null) {
                    boolean z17 = aVar.f459793d;
                    if (R(z17)) {
                        surface = com.google.android.exoplayer2.video.DummySurface.b(this.X, z17);
                        this.A1 = surface;
                    }
                }
            }
        }
        android.view.Surface surface3 = this.f425753z1;
        u9.s sVar = this.Z;
        if (surface3 == surface) {
            if (surface == null || surface == this.A1) {
                return;
            }
            int i18 = this.N1;
            if (i18 != -1 || this.O1 != -1) {
                int i19 = this.O1;
                int i27 = this.P1;
                float f17 = this.Q1;
                if (sVar.f425791b != null) {
                    sVar.f425790a.post(new u9.p(sVar, i18, i19, i27, f17));
                }
            }
            if (this.C1) {
                android.view.Surface surface4 = this.f425753z1;
                if (sVar.f425791b != null) {
                    sVar.f425790a.post(new u9.q(sVar, surface4));
                    return;
                }
                return;
            }
            return;
        }
        this.f425753z1 = surface;
        int i28 = this.f324538g;
        if (i28 == 1 || i28 == 2) {
            android.media.MediaCodec mediaCodec2 = this.f459808v;
            if (t9.d0.f416498a < 23 || mediaCodec2 == null || surface == null || this.f425752y1) {
                G();
                x();
            } else {
                mediaCodec2.setOutputSurface(surface);
            }
        }
        if (surface == null || surface == this.A1) {
            this.N1 = -1;
            this.O1 = -1;
            this.Q1 = -1.0f;
            this.P1 = -1;
            L();
            return;
        }
        int i29 = this.N1;
        if (i29 != -1 || this.O1 != -1) {
            int i37 = this.O1;
            int i38 = this.P1;
            float f18 = this.Q1;
            if (sVar.f425791b != null) {
                sVar.f425790a.post(new u9.p(sVar, i29, i37, i38, f18));
            }
        }
        L();
        if (i28 == 2) {
            long j17 = this.f425747p0;
            this.D1 = j17 > 0 ? android.os.SystemClock.elapsedRealtime() + j17 : -9223372036854775807L;
        }
    }

    @Override // y8.c, m8.b0
    public boolean isReady() {
        android.view.Surface surface;
        if (super.isReady() && (this.C1 || (((surface = this.A1) != null && this.f425753z1 == surface) || this.f459808v == null || this.R1))) {
            this.D1 = -9223372036854775807L;
            return true;
        }
        if (this.D1 == -9223372036854775807L) {
            return false;
        }
        if (android.os.SystemClock.elapsedRealtime() < this.D1) {
            return true;
        }
        this.D1 = -9223372036854775807L;
        return false;
    }

    @Override // m8.a
    public void l() {
        this.J1 = -1;
        this.K1 = -1;
        this.M1 = -1.0f;
        this.I1 = -1.0f;
        this.U1 = -9223372036854775807L;
        this.V1 = 0;
        this.N1 = -1;
        this.O1 = -1;
        this.Q1 = -1.0f;
        this.P1 = -1;
        L();
        u9.k kVar = this.Y;
        if (kVar.f425760b) {
            kVar.f425759a.f425756e.sendEmptyMessage(2);
        }
        this.T1 = null;
        this.R1 = false;
        try {
            this.f459807u = null;
            G();
            synchronized (this.V) {
            }
            u9.s sVar = this.Z;
            o8.f fVar = this.V;
            if (sVar.f425791b != null) {
                sVar.f425790a.post(new u9.r(sVar, fVar));
            }
        } catch (java.lang.Throwable th6) {
            synchronized (this.V) {
                u9.s sVar2 = this.Z;
                o8.f fVar2 = this.V;
                if (sVar2.f425791b != null) {
                    sVar2.f425790a.post(new u9.r(sVar2, fVar2));
                }
                throw th6;
            }
        }
    }

    @Override // m8.a
    public void m(boolean z17) {
        o8.f fVar = new o8.f();
        this.V = fVar;
        int i17 = this.f324536e.f324554a;
        this.S1 = i17;
        this.R1 = i17 != 0;
        u9.s sVar = this.Z;
        if (sVar.f425791b != null) {
            sVar.f425790a.post(new u9.l(sVar, fVar));
        }
        u9.k kVar = this.Y;
        kVar.f425766h = false;
        if (kVar.f425760b) {
            kVar.f425759a.f425756e.sendEmptyMessage(1);
        }
    }

    @Override // y8.c, m8.a
    public void n(long j17, boolean z17) {
        super.n(j17, z17);
        L();
        this.G1 = 0;
        int i17 = this.V1;
        if (i17 != 0) {
            this.U1 = this.f425746l1[i17 - 1];
            this.V1 = 0;
        }
        if (!z17) {
            this.D1 = -9223372036854775807L;
        } else {
            long j18 = this.f425747p0;
            this.D1 = j18 > 0 ? android.os.SystemClock.elapsedRealtime() + j18 : -9223372036854775807L;
        }
    }

    @Override // m8.a
    public void o() {
        this.F1 = 0;
        this.E1 = android.os.SystemClock.elapsedRealtime();
    }

    @Override // m8.a
    public void p() {
        this.D1 = -9223372036854775807L;
        O();
    }

    @Override // m8.a
    public void q(com.google.android.exoplayer2.Format[] formatArr, long j17) {
        this.f425748p1 = formatArr;
        if (this.U1 == -9223372036854775807L) {
            this.U1 = j17;
            return;
        }
        int i17 = this.V1;
        long[] jArr = this.f425746l1;
        if (i17 == jArr.length) {
            long j18 = jArr[i17 - 1];
        } else {
            this.V1 = i17 + 1;
        }
        jArr[this.V1 - 1] = j17;
    }

    @Override // y8.c
    public boolean s(android.media.MediaCodec mediaCodec, boolean z17, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.Format format2) {
        if (K(z17, format, format2)) {
            u9.g gVar = this.f425750x1;
            if (format2.f44084p <= gVar.f425742a && format2.f44085q <= gVar.f425743b && M(format2) <= this.f425750x1.f425744c) {
                return true;
            }
        }
        return false;
    }

    @Override // y8.c
    public void t(y8.a aVar, android.media.MediaCodec mediaCodec, com.google.android.exoplayer2.Format format, android.media.MediaCrypto mediaCrypto) {
        u9.g gVar;
        android.graphics.Point point;
        int i17;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        com.google.android.exoplayer2.Format[] formatArr = this.f425748p1;
        int i18 = format.f44084p;
        int M = M(format);
        int length = formatArr.length;
        int i19 = format.f44085q;
        if (length == 1) {
            gVar = new u9.g(i18, i19, M);
        } else {
            int i27 = i19;
            boolean z17 = false;
            for (com.google.android.exoplayer2.Format format2 : formatArr) {
                if (K(aVar.f459791b, format, format2)) {
                    int i28 = format2.f44085q;
                    int i29 = format2.f44084p;
                    z17 |= i29 == -1 || i28 == -1;
                    i18 = java.lang.Math.max(i18, i29);
                    i27 = java.lang.Math.max(i27, i28);
                    M = java.lang.Math.max(M, M(format2));
                }
            }
            if (z17) {
                int i37 = format.f44084p;
                boolean z18 = i19 > i37;
                int i38 = z18 ? i19 : i37;
                if (z18) {
                    i19 = i37;
                }
                float f17 = i19 / i38;
                int[] iArr = W1;
                int i39 = 0;
                while (i39 < 9) {
                    int i47 = iArr[i39];
                    int i48 = (int) (i47 * f17);
                    if (i47 <= i38 || i48 <= i19) {
                        break;
                    }
                    float f18 = f17;
                    if (t9.d0.f416498a >= 21) {
                        int i49 = z18 ? i48 : i47;
                        if (!z18) {
                            i47 = i48;
                        }
                        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = aVar.f459795f;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            i17 = i38;
                            point = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            i17 = i38;
                            point = new android.graphics.Point((((i49 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i47 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
                        }
                        if (aVar.a(point.x, point.y, format.f44086r)) {
                            break;
                        }
                        i39++;
                        f17 = f18;
                        i38 = i17;
                    } else {
                        i17 = i38;
                        int i57 = (((i47 + 16) - 1) / 16) * 16;
                        int i58 = (((i48 + 16) - 1) / 16) * 16;
                        if (i57 * i58 <= y8.l.e()) {
                            int i59 = z18 ? i58 : i57;
                            if (!z18) {
                                i57 = i58;
                            }
                            point = new android.graphics.Point(i59, i57);
                        } else {
                            i39++;
                            f17 = f18;
                            i38 = i17;
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i18 = java.lang.Math.max(i18, point.x);
                    i27 = java.lang.Math.max(i27, point.y);
                    M = java.lang.Math.max(M, N(format.f44080i, i18, i27));
                }
            }
            gVar = new u9.g(i18, i27, M);
        }
        this.f425750x1 = gVar;
        int i66 = this.S1;
        android.media.MediaFormat o17 = format.o();
        o17.setInteger("max-width", gVar.f425742a);
        o17.setInteger("max-height", gVar.f425743b);
        int i67 = gVar.f425744c;
        if (i67 != -1) {
            o17.setInteger("max-input-size", i67);
        }
        if (this.f425751y0) {
            o17.setInteger("auto-frc", 0);
        }
        if (i66 != 0) {
            o17.setFeatureEnabled("tunneled-playback", true);
            o17.setInteger("audio-session-id", i66);
        }
        if (this.f425753z1 == null) {
            t9.a.d(R(aVar.f459793d));
            if (this.A1 == null) {
                this.A1 = com.google.android.exoplayer2.video.DummySurface.b(this.X, aVar.f459793d);
            }
            this.f425753z1 = this.A1;
        }
        mediaCodec.configure(o17, this.f425753z1, mediaCrypto, 0);
        if (t9.d0.f416498a < 23 || !this.R1) {
            return;
        }
        this.T1 = new u9.h(this, mediaCodec, null);
    }

    @Override // y8.c
    public void y(java.lang.String str, long j17, long j18) {
        u9.s sVar = this.Z;
        if (sVar.f425791b != null) {
            sVar.f425790a.post(new u9.m(sVar, str, j17, j18));
        }
        java.lang.String str2 = t9.d0.f416499b;
        this.f425752y1 = (("deb".equals(str2) || "flo".equals(str2)) && "OMX.qcom.video.decoder.avc".equals(str)) || ("tcl_eu".equals(str2) && "OMX.MTK.VIDEO.DECODER.AVC".equals(str));
    }
}
