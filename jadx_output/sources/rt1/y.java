package rt1;

/* loaded from: classes16.dex */
public final class y {
    public y(kotlin.jvm.internal.i iVar) {
    }

    public final rt1.k0 a(int i17) {
        if (!(i17 >= 0 && i17 < 8)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (i17 == 0) {
            return rt1.k0.f399434e;
        }
        if (i17 == 1) {
            return rt1.k0.f399435f;
        }
        if (2 <= i17 && i17 < 5) {
            return rt1.k0.f399436g;
        }
        if (i17 == 5) {
            return rt1.k0.f399437h;
        }
        if (6 <= i17 && i17 < 8) {
            return rt1.k0.f399438i;
        }
        throw new java.lang.IllegalStateException("Invalid index".toString());
    }
}
