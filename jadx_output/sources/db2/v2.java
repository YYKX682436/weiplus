package db2;

/* loaded from: classes.dex */
public final class v2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228196t;

    public v2(int i17) {
        super(null, null, 2, null);
        this.f228196t = "Finder.CgiFinderRecommendNickname";
        r45.os2 os2Var = new r45.os2();
        os2Var.set(1, java.lang.Integer.valueOf(i17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = os2Var;
        r45.ps2 ps2Var = new r45.ps2();
        ps2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ps2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = ps2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderrecommendnickname";
        lVar.f70667d = 4076;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderRecommendNickname", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ps2 resp = (r45.ps2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228196t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
