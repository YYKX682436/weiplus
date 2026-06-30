package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class w2 extends kotlinx.coroutines.g0 implements kotlinx.coroutines.s1, kotlinx.coroutines.k2 {

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.c3 f310690g;

    @Override // kotlinx.coroutines.k2
    public boolean a() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.t, kotlinx.coroutines.s1
    public void dispose() {
        boolean z17;
        kotlinx.coroutines.c3 w17 = w();
        do {
            java.lang.Object P = w17.P();
            if (!(P instanceof kotlinx.coroutines.w2)) {
                if (!(P instanceof kotlinx.coroutines.k2) || ((kotlinx.coroutines.k2) P).f() == null) {
                    return;
                }
                q();
                return;
            }
            if (P != this) {
                return;
            }
            kotlinx.coroutines.v1 v1Var = kotlinx.coroutines.d3.f310167g;
            while (true) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.c3.f310149d;
                if (atomicReferenceFieldUpdater.compareAndSet(w17, P, v1Var)) {
                    z17 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(w17) != P) {
                    z17 = false;
                    break;
                }
            }
        } while (!z17);
    }

    @Override // kotlinx.coroutines.k2
    public kotlinx.coroutines.h3 f() {
        return null;
    }

    public kotlinx.coroutines.r2 getParent() {
        return w();
    }

    @Override // kotlinx.coroutines.internal.t
    public java.lang.String toString() {
        return getClass().getSimpleName() + '@' + kotlinx.coroutines.c1.a(this) + "[job@" + kotlinx.coroutines.c1.a(w()) + ']';
    }

    public final kotlinx.coroutines.c3 w() {
        kotlinx.coroutines.c3 c3Var = this.f310690g;
        if (c3Var != null) {
            return c3Var;
        }
        kotlin.jvm.internal.o.o("job");
        throw null;
    }
}
