package ss4;

/* loaded from: classes2.dex */
public class k extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f412071d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f412072e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f412073f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f412074g = false;

    public k() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.zk3();
        lVar.f70665b = new r45.al3();
        lVar.f70666c = "/cgi-bin/mmpay-bin/getpayuserduty";
        lVar.f70667d = 2541;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f412071d = a17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f412072e = u0Var;
        rp3.c.a().getClass();
        return dispatch(sVar, this.f412071d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2541;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            this.f412072e.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.al3 al3Var = (r45.al3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        java.lang.String str2 = al3Var.f370090f;
        this.f412073f = str2;
        java.lang.String str3 = al3Var.f370092h;
        boolean z17 = al3Var.f370091g;
        this.f412074g = z17;
        com.tencent.mars.xlog.Log.i("MircoMsg.NetSceneGetPayUserDuty", "duty_info %s ,duty_info_darkmode %s need_agree_duty %s", str2, str3, java.lang.Boolean.valueOf(z17));
        this.f412072e.onSceneEnd(i18, i19, str, this);
    }
}
