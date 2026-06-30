package rx.internal.util.unsafe;

/* loaded from: classes16.dex */
public final class MpscLinkedQueue<E> extends rx.internal.util.unsafe.BaseLinkedQueue<E> {
    public MpscLinkedQueue() {
        v56.b bVar = new v56.b();
        this.consumerNode = bVar;
        xchgProducerNode(bVar);
    }

    @Override // java.util.Queue
    public boolean offer(E e17) {
        if (e17 == null) {
            throw new java.lang.NullPointerException("null elements not allowed");
        }
        v56.b bVar = new v56.b(e17);
        xchgProducerNode(bVar).lazySet(bVar);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        v56.b a17;
        v56.b bVar = this.consumerNode;
        v56.b a18 = bVar.a();
        if (a18 != null) {
            return (E) a18.f433370d;
        }
        if (bVar == lvProducerNode()) {
            return null;
        }
        do {
            a17 = bVar.a();
        } while (a17 == null);
        return (E) a17.f433370d;
    }

    @Override // java.util.Queue
    public E poll() {
        v56.b a17;
        v56.b lpConsumerNode = lpConsumerNode();
        v56.b a18 = lpConsumerNode.a();
        if (a18 != null) {
            E e17 = (E) a18.f433370d;
            a18.f433370d = null;
            spConsumerNode(a18);
            return e17;
        }
        if (lpConsumerNode == lvProducerNode()) {
            return null;
        }
        do {
            a17 = lpConsumerNode.a();
        } while (a17 == null);
        E e18 = (E) a17.f433370d;
        a17.f433370d = null;
        this.consumerNode = a17;
        return e18;
    }

    public v56.b xchgProducerNode(v56.b bVar) {
        v56.b bVar2;
        do {
            bVar2 = this.producerNode;
        } while (!rx.internal.util.unsafe.a.a(rx.internal.util.unsafe.UnsafeAccess.UNSAFE, this, rx.internal.util.unsafe.BaseLinkedQueueProducerNodeRef.P_NODE_OFFSET, bVar2, bVar));
        return bVar2;
    }
}
