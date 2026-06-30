package n36;

/* loaded from: classes16.dex */
public final class k implements java.io.Closeable, java.io.Flushable {
    public static final java.util.regex.Pattern A = java.util.regex.Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: d, reason: collision with root package name */
    public final s36.b f334835d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.File f334836e;

    /* renamed from: f, reason: collision with root package name */
    public final java.io.File f334837f;

    /* renamed from: g, reason: collision with root package name */
    public final java.io.File f334838g;

    /* renamed from: h, reason: collision with root package name */
    public final java.io.File f334839h;

    /* renamed from: i, reason: collision with root package name */
    public final int f334840i;

    /* renamed from: m, reason: collision with root package name */
    public final long f334841m;

    /* renamed from: n, reason: collision with root package name */
    public final int f334842n;

    /* renamed from: p, reason: collision with root package name */
    public x36.l f334844p;

    /* renamed from: r, reason: collision with root package name */
    public int f334846r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f334847s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f334848t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f334849u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f334850v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f334851w;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.Executor f334853y;

    /* renamed from: o, reason: collision with root package name */
    public long f334843o = 0;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedHashMap f334845q = new java.util.LinkedHashMap(0, 0.75f, true);

    /* renamed from: x, reason: collision with root package name */
    public long f334852x = 0;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Runnable f334854z = new n36.e(this);

    public k(s36.b bVar, java.io.File file, int i17, int i18, long j17, java.util.concurrent.Executor executor) {
        this.f334835d = bVar;
        this.f334836e = file;
        this.f334840i = i17;
        this.f334837f = new java.io.File(file, "journal");
        this.f334838g = new java.io.File(file, "journal.tmp");
        this.f334839h = new java.io.File(file, "journal.bkp");
        this.f334842n = i18;
        this.f334841m = j17;
        this.f334853y = executor;
    }

    public final synchronized void a() {
        try {
            synchronized (this) {
            }
        } catch (java.lang.Throwable th6) {
            throw th6;
        }
        if (this.f334849u) {
            throw new java.lang.IllegalStateException("cache is closed");
        }
    }

    public synchronized void b(n36.h hVar, boolean z17) {
        n36.i iVar = hVar.f334819a;
        if (iVar.f334828f != hVar) {
            throw new java.lang.IllegalStateException();
        }
        if (z17 && !iVar.f334827e) {
            for (int i17 = 0; i17 < this.f334842n; i17++) {
                if (!hVar.f334820b[i17]) {
                    hVar.a();
                    throw new java.lang.IllegalStateException("Newly created entry didn't create value for index " + i17);
                }
                s36.b bVar = this.f334835d;
                java.io.File file = iVar.f334826d[i17];
                ((s36.a) bVar).getClass();
                if (!file.exists()) {
                    hVar.a();
                    return;
                }
            }
        }
        for (int i18 = 0; i18 < this.f334842n; i18++) {
            java.io.File file2 = iVar.f334826d[i18];
            if (z17) {
                ((s36.a) this.f334835d).getClass();
                if (file2.exists()) {
                    java.io.File file3 = iVar.f334825c[i18];
                    ((s36.a) this.f334835d).c(file2, file3);
                    long j17 = iVar.f334824b[i18];
                    ((s36.a) this.f334835d).getClass();
                    long length = file3.length();
                    iVar.f334824b[i18] = length;
                    this.f334843o = (this.f334843o - j17) + length;
                }
            } else {
                ((s36.a) this.f334835d).a(file2);
            }
        }
        this.f334846r++;
        iVar.f334828f = null;
        if (iVar.f334827e || z17) {
            iVar.f334827e = true;
            x36.z zVar = (x36.z) this.f334844p;
            zVar.F0("CLEAN");
            zVar.e(32);
            ((x36.z) this.f334844p).F0(iVar.f334823a);
            x36.l lVar = this.f334844p;
            for (long j18 : iVar.f334824b) {
                x36.z zVar2 = (x36.z) lVar;
                zVar2.e(32);
                zVar2.G(j18);
            }
            ((x36.z) this.f334844p).e(10);
            if (z17) {
                long j19 = this.f334852x;
                this.f334852x = 1 + j19;
                iVar.f334829g = j19;
            }
        } else {
            this.f334845q.remove(iVar.f334823a);
            x36.z zVar3 = (x36.z) this.f334844p;
            zVar3.F0("REMOVE");
            zVar3.e(32);
            ((x36.z) this.f334844p).F0(iVar.f334823a);
            ((x36.z) this.f334844p).e(10);
        }
        ((x36.z) this.f334844p).flush();
        if (this.f334843o > this.f334841m || j()) {
            this.f334853y.execute(this.f334854z);
        }
    }

    public synchronized n36.h c(java.lang.String str, long j17) {
        i();
        a();
        z(str);
        n36.i iVar = (n36.i) this.f334845q.get(str);
        if (j17 != -1 && (iVar == null || iVar.f334829g != j17)) {
            return null;
        }
        if (iVar != null && iVar.f334828f != null) {
            return null;
        }
        if (!this.f334850v && !this.f334851w) {
            this.f334844p.F0("DIRTY").e(32).F0(str).e(10);
            this.f334844p.flush();
            if (this.f334847s) {
                return null;
            }
            if (iVar == null) {
                iVar = new n36.i(this, str);
                this.f334845q.put(str, iVar);
            }
            n36.h hVar = new n36.h(this, iVar);
            iVar.f334828f = hVar;
            return hVar;
        }
        this.f334853y.execute(this.f334854z);
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f334848t && !this.f334849u) {
            for (n36.i iVar : (n36.i[]) this.f334845q.values().toArray(new n36.i[this.f334845q.size()])) {
                n36.h hVar = iVar.f334828f;
                if (hVar != null) {
                    hVar.a();
                }
            }
            x();
            this.f334844p.close();
            this.f334844p = null;
            this.f334849u = true;
            return;
        }
        this.f334849u = true;
    }

    public synchronized n36.j f(java.lang.String str) {
        i();
        a();
        z(str);
        n36.i iVar = (n36.i) this.f334845q.get(str);
        if (iVar != null && iVar.f334827e) {
            n36.j a17 = iVar.a();
            if (a17 == null) {
                return null;
            }
            this.f334846r++;
            this.f334844p.F0("READ").e(32).F0(str).e(10);
            if (j()) {
                this.f334853y.execute(this.f334854z);
            }
            return a17;
        }
        return null;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f334848t) {
            a();
            x();
            this.f334844p.flush();
        }
    }

    public synchronized void i() {
        if (this.f334848t) {
            return;
        }
        s36.b bVar = this.f334835d;
        java.io.File file = this.f334839h;
        ((s36.a) bVar).getClass();
        if (file.exists()) {
            s36.b bVar2 = this.f334835d;
            java.io.File file2 = this.f334837f;
            ((s36.a) bVar2).getClass();
            if (file2.exists()) {
                ((s36.a) this.f334835d).a(this.f334839h);
            } else {
                ((s36.a) this.f334835d).c(this.f334839h, this.f334837f);
            }
        }
        s36.b bVar3 = this.f334835d;
        java.io.File file3 = this.f334837f;
        ((s36.a) bVar3).getClass();
        if (file3.exists()) {
            try {
                p();
                l();
                this.f334848t = true;
                return;
            } catch (java.io.IOException e17) {
                t36.k.f415461a.l(5, "DiskLruCache " + this.f334836e + " is corrupt: " + e17.getMessage() + ", removing", e17);
                try {
                    close();
                    ((s36.a) this.f334835d).b(this.f334836e);
                    this.f334849u = false;
                } catch (java.lang.Throwable th6) {
                    this.f334849u = false;
                    throw th6;
                }
            }
        }
        v();
        this.f334848t = true;
    }

    public boolean j() {
        int i17 = this.f334846r;
        return i17 >= 2000 && i17 >= this.f334845q.size();
    }

    public final x36.l k() {
        x36.x xVar;
        java.io.File appendingSink = this.f334837f;
        ((s36.a) this.f334835d).getClass();
        try {
            java.util.logging.Logger logger = x36.w.f451714a;
            kotlin.jvm.internal.o.g(appendingSink, "$this$appendingSink");
            xVar = new x36.x(new java.io.FileOutputStream(appendingSink, true), new x36.j0());
        } catch (java.io.FileNotFoundException unused) {
            appendingSink.getParentFile().mkdirs();
            java.util.logging.Logger logger2 = x36.w.f451714a;
            xVar = new x36.x(new java.io.FileOutputStream(appendingSink, true), new x36.j0());
        }
        return x36.v.a(new n36.f(this, xVar));
    }

    public final void l() {
        java.io.File file = this.f334838g;
        s36.b bVar = this.f334835d;
        ((s36.a) bVar).a(file);
        java.util.Iterator it = this.f334845q.values().iterator();
        while (it.hasNext()) {
            n36.i iVar = (n36.i) it.next();
            n36.h hVar = iVar.f334828f;
            int i17 = this.f334842n;
            int i18 = 0;
            if (hVar == null) {
                while (i18 < i17) {
                    this.f334843o += iVar.f334824b[i18];
                    i18++;
                }
            } else {
                iVar.f334828f = null;
                while (i18 < i17) {
                    ((s36.a) bVar).a(iVar.f334825c[i18]);
                    ((s36.a) bVar).a(iVar.f334826d[i18]);
                    i18++;
                }
                it.remove();
            }
        }
    }

    public final void p() {
        java.io.File file = this.f334837f;
        ((s36.a) this.f334835d).getClass();
        x36.m b17 = x36.v.b(x36.v.e(file));
        try {
            x36.b0 b0Var = (x36.b0) b17;
            java.lang.String L0 = b0Var.L0();
            java.lang.String L02 = b0Var.L0();
            java.lang.String L03 = b0Var.L0();
            java.lang.String L04 = b0Var.L0();
            java.lang.String L05 = b0Var.L0();
            if (!"libcore.io.DiskLruCache".equals(L0) || !"1".equals(L02) || !java.lang.Integer.toString(this.f334840i).equals(L03) || !java.lang.Integer.toString(this.f334842n).equals(L04) || !"".equals(L05)) {
                throw new java.io.IOException("unexpected journal header: [" + L0 + ", " + L02 + ", " + L04 + ", " + L05 + "]");
            }
            int i17 = 0;
            while (true) {
                try {
                    q(b0Var.L0());
                    i17++;
                } catch (java.io.EOFException unused) {
                    this.f334846r = i17 - this.f334845q.size();
                    if (b0Var.o1()) {
                        this.f334844p = k();
                    } else {
                        v();
                    }
                    m36.e.c(b17);
                    return;
                }
            }
        } catch (java.lang.Throwable th6) {
            m36.e.c(b17);
            throw th6;
        }
    }

    public final void q(java.lang.String str) {
        java.lang.String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new java.io.IOException("unexpected journal line: ".concat(str));
        }
        int i17 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i17);
        java.util.LinkedHashMap linkedHashMap = this.f334845q;
        if (indexOf2 == -1) {
            substring = str.substring(i17);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i17, indexOf2);
        }
        n36.i iVar = (n36.i) linkedHashMap.get(substring);
        if (iVar == null) {
            iVar = new n36.i(this, substring);
            linkedHashMap.put(substring, iVar);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                iVar.f334828f = new n36.h(this, iVar);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new java.io.IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        java.lang.String[] split = str.substring(indexOf2 + 1).split(" ");
        iVar.f334827e = true;
        iVar.f334828f = null;
        if (split.length != iVar.f334830h.f334842n) {
            throw new java.io.IOException("unexpected journal line: " + java.util.Arrays.toString(split));
        }
        for (int i18 = 0; i18 < split.length; i18++) {
            try {
                iVar.f334824b[i18] = java.lang.Long.parseLong(split[i18]);
            } catch (java.lang.NumberFormatException unused) {
                throw new java.io.IOException("unexpected journal line: " + java.util.Arrays.toString(split));
            }
        }
    }

    public synchronized void v() {
        x36.x xVar;
        x36.l lVar = this.f334844p;
        if (lVar != null) {
            ((x36.z) lVar).close();
        }
        s36.b bVar = this.f334835d;
        java.io.File sink = this.f334838g;
        ((s36.a) bVar).getClass();
        try {
            java.util.logging.Logger logger = x36.w.f451714a;
            kotlin.jvm.internal.o.g(sink, "$this$sink");
            xVar = new x36.x(new java.io.FileOutputStream(sink, false), new x36.j0());
        } catch (java.io.FileNotFoundException unused) {
            sink.getParentFile().mkdirs();
            java.util.logging.Logger logger2 = x36.w.f451714a;
            xVar = new x36.x(new java.io.FileOutputStream(sink, false), new x36.j0());
        }
        x36.l a17 = x36.v.a(xVar);
        try {
            x36.z zVar = (x36.z) a17;
            zVar.F0("libcore.io.DiskLruCache");
            zVar.e(10);
            x36.z zVar2 = (x36.z) a17;
            zVar2.F0("1");
            zVar2.e(10);
            zVar2.G(this.f334840i);
            zVar2.e(10);
            zVar2.G(this.f334842n);
            zVar2.e(10);
            zVar2.e(10);
            for (n36.i iVar : this.f334845q.values()) {
                if (iVar.f334828f != null) {
                    zVar2.F0("DIRTY");
                    zVar2.e(32);
                    zVar2.F0(iVar.f334823a);
                    zVar2.e(10);
                } else {
                    zVar2.F0("CLEAN");
                    zVar2.e(32);
                    zVar2.F0(iVar.f334823a);
                    for (long j17 : iVar.f334824b) {
                        x36.z zVar3 = (x36.z) a17;
                        zVar3.e(32);
                        zVar3.G(j17);
                    }
                    zVar2.e(10);
                }
            }
            zVar2.close();
            s36.b bVar2 = this.f334835d;
            java.io.File file = this.f334837f;
            ((s36.a) bVar2).getClass();
            if (file.exists()) {
                ((s36.a) this.f334835d).c(this.f334837f, this.f334839h);
            }
            ((s36.a) this.f334835d).c(this.f334838g, this.f334837f);
            ((s36.a) this.f334835d).a(this.f334839h);
            this.f334844p = k();
            this.f334847s = false;
            this.f334851w = false;
        } catch (java.lang.Throwable th6) {
            ((x36.z) a17).close();
            throw th6;
        }
    }

    public boolean w(n36.i iVar) {
        n36.h hVar = iVar.f334828f;
        if (hVar != null) {
            hVar.c();
        }
        for (int i17 = 0; i17 < this.f334842n; i17++) {
            ((s36.a) this.f334835d).a(iVar.f334825c[i17]);
            long j17 = this.f334843o;
            long[] jArr = iVar.f334824b;
            this.f334843o = j17 - jArr[i17];
            jArr[i17] = 0;
        }
        this.f334846r++;
        x36.l e17 = this.f334844p.F0("REMOVE").e(32);
        java.lang.String str = iVar.f334823a;
        e17.F0(str).e(10);
        this.f334845q.remove(str);
        if (j()) {
            this.f334853y.execute(this.f334854z);
        }
        return true;
    }

    public void x() {
        while (this.f334843o > this.f334841m) {
            w((n36.i) this.f334845q.values().iterator().next());
        }
        this.f334850v = false;
    }

    public final void z(java.lang.String str) {
        if (A.matcher(str).matches()) {
            return;
        }
        throw new java.lang.IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }
}
