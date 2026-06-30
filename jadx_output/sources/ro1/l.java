package ro1;

/* loaded from: classes5.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f397992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f397993e;

    public l(java.util.List list, java.util.List list2) {
        this.f397992d = list;
        this.f397993e = list2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f397992d.isEmpty()) {
            ro1.t.f398008d.e5(this.f397992d);
            java.util.Set set = ro1.t.f398010f;
            kotlin.jvm.internal.o.f(set, "access$getVolumeChangeListeners$p(...)");
            java.util.List list = this.f397992d;
            synchronized (set) {
                kotlin.jvm.internal.o.f(set, "access$getVolumeChangeListeners$p(...)");
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((ro1.e) it.next()).e5(list);
                }
            }
        }
        if (!this.f397993e.isEmpty()) {
            ro1.t.f398008d.X4(this.f397993e);
            java.util.Set set2 = ro1.t.f398010f;
            kotlin.jvm.internal.o.f(set2, "access$getVolumeChangeListeners$p(...)");
            java.util.List list2 = this.f397993e;
            synchronized (set2) {
                kotlin.jvm.internal.o.f(set2, "access$getVolumeChangeListeners$p(...)");
                java.util.Iterator it6 = set2.iterator();
                while (it6.hasNext()) {
                    ((ro1.e) it6.next()).X4(list2);
                }
            }
        }
    }
}
