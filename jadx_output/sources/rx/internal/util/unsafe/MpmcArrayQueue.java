package rx.internal.util.unsafe;

/* loaded from: classes16.dex */
public class MpmcArrayQueue<E> extends rx.internal.util.unsafe.MpmcArrayQueueConsumerField<E> {

    /* renamed from: p30, reason: collision with root package name */
    long f400728p30;

    /* renamed from: p31, reason: collision with root package name */
    long f400729p31;

    /* renamed from: p32, reason: collision with root package name */
    long f400730p32;

    /* renamed from: p33, reason: collision with root package name */
    long f400731p33;

    /* renamed from: p34, reason: collision with root package name */
    long f400732p34;

    /* renamed from: p35, reason: collision with root package name */
    long f400733p35;

    /* renamed from: p36, reason: collision with root package name */
    long f400734p36;
    long p37;

    /* renamed from: p40, reason: collision with root package name */
    long f400735p40;

    /* renamed from: p41, reason: collision with root package name */
    long f400736p41;

    /* renamed from: p42, reason: collision with root package name */
    long f400737p42;

    /* renamed from: p43, reason: collision with root package name */
    long f400738p43;

    /* renamed from: p44, reason: collision with root package name */
    long f400739p44;

    /* renamed from: p45, reason: collision with root package name */
    long f400740p45;

    /* renamed from: p46, reason: collision with root package name */
    long f400741p46;

    public MpmcArrayQueue(int i17) {
        super(java.lang.Math.max(2, i17));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, rx.internal.util.unsafe.MessagePassingQueue
    public boolean isEmpty() {
        return lvConsumerIndex() == lvProducerIndex();
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.MessagePassingQueue
    public boolean offer(E e17) {
        if (e17 == null) {
            throw new java.lang.NullPointerException("Null is not a valid element");
        }
        long j17 = this.mask + 1;
        long[] jArr = this.sequenceBuffer;
        long j18 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        while (true) {
            long lvProducerIndex = lvProducerIndex();
            long calcSequenceOffset = calcSequenceOffset(lvProducerIndex);
            long lvSequence = lvSequence(jArr, calcSequenceOffset) - lvProducerIndex;
            if (lvSequence == 0) {
                long j19 = lvProducerIndex + 1;
                if (casProducerIndex(lvProducerIndex, j19)) {
                    spElement(calcElementOffset(lvProducerIndex), e17);
                    soSequence(jArr, calcSequenceOffset, j19);
                    return true;
                }
            } else if (lvSequence < 0) {
                long j27 = lvProducerIndex - j17;
                if (j27 <= j18) {
                    j18 = lvConsumerIndex();
                    if (j27 <= j18) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.MessagePassingQueue
    public E peek() {
        long lvConsumerIndex;
        E lpElement;
        do {
            lvConsumerIndex = lvConsumerIndex();
            lpElement = lpElement(calcElementOffset(lvConsumerIndex));
            if (lpElement != null) {
                break;
            }
        } while (lvConsumerIndex != lvProducerIndex());
        return lpElement;
    }

    @Override // java.util.Queue, rx.internal.util.unsafe.MessagePassingQueue
    public E poll() {
        long[] jArr = this.sequenceBuffer;
        long j17 = -1;
        while (true) {
            long lvConsumerIndex = lvConsumerIndex();
            long calcSequenceOffset = calcSequenceOffset(lvConsumerIndex);
            long j18 = lvConsumerIndex + 1;
            long lvSequence = lvSequence(jArr, calcSequenceOffset) - j18;
            if (lvSequence == 0) {
                if (casConsumerIndex(lvConsumerIndex, j18)) {
                    long calcElementOffset = calcElementOffset(lvConsumerIndex);
                    E lpElement = lpElement(calcElementOffset);
                    spElement(calcElementOffset, null);
                    soSequence(jArr, calcSequenceOffset, lvConsumerIndex + this.mask + 1);
                    return lpElement;
                }
            } else if (lvSequence < 0 && lvConsumerIndex >= j17) {
                j17 = lvProducerIndex();
                if (lvConsumerIndex == j17) {
                    return null;
                }
            }
        }
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
