package t41;

/* loaded from: classes8.dex */
public class b implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f415485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t41.h f415486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.e8 f415487f;

    public b(java.util.LinkedList linkedList, t41.h hVar, com.tencent.mm.storage.e8 e8Var) {
        this.f415485d = linkedList;
        this.f415486e = hVar;
        this.f415487f = e8Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        java.util.LinkedList linkedList = this.f415485d;
        int size = linkedList.size() < 25 ? linkedList.size() : 25;
        linkedList.size();
        t41.h hVar = this.f415486e;
        if (size == 0) {
            if (hVar != null) {
                hVar.a(2);
            }
            com.tencent.mars.xlog.Log.i("OpenIMChatRoomContactLogic", "updateMemberDetail update ctg done loopCount is 0");
            return false;
        }
        java.lang.System.currentTimeMillis();
        long F = gm0.j1.u().f273153f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        for (int i17 = 0; i17 < size; i17++) {
            android.util.Pair pair = (android.util.Pair) linkedList.poll();
            ((com.tencent.mm.storage.k4) this.f415487f).p0((java.lang.String) pair.first, (com.tencent.mm.storage.z3) pair.second);
        }
        gm0.j1.u().f273153f.w(java.lang.Long.valueOf(F));
        java.lang.System.currentTimeMillis();
        if (!linkedList.isEmpty()) {
            return true;
        }
        if (hVar != null) {
            hVar.a(2);
        }
        com.tencent.mars.xlog.Log.i("OpenIMChatRoomContactLogic", "updateMemberDetail update ctg done updateList is empty");
        return false;
    }
}
