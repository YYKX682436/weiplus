package em5;

/* loaded from: classes9.dex */
public class i implements im5.b {

    /* renamed from: e, reason: collision with root package name */
    public em5.f f255230e;

    /* renamed from: f, reason: collision with root package name */
    public gm5.b f255231f;

    /* renamed from: d, reason: collision with root package name */
    public final em5.h f255229d = em5.h.f255225d;

    /* renamed from: g, reason: collision with root package name */
    public final im5.c f255232g = new im5.c();

    public gm5.b a(android.app.Activity activity, java.lang.Class cls) {
        gm5.b bVar;
        if (activity.isFinishing() || activity.isDestroyed()) {
            jm5.b.a("Vending.Presenter", "Activity %s is finished! This is invalid!", activity);
            return null;
        }
        synchronized (this) {
            gm5.b bVar2 = this.f255231f;
            if (bVar2 == null) {
                try {
                    gm5.b bVar3 = (gm5.b) cls.newInstance();
                    this.f255231f = bVar3;
                    if (this.f255230e == null) {
                        this.f255230e = (em5.f) bVar3.a();
                    }
                    d();
                    bVar = this.f255231f;
                } catch (java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
                    throw new java.lang.InternalError("Could not create interactor api instance : " + cls.toString());
                }
            } else {
                if (!cls.isInstance(bVar2)) {
                    throw new java.lang.IllegalAccessError("Only one interactor pair with one presenter! duplicate pairWith : " + cls.toString());
                }
                bVar = this.f255231f;
            }
        }
        return bVar;
    }

    public em5.f b(android.app.Activity activity, java.lang.Class cls) {
        em5.f fVar;
        if (activity.isFinishing() || activity.isDestroyed()) {
            jm5.b.a("Vending.Presenter", "Activity %s is finished! This is invalid!", activity);
            return null;
        }
        synchronized (this) {
            gm5.b bVar = this.f255231f;
            if (bVar != null) {
                fVar = (em5.f) bVar.a();
            } else {
                em5.f fVar2 = this.f255230e;
                if (fVar2 == null) {
                    try {
                        this.f255230e = (em5.f) cls.newInstance();
                        d();
                        fVar = this.f255230e;
                    } catch (java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
                        throw new java.lang.InternalError("Could not create interactor instance : " + cls.toString());
                    }
                } else {
                    if (!cls.isInstance(fVar2)) {
                        throw new java.lang.IllegalAccessError("Only one interactor pair with one presenter! duplicate pairWith : " + cls.toString());
                    }
                    fVar = this.f255230e;
                }
            }
        }
        return fVar;
    }

    public void c(android.content.Intent intent, android.content.Context context) {
        synchronized (this) {
            iz5.a.d("You must pair this presenter with a interactor!", this.f255230e);
            this.f255230e.getClass();
            em5.f fVar = this.f255230e;
            fVar.getClass();
            fVar.f255224n = new hm5.a(intent);
        }
        e(1);
    }

    public final void d() {
        em5.h hVar = this.f255229d;
        if (hVar != null) {
            em5.f fVar = this.f255230e;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) hVar.f255226a;
            if (concurrentHashMap.containsKey(this)) {
                jm5.b.a("Vending.InteractorManager", "duplicate activity and interactor.", new java.lang.Object[0]);
                return;
            }
            concurrentHashMap.put(this, fVar);
            jm5.b.b("Vending.InteractorManager", "presenter %s hash %s interactor %s looper %s", this, java.lang.Integer.valueOf(hashCode()), fVar, android.os.Looper.myLooper());
            int i17 = hVar.f255227b.get(hashCode(), 0);
            if (i17 <= 0 || i17 >= 4) {
                return;
            }
            android.os.Handler handler = hVar.f255228c;
            if (i17 >= 1) {
                handler.sendMessage(handler.obtainMessage(1, fVar));
            }
            if (i17 >= 2) {
                handler.sendMessage(handler.obtainMessage(2, fVar));
            }
            if (i17 >= 3) {
                handler.sendMessage(handler.obtainMessage(3, fVar));
            }
            if (i17 >= 4) {
                handler.sendMessage(handler.obtainMessage(4, fVar));
            }
        }
    }

    public final void e(int i17) {
        em5.h hVar = this.f255229d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) hVar.f255226a;
        em5.f fVar = (em5.f) concurrentHashMap.get(this);
        if (fVar != null) {
            if (i17 == 1) {
                jm5.b.b("Vending.InteractorManager", "onCreate interactor %s presenter %s %s %s", fVar, this, java.lang.Integer.valueOf(hashCode()), android.os.Looper.myLooper());
            } else if (i17 != 2 && i17 != 3) {
                if (i17 != 4) {
                    jm5.b.b("Vending.InteractorManager", "Unknow phase %s, interactor %s activity %s %s %s", java.lang.Integer.valueOf(i17), fVar, this, java.lang.Integer.valueOf(hashCode()), android.os.Looper.myLooper());
                    return;
                } else {
                    jm5.b.b("Vending.InteractorManager", "onDestroy interactor %s activity %s %s %s", fVar, this, java.lang.Integer.valueOf(hashCode()), android.os.Looper.myLooper());
                    concurrentHashMap.remove(this);
                }
            }
            android.os.Handler handler = hVar.f255228c;
            handler.sendMessage(handler.obtainMessage(i17, fVar));
        }
        hVar.f255227b.put(hashCode(), i17);
    }

    @Override // im5.b
    public void keep(im5.a aVar) {
        iz5.a.g("target must be a ILifeCycle", aVar instanceof im5.a);
        this.f255232g.keep(aVar);
    }
}
