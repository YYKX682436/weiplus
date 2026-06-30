package d61;

/* loaded from: classes14.dex */
public class o extends d61.a {
    public final java.util.List A;
    public final java.util.List B;
    public android.util.Pair[] C;
    public long[] D;
    public int[] E;
    public int[] F;
    public int[] G;
    public int[] H;
    public int[] I;

    /* renamed from: J, reason: collision with root package name */
    public long f226758J;
    public long K;
    public long L;
    public boolean M;
    public long[] N;
    public long[] O;
    public byte[] P;
    public int Q;
    public int[] R;

    /* renamed from: w, reason: collision with root package name */
    public long f226759w;

    /* renamed from: x, reason: collision with root package name */
    public long f226760x;

    /* renamed from: y, reason: collision with root package name */
    public long f226761y;

    /* renamed from: z, reason: collision with root package name */
    public int f226762z;

    public o(int i17, long j17, int i18, long j18) {
        super(i17, j17, i18, j18);
        this.A = new java.util.ArrayList();
        this.B = new java.util.ArrayList();
        this.f226758J = 0L;
        this.K = 0L;
        this.L = 0L;
        this.M = false;
        this.N = null;
        this.P = null;
        this.Q = 0;
        new java.util.HashMap();
    }

    public final int b(int i17) {
        int i18 = 0;
        while (true) {
            int[] iArr = this.R;
            if (i18 >= iArr.length) {
                return 0;
            }
            if (i17 <= iArr[i18]) {
                return i18;
            }
            i18++;
        }
    }

    public final long c(int i17) {
        if (this.E != null) {
            return r0[i17];
        }
        long[] jArr = this.O;
        if (jArr != null) {
            return jArr[i17];
        }
        return 0L;
    }

    public final android.util.Pair d(int i17) {
        if (this.R == null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            e();
            com.tencent.mars.xlog.Log.i("MicroMsg.StblAtom", "createChunkTable cost:%sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
        long[] jArr = this.D;
        if (i17 >= jArr.length) {
            return null;
        }
        int i18 = (int) jArr[i17];
        if (i18 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StblAtom", "calcSampleBeginEndId %s not found in timeTable", java.lang.Integer.valueOf(i17));
            return null;
        }
        int b17 = b(i18);
        return new android.util.Pair(java.lang.Integer.valueOf(this.R[b17 >= 1 ? b17 - 1 : 0] + 1), java.lang.Integer.valueOf(i18));
    }

    public final void e() {
        int[] iArr = this.E;
        int i17 = 1;
        int length = (iArr != null ? iArr.length : this.O.length) - 1;
        int length2 = this.H.length;
        for (int i18 = 1; i18 < length2; i18++) {
            int[] iArr2 = this.H;
            int i19 = i18 - 1;
            iArr2[i19] = iArr2[i18] - iArr2[i19];
        }
        int[] iArr3 = this.H;
        int i27 = length2 - 1;
        iArr3[i27] = (length - iArr3[i27]) + 1;
        int[] iArr4 = new int[length + 1];
        this.R = iArr4;
        iArr4[0] = 0;
        for (int i28 = 0; i28 < length2; i28++) {
            int i29 = this.H[i28];
            int i37 = this.I[i28];
            for (int i38 = 0; i38 < i29; i38++) {
                int[] iArr5 = this.R;
                iArr5[i17] = iArr5[i17 - 1] + i37;
                i17++;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StblAtom", "create chunkTable size:%s", java.lang.Integer.valueOf(this.R.length));
    }

    public final long f(java.io.RandomAccessFile randomAccessFile, int i17) {
        if (!d61.c.h(randomAccessFile, 4)) {
            return -1L;
        }
        byte[] bArr = new byte[8];
        if (randomAccessFile.read(bArr, 0, 4) < 4) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StblAtom", "co64 read entry count error");
            return -1L;
        }
        int e17 = d61.c.e(bArr, 0);
        long j17 = e17 * 8;
        long j18 = 0;
        if (j17 <= 0 || j17 > i17 - 16) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StblAtom", "stco error entryCount : " + e17);
            return -1L;
        }
        int i18 = 1;
        this.O = new long[e17 + 1];
        int read = randomAccessFile.read(bArr);
        while (read >= 8) {
            j18 += read;
            int i19 = i18 + 1;
            this.O[i18] = d61.c.f(bArr, 0);
            if (j18 >= j17) {
                break;
            }
            read = randomAccessFile.read(bArr);
            i18 = i19;
        }
        return j18 + 8;
    }

    public final long g(java.io.RandomAccessFile randomAccessFile, int i17) {
        if (!d61.c.h(randomAccessFile, 4)) {
            return -1L;
        }
        byte[] bArr = new byte[4];
        if (randomAccessFile.read(bArr, 0, 4) < 4) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StblAtom", "stco read entry count error");
            return -1L;
        }
        int e17 = d61.c.e(bArr, 0);
        long j17 = e17 * 4;
        long j18 = 0;
        if (j17 <= 0 || j17 > i17 - 16) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StblAtom", "stco error entryCount : " + e17);
            return -1L;
        }
        int i18 = 1;
        this.E = new int[e17 + 1];
        int read = randomAccessFile.read(bArr);
        while (read >= 4) {
            j18 += read;
            int i19 = i18 + 1;
            this.E[i18] = d61.c.e(bArr, 0);
            if (j18 >= j17) {
                break;
            }
            read = randomAccessFile.read(bArr);
            i18 = i19;
        }
        return j18 + 8;
    }

    public final long h(java.io.RandomAccessFile randomAccessFile, int i17) {
        if (!d61.c.h(randomAccessFile, 4)) {
            return -1L;
        }
        byte[] bArr = new byte[12];
        if (randomAccessFile.read(bArr, 0, 4) < 4) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StblAtom", "stsc read entry count error");
            return -1L;
        }
        int e17 = d61.c.e(bArr, 0);
        long j17 = e17 * 12;
        if (j17 <= i17 - 16) {
            long j18 = 0;
            if (j17 > 0) {
                this.H = new int[e17];
                this.I = new int[e17];
                int read = randomAccessFile.read(bArr);
                int i18 = 0;
                while (read >= 12) {
                    j18 += read;
                    this.H[i18] = d61.c.e(bArr, 0);
                    this.I[i18] = d61.c.e(bArr, 4);
                    i18++;
                    if (j18 >= j17) {
                        break;
                    }
                    read = randomAccessFile.read(bArr);
                }
                return j18 + 8;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.StblAtom", "stsc error entryCount : " + e17);
        return -1L;
    }

    public final long i(java.io.RandomAccessFile randomAccessFile, int i17) {
        if (!d61.c.h(randomAccessFile, 4)) {
            return -1L;
        }
        byte[] bArr = new byte[4];
        if (randomAccessFile.read(bArr, 0, 4) < 4) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StblAtom", "stss rread entry count error");
            return -1L;
        }
        int e17 = d61.c.e(bArr, 0);
        long j17 = e17 * 4;
        long j18 = 0;
        if (j17 <= 0 || j17 > i17 - 16) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StblAtom", "stss error entryCount : " + e17);
            return -1L;
        }
        this.G = new int[e17];
        int read = randomAccessFile.read(bArr);
        int i18 = 0;
        while (read >= 4) {
            j18 += read;
            int i19 = i18 + 1;
            this.G[i18] = d61.c.e(bArr, 0);
            if (j18 >= j17) {
                break;
            }
            read = randomAccessFile.read(bArr);
            i18 = i19;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StblAtom", "handleStssAtom, stssSampleId.size:%s", java.lang.Integer.valueOf(this.G.length));
        return j18 + 8;
    }

    public final long j(java.io.RandomAccessFile randomAccessFile, int i17) {
        int i18;
        int i19;
        int i27;
        int i28;
        int i29 = 4;
        if (!d61.c.h(randomAccessFile, 4)) {
            return -1L;
        }
        int i37 = 8;
        byte[] bArr = new byte[8];
        int i38 = 0;
        if (randomAccessFile.read(bArr, 0, 4) < 4) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StblAtom", "stts read entry count error");
            return -1L;
        }
        int e17 = d61.c.e(bArr, 0);
        long j17 = e17 * 8;
        if (j17 <= i17 - 16) {
            long j18 = 0;
            if (j17 > 0) {
                long[] jArr = new long[((int) (this.f226760x / this.f226759w)) + 2];
                this.D = jArr;
                java.util.Arrays.fill(jArr, -1L);
                this.D[0] = 1;
                int read = randomAccessFile.read(bArr);
                int i39 = 1;
                int i47 = 0;
                int i48 = 0;
                long j19 = 0;
                while (read >= i37) {
                    j19 += read;
                    int e18 = d61.c.e(bArr, i38);
                    int e19 = d61.c.e(bArr, i29);
                    long[] jArr2 = new long[e18];
                    this.N = jArr2;
                    java.util.Arrays.fill(jArr2, j18);
                    int i49 = i38;
                    while (i49 < e18) {
                        d61.n nVar = new d61.n();
                        long j27 = e19;
                        nVar.f226756d = j27;
                        if (i49 == 0) {
                            i19 = e18;
                            i18 = 0;
                        } else {
                            i18 = i49 - 1;
                            i19 = e18;
                        }
                        long[] jArr3 = this.N;
                        jArr3[i49] = jArr3[i18] + j27;
                        ((java.util.ArrayList) this.A).add(nVar);
                        int i57 = i48 + e19;
                        i47++;
                        while (true) {
                            long j28 = i57;
                            int i58 = e19;
                            long j29 = this.f226759w;
                            if (j28 < j29) {
                                i27 = i58;
                                i28 = i57;
                                break;
                            }
                            i27 = i58;
                            long[] jArr4 = this.D;
                            i28 = i57;
                            if (i39 >= jArr4.length) {
                                break;
                            }
                            i57 = (int) (j28 - j29);
                            jArr4[i39] = i47;
                            i39++;
                            e19 = i27;
                        }
                        i49++;
                        e18 = i19;
                        e19 = i27;
                        i48 = i28;
                    }
                    if (j19 >= j17) {
                        break;
                    }
                    read = randomAccessFile.read(bArr);
                    i29 = 4;
                    i37 = 8;
                    i38 = 0;
                    j18 = 0;
                }
                long[] jArr5 = this.D;
                if (i39 < jArr5.length) {
                    jArr5[i39] = i47;
                }
                return j19 + 8;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.StblAtom", "stts error entryCount : " + e17);
        return -1L;
    }

    public boolean k(java.io.RandomAccessFile randomAccessFile, int i17, int i18) {
        int[] iArr;
        long[] jArr;
        int i19;
        int i27;
        long j17;
        int i28 = 0;
        if (i18 < i17) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StblAtom", "incrementCreateTimeTable, startSecond:%s, endSecond:%s, timeTable.length:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.D.length));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.R == null) {
            e();
            com.tencent.mars.xlog.Log.i("MicroMsg.StblAtom", "createChunkTable cost:%sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
        if (i17 > 0) {
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            long l17 = l(randomAccessFile, null, i17, i18);
            com.tencent.mars.xlog.Log.i("MicroMsg.StblAtom", "incrementCreateTimeTable, incrementParseStsz ret:%s, cost:%sms", java.lang.Long.valueOf(l17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
            if (l17 < 0) {
                return false;
            }
        }
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
        int min = java.lang.Math.min(i17, this.D.length - 1);
        int min2 = java.lang.Math.min(i18, this.D.length - 1);
        android.util.Pair d17 = d(i17);
        android.util.Pair d18 = d(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.StblAtom", "incrementCreateTimeTable, start:%s, end:%s, startSampleIdRange:%s, endSampleIdRange:%s, calcSampleRangeCost:%sms, chunkTable.size:%s", java.lang.Integer.valueOf(min), java.lang.Integer.valueOf(min2), d17, d18, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3), java.lang.Integer.valueOf(this.R.length));
        android.os.SystemClock.elapsedRealtime();
        while (min <= min2) {
            int i29 = (int) this.D[min];
            android.os.SystemClock.elapsedRealtime();
            int b17 = b(i29);
            android.os.SystemClock.elapsedRealtime();
            int i37 = this.R[b17 >= 1 ? b17 - 1 : i28] + 1;
            android.os.SystemClock.elapsedRealtime();
            if (this.F.length == 1) {
                j17 = r15[i28] * (i29 - i37);
            } else {
                j17 = 0;
                while (i37 <= i29) {
                    j17 += this.F[i37];
                    i37++;
                    elapsedRealtime = elapsedRealtime;
                }
            }
            long j18 = elapsedRealtime;
            android.os.SystemClock.elapsedRealtime();
            this.D[min] = c(b17) + j17;
            min++;
            elapsedRealtime = j18;
            i28 = 0;
        }
        long j19 = elapsedRealtime;
        android.os.SystemClock.elapsedRealtime();
        long j27 = this.D[min2 - 1];
        if (d17 != null && d18 != null) {
            int intValue = ((java.lang.Integer) (this.f226758J == 0 ? d17.first : d17.second)).intValue();
            int intValue2 = ((java.lang.Integer) d18.second).intValue();
            long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
            int i38 = -1;
            int i39 = -1;
            int i47 = -1;
            int i48 = -1;
            int i49 = 0;
            while (true) {
                iArr = this.G;
                if (i49 < iArr.length) {
                    if (i38 < 0 && iArr[i49] - 1 >= intValue - 1) {
                        i38 = i49;
                        i47 = i27;
                    }
                    if (i39 < 0 && iArr[i49] - 1 >= intValue2 - 1) {
                        i39 = i49;
                        i48 = i19;
                    }
                    if (i38 >= 0 && i39 >= 0) {
                        break;
                    }
                    i49++;
                } else {
                    break;
                }
            }
            if (i38 < 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.StblAtom", "not found stssStart, set to last %s", java.lang.Integer.valueOf(iArr.length - 1));
                int[] iArr2 = this.G;
                i38 = iArr2.length - 1;
                i47 = iArr2[i38] - 1;
            }
            if (i39 < 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.StblAtom", "not found stssEnd, set to last %s", java.lang.Integer.valueOf(this.G.length - 1));
                int[] iArr3 = this.G;
                i39 = iArr3.length - 1;
                i48 = iArr3[i39] - 1;
            }
            if (i48 > intValue2) {
                intValue2 = i48;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) this.A;
            if (intValue2 >= arrayList.size()) {
                intValue2 = arrayList.size() - 1;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.StblAtom", "sample id range, start:%s, end:%s, sampleList.size:%s, stssStart:%s, stssEnd:%s, stssStartSampleId:%s, stssEndSampleId:%s, lastCalcSampleTimeOffset:%s, stssSampleId.length:%s, search cost:%sms", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(this.Q), java.lang.Integer.valueOf(this.G.length), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime4));
            if (intValue2 > intValue && intValue2 < arrayList.size() && (jArr = this.N) != null && intValue2 < jArr.length) {
                long elapsedRealtime5 = android.os.SystemClock.elapsedRealtime();
                int i57 = intValue;
                while (i57 <= intValue2) {
                    d61.n nVar = (d61.n) arrayList.get(i57);
                    int i58 = i57 + 1;
                    nVar.f226755c = this.F[i58];
                    nVar.f226756d = ((((float) this.N[i57]) * 1.0f) / ((float) this.f226759w)) * 1000.0f * 1000.0f;
                    nVar.f226753a = i58;
                    i57 = i58;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.StblAtom", "increment parse sampleList cost:%sms, start:%s, lastCalcSampleTimeOffset:%s, end:%s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime5), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(this.Q), java.lang.Integer.valueOf(intValue2));
                this.Q = intValue2;
                long elapsedRealtime6 = android.os.SystemClock.elapsedRealtime();
                int[] iArr4 = this.G;
                java.util.List list = this.B;
                if (iArr4 == null) {
                    while (intValue <= intValue2) {
                        if (this.C[intValue] == null) {
                            d61.n nVar2 = (d61.n) arrayList.get(intValue);
                            nVar2.f226757e = 1;
                            android.util.Pair pair = new android.util.Pair(java.lang.Integer.valueOf(intValue), java.lang.Long.valueOf(nVar2.f226756d));
                            ((java.util.ArrayList) list).size();
                            this.C[intValue] = pair;
                        }
                        intValue++;
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.StblAtom", "increment parse stssList from sampleId, stssStart:%s, stssEnd:%s", java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i39));
                    if (i39 >= i38) {
                        while (i38 <= i39) {
                            if (this.C[i38] == null) {
                                d61.n nVar3 = (d61.n) arrayList.get(this.G[i38] - 1);
                                nVar3.f226757e = 1;
                                android.util.Pair pair2 = new android.util.Pair(java.lang.Integer.valueOf(this.G[i38] - 1), java.lang.Long.valueOf(nVar3.f226756d));
                                ((java.util.ArrayList) list).size();
                                this.C[i38] = pair2;
                            }
                            i38++;
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.StblAtom", "increment parse stssList cost:%sms, size:%s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime6), java.lang.Integer.valueOf(((java.util.ArrayList) list).size()));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StblAtom", "incrementCreateTimeTable cost:%sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j19));
        return true;
    }

    public final long l(java.io.RandomAccessFile randomAccessFile, byte[] bArr, int i17, int i18) {
        android.util.Pair d17 = d(i17);
        android.util.Pair d18 = d(i18);
        if (d17 == null || d18 == null) {
            return 0L;
        }
        int intValue = ((java.lang.Integer) (this.f226758J == 0 ? d17.first : d17.second)).intValue();
        int intValue2 = ((java.lang.Integer) d18.second).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.StblAtom", "incrementParseStsz, startSampleId:%s, endSampleId:%s, sampleSizeTable.size:%s, startRange:%s, endRange:%s, stszLazyStartPos:%s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(this.F.length), d17, d18, java.lang.Long.valueOf(this.K));
        if (intValue > intValue2) {
            return -1L;
        }
        int[] iArr = this.F;
        if (intValue > iArr.length || intValue2 > iArr.length || this.K < 0 || this.P == null) {
            return -1L;
        }
        int i19 = (intValue - 1) * 4;
        while (true) {
            byte[] bArr2 = this.P;
            if (i19 >= bArr2.length || intValue > intValue2) {
                break;
            }
            this.F[intValue] = d61.c.e(bArr2, i19);
            intValue++;
            if (0 >= this.L) {
                break;
            }
            i19 += 4;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StblAtom", "incrementParseStsz finish, filePos:%s, offset:%s, sampleSizeTableData.length:%s", java.lang.Long.valueOf(randomAccessFile.getFilePointer()), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.P.length));
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0247 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(java.io.RandomAccessFile r31) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d61.o.m(java.io.RandomAccessFile):void");
    }
}
