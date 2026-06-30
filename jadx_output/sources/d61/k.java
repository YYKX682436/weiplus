package d61;

/* loaded from: classes14.dex */
public class k implements d61.f {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f226742a;

    /* renamed from: b, reason: collision with root package name */
    public long f226743b;

    /* renamed from: c, reason: collision with root package name */
    public long f226744c;

    /* renamed from: d, reason: collision with root package name */
    public long f226745d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f226746e;

    /* renamed from: f, reason: collision with root package name */
    public int f226747f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f226748g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f226749h;

    /* renamed from: i, reason: collision with root package name */
    public int f226750i = 0;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.Mp4Parser", "mdia atom parser fail.");
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[Catch: all -> 0x009f, Exception -> 0x00c1, TryCatch #7 {Exception -> 0x00c1, all -> 0x009f, blocks: (B:17:0x0051, B:24:0x0065, B:26:0x006f, B:28:0x0075, B:32:0x0083, B:34:0x0096, B:38:0x00a1, B:42:0x00af, B:50:0x005a), top: B:16:0x0051 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0095 -> B:20:0x00b4). Please report as a decompilation issue!!! */
    @Override // d61.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r11, long r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d61.k.a(java.lang.String, long):boolean");
    }

    @Override // d61.f
    public boolean b(int i17, int i18, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PInt pInt2) {
        long[] jArr = this.f226746e;
        if (jArr == null) {
            return false;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        int length = jArr.length;
        if (i17 >= length || i18 >= length) {
            i17 = length - 2;
            i18 = length - 1;
        }
        long j17 = jArr[i17];
        long j18 = jArr[i18];
        if (i17 == 0) {
            pInt.value = 0;
            pInt2.value = (int) j18;
        } else {
            int i19 = (int) j17;
            pInt.value = i19;
            pInt2.value = ((int) j18) - i19;
        }
        return true;
    }

    @Override // d61.f
    public int c() {
        return this.f226747f;
    }

    @Override // d61.f
    public int d(int i17, int i18) {
        int i19 = 0;
        if (this.f226746e == null) {
            return 0;
        }
        long j17 = i17 + i18;
        int i27 = 0;
        while (true) {
            long[] jArr = this.f226746e;
            if (i19 >= jArr.length) {
                break;
            }
            long j18 = jArr[i19];
            if (j18 == j17) {
                return i19;
            }
            if (j18 < j17) {
                i27 = i19;
            } else if (j18 > j17) {
                break;
            }
            i19++;
        }
        return i27;
    }

    @Override // d61.f
    public boolean e(int i17, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PInt pInt2) {
        boolean z17;
        java.util.List list;
        boolean z18 = false;
        try {
            list = this.f226749h;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mp4Parser", e17, "seekVFrame seekTime[%d]", java.lang.Integer.valueOf(i17));
        }
        if (list == null) {
            return false;
        }
        int size = ((java.util.ArrayList) list).size();
        long j17 = i17 * 1000 * 1000;
        pInt2.value = 0;
        pInt.value = 0;
        int i18 = 0;
        while (true) {
            z17 = true;
            if (i18 >= size) {
                break;
            }
            android.util.Pair pair = (android.util.Pair) ((java.util.ArrayList) this.f226749h).get(i18);
            if (((java.lang.Long) pair.second).longValue() > j17) {
                pInt2.value = (int) ((((java.lang.Long) pair.second).longValue() / 1000) / 1000);
                z18 = true;
                break;
            }
            pInt.value = (int) ((((java.lang.Long) pair.second).longValue() / 1000) / 1000);
            i18++;
        }
        if (!z18) {
            pInt.value = (int) ((((java.lang.Long) ((android.util.Pair) ((java.util.ArrayList) this.f226749h).get(size - 1)).second).longValue() / 1000) / 1000);
            pInt2.value = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser", "seek key Frame seekTime[%d] pre[%d] next[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(pInt.value), java.lang.Integer.valueOf(pInt2.value));
            return z17;
        }
        z17 = z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mp4Parser", "seek key Frame seekTime[%d] pre[%d] next[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(pInt.value), java.lang.Integer.valueOf(pInt2.value));
        return z17;
    }

    @Override // d61.f
    public int f() {
        try {
            java.util.List list = this.f226749h;
            if (list == null) {
                return 0;
            }
            if (this.f226750i == 0) {
                this.f226750i = (int) ((((java.lang.Long) ((android.util.Pair) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 1)).second).longValue() / 1000) / 1000);
            }
            return this.f226750i;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mp4Parser", e17, "get last key frame error.", new java.lang.Object[0]);
            return 0;
        }
    }

    public final void g(java.io.RandomAccessFile randomAccessFile, long j17, byte[] bArr) {
        randomAccessFile.seek(j17);
        d61.o oVar = (d61.o) d61.c.b(randomAccessFile, bArr, d61.a.f226695k);
        if (oVar != null) {
            oVar.f226760x = this.f226745d;
            oVar.f226759w = this.f226744c;
            oVar.m(randomAccessFile);
            this.f226746e = oVar.D;
            this.f226747f = r1.length - 2;
            this.f226748g = oVar.A;
            this.f226749h = oVar.B;
        }
    }

    public void h() {
        this.f226742a = null;
        this.f226746e = null;
        this.f226747f = 0;
        long j17 = 0;
        this.f226745d = j17;
        this.f226744c = j17;
        this.f226743b = j17;
        java.util.List list = this.f226748g;
        if (list != null) {
            ((java.util.ArrayList) list).clear();
        }
        java.util.List list2 = this.f226749h;
        if (list2 != null) {
            ((java.util.ArrayList) list2).clear();
        }
        this.f226750i = 0;
    }

    @Override // d61.f
    public void release() {
        h();
    }
}
