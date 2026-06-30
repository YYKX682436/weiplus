package kn;

/* loaded from: classes9.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f309472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.e8 f309473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.a3 f309474f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.dd3 f309475g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f309476h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.ya4 f309477i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kn.w f309478m;

    public v(kn.w wVar, java.util.LinkedList linkedList, com.tencent.mm.storage.e8 e8Var, com.tencent.mm.storage.a3 a3Var, r45.dd3 dd3Var, java.util.List list, r45.ya4 ya4Var) {
        this.f309478m = wVar;
        this.f309472d = linkedList;
        this.f309473e = e8Var;
        this.f309474f = a3Var;
        this.f309475g = dd3Var;
        this.f309476h = list;
        this.f309477i = ya4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f309472d.size() < 25 ? this.f309472d.size() : 25;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update ctg list size:%d, loopCount:%d", this.f309478m.f309481f, java.lang.Integer.valueOf(this.f309472d.size()), java.lang.Integer.valueOf(size));
        if (size == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update ctg done loopCount is 0", this.f309478m.f309481f);
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long F = gm0.j1.u().f273153f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            for (int i17 = 0; i17 < size; i17++) {
                android.util.Pair pair = (android.util.Pair) this.f309472d.poll();
                java.lang.Object obj = pair.second;
                if (obj == null || ((int) ((com.tencent.mm.storage.z3) obj).E2) != 0) {
                    ((com.tencent.mm.storage.k4) this.f309473e).p0((java.lang.String) pair.first, (com.tencent.mm.storage.z3) obj);
                } else {
                    ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Bi(((com.tencent.mm.storage.z3) pair.second).Q0(), ((com.tencent.mm.storage.z3) pair.second).G0(), 0);
                    ((com.tencent.mm.storage.k4) this.f309473e).l0((com.tencent.mm.storage.z3) pair.second);
                }
            }
            gm0.j1.u().f273153f.w(java.lang.Long.valueOf(F));
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update ctg loopCount:%d, take time:%d(ms), img list size:%d", this.f309478m.f309481f, java.lang.Integer.valueOf(size), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(this.f309472d.size()));
            if (!this.f309472d.isEmpty()) {
                ((ku5.t0) ku5.t0.f312615d).l(this, 100L, "chatroom_member_detail");
                return;
            }
        }
        kn.w wVar = this.f309478m;
        com.tencent.mm.storage.a3 a3Var = this.f309474f;
        java.lang.String str = wVar.f309481f;
        r45.dd3 dd3Var = this.f309475g;
        kn.w.H(wVar, a3Var, 2, str, dd3Var.f372319e, this.f309476h, this.f309477i, wVar.I(dd3Var.f372323i), this.f309478m.I(this.f309475g.f372325n));
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update ctg done updateList is empty", this.f309478m.f309481f);
    }
}
