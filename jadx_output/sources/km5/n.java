package km5;

/* loaded from: classes16.dex */
public class n implements km5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.q f309337a;

    public n(km5.q qVar) {
        this.f309337a = qVar;
    }

    @Override // km5.b
    public void a(java.lang.Object obj) {
        synchronized (this.f309337a) {
            if (this.f309337a.f309346e == km5.p.Interrupted) {
                jm5.b.b("Vending.Pipeline", "interrupted, skip this interrupt.", new java.lang.Object[0]);
                return;
            }
            km5.q qVar = this.f309337a;
            if (!(qVar.f309353o != null) && qVar.f309346e != km5.p.Pausing) {
                jm5.b.b("Vending.Pipeline", "interrupt not in func scope or pending, skip this retryOrInterrupt.", new java.lang.Object[0]);
                return;
            }
            jm5.b.b("Vending.Pipeline", "interrupt Pipeline(%s)", this.f309337a);
            this.f309337a.j(false);
            km5.q qVar2 = this.f309337a;
            qVar2.f309362x = true;
            qVar2.f309364z = obj;
            java.util.List list = qVar2.f309359u;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f309337a.k((android.util.Pair) it.next(), obj);
                }
            }
        }
    }

    @Override // km5.b
    public void b() {
        synchronized (this.f309337a) {
            d();
        }
    }

    @Override // km5.b
    public void c(java.lang.Object... objArr) {
        java.lang.Object obj;
        java.lang.Object obj2;
        synchronized (this.f309337a) {
            if (this.f309337a.f309346e != km5.p.Pausing) {
                jm5.b.b("Vending.Pipeline", "state is not pausing %s, skip this wormhole", this.f309337a.f309346e);
                return;
            }
            km5.q qVar = this.f309337a;
            if (objArr.length == 0) {
                obj = null;
            } else if (objArr.length == 1) {
                obj = objArr[0];
            } else {
                nm5.k kVar = new nm5.k();
                kVar.f338513a = objArr;
                obj = kVar;
            }
            qVar.A(obj);
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            km5.q qVar2 = this.f309337a;
            objArr2[0] = qVar2;
            synchronized (qVar2) {
                obj2 = qVar2.f309351m;
            }
            objArr2[1] = obj2 != null ? java.lang.String.valueOf(obj2.hashCode()) : null;
            jm5.b.b("Vending.Pipeline", "pipline(%s) wormhole(%s).", objArr2);
            resume();
        }
    }

    public final void d() {
        synchronized (this.f309337a) {
            if (this.f309337a.f309346e != km5.p.Interrupted && this.f309337a.f309346e != km5.p.Idle) {
                km5.q qVar = this.f309337a;
                if (!(qVar.f309353o != null)) {
                    jm5.b.a("Vending.Pipeline", "you are using mario().pause() out of a functional scope on %s!", qVar);
                    return;
                }
                if (qVar.f309356r == km5.u.b()) {
                    this.f309337a.f309346e = km5.p.Pausing;
                    return;
                } else {
                    jm5.b.a("Vending.Pipeline", "you are using mario().pause() out of calling thread on %s!", this.f309337a);
                    return;
                }
            }
            jm5.b.c("Vending.Pipeline", "current is state(%s), ignore pause.", this.f309337a.f309346e);
        }
    }

    @Override // km5.b
    public void resume() {
        synchronized (this.f309337a) {
            boolean z17 = true;
            if (this.f309337a.f309346e != km5.p.Pausing) {
                jm5.b.a("Vending.Pipeline", "this Pipeline(%s) is not pausing! why call resume?", this.f309337a);
                return;
            }
            km5.q qVar = this.f309337a;
            if (qVar.f309353o != null) {
                qVar.f309346e = km5.p.Invoking;
            } else {
                qVar.f309346e = km5.p.Resolved;
            }
            synchronized (this.f309337a) {
            }
            if (this.f309337a.f309356r != km5.u.b()) {
                z17 = false;
            }
            if (!z17) {
                this.f309337a.d();
            }
        }
    }
}
