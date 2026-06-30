package jr;

/* loaded from: classes12.dex */
public final class d extends jr.a {

    /* renamed from: f, reason: collision with root package name */
    public final jr.g f301293f;

    /* renamed from: g, reason: collision with root package name */
    public final jr.i f301294g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f301295h;

    public d(im5.b bVar) {
        super(bVar);
        this.f301293f = new jr.g();
        this.f301294g = new jr.i(bVar);
        this.f301295h = new java.util.LinkedList();
    }

    public static final void a(jr.d dVar, java.util.List list, java.util.List list2) {
        boolean z17;
        dVar.getClass();
        int size = list2.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (list.size() >= 100) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1418L, 25, 1L);
                return;
            }
            jr.p pVar = (jr.p) list2.get(i17);
            if (!list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!(!kotlin.jvm.internal.o.b(((jr.p) it.next()).f301316a.getMd5(), pVar.f301316a.getMd5()))) {
                        z17 = false;
                        break;
                    }
                }
            }
            z17 = true;
            if (z17) {
                pVar.f301317b.f301315d = list.size() + 1;
                list.add(list2.get(i17));
            }
        }
    }
}
