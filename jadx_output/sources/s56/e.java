package s56;

/* loaded from: classes16.dex */
public final class e extends z56.c {

    /* renamed from: g, reason: collision with root package name */
    public static final p56.m f403201g = new s56.a();

    /* renamed from: e, reason: collision with root package name */
    public final s56.d f403202e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f403203f;

    public e(s56.d dVar) {
        super(new s56.c(dVar));
        this.f403202e = dVar;
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        boolean z17 = this.f403203f;
        s56.d dVar = this.f403202e;
        if (z17) {
            ((p56.m) dVar.get()).a(obj);
            return;
        }
        dVar.f403198g.getClass();
        if (obj == null) {
            obj = s56.j.f403217c;
        }
        i(obj);
    }

    public final void i(java.lang.Object obj) {
        synchronized (this.f403202e.f403195d) {
            this.f403202e.f403197f.add(obj);
            if (this.f403202e.get() != null) {
                s56.d dVar = this.f403202e;
                if (!dVar.f403196e) {
                    this.f403203f = true;
                    dVar.f403196e = true;
                }
            }
        }
        if (!this.f403203f) {
            return;
        }
        while (true) {
            java.lang.Object poll = this.f403202e.f403197f.poll();
            if (poll == null) {
                return;
            }
            s56.d dVar2 = this.f403202e;
            dVar2.f403198g.a((p56.m) dVar2.get(), poll);
        }
    }

    @Override // p56.m
    public void onCompleted() {
        boolean z17 = this.f403203f;
        s56.d dVar = this.f403202e;
        if (z17) {
            ((p56.m) dVar.get()).onCompleted();
        } else {
            dVar.f403198g.getClass();
            i(s56.j.f403216b);
        }
    }

    @Override // p56.m
    public void onError(java.lang.Throwable th6) {
        boolean z17 = this.f403203f;
        s56.d dVar = this.f403202e;
        if (z17) {
            ((p56.m) dVar.get()).onError(th6);
        } else {
            dVar.f403198g.getClass();
            i(new s56.i(th6));
        }
    }
}
