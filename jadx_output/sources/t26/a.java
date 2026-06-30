package t26;

/* loaded from: classes14.dex */
public final class a extends t26.d {
    private volatile t26.a _immediate;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f415344e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f415345f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f415346g;

    /* renamed from: h, reason: collision with root package name */
    public final t26.a f415347h;

    public a(android.os.Handler handler, java.lang.String str, boolean z17) {
        super(null);
        this.f415344e = handler;
        this.f415345f = str;
        this.f415346g = z17;
        this._immediate = z17 ? this : null;
        t26.a aVar = this._immediate;
        if (aVar == null) {
            aVar = new t26.a(handler, str, true);
            this._immediate = aVar;
        }
        this.f415347h = aVar;
    }

    @Override // kotlinx.coroutines.p0
    public void D(oz5.l lVar, java.lang.Runnable runnable) {
        if (this.f415344e.post(runnable)) {
            return;
        }
        K(lVar, runnable);
    }

    @Override // kotlinx.coroutines.p0
    public boolean I(oz5.l lVar) {
        return (this.f415346g && kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), this.f415344e.getLooper())) ? false : true;
    }

    public final void K(oz5.l lVar, java.lang.Runnable runnable) {
        kotlinx.coroutines.v2.b(lVar, new java.util.concurrent.CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        kotlinx.coroutines.q1.f310570c.D(lVar, runnable);
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof t26.a) && ((t26.a) obj).f415344e == this.f415344e;
    }

    public int hashCode() {
        return java.lang.System.identityHashCode(this.f415344e);
    }

    @Override // kotlinx.coroutines.p0
    public java.lang.String toString() {
        t26.a aVar;
        java.lang.String str;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        if (this == g3Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                aVar = ((t26.a) g3Var).f415347h;
            } catch (java.lang.UnsupportedOperationException unused) {
                aVar = null;
            }
            str = this == aVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        java.lang.String str2 = this.f415345f;
        if (str2 == null) {
            str2 = this.f415344e.toString();
        }
        if (!this.f415346g) {
            return str2;
        }
        return str2 + ".immediate";
    }

    @Override // kotlinx.coroutines.i1
    public kotlinx.coroutines.s1 v(long j17, final java.lang.Runnable runnable, oz5.l lVar) {
        if (j17 > 4611686018427387903L) {
            j17 = 4611686018427387903L;
        }
        if (this.f415344e.postDelayed(runnable, j17)) {
            return new kotlinx.coroutines.s1() { // from class: t26.a$$a
                @Override // kotlinx.coroutines.s1
                public final void dispose() {
                    t26.a.this.f415344e.removeCallbacks(runnable);
                }
            };
        }
        K(lVar, runnable);
        return kotlinx.coroutines.j3.f310548d;
    }

    @Override // kotlinx.coroutines.i1
    public void w(long j17, kotlinx.coroutines.q qVar) {
        t26.b bVar = new t26.b(qVar, this);
        if (j17 > 4611686018427387903L) {
            j17 = 4611686018427387903L;
        }
        if (!this.f415344e.postDelayed(bVar, j17)) {
            K(((kotlinx.coroutines.r) qVar).f310577e, bVar);
        } else {
            ((kotlinx.coroutines.r) qVar).m(new t26.c(this, bVar));
        }
    }

    public a(android.os.Handler handler, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this(handler, (i17 & 2) != 0 ? null : str, false);
    }
}
