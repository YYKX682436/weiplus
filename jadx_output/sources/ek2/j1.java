package ek2;

/* loaded from: classes.dex */
public final class j1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253479u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.cv1 f253480v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(long j17, long j18, java.lang.String str, java.lang.String anchorUsername, byte[] bArr, int i17, java.lang.String username, java.lang.String requestId, java.lang.String str2, com.tencent.mm.protobuf.g gVar, int i18, r45.qt2 qt2Var, java.lang.String str3, java.lang.String str4, int i19, kotlin.jvm.internal.i iVar) {
        super(null, 1, null);
        java.lang.String str5;
        byte[] bArr2 = (i19 & 16) != 0 ? null : bArr;
        java.lang.String str6 = (i19 & 256) != 0 ? null : str2;
        com.tencent.mm.protobuf.g gVar2 = (i19 & 512) != 0 ? null : gVar;
        java.lang.String str7 = (i19 & 4096) != 0 ? null : str3;
        java.lang.String str8 = (i19 & 8192) != 0 ? null : str4;
        kotlin.jvm.internal.o.g(anchorUsername, "anchorUsername");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        this.f253479u = "Finder.CgiFinderLiveGetShoppingShelf";
        r45.cv1 cv1Var = new r45.cv1();
        this.f253480v = cv1Var;
        cv1Var.set(3, java.lang.Long.valueOf(j17));
        cv1Var.set(2, java.lang.Long.valueOf(j18));
        cv1Var.set(5, anchorUsername);
        cv1Var.set(6, java.lang.Integer.valueOf(i17));
        cv1Var.set(7, username);
        cv1Var.set(4, com.tencent.mm.protobuf.g.b(bArr2));
        db2.t4 t4Var = db2.t4.f228171a;
        cv1Var.set(1, t4Var.a(4049));
        cv1Var.set(8, requestId);
        cv1Var.set(9, str6);
        cv1Var.set(17, gVar2);
        cv1Var.set(10, java.lang.Integer.valueOf(i18));
        gk2.e eVar = gk2.e.f272471n;
        cv1Var.set(15, (eVar == null || (str5 = ((mm2.c1) eVar.a(mm2.c1.class)).f328791d3) == null) ? "" : str5);
        cv1Var.set(18, 4L);
        cv1Var.set(19, 0L);
        cv1Var.set(16, str8);
        if (!(str7 == null || str7.length() == 0)) {
            cv1Var.set(11, com.tencent.mm.protobuf.g.c(str7));
        }
        t4Var.h((r45.kv0) cv1Var.getCustom(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0), java.lang.Long.valueOf(j18), str)));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = cv1Var;
        r45.dv1 dv1Var = new r45.dv1();
        dv1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) dv1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = dv1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetshopshelf";
        lVar.f70667d = 4049;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveGetShoppingShelf", "init " + cv1Var.getLong(3) + ", " + cv1Var.getInteger(6) + ", " + cv1Var.getString(5) + ",requestId:" + cv1Var.getString(8) + ",pullScene:" + cv1Var.getInteger(10) + ",ux_info:" + cv1Var.getByteString(11) + ", liveRoomBuffer: " + cv1Var.getString(16));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.dv1 resp = (r45.dv1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.String str2 = "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str3 = this.f253479u;
        com.tencent.mars.xlog.Log.i(str3, str2);
        if (i17 == 0 && i18 == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("baseResp=");
            r45.ie ieVar = (r45.ie) resp.getCustom(0);
            sb7.append(ieVar != null ? ieVar.f376960e : null);
            sb6.append(sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(", itemCount=");
            java.util.LinkedList list = resp.getList(1);
            sb8.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
            sb6.append(sb8.toString());
            sb6.append(", liveId=" + resp.getLong(6));
            sb6.append(", hasVirtual=" + resp.getBoolean(14));
            sb6.append(", continueFlag=" + resp.getInteger(47));
            sb6.append(", version=" + resp.getLong(50));
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder(", hasCouponBanner=");
            sb9.append(((bw5.jj0) resp.getCustom(39)) != null);
            sb6.append(sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder(", hasPresenter=");
            sb10.append(((bw5.q30) resp.getCustom(41)) != null);
            sb6.append(sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder(", hasVip");
            sb11.append(((r45.a56) resp.getCustom(22)) != null);
            sb6.append(sb11.toString());
            java.lang.String sb12 = sb6.toString();
            kotlin.jvm.internal.o.f(sb12, "toString(...)");
            com.tencent.mars.xlog.Log.i(str3, "shopping list result:".concat(sb12));
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            if ((k0Var != null ? (mm2.f6) k0Var.business(mm2.f6.class) : null) == null) {
                return;
            }
            resp.getString(17);
        }
    }

    @Override // az2.j
    public java.util.List s() {
        r45.cv1 cv1Var = this.f253480v;
        return kz5.c0.i(new jz5.l("pull_scene", java.lang.String.valueOf(cv1Var.getInteger(10))), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(cv1Var.getInteger(6))));
    }
}
