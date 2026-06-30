package rx.internal.util.unsafe;

/* loaded from: classes16.dex */
abstract class SpmcArrayQueueProducerField<E> extends rx.internal.util.unsafe.SpmcArrayQueueL1Pad<E> {
    protected static final long P_INDEX_OFFSET = rx.internal.util.unsafe.UnsafeAccess.addressOf(rx.internal.util.unsafe.SpmcArrayQueueProducerField.class, "producerIndex");
    private volatile long producerIndex;

    public SpmcArrayQueueProducerField(int i17) {
        super(i17);
    }

    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    public final void soTail(long j17) {
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j17);
    }
}
