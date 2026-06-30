package xw1;

/* loaded from: classes9.dex */
public class d extends xw1.c {

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f457663m;

    /* renamed from: n, reason: collision with root package name */
    public r45.jw f457664n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f457665o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f457666p;

    public d(boolean z17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.iw();
        lVar.f70665b = new r45.jw();
        lVar.f70667d = 1323;
        lVar.f70666c = "/cgi-bin/mmpay-bin/getrewardqrcode";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f457663m = a17;
        ((r45.iw) a17.f70710a.f70684a).f377353d = z17;
        this.f457666p = z17;
    }

    @Override // xw1.c
    public void I(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQrRewardGetCode", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.jw jwVar = (r45.jw) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f457664n = jwVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQrRewardGetCode", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(jwVar.f378142d), this.f457664n.f378143e);
        boolean z17 = this.f457661h;
        if (!z17 && this.f457664n.f378142d != 0) {
            this.f457662i = true;
        }
        if (!z17 && !this.f457662i) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_PHOTO_WIDTH_INT_SYNC, java.lang.Integer.valueOf(this.f457664n.f378155t));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_ICON_WIDTH_INT_SYNC, java.lang.Integer.valueOf(this.f457664n.f378148m));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_DESC_STRING_SYNC, this.f457664n.f378149n);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_WORD_STRING_SYNC, this.f457664n.f378147i);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_MAX_AMT_INT_SYNC, java.lang.Integer.valueOf(this.f457664n.f378154s));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_BOTTOM_STR_STRING_SYNC, this.f457664n.f378153r);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_BOTTOM_URL_STRING_SYNC, this.f457664n.f378152q);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_LAST_PHOTO_URL_STRING_SYNC, this.f457664n.f378145g);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f457664n.f378158w)) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_LAST_PHOTO_URL_V2_STRING_SYNC, this.f457664n.f378158w);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = this.f457664n.f378151p.iterator();
            while (it.hasNext()) {
                arrayList.add("" + ((java.lang.Integer) it.next()).intValue());
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_AMT_LIST_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(724L, 2L, 1L, false);
        } else if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(724L, 4L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(724L, 3L, 1L, false);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f457665o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f457665o = u0Var;
        return dispatch(sVar, this.f457663m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1323;
    }
}
