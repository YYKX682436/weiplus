package dk2;

/* loaded from: classes3.dex */
public final class e6 extends kotlin.jvm.internal.q implements yz5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.t f233357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.k6 f233358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f233359f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(yz5.t tVar, dk2.k6 k6Var, gk2.e eVar) {
        super(7);
        this.f233357d = tVar;
        this.f233358e = k6Var;
        this.f233359f = eVar;
    }

    @Override // yz5.u
    public java.lang.Object K(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        java.lang.String errMsg = (java.lang.String) obj4;
        kn0.g liveRoomInfo = (kn0.g) obj5;
        com.tencent.trtc.TRTCCloudDef.TRTCParams trtcParams = (com.tencent.trtc.TRTCCloudDef.TRTCParams) obj6;
        r45.hc1 resp = (r45.hc1) obj7;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        kotlin.jvm.internal.o.g(liveRoomInfo, "liveRoomInfo");
        kotlin.jvm.internal.o.g(trtcParams, "trtcParams");
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderLiveExternalHelper", "joinLive success:" + booleanValue + ", errCode:" + intValue + " cliBuff:" + resp.getString(17));
        this.f233357d.J(java.lang.Boolean.valueOf(booleanValue), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), errMsg, new android.os.Bundle(), null);
        if (booleanValue) {
            dk2.k6 k6Var = this.f233358e;
            k6Var.getClass();
            boolean w17 = zl2.r4.f473950a.w1();
            gk2.e eVar = this.f233359f;
            if (w17) {
                boolean z17 = resp.getInteger(23) != 1;
                boolean N6 = ((mm2.f6) eVar.a(mm2.f6.class)).N6();
                com.tencent.mars.xlog.Log.i("FinderLiveExternalHelper", "handleJoinLiveWxshopResponse haveBindShop:" + N6 + ", shopping_not_available:" + resp.getInteger(23) + ", canShowShopEntrance:" + z17);
                if (z17 && !N6) {
                    ((mm2.f6) eVar.a(mm2.f6.class)).U6(true);
                }
                i95.m c17 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.yb.t2((c61.yb) c17, 14, null, 2, null);
            }
            ((mm2.c1) eVar.a(mm2.c1.class)).f328803f4.f309049a.clear();
            ((mm2.c1) eVar.a(mm2.c1.class)).f328803f4.f309049a.addAll(resp.getList(18));
            ((mm2.c1) eVar.a(mm2.c1.class)).f328803f4.f309050b = resp.getString(17);
            ((mm2.c1) eVar.a(mm2.c1.class)).Q8(true);
            if (((mm2.e1) eVar.a(mm2.e1.class)).f328990t == null) {
                ((mm2.e1) eVar.a(mm2.e1.class)).o7(new kn0.i(trtcParams, liveRoomInfo, new kn0.h("com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI")));
            } else {
                kn0.i iVar = ((mm2.e1) eVar.a(mm2.e1.class)).f328990t;
                if (iVar != null) {
                    iVar.f309557a = trtcParams;
                }
                kn0.i iVar2 = ((mm2.e1) eVar.a(mm2.e1.class)).f328990t;
                if (iVar2 != null) {
                    iVar2.f309558b = liveRoomInfo;
                }
                kn0.i iVar3 = ((mm2.e1) eVar.a(mm2.e1.class)).f328990t;
                if (iVar3 != null) {
                    iVar3.f309559c = new kn0.h("com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI");
                }
            }
            k6Var.f233684b.set(0, java.lang.Integer.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getInteger(4)));
            k6Var.f233684b.set(1, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0)));
            dk2.ef efVar = dk2.ef.f233372a;
            efVar.D();
            r45.nw1 nw1Var = (r45.nw1) resp.getCustom(3);
            efVar.v(0L, nw1Var != null ? nw1Var.getLong(0) : 0L);
        }
        return jz5.f0.f302826a;
    }
}
