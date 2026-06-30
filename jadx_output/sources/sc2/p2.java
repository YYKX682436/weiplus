package sc2;

/* loaded from: classes2.dex */
public final class p2 {

    /* renamed from: b, reason: collision with root package name */
    public static final sc2.o2 f406143b = new sc2.o2(null);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f406144c = jz5.h.b(sc2.n2.f406094d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f406145a = new java.util.concurrent.ConcurrentLinkedQueue();

    public p2() {
        new java.util.concurrent.ConcurrentHashMap();
    }

    public final void a(java.util.List list) {
        if (list == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = ((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()).getFeedObject().getObjectDesc();
            if (objectDesc != null) {
                objectDesc.getDescription();
            }
        }
        java.util.Iterator it6 = this.f406145a.iterator();
        if (it6.hasNext()) {
            android.support.v4.media.f.a(it6.next());
            kotlin.jvm.internal.o.d(null);
            throw null;
        }
    }
}
