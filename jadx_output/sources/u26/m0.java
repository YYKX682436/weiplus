package u26;

/* loaded from: classes14.dex */
public class m0 extends u26.k {
    @Override // u26.k
    public void C(java.lang.Object obj, u26.e0 e0Var) {
        kotlinx.coroutines.internal.v0 v0Var = null;
        if (obj != null) {
            boolean z17 = obj instanceof java.util.ArrayList;
            yz5.l lVar = this.f424181d;
            if (z17) {
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                kotlinx.coroutines.internal.v0 v0Var2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    u26.w0 w0Var = (u26.w0) arrayList.get(size);
                    if (w0Var instanceof u26.m) {
                        v0Var2 = lVar != null ? kotlinx.coroutines.internal.d0.a(lVar, ((u26.m) w0Var).f424174g, v0Var2) : null;
                    } else {
                        w0Var.x(e0Var);
                    }
                }
                v0Var = v0Var2;
            } else {
                u26.w0 w0Var2 = (u26.w0) obj;
                if (!(w0Var2 instanceof u26.m)) {
                    w0Var2.x(e0Var);
                } else if (lVar != null) {
                    v0Var = kotlinx.coroutines.internal.d0.a(lVar, ((u26.m) w0Var2).f424174g, null);
                }
            }
        }
        if (v0Var != null) {
            throw v0Var;
        }
    }

    @Override // u26.o
    public final boolean p() {
        return false;
    }

    @Override // u26.o
    public final boolean q() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u26.o
    public java.lang.Object u(java.lang.Object obj) {
        u26.u0 u0Var;
        do {
            java.lang.Object u17 = super.u(obj);
            kotlinx.coroutines.internal.l0 l0Var = u26.l.f424167b;
            if (u17 == l0Var) {
                return l0Var;
            }
            if (u17 != u26.l.f424168c) {
                if (u17 instanceof u26.e0) {
                    return u17;
                }
                throw new java.lang.IllegalStateException(("Invalid offerInternal result " + u17).toString());
            }
            kotlinx.coroutines.internal.m mVar = this.f424182e;
            u26.m mVar2 = new u26.m(obj);
            while (true) {
                kotlinx.coroutines.internal.t n17 = mVar.n();
                if (n17 instanceof u26.u0) {
                    u0Var = (u26.u0) n17;
                    break;
                }
                if (n17.i(mVar2, mVar)) {
                    u0Var = null;
                    break;
                }
            }
            if (u0Var == null) {
                return l0Var;
            }
        } while (!(u0Var instanceof u26.e0));
        return u0Var;
    }

    @Override // u26.k
    public final boolean y() {
        return true;
    }

    @Override // u26.k
    public final boolean z() {
        return true;
    }
}
