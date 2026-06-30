package t31;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f415399f = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f415400d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f415401e;

    public a() {
        this.f415400d = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6238;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getnetworkinfo";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70675l = 0;
        lVar.f70677n = null;
        lVar.f70664a = new r45.lj3();
        lVar.f70665b = new r45.mj3();
        lVar.f70677n = null;
        this.f415400d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        java.lang.String[] P0;
        this.f415401e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f415400d;
        r45.lj3 lj3Var = (r45.lj3) oVar.f70710a.f70684a;
        try {
            P0 = gm0.j1.n().f273288b.f70764d.P0("newdns");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMNetIdRequest", e17.getLocalizedMessage());
            lj3Var.f379517d = "";
            lj3Var.f379518e = "";
            lj3Var.f379519f = "";
        }
        if (P0 != null && P0.length == 3) {
            lj3Var.f379517d = android.text.TextUtils.isEmpty(P0[0]) ? "" : P0[0];
            lj3Var.f379518e = android.text.TextUtils.isEmpty(P0[1]) ? "" : P0[1];
            lj3Var.f379519f = android.text.TextUtils.isEmpty(P0[2]) ? "" : P0[2];
            f415399f.set(true);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMNetIdRequest", "net id from newdns " + lj3Var.f379517d + " client ip " + lj3Var.f379519f);
            return dispatch(sVar, oVar, this);
        }
        lj3Var.f379517d = "";
        lj3Var.f379518e = "";
        lj3Var.f379519f = "";
        f415399f.set(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNetIdRequest", "net id from newdns " + lj3Var.f379517d + " client ip " + lj3Var.f379519f);
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6238;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNetIdRequest", "ErrType:" + i18 + "   errCode:" + i19 + " error msg " + str);
        f415399f.set(false);
        if (i19 == 0 && i18 == 0) {
            r45.mj3 mj3Var = (r45.mj3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            try {
                com.tencent.mm.network.s sVar = gm0.j1.n().f273288b.f70764d;
                if (sVar != null && mj3Var != null) {
                    sVar.q1(mj3Var.f380558d, java.lang.String.valueOf(mj3Var.f380560f), mj3Var.f380561g);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMNetIdRequest", e17.getLocalizedMessage());
            }
        }
        this.f415401e.onSceneEnd(i18, i19, str, this);
    }
}
