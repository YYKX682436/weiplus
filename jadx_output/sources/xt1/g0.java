package xt1;

/* loaded from: classes15.dex */
public class g0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456478d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456479e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.card.model.CardGiftInfo f456480f;

    public g0(int i17, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.bc3();
        lVar.f70665b = new r45.cc3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getcardgiftinfo";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.webview.d0.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456478d = a17;
        r45.bc3 bc3Var = (r45.bc3) a17.f70710a.f70684a;
        bc3Var.f370665d = i17;
        bc3Var.f370666e = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456479e = u0Var;
        return dispatch(sVar, this.f456478d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.webview.d0.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCardGiftInfo", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.cc3 cc3Var = (r45.cc3) this.f456478d.f70711b.f70700a;
            com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo = new com.tencent.mm.plugin.card.model.CardGiftInfo();
            cardGiftInfo.f94647d = cc3Var.f371452d;
            cardGiftInfo.f94648e = cc3Var.f371453e;
            cardGiftInfo.f94649f = cc3Var.f371454f;
            cardGiftInfo.f94650g = cc3Var.f371455g;
            cardGiftInfo.f94651h = cc3Var.f371456h;
            cardGiftInfo.f94652i = cc3Var.f371457i;
            cardGiftInfo.f94653m = cc3Var.f371458m;
            cardGiftInfo.f94654n = cc3Var.f371459n;
            cardGiftInfo.f94656p = cc3Var.f371461p;
            cardGiftInfo.f94655o = cc3Var.f371460o;
            cardGiftInfo.f94658q = cc3Var.f371462q;
            cardGiftInfo.f94659r = cc3Var.f371463r;
            cardGiftInfo.f94660s = cc3Var.f371464s;
            cardGiftInfo.f94661t = cc3Var.f371465t;
            cardGiftInfo.f94662u = cc3Var.f371466u;
            cardGiftInfo.f94663v = cc3Var.f371471z;
            cardGiftInfo.f94664w = cc3Var.f371467v;
            cardGiftInfo.f94665x = cc3Var.f371468w;
            cardGiftInfo.f94667y = cc3Var.f371469x;
            cardGiftInfo.f94668z = cc3Var.f371470y;
            cardGiftInfo.A = cc3Var.A;
            cardGiftInfo.B = cc3Var.B;
            cardGiftInfo.C = cc3Var.C;
            cardGiftInfo.D = cc3Var.D;
            cardGiftInfo.E = cc3Var.E;
            cardGiftInfo.F = cc3Var.F;
            cardGiftInfo.G = cc3Var.G;
            cardGiftInfo.H = cc3Var.H;
            cardGiftInfo.I = cc3Var.I;
            cardGiftInfo.f94646J = cc3Var.f371451J;
            cardGiftInfo.K = cc3Var.K;
            cardGiftInfo.L = cc3Var.L;
            cardGiftInfo.R = cc3Var.N;
            cardGiftInfo.S = cc3Var.P;
            cardGiftInfo.T = cc3Var.Q;
            cardGiftInfo.U = cc3Var.R;
            cardGiftInfo.V = cc3Var.S;
            cardGiftInfo.W = cc3Var.T;
            cardGiftInfo.X = cc3Var.U;
            cardGiftInfo.Y = cc3Var.V;
            cardGiftInfo.f94657p0 = cc3Var.X;
            cardGiftInfo.Z = cc3Var.W;
            cardGiftInfo.f94666x0 = cc3Var.Y;
            this.f456480f = cardGiftInfo;
            cardGiftInfo.toString();
        }
        this.f456479e.onSceneEnd(i18, i19, str, this);
    }
}
