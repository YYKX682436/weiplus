package ph1;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f354330a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f354331b = new java.util.LinkedList();

    public i(int i17) {
        this.f354330a = i17;
    }

    public void a(java.lang.Runnable runnable) {
        java.util.LinkedList linkedList;
        synchronized (this) {
            if (runnable != null) {
                this.f354331b.addLast(runnable);
            }
            int i17 = this.f354330a - 1;
            this.f354330a = i17;
            if (i17 > 0 || this.f354331b.size() <= 0) {
                linkedList = null;
            } else {
                linkedList = new java.util.LinkedList();
                linkedList.addAll(this.f354331b);
                this.f354331b.clear();
            }
        }
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
    }
}
