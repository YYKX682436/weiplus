package s56;

/* loaded from: classes16.dex */
public final class c implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public final s56.d f403191d;

    public c(s56.d dVar) {
        this.f403191d = dVar;
    }

    @Override // r56.b
    public void call(java.lang.Object obj) {
        boolean z17;
        p56.r rVar = (p56.r) obj;
        if (!this.f403191d.compareAndSet(null, rVar)) {
            rVar.onError(new java.lang.IllegalStateException("Only one subscriber allowed!"));
            return;
        }
        rVar.d(new a66.b(new s56.b(this)));
        synchronized (this.f403191d.f403195d) {
            s56.d dVar = this.f403191d;
            if (dVar.f403196e) {
                z17 = false;
            } else {
                z17 = true;
                dVar.f403196e = true;
            }
        }
        if (!z17) {
            return;
        }
        s56.j jVar = s56.j.f403215a;
        while (true) {
            java.lang.Object poll = this.f403191d.f403197f.poll();
            if (poll != null) {
                jVar.a((p56.m) this.f403191d.get(), poll);
            } else {
                synchronized (this.f403191d.f403195d) {
                    if (this.f403191d.f403197f.isEmpty()) {
                        this.f403191d.f403196e = false;
                        return;
                    }
                }
            }
        }
    }
}
