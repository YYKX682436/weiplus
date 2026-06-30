package q36;

/* loaded from: classes16.dex */
public abstract class b implements x36.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final x36.r f359981d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f359982e;

    /* renamed from: f, reason: collision with root package name */
    public long f359983f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q36.h f359984g;

    public b(q36.h hVar, q36.a aVar) {
        this.f359984g = hVar;
        this.f359981d = new x36.r(hVar.f360000c.h());
    }

    @Override // x36.h0
    public long B(x36.k kVar, long j17) {
        try {
            long B = this.f359984g.f360000c.B(kVar, j17);
            if (B > 0) {
                this.f359983f += B;
            }
            return B;
        } catch (java.io.IOException e17) {
            a(false, e17);
            throw e17;
        }
    }

    public final void a(boolean z17, java.io.IOException iOException) {
        q36.h hVar = this.f359984g;
        int i17 = hVar.f360002e;
        if (i17 == 6) {
            return;
        }
        if (i17 != 5) {
            throw new java.lang.IllegalStateException("state: " + hVar.f360002e);
        }
        x36.r rVar = this.f359981d;
        x36.j0 j0Var = rVar.f451702e;
        rVar.f451702e = x36.j0.f451689d;
        j0Var.a();
        j0Var.b();
        hVar.f360002e = 6;
        o36.j jVar = hVar.f359999b;
        if (jVar != null) {
            jVar.i(!z17, hVar, this.f359983f, iOException);
        }
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f359981d;
    }
}
