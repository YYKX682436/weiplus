package db2;

/* loaded from: classes.dex */
public final class s0 extends az2.j {
    public s0(long j17, int i17, java.lang.String str) {
        super(null, null, 3, null);
        r45.f61 f61Var = new r45.f61();
        f61Var.set(3, str);
        f61Var.set(1, java.lang.Long.valueOf(j17));
        f61Var.set(2, java.lang.Integer.valueOf(i17));
        r45.g61 g61Var = new r45.g61();
        g61Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) g61Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = f61Var;
        lVar.f70665b = g61Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetfeedhelppromotionedlist";
        lVar.f70667d = 14058;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetFeedHelpPromotionedList", "init lastBuffer:" + str);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.g61 resp = (r45.g61) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetFeedHelpPromotionedList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
