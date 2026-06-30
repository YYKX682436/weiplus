package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public abstract class j0 {
    public static final kotlinx.coroutines.internal.i0 a(java.lang.Object obj) {
        if (obj == kotlinx.coroutines.internal.f.f310492a) {
            throw new java.lang.IllegalStateException("Does not contain segment".toString());
        }
        if (obj != null) {
            return (kotlinx.coroutines.internal.i0) obj;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
    }
}
