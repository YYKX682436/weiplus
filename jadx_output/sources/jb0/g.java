package jb0;

@j95.b
/* loaded from: classes8.dex */
public final class g extends i95.w implements jt.x {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f298684d = "MicroMsg.OpenWayFeatureService";

    public boolean Ai(int i17) {
        switch (i17) {
            case 1:
            case 2:
            case 5:
                return true;
            case 3:
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.openway.RepairerConfigOpenWayEnhanceAppAttach()) == 1;
            case 4:
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.openway.RepairerConfigOpenWayEnhanceXFile()) == 1;
            case 6:
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.openway.RepairerConfigOpenWayEnhanceWebViewMP()) == 1;
            default:
                return false;
        }
    }

    public boolean Bi(int i17) {
        lb0.d dVar = lb0.d.f317669a;
        return dVar.g(i17, com.tencent.mm.pluginsdk.model.a.f188776e) || dVar.g(i17, com.tencent.mm.pluginsdk.model.a.f188775d);
    }

    public void Di(android.content.Context context, java.util.List msgItemList, int i17, java.lang.String str, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msgItemList, "msgItemList");
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        u15.a aVar = new u15.a();
        aVar.q(true);
        aVar.r(java.lang.Integer.valueOf(msgItemList.size()));
        aVar.s(i17);
        arrayList.add(aVar.toXml());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(msgItemList, 10));
        java.util.Iterator it = msgItemList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((u15.a) it.next()).toXml());
        }
        arrayList.addAll(arrayList2);
        android.content.Intent intent = new android.content.Intent();
        pf5.j0.a(intent, a45.i.class);
        intent.putStringArrayListExtra("IntentKey_MsgData", arrayList);
        intent.putExtra("IntentKey_Title", str);
        com.tencent.mars.xlog.Log.i(this.f298684d, "previewMsgList ".concat(kz5.n0.g0(arrayList, ", ", null, null, 0, null, null, 62, null)));
        bh5.c cVar = new bh5.c();
        cVar.f20922a.f20924a = context;
        cVar.d(intent);
        cVar.a(com.tencent.mm.ui.container.MMCommonActivity.class.getName());
        if (z17) {
            cVar.f(false);
        }
        cVar.g();
    }

    public void Ni(com.tencent.mm.pluginsdk.model.g2 g2Var) {
        if (g2Var != null) {
            java.util.HashMap b17 = kb0.j.f306209a.b(g2Var);
            b17.put("style_type", 0);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("view_share_sheet", "view_exp", b17, 35480);
        }
    }

    public void Ri(android.content.Context context, int i17, yz5.a block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(block, "block");
        lb0.q.f317688a.d(context, i17, block);
    }

    public com.tencent.mm.pluginsdk.model.m2 wi(android.app.Activity context, com.tencent.mm.pluginsdk.model.g2 g2Var) {
        kotlin.jvm.internal.o.g(context, "context");
        if (g2Var == null) {
            return null;
        }
        return new com.tencent.mm.pluginsdk.ui.otherway.v(context, g2Var);
    }
}
