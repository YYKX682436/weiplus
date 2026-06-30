package l4;

/* loaded from: classes13.dex */
public class u implements p4.h, p4.g {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.TreeMap f315760o = new java.util.TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.String f315761d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f315762e;

    /* renamed from: f, reason: collision with root package name */
    public final double[] f315763f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String[] f315764g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[][] f315765h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f315766i;

    /* renamed from: m, reason: collision with root package name */
    public final int f315767m;

    /* renamed from: n, reason: collision with root package name */
    public int f315768n;

    public u(int i17) {
        this.f315767m = i17;
        int i18 = i17 + 1;
        this.f315766i = new int[i18];
        this.f315762e = new long[i18];
        this.f315763f = new double[i18];
        this.f315764g = new java.lang.String[i18];
        this.f315765h = new byte[i18];
    }

    public static l4.u c(java.lang.String str, int i17) {
        java.util.TreeMap treeMap = f315760o;
        synchronized (treeMap) {
            java.util.Map.Entry ceilingEntry = treeMap.ceilingEntry(java.lang.Integer.valueOf(i17));
            if (ceilingEntry == null) {
                l4.u uVar = new l4.u(i17);
                uVar.f315761d = str;
                uVar.f315768n = i17;
                return uVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            l4.u uVar2 = (l4.u) ceilingEntry.getValue();
            uVar2.f315761d = str;
            uVar2.f315768n = i17;
            return uVar2;
        }
    }

    @Override // p4.h
    public java.lang.String a() {
        return this.f315761d;
    }

    @Override // p4.h
    public void b(p4.g gVar) {
        for (int i17 = 1; i17 <= this.f315768n; i17++) {
            int i18 = this.f315766i[i17];
            if (i18 == 1) {
                gVar.bindNull(i17);
            } else if (i18 == 2) {
                gVar.bindLong(i17, this.f315762e[i17]);
            } else if (i18 == 3) {
                gVar.bindDouble(i17, this.f315763f[i17]);
            } else if (i18 == 4) {
                gVar.bindString(i17, this.f315764g[i17]);
            } else if (i18 == 5) {
                gVar.bindBlob(i17, this.f315765h[i17]);
            }
        }
    }

    @Override // p4.g
    public void bindBlob(int i17, byte[] bArr) {
        this.f315766i[i17] = 5;
        this.f315765h[i17] = bArr;
    }

    @Override // p4.g
    public void bindDouble(int i17, double d17) {
        this.f315766i[i17] = 3;
        this.f315763f[i17] = d17;
    }

    @Override // p4.g
    public void bindLong(int i17, long j17) {
        this.f315766i[i17] = 2;
        this.f315762e[i17] = j17;
    }

    @Override // p4.g
    public void bindNull(int i17) {
        this.f315766i[i17] = 1;
    }

    @Override // p4.g
    public void bindString(int i17, java.lang.String str) {
        this.f315766i[i17] = 4;
        this.f315764g[i17] = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void release() {
        java.util.TreeMap treeMap = f315760o;
        synchronized (treeMap) {
            treeMap.put(java.lang.Integer.valueOf(this.f315767m), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                java.util.Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i17 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i17;
                }
            }
        }
    }
}
