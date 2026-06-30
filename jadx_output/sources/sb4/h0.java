package sb4;

/* loaded from: classes4.dex */
public class h0 extends android.widget.BaseAdapter implements com.tencent.mm.plugin.sns.ui.x4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.bs f405513d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f405514e = new java.util.ArrayList();

    public h0(com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI snsWsFoldDetailUI, android.widget.ListView listView, com.tencent.mm.plugin.sns.ui.listener.i iVar, com.tencent.mm.plugin.sns.ui.l1 l1Var, int i17, java.lang.String str, com.tencent.mm.vending.base.m mVar) {
        this.f405513d = new com.tencent.mm.plugin.sns.ui.bs(snsWsFoldDetailUI, listView, iVar, l1Var, i17, this);
    }

    @Override // com.tencent.mm.plugin.sns.ui.x4
    public com.tencent.mm.plugin.sns.ui.ns V1(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genStruct", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        com.tencent.mm.plugin.sns.ui.ns nsVar = (com.tencent.mm.plugin.sns.ui.ns) ((java.util.ArrayList) this.f405514e).get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genStruct", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return nsVar;
    }

    public com.tencent.mm.plugin.sns.ui.bs a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBaseAdapter", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseAdapter", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return this.f405513d;
    }

    public final android.util.Pair c(hm5.c cVar) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaCmtCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        int i18 = 0;
        if (cVar != null) {
            int i19 = 0;
            i17 = 0;
            while (i18 < cVar.b()) {
                nm5.j jVar = (nm5.j) cVar.a(i18);
                if (jVar != null && jVar.a(7) != null) {
                    int intValue = ((java.lang.Integer) jVar.a(7)).intValue();
                    if (intValue == 2) {
                        i17++;
                    } else if (intValue == 1) {
                        i19++;
                    }
                }
                i18++;
            }
            i18 = i19;
        } else {
            i17 = 0;
        }
        android.util.Pair pair = new android.util.Pair(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaCmtCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return pair;
    }

    public void d(com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI snsWsFoldDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        if (snsWsFoldDetailUI != null && !snsWsFoldDetailUI.f167642y) {
            com.tencent.mm.plugin.sns.model.l4.Uj().post(new sb4.g0(this, snsWsFoldDetailUI));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
    }

    @Override // com.tencent.mm.plugin.sns.ui.x4
    public com.tencent.mm.vending.base.Vending g2() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVending", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVending", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return null;
    }

    @Override // android.widget.Adapter, com.tencent.mm.plugin.sns.ui.x4
    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        int size = ((java.util.ArrayList) this.f405514e).size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return size;
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        com.tencent.mm.plugin.sns.storage.SnsInfo item = getItem(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return item;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.ns nsVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        java.util.List list = this.f405514e;
        if (i17 >= 0 && i17 < ((java.util.ArrayList) list).size()) {
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.X(((com.tencent.mm.plugin.sns.ui.ns) ((java.util.ArrayList) list).get(i17)).f170038j);
        }
        com.tencent.mm.plugin.sns.ui.bs bsVar = this.f405513d;
        bsVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        od4.b bVar = od4.b.f344648a;
        int i18 = 1;
        int i19 = view != null ? 1 : 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initReport", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        java.util.HashMap hashMap = od4.b.f344649b;
        if (hashMap.get(java.lang.Integer.valueOf(i17)) != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsMethodReport", "already initReport position:" + i17 + "? ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initReport", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        } else {
            hashMap.put(java.lang.Integer.valueOf(i17), new com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct());
            com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct snsMethodReportStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct) hashMap.get(java.lang.Integer.valueOf(i17));
            if (snsMethodReportStruct != null) {
                snsMethodReportStruct.f60615h = i19;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initReport", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo item = bsVar.f168035a.getItem(i17);
        android.view.View a17 = bsVar.a(item, i17, bsVar.f168036b.k() == 1 ? com.tencent.mm.plugin.sns.ui.bs.k(item, false) : com.tencent.mm.plugin.sns.ui.bs.j(item), view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindViewParams", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        if (a17 != null && i17 >= 0) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (i17 < arrayList.size() && (nsVar = (com.tencent.mm.plugin.sns.ui.ns) arrayList.get(i17)) != null) {
                try {
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = nsVar.f170025a;
                    if (snsInfo != null) {
                        hashMap2.put("sns_feed_id", ca4.z0.t0(snsInfo.field_snsId));
                        hashMap2.put("sns_feed_username", snsInfo.getUserName());
                        hashMap2.put("sns_feed_share_name", snsInfo.getUserName());
                        hashMap2.put("sns_feed_type", java.lang.Integer.valueOf(snsInfo.field_type));
                        hashMap2.put("sns_is_live", java.lang.Integer.valueOf((snsInfo.field_type == 54 && pc4.e.f353426a.a()) ? 1 : 0));
                    }
                    boolean z17 = nsVar.f170044p;
                    hashMap2.put("sns_nick_name", nsVar.f170052x);
                    hashMap2.put("sns_feed_is_ad", java.lang.Integer.valueOf(z17 ? 1 : 0));
                    hashMap2.put("sns_feed_position", java.lang.Integer.valueOf(i17));
                    hashMap2.put("sns_is_ws", 1);
                    hashMap2.put("sns_is_ws_block", 0);
                    if (nsVar.f170027b.ContentObj.F != null) {
                        i18 = 4;
                    } else {
                        int i27 = nsVar.f170035g;
                        if (i27 != 18 && i27 != 20) {
                            i18 = 0;
                        }
                    }
                    hashMap2.put("sns_feed_tail_type", java.lang.Integer.valueOf(i18));
                    hm5.c cVar = nsVar.U;
                    int b17 = cVar != null ? cVar.b() : 0;
                    hm5.c cVar2 = nsVar.V;
                    int b18 = cVar2 != null ? cVar2.b() : 0;
                    hashMap2.put("sns_feed_like_count", java.lang.Integer.valueOf(b17));
                    hashMap2.put("sns_feed_comment_count", java.lang.Integer.valueOf(b18));
                    android.util.Pair c17 = c(nsVar.V);
                    hashMap2.put("sns_emo_cmt_cnt", c17.first);
                    hashMap2.put("sns_img_cmt_cnt", c17.second);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(a17, hashMap2);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindViewParams", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return a17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.x4
    public void w3(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        this.f405513d.m();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
    }

    @Override // android.widget.Adapter, com.tencent.mm.plugin.sns.ui.x4
    public com.tencent.mm.plugin.sns.storage.SnsInfo getItem(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = ((com.tencent.mm.plugin.sns.ui.ns) ((java.util.ArrayList) this.f405514e).get(i17)).f170025a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return snsInfo;
    }
}
