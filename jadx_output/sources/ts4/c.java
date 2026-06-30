package ts4;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f421719d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f421720e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f421721f;

    /* renamed from: g, reason: collision with root package name */
    public int f421722g = 0;

    public c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.l65();
        lVar.f70665b = new r45.m65();
        lVar.f70666c = "/cgi-bin/mmpay-bin/payibgjsgettransaction";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.i9.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f421720e = a17;
        r45.l65 l65Var = (r45.l65) a17.f70710a.f70684a;
        l65Var.f379179d = str;
        l65Var.f379182g = str4;
        l65Var.f379180e = str2;
        l65Var.f379183h = str5;
        l65Var.f379184i = str6;
        l65Var.f379181f = str3;
        l65Var.f379185m = str7;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f421719d = u0Var;
        return dispatch(sVar, this.f421720e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.i9.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIbgGetTransaction", "hy: get h5 transaction: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.m65 m65Var = (r45.m65) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i19 == 0 && i18 == 0) {
            i19 = m65Var.f380163d;
            str = m65Var.f380164e;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIbgGetTransaction", "resp.IsUseNewPage: %s", java.lang.Integer.valueOf(m65Var.f380168i));
        this.f421722g = m65Var.f380168i;
        com.tencent.mm.plugin.wallet_core.model.Orders orders = new com.tencent.mm.plugin.wallet_core.model.Orders();
        this.f421721f = orders;
        orders.f179679i = 1;
        if (m65Var.f380165f == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneIbgGetTransaction", "hy: info not valid");
        } else {
            orders.X = m65Var.f380170n;
            orders.Z = new java.util.ArrayList();
            java.util.Iterator it = m65Var.f380169m.iterator();
            while (it.hasNext()) {
                r45.t56 t56Var = (r45.t56) it.next();
                com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo showInfo = new com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo();
                showInfo.f179805d = t56Var.f386160d;
                showInfo.f179806e = t56Var.f386161e;
                showInfo.f179807f = t56Var.f386163g;
                showInfo.f179808g = t56Var.f386164h;
                r45.bx6 bx6Var = t56Var.f386162f;
                if (bx6Var != null) {
                    showInfo.f179809h = bx6Var.f371138d;
                    showInfo.f179810i = bx6Var.f371139e;
                    showInfo.f179811m = bx6Var.f371140f;
                    showInfo.f179812n = bx6Var.f371141g;
                    showInfo.f179813o = bx6Var.f371142h;
                }
                this.f421721f.Z.add(showInfo);
            }
            this.f421721f.f179678h = m65Var.f380165f.f382800g;
            com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity = new com.tencent.mm.plugin.wallet_core.model.Orders.Commodity();
            r45.p65 p65Var = m65Var.f380165f;
            commodity.f179714r = p65Var.f382803m;
            commodity.f179707h = p65Var.f382805o;
            commodity.f179709m = p65Var.f382800g / 100.0d;
            commodity.f179711o = java.lang.String.valueOf(p65Var.f382804n);
            r45.p65 p65Var2 = m65Var.f380165f;
            commodity.f179712p = p65Var2.f382806p;
            commodity.f179715s = p65Var2.f382798e;
            commodity.f179713q = p65Var2.f382797d;
            commodity.f179716t = p65Var2.f382801h;
            commodity.f179706g = p65Var2.f382802i;
            commodity.f179710n = p65Var2.f382807q / 100.0d;
            r45.b65 b65Var = m65Var.f380166g;
            if (b65Var != null) {
                java.lang.String str2 = b65Var.f370574h;
                commodity.f179717u = str2;
                com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions = new com.tencent.mm.plugin.wallet_core.model.Orders.Promotions();
                java.lang.String str3 = b65Var.f370573g;
                promotions.f179773f = str3;
                promotions.f179776i = str2;
                commodity.f179718v = str2;
                promotions.f179772e = b65Var.f370575i;
                commodity.f179722z = b65Var.f370571e;
                promotions.f179771d = 0;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    ((java.util.ArrayList) commodity.H).add(promotions);
                    commodity.I = true;
                }
                this.f421721f.A = m65Var.f380166g.f370571e;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIbgGetTransaction", "hy: no biz info");
                this.f421721f.A = 0;
            }
            java.util.LinkedList linkedList = m65Var.f380165f.f382808r;
            if (linkedList != null && linkedList.size() > 0) {
                commodity.A = new java.util.ArrayList();
                java.util.Iterator it6 = m65Var.f380165f.f382808r.iterator();
                while (it6.hasNext()) {
                    r45.e65 e65Var = (r45.e65) it6.next();
                    com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo discountInfo = new com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo();
                    discountInfo.f179741e = e65Var.f373054d;
                    ((java.util.ArrayList) commodity.A).add(discountInfo);
                }
            }
            java.util.LinkedList linkedList2 = m65Var.f380167h;
            if (linkedList2 != null && linkedList2.size() > 0) {
                java.util.Iterator it7 = linkedList2.iterator();
                while (it7.hasNext()) {
                    r45.a65 a65Var = (r45.a65) it7.next();
                    com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions2 = new com.tencent.mm.plugin.wallet_core.model.Orders.Promotions();
                    promotions2.f179771d = 1;
                    promotions2.f179775h = a65Var.f369778d;
                    promotions2.f179773f = a65Var.f369779e;
                    promotions2.f179772e = a65Var.f369780f;
                    promotions2.f179774g = a65Var.f369781g;
                    promotions2.f179778n = com.tencent.mm.sdk.platformtools.t8.P(a65Var.f369784m, 0);
                    promotions2.f179777m = a65Var.f369785n;
                    promotions2.f179779o = a65Var.f369786o;
                    promotions2.f179780p = (int) a65Var.f369787p;
                    promotions2.f179784t = a65Var.f369788q;
                    promotions2.f179781q = (int) a65Var.f369789r;
                    promotions2.f179782r = a65Var.f369790s;
                    promotions2.f179783s = a65Var.f369791t;
                    promotions2.f179785u = a65Var.f369792u;
                    promotions2.f179786v = a65Var.f369793v;
                    promotions2.f179787w = a65Var.f369794w;
                    promotions2.f179788x = a65Var.f369795x;
                    ((java.util.ArrayList) commodity.H).add(promotions2);
                }
            }
            this.f421721f.M = new java.util.ArrayList();
            ((java.util.ArrayList) this.f421721f.M).add(commodity);
            com.tencent.mm.plugin.wallet_core.model.Orders orders2 = this.f421721f;
            orders2.C = m65Var.f380165f.f382806p;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIbgGetTransaction", "formatOrders finish, mOrder.commoditys.size: %s, mOrder: %s", java.lang.Integer.valueOf(((java.util.ArrayList) orders2.M).size()), this.f421721f);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kkk);
        }
        this.f421719d.onSceneEnd(i18, i19, str, this);
    }
}
