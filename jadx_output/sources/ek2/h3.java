package ek2;

/* loaded from: classes.dex */
public final class h3 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f253460o;

    public h3(r45.qt2 qt2Var, long j17) {
        super(qt2Var);
        this.f253460o = "Finder.FinderGetLiveH5UrlCGI";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.g71 g71Var = new r45.g71();
        g71Var.set(1, db2.t4.f228171a.b(21268, qt2Var));
        g71Var.set(2, java.lang.Long.valueOf(j17));
        lVar.f70664a = g71Var;
        r45.h71 h71Var = new r45.h71();
        h71Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) h71Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = h71Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetliveh5url";
        lVar.f70667d = 21268;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.FinderGetLiveH5UrlCGI", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.h71 resp = (r45.h71) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253460o, "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
