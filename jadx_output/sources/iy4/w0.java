package iy4;

/* loaded from: classes5.dex */
public class w0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f296018g;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f296019d;

    /* renamed from: e, reason: collision with root package name */
    public final int f296020e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f296021f;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f296018g = hashMap;
        hashMap.put(14, 1);
        hashMap.put(15, 2);
        hashMap.put(37, 37);
        hashMap.put(38, 38);
        hashMap.put(39, 39);
    }

    public w0(int i17, int i18, java.lang.String str, int i19) {
        this.f296020e = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.pm0 pm0Var = new r45.pm0();
        r45.qm0 qm0Var = new r45.qm0();
        lVar.f70664a = pm0Var;
        lVar.f70665b = qm0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/extdevicecontrol";
        lVar.f70667d = gd1.w.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        pm0Var.f383174d = i17;
        pm0Var.f383175e = i18;
        pm0Var.f383176f = str;
        pm0Var.f383177g = i19;
        this.f296021f = lVar.a();
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = str != null ? java.lang.Integer.valueOf(str.length()) : "-1";
        objArr[3] = java.lang.Integer.valueOf(i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneExtDeviceControl", "NetSceneExtDeviceControl() called with opCode:%s device:%s uuid:%s scene:%s", objArr);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f296019d = u0Var;
        return dispatch(sVar, this.f296021f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return gd1.w.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f296019d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
