package z56;

/* loaded from: classes16.dex */
public final class g extends java.util.concurrent.atomic.AtomicReference implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f470297d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f470298e;

    /* renamed from: f, reason: collision with root package name */
    public final r56.b f470299f;

    /* renamed from: g, reason: collision with root package name */
    public final r56.b f470300g;

    /* renamed from: h, reason: collision with root package name */
    public r56.b f470301h;

    /* renamed from: i, reason: collision with root package name */
    public final s56.j f470302i;

    public g() {
        super(z56.e.f470289e);
        this.f470298e = true;
        r56.c cVar = r56.d.f392742a;
        this.f470299f = cVar;
        this.f470300g = cVar;
        this.f470301h = cVar;
        this.f470302i = s56.j.f403215a;
    }

    public void a(z56.f fVar) {
        z56.e eVar;
        z56.e eVar2;
        do {
            eVar = (z56.e) get();
            if (eVar.f470290a) {
                return;
            }
            z56.f[] fVarArr = eVar.f470291b;
            int length = fVarArr.length;
            eVar2 = z56.e.f470289e;
            if (length != 1 || fVarArr[0] != fVar) {
                if (length != 0) {
                    int i17 = length - 1;
                    z56.f[] fVarArr2 = new z56.f[i17];
                    int i18 = 0;
                    for (z56.f fVar2 : fVarArr) {
                        if (fVar2 != fVar) {
                            if (i18 != i17) {
                                fVarArr2[i18] = fVar2;
                                i18++;
                            }
                        }
                    }
                    if (i18 != 0) {
                        if (i18 < i17) {
                            z56.f[] fVarArr3 = new z56.f[i18];
                            java.lang.System.arraycopy(fVarArr2, 0, fVarArr3, 0, i18);
                            fVarArr2 = fVarArr3;
                        }
                        eVar2 = new z56.e(eVar.f470290a, fVarArr2);
                    }
                }
                eVar2 = eVar;
                break;
            }
            if (eVar2 == eVar) {
                return;
            }
        } while (!compareAndSet(eVar, eVar2));
    }

    public z56.f[] b(java.lang.Object obj) {
        this.f470297d = obj;
        this.f470298e = false;
        return ((z56.e) get()).f470290a ? z56.e.f470287c : ((z56.e) getAndSet(z56.e.f470288d)).f470291b;
    }

    @Override // r56.b
    public void call(java.lang.Object obj) {
        boolean z17;
        p56.r rVar = (p56.r) obj;
        z56.f fVar = new z56.f(rVar);
        rVar.d(new a66.b(new z56.d(this, fVar)));
        this.f470299f.getClass();
        if (rVar.f352103d.f424839e) {
            return;
        }
        while (true) {
            z56.e eVar = (z56.e) get();
            z17 = false;
            if (eVar.f470290a) {
                this.f470301h.call(fVar);
                break;
            }
            z56.f[] fVarArr = eVar.f470291b;
            int length = fVarArr.length;
            z56.f[] fVarArr2 = new z56.f[length + 1];
            java.lang.System.arraycopy(fVarArr, 0, fVarArr2, 0, length);
            fVarArr2[length] = fVar;
            if (compareAndSet(eVar, new z56.e(eVar.f470290a, fVarArr2))) {
                this.f470300g.getClass();
                z17 = true;
                break;
            }
        }
        if (z17 && rVar.f352103d.f424839e) {
            a(fVar);
        }
    }
}
