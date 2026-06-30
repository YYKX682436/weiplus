package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public abstract class e {

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.modelbase.i f213885c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f213883a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f213884b = false;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.j0 f213886d = new androidx.lifecycle.j0();

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.j0 f213887e = new androidx.lifecycle.j0();

    public abstract r45.js5 a();

    public abstract void b(com.tencent.mm.modelbase.f fVar);

    public void c(com.tencent.mm.wallet_core.model.d dVar, boolean z17) {
        d(dVar, z17, 0L);
    }

    public void d(com.tencent.mm.wallet_core.model.d dVar, boolean z17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AsyncCgiLoader", "try do cgi: %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17));
        if (j17 <= 0) {
            e(dVar, z17);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.wallet_core.model.a(this, dVar, z17), j17);
    }

    public final void e(com.tencent.mm.wallet_core.model.d dVar, boolean z17) {
        r45.js5 a17 = a();
        boolean z18 = a17 != null;
        if (z18) {
            if (dVar != null) {
                dVar.a(a17);
            }
            this.f213886d.postValue(a17);
        }
        if (!z18 || z17) {
            if (dVar != null) {
                java.util.List list = this.f213883a;
                if (!((java.util.ArrayList) list).contains(dVar)) {
                    ((java.util.ArrayList) list).add(dVar);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AsyncCgiLoader", "trigger cgi: %s", java.lang.Boolean.valueOf(this.f213884b));
            if (this.f213884b) {
                return;
            }
            this.f213884b = true;
            com.tencent.mm.modelbase.i iVar = this.f213885c;
            iz5.a.d("cgi must not be null", iVar);
            iVar.l().q(new com.tencent.mm.wallet_core.model.c(this)).h(new com.tencent.mm.wallet_core.model.b(this));
        }
    }
}
