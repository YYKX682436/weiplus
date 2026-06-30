package sr2;

/* loaded from: classes8.dex */
public final class t implements mv2.w0 {

    /* renamed from: d, reason: collision with root package name */
    public static final sr2.t f411718d = new sr2.t();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f411719e = new java.util.LinkedHashMap();

    @Override // mv2.w0
    public void onPostErr(long j17, boolean z17) {
        java.util.LinkedList linkedList;
        r45.x80 x80Var;
        r45.qy3 qy3Var;
        r45.x80 x80Var2;
        r45.qy3 qy3Var2;
        r45.x80 x80Var3;
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.N).getValue()).r()).booleanValue()) {
            cu2.t tVar = cu2.u.f222441a;
            com.tencent.mm.plugin.finder.storage.FinderItem f17 = tVar.f(j17);
            if (f17 != null) {
                if (f17.getPostInfo().getBoolean(26)) {
                    com.tencent.mars.xlog.Log.i("FinderPostRemindManager", "[onPostFailed] has show red dot, localId:" + j17);
                } else {
                    com.tencent.mars.xlog.Log.i("FinderPostRemindManager", "[onPostFailed] localId:" + j17);
                    i95.m c17 = i95.n0.c(zy2.b6.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    zy2.fa nk6 = ((c61.l7) ((zy2.b6) c17)).nk();
                    nk6.N("FinderEntrance");
                    nk6.N("FinderMentionEntrance");
                    i95.m c18 = i95.n0.c(zy2.b6.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    zy2.fa nk7 = ((c61.l7) ((zy2.b6) c18)).nk();
                    r45.vs2 vs2Var = new r45.vs2();
                    vs2Var.f388486d = 10031000;
                    vs2Var.f388505z = 1;
                    vs2Var.f388487e = 1051;
                    vs2Var.f388496q = g92.b.f269769e.T0();
                    vs2Var.f388491i = 86400;
                    long nanoTime = java.lang.System.nanoTime();
                    vs2Var.f388490h = "tipsid_local_post_fail_" + nanoTime;
                    vs2Var.f388503x = "tipsuuid_local_post_fail_" + nanoTime;
                    java.util.LinkedList linkedList2 = vs2Var.f388489g;
                    if (linkedList2 == null) {
                        linkedList2 = new java.util.LinkedList();
                    }
                    vs2Var.f388489g = linkedList2;
                    r45.f03 f03Var = new r45.f03();
                    vs2Var.f388489g.add(f03Var);
                    f03Var.f373899s = 1;
                    f03Var.f373892i = "FinderEntrance";
                    f03Var.f373891h = 1;
                    f03Var.f373887d = 999;
                    f03Var.f373900t = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.O).getValue()).r()).intValue();
                    f03Var.f373901u = 2;
                    r45.ya0 ya0Var = new r45.ya0();
                    f03Var.B = ya0Var;
                    f03Var.f373894n = 1;
                    com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = new com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo();
                    finderTipsShowEntranceExtInfo.set(11, java.lang.Long.valueOf(j17));
                    f03Var.f373895o = hc2.b.a(finderTipsShowEntranceExtInfo);
                    r45.fz2 fz2Var = new r45.fz2();
                    ya0Var.f390918d = fz2Var;
                    java.util.LinkedList linkedList3 = fz2Var.f374741d;
                    if (linkedList3 == null) {
                        linkedList3 = new java.util.LinkedList();
                    }
                    fz2Var.f374741d = linkedList3;
                    r45.cp5 cp5Var = new r45.cp5();
                    cp5Var.f371768d = 3;
                    r45.ap5 ap5Var = new r45.ap5();
                    cp5Var.f371769e = ap5Var;
                    ap5Var.f370176d = new r45.x80();
                    r45.ap5 ap5Var2 = cp5Var.f371769e;
                    r45.x80 x80Var4 = ap5Var2 != null ? ap5Var2.f370176d : null;
                    if (x80Var4 != null) {
                        x80Var4.f389854e = new r45.qy3();
                    }
                    r45.ap5 ap5Var3 = cp5Var.f371769e;
                    r45.qy3 qy3Var3 = (ap5Var3 == null || (x80Var3 = ap5Var3.f370176d) == null) ? null : x80Var3.f389854e;
                    if (qy3Var3 != null) {
                        qy3Var3.f384352e = new r45.xy3();
                    }
                    r45.ap5 ap5Var4 = cp5Var.f371769e;
                    r45.xy3 xy3Var = (ap5Var4 == null || (x80Var2 = ap5Var4.f370176d) == null || (qy3Var2 = x80Var2.f389854e) == null) ? null : qy3Var2.f384352e;
                    if (xy3Var != null) {
                        xy3Var.f390593d = "http://dldir1v6.qq.com/weixin/checkresupdate/exclamation_mark_circle_0ce603e151ef47e492018465f5733fec.png";
                    }
                    r45.xy3 xy3Var2 = (ap5Var4 == null || (x80Var = ap5Var4.f370176d) == null || (qy3Var = x80Var.f389854e) == null) ? null : qy3Var.f384352e;
                    if (xy3Var2 != null) {
                        xy3Var2.f390594e = "http://dldir1v6.qq.com/weixin/checkresupdate/exclamation_mark_circle_0ce603e151ef47e492018465f5733fec.png";
                    }
                    r45.yo5 yo5Var = new r45.yo5();
                    cp5Var.f371770f = yo5Var;
                    yo5Var.f391262e = new r45.lp();
                    r45.yo5 yo5Var2 = cp5Var.f371770f;
                    r45.lp lpVar = yo5Var2 != null ? yo5Var2.f391262e : null;
                    if (lpVar != null) {
                        r45.uy3 uy3Var = new r45.uy3();
                        uy3Var.f387734d = 24;
                        uy3Var.f387735e = 24;
                        lpVar.f379691m = uy3Var;
                    }
                    r45.fz2 fz2Var2 = ya0Var.f390918d;
                    if (fz2Var2 != null && (linkedList = fz2Var2.f374741d) != null) {
                        linkedList.add(cp5Var);
                    }
                    r45.dz2 dz2Var = new r45.dz2();
                    java.util.LinkedList list = dz2Var.getList(0);
                    if (list == null) {
                        list = new java.util.LinkedList();
                    }
                    dz2Var.set(0, list);
                    r45.gz2 gz2Var = new r45.gz2();
                    gz2Var.set(0, vs2Var);
                    dz2Var.getList(0).add(gz2Var);
                    ((com.tencent.mm.plugin.finder.extension.reddot.x2) nk7).e1(dz2Var, "FinderPostRemindManager");
                    f17.getPostInfo().set(26, java.lang.Boolean.TRUE);
                    tVar.l(f17);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderPostRemindManager", "[onPostFailed] disable show red dot, localId:" + j17);
        }
        com.tencent.mars.xlog.Log.i("FinderPostRemindManager", "[onPostEnd] localId:" + j17);
    }
}
