package iy4;

/* loaded from: classes4.dex */
public class z0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f296035d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f296036e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f296037f;

    public z0(java.lang.String str, java.lang.String str2, boolean z17, boolean z18, long j17, int i17) {
        this.f296037f = z17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ym0 ym0Var = new r45.ym0();
        r45.zm0 zm0Var = new r45.zm0();
        lVar.f70664a = ym0Var;
        lVar.f70665b = zm0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/extdeviceloginconfirmok";
        lVar.f70667d = 972;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        ym0Var.f391210d = str;
        ym0Var.f391211e = str2;
        ym0Var.f391213g = z17;
        ym0Var.f391216m = z18;
        ((iy4.z) i95.n0.c(iy4.z.class)).getClass();
        boolean b17 = com.tencent.wechat.aff.ext_device.m.f216700c.b(j17, i17);
        ot5.g.c("MicroMsg.ExtDeviceService", "getSyncRecordTrigger: " + b17);
        ym0Var.f391217n = b17;
        this.f296036e = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f296035d = u0Var;
        return dispatch(sVar, this.f296036e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 972;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f296035d.onSceneEnd(i18, i19, str, this);
    }
}
