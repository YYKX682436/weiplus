package jz5;

/* loaded from: classes8.dex */
public abstract class h {
    public static final jz5.g a(jz5.i mode, yz5.a initializer) {
        kotlin.jvm.internal.o.g(mode, "mode");
        kotlin.jvm.internal.o.g(initializer, "initializer");
        int ordinal = mode.ordinal();
        if (ordinal == 0) {
            return new jz5.n(initializer, null, 2, null);
        }
        if (ordinal == 1) {
            return new jz5.m(initializer);
        }
        if (ordinal == 2) {
            return new jz5.g0(initializer);
        }
        throw new jz5.j();
    }

    public static final jz5.g b(yz5.a initializer) {
        kotlin.jvm.internal.o.g(initializer, "initializer");
        return new jz5.n(initializer, null, 2, null);
    }
}
