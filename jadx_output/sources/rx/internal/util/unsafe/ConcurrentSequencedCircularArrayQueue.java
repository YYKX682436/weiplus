package rx.internal.util.unsafe;

/* loaded from: classes16.dex */
public abstract class ConcurrentSequencedCircularArrayQueue<E> extends rx.internal.util.unsafe.ConcurrentCircularArrayQueue<E> {
    private static final long ARRAY_BASE;
    private static final int ELEMENT_SHIFT;
    protected final long[] sequenceBuffer;

    static {
        if (8 != rx.internal.util.unsafe.UnsafeAccess.UNSAFE.arrayIndexScale(long[].class)) {
            throw new java.lang.IllegalStateException("Unexpected long[] element size");
        }
        ELEMENT_SHIFT = rx.internal.util.unsafe.ConcurrentCircularArrayQueue.SPARSE_SHIFT + 3;
        ARRAY_BASE = r0.arrayBaseOffset(long[].class) + (32 << (r3 - r2));
    }

    public ConcurrentSequencedCircularArrayQueue(int i17) {
        super(i17);
        int i18 = (int) (this.mask + 1);
        this.sequenceBuffer = new long[(i18 << rx.internal.util.unsafe.ConcurrentCircularArrayQueue.SPARSE_SHIFT) + 64];
        for (long j17 = 0; j17 < i18; j17++) {
            soSequence(this.sequenceBuffer, calcSequenceOffset(j17), j17);
        }
    }

    public final long calcSequenceOffset(long j17) {
        return ARRAY_BASE + ((j17 & this.mask) << ELEMENT_SHIFT);
    }

    public final long lvSequence(long[] jArr, long j17) {
        return rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getLongVolatile(jArr, j17);
    }

    public final void soSequence(long[] jArr, long j17, long j18) {
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedLong(jArr, j17, j18);
    }
}
