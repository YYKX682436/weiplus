package rx.internal.util.unsafe;

/* loaded from: classes16.dex */
public class SpscUnboundedArrayQueue<E> extends rx.internal.util.unsafe.SpscUnboundedArrayQueueConsumerField<E> implements rx.internal.util.unsafe.QueueProgressIndicators {
    private static final long C_INDEX_OFFSET;
    private static final long P_INDEX_OFFSET;
    private static final long REF_ARRAY_BASE;
    private static final int REF_ELEMENT_SHIFT;
    static final int MAX_LOOK_AHEAD_STEP = java.lang.Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final java.lang.Object HAS_NEXT = new java.lang.Object();

    static {
        sun.misc.Unsafe unsafe = rx.internal.util.unsafe.UnsafeAccess.UNSAFE;
        int arrayIndexScale = unsafe.arrayIndexScale(java.lang.Object[].class);
        if (4 == arrayIndexScale) {
            REF_ELEMENT_SHIFT = 2;
        } else {
            if (8 != arrayIndexScale) {
                throw new java.lang.IllegalStateException("Unknown pointer size");
            }
            REF_ELEMENT_SHIFT = 3;
        }
        REF_ARRAY_BASE = unsafe.arrayBaseOffset(java.lang.Object[].class);
        try {
            P_INDEX_OFFSET = unsafe.objectFieldOffset(rx.internal.util.unsafe.SpscUnboundedArrayQueueProducerFields.class.getDeclaredField("producerIndex"));
            try {
                C_INDEX_OFFSET = unsafe.objectFieldOffset(rx.internal.util.unsafe.SpscUnboundedArrayQueueConsumerField.class.getDeclaredField("consumerIndex"));
            } catch (java.lang.NoSuchFieldException e17) {
                java.lang.InternalError internalError = new java.lang.InternalError();
                internalError.initCause(e17);
                throw internalError;
            }
        } catch (java.lang.NoSuchFieldException e18) {
            java.lang.InternalError internalError2 = new java.lang.InternalError();
            internalError2.initCause(e18);
            throw internalError2;
        }
    }

    public SpscUnboundedArrayQueue(int i17) {
        int roundToPowerOfTwo = rx.internal.util.unsafe.Pow2.roundToPowerOfTwo(i17);
        long j17 = roundToPowerOfTwo - 1;
        E[] eArr = (E[]) new java.lang.Object[roundToPowerOfTwo + 1];
        this.producerBuffer = eArr;
        this.producerMask = j17;
        adjustLookAheadStep(roundToPowerOfTwo);
        this.consumerBuffer = eArr;
        this.consumerMask = j17;
        this.producerLookAhead = j17 - 1;
        soProducerIndex(0L);
    }

    private void adjustLookAheadStep(int i17) {
        this.producerLookAheadStep = java.lang.Math.min(i17 / 4, MAX_LOOK_AHEAD_STEP);
    }

    private static long calcDirectOffset(long j17) {
        return REF_ARRAY_BASE + (j17 << REF_ELEMENT_SHIFT);
    }

    private static long calcWrappedOffset(long j17, long j18) {
        return calcDirectOffset(j17 & j18);
    }

    private long lvConsumerIndex() {
        return rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getLongVolatile(this, C_INDEX_OFFSET);
    }

    private static <E> java.lang.Object lvElement(E[] eArr, long j17) {
        return rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getObjectVolatile(eArr, j17);
    }

    private E[] lvNext(E[] eArr) {
        return (E[]) ((java.lang.Object[]) lvElement(eArr, calcDirectOffset(eArr.length - 1)));
    }

    private long lvProducerIndex() {
        return rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getLongVolatile(this, P_INDEX_OFFSET);
    }

    private E newBufferPeek(E[] eArr, long j17, long j18) {
        this.consumerBuffer = eArr;
        return (E) lvElement(eArr, calcWrappedOffset(j17, j18));
    }

    private E newBufferPoll(E[] eArr, long j17, long j18) {
        this.consumerBuffer = eArr;
        long calcWrappedOffset = calcWrappedOffset(j17, j18);
        E e17 = (E) lvElement(eArr, calcWrappedOffset);
        if (e17 == null) {
            return null;
        }
        soElement(eArr, calcWrappedOffset, null);
        soConsumerIndex(j17 + 1);
        return e17;
    }

    private void resize(E[] eArr, long j17, long j18, E e17, long j19) {
        E[] eArr2 = (E[]) new java.lang.Object[eArr.length];
        this.producerBuffer = eArr2;
        this.producerLookAhead = (j19 + j17) - 1;
        soElement(eArr2, j18, e17);
        soNext(eArr, eArr2);
        soElement(eArr, j18, HAS_NEXT);
        soProducerIndex(j17 + 1);
    }

    private void soConsumerIndex(long j17) {
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, j17);
    }

    private static void soElement(java.lang.Object[] objArr, long j17, java.lang.Object obj) {
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedObject(objArr, j17, obj);
    }

    private void soNext(E[] eArr, E[] eArr2) {
        soElement(eArr, calcDirectOffset(eArr.length - 1), eArr2);
    }

    private void soProducerIndex(long j17) {
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j17);
    }

    private boolean writeToQueue(E[] eArr, E e17, long j17, long j18) {
        soElement(eArr, j18, e17);
        soProducerIndex(j17 + 1);
        return true;
    }

    @Override // rx.internal.util.unsafe.QueueProgressIndicators
    public long currentConsumerIndex() {
        return lvConsumerIndex();
    }

    @Override // rx.internal.util.unsafe.QueueProgressIndicators
    public long currentProducerIndex() {
        return lvProducerIndex();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(E e17) {
        if (e17 == null) {
            throw new java.lang.NullPointerException("Null is not a valid element");
        }
        E[] eArr = this.producerBuffer;
        long j17 = this.producerIndex;
        long j18 = this.producerMask;
        long calcWrappedOffset = calcWrappedOffset(j17, j18);
        if (j17 < this.producerLookAhead) {
            return writeToQueue(eArr, e17, j17, calcWrappedOffset);
        }
        long j19 = this.producerLookAheadStep + j17;
        if (lvElement(eArr, calcWrappedOffset(j19, j18)) == null) {
            this.producerLookAhead = j19 - 1;
            return writeToQueue(eArr, e17, j17, calcWrappedOffset);
        }
        if (lvElement(eArr, calcWrappedOffset(1 + j17, j18)) != null) {
            return writeToQueue(eArr, e17, j17, calcWrappedOffset);
        }
        resize(eArr, j17, calcWrappedOffset, e17, j18);
        return true;
    }

    @Override // java.util.Queue
    public final E peek() {
        E[] eArr = this.consumerBuffer;
        long j17 = this.consumerIndex;
        long j18 = this.consumerMask;
        E e17 = (E) lvElement(eArr, calcWrappedOffset(j17, j18));
        return e17 == HAS_NEXT ? newBufferPeek(lvNext(eArr), j17, j18) : e17;
    }

    @Override // java.util.Queue
    public final E poll() {
        E[] eArr = this.consumerBuffer;
        long j17 = this.consumerIndex;
        long j18 = this.consumerMask;
        long calcWrappedOffset = calcWrappedOffset(j17, j18);
        E e17 = (E) lvElement(eArr, calcWrappedOffset);
        boolean z17 = e17 == HAS_NEXT;
        if (e17 == null || z17) {
            if (z17) {
                return newBufferPoll(lvNext(eArr), j17, j18);
            }
            return null;
        }
        soElement(eArr, calcWrappedOffset, null);
        soConsumerIndex(j17 + 1);
        return e17;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        long lvConsumerIndex = lvConsumerIndex();
        while (true) {
            long lvProducerIndex = lvProducerIndex();
            long lvConsumerIndex2 = lvConsumerIndex();
            if (lvConsumerIndex == lvConsumerIndex2) {
                return (int) (lvProducerIndex - lvConsumerIndex2);
            }
            lvConsumerIndex = lvConsumerIndex2;
        }
    }
}
