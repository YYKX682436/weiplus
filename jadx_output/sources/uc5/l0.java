package uc5;

/* loaded from: classes10.dex */
public abstract class l0 extends xm3.a {
    public l0(kotlin.jvm.internal.i iVar) {
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        boolean z17;
        uc5.l0 other = (uc5.l0) obj;
        kotlin.jvm.internal.o.g(other, "other");
        if (compareTo(other) != 0) {
            return false;
        }
        if (this instanceof uc5.k0) {
            z17 = true;
        } else if (this instanceof uc5.h0) {
            if (other instanceof uc5.h0) {
                z17 = kotlin.jvm.internal.o.b(((uc5.h0) this).f426494d.f426476d, ((uc5.h0) other).f426494d.f426476d);
            }
            z17 = false;
        } else if (this instanceof uc5.i0) {
            if (other instanceof uc5.i0) {
                z17 = kotlin.jvm.internal.o.b(((uc5.i0) this).f426501d, ((uc5.i0) other).f426501d);
            }
            z17 = false;
        } else {
            if (!(this instanceof uc5.j0)) {
                throw new jz5.j();
            }
            z17 = other instanceof uc5.j0;
        }
        return z17;
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }
}
