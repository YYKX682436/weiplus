package k75;

/* loaded from: classes7.dex */
public class j extends android.os.Handler {

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.Object f304829q = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f304830a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f304831b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.Message f304832c;

    /* renamed from: d, reason: collision with root package name */
    public final k75.f f304833d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f304834e;

    /* renamed from: f, reason: collision with root package name */
    public k75.i[] f304835f;

    /* renamed from: g, reason: collision with root package name */
    public int f304836g;

    /* renamed from: h, reason: collision with root package name */
    public k75.i[] f304837h;

    /* renamed from: i, reason: collision with root package name */
    public int f304838i;

    /* renamed from: j, reason: collision with root package name */
    public final k75.g f304839j;

    /* renamed from: k, reason: collision with root package name */
    public final k75.h f304840k;

    /* renamed from: l, reason: collision with root package name */
    public k75.k f304841l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f304842m;

    /* renamed from: n, reason: collision with root package name */
    public k75.c f304843n;

    /* renamed from: o, reason: collision with root package name */
    public k75.c f304844o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f304845p;

    public j(android.os.Looper looper, k75.k kVar, k75.d dVar) {
        super(looper);
        this.f304830a = false;
        this.f304831b = false;
        this.f304833d = new k75.f(null);
        this.f304836g = -1;
        k75.g gVar = new k75.g(this, null);
        this.f304839j = gVar;
        k75.h hVar = new k75.h(this, null);
        this.f304840k = hVar;
        this.f304842m = new java.util.HashMap();
        this.f304845p = new java.util.ArrayList();
        this.f304841l = kVar;
        a(gVar, null);
        a(hVar, null);
    }

    public final k75.i a(k75.c cVar, k75.c cVar2) {
        k75.i iVar;
        if (this.f304831b) {
            k75.k kVar = this.f304841l;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addStateInternal: E state=");
            sb6.append(cVar.getName());
            sb6.append(",parent=");
            sb6.append(cVar2 == null ? "" : cVar2.getName());
            kVar.f(sb6.toString());
        }
        java.util.HashMap hashMap = this.f304842m;
        if (cVar2 != null) {
            iVar = (k75.i) hashMap.get(cVar2);
            if (iVar == null) {
                iVar = a(cVar2, null);
            }
        } else {
            iVar = null;
        }
        k75.i iVar2 = (k75.i) hashMap.get(cVar);
        if (iVar2 == null) {
            iVar2 = new k75.i(this, null);
            hashMap.put(cVar, iVar2);
        }
        k75.i iVar3 = iVar2.f304827b;
        if (iVar3 != null && iVar3 != iVar) {
            throw new java.lang.RuntimeException("state already added");
        }
        iVar2.f304826a = cVar;
        iVar2.f304827b = iVar;
        iVar2.f304828c = false;
        if (this.f304831b) {
            this.f304841l.f("addStateInternal: X stateInfo: " + iVar2);
        }
        return iVar2;
    }

    public final void b(int i17) {
        while (i17 <= this.f304836g) {
            if (this.f304831b) {
                this.f304841l.f("invokeEnterMethods: " + this.f304835f[i17].f304826a.getName());
            }
            this.f304835f[i17].f304826a.a();
            this.f304835f[i17].f304828c = true;
            i17++;
        }
    }

    public final int c() {
        int i17 = this.f304836g + 1;
        int i18 = i17;
        for (int i19 = this.f304838i - 1; i19 >= 0; i19--) {
            if (this.f304831b) {
                this.f304841l.f("moveTempStackToStateStack: i=" + i19 + ",j=" + i18);
            }
            this.f304835f[i18] = this.f304837h[i19];
            i18++;
        }
        this.f304836g = i18 - 1;
        if (this.f304831b) {
            this.f304841l.f("moveTempStackToStateStack: X mStateStackTop=" + this.f304836g + ",startingIndex=" + i17 + ",Top=" + this.f304835f[this.f304836g].f304826a.getName());
        }
        return i17;
    }

    public final void d(k75.a aVar) {
        this.f304844o = (k75.c) aVar;
        if (this.f304831b) {
            this.f304841l.f("transitionTo: destState=" + this.f304844o.getName());
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        k75.c cVar;
        k75.k kVar;
        k75.i iVar;
        if (this.f304830a) {
            return;
        }
        if (this.f304831b) {
            this.f304841l.f("handleMessage: E msg.what=" + message.what);
        }
        this.f304832c = message;
        boolean z17 = this.f304834e;
        if (z17) {
            k75.i iVar2 = this.f304835f[this.f304836g];
            if (this.f304831b) {
                this.f304841l.f("processMsg: " + iVar2.f304826a.getName());
            }
            if (message.what == -1 && message.obj == f304829q) {
                d(this.f304840k);
            } else {
                while (true) {
                    if (iVar2.f304826a.c(message)) {
                        break;
                    }
                    iVar2 = iVar2.f304827b;
                    if (iVar2 == null) {
                        this.f304841l.p(message);
                        break;
                    } else if (this.f304831b) {
                        this.f304841l.f("processMsg: " + iVar2.f304826a.getName());
                    }
                }
            }
            cVar = iVar2 != null ? iVar2.f304826a : null;
        } else {
            if (z17 || message.what != -2 || message.obj != f304829q) {
                throw new java.lang.RuntimeException("StateMachine.handleMessage: The start method not called, received msg: " + message);
            }
            this.f304834e = true;
            b(0);
            cVar = null;
        }
        k75.c cVar2 = this.f304835f[this.f304836g].f304826a;
        boolean z18 = this.f304841l.k(this.f304832c) && message.obj != f304829q;
        synchronized (this.f304833d) {
        }
        if (z18) {
            k75.f fVar = this.f304833d;
            k75.k kVar2 = this.f304841l;
            android.os.Message message2 = this.f304832c;
            kVar2.getClass();
            k75.c cVar3 = this.f304844o;
            synchronized (fVar) {
                if (fVar.f304822a.size() < fVar.f304823b) {
                    fVar.f304822a.add(new k75.e(kVar2, message2, "", cVar, cVar2, cVar3));
                } else {
                    k75.e eVar = (k75.e) fVar.f304822a.get(fVar.f304824c);
                    int i17 = fVar.f304824c + 1;
                    fVar.f304824c = i17;
                    if (i17 >= fVar.f304823b) {
                        fVar.f304824c = 0;
                    }
                    eVar.f304815a = kVar2;
                    eVar.f304816b = java.lang.System.currentTimeMillis();
                    eVar.f304817c = message2 != null ? message2.what : 0;
                    eVar.f304818d = "";
                    eVar.f304819e = cVar;
                    eVar.f304820f = cVar2;
                    eVar.f304821g = cVar3;
                }
            }
        }
        k75.c cVar4 = this.f304844o;
        if (cVar4 != null) {
            while (true) {
                if (this.f304831b) {
                    this.f304841l.f("handleMessage: new destination call exit/enter");
                }
                this.f304838i = 0;
                k75.i iVar3 = (k75.i) this.f304842m.get(cVar4);
                do {
                    k75.i[] iVarArr = this.f304837h;
                    int i18 = this.f304838i;
                    this.f304838i = i18 + 1;
                    iVarArr[i18] = iVar3;
                    iVar3 = iVar3.f304827b;
                    if (iVar3 == null) {
                        break;
                    }
                } while (!iVar3.f304828c);
                if (this.f304831b) {
                    this.f304841l.f("setupTempStateStackWithStatesToEnter: X mTempStateStackCount=" + this.f304838i + ",curStateInfo: " + iVar3);
                }
                while (true) {
                    int i19 = this.f304836g;
                    if (i19 < 0 || (iVar = this.f304835f[i19]) == iVar3) {
                        break;
                    }
                    k75.c cVar5 = iVar.f304826a;
                    if (this.f304831b) {
                        this.f304841l.f("invokeExitMethods: " + cVar5.getName());
                    }
                    cVar5.b();
                    k75.i[] iVarArr2 = this.f304835f;
                    int i27 = this.f304836g;
                    iVarArr2[i27].f304828c = false;
                    this.f304836g = i27 - 1;
                }
                b(c());
                java.util.ArrayList arrayList = this.f304845p;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    android.os.Message message3 = (android.os.Message) arrayList.get(size);
                    if (this.f304831b) {
                        this.f304841l.f("moveDeferredMessageAtFrontOfQueue; what=" + message3.what);
                    }
                    sendMessageAtFrontOfQueue(message3);
                }
                arrayList.clear();
                k75.c cVar6 = this.f304844o;
                if (cVar4 == cVar6) {
                    break;
                } else {
                    cVar4 = cVar6;
                }
            }
            this.f304844o = null;
        }
        if (cVar4 != null) {
            if (cVar4 == this.f304840k) {
                this.f304841l.i();
                if (this.f304841l.f304848f != null) {
                    getLooper().quit();
                    this.f304841l.f304848f = null;
                }
                removeCallbacksAndMessages(null);
                this.f304841l.f304847e = null;
                this.f304841l = null;
                this.f304832c = null;
                k75.f fVar2 = this.f304833d;
                synchronized (fVar2) {
                    fVar2.f304822a.clear();
                }
                this.f304835f = null;
                this.f304837h = null;
                this.f304842m.clear();
                this.f304843n = null;
                this.f304844o = null;
                this.f304845p.clear();
                this.f304830a = true;
            } else if (cVar4 == this.f304839j) {
                this.f304841l.getClass();
            }
        }
        if (!this.f304831b || (kVar = this.f304841l) == null) {
            return;
        }
        kVar.f("handleMessage: X");
    }
}
