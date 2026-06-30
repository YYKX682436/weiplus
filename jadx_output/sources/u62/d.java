package u62;

/* loaded from: classes12.dex */
public class d implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u62.e f424950e;

    public d(u62.e eVar, java.lang.String str) {
        this.f424950e = eVar;
        this.f424949d = str;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        u62.e eVar = this.f424950e;
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderMsg", "scene == null");
            c01.d9.e().q(522, this);
            eVar.f424954g.k(4);
            eVar.f424953f.a();
            return;
        }
        if (m1Var.getType() != 522) {
            eVar.f424954g.k(0);
        } else {
            java.lang.String str2 = this.f424949d;
            if (i17 == 0 && i18 == 0) {
                eVar.f424954g.f99891o.addRow(new java.lang.Object[]{str2, 1});
                eVar.f424954g.k(0);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderMsg", "rtSENDMSG onSceneEnd err, errType = " + i17 + ", errCode = " + i18);
                eVar.f424954g.f99891o.addRow(new java.lang.Object[]{str2, 2});
                eVar.f424954g.k(4);
            }
        }
        eVar.f424953f.a();
        c01.d9.e().q(522, this);
    }
}
