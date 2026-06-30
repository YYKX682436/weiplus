package rx.internal.util.unsafe;

/* loaded from: classes16.dex */
abstract class BaseLinkedQueue<E> extends rx.internal.util.unsafe.BaseLinkedQueueConsumerNodeRef<E> {

    /* renamed from: p00, reason: collision with root package name */
    long f400672p00;

    /* renamed from: p01, reason: collision with root package name */
    long f400673p01;

    /* renamed from: p02, reason: collision with root package name */
    long f400674p02;

    /* renamed from: p03, reason: collision with root package name */
    long f400675p03;

    /* renamed from: p04, reason: collision with root package name */
    long f400676p04;

    /* renamed from: p05, reason: collision with root package name */
    long f400677p05;

    /* renamed from: p06, reason: collision with root package name */
    long f400678p06;
    long p07;

    /* renamed from: p30, reason: collision with root package name */
    long f400679p30;

    /* renamed from: p31, reason: collision with root package name */
    long f400680p31;

    /* renamed from: p32, reason: collision with root package name */
    long f400681p32;

    /* renamed from: p33, reason: collision with root package name */
    long f400682p33;

    /* renamed from: p34, reason: collision with root package name */
    long f400683p34;

    /* renamed from: p35, reason: collision with root package name */
    long f400684p35;

    /* renamed from: p36, reason: collision with root package name */
    long f400685p36;
    long p37;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return lvConsumerNode() == lvProducerNode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        v56.b a17;
        v56.b lvConsumerNode = lvConsumerNode();
        v56.b lvProducerNode = lvProducerNode();
        int i17 = 0;
        while (lvConsumerNode != lvProducerNode && i17 < Integer.MAX_VALUE) {
            do {
                a17 = lvConsumerNode.a();
            } while (a17 == null);
            i17++;
            lvConsumerNode = a17;
        }
        return i17;
    }
}
