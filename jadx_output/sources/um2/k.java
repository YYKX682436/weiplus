package um2;

/* loaded from: classes3.dex */
public final class k implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428850a;

    public k(um2.x5 x5Var) {
        this.f428850a = x5Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        fm2.c cVar;
        co0.s E;
        dk2.xg xgVar;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        r45.hc1 hc1Var = (r45.hc1) fVar.f70618d;
        r45.nw1 nw1Var = (r45.nw1) hc1Var.getCustom(3);
        r45.ma4 ma4Var = (r45.ma4) hc1Var.getCustom(2);
        java.lang.String str = this.f428850a.f429032f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("JoinLiveCallback2 errType:");
        sb6.append(fVar.f70615a);
        sb6.append(" errCode:");
        sb6.append(fVar.f70616b);
        sb6.append(" errMsg:");
        sb6.append(fVar.f70617c);
        sb6.append(",respLiveInfo:");
        sb6.append(nw1Var != null ? nw1Var.hashCode() : 0);
        sb6.append(',');
        sb6.append(cm2.a.f43328a.y(nw1Var));
        sb6.append(",respLiveSdkInfo is null:");
        sb6.append(ma4Var == null);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && nw1Var != null && ma4Var != null) {
            um2.x5 x5Var = this.f428850a;
            ((mm2.e1) x5Var.c(mm2.e1.class)).h7(ma4Var, nw1Var, hc1Var.getByteString(1));
            mm2.c1 c1Var = (mm2.c1) x5Var.c(mm2.c1.class);
            r45.nw1 nw1Var2 = (r45.nw1) hc1Var.getCustom(3);
            c1Var.q8(nw1Var2 != null ? nw1Var2.getLong(32) : 0L);
            ((mm2.c1) x5Var.c(mm2.c1.class)).Q1 = hc1Var.getInteger(47);
            ((mm2.c1) x5Var.c(mm2.c1.class)).R1 = hc1Var.getLong(42);
            ((je2.a0) x5Var.c(je2.a0.class)).N6(nw1Var, "updateLiveData");
            um2.m mVar = um2.m.f428873a;
            um2.x5 x5Var2 = this.f428850a;
            mVar.e(x5Var2.f19609a, x5Var2.f429032f, x5Var2.f19605b, nw1Var, ma4Var);
            um2.x5 x5Var3 = this.f428850a;
            boolean a86 = ((mm2.c1) x5Var3.c(mm2.c1.class)).a8();
            java.lang.String str2 = x5Var3.f429032f;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("JoinLiveCallback2 isDestroyed:");
            fm2.c cVar2 = x5Var3.f19606c;
            sb7.append(cVar2 != null ? java.lang.Boolean.valueOf(cVar2.isDestroyed()) : null);
            sb7.append(",isLiveStart:");
            sb7.append(a86);
            sb7.append(",liveRoomModel:");
            sb7.append(((mm2.e1) x5Var3.c(mm2.e1.class)).f328990t);
            sb7.append(", liveExtFlag:");
            sb7.append(((mm2.c1) x5Var3.c(mm2.c1.class)).Q1);
            com.tencent.mars.xlog.Log.i(str2, sb7.toString());
            com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = x5Var3.f429038h;
            if (ob0Var != null) {
                ob0Var.H1(true);
            }
            co0.s E2 = x5Var3.E();
            if (E2 != null) {
                E2.x0(x5Var3);
            }
            com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var2 = x5Var3.f429038h;
            if (ob0Var2 != null) {
                ob0Var2.K0(0);
            }
            com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var3 = x5Var3.f429038h;
            if (ob0Var3 != null) {
                zl2.r4 r4Var = zl2.r4.f473950a;
                com.tencent.rtmp.TXLivePlayConfig d07 = r4Var.d0(x5Var3.f429032f);
                gk2.e eVar = x5Var3.f19609a;
                fm2.c cVar3 = x5Var3.f19606c;
                com.tencent.mm.plugin.finder.live.plugin.ob0.G1(ob0Var3, 0, d07, r4Var.R0(eVar, cVar3 != null ? cVar3.isLandscape() : false, false), false, false, null, null, 105, null);
            }
            if (a86) {
                mVar.b(x5Var3);
            } else {
                x5Var3.W(false);
            }
            dk2.ef efVar = dk2.ef.f233372a;
            long j17 = ((mm2.e1) x5Var3.c(mm2.e1.class)).f328988r.getLong(0);
            dk2.xg xgVar2 = dk2.ef.f233391j0;
            boolean z17 = xgVar2 != null && xgVar2.f234358b;
            if (!z17 && (xgVar = dk2.ef.f233391j0) != null) {
                xgVar.a();
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "resetHeartBeat liveId:" + j17 + " delay:0 heartBeatFinish:" + z17 + '!');
            efVar.v(0L, j17);
            fm2.c cVar4 = x5Var3.f19606c;
            if (cVar4 != null) {
                zl2.r4.f473950a.l3(x5Var3.f19609a, cVar4, false);
            }
            kn0.i iVar = ((mm2.e1) x5Var3.c(mm2.e1.class)).f328990t;
            if (iVar != null && (E = x5Var3.E()) != null) {
                hn0.h.f(E, iVar, false, false, 4, null);
            }
            x5Var3.t();
            x5Var3.w((r45.wz1) hc1Var.getCustom(4));
            zl2.r4 r4Var2 = zl2.r4.f473950a;
            if (!r4Var2.V1(x5Var3.f19609a) && !r4Var2.j2(x5Var3.f19609a) && (cVar = x5Var3.f19606c) != null) {
                r4Var2.E2(x5Var3.f19609a, cVar);
            }
            fm2.c cVar5 = x5Var3.f19606c;
            if (cVar5 != null) {
                r45.nw1 nw1Var3 = (r45.nw1) hc1Var.getCustom(3);
                cVar5.processFinderLiveLayerShowInfo(nw1Var3 != null ? (r45.jy1) nw1Var3.getCustom(25) : null);
            }
            fm2.c cVar6 = this.f428850a.f19606c;
            if (cVar6 != null) {
                com.tencent.mm.plugin.finder.live.view.k0.hideLoadingLayer$default(cVar6, false, 1, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
