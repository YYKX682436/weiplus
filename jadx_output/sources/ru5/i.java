package ru5;

/* loaded from: classes10.dex */
public class i extends ru5.g {
    @Override // ru5.g
    public ru5.a d() {
        for (ru5.g gVar = this; gVar != null; gVar = gVar.f399804e) {
        }
        return null;
    }

    @Override // ru5.g
    public ru5.j e() {
        ru5.j jVar = this.f399801b;
        if (jVar != null) {
            return jVar;
        }
        if (xu5.b.d() == null && android.os.Looper.myLooper() == null) {
            throw new java.lang.RuntimeException(java.lang.String.format("fail to create DefaultScheduler. Current thread[%s-%s] without a Looper or Serial.", java.lang.Thread.currentThread().getName(), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId())));
        }
        return new ru5.h(this);
    }

    @Override // ru5.g
    public ru5.g f(ru5.a aVar) {
        java.util.Objects.requireNonNull(aVar);
        ru5.i iVar = new ru5.i();
        iVar.f399801b = e();
        iVar.f399803d = this;
        this.f399804e = iVar;
        this.f399802c = aVar;
        return iVar;
    }

    @Override // ru5.g
    public java.lang.Object g() {
        if (this.f399800a == null) {
            xu5.b d17 = xu5.b.d();
            java.lang.String c17 = d17 == null ? xu5.b.c(android.os.Looper.myLooper()) : d17.f457302a;
            for (ru5.g gVar = this; gVar.f399803d != null; gVar = gVar.f399803d) {
                if (gVar.f399801b.getTag().equals(c17)) {
                    throw new java.lang.RuntimeException("this pipeline will happen dead lock in future. please to check it. serialTag=" + c17);
                }
            }
        }
        h();
        return super.g();
    }

    public void h() {
        if (!this.f399807h.compareAndSet(false, true)) {
            ku5.o.f312599c.w("Pipeline", "this pipeline has begin.", new java.lang.Object[0]);
            return;
        }
        ru5.g gVar = this;
        while (gVar.f399803d != null) {
            gVar = gVar.f399803d;
        }
        gVar.c(gVar.f399802c);
    }
}
