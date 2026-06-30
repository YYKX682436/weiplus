package gi2;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.mic.custom.LiveCustomRoomLayoutView f272264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gi2.c f272265e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.finder.live.mic.custom.LiveCustomRoomLayoutView liveCustomRoomLayoutView, gi2.c cVar) {
        super(0);
        this.f272264d = liveCustomRoomLayoutView;
        this.f272265e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.live.mic.custom.LiveCustomRoomLayoutView liveCustomRoomLayoutView = this.f272264d;
        gi2.d f111700w = liveCustomRoomLayoutView.getF111700w();
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        gi2.c cVar = this.f272265e;
        if (f111700w != null) {
            java.util.LinkedList linkedList = ((gi2.e) f111700w).f272273g;
            int size = linkedList.size();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int i17 = 0; i17 < size; i17++) {
                java.lang.Object obj = linkedList.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                xh2.a aVar = (xh2.a) obj;
                arrayList.add(f111700w.a(i17));
                arrayList2.add(aVar.f454521b);
                com.tencent.mars.xlog.Log.i(cVar.f272266a, "addView index:" + i17 + " layoutInfo:" + aVar);
            }
            liveCustomRoomLayoutView.removeAllViews();
            if (arrayList.size() <= 0 || arrayList.size() != arrayList2.size()) {
                com.tencent.mars.xlog.Log.i(cVar.f272266a, "viewList size:" + arrayList.size() + ", layoutInfoList size:" + arrayList2.size());
            } else {
                cVar.c(arrayList);
                cVar.b(arrayList, f111700w, liveCustomRoomLayoutView);
            }
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(cVar.f272266a, "notifyUpdate layoutAdapter = null");
        }
        return f0Var2;
    }
}
