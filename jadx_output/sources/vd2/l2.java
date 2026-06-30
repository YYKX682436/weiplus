package vd2;

/* loaded from: classes9.dex */
public final class l2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public static final vd2.l2 f435796d = new vd2.l2();

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        vd2.n2 n2Var = vd2.n2.f435817a;
        ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) vd2.n2.f435821e).getValue()).d();
        vd2.n2.f435818b = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doReport] newTipsIdList.size = ");
        java.util.List list = vd2.n2.f435819c;
        sb6.append(list.size());
        sb6.append(" ,replaceableTipsIdList.size = ");
        java.util.List list2 = vd2.n2.f435820d;
        sb6.append(list2.size());
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("FinderLiveNotifyReplaceManager", sb6.toString());
        if (list2.size() > 0) {
            zy2.qa qaVar = (zy2.qa) i95.n0.c(zy2.qa.class);
            java.util.List S0 = kz5.n0.S0(list);
            java.util.List S02 = kz5.n0.S0(list2);
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) qaVar;
            o3Var.getClass();
            com.tencent.mm.autogen.mmdata.rpt.LiveNotifyReplaceStruct liveNotifyReplaceStruct = new com.tencent.mm.autogen.mmdata.rpt.LiveNotifyReplaceStruct();
            liveNotifyReplaceStruct.f58612d = S0.size();
            liveNotifyReplaceStruct.f58613e = S02.size();
            liveNotifyReplaceStruct.f58614f = liveNotifyReplaceStruct.b("NewTipsIDs", o3Var.lk(S0, "|"), true);
            liveNotifyReplaceStruct.f58615g = liveNotifyReplaceStruct.b("DeleteTipsIDs", o3Var.lk(S02, "|"), true);
            liveNotifyReplaceStruct.k();
            o3Var.Zk(liveNotifyReplaceStruct);
        }
        list.clear();
        list2.clear();
        return true;
    }
}
