package rx.internal.util.unsafe;

/* loaded from: classes16.dex */
abstract class BaseLinkedQueueProducerNodeRef<E> extends rx.internal.util.unsafe.BaseLinkedQueuePad0<E> {
    protected static final long P_NODE_OFFSET = rx.internal.util.unsafe.UnsafeAccess.addressOf(rx.internal.util.unsafe.BaseLinkedQueueProducerNodeRef.class, "producerNode");
    protected v56.b producerNode;

    public final v56.b lpProducerNode() {
        return this.producerNode;
    }

    public final v56.b lvProducerNode() {
        return (v56.b) rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getObjectVolatile(this, P_NODE_OFFSET);
    }

    public final void spProducerNode(v56.b bVar) {
        this.producerNode = bVar;
    }
}
