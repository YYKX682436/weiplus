package n36;

/* loaded from: classes16.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final n36.i f334819a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f334820b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f334821c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n36.k f334822d;

    public h(n36.k kVar, n36.i iVar) {
        this.f334822d = kVar;
        this.f334819a = iVar;
        this.f334820b = iVar.f334827e ? null : new boolean[kVar.f334842n];
    }

    public void a() {
        synchronized (this.f334822d) {
            if (this.f334821c) {
                throw new java.lang.IllegalStateException();
            }
            if (this.f334819a.f334828f == this) {
                this.f334822d.b(this, false);
            }
            this.f334821c = true;
        }
    }

    public void b() {
        synchronized (this.f334822d) {
            if (this.f334821c) {
                throw new java.lang.IllegalStateException();
            }
            if (this.f334819a.f334828f == this) {
                this.f334822d.b(this, true);
            }
            this.f334821c = true;
        }
    }

    public void c() {
        n36.i iVar = this.f334819a;
        if (iVar.f334828f != this) {
            return;
        }
        int i17 = 0;
        while (true) {
            n36.k kVar = this.f334822d;
            if (i17 >= kVar.f334842n) {
                iVar.f334828f = null;
                return;
            }
            try {
                ((s36.a) kVar.f334835d).a(iVar.f334826d[i17]);
            } catch (java.io.IOException unused) {
            }
            i17++;
        }
    }

    public x36.f0 d(int i17) {
        x36.x xVar;
        synchronized (this.f334822d) {
            if (this.f334821c) {
                throw new java.lang.IllegalStateException();
            }
            n36.i iVar = this.f334819a;
            if (iVar.f334828f != this) {
                return new x36.h();
            }
            if (!iVar.f334827e) {
                this.f334820b[i17] = true;
            }
            java.io.File sink = iVar.f334826d[i17];
            try {
                ((s36.a) this.f334822d.f334835d).getClass();
                try {
                    java.util.logging.Logger logger = x36.w.f451714a;
                    kotlin.jvm.internal.o.g(sink, "$this$sink");
                    xVar = new x36.x(new java.io.FileOutputStream(sink, false), new x36.j0());
                } catch (java.io.FileNotFoundException unused) {
                    sink.getParentFile().mkdirs();
                    java.util.logging.Logger logger2 = x36.w.f451714a;
                    xVar = new x36.x(new java.io.FileOutputStream(sink, false), new x36.j0());
                }
                return new n36.g(this, xVar);
            } catch (java.io.FileNotFoundException unused2) {
                return new x36.h();
            }
        }
    }
}
