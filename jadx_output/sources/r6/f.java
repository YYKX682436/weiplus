package r6;

/* loaded from: classes13.dex */
public final class f implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.File f392757d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.File f392758e;

    /* renamed from: f, reason: collision with root package name */
    public final java.io.File f392759f;

    /* renamed from: g, reason: collision with root package name */
    public final java.io.File f392760g;

    /* renamed from: h, reason: collision with root package name */
    public final int f392761h;

    /* renamed from: i, reason: collision with root package name */
    public final long f392762i;

    /* renamed from: m, reason: collision with root package name */
    public final int f392763m;

    /* renamed from: o, reason: collision with root package name */
    public java.io.Writer f392765o;

    /* renamed from: q, reason: collision with root package name */
    public int f392767q;

    /* renamed from: n, reason: collision with root package name */
    public long f392764n = 0;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedHashMap f392766p = new java.util.LinkedHashMap(0, 0.75f, true);

    /* renamed from: r, reason: collision with root package name */
    public long f392768r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.ThreadPoolExecutor f392769s = new java.util.concurrent.ThreadPoolExecutor(0, 1, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new r6.b(null));

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.Callable f392770t = new r6.a(this);

    public f(java.io.File file, int i17, int i18, long j17) {
        this.f392757d = file;
        this.f392761h = i17;
        this.f392758e = new java.io.File(file, "journal");
        this.f392759f = new java.io.File(file, "journal.tmp");
        this.f392760g = new java.io.File(file, "journal.bkp");
        this.f392763m = i18;
        this.f392762i = j17;
    }

    public static void a(r6.f fVar, r6.c cVar, boolean z17) {
        synchronized (fVar) {
            r6.d dVar = cVar.f392744a;
            if (dVar.f392753f != cVar) {
                throw new java.lang.IllegalStateException();
            }
            if (z17 && !dVar.f392752e) {
                for (int i17 = 0; i17 < fVar.f392763m; i17++) {
                    if (!cVar.f392745b[i17]) {
                        cVar.a();
                        throw new java.lang.IllegalStateException("Newly created entry didn't create value for index " + i17);
                    }
                    if (!dVar.f392751d[i17].exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i18 = 0; i18 < fVar.f392763m; i18++) {
                java.io.File file = dVar.f392751d[i18];
                if (!z17) {
                    c(file);
                } else if (file.exists()) {
                    java.io.File file2 = dVar.f392750c[i18];
                    file.renameTo(file2);
                    long j17 = dVar.f392749b[i18];
                    long length = file2.length();
                    dVar.f392749b[i18] = length;
                    fVar.f392764n = (fVar.f392764n - j17) + length;
                }
            }
            fVar.f392767q++;
            dVar.f392753f = null;
            if (dVar.f392752e || z17) {
                dVar.f392752e = true;
                fVar.f392765o.append((java.lang.CharSequence) "CLEAN");
                fVar.f392765o.append(' ');
                fVar.f392765o.append((java.lang.CharSequence) dVar.f392748a);
                fVar.f392765o.append((java.lang.CharSequence) dVar.a());
                fVar.f392765o.append('\n');
                if (z17) {
                    long j18 = fVar.f392768r;
                    fVar.f392768r = 1 + j18;
                    dVar.f392754g = j18;
                }
            } else {
                fVar.f392766p.remove(dVar.f392748a);
                fVar.f392765o.append((java.lang.CharSequence) "REMOVE");
                fVar.f392765o.append(' ');
                fVar.f392765o.append((java.lang.CharSequence) dVar.f392748a);
                fVar.f392765o.append('\n');
            }
            i(fVar.f392765o);
            if (fVar.f392764n > fVar.f392762i || fVar.k()) {
                fVar.f392769s.submit(fVar.f392770t);
            }
        }
    }

    public static void b(java.io.Writer writer) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void c(java.io.File file) {
        if (file.exists() && !file.delete()) {
            throw new java.io.IOException();
        }
    }

    public static void i(java.io.Writer writer) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static r6.f l(java.io.File file, int i17, int i18, long j17) {
        if (j17 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        if (i18 <= 0) {
            throw new java.lang.IllegalArgumentException("valueCount <= 0");
        }
        java.io.File file2 = new java.io.File(file, "journal.bkp");
        if (file2.exists()) {
            java.io.File file3 = new java.io.File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                x(file2, file3, false);
            }
        }
        r6.f fVar = new r6.f(file, i17, i18, j17);
        if (fVar.f392758e.exists()) {
            try {
                fVar.q();
                fVar.p();
                return fVar;
            } catch (java.io.IOException e17) {
                java.lang.System.out.println("DiskLruCache " + file + " is corrupt: " + e17.getMessage() + ", removing");
                fVar.close();
                r6.i.a(fVar.f392757d);
            }
        }
        file.mkdirs();
        r6.f fVar2 = new r6.f(file, i17, i18, j17);
        fVar2.w();
        return fVar2;
    }

    public static void x(java.io.File file, java.io.File file2, boolean z17) {
        if (z17) {
            c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new java.io.IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f392765o == null) {
            return;
        }
        java.util.Iterator it = new java.util.ArrayList(this.f392766p.values()).iterator();
        while (it.hasNext()) {
            r6.c cVar = ((r6.d) it.next()).f392753f;
            if (cVar != null) {
                cVar.a();
            }
        }
        z();
        b(this.f392765o);
        this.f392765o = null;
    }

    public r6.c f(java.lang.String str) {
        synchronized (this) {
            if (this.f392765o == null) {
                throw new java.lang.IllegalStateException("cache is closed");
            }
            r6.d dVar = (r6.d) this.f392766p.get(str);
            if (dVar == null) {
                dVar = new r6.d(this, str, null);
                this.f392766p.put(str, dVar);
            } else if (dVar.f392753f != null) {
                return null;
            }
            r6.c cVar = new r6.c(this, dVar, null);
            dVar.f392753f = cVar;
            this.f392765o.append((java.lang.CharSequence) "DIRTY");
            this.f392765o.append(' ');
            this.f392765o.append((java.lang.CharSequence) str);
            this.f392765o.append('\n');
            i(this.f392765o);
            return cVar;
        }
    }

    public synchronized r6.e j(java.lang.String str) {
        if (this.f392765o == null) {
            throw new java.lang.IllegalStateException("cache is closed");
        }
        r6.d dVar = (r6.d) this.f392766p.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f392752e) {
            return null;
        }
        for (java.io.File file : dVar.f392750c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f392767q++;
        this.f392765o.append((java.lang.CharSequence) "READ");
        this.f392765o.append(' ');
        this.f392765o.append((java.lang.CharSequence) str);
        this.f392765o.append('\n');
        if (k()) {
            this.f392769s.submit(this.f392770t);
        }
        return new r6.e(this, str, dVar.f392754g, dVar.f392750c, dVar.f392749b, null);
    }

    public final boolean k() {
        int i17 = this.f392767q;
        return i17 >= 2000 && i17 >= this.f392766p.size();
    }

    public final void p() {
        c(this.f392759f);
        java.util.Iterator it = this.f392766p.values().iterator();
        while (it.hasNext()) {
            r6.d dVar = (r6.d) it.next();
            r6.c cVar = dVar.f392753f;
            int i17 = this.f392763m;
            int i18 = 0;
            if (cVar == null) {
                while (i18 < i17) {
                    this.f392764n += dVar.f392749b[i18];
                    i18++;
                }
            } else {
                dVar.f392753f = null;
                while (i18 < i17) {
                    c(dVar.f392750c[i18]);
                    c(dVar.f392751d[i18]);
                    i18++;
                }
                it.remove();
            }
        }
    }

    public final void q() {
        java.io.File file = this.f392758e;
        r6.h hVar = new r6.h(new java.io.FileInputStream(file), r6.i.f392777a);
        try {
            java.lang.String a17 = hVar.a();
            java.lang.String a18 = hVar.a();
            java.lang.String a19 = hVar.a();
            java.lang.String a27 = hVar.a();
            java.lang.String a28 = hVar.a();
            if (!"libcore.io.DiskLruCache".equals(a17) || !"1".equals(a18) || !java.lang.Integer.toString(this.f392761h).equals(a19) || !java.lang.Integer.toString(this.f392763m).equals(a27) || !"".equals(a28)) {
                throw new java.io.IOException("unexpected journal header: [" + a17 + ", " + a18 + ", " + a27 + ", " + a28 + "]");
            }
            int i17 = 0;
            while (true) {
                try {
                    v(hVar.a());
                    i17++;
                } catch (java.io.EOFException unused) {
                    this.f392767q = i17 - this.f392766p.size();
                    if (hVar.f392776h == -1) {
                        w();
                    } else {
                        this.f392765o = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(file, true), r6.i.f392777a));
                    }
                    try {
                        hVar.close();
                        return;
                    } catch (java.lang.RuntimeException e17) {
                        throw e17;
                    } catch (java.lang.Exception unused2) {
                        return;
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            try {
                hVar.close();
            } catch (java.lang.RuntimeException e18) {
                throw e18;
            } catch (java.lang.Exception unused3) {
            }
            throw th6;
        }
    }

    public final void v(java.lang.String str) {
        java.lang.String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new java.io.IOException("unexpected journal line: ".concat(str));
        }
        int i17 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i17);
        java.util.LinkedHashMap linkedHashMap = this.f392766p;
        if (indexOf2 == -1) {
            substring = str.substring(i17);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i17, indexOf2);
        }
        r6.d dVar = (r6.d) linkedHashMap.get(substring);
        if (dVar == null) {
            dVar = new r6.d(this, substring, null);
            linkedHashMap.put(substring, dVar);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f392753f = new r6.c(this, dVar, null);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new java.io.IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        java.lang.String[] split = str.substring(indexOf2 + 1).split(" ");
        dVar.f392752e = true;
        dVar.f392753f = null;
        if (split.length != dVar.f392755h.f392763m) {
            throw new java.io.IOException("unexpected journal line: " + java.util.Arrays.toString(split));
        }
        for (int i18 = 0; i18 < split.length; i18++) {
            try {
                dVar.f392749b[i18] = java.lang.Long.parseLong(split[i18]);
            } catch (java.lang.NumberFormatException unused) {
                throw new java.io.IOException("unexpected journal line: " + java.util.Arrays.toString(split));
            }
        }
    }

    public final synchronized void w() {
        java.io.Writer writer = this.f392765o;
        if (writer != null) {
            b(writer);
        }
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.f392759f), r6.i.f392777a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(java.lang.Integer.toString(this.f392761h));
            bufferedWriter.write("\n");
            bufferedWriter.write(java.lang.Integer.toString(this.f392763m));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (r6.d dVar : this.f392766p.values()) {
                if (dVar.f392753f != null) {
                    bufferedWriter.write("DIRTY " + dVar.f392748a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + dVar.f392748a + dVar.a() + '\n');
                }
            }
            b(bufferedWriter);
            if (this.f392758e.exists()) {
                x(this.f392758e, this.f392760g, true);
            }
            x(this.f392759f, this.f392758e, false);
            this.f392760g.delete();
            this.f392765o = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.f392758e, true), r6.i.f392777a));
        } catch (java.lang.Throwable th6) {
            b(bufferedWriter);
            throw th6;
        }
    }

    public final void z() {
        while (this.f392764n > this.f392762i) {
            java.lang.String str = (java.lang.String) ((java.util.Map.Entry) this.f392766p.entrySet().iterator().next()).getKey();
            synchronized (this) {
                if (this.f392765o == null) {
                    throw new java.lang.IllegalStateException("cache is closed");
                }
                r6.d dVar = (r6.d) this.f392766p.get(str);
                if (dVar != null && dVar.f392753f == null) {
                    for (int i17 = 0; i17 < this.f392763m; i17++) {
                        java.io.File file = dVar.f392750c[i17];
                        if (file.exists() && !file.delete()) {
                            throw new java.io.IOException("failed to delete " + file);
                        }
                        long j17 = this.f392764n;
                        long[] jArr = dVar.f392749b;
                        this.f392764n = j17 - jArr[i17];
                        jArr[i17] = 0;
                    }
                    this.f392767q++;
                    this.f392765o.append((java.lang.CharSequence) "REMOVE");
                    this.f392765o.append(' ');
                    this.f392765o.append((java.lang.CharSequence) str);
                    this.f392765o.append('\n');
                    this.f392766p.remove(str);
                    if (k()) {
                        this.f392769s.submit(this.f392770t);
                    }
                }
            }
        }
    }
}
