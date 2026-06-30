package db2;

/* loaded from: classes.dex */
public final class k2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228038t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(java.lang.String poiId) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(poiId, "poiId");
        this.f228038t = poiId;
        r45.ll3 ll3Var = new r45.ll3();
        ll3Var.set(1, poiId);
        r45.ml3 ml3Var = new r45.ml3();
        ml3Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ml3Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ll3Var;
        lVar.f70665b = ml3Var;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mmbizsec/getpoiinfo";
        lVar.f70667d = 28601;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderPOIServiceInfo", "init CgiPoiServiceInfo poiId:" + poiId);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ml3 resp = (r45.ml3) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiFinderPOIServiceInfo", "[onCgiBack] poiId:" + this.f228038t + " errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
