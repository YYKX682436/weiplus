package rx.internal.util.unsafe;

/* loaded from: classes16.dex */
public final class SpscLinkedQueue<E> extends rx.internal.util.unsafe.BaseLinkedQueue<E> {
    public SpscLinkedQueue() {
        spProducerNode(new v56.b());
        spConsumerNode(this.producerNode);
        this.consumerNode.lazySet(null);
    }

    @Override // java.util.Queue
    public boolean offer(E e17) {
        if (e17 == null) {
            throw new java.lang.NullPointerException("null elements not allowed");
        }
        v56.b bVar = new v56.b(e17);
        this.producerNode.lazySet(bVar);
        this.producerNode = bVar;
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        v56.b a17 = this.consumerNode.a();
        if (a17 != null) {
            return (E) a17.f433370d;
        }
        return null;
    }

    @Override // java.util.Queue
    public E poll() {
        v56.b a17 = this.consumerNode.a();
        if (a17 == null) {
            return null;
        }
        E e17 = (E) a17.f433370d;
        a17.f433370d = null;
        this.consumerNode = a17;
        return e17;
    }
}
