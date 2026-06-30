package t41;

/* loaded from: classes8.dex */
public class a implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f415482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t41.h f415483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelavatar.s0 f415484f;

    public a(java.util.LinkedList linkedList, t41.h hVar, com.tencent.mm.modelavatar.s0 s0Var) {
        this.f415482d = linkedList;
        this.f415483e = hVar;
        this.f415484f = s0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        java.util.LinkedList linkedList = this.f415482d;
        int size = linkedList.size() < 25 ? linkedList.size() : 25;
        linkedList.size();
        t41.h hVar = this.f415483e;
        if (size == 0) {
            if (hVar != null) {
                hVar.a(1);
            }
            com.tencent.mars.xlog.Log.i("OpenIMChatRoomContactLogic", "updateMemberDetail update img done loopCount is 0");
            return false;
        }
        if (linkedList.isEmpty()) {
            if (hVar != null) {
                hVar.a(1);
            }
            com.tencent.mars.xlog.Log.i("OpenIMChatRoomContactLogic", "updateMemberDetail update img done newImgFlagList is empty");
            return false;
        }
        java.lang.System.currentTimeMillis();
        long F = gm0.j1.u().f273153f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mm.modelavatar.r0 r0Var = (com.tencent.mm.modelavatar.r0) linkedList.poll();
            if (r0Var == null) {
                break;
            }
            this.f415484f.y0(r0Var);
        }
        gm0.j1.u().f273153f.w(java.lang.Long.valueOf(F));
        java.lang.System.currentTimeMillis();
        if (!linkedList.isEmpty()) {
            return true;
        }
        if (hVar != null) {
            hVar.a(1);
        }
        com.tencent.mars.xlog.Log.i("OpenIMChatRoomContactLogic", "updateMemberDetail update img done newImgFlagList is empty");
        return false;
    }
}
