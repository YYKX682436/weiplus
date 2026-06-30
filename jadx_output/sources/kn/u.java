package kn;

/* loaded from: classes9.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f309465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.j0 f309466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.a3 f309467f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.dd3 f309468g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f309469h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.ya4 f309470i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kn.w f309471m;

    public u(kn.w wVar, java.util.LinkedList linkedList, kv.j0 j0Var, com.tencent.mm.storage.a3 a3Var, r45.dd3 dd3Var, java.util.List list, r45.ya4 ya4Var) {
        this.f309471m = wVar;
        this.f309465d = linkedList;
        this.f309466e = j0Var;
        this.f309467f = a3Var;
        this.f309468g = dd3Var;
        this.f309469h = list;
        this.f309470i = ya4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f309465d.size() < 25 ? this.f309465d.size() : 25;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update img list size:%d, loopCount:%d", this.f309471m.f309481f, java.lang.Integer.valueOf(this.f309465d.size()), java.lang.Integer.valueOf(size));
        if (size == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update img done loopCount is 0", this.f309471m.f309481f);
        } else if (this.f309465d.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update img done newImgFlagList is empty", this.f309471m.f309481f);
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long F = gm0.j1.u().f273153f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            for (int i17 = 0; i17 < size; i17++) {
                com.tencent.mm.modelavatar.r0 r0Var = (com.tencent.mm.modelavatar.r0) this.f309465d.poll();
                if (r0Var == null) {
                    break;
                }
                ((com.tencent.mm.modelavatar.s0) this.f309466e).y0(r0Var);
            }
            gm0.j1.u().f273153f.w(java.lang.Long.valueOf(F));
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update img loopCount:%d, take time:%d(ms), img list size:%d", this.f309471m.f309481f, java.lang.Integer.valueOf(size), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(this.f309465d.size()));
            if (!this.f309465d.isEmpty()) {
                ((ku5.t0) ku5.t0.f312615d).l(this, 100L, "chatroom_member_detail");
                return;
            }
        }
        kn.w wVar = this.f309471m;
        com.tencent.mm.storage.a3 a3Var = this.f309467f;
        java.lang.String str = wVar.f309481f;
        r45.dd3 dd3Var = this.f309468g;
        kn.w.H(wVar, a3Var, 1, str, dd3Var.f372319e, this.f309469h, this.f309470i, wVar.I(dd3Var.f372323i), this.f309471m.I(this.f309468g.f372325n));
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update img done newImgFlagList is empty", this.f309471m.f309481f);
    }
}
