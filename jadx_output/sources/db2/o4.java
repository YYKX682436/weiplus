package db2;

/* loaded from: classes.dex */
public final class o4 extends bq.e {
    public o4(r45.qt2 qt2Var, java.lang.String str) {
        super(qt2Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.vj2 vj2Var = new r45.vj2();
        vj2Var.set(1, db2.t4.f228171a.b(19699, qt2Var));
        if (str != null) {
            java.lang.String str2 = str.length() > 0 ? str : null;
            if (str2 != null) {
                vj2Var.set(2, str2);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init nextPageBuffer=");
        sb6.append(str);
        sb6.append(" hasContextObj=");
        sb6.append(qt2Var != null);
        com.tencent.mars.xlog.Log.i("CgiNativeDramaStreamRecommend", sb6.toString());
        lVar.f70664a = vj2Var;
        r45.wj2 wj2Var = new r45.wj2();
        wj2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) wj2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = wj2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findernativedramastreamrecommend";
        lVar.f70667d = 19699;
        com.tencent.mars.xlog.Log.i("CgiNativeDramaStreamRecommend", "CgiNativeDramaStreamRecommend nextPageBuffer " + str);
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.wj2 resp = (r45.wj2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiNativeDramaStreamRecommend", "processCgiResult errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str + ", itemCount=" + resp.getList(1).size() + " nextPageBuffer " + resp.getString(2));
    }
}
