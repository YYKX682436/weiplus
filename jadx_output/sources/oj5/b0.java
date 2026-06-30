package oj5;

/* loaded from: classes12.dex */
public class b0 extends androidx.recyclerview.widget.y2 {

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f345836c = new java.util.concurrent.ConcurrentHashMap();

    @Override // androidx.recyclerview.widget.y2
    public void a() {
        this.f345836c.clear();
    }

    @Override // androidx.recyclerview.widget.y2
    public androidx.recyclerview.widget.k3 b(int i17) {
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) this.f345836c.get(java.lang.Integer.valueOf(i17));
        if (concurrentLinkedDeque != null) {
            return (androidx.recyclerview.widget.k3) concurrentLinkedDeque.pollFirst();
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.y2
    public void d(androidx.recyclerview.widget.k3 k3Var) {
        java.lang.Object putIfAbsent;
        if (k3Var != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f345836c;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(k3Var.getItemViewType());
            java.lang.Object obj = concurrentHashMap.get(valueOf);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new java.util.concurrent.ConcurrentLinkedDeque()))) != null) {
                obj = putIfAbsent;
            }
            ((java.util.concurrent.ConcurrentLinkedDeque) obj).offerLast(k3Var);
        }
    }
}
