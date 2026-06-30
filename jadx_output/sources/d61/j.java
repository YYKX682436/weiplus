package d61;

/* loaded from: classes14.dex */
public class j implements d61.f {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f226726a;

    /* renamed from: b, reason: collision with root package name */
    public long f226727b;

    /* renamed from: c, reason: collision with root package name */
    public long f226728c;

    /* renamed from: d, reason: collision with root package name */
    public int f226729d;

    /* renamed from: f, reason: collision with root package name */
    public long[] f226731f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f226732g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f226733h;

    /* renamed from: i, reason: collision with root package name */
    public android.util.Pair[] f226734i;

    /* renamed from: k, reason: collision with root package name */
    public java.io.RandomAccessFile f226736k;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f226730e = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public d61.o f226735j = null;

    /* renamed from: l, reason: collision with root package name */
    public boolean f226737l = false;

    /* renamed from: m, reason: collision with root package name */
    public int f226738m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f226739n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Comparator f226740o = new d61.i(this);

    /* renamed from: p, reason: collision with root package name */
    public int f226741p = 0;

    @Override // d61.f
    public boolean a(java.lang.String str, long j17) {
        m();
        this.f226726a = str;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            return false;
        }
        try {
            java.io.RandomAccessFile B = com.tencent.mm.vfs.w6.B(this.f226726a, false);
            this.f226736k = B;
            return l(B, j17);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // d61.f
    public boolean b(int i17, int i18, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PInt pInt2) {
        int i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "[before] curPlaySecond %d, cacheSecond %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (this.f226731f == null) {
            return false;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i27 = i17 < 0 ? 0 : i17;
        int length = this.f226731f.length;
        if (i27 >= length || i18 >= length) {
            i27 = length - 2;
            i19 = length - 1;
        } else {
            i19 = i18;
        }
        int i28 = i27;
        if (this.f226737l) {
            try {
                g(java.lang.Math.max(i28, i19));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mp4Parser2", e17, "videoTimeToFilePos, checkUpdateLazyParseTimeTable error", new java.lang.Object[0]);
            }
        }
        long[] jArr = this.f226731f;
        long j17 = jArr[i28];
        long j18 = jArr[i19];
        if (j17 < 0 || j18 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mp4Parser2", "videoTimeToFilePos error, not parse this entry now");
        }
        if (i28 == 0) {
            pInt.value = 0;
            pInt2.value = (int) j18;
        } else {
            int i29 = (int) j17;
            pInt.value = i29;
            pInt2.value = ((int) j18) - i29;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "[after] curPlaySecond %d, cacheSecond %d, offset.value %d, length.value %d, cost %sms", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(pInt.value), java.lang.Integer.valueOf(pInt2.value), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return true;
    }

    @Override // d61.f
    public int c() {
        return this.f226729d;
    }

    @Override // d61.f
    public int d(int i17, int i18) {
        if (this.f226731f == null) {
            return 0;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = i17 + i18;
        long[] jArr = this.f226731f;
        int length = jArr.length;
        if (this.f226737l) {
            length = this.f226738m;
            if (length >= jArr.length) {
                length = jArr.length;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "filePosToVideoTime lazy parse try search from time table, count:%s", java.lang.Integer.valueOf(length));
            try {
                g(length);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mp4Parser2", e17, "", new java.lang.Object[0]);
            }
        }
        int i19 = 0;
        int i27 = 0;
        while (i19 < length) {
            if (this.f226737l && this.f226731f[i19] < 0) {
                try {
                    g(i19);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mp4Parser2", e18, "", new java.lang.Object[0]);
                }
            }
            long j18 = this.f226731f[i19];
            if (j18 == j17) {
                break;
            }
            if (j18 < j17) {
                i27 = i19;
            } else if (j18 > j17) {
                break;
            }
            i19++;
        }
        i19 = i27;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "filePosToVideoTime, offset:%s, length:%s, filePos:%s, playtime:%s, cost:%sms", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return i19;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0124  */
    @Override // d61.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(int r13, com.tencent.mm.pointers.PInt r14, com.tencent.mm.pointers.PInt r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d61.j.e(int, com.tencent.mm.pointers.PInt, com.tencent.mm.pointers.PInt):boolean");
    }

    @Override // d61.f
    public int f() {
        try {
            if (!this.f226737l) {
                java.util.List list = this.f226733h;
                if (list == null) {
                    return 0;
                }
                if (this.f226741p == 0) {
                    this.f226741p = (int) ((((java.lang.Long) ((android.util.Pair) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 1)).second).longValue() / 1000) / 1000);
                }
                return this.f226741p;
            }
            android.util.Pair[] pairArr = this.f226734i;
            if (pairArr == null || pairArr.length <= 0) {
                return 0;
            }
            if (pairArr[pairArr.length - 1] == null) {
                g(this.f226731f.length - 1);
            }
            android.util.Pair pair = this.f226734i[r1.length - 1];
            if (pair != null && this.f226741p == 0) {
                this.f226741p = (int) ((((java.lang.Long) pair.second).longValue() / 1000) / 1000);
            }
            return this.f226741p;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mp4Parser2", e17, "get last key frame error.", new java.lang.Object[0]);
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0173, code lost:
    
        if (((java.lang.Integer) r5.first).intValue() > ((java.lang.Integer) r5.second).intValue()) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r20) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d61.j.g(int):void");
    }

    public final long[] h(java.io.RandomAccessFile randomAccessFile, long j17, byte[] bArr, boolean z17) {
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "createTimeTable, minfFilePos:%s, isVideo:%s", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17));
        randomAccessFile.seek(j17);
        d61.o oVar = (d61.o) d61.c.b(randomAccessFile, bArr, d61.a.f226695k);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "createTimeTable, stblAtom:%s, duration:%s, timeScale:%s", oVar, java.lang.Long.valueOf(this.f226728c), java.lang.Long.valueOf(this.f226727b));
        if (oVar == null) {
            return new long[0];
        }
        oVar.f226760x = this.f226728c;
        oVar.f226759w = this.f226727b;
        oVar.m(randomAccessFile);
        long[] jArr = oVar.D;
        if (z17) {
            this.f226732g = oVar.A;
            this.f226733h = oVar.B;
        }
        java.util.List list = this.f226732g;
        if (list != null && this.f226733h != null) {
            list.size();
            this.f226733h.size();
        }
        if (jArr != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "createTimeTable cost:%s, length:%s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(jArr.length));
        }
        return jArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long[] i(java.io.RandomAccessFile r32, d61.o r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d61.j.i(java.io.RandomAccessFile, d61.o, boolean):long[]");
    }

    public final d61.o j(java.io.RandomAccessFile randomAccessFile, long j17, byte[] bArr) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "findStblAtomInfo, minfFilePos:%s", java.lang.Long.valueOf(j17));
        randomAccessFile.seek(j17);
        d61.o oVar = (d61.o) d61.c.b(randomAccessFile, bArr, d61.a.f226695k);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "findStblAtomInfo, stblAtom:%s, duration:%s, timeScale:%s, cost:%s", oVar, java.lang.Long.valueOf(this.f226728c), java.lang.Long.valueOf(this.f226727b), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return oVar;
    }

    public final void k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "timeTableLength, length:%s", java.lang.Integer.valueOf(this.f226729d));
        this.f226731f = new long[this.f226729d + 2];
        java.util.Iterator it = ((java.util.ArrayList) this.f226730e).iterator();
        while (it.hasNext()) {
            long[] jArr = (long[]) it.next();
            for (int i17 = 0; i17 < jArr.length; i17++) {
                long[] jArr2 = this.f226731f;
                jArr2[i17] = java.lang.Math.max(jArr2[i17], jArr[i17]);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public boolean l(java.io.RandomAccessFile randomAccessFile, long j17) {
        byte[] bArr;
        long elapsedRealtime;
        boolean z17;
        long a17;
        long j18;
        int i17;
        long elapsedRealtime2;
        int i18;
        byte[] bArr2;
        java.io.RandomAccessFile randomAccessFile2 = randomAccessFile;
        m();
        boolean z18 = this.f226737l;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mp4ParserStat", "markParse, useLazy:" + z18);
        if (z18) {
            jx3.f.INSTANCE.w(1290L, 0L, 1L);
        } else {
            jx3.f.INSTANCE.w(1290L, 1L, 1L);
        }
        int i19 = 0;
        try {
            bArr = new byte[8];
            com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "parserExtractor");
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            d61.a b17 = d61.c.b(randomAccessFile2, bArr, d61.a.f226690f);
            android.os.SystemClock.elapsedRealtime();
            long j19 = b17.f226710d + 8;
            z17 = false;
            a17 = b17.a() - 8;
            j18 = j19;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mp4Parser2", e17, "parser mp4 error", new java.lang.Object[0]);
            return false;
        }
        while (true) {
            if (a17 <= 0) {
                i17 = 1;
                break;
            }
            randomAccessFile2.seek(j18);
            randomAccessFile2.read(bArr);
            int e18 = d61.c.e(bArr, i19);
            int e19 = d61.c.e(bArr, 4);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[i19] = java.lang.Integer.valueOf(e18);
            objArr[1] = java.lang.Integer.valueOf(e19);
            com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "read atomSize:%s, atomType:%s", objArr);
            if (e19 == d61.a.f226692h) {
                d61.p pVar = (d61.p) d61.h.a(e18, e19, j18, 0L);
                d61.g gVar = (d61.g) d61.c.b(randomAccessFile2, bArr, d61.a.f226693i);
                com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "found track atom, mdiaAtom:%s, trakAtom:%s", gVar, pVar);
                if (gVar != null && gVar.b(randomAccessFile2, bArr)) {
                    long j27 = gVar.f226724y;
                    byte[] bArr3 = bArr;
                    long j28 = d61.g.A;
                    java.util.List list = this.f226730e;
                    if (j27 != j28) {
                        i18 = e18;
                        bArr2 = bArr3;
                        i17 = 1;
                        i17 = 1;
                        i17 = 1;
                        if (j27 != d61.g.B) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "unknown mdiaAtom");
                            break;
                        }
                        if (this.f226737l && z17) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "lazy parse, ignore sound trak atom");
                            break;
                        }
                        int i27 = this.f226729d;
                        if (i27 > 30) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "current timeTableLength is:%s too long, ignore parse sound track", java.lang.Integer.valueOf(i27));
                            break;
                        }
                        this.f226727b = gVar.f226722w;
                        this.f226728c = gVar.f226723x;
                        com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "this trak atom is sound trak. timeScale: " + this.f226727b + " duration: " + this.f226728c);
                        long[] h17 = h(randomAccessFile, gVar.f226725z, bArr2, false);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "createTimeTable finish");
                        ((java.util.ArrayList) list).add(h17);
                        this.f226729d = java.lang.Math.max(this.f226729d, h17.length - 2);
                        long j29 = i18;
                        a17 -= j29;
                        j18 += j29;
                        randomAccessFile2 = randomAccessFile;
                        bArr = bArr2;
                        i19 = 0;
                        z17 = z17;
                    } else {
                        this.f226727b = gVar.f226722w;
                        this.f226728c = gVar.f226723x;
                        com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "this trak atom is video trak. timeScale: " + this.f226727b + " duration: " + this.f226728c);
                        long j37 = gVar.f226725z;
                        if (this.f226737l) {
                            d61.o j38 = j(randomAccessFile2, j37, bArr3);
                            this.f226735j = j38;
                            this.f226731f = i(randomAccessFile2, j38, true);
                            this.f226737l = this.f226735j.M;
                            java.util.ArrayList arrayList = this.f226739n;
                            arrayList.add(new android.util.Pair(0, 5));
                            this.f226738m = ((java.lang.Integer) ((android.util.Pair) arrayList.get(arrayList.size() - 1)).second).intValue();
                            this.f226729d = this.f226731f.length - 2;
                            com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "lazy parse finish, isLazyParse:%s", java.lang.Boolean.valueOf(this.f226737l));
                            bArr2 = bArr3;
                            i18 = e18;
                        } else {
                            bArr2 = bArr3;
                            i18 = e18;
                            long[] h18 = h(randomAccessFile, j37, bArr2, true);
                            com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "createTimeTable finish");
                            ((java.util.ArrayList) list).add(h18);
                            this.f226729d = java.lang.Math.max(this.f226729d, h18.length - 2);
                        }
                        int i28 = this.f226729d;
                        if (i28 > 30) {
                            i17 = 1;
                            com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "current timeTableLength is:%s too long, ignore parse other track", java.lang.Integer.valueOf(i28));
                            break;
                        }
                        i17 = 1;
                        if (this.f226737l) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "lazy parse, ignore other trak atom");
                            break;
                        }
                        z17 = true;
                        long j292 = i18;
                        a17 -= j292;
                        j18 += j292;
                        randomAccessFile2 = randomAccessFile;
                        bArr = bArr2;
                        i19 = 0;
                        z17 = z17;
                    }
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mp4Parser2", e17, "parser mp4 error", new java.lang.Object[0]);
                    return false;
                }
            }
            i18 = e18;
            bArr2 = bArr;
            long j2922 = i18;
            a17 -= j2922;
            j18 += j2922;
            randomAccessFile2 = randomAccessFile;
            bArr = bArr2;
            i19 = 0;
            z17 = z17;
        }
        if (this.f226737l) {
            elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = java.lang.Long.valueOf(elapsedRealtime2);
            objArr2[i17] = java.lang.Integer.valueOf(this.f226729d);
            com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "lazy parse finish, cost:%s, timeTableLength:%s", objArr2);
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[i17];
            objArr3[0] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "parse finish, start merge time table, cost:%s", objArr3);
            k();
            elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        }
        java.lang.Object[] objArr4 = new java.lang.Object[2];
        objArr4[0] = java.lang.Long.valueOf(elapsedRealtime2);
        objArr4[i17] = java.lang.Boolean.valueOf(this.f226737l);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser2", "parseExtractor finish, totalCost:%sms, isLazyParse:%s", objArr4);
        d61.l.f226751a.a(this.f226737l, elapsedRealtime2, this.f226729d);
        return i17;
    }

    public void m() {
        this.f226726a = null;
        this.f226731f = null;
        ((java.util.ArrayList) this.f226730e).clear();
        this.f226729d = 0;
        long j17 = 0;
        this.f226728c = j17;
        this.f226727b = j17;
        java.util.List list = this.f226732g;
        if (list != null) {
            list.clear();
        }
        java.util.List list2 = this.f226733h;
        if (list2 != null) {
            list2.clear();
        }
        java.util.ArrayList arrayList = this.f226739n;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f226734i = null;
        this.f226741p = 0;
    }

    @Override // d61.f
    public synchronized void release() {
        if (this.f226736k != null) {
            try {
                try {
                    com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Mp4Parser2", "release close file", new java.lang.Object[0]);
                    this.f226736k.close();
                    this.f226736k = null;
                    this.f226738m = 0;
                    this.f226739n.clear();
                    this.f226735j = null;
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mp4Parser2", e17, "", new java.lang.Object[0]);
                }
            } finally {
            }
        }
    }
}
