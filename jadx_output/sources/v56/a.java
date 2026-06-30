package v56;

/* loaded from: classes14.dex */
public abstract class a extends java.util.AbstractQueue {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceArray f433368d;

    /* renamed from: e, reason: collision with root package name */
    public final int f433369e;

    public a(int i17) {
        int roundToPowerOfTwo = rx.internal.util.unsafe.Pow2.roundToPowerOfTwo(i17);
        this.f433369e = roundToPowerOfTwo - 1;
        this.f433368d = new java.util.concurrent.atomic.AtomicReferenceArray(roundToPowerOfTwo);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (((v56.c) this).poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        throw new java.lang.UnsupportedOperationException();
    }
}
