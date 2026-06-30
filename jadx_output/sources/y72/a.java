package y72;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f459697d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f459698e = null;

    public a(java.util.List list) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.u00();
        lVar.f70665b = new r45.v00();
        lVar.f70666c = "/cgi-bin/micromsg-bin/checkfavitem";
        lVar.f70667d = 405;
        lVar.f70668e = 196;
        lVar.f70669f = 1000000196;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f459697d = a17;
        r45.u00 u00Var = (r45.u00) a17.f70710a.f70684a;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        u00Var.f386905d = linkedList;
        linkedList.addAll(list);
        u00Var.f386906e = 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem CHECK_FAV_ITEM_SCENE_FIX_OBJECT %s", java.lang.Integer.valueOf(list.size()));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f459698e = u0Var;
        return dispatch(sVar, this.f459697d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 405;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.NetSceneCheckFavItem", "netId %d errType %d errCode %d errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.v00 v00Var = (r45.v00) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem,cgi return error,errcode:%d,errType:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
            this.f459698e.onSceneEnd(i18, i19, str, this);
            return;
        }
        java.util.Iterator it = v00Var.f387782d.iterator();
        while (it.hasNext()) {
            r45.w00 w00Var = (r45.w00) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem, onGYNetEnd,favid: %d, ret: %d", java.lang.Integer.valueOf(w00Var.f388743d), java.lang.Integer.valueOf(w00Var.f388744e));
        }
        this.f459698e.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 10;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    public a(r45.eq0 eq0Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.u00();
        lVar.f70665b = new r45.v00();
        lVar.f70666c = "/cgi-bin/micromsg-bin/checkfavitem";
        lVar.f70667d = 405;
        lVar.f70668e = 196;
        lVar.f70669f = 1000000196;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f459697d = a17;
        r45.u00 u00Var = (r45.u00) a17.f70710a.f70684a;
        u00Var.f386907f = eq0Var;
        u00Var.f386906e = 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem CHECK_FAV_ITEM_SCENE_FIX_DATA %s", java.lang.Integer.valueOf(eq0Var.f373670d));
    }
}
