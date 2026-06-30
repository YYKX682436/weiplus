package o8;

/* loaded from: classes15.dex */
public abstract class j implements o8.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Thread f343615a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f343616b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f343617c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f343618d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final o8.g[] f343619e;

    /* renamed from: f, reason: collision with root package name */
    public final o8.h[] f343620f;

    /* renamed from: g, reason: collision with root package name */
    public int f343621g;

    /* renamed from: h, reason: collision with root package name */
    public int f343622h;

    /* renamed from: i, reason: collision with root package name */
    public o8.g f343623i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Exception f343624j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f343625k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f343626l;

    public j(o8.g[] gVarArr, o8.h[] hVarArr) {
        this.f343619e = gVarArr;
        this.f343621g = gVarArr.length;
        for (int i17 = 0; i17 < this.f343621g; i17++) {
            this.f343619e[i17] = new i9.i();
        }
        this.f343620f = hVarArr;
        this.f343622h = hVarArr.length;
        for (int i18 = 0; i18 < this.f343622h; i18++) {
            this.f343620f[i18] = new i9.c((i9.b) this);
        }
        o8.i iVar = new o8.i(this);
        this.f343615a = iVar;
        iVar.start();
    }

    @Override // o8.e
    public java.lang.Object a() {
        o8.g gVar;
        synchronized (this.f343616b) {
            try {
                java.lang.Exception exc = this.f343624j;
                if (exc != null) {
                    throw exc;
                }
                t9.a.d(this.f343623i == null);
                int i17 = this.f343621g;
                if (i17 == 0) {
                    gVar = null;
                } else {
                    o8.g[] gVarArr = this.f343619e;
                    int i18 = i17 - 1;
                    this.f343621g = i18;
                    gVar = gVarArr[i18];
                }
                this.f343623i = gVar;
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        return gVar;
    }

    @Override // o8.e
    public void c(java.lang.Object obj) {
        o8.g gVar = (o8.g) obj;
        synchronized (this.f343616b) {
            try {
                java.lang.Exception exc = this.f343624j;
                if (exc != null) {
                    throw exc;
                }
                boolean z17 = true;
                t9.a.a(gVar == this.f343623i);
                this.f343617c.addLast(gVar);
                if (this.f343617c.isEmpty() || this.f343622h <= 0) {
                    z17 = false;
                }
                if (z17) {
                    this.f343616b.notify();
                }
                this.f343623i = null;
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }

    public final boolean d() {
        synchronized (this.f343616b) {
            while (!this.f343626l) {
                try {
                    if (!this.f343617c.isEmpty() && this.f343622h > 0) {
                        break;
                    }
                    this.f343616b.wait();
                } finally {
                }
            }
            if (this.f343626l) {
                return false;
            }
            o8.g gVar = (o8.g) this.f343617c.removeFirst();
            o8.h[] hVarArr = this.f343620f;
            int i17 = this.f343622h - 1;
            this.f343622h = i17;
            o8.h hVar = hVarArr[i17];
            boolean z17 = this.f343625k;
            this.f343625k = false;
            if (gVar.b(4)) {
                hVar.f343594d = 4 | hVar.f343594d;
            } else {
                if (gVar.k()) {
                    hVar.f343594d |= Integer.MIN_VALUE;
                }
                i9.b bVar = (i9.b) this;
                i9.i iVar = (i9.i) gVar;
                i9.j jVar = (i9.j) hVar;
                try {
                    java.nio.ByteBuffer byteBuffer = iVar.f343610f;
                    i9.d f17 = bVar.f(byteBuffer.array(), byteBuffer.limit(), z17);
                    long j17 = iVar.f343611g;
                    long j18 = iVar.f289670i;
                    jVar.f343613e = j17;
                    jVar.f289671f = f17;
                    if (j18 != com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                        j17 = j18;
                    }
                    jVar.f289672g = j17;
                    jVar.f343594d &= Integer.MAX_VALUE;
                    e = null;
                } catch (i9.f e17) {
                    e = e17;
                }
                this.f343624j = e;
                if (e != null) {
                    synchronized (this.f343616b) {
                    }
                    return false;
                }
            }
            synchronized (this.f343616b) {
                if (this.f343625k) {
                    e(hVar);
                } else if (hVar.k()) {
                    e(hVar);
                } else {
                    this.f343618d.addLast(hVar);
                }
                gVar.l();
                int i18 = this.f343621g;
                this.f343621g = i18 + 1;
                this.f343619e[i18] = gVar;
            }
            return true;
        }
    }

    @Override // o8.e
    public java.lang.Object dequeueOutputBuffer() {
        synchronized (this.f343616b) {
            try {
                java.lang.Exception exc = this.f343624j;
                if (exc != null) {
                    throw exc;
                }
                if (this.f343618d.isEmpty()) {
                    return null;
                }
                return (o8.h) this.f343618d.removeFirst();
            } finally {
            }
        }
    }

    public final void e(o8.h hVar) {
        i9.j jVar = (i9.j) hVar;
        jVar.f343594d = 0;
        jVar.f289671f = null;
        int i17 = this.f343622h;
        this.f343622h = i17 + 1;
        this.f343620f[i17] = hVar;
    }

    @Override // o8.e
    public final void flush() {
        synchronized (this.f343616b) {
            this.f343625k = true;
            o8.g gVar = this.f343623i;
            if (gVar != null) {
                gVar.l();
                int i17 = this.f343621g;
                this.f343621g = i17 + 1;
                this.f343619e[i17] = gVar;
                this.f343623i = null;
            }
            while (!this.f343617c.isEmpty()) {
                o8.g gVar2 = (o8.g) this.f343617c.removeFirst();
                gVar2.l();
                int i18 = this.f343621g;
                this.f343621g = i18 + 1;
                this.f343619e[i18] = gVar2;
            }
            while (!this.f343618d.isEmpty()) {
                e((o8.h) this.f343618d.removeFirst());
            }
        }
    }

    @Override // o8.e
    public void release() {
        synchronized (this.f343616b) {
            this.f343626l = true;
            this.f343616b.notify();
        }
        try {
            this.f343615a.join();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        }
    }
}
