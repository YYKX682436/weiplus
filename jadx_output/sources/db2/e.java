package db2;

/* loaded from: classes.dex */
public final class e extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final int f227950t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f227951u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i17, int i18, java.util.List feedIdList, com.tencent.mm.protobuf.g gVar) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(feedIdList, "feedIdList");
        this.f227950t = i18;
        this.f227951u = feedIdList;
        r45.sw0 sw0Var = new r45.sw0();
        sw0Var.set(1, gVar);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(feedIdList);
        sw0Var.set(2, linkedList);
        sw0Var.set(8, java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("CgiCheckPrefetch", "initCommReqResp: checkType=" + i17 + ", tabType=" + i18 + ", feedIds=" + kz5.n0.g0(feedIdList, ";", null, null, 0, null, db2.b.f227904d, 30, null) + ", lastBuffer=" + gVar);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        sw0Var.set(9, db2.t4.f228171a.n());
        lVar.f70664a = sw0Var;
        r45.tw0 tw0Var = new r45.tw0();
        tw0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) tw0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = tw0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findercheckprefetch";
        lVar.f70667d = 6658;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.tw0 resp = (r45.tw0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiCheckPrefetch", "onCgiEnd: errType " + i17 + ", errCode " + i18 + ", errMsg " + str + ", tabType = " + this.f227950t + ", requestFeedIds:" + kz5.n0.g0(this.f227951u, ";", null, null, 0, null, null, 62, null));
        java.util.LinkedList list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getCheck_result(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((r45.e20) obj).getLong(1) != 0) {
                arrayList.add(obj);
            }
        }
        com.tencent.mars.xlog.Log.i("CgiCheckPrefetch", "onCgiEnd: spamFeedSize = " + arrayList.size() + ", spamFeedIds = [" + kz5.n0.g0(arrayList, ";", null, null, 0, null, db2.c.f227913d, 30, null) + ']');
        pm0.v.V(100L, new db2.d(arrayList, this));
    }
}
