package kj;

/* loaded from: classes12.dex */
public class c extends kj.g0 implements jj.d {

    /* renamed from: e, reason: collision with root package name */
    public gj.e f308187e;

    /* renamed from: f, reason: collision with root package name */
    public long f308188f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f308189g;

    public c(ej.c cVar) {
        this.f308188f = cVar.f253254a != null ? ((com.tencent.mm.matrix.o0) r0).a("clicfg_matrix_trace_evil_method_threshold", 700) : 700;
        this.f308189g = cVar.f253255b;
    }

    @Override // jj.d
    public void b(java.lang.String str, long j17, long j18) {
        long j19 = (j18 - j17) / 1000000;
        try {
            if (j19 >= this.f308188f) {
                long[] copyData = com.tencent.matrix.trace.core.AppMethodBeat.getInstance().copyData(this.f308187e);
                oj.g.a().post(new kj.b(com.tencent.matrix.lifecycle.owners.f0.f52739u, com.tencent.matrix.lifecycle.owners.f0.f52740v, copyData, j19, j18));
            }
        } finally {
            this.f308187e.a();
        }
    }

    @Override // jj.d
    public void c(java.lang.String str) {
        this.f308187e = com.tencent.matrix.trace.core.AppMethodBeat.getInstance().maskIndex("EvilMethodTracer#dispatchBegin");
    }

    @Override // kj.g0
    public void d() {
        super.d();
        if (this.f308189g) {
            gj.k kVar = gj.k.f272354q;
            synchronized (kVar.f272361i) {
                ((java.util.HashMap) kVar.f272361i).put(this, new gj.g(this));
            }
        }
    }

    @Override // kj.g0
    public void f() {
        super.f();
        if (this.f308189g) {
            gj.k.d(this);
        }
    }

    @Override // jj.d
    public boolean isValid() {
        return true;
    }
}
