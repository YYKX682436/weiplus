package xw1;

/* loaded from: classes9.dex */
public class i extends xw1.c {

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f457677m;

    /* renamed from: n, reason: collision with root package name */
    public r45.px f457678n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f457679o;

    public i(java.util.LinkedList linkedList, java.lang.String str, boolean z17, boolean z18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ox();
        lVar.f70665b = new r45.px();
        lVar.f70667d = 1562;
        lVar.f70666c = "/cgi-bin/mmpay-bin/setrewardqrcode";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f457677m = a17;
        r45.ox oxVar = (r45.ox) a17.f70710a.f70684a;
        oxVar.f382587d = linkedList;
        oxVar.f382588e = str;
        oxVar.f382589f = z17;
        oxVar.f382590g = z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQrRewardSetCode", "desc: %s, flag: %s, default: %s", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
    }

    @Override // xw1.c
    public void I(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQrRewardSetCode", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.px pxVar = (r45.px) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f457678n = pxVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQrRewardSetCode", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(pxVar.f383442d), this.f457678n.f383443e);
        boolean z17 = this.f457661h;
        if (!z17 && this.f457678n.f383442d != 0) {
            this.f457662i = true;
        }
        if (!z17 && !this.f457662i) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_PHOTO_WIDTH_INT_SYNC, java.lang.Integer.valueOf(this.f457678n.f383449n));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_ICON_WIDTH_INT_SYNC, java.lang.Integer.valueOf(this.f457678n.f383446h));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_DESC_STRING_SYNC, this.f457678n.f383448m);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_LAST_PHOTO_URL_STRING_SYNC, this.f457678n.f383444f);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f457678n.f383450o)) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_LAST_PHOTO_URL_V2_STRING_SYNC, this.f457678n.f383450o);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = this.f457678n.f383447i.iterator();
            while (it.hasNext()) {
                arrayList.add("" + ((java.lang.Integer) it.next()).intValue());
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_AMT_LIST_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(724L, 5L, 1L, false);
        } else if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(724L, 7L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(724L, 6L, 1L, false);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f457679o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f457679o = u0Var;
        return dispatch(sVar, this.f457677m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1562;
    }
}
