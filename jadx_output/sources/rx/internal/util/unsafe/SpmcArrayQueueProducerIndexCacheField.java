package rx.internal.util.unsafe;

/* loaded from: classes16.dex */
abstract class SpmcArrayQueueProducerIndexCacheField<E> extends rx.internal.util.unsafe.SpmcArrayQueueMidPad<E> {
    private volatile long producerIndexCache;

    public SpmcArrayQueueProducerIndexCacheField(int i17) {
        super(i17);
    }

    public final long lvProducerIndexCache() {
        return this.producerIndexCache;
    }

    public final void svProducerIndexCache(long j17) {
        this.producerIndexCache = j17;
    }
}
