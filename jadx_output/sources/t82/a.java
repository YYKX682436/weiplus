package t82;

/* loaded from: classes11.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t82.d f416377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.dc f416378e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t82.d dVar, com.tencent.mm.plugin.fav.ui.dc dcVar) {
        super(0);
        this.f416377d = dVar;
        this.f416378e = dcVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.fav.ui.h3 a17 = com.tencent.mm.plugin.fav.ui.h3.f101128c.a();
        java.util.List R6 = this.f416377d.R6();
        a17.getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) R6;
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((java.lang.Number) it.next()).intValue();
                if (!a17.a(intValue)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FavFinderStorage", "[batchRemove] position invalid return");
                    break;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderStorage", "[batchRemove] use pos remove item in favIdList & favItemList, currentThread = " + java.lang.Thread.currentThread().getName());
                a17.f101131b.remove(intValue);
                a17.f101130a.remove(intValue);
                com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderStorage", "[batchRemove] remove success, position = " + intValue);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavFinderStorage", "[batchRemove] positionList empty return");
        }
        this.f416378e.a();
        return jz5.f0.f302826a;
    }
}
