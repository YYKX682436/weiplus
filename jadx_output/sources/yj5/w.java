package yj5;

/* loaded from: classes8.dex */
public final class w implements ps5.f {
    public void b(java.lang.String hostRoomId) {
        kotlin.jvm.internal.o.g(hostRoomId, "hostRoomId");
        java.util.ArrayList arrayList = yj5.k.f462718h;
        java.util.Iterator it = yj5.k.f462718h.iterator();
        while (it.hasNext()) {
            yj5.j jVar = (yj5.j) ((ps5.e) it.next());
            jVar.getClass();
            yj5.k kVar = jVar.f462717a;
            if (kotlin.jvm.internal.o.b(kVar.f198580d.x(), hostRoomId)) {
                java.util.ArrayList arrayList2 = yj5.k.f462718h;
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveTipsBarProcessor", "finderLiveTipsNotifier hostRoomId:".concat(hostRoomId));
                pm0.v.X(new yj5.i(kVar));
            }
        }
    }
}
