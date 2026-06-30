package e26;

/* loaded from: classes16.dex */
public class q implements e26.w {

    /* renamed from: d, reason: collision with root package name */
    public final e26.u f247027d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentMap f247028e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f247029f;

    public q(e26.u uVar, java.util.concurrent.ConcurrentMap concurrentMap, yz5.l lVar) {
        if (uVar == null) {
            a(0);
            throw null;
        }
        if (concurrentMap == null) {
            a(1);
            throw null;
        }
        if (lVar == null) {
            a(2);
            throw null;
        }
        this.f247027d = uVar;
        this.f247028e = concurrentMap;
        this.f247029f = lVar;
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.String str = (i17 == 3 || i17 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 3 || i17 == 4) ? 2 : 3];
        if (i17 == 1) {
            objArr[0] = "map";
        } else if (i17 == 2) {
            objArr[0] = "compute";
        } else if (i17 == 3 || i17 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i17 == 3) {
            objArr[1] = "recursionDetected";
        } else if (i17 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i17 != 3 && i17 != 4) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 3 && i17 != 4) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    public final java.lang.AssertionError d(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.AssertionError assertionError = new java.lang.AssertionError("Inconsistent key detected. " + e26.s.COMPUTING + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f247027d);
        e26.u.g(assertionError);
        return assertionError;
    }

    public final java.lang.AssertionError e(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.AssertionError assertionError = new java.lang.AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f247027d);
        e26.u.g(assertionError);
        return assertionError;
    }

    public final java.lang.AssertionError f(java.lang.Object obj, java.lang.Throwable th6) {
        java.lang.AssertionError assertionError = new java.lang.AssertionError("Unable to remove " + obj + " under " + this.f247027d, th6);
        e26.u.g(assertionError);
        return assertionError;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.RuntimeException th6;
        java.lang.AssertionError assertionError;
        java.lang.AssertionError f17;
        java.lang.Object obj2;
        java.util.concurrent.ConcurrentMap concurrentMap = this.f247028e;
        java.lang.Object obj3 = concurrentMap.get(obj);
        e26.s sVar = e26.s.COMPUTING;
        java.lang.Object obj4 = o26.x.f342618a;
        if (obj3 != null && obj3 != sVar) {
            o26.x.a(obj3);
            if (obj3 == obj4) {
                return null;
            }
            return obj3;
        }
        e26.u uVar = this.f247027d;
        e26.z zVar = uVar.f247038a;
        e26.z zVar2 = uVar.f247038a;
        zVar.lock();
        try {
            java.lang.Object obj5 = concurrentMap.get(obj);
            e26.s sVar2 = e26.s.RECURSION_WAS_DETECTED;
            if (obj5 == sVar) {
                e26.t f18 = uVar.f("", obj);
                if (f18 == null) {
                    a(3);
                    throw null;
                }
                if (!f18.f247035b) {
                    obj2 = f18.f247034a;
                    return obj2;
                }
                obj5 = sVar2;
            }
            if (obj5 == sVar2) {
                e26.t f19 = uVar.f("", obj);
                if (f19 == null) {
                    a(3);
                    throw null;
                }
                if (!f19.f247035b) {
                    obj2 = f19.f247034a;
                    return obj2;
                }
            }
            if (obj5 != null) {
                o26.x.a(obj5);
                obj2 = obj5 != obj4 ? obj5 : null;
                return obj2;
            }
            try {
                concurrentMap.put(obj, sVar);
                java.lang.Object invoke = this.f247029f.invoke(obj);
                if (invoke != null) {
                    obj4 = invoke;
                }
                java.lang.Object put = concurrentMap.put(obj, obj4);
                if (put == sVar) {
                    return invoke;
                }
                assertionError = e(obj, put);
                try {
                    throw assertionError;
                } catch (java.lang.Throwable th7) {
                    th6 = th7;
                    if (o26.i.a(th6)) {
                        try {
                            java.lang.Object remove = concurrentMap.remove(obj);
                            if (remove != sVar) {
                                throw d(obj, remove);
                            }
                            throw th6;
                        } finally {
                        }
                    }
                    e26.k kVar = uVar.f247039b;
                    if (th6 == assertionError) {
                        try {
                            concurrentMap.remove(obj);
                            ((e26.j) kVar).a(th6);
                            throw null;
                        } finally {
                        }
                    }
                    java.lang.Object put2 = concurrentMap.put(obj, new o26.w(th6, null));
                    if (put2 != sVar) {
                        throw e(obj, put2);
                    }
                    ((e26.j) kVar).a(th6);
                    throw null;
                    zVar2.unlock();
                }
            } catch (java.lang.Throwable th8) {
                th6 = th8;
                assertionError = null;
            }
        } finally {
            zVar2.unlock();
        }
    }
}
