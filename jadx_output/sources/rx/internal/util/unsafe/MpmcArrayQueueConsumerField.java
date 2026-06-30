package rx.internal.util.unsafe;

/* loaded from: classes16.dex */
abstract class MpmcArrayQueueConsumerField<E> extends rx.internal.util.unsafe.MpmcArrayQueueL2Pad<E> {
    private static final long C_INDEX_OFFSET = rx.internal.util.unsafe.UnsafeAccess.addressOf(rx.internal.util.unsafe.MpmcArrayQueueConsumerField.class, "consumerIndex");
    private volatile long consumerIndex;

    public MpmcArrayQueueConsumerField(int i17) {
        super(i17);
    }

    public final boolean casConsumerIndex(long j17, long j18) {
        return rx.internal.util.unsafe.UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, j17, j18);
    }

    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }
}
