package k75;

/* loaded from: classes7.dex */
public abstract class k {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f304846d;

    /* renamed from: e, reason: collision with root package name */
    public volatile k75.j f304847e;

    /* renamed from: f, reason: collision with root package name */
    public volatile android.os.HandlerThread f304848f;

    public k(java.lang.String str, android.os.Looper looper) {
        this.f304846d = str;
        this.f304847e = new k75.j(looper, this, null);
    }

    public final void c(k75.c cVar) {
        k75.j jVar = this.f304847e;
        java.lang.Object obj = k75.j.f304829q;
        jVar.a(cVar, null);
    }

    public final android.os.Message d() {
        k75.j jVar = this.f304847e;
        if (jVar == null) {
            return null;
        }
        return jVar.f304832c;
    }

    public final k75.a e() {
        k75.j jVar = this.f304847e;
        if (jVar == null) {
            return null;
        }
        return jVar.f304835f[jVar.f304836g].f304826a;
    }

    public void f(java.lang.String str) {
    }

    public void g(java.lang.String str) {
    }

    public void h() {
        j();
    }

    public void i() {
    }

    public final void j() {
        k75.j jVar = this.f304847e;
        if (jVar == null) {
            return;
        }
        if (jVar.f304831b) {
            jVar.f304841l.f("quit:");
        }
        jVar.sendMessage(jVar.obtainMessage(-1, k75.j.f304829q));
    }

    public boolean k(android.os.Message message) {
        return true;
    }

    public final void l(int i17) {
        k75.j jVar = this.f304847e;
        if (jVar == null) {
            return;
        }
        jVar.sendMessage(android.os.Message.obtain(this.f304847e, i17));
    }

    public final void m(k75.c cVar) {
        k75.j jVar = this.f304847e;
        if (jVar.f304831b) {
            jVar.f304841l.f("setInitialState: initialState=" + cVar.getName());
        }
        jVar.f304843n = cVar;
    }

    public void n() {
        k75.j jVar = this.f304847e;
        if (jVar == null) {
            return;
        }
        if (jVar.f304831b) {
            jVar.f304841l.f("completeConstruction: E");
        }
        java.util.HashMap hashMap = jVar.f304842m;
        int i17 = 0;
        int i18 = 0;
        for (k75.i iVar : hashMap.values()) {
            int i19 = 0;
            while (iVar != null) {
                iVar = iVar.f304827b;
                i19++;
            }
            if (i18 < i19) {
                i18 = i19;
            }
        }
        if (jVar.f304831b) {
            jVar.f304841l.f("completeConstruction: maxDepth=" + i18);
        }
        jVar.f304835f = new k75.i[i18];
        jVar.f304837h = new k75.i[i18];
        if (jVar.f304831b) {
            jVar.f304841l.f("setupInitialStateStack: E mInitialState=" + jVar.f304843n.getName());
        }
        k75.i iVar2 = (k75.i) hashMap.get(jVar.f304843n);
        while (true) {
            jVar.f304838i = i17;
            if (iVar2 == null) {
                break;
            }
            jVar.f304837h[i17] = iVar2;
            iVar2 = iVar2.f304827b;
            i17++;
        }
        jVar.f304836g = -1;
        jVar.c();
        jVar.sendMessageAtFrontOfQueue(jVar.obtainMessage(-2, k75.j.f304829q));
        if (jVar.f304831b) {
            jVar.f304841l.f("completeConstruction: X");
        }
    }

    public final void o(k75.a aVar) {
        k75.j jVar = this.f304847e;
        java.lang.Object obj = k75.j.f304829q;
        jVar.d(aVar);
    }

    public void p(android.os.Message message) {
        if (this.f304847e.f304831b) {
            g(" - unhandledMessage: msg.what=" + message.what);
        }
    }
}
