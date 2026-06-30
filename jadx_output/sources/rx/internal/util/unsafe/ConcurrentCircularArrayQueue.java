package rx.internal.util.unsafe;

/* loaded from: classes16.dex */
public abstract class ConcurrentCircularArrayQueue<E> extends rx.internal.util.unsafe.ConcurrentCircularArrayQueueL0Pad<E> {
    protected static final int BUFFER_PAD = 32;
    private static final long REF_ARRAY_BASE;
    private static final int REF_ELEMENT_SHIFT;
    protected static final int SPARSE_SHIFT;
    protected final E[] buffer;
    protected final long mask;

    static {
        int intValue = java.lang.Integer.getInteger("sparse.shift", 0).intValue();
        SPARSE_SHIFT = intValue;
        int arrayIndexScale = rx.internal.util.unsafe.UnsafeAccess.UNSAFE.arrayIndexScale(java.lang.Object[].class);
        if (4 == arrayIndexScale) {
            REF_ELEMENT_SHIFT = intValue + 2;
        } else {
            if (8 != arrayIndexScale) {
                throw new java.lang.IllegalStateException("Unknown pointer size");
            }
            REF_ELEMENT_SHIFT = intValue + 3;
        }
        REF_ARRAY_BASE = r1.arrayBaseOffset(java.lang.Object[].class) + (32 << (REF_ELEMENT_SHIFT - intValue));
    }

    public ConcurrentCircularArrayQueue(int i17) {
        int roundToPowerOfTwo = rx.internal.util.unsafe.Pow2.roundToPowerOfTwo(i17);
        this.mask = roundToPowerOfTwo - 1;
        this.buffer = (E[]) new java.lang.Object[(roundToPowerOfTwo << SPARSE_SHIFT) + 64];
    }

    public final long calcElementOffset(long j17) {
        return calcElementOffset(j17, this.mask);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    public final E lpElement(long j17) {
        return lpElement(this.buffer, j17);
    }

    public final E lvElement(long j17) {
        return lvElement(this.buffer, j17);
    }

    public final void soElement(long j17, E e17) {
        soElement(this.buffer, j17, e17);
    }

    public final void spElement(long j17, E e17) {
        spElement(this.buffer, j17, e17);
    }

    public final long calcElementOffset(long j17, long j18) {
        return REF_ARRAY_BASE + ((j17 & j18) << REF_ELEMENT_SHIFT);
    }

    public final E lpElement(E[] eArr, long j17) {
        return (E) rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getObject(eArr, j17);
    }

    public final E lvElement(E[] eArr, long j17) {
        return (E) rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getObjectVolatile(eArr, j17);
    }

    public final void soElement(E[] eArr, long j17, E e17) {
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedObject(eArr, j17, e17);
    }

    public final void spElement(E[] eArr, long j17, E e17) {
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putObject(eArr, j17, e17);
    }
}
