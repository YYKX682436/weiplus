package va;

/* loaded from: classes16.dex */
public abstract class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434184d;

    /* renamed from: e, reason: collision with root package name */
    public int f434185e = -1;

    /* renamed from: f, reason: collision with root package name */
    public va.m f434186f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicReferenceArray f434187g;

    /* renamed from: h, reason: collision with root package name */
    public va.h f434188h;

    /* renamed from: i, reason: collision with root package name */
    public va.y f434189i;

    /* renamed from: m, reason: collision with root package name */
    public va.y f434190m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ va.z f434191n;

    public g(va.z zVar) {
        this.f434191n = zVar;
        this.f434184d = zVar.f434213f.length - 1;
        a();
    }

    public final void a() {
        boolean z17;
        this.f434189i = null;
        va.h hVar = this.f434188h;
        if (hVar != null) {
            while (true) {
                va.h b17 = hVar.b();
                this.f434188h = b17;
                if (b17 == null) {
                    break;
                }
                if (b(b17)) {
                    z17 = true;
                    break;
                }
                hVar = this.f434188h;
            }
        }
        z17 = false;
        if (z17 || d()) {
            return;
        }
        while (true) {
            int i17 = this.f434184d;
            if (i17 < 0) {
                return;
            }
            va.m[] mVarArr = this.f434191n.f434213f;
            this.f434184d = i17 - 1;
            va.m mVar = mVarArr[i17];
            this.f434186f = mVar;
            if (mVar.f434195e != 0) {
                this.f434187g = this.f434186f.f434198h;
                this.f434185e = r0.length() - 1;
                if (d()) {
                    return;
                }
            }
        }
    }

    public boolean b(va.h hVar) {
        va.z zVar = this.f434191n;
        try {
            java.lang.Object key = hVar.getKey();
            zVar.getClass();
            java.lang.Object value = hVar.getKey() == null ? null : hVar.getValue();
            if (value == null) {
                this.f434186f.f();
                return false;
            }
            this.f434189i = new va.y(zVar, key, value);
            this.f434186f.f();
            return true;
        } catch (java.lang.Throwable th6) {
            this.f434186f.f();
            throw th6;
        }
    }

    public va.y c() {
        va.y yVar = this.f434189i;
        if (yVar == null) {
            throw new java.util.NoSuchElementException();
        }
        this.f434190m = yVar;
        a();
        return this.f434190m;
    }

    public boolean d() {
        while (true) {
            int i17 = this.f434185e;
            boolean z17 = false;
            if (i17 < 0) {
                return false;
            }
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f434187g;
            this.f434185e = i17 - 1;
            va.h hVar = (va.h) atomicReferenceArray.get(i17);
            this.f434188h = hVar;
            if (hVar != null) {
                if (b(hVar)) {
                    break;
                }
                va.h hVar2 = this.f434188h;
                if (hVar2 != null) {
                    while (true) {
                        va.h b17 = hVar2.b();
                        this.f434188h = b17;
                        if (b17 == null) {
                            break;
                        }
                        if (b(b17)) {
                            z17 = true;
                            break;
                        }
                        hVar2 = this.f434188h;
                    }
                }
                if (z17) {
                    break;
                }
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434189i != null;
    }

    @Override // java.util.Iterator
    public void remove() {
        va.y yVar = this.f434190m;
        if (!(yVar != null)) {
            throw new java.lang.IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f434191n.remove(yVar.f434207d);
        this.f434190m = null;
    }
}
