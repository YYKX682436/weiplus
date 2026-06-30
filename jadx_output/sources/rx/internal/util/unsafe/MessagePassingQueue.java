package rx.internal.util.unsafe;

/* loaded from: classes15.dex */
public interface MessagePassingQueue<M> {
    boolean isEmpty();

    boolean offer(M m17);

    M peek();

    M poll();

    int size();
}
