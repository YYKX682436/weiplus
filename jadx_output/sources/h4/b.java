package h4;

/* loaded from: classes14.dex */
public final class b implements h4.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayDeque f278621a;

    /* renamed from: b, reason: collision with root package name */
    public final int f278622b;

    public b(int i17) {
        this.f278622b = i17;
        this.f278621a = new java.util.ArrayDeque(i17 > 10 ? 10 : i17);
    }

    @Override // h4.a
    public void a(h4.n item) {
        kotlin.jvm.internal.o.g(item, "item");
        while (true) {
            java.util.ArrayDeque arrayDeque = this.f278621a;
            if (arrayDeque.size() < this.f278622b) {
                arrayDeque.offerLast(item);
                return;
            }
            arrayDeque.pollFirst();
        }
    }

    @Override // h4.a
    public java.util.Collection getItems() {
        return this.f278621a;
    }

    @Override // h4.a
    public boolean isEmpty() {
        return ((java.util.ArrayDeque) getItems()).isEmpty();
    }
}
