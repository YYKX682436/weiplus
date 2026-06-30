package db2;

/* loaded from: classes.dex */
public final class j2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228024t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(java.lang.String poiId, int i17, int i18, java.lang.Long l17, java.lang.String str, boolean z17, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(poiId, "poiId");
        this.f228024t = poiId;
        r45.po2 po2Var = new r45.po2();
        po2Var.set(2, poiId);
        po2Var.set(3, java.lang.Integer.valueOf(i18));
        db2.t4 t4Var = db2.t4.f228171a;
        po2Var.set(1, t4Var.b(19576, qt2Var));
        r45.kv0 kv0Var = (r45.kv0) po2Var.getCustom(1);
        if (kv0Var != null) {
            kv0Var.set(1, java.lang.Integer.valueOf(i17));
        }
        po2Var.set(4, java.lang.Integer.valueOf(z17 ? 1 : 0));
        if (l17 != null && l17.longValue() != 0) {
            t4Var.h((r45.kv0) po2Var.getCustom(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(i17), l17, str)));
        }
        r45.qo2 qo2Var = new r45.qo2();
        qo2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) qo2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = po2Var;
        lVar.f70665b = qo2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderpoibasicinfo";
        lVar.f70667d = 19576;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderPOIBasicInfo", "init CgiPoiBasicInfo poiId:" + poiId);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.qo2 resp = (r45.qo2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiFinderPOIBasicInfo", "[onCgiBack] poiId:" + this.f228024t + " errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
