package k04;

@j95.b
/* loaded from: classes12.dex */
public final class h extends jm0.o implements t65.e {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f303138m = jz5.h.b(k04.g.f303137d);

    /* renamed from: n, reason: collision with root package name */
    public wu5.c f303139n;

    /* renamed from: o, reason: collision with root package name */
    public int f303140o;

    /* renamed from: p, reason: collision with root package name */
    public t65.f f303141p;

    /* renamed from: q, reason: collision with root package name */
    public long f303142q;

    @Override // jm0.o
    public void Ni(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f303140o = aj().o("lastTickIndex", -1) + 1;
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        this.f303139n = ((ku5.t0) ku5.t0.f312615d).d(new k04.f(this, (android.os.PowerManager) systemService), u04.d.f423477c, u04.d.f423477c);
    }

    @Override // jm0.o
    public void Vi() {
        wu5.c cVar = this.f303139n;
        if (cVar != null) {
            cVar.cancel(true);
        }
    }

    public t65.f Zi() {
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        t65.f fVar = this.f303141p;
        if (fVar != null && c01.id.c() - this.f303142q < u04.d.f423477c) {
            return fVar;
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        new java.util.LinkedHashMap();
        int i17 = 0;
        while (true) {
            boolean z17 = true;
            if (i17 >= 31) {
                break;
            }
            java.lang.String u17 = aj().u("index_" + i17, "");
            k04.e eVar = new k04.e(this);
            kotlin.jvm.internal.o.d(u17);
            java.util.List f07 = r26.n0.f0(u17, new java.lang.String[]{";"}, false, 0, 6, null);
            if (!(f07.size() == 6)) {
                f07 = null;
            }
            if (f07 != null) {
                eVar.f303129a = java.lang.Long.parseLong((java.lang.String) f07.get(0));
                eVar.f303130b = java.lang.Integer.parseInt((java.lang.String) f07.get(1));
                eVar.f303131c = java.lang.Integer.parseInt((java.lang.String) f07.get(2));
                eVar.f303132d = java.lang.Integer.parseInt((java.lang.String) f07.get(3));
                eVar.f303133e = java.lang.Integer.parseInt((java.lang.String) f07.get(4));
                eVar.f303134f = java.lang.Integer.parseInt((java.lang.String) f07.get(5));
            } else {
                z17 = false;
            }
            if (z17) {
                arrayList.add(eVar);
            }
            i17++;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj5 : arrayList) {
            if (((k04.e) obj5).f303130b != myPid) {
                arrayList2.add(obj5);
            }
        }
        java.util.Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long j17 = ((k04.e) next).f303129a;
                do {
                    java.lang.Object next3 = it.next();
                    long j18 = ((k04.e) next3).f303129a;
                    if (j17 < j18) {
                        j17 = j18;
                        next = next3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        k04.e eVar2 = (k04.e) next;
        long j19 = eVar2 != null ? eVar2.f303129a : 0L;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj6 : arrayList) {
            if (((k04.e) obj6).f303130b == myPid) {
                arrayList3.add(obj6);
            }
        }
        t65.f fVar2 = new t65.f();
        fVar2.L(myPid);
        java.util.Iterator it6 = arrayList3.iterator();
        if (it6.hasNext()) {
            next2 = it6.next();
            if (it6.hasNext()) {
                long j27 = ((k04.e) next2).f303129a;
                do {
                    java.lang.Object next4 = it6.next();
                    long j28 = ((k04.e) next4).f303129a;
                    if (j27 > j28) {
                        next2 = next4;
                        j27 = j28;
                    }
                } while (it6.hasNext());
            }
        } else {
            next2 = null;
        }
        k04.e eVar3 = (k04.e) next2;
        fVar2.H(eVar3 != null ? eVar3.f303129a : c01.id.c());
        java.lang.String e17 = k35.m1.e(fVar2.r());
        kotlin.jvm.internal.o.f(e17, "formatTimeForLog(...)");
        fVar2.I(r26.i0.t(e17, " ", "_", false));
        fVar2.z((int) ((c01.id.c() - fVar2.r()) / 60000));
        if (j19 > 0) {
            fVar2.E((int) ((fVar2.r() - j19) / 60000));
        }
        fVar2.Q(((int) ((c01.id.c() - fVar2.r()) / u04.d.f423477c)) + 1);
        fVar2.O(arrayList3.size());
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj7 : arrayList3) {
            if (((k04.e) obj7).f303133e == 1) {
                arrayList4.add(obj7);
            }
        }
        fVar2.J(arrayList4.size());
        if (fVar2.y() > 0) {
            fVar2.P(fVar2.w() / fVar2.y());
            fVar2.K(fVar2.s() / fVar2.y());
        }
        java.util.Iterator it7 = arrayList3.iterator();
        while (true) {
            if (!it7.hasNext()) {
                obj = null;
                break;
            }
            obj = it7.next();
            if (((k04.e) obj).f303131c == 1) {
                break;
            }
        }
        k04.e eVar4 = (k04.e) obj;
        if (eVar4 != null) {
            fVar2.A((int) ((c01.id.c() - eVar4.f303129a) / 60000));
        }
        java.util.Iterator it8 = arrayList3.iterator();
        while (true) {
            if (!it8.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it8.next();
            if (((k04.e) obj2).f303132d == 1) {
                break;
            }
        }
        k04.e eVar5 = (k04.e) obj2;
        if (eVar5 != null) {
            fVar2.B((int) ((c01.id.c() - eVar5.f303129a) / 60000));
        }
        java.util.Iterator it9 = arrayList3.iterator();
        while (true) {
            if (!it9.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it9.next();
            if (((k04.e) obj3).f303134f == 1) {
                break;
            }
        }
        k04.e eVar6 = (k04.e) obj3;
        if (eVar6 != null) {
            fVar2.F((int) ((c01.id.c() - eVar6.f303129a) / 60000));
        }
        java.util.Iterator it10 = arrayList3.iterator();
        while (true) {
            if (!it10.hasNext()) {
                obj4 = null;
                break;
            }
            java.lang.Object next5 = it10.next();
            if (((k04.e) next5).f303133e == 1) {
                obj4 = next5;
                break;
            }
        }
        k04.e eVar7 = (k04.e) obj4;
        if (eVar7 != null) {
            fVar2.C((int) ((c01.id.c() - eVar7.f303129a) / 60000));
        }
        k04.e eVar8 = (k04.e) kz5.n0.Z(arrayList3);
        if (eVar8 != null) {
            fVar2.G((int) ((c01.id.c() - eVar8.f303129a) / 60000));
        }
        if (!arrayList3.isEmpty()) {
            if (fVar2.x() <= 0.5d) {
                if (fVar2.o() > 0) {
                    if (fVar2.j() < 5) {
                        fVar2.N(1);
                    } else if (fVar2.t() < 0.2d) {
                        fVar2.N(2);
                    } else {
                        fVar2.N(10);
                    }
                } else if (fVar2.k() > 0) {
                    if (fVar2.t() < 0.2d) {
                        fVar2.N(3);
                    } else {
                        fVar2.N(4);
                    }
                } else if (fVar2.t() < 0.2d) {
                    fVar2.N(5);
                } else {
                    fVar2.N(6);
                }
            } else if (fVar2.t() < 0.5d) {
                fVar2.N(7);
            } else if (fVar2.l() > 10) {
                fVar2.N(8);
            } else if (fVar2.p() > 10) {
                fVar2.N(9);
            } else {
                fVar2.N(14);
            }
        } else if (fVar2.o() >= 5) {
            fVar2.N(12);
        } else if (fVar2.o() == -1) {
            fVar2.N(11);
        } else {
            fVar2.N(13);
        }
        this.f303141p = fVar2;
        this.f303142q = c01.id.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessStatusFeatureService", "processStatus " + fVar2.toJson());
        return fVar2;
    }

    public final com.tencent.mm.sdk.platformtools.o4 aj() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.f303138m).getValue();
    }
}
