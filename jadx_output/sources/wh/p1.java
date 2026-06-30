package wh;

/* loaded from: classes12.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f445848a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f445849b;

    /* renamed from: c, reason: collision with root package name */
    public java.io.RandomAccessFile f445850c;

    /* renamed from: e, reason: collision with root package name */
    public int f445852e;

    /* renamed from: f, reason: collision with root package name */
    public char f445853f;

    /* renamed from: g, reason: collision with root package name */
    public char f445854g;

    /* renamed from: d, reason: collision with root package name */
    public int f445851d = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f445855h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f445856i = false;

    public p1(java.lang.String str, byte[] bArr) {
        this.f445849b = str;
        this.f445848a = bArr;
    }

    public void a() {
        java.io.RandomAccessFile randomAccessFile = this.f445850c;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (java.io.IOException unused) {
            } catch (java.lang.Throwable th6) {
                this.f445850c = null;
                throw th6;
            }
            this.f445850c = null;
        }
    }

    public boolean b() {
        java.io.RandomAccessFile randomAccessFile;
        if (this.f445855h && (randomAccessFile = this.f445850c) != null) {
            int i17 = this.f445851d;
            int i18 = this.f445852e;
            if (i17 <= i18 - 1) {
                if (i17 < i18 - 1) {
                    return true;
                }
                try {
                    this.f445852e = randomAccessFile.read(this.f445848a);
                    this.f445851d = -1;
                } catch (java.io.IOException unused) {
                    this.f445855h = false;
                    a();
                }
                return b();
            }
        }
        return false;
    }

    public final void c() {
        if (!b()) {
            throw new java.util.NoSuchElementException();
        }
        int i17 = this.f445851d + 1;
        this.f445851d = i17;
        this.f445854g = this.f445853f;
        this.f445853f = (char) this.f445848a[i17];
        this.f445856i = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r0 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        r4.flip();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        throw new wh.o1("Couldn't read string because file ended!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.nio.CharBuffer d(char r3, java.nio.CharBuffer r4) {
        /*
            r2 = this;
            r4.clear()
            r0 = 1
        L4:
            boolean r1 = r2.b()
            if (r1 == 0) goto L3d
            r2.c()
            char r1 = r2.f445853f
            if (r3 == r1) goto L2f
            boolean r0 = r4.hasRemaining()
            if (r0 != 0) goto L28
            int r0 = r4.capacity()
            int r0 = r0 * 2
            java.nio.CharBuffer r0 = java.nio.CharBuffer.allocate(r0)
            r4.flip()
            r0.put(r4)
            r4 = r0
        L28:
            char r0 = r2.f445853f
            r4.put(r0)
            r0 = 0
            goto L4
        L2f:
            if (r0 != 0) goto L35
            r2.g()
            goto L3d
        L35:
            wh.o1 r3 = new wh.o1
            java.lang.String r4 = "Couldn't read string!"
            r3.<init>(r4)
            throw r3
        L3d:
            if (r0 != 0) goto L43
            r4.flip()
            return r4
        L43:
            wh.o1 r3 = new wh.o1
            java.lang.String r4 = "Couldn't read string because file ended!"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.p1.d(char, java.nio.CharBuffer):java.nio.CharBuffer");
    }

    public java.nio.CharBuffer e(java.nio.CharBuffer charBuffer) {
        charBuffer.clear();
        boolean z17 = true;
        while (true) {
            if (!b()) {
                break;
            }
            c();
            if (!java.lang.Character.isWhitespace(this.f445853f)) {
                if (!charBuffer.hasRemaining()) {
                    java.nio.CharBuffer allocate = java.nio.CharBuffer.allocate(charBuffer.capacity() * 2);
                    charBuffer.flip();
                    allocate.put(charBuffer);
                    charBuffer = allocate;
                }
                charBuffer.put(this.f445853f);
                z17 = false;
            } else {
                if (z17) {
                    throw new wh.o1("Couldn't read string!");
                }
                g();
            }
        }
        if (z17) {
            throw new wh.o1("Couldn't read string because file ended!");
        }
        charBuffer.flip();
        return charBuffer;
    }

    public wh.p1 f() {
        this.f445855h = true;
        java.io.RandomAccessFile randomAccessFile = this.f445850c;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.seek(0L);
            } catch (java.io.IOException unused) {
                a();
            }
        }
        if (this.f445850c == null) {
            try {
                this.f445850c = new java.io.RandomAccessFile(this.f445849b, "r");
            } catch (java.io.IOException e17) {
                this.f445855h = false;
                a();
                throw new wh.s1("RAF err: " + e17.getMessage());
            }
        }
        if (this.f445855h) {
            this.f445851d = -1;
            this.f445852e = 0;
            this.f445853f = (char) 0;
            this.f445854g = (char) 0;
            this.f445856i = false;
        }
        return this;
    }

    public void finalize() {
        a();
    }

    public final void g() {
        if (this.f445856i) {
            throw new wh.o1("Can only rewind one step!");
        }
        this.f445851d--;
        this.f445853f = this.f445854g;
        this.f445856i = true;
    }
}
