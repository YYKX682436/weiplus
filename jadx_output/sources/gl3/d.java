package gl3;

/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public java.util.BitSet f272822a = new java.util.BitSet();

    /* renamed from: b, reason: collision with root package name */
    public long f272823b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f272824c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f272825d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f272826e;

    public d(java.lang.String str) {
        this.f272826e = str;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.IndexBitMgr", "clearCache");
        this.f272822a = new java.util.BitSet(this.f272824c);
        e(0);
        if (android.text.TextUtils.isEmpty(this.f272825d)) {
            return;
        }
        gl3.e.g(this.f272825d, null);
    }

    public int b(int i17) {
        if (i17 <= this.f272823b) {
            return i17 / 8192;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Music.IndexBitMgr", "getIndex, offset is invalid, offset:%d, fileLength:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f272823b));
        return 0;
    }

    public int[] c(int i17, int i18) {
        if (i17 >= 0 && i18 >= 0) {
            long j17 = i17;
            long j18 = this.f272823b;
            if (j17 <= j18) {
                int i19 = i17 + i18;
                long j19 = i19;
                if (j19 <= j18) {
                    int[] iArr = {-1, -1};
                    int b17 = b(i17);
                    int b18 = b(i19);
                    int i27 = b17;
                    while (i27 <= b18) {
                        int i28 = i27 + 1;
                        int i29 = i28 * 8192;
                        if (i27 * 8192 >= i17 && i29 <= i19) {
                            if (iArr[0] == -1) {
                                iArr[0] = i27;
                            }
                            if (iArr[0] > i27) {
                                iArr[0] = i27;
                            }
                            if (iArr[1] == -1) {
                                iArr[1] = i27;
                            }
                            if (iArr[1] < i27) {
                                iArr[1] = i27;
                            }
                        }
                        i27 = i28;
                    }
                    if (j19 == this.f272823b && ((b18 == 0 && i17 == 0) || (b18 > 0 && i17 <= b18 * 8192))) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Music.IndexBitMgr", "write to file end!");
                        iArr[0] = b17;
                        iArr[1] = b18;
                    }
                    return iArr;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.IndexBitMgr", "getWriteBuffIndexRange offset %d, size %d, fileLength %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(this.f272823b));
        com.tencent.mars.xlog.Log.e("MicroMsg.Music.IndexBitMgr", "getWriteBuffRange invalid parameter!");
        return null;
    }

    public void d() {
        boolean z17 = false;
        if (!android.text.TextUtils.isEmpty(this.f272825d)) {
            java.util.BitSet bitSet = this.f272822a;
            byte[] bArr = new byte[bitSet.size() / 8];
            for (int i17 = 0; i17 < bitSet.size(); i17++) {
                int i18 = i17 / 8;
                bArr[i18] = (byte) (((bitSet.get(i17) ? 1 : 0) << (7 - (i17 % 8))) | bArr[i18]);
            }
            gl3.e.g(this.f272825d, bArr);
        }
        this.f272822a.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.IndexBitMgr", "saveBitCache bitSet count %d, cardinality:" + this.f272824c + "," + this.f272822a.cardinality());
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.IndexBitMgr", "isCacheComplete, count:%d, cardinality:%d", java.lang.Integer.valueOf(this.f272824c), java.lang.Integer.valueOf(this.f272822a.cardinality()));
        int i19 = this.f272824c;
        if (i19 > 0 && i19 == this.f272822a.cardinality()) {
            z17 = true;
        }
        if (z17) {
            e(1);
        }
    }

    public void e(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.IndexBitMgr", "setFileCacheComplete %d", java.lang.Integer.valueOf(i17));
        if (android.text.TextUtils.isEmpty(this.f272825d)) {
            return;
        }
        java.lang.String str = this.f272825d;
        if (gl3.e.d()) {
            ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
            com.tencent.mm.plugin.music.model.cache.ipc.n.j(str, i17);
        }
    }
}
