package e26;

/* loaded from: classes16.dex */
public class m implements e26.y {

    /* renamed from: d, reason: collision with root package name */
    public final e26.u f247023d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f247024e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f247025f;

    public m(e26.u uVar, yz5.a aVar) {
        if (uVar == null) {
            a(0);
            throw null;
        }
        if (aVar == null) {
            a(1);
            throw null;
        }
        this.f247025f = e26.s.NOT_COMPUTED;
        this.f247023d = uVar;
        this.f247024e = aVar;
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.String str = (i17 == 2 || i17 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 2 || i17 == 3) ? 2 : 3];
        if (i17 == 1) {
            objArr[0] = "computable";
        } else if (i17 == 2 || i17 == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i17 == 2) {
            objArr[1] = "recursionDetected";
        } else if (i17 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i17 != 2 && i17 != 3) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 2 && i17 != 3) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    public void d(java.lang.Object obj) {
    }

    public e26.t e(boolean z17) {
        e26.t f17 = this.f247023d.f("in a lazy value", null);
        if (f17 != null) {
            return f17;
        }
        a(2);
        throw null;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj = this.f247025f;
        if (!(obj instanceof e26.s)) {
            o26.x.a(obj);
            return obj;
        }
        this.f247023d.f247038a.lock();
        try {
            java.lang.Object obj2 = this.f247025f;
            if (obj2 instanceof e26.s) {
                e26.s sVar = e26.s.COMPUTING;
                e26.s sVar2 = e26.s.RECURSION_WAS_DETECTED;
                if (obj2 == sVar) {
                    this.f247025f = sVar2;
                    e26.t e17 = e(true);
                    if (!e17.f247035b) {
                        obj2 = e17.f247034a;
                    }
                }
                if (obj2 == sVar2) {
                    e26.t e18 = e(false);
                    if (!e18.f247035b) {
                        obj2 = e18.f247034a;
                    }
                }
                this.f247025f = sVar;
                try {
                    obj2 = this.f247024e.invoke();
                    d(obj2);
                    this.f247025f = obj2;
                } catch (java.lang.Throwable th6) {
                    if (o26.i.a(th6)) {
                        this.f247025f = e26.s.NOT_COMPUTED;
                        throw th6;
                    }
                    if (this.f247025f == sVar) {
                        this.f247025f = new o26.w(th6, null);
                    }
                    ((e26.j) this.f247023d.f247039b).a(th6);
                    throw null;
                }
            } else {
                o26.x.a(obj2);
            }
            return obj2;
        } finally {
            this.f247023d.f247038a.unlock();
        }
    }
}
