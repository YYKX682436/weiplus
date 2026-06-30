package o72;

/* loaded from: classes12.dex */
public class h5 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f343344d;

    /* renamed from: f, reason: collision with root package name */
    public final o72.r2 f343346f;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f343345e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f343347g = true;

    public h5(o72.r2 r2Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.NetSceneAddFav", "NetSceneAddFavItem %s", java.lang.Long.valueOf(r2Var.field_localId));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.e4();
        lVar.f70665b = new r45.f4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/addfavitem";
        lVar.f70667d = 401;
        lVar.f70668e = 193;
        lVar.f70669f = 1000000193;
        this.f343344d = lVar.a();
        this.f343346f = r2Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        java.lang.String str;
        o72.r2 r2Var = this.f343346f;
        java.lang.String f17 = o72.s2.f(r2Var.field_localId);
        com.tencent.mm.modelbase.o oVar = this.f343344d;
        r45.e4 e4Var = (r45.e4) oVar.f70710a.f70684a;
        e4Var.f372993d = c01.y1.a(r2Var.field_xml, java.lang.System.currentTimeMillis());
        e4Var.f372994e = r2Var.field_type;
        e4Var.f372995f = r2Var.field_sourceType;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(r2Var.field_transferCtx)) {
            e4Var.f372998i = r2Var.field_transferCtx;
        }
        r2Var.field_xml = o72.r2.G0(r2Var);
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().update(r2Var, dm.i4.COL_LOCALID);
        e4Var.f372997h = r2Var.field_xml;
        e4Var.f372996g = r2Var.field_sourceId;
        r2Var.w0("MicroMsg.Fav.NetSceneAddFav", o72.r2.G1);
        this.f343345e = u0Var;
        e4Var.f372999m = r2Var.field_subType;
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.NetSceneAddFav", "ADD FavItem, sourceId:%s localId:%d favId:%d transferCtx:%s ext:%s xml:%s targetID:%d type = %d subType = %d", r2Var.field_sourceId, java.lang.Long.valueOf(r2Var.field_localId), java.lang.Integer.valueOf(r2Var.field_id), r2Var.field_transferCtx, r2Var.field_ext, r2Var.field_xml, java.lang.Integer.valueOf(r2Var.field_targetID), java.lang.Integer.valueOf(r2Var.field_type), java.lang.Integer.valueOf(r2Var.field_subType));
        java.lang.String str2 = "RecordInfo update, add cgi, sendingInfo.field_xml:" + r2Var.field_xml;
        if (str2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.NetSceneAddFav", "null");
        } else if (str2.length() <= 2000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.NetSceneAddFav", str2);
        } else {
            int i17 = 0;
            int i18 = 1;
            while (i17 < str2.length()) {
                int min = java.lang.Math.min(i17 + 2000, str2.length());
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.NetSceneAddFav", "[LogLong Part " + i18 + "] " + str2.substring(i17, min));
                i18++;
                i17 = min;
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(e4Var.f372994e);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(e4Var.f372995f);
        java.lang.String str3 = e4Var.f372996g;
        java.lang.String str4 = e4Var.f372997h;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            str = "xmlLen=0";
        } else {
            str = "xmlLen=" + str4.length();
        }
        o72.s2.g("MicroMsg.Fav.NetSceneAddFav", f17, "AddFavItem Request params: type=%d, sourceType=%d, sourceId=%s, %s, subType=%d, localId=%d", valueOf, valueOf2, str3, str, java.lang.Integer.valueOf(e4Var.f372999m), java.lang.Long.valueOf(r2Var.field_localId));
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 401;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x047a  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r26, int r27, int r28, java.lang.String r29, com.tencent.mm.network.v0 r30, byte[] r31) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o72.h5.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
