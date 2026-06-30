package rx.internal.util.unsafe;

/* loaded from: classes16.dex */
abstract class MpmcArrayQueueProducerField<E> extends rx.internal.util.unsafe.MpmcArrayQueueL1Pad<E> {
    private static final long P_INDEX_OFFSET = rx.internal.util.unsafe.UnsafeAccess.addressOf(rx.internal.util.unsafe.MpmcArrayQueueProducerField.class, "producerIndex");
    private volatile long producerIndex;

    public MpmcArrayQueueProducerField(int i17) {
        super(i17);
    }

    public final boolean casProducerIndex(long j17, long j18) {
        return rx.internal.util.unsafe.UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_INDEX_OFFSET, j17, j18);
    }

    public final long lvProducerIndex() {
        return this.producerIndex;
    }
}
