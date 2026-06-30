package k14;

/* loaded from: classes4.dex */
public class z extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f303419d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f303420e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f303421f = false;

    public z() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.hl3();
        lVar.f70665b = new r45.il3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getpluginswitch";
        lVar.f70667d = 4158;
        this.f303419d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f303420e = u0Var;
        return dispatch(sVar, this.f303419d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4158;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.il3 il3Var;
        r45.y85 y85Var;
        java.util.LinkedList linkedList;
        if (i18 == 0 && i19 == 0 && (il3Var = (r45.il3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a) != null && (y85Var = il3Var.f377128d) != null && (linkedList = y85Var.f390863d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.x85 x85Var = (r45.x85) it.next();
                if (x85Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetMiniShopHelperPluginShowStatus", "updateNeedShow, switchId: %d, switchValue: %b", java.lang.Integer.valueOf(x85Var.f389874d), java.lang.Boolean.valueOf(x85Var.f389875e));
                    if (5200001 == x85Var.f389874d) {
                        this.f303421f = x85Var.f389875e;
                        break;
                    }
                }
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f303420e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
