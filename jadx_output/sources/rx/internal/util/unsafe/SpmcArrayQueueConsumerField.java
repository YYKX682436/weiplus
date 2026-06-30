package rx.internal.util.unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public abstract class SpmcArrayQueueConsumerField<E> extends rx.internal.util.unsafe.SpmcArrayQueueL2Pad<E> {
    protected static final long C_INDEX_OFFSET = rx.internal.util.unsafe.UnsafeAccess.addressOf(rx.internal.util.unsafe.SpmcArrayQueueConsumerField.class, "consumerIndex");
    private volatile long consumerIndex;

    public SpmcArrayQueueConsumerField(int i17) {
        super(i17);
    }

    public final boolean casHead(long j17, long j18) {
        return rx.internal.util.unsafe.UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, j17, j18);
    }

    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }
}
