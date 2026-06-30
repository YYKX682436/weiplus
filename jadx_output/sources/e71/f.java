package e71;

/* loaded from: classes4.dex */
public class f extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f249874d;

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nn3();
        lVar.f70665b = new r45.on3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getsafetyinfo";
        lVar.f70667d = 850;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f249874d = u0Var;
        return dispatch(sVar, a17, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 850;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.util.LinkedList linkedList;
        r45.iu5 iu5Var;
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetSafetyInfo", "errType:%d, errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
        r45.on3 on3Var = (r45.on3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0) {
            if (on3Var == null || (iu5Var = on3Var.f382377d) == null || (linkedList = iu5Var.f377341d) == null) {
                linkedList = null;
            }
            if (linkedList != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetSafetyInfo", "NetSceneGetSafetyInfo onGYNetEnd get list.size = " + linkedList.size());
                e71.k.wi().execSQL("SafeDeviceInfo", "delete from SafeDeviceInfo");
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    e71.k.wi().insertNotify(new e71.h((r45.nd4) it.next()), false);
                }
                e71.k.wi().doNotify();
            }
        }
        this.f249874d.onSceneEnd(i18, i19, str, this);
    }
}
