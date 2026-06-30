package xt1;

/* loaded from: classes15.dex */
public class y extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456605d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456606e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.card.model.CardGiftInfo f456607f;

    public y(int i17, java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.x0();
        lVar.f70665b = new r45.y0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/acceptgiftcard";
        lVar.f70667d = 1136;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456605d = a17;
        r45.x0 x0Var = (r45.x0) a17.f70710a.f70684a;
        x0Var.f389613d = i17;
        x0Var.f389614e = str;
        x0Var.f389615f = str2;
        x0Var.f389616g = bool.booleanValue();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456606e = u0Var;
        return dispatch(sVar, this.f456605d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1136;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAcceptGiftCard", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.y0 y0Var = (r45.y0) this.f456605d.f70711b.f70700a;
            com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo = new com.tencent.mm.plugin.card.model.CardGiftInfo();
            cardGiftInfo.f94647d = y0Var.f390644d;
            cardGiftInfo.f94648e = y0Var.f390645e;
            cardGiftInfo.f94649f = y0Var.f390646f;
            cardGiftInfo.f94650g = y0Var.f390647g;
            cardGiftInfo.f94651h = y0Var.f390648h;
            cardGiftInfo.f94652i = y0Var.f390649i;
            cardGiftInfo.f94653m = y0Var.f390650m;
            cardGiftInfo.f94654n = y0Var.f390651n;
            cardGiftInfo.f94656p = y0Var.f390653p;
            cardGiftInfo.f94655o = y0Var.f390652o;
            cardGiftInfo.f94658q = y0Var.f390655q;
            cardGiftInfo.f94659r = y0Var.f390656r;
            cardGiftInfo.f94660s = y0Var.f390657s;
            cardGiftInfo.f94661t = y0Var.f390658t;
            cardGiftInfo.f94662u = y0Var.f390659u;
            cardGiftInfo.f94663v = y0Var.f390665z;
            cardGiftInfo.f94664w = y0Var.f390660v;
            cardGiftInfo.f94665x = y0Var.f390661w;
            cardGiftInfo.f94667y = y0Var.f390662x;
            cardGiftInfo.f94668z = y0Var.f390664y;
            cardGiftInfo.A = y0Var.A;
            cardGiftInfo.B = y0Var.B;
            cardGiftInfo.C = y0Var.C;
            cardGiftInfo.D = y0Var.D;
            cardGiftInfo.E = y0Var.E;
            cardGiftInfo.F = y0Var.F;
            cardGiftInfo.G = y0Var.G;
            cardGiftInfo.H = y0Var.H;
            cardGiftInfo.I = y0Var.I;
            cardGiftInfo.f94646J = y0Var.f390643J;
            cardGiftInfo.K = y0Var.K;
            cardGiftInfo.L = y0Var.L;
            java.util.Iterator it = y0Var.M.iterator();
            while (it.hasNext()) {
                r45.z0 z0Var = (r45.z0) it.next();
                java.util.LinkedList linkedList = cardGiftInfo.M;
                com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem acceptedCardItem = new com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem();
                acceptedCardItem.f94670e = z0Var.f391562e;
                acceptedCardItem.f94669d = z0Var.f391561d;
                linkedList.add(acceptedCardItem);
            }
            java.util.Iterator it6 = y0Var.N.iterator();
            while (it6.hasNext()) {
                r45.a1 a1Var = (r45.a1) it6.next();
                java.util.LinkedList linkedList2 = cardGiftInfo.N;
                com.tencent.mm.plugin.card.model.CardGiftInfo.AccepterItem accepterItem = new com.tencent.mm.plugin.card.model.CardGiftInfo.AccepterItem();
                accepterItem.f94672e = a1Var.f369617e;
                accepterItem.f94671d = a1Var.f369616d;
                accepterItem.f94674g = a1Var.f369619g;
                accepterItem.f94673f = a1Var.f369618f;
                linkedList2.add(accepterItem);
            }
            cardGiftInfo.P = y0Var.P;
            cardGiftInfo.Q = y0Var.Q;
            cardGiftInfo.R = y0Var.R;
            cardGiftInfo.S = y0Var.S;
            cardGiftInfo.T = y0Var.T;
            cardGiftInfo.U = y0Var.U;
            cardGiftInfo.V = y0Var.V;
            cardGiftInfo.W = y0Var.W;
            cardGiftInfo.X = y0Var.X;
            cardGiftInfo.Y = y0Var.Y;
            cardGiftInfo.f94657p0 = y0Var.f390654p0;
            cardGiftInfo.Z = y0Var.Z;
            cardGiftInfo.f94666x0 = y0Var.f390663x0;
            this.f456607f = cardGiftInfo;
            cardGiftInfo.toString();
        }
        this.f456606e.onSceneEnd(i18, i19, str, this);
    }
}
