package rx.internal.util.unsafe;

/* loaded from: classes16.dex */
abstract class BaseLinkedQueueConsumerNodeRef<E> extends rx.internal.util.unsafe.BaseLinkedQueuePad1<E> {
    protected static final long C_NODE_OFFSET = rx.internal.util.unsafe.UnsafeAccess.addressOf(rx.internal.util.unsafe.BaseLinkedQueueConsumerNodeRef.class, "consumerNode");
    protected v56.b consumerNode;

    public final v56.b lpConsumerNode() {
        return this.consumerNode;
    }

    public final v56.b lvConsumerNode() {
        return (v56.b) rx.internal.util.unsafe.UnsafeAccess.UNSAFE.getObjectVolatile(this, C_NODE_OFFSET);
    }

    public final void spConsumerNode(v56.b bVar) {
        this.consumerNode = bVar;
    }
}
