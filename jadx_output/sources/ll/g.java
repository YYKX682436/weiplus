package ll;

/* loaded from: classes13.dex */
public class g extends ll.d {
    public static int H;
    public static int I;
    public long A;
    public int B;
    public byte[] C;
    public byte[] D;
    public int E;
    public final byte[] F;
    public int G;

    /* renamed from: u, reason: collision with root package name */
    public android.media.MediaExtractor f319101u;

    /* renamed from: v, reason: collision with root package name */
    public wo.i1 f319102v;

    /* renamed from: w, reason: collision with root package name */
    public ll.k f319103w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f319104x;

    /* renamed from: y, reason: collision with root package name */
    public int f319105y;

    /* renamed from: z, reason: collision with root package name */
    public long f319106z;

    public g(ol.h hVar, ql.c cVar) {
        super(hVar, cVar);
        this.f319104x = null;
        this.f319105y = 2;
        this.f319106z = 0L;
        this.A = 0L;
        this.B = 14144;
        this.C = new byte[14144];
        this.D = new byte[3536];
        this.E = 3536;
        this.F = new byte[3536];
        this.G = 0;
    }

    public void B(hl.d dVar) {
        int i17 = this.G;
        if (i17 <= 0) {
            return;
        }
        if (i17 > 3536) {
            int i18 = i17 / 3536;
            int i19 = i17 % 3536;
            for (int i27 = 0; i27 < i18; i27++) {
                byte[] bArr = new byte[3536];
                java.lang.System.arraycopy(this.C, i27 * 3536, bArr, 0, 3536);
                H(dVar, bArr);
            }
            byte[] bArr2 = this.F;
            java.lang.System.arraycopy(this.C, i18 * 3536, bArr2, 0, i19);
            java.util.Arrays.fill(this.C, 0, this.B, (byte) 0);
            java.lang.System.arraycopy(bArr2, 0, this.C, 0, i19);
            this.G = i19;
        }
        int i28 = this.G;
        if (i28 <= 3536) {
            byte[] bArr3 = new byte[3536];
            java.lang.System.arraycopy(this.C, 0, bArr3, 0, i28);
            H(dVar, bArr3);
            this.G = 0;
        }
    }

    public void C(hl.d dVar) {
        kl.k kVar = this.f319084e;
        if (kVar == null) {
            B(dVar);
            dVar.a();
            return;
        }
        kVar.d();
        il.e c17 = il.e.c();
        java.lang.String str = dVar.f282020c;
        synchronized (c17) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioCachePathMgr", "append path:%s", str);
            java.lang.String a17 = rl.d.a("" + str.hashCode());
            if (!c17.f291983a.contains(a17)) {
                c17.f291983a.add(a17);
            }
        }
        if (i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderMediaCodec", "flushCache", null);
            this.f319084e.b();
        } else if (!h()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderMediaCodec", "writeCacheAndPlay", null);
            A(dVar);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderMediaCodec", "flushCache and readCacheAndPlay", null);
            this.f319084e.b();
            u();
        }
    }

    public void D(hl.d dVar, java.nio.ByteBuffer byteBuffer, int i17) {
        if (this.f319084e == null) {
            E(dVar, byteBuffer, i17);
            return;
        }
        if (i17 != this.E) {
            this.E = i17;
            this.D = new byte[i17];
        }
        byteBuffer.get(this.D);
        this.f319081b.b().getClass();
        this.f319084e.a(this.D);
    }

    public void E(hl.d dVar, java.nio.ByteBuffer byteBuffer, int i17) {
        byte[] bArr;
        int i18;
        if (3536 == i17) {
            bArr = new byte[i17];
            byteBuffer.get(bArr);
        } else {
            if (i17 != this.E) {
                this.E = i17;
                this.D = new byte[i17];
            }
            java.util.Arrays.fill(this.D, 0, this.E, (byte) 0);
            byteBuffer.get(this.D, 0, this.E);
            bArr = this.D;
        }
        this.f319081b.b().getClass();
        if (bArr == null) {
            int i19 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDecoderMediaCodec", "pushBuffer chunk is null", null);
            return;
        }
        int length = bArr.length;
        if (length == 3536) {
            if (this.G > 0) {
                B(dVar);
            }
            H(dVar, bArr);
            return;
        }
        if (length != 3536) {
            if (length > this.B) {
                while (true) {
                    i18 = this.B;
                    if (i18 >= length) {
                        break;
                    } else {
                        this.B = i18 + 3536;
                    }
                }
                byte[] bArr2 = new byte[i18];
                int i27 = this.G;
                if (i27 > 0) {
                    java.lang.System.arraycopy(this.C, 0, bArr2, 0, i27);
                }
                this.C = bArr2;
            }
            int i28 = this.G;
            int i29 = i28 + length;
            java.lang.System.arraycopy(bArr, 0, this.C, i28, length);
            int i37 = i29 / 3536;
            int i38 = i29 % 3536;
            for (int i39 = 0; i39 < i37; i39++) {
                byte[] bArr3 = new byte[3536];
                java.lang.System.arraycopy(this.C, i39 * 3536, bArr3, 0, 3536);
                H(dVar, bArr3);
            }
            byte[] bArr4 = this.F;
            java.lang.System.arraycopy(this.C, i37 * 3536, bArr4, 0, i38);
            java.util.Arrays.fill(this.C, 0, this.B, (byte) 0);
            java.lang.System.arraycopy(bArr4, 0, this.C, 0, i38);
            this.G = i38;
        }
    }

    public final void F() {
        try {
            wo.i1 i1Var = this.f319102v;
            if (i1Var != null) {
                i1Var.y();
                this.f319102v.q();
                this.f319102v = null;
            }
        } catch (java.lang.Exception e17) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioDecoderMediaCodec", e17, "releaseMediaCodec", new java.lang.Object[0]);
        }
    }

    public final void G() {
        try {
            android.media.MediaExtractor mediaExtractor = this.f319101u;
            if (mediaExtractor != null) {
                mediaExtractor.release();
                this.f319101u = null;
            }
        } catch (java.lang.Exception e17) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioDecoderMediaCodec", e17, "releaseMediaExtractor", new java.lang.Object[0]);
        }
        try {
            ll.k kVar = this.f319103w;
            if (kVar != null) {
                kVar.close();
                this.f319103w = null;
            }
        } catch (java.lang.Exception e18) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioDecoderMediaCodec", e18, "releaseDataSource", new java.lang.Object[0]);
        }
    }

    public void H(hl.d dVar, byte[] bArr) {
        hl.e b17 = il.i.a().b();
        b17.f282038f = bArr;
        b17.f282034b = this.f319094o;
        b17.f282035c = this.f319095p;
        b17.f282036d = this.f319105y;
        dVar.m(b17);
        z(b17);
    }

    @Override // ll.p
    public void b() {
        G();
        F();
        kl.k kVar = this.f319084e;
        if (kVar != null) {
            kVar.d();
            this.f319084e.release();
            this.f319084e = null;
        }
        this.f319085f = null;
        this.f319104x = null;
        this.f319094o = 0;
        this.f319095p = 0;
        this.f319106z = 0L;
        this.A = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0321 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0528 A[Catch: all -> 0x0350, Exception -> 0x0353, TryCatch #5 {Exception -> 0x0353, blocks: (B:91:0x031b, B:93:0x0323, B:95:0x032a, B:97:0x0334, B:99:0x0341, B:100:0x0374, B:103:0x0381, B:105:0x038c, B:106:0x03b6, B:108:0x03c2, B:111:0x03c7, B:113:0x03cb, B:114:0x03ce, B:116:0x03dd, B:123:0x03eb, B:126:0x0405, B:128:0x0436, B:129:0x0455, B:142:0x0493, B:131:0x04b0, B:133:0x04bc, B:135:0x04c0, B:138:0x04d9, B:140:0x04dd, B:145:0x043d, B:147:0x0443, B:149:0x044b, B:152:0x0453, B:153:0x04f2, B:155:0x0356, B:159:0x036d, B:160:0x0392, B:164:0x0514, B:168:0x0528, B:171:0x053e, B:173:0x0550, B:174:0x0554), top: B:90:0x031b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x053e A[Catch: all -> 0x0350, Exception -> 0x0353, TryCatch #5 {Exception -> 0x0353, blocks: (B:91:0x031b, B:93:0x0323, B:95:0x032a, B:97:0x0334, B:99:0x0341, B:100:0x0374, B:103:0x0381, B:105:0x038c, B:106:0x03b6, B:108:0x03c2, B:111:0x03c7, B:113:0x03cb, B:114:0x03ce, B:116:0x03dd, B:123:0x03eb, B:126:0x0405, B:128:0x0436, B:129:0x0455, B:142:0x0493, B:131:0x04b0, B:133:0x04bc, B:135:0x04c0, B:138:0x04d9, B:140:0x04dd, B:145:0x043d, B:147:0x0443, B:149:0x044b, B:152:0x0453, B:153:0x04f2, B:155:0x0356, B:159:0x036d, B:160:0x0392, B:164:0x0514, B:168:0x0528, B:171:0x053e, B:173:0x0550, B:174:0x0554), top: B:90:0x031b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0221 A[EDGE_INSN: B:213:0x0221->B:207:0x0221 BREAK  A[LOOP:1: B:61:0x01e1->B:211:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0319 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0323 A[Catch: all -> 0x0350, Exception -> 0x0353, TryCatch #5 {Exception -> 0x0353, blocks: (B:91:0x031b, B:93:0x0323, B:95:0x032a, B:97:0x0334, B:99:0x0341, B:100:0x0374, B:103:0x0381, B:105:0x038c, B:106:0x03b6, B:108:0x03c2, B:111:0x03c7, B:113:0x03cb, B:114:0x03ce, B:116:0x03dd, B:123:0x03eb, B:126:0x0405, B:128:0x0436, B:129:0x0455, B:142:0x0493, B:131:0x04b0, B:133:0x04bc, B:135:0x04c0, B:138:0x04d9, B:140:0x04dd, B:145:0x043d, B:147:0x0443, B:149:0x044b, B:152:0x0453, B:153:0x04f2, B:155:0x0356, B:159:0x036d, B:160:0x0392, B:164:0x0514, B:168:0x0528, B:171:0x053e, B:173:0x0550, B:174:0x0554), top: B:90:0x031b, outer: #0 }] */
    @Override // ll.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 1548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ll.g.l():void");
    }
}
