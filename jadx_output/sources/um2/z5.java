package um2;

/* loaded from: classes3.dex */
public final class z5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.b6 f429114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f429115e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(um2.b6 b6Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        super(0);
        this.f429114d = b6Var;
        this.f429115e = finderObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v13 */
    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.c cVar;
        ?? r57;
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        r45.nw1 liveInfo;
        com.tencent.mm.live.api.LiveConfig liveConfig;
        um2.b6 b6Var = this.f429114d;
        long j17 = ((mm2.e1) b6Var.c(mm2.e1.class)).f328983m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("localId:");
        sb6.append(j17);
        sb6.append(" fetchId:");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f429115e;
        sb6.append(finderObject.getId());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = b6Var.f428731f;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (j17 != 0 && finderObject.getId() == j17 && (cVar = b6Var.f19606c) != null) {
            ((mm2.c1) b6Var.c(mm2.c1.class)).a9(finderObject);
            mm2.e1 e1Var = (mm2.e1) b6Var.c(mm2.e1.class);
            java.lang.String sessionBuffer = finderObject.getSessionBuffer();
            if (sessionBuffer == null) {
                sessionBuffer = "";
            }
            e1Var.f328993w = sessionBuffer;
            r45.nw1 liveInfo2 = finderObject.getLiveInfo();
            if (liveInfo2 != null) {
                ((mm2.e1) b6Var.c(mm2.e1.class)).m7(liveInfo2);
                r45.rp1 rp1Var = (r45.rp1) liveInfo2.getCustom(45);
                if (rp1Var != null) {
                    com.tencent.mm.plugin.finder.assist.u3.f102591a.a((mm2.c1) b6Var.c(mm2.c1.class), "handleOnGetFeedObject", rp1Var);
                }
                r45.ma4 ma4Var = (r45.ma4) liveInfo2.getCustom(23);
                if (ma4Var != null) {
                    ((mm2.e1) b6Var.c(mm2.e1.class)).f328987q = ma4Var;
                }
                km2.m mVar = b6Var.f19607d;
                com.tencent.mm.live.api.LiveConfig liveConfig2 = mVar != null ? mVar.f309129d : null;
                if (liveConfig2 != null) {
                    liveConfig2.f68537e = liveInfo2.getLong(0);
                }
                km2.m mVar2 = b6Var.f19607d;
                if ((mVar2 == null || (liveConfig = mVar2.f309129d) == null || !liveConfig.H) ? false : true) {
                    mm2.c1 c1Var = (mm2.c1) b6Var.c(mm2.c1.class);
                    km2.m mVar3 = b6Var.f19607d;
                    c1Var.f328827j5 = mVar3 != null ? mVar3.f309133h : null;
                }
                km2.m mVar4 = b6Var.f19607d;
                com.tencent.mm.live.api.LiveConfig liveConfig3 = mVar4 != null ? mVar4.f309129d : null;
                if (liveConfig3 != null) {
                    liveConfig3.H = false;
                }
                com.tencent.mars.xlog.Log.i(str, "reset staticConfig forceFetchObject!");
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = ((mm2.c1) b6Var.c(mm2.c1.class)).f328846n;
            if ((finderObject2 == null || (liveInfo = finderObject2.getLiveInfo()) == null || liveInfo.getInteger(17) != 1) ? false : true) {
                com.tencent.mm.plugin.finder.live.view.k0.fillBlurBg$default(cVar, ((mm2.c1) b6Var.c(mm2.c1.class)).f328852o, false, 2, null);
            }
            fm2.c cVar2 = b6Var.f19606c;
            if (cVar2 == null || (data = cVar2.getData()) == null || (liveRoomControllerStore = data.f309131f) == null) {
                r57 = 0;
            } else {
                r57 = 0;
                dk2.ef.h(dk2.ef.f233372a, b6Var.f19609a, liveRoomControllerStore, cVar, 0, b6Var.f19608e, 8, null);
            }
            com.tencent.mm.plugin.finder.assist.y8.e(com.tencent.mm.plugin.finder.assist.y8.f102732a, "RV_VISITOR_" + ((mm2.e1) b6Var.c(mm2.e1.class)).f328988r.getLong(r57), com.tencent.mm.plugin.finder.assist.t8.f102571q.f102540b, null, false, false, false, 60, null);
            cVar.showProgress();
            cVar.showBlurBg();
            fm2.c cVar3 = b6Var.f19606c;
            if (cVar3 != 0) {
                cVar3.prepareToStart(r57);
            }
        }
        return jz5.f0.f302826a;
    }
}
