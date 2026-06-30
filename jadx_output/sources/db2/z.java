package db2;

/* loaded from: classes3.dex */
public final class z extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228255t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.e01 f228256u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.protocal.protobuf.FinderMedia cover_img, java.lang.String desc, java.lang.String ticket, java.lang.String appid, int i17, int i18, r45.o92 o92Var, java.util.LinkedList linkedList, java.lang.Integer num, java.util.LinkedList linkedList2, java.util.LinkedList linkedList3, java.lang.Integer num2, java.util.LinkedList linkedList4, java.lang.Integer num3, boolean z17, byte[] bArr, int i19, int i27) {
        super(null, null, 2, null);
        kotlin.jvm.internal.o.g(cover_img, "cover_img");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(ticket, "ticket");
        kotlin.jvm.internal.o.g(appid, "appid");
        this.f228255t = "Finder.CgiFinderCreateGameLivePrepare";
        r45.e01 e01Var = new r45.e01();
        this.f228256u = e01Var;
        e01Var.set(1, db2.t4.f228171a.a(6434));
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e01Var.set(2, xy2.c.e(context));
        e01Var.set(3, cover_img);
        e01Var.set(4, desc);
        e01Var.set(6, ticket);
        e01Var.set(7, appid);
        e01Var.set(8, java.lang.Integer.valueOf(i17));
        e01Var.set(12, java.lang.Integer.valueOf(i18));
        e01Var.set(17, linkedList);
        e01Var.set(18, java.lang.Integer.valueOf(num3 != null ? num3.intValue() : 0));
        e01Var.set(11, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
        if (!zl2.r4.f473950a.O1(true)) {
            e01Var.set(14, linkedList2);
            e01Var.set(13, linkedList3);
            e01Var.set(10, linkedList4);
            e01Var.set(9, java.lang.Integer.valueOf(num2 != null ? num2.intValue() : 0));
        }
        r45.pi2 pi2Var = new r45.pi2();
        pi2Var.set(0, o92Var);
        e01Var.set(16, pi2Var);
        e01Var.set(20, java.lang.Integer.valueOf(z17 ? 1 : 0));
        e01Var.set(19, bArr != null ? new com.tencent.mm.protobuf.g(bArr, 0, bArr.length) : null);
        e01Var.set(21, java.lang.Integer.valueOf(i19));
        e01Var.set(24, java.lang.Integer.valueOf(i27));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = e01Var;
        r45.f01 f01Var = new r45.f01();
        f01Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) f01Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = f01Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findercreategameliveprepare";
        lVar.f70667d = 6434;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderCreateGameLivePrepare", "init join_team_up_setting:" + i18 + " , anchorSwitchFlag = " + e01Var.getInteger(18) + ", anchorStatusFlag = " + e01Var.getInteger(11) + ", acknowledgeSpamMsg:" + z17 + "liveEntranceType:" + i19);
        com.tencent.mm.plugin.finder.live.util.n2.f115640a.e("Finder.CgiFinderCreateGameLivePrepare", num != null ? num.intValue() : 0);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.f01 resp = (r45.f01) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228255t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
