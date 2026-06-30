package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class wx extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.yx f120245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f120246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.io f120247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f120248g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx(com.tencent.mm.plugin.finder.live.widget.yx yxVar, int i17, com.tencent.mm.plugin.finder.live.widget.io ioVar, androidx.recyclerview.widget.RecyclerView recyclerView) {
        super(1);
        this.f120245d = yxVar;
        this.f120246e = i17;
        this.f120247f = ioVar;
        this.f120248g = recyclerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v30 */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        hn0.r rVar;
        kn0.g gVar;
        hn0.r rVar2;
        kn0.g gVar2;
        r45.nw1 nw1Var;
        r45.q82 q82Var;
        r45.nw1 nw1Var2;
        hn0.r rVar3;
        r45.nw1 nw1Var3;
        bm2.b2 definitionInfo = (bm2.b2) obj;
        kotlin.jvm.internal.o.g(definitionInfo, "definitionInfo");
        java.util.HashMap hashMap = dk2.nc.f233819c;
        com.tencent.mm.plugin.finder.live.widget.yx yxVar = this.f120245d;
        gk2.e eVar = yxVar.f120481c;
        long j17 = 0;
        hashMap.put(java.lang.Long.valueOf((eVar == null || (nw1Var3 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var3.getLong(0)), 1);
        kn0.r rVar4 = definitionInfo.f21786b;
        int i17 = rVar4.f309597b;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 1);
        jSONObject.put("sub_element", i17);
        jSONObject.put("sub_type", this.f120246e);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.P1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        dk2.ef efVar = dk2.ef.f233372a;
        co0.s u07 = efVar.u0();
        r45.gv gvVar = null;
        if (u07 == null || (rVar3 = u07.R1) == null) {
            z17 = false;
        } else {
            gk2.e eVar2 = yxVar.f120481c;
            z17 = rVar3.e(definitionInfo.f21785a, rVar4, definitionInfo.f21787c, eVar2 != null ? ((je2.z) eVar2.a(je2.z.class)).P6() : null);
        }
        yxVar.f120483e = z17;
        if (z17) {
            this.f120247f.q();
            be2.j Rj = ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Rj();
            gk2.e eVar3 = yxVar.f120481c;
            if (eVar3 != null && (nw1Var2 = ((mm2.e1) eVar3.a(mm2.e1.class)).f328988r) != null) {
                j17 = nw1Var2.getLong(0);
            }
            Rj.D0(j17, rVar4.f309597b);
            if (((java.lang.Boolean) ((jz5.n) yxVar.f120480b).getValue()).booleanValue()) {
                com.tencent.mars.xlog.Log.i("FinderLiveVideoDefinitionWidget", "modifyVideoDefinition uiStyleNew!");
            } else {
                db5.t7.f(this.f120248g.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egt), com.tencent.mm.plugin.finder.live.widget.vx.f120108a);
            }
            gk2.e eVar4 = yxVar.f120481c;
            boolean z18 = (eVar4 == null || (nw1Var = ((mm2.e1) eVar4.a(mm2.e1.class)).f328988r) == null || (q82Var = (r45.q82) nw1Var.getCustom(9)) == null || q82Var.getInteger(3) != 1) ? false : true;
            co0.s u08 = efVar.u0();
            boolean z19 = (u08 == null || (rVar2 = u08.R1) == null || (gVar2 = rVar2.f282410b) == null) ? false : gVar2.f309552s;
            co0.s u09 = efVar.u0();
            if (u09 != null && (rVar = u09.R1) != null && (gVar = rVar.f282410b) != null) {
                int i18 = rVar4.f309597b;
                java.util.LinkedList cdn_trans_info = gVar.f309548o.f378540m;
                kotlin.jvm.internal.o.f(cdn_trans_info, "cdn_trans_info");
                java.util.Iterator it = cdn_trans_info.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (((r45.gv) next).f375542m == i18) {
                        gvVar = next;
                        break;
                    }
                }
                gvVar = gvVar;
            }
            boolean isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i19 = gvVar != null ? gvVar.f375542m : 0;
            boolean z27 = rVar4.f309597b == 5;
            int i27 = gvVar != null ? gvVar.f375547r : 0;
            com.tencent.mars.xlog.Log.i("FinderLiveVideoDefinitionWidget", "isOnWifi:" + isWifi + ", is_p2p:" + i27 + ", isBanP2PResolution:" + z18 + ", isUltraHd:" + z27 + ", videoQualityLevel:" + i19);
            ?? r17 = (!isWifi || i27 == 0 || z18 || !(z19 || z27)) ? 0 : 1;
            com.tencent.mars.xlog.Log.i("FinderLiveVideoDefinitionWidget", "p2p enable=" + ((boolean) r17));
            r45.ll1 ll1Var = new r45.ll1();
            ll1Var.set(1, db2.t4.f228171a.a(8652));
            ll1Var.set(2, 1);
            java.util.LinkedList list = ll1Var.getList(3);
            r45.hx0 hx0Var = new r45.hx0();
            hx0Var.set(0, 2);
            r45.ol1 ol1Var = new r45.ol1();
            ol1Var.set(0, java.lang.Integer.valueOf((int) r17));
            ol1Var.set(1, java.lang.Integer.valueOf(c01.id.e()));
            hx0Var.set(1, com.tencent.mm.protobuf.g.b(ol1Var.toByteArray()));
            list.add(hx0Var);
            pq5.g l17 = ll1Var.d().l();
            kotlin.jvm.internal.o.f(l17, "run(...)");
            pm0.v.T(l17, com.tencent.mm.plugin.finder.live.widget.tx.f119915d);
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveVideoDefinitionWidget", "modifyVideoDefinition failed!");
        }
        return jz5.f0.f302826a;
    }
}
