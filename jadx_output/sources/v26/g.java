package v26;

/* loaded from: classes14.dex */
public abstract class g implements v26.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final oz5.l f433002d;

    /* renamed from: e, reason: collision with root package name */
    public final int f433003e;

    /* renamed from: f, reason: collision with root package name */
    public final u26.u f433004f;

    public g(oz5.l lVar, int i17, u26.u uVar) {
        this.f433002d = lVar;
        this.f433003e = i17;
        this.f433004f = uVar;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object f17 = kotlinx.coroutines.z0.f(new v26.e(kVar, this, null), continuation);
        return f17 == pz5.a.f359186d ? f17 : jz5.f0.f302826a;
    }

    @Override // v26.h0
    public kotlinx.coroutines.flow.j b(oz5.l lVar, int i17, u26.u uVar) {
        oz5.l lVar2 = this.f433002d;
        oz5.l plus = lVar.plus(lVar2);
        u26.u uVar2 = u26.u.SUSPEND;
        u26.u uVar3 = this.f433004f;
        int i18 = this.f433003e;
        if (uVar == uVar2) {
            if (i18 != -3) {
                if (i17 != -3) {
                    if (i18 != -2) {
                        if (i17 != -2) {
                            i17 += i18;
                            if (i17 < 0) {
                                i17 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i17 = i18;
            }
            uVar = uVar3;
        }
        return (kotlin.jvm.internal.o.b(plus, lVar2) && i17 == i18 && uVar == uVar3) ? this : g(plus, i17, uVar);
    }

    public java.lang.String c() {
        return null;
    }

    public abstract java.lang.Object f(u26.r0 r0Var, kotlin.coroutines.Continuation continuation);

    public abstract v26.g g(oz5.l lVar, int i17, u26.u uVar);

    public kotlinx.coroutines.flow.j h() {
        return null;
    }

    public u26.t0 i(kotlinx.coroutines.y0 y0Var) {
        int i17 = this.f433003e;
        if (i17 == -3) {
            i17 = -2;
        }
        kotlinx.coroutines.a1 a1Var = kotlinx.coroutines.a1.ATOMIC;
        yz5.p fVar = new v26.f(this, null);
        u26.q0 q0Var = new u26.q0(kotlinx.coroutines.m0.b(y0Var, this.f433002d), u26.z.a(i17, this.f433004f, null, 4, null));
        q0Var.j0(a1Var, q0Var, fVar);
        return q0Var;
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        java.lang.String c17 = c();
        if (c17 != null) {
            arrayList.add(c17);
        }
        oz5.m mVar = oz5.m.f350329d;
        oz5.l lVar = this.f433002d;
        if (lVar != mVar) {
            arrayList.add("context=" + lVar);
        }
        int i17 = this.f433003e;
        if (i17 != -3) {
            arrayList.add("capacity=" + i17);
        }
        u26.u uVar = u26.u.SUSPEND;
        u26.u uVar2 = this.f433004f;
        if (uVar2 != uVar) {
            arrayList.add("onBufferOverflow=" + uVar2);
        }
        return getClass().getSimpleName() + '[' + kz5.n0.g0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
