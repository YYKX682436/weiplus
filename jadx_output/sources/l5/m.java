package l5;

/* loaded from: classes14.dex */
public final class m extends l5.k {
    public boolean i(java.lang.Object obj) {
        if (obj == null) {
            obj = l5.k.f316533m;
        }
        if (!l5.k.f316532i.b(this, null, obj)) {
            return false;
        }
        l5.k.b(this);
        return true;
    }

    public boolean j(java.lang.Throwable th6) {
        th6.getClass();
        if (!l5.k.f316532i.b(this, null, new l5.e(th6))) {
            return false;
        }
        l5.k.b(this);
        return true;
    }

    public boolean k(wa.a aVar) {
        l5.e eVar;
        aVar.getClass();
        java.lang.Object obj = this.f316534d;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!l5.k.f316532i.b(this, null, l5.k.e(aVar))) {
                    return false;
                }
                l5.k.b(this);
            } else {
                l5.h hVar = new l5.h(this, aVar);
                if (l5.k.f316532i.b(this, null, hVar)) {
                    try {
                        aVar.addListener(hVar, l5.l.INSTANCE);
                    } catch (java.lang.Throwable th6) {
                        try {
                            eVar = new l5.e(th6);
                        } catch (java.lang.Throwable unused) {
                            eVar = l5.e.f316514b;
                        }
                        l5.k.f316532i.b(this, hVar, eVar);
                    }
                } else {
                    obj = this.f316534d;
                }
            }
            return true;
        }
        if (!(obj instanceof l5.c)) {
            return false;
        }
        aVar.cancel(((l5.c) obj).f316512a);
        return false;
    }
}
