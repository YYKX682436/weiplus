package l51;

/* loaded from: classes12.dex */
public class b implements com.tencent.mm.mm7zip.IInStream, com.tencent.mm.mm7zip.IOutStream {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f316545d;

    /* renamed from: e, reason: collision with root package name */
    public final int f316546e;

    /* renamed from: f, reason: collision with root package name */
    public final int f316547f;

    /* renamed from: g, reason: collision with root package name */
    public int f316548g;

    /* renamed from: h, reason: collision with root package name */
    public int f316549h;

    /* renamed from: i, reason: collision with root package name */
    public int f316550i;

    /* renamed from: m, reason: collision with root package name */
    public int f316551m;

    /* renamed from: n, reason: collision with root package name */
    public int f316552n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f316553o;

    /* renamed from: p, reason: collision with root package name */
    public final h51.h f316554p;

    /* renamed from: q, reason: collision with root package name */
    public final int f316555q;

    /* renamed from: r, reason: collision with root package name */
    public final int f316556r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f316557s;

    /* renamed from: t, reason: collision with root package name */
    public final l51.a f316558t;

    public b(java.lang.String str, int i17, int i18, h51.h hVar, l51.a aVar, int i19) {
        int i27 = 1024 > i18 ? i18 : 1024;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f316545d = arrayList;
        this.f316557s = new java.util.HashMap();
        this.f316546e = i27;
        if (i18 < 0) {
            throw new java.lang.IllegalStateException("Maximal size of the byte array stream should be >0");
        }
        if (i27 < 0) {
            throw new java.lang.IllegalStateException("Initial size of the byte array stream should be >0");
        }
        this.f316547f = i18;
        b();
        b();
        arrayList.add(new byte[0]);
        this.f316550i = 0;
        this.f316548g = 0;
        this.f316549h = 0;
        this.f316551m = i18;
        int i28 = h51.g.f279027a;
        this.f316555q = i17;
        try {
            this.f316554p = hVar;
        } catch (java.lang.Exception unused) {
        }
        this.f316558t = aVar;
        this.f316556r = i19;
    }

    public final void a(int i17) {
        int i18 = this.f316550i;
        java.util.List list = this.f316545d;
        if (i18 == -1 || (i18 == ((java.util.ArrayList) list).size() - 1 && this.f316551m == this.f316549h)) {
            this.f316549h = 0;
            this.f316550i++;
        }
        int i19 = this.f316551m;
        int i27 = this.f316547f;
        if (i19 >= i27) {
            throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached. (Max size = " + i27 + ")");
        }
        int i28 = ((java.util.ArrayList) list).size() + (-1) == -1 ? this.f316546e : this.f316551m << 1;
        if (i28 < 0 || i28 > 10485760) {
            i28 = 10485760;
        }
        int i29 = this.f316551m;
        if (i29 + i28 > i27) {
            i28 = i27 - i29;
        }
        if (i17 == -1 || i28 >= i17) {
            i17 = i28;
        } else if (i29 + i17 >= i27) {
            throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached. (Max size = " + i27 + ")");
        }
        ((java.util.ArrayList) list).add(new byte[i17]);
    }

    public final void b() {
        this.f316545d.clear();
        this.f316548g = 0;
        this.f316549h = 0;
        this.f316550i = -1;
        this.f316551m = 0;
        this.f316552n = -1;
        com.tencent.stubs.logger.Log.i("ByteArrayStreamTest", "init , fileName = " + this.f316553o);
    }

    public final void c() {
        int i17 = this.f316552n;
        if (i17 == -1) {
            return;
        }
        if (this.f316548g == i17) {
            this.f316552n = -1;
            return;
        }
        if (i17 > this.f316551m) {
            i(i17, true);
            this.f316552n = -1;
            return;
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            java.util.List list = this.f316545d;
            if (i18 >= ((java.util.ArrayList) list).size()) {
                this.f316550i = ((java.util.ArrayList) list).size() - 1;
                int i27 = this.f316551m;
                this.f316549h = i27;
                this.f316548g = i27;
                this.f316552n = -1;
                return;
            }
            int i28 = this.f316551m;
            i19 += i28;
            int i29 = this.f316552n;
            if (i19 > i29) {
                this.f316550i = i18;
                this.f316549h = i28 - (i19 - i29);
                this.f316548g = i29;
                this.f316552n = -1;
                return;
            }
            i18++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public synchronized void f(byte[] bArr, boolean z17) {
        b();
        int length = bArr.length;
        if (z17) {
            byte[] bArr2 = new byte[length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
            bArr = bArr2;
        }
        ((java.util.ArrayList) this.f316545d).add(bArr);
        this.f316550i = 0;
        this.f316548g = 0;
        this.f316549h = 0;
        this.f316551m = length;
    }

    public final synchronized void i(long j17, boolean z17) {
        if (j17 == 0) {
            synchronized (this) {
                b();
            }
            return;
        }
        if (j17 > this.f316547f) {
            throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached by setSize(" + j17 + "). Maximal size is " + this.f316547f + " bytes");
        }
        int i17 = this.f316551m;
        if (j17 > i17) {
            if (i17 == 0) {
                int i18 = (int) j17;
                ((java.util.ArrayList) this.f316545d).add(new byte[i18]);
                this.f316550i = 0;
                this.f316551m = i18;
            }
            int i19 = this.f316551m;
            int i27 = (int) (j17 - i19);
            if (i19 < i27) {
                this.f316551m = i19 + i19;
                int i28 = i27 - i19;
                a(i28);
                if (z17) {
                    this.f316549h = i28;
                }
            } else if (z17) {
                this.f316549h = (i19 - i19) + i27;
            }
            if (z17) {
                this.f316550i = ((java.util.ArrayList) this.f316545d).size() - 1;
                this.f316548g = (int) j17;
            }
            this.f316551m = (int) j17;
        }
        if (j17 < this.f316551m) {
            int i29 = 0;
            for (int i37 = 0; i37 < ((java.util.ArrayList) this.f316545d).size(); i37++) {
                i29 += this.f316551m;
                if (i29 >= j17) {
                    for (int size = ((java.util.ArrayList) this.f316545d).size() - 1; size > i37; size--) {
                        ((java.util.ArrayList) this.f316545d).remove(size);
                    }
                    int i38 = this.f316552n;
                    if (i38 != -1 && i38 > j17) {
                        this.f316552n = (int) j17;
                    } else if (this.f316548g > j17) {
                        int i39 = (int) j17;
                        this.f316548g = i39;
                        this.f316549h = (i39 - i29) + this.f316551m;
                        this.f316550i = i37;
                    }
                    this.f316551m = (int) j17;
                }
            }
        }
    }

    @Override // com.tencent.mm.mm7zip.ISequentialInStream
    public int read(byte[] bArr) {
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (bArr.length >= 0 + length) {
                    if (this.f316552n > this.f316551m) {
                        return 0;
                    }
                    c();
                    int i17 = this.f316548g;
                    int i18 = i17 + length;
                    int i19 = this.f316551m;
                    if (i18 > i19) {
                        length = i19 - i17;
                    }
                    try {
                        this.f316554p.a(this.f316555q + i17, length);
                        if (length > 0) {
                            int i27 = this.f316551m;
                            int i28 = i27 - this.f316549h;
                            if (length <= i28) {
                                i28 = length;
                            }
                            try {
                                h51.h hVar = this.f316554p;
                                hVar.getClass();
                                hVar.read(bArr, 0, bArr.length);
                            } catch (java.io.IOException e17) {
                                com.tencent.stubs.logger.Log.e("ByteArrayStreamTestDiff", "IOException， read1 = " + e17);
                            } catch (java.lang.Exception e18) {
                                com.tencent.stubs.logger.Log.e("ByteArrayStreamTestDiff", "Exception， read1 = " + e18);
                            }
                            int i29 = this.f316549h + i28;
                            this.f316549h = i29;
                            if (i29 >= i27 && this.f316550i < ((java.util.ArrayList) this.f316545d).size() - 1) {
                                this.f316550i++;
                                this.f316549h = 0;
                            }
                        }
                    } catch (java.lang.Exception e19) {
                        com.tencent.stubs.logger.Log.e("ByteArrayStreamTestDiff", "read = " + e19);
                    }
                    this.f316548g += length;
                    if (this.f316557s.get(this.f316553o) != null) {
                        java.util.HashMap hashMap = this.f316557s;
                        java.lang.String str = this.f316553o;
                        hashMap.put(str, java.lang.Integer.valueOf(((java.lang.Integer) hashMap.get(str)).intValue() + 1));
                    } else {
                        this.f316557s.put(this.f316553o, 1);
                    }
                    if (length == 0) {
                        f(new byte[0], false);
                        this.f316557s.remove(this.f316553o);
                        l51.a aVar = this.f316558t;
                        if (aVar != null) {
                            ((l51.h) aVar).b(this.f316556r, this.f316553o);
                        }
                    }
                    return length;
                }
            }
            throw new java.lang.IllegalStateException("Invalid start position (0) and length (" + length + ")");
        }
    }

    @Override // com.tencent.mm.mm7zip.ISeekableStream
    public synchronized long seek(long j17, int i17) {
        int i18;
        try {
            if (i17 != 0) {
                if (i17 == 1) {
                    i18 = this.f316552n;
                    if (i18 == -1) {
                        i18 = this.f316548g;
                    }
                } else {
                    if (i17 != 2) {
                        throw new com.tencent.mm.mm7zip.SevenZipException("Seek: unknown origin: " + i17);
                    }
                    i18 = this.f316551m;
                }
                j17 += i18;
            }
            if (j17 > this.f316547f) {
                throw new java.lang.RuntimeException("Maximal size of the byte array stream was reached by seek to " + j17 + ", maximal size is " + this.f316547f + " bytes");
            }
            this.f316552n = (int) j17;
        } catch (java.lang.Throwable th6) {
            throw th6;
        }
        return j17;
    }

    @Override // com.tencent.mm.mm7zip.IOutStream
    public synchronized void setSize(long j17) {
        i(j17, false);
    }

    @Override // com.tencent.mm.mm7zip.ISequentialOutStream
    public int write(byte[] bArr) {
        return bArr.length;
    }
}
