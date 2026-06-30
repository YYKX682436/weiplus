package rx.internal.util.unsafe;

/* loaded from: classes16.dex */
public final class SpscArrayQueue<E> extends rx.internal.util.unsafe.SpscArrayQueueL3Pad<E> {
    public SpscArrayQueue(int i17) {
        super(i17);
    }

    private long lvConsumerIndex() {
        return rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getLongVolatile(this, rx.internal.util.unsafe.SpscArrayQueueConsumerField.C_INDEX_OFFSET);
    }

    private long lvProducerIndex() {
        return rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getLongVolatile(this, rx.internal.util.unsafe.SpscArrayQueueProducerFields.P_INDEX_OFFSET);
    }

    private void soConsumerIndex(long j17) {
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedLong(this, rx.internal.util.unsafe.SpscArrayQueueConsumerField.C_INDEX_OFFSET, j17);
    }

    private void soProducerIndex(long j17) {
        rx.internal.util.unsafe.UnsafeAccess.UNSAFE.putOrderedLong(this, rx.internal.util.unsafe.SpscArrayQueueProducerFields.P_INDEX_OFFSET, j17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.MessagePassingQueue
    public boolean isEmpty() {
        return lvProducerIndex() == lvConsumerIndex();
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.MessagePassingQueue
    public boolean offer(E e17) {
        if (e17 == null) {
            throw new java.lang.NullPointerException("null elements not allowed");
        }
        E[] eArr = this.buffer;
        long j17 = this.producerIndex;
        long calcElementOffset = calcElementOffset(j17);
        if (lvElement(eArr, calcElementOffset) != null) {
            return false;
        }
        soElement(eArr, calcElementOffset, e17);
        soProducerIndex(j17 + 1);
        return true;
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.MessagePassingQueue
    public E peek() {
        return lvElement(calcElementOffset(this.consumerIndex));
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.MessagePassingQueue
    public E poll() {
        long j17 = this.consumerIndex;
        long calcElementOffset = calcElementOffset(j17);
        E[] eArr = this.buffer;
        E lvElement = lvElement(eArr, calcElementOffset);
        if (lvElement == null) {
            return null;
        }
        soElement(eArr, calcElementOffset, null);
        soConsumerIndex(j17 + 1);
        return lvElement;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.MessagePassingQueue
    public int size() {
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
