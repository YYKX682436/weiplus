package db2;

/* loaded from: classes.dex */
public final class i0 extends az2.j {
    public i0(long j17, int i17) {
        super(null, null, 3, null);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.u21 u21Var = new r45.u21();
        u21Var.set(1, db2.t4.f228171a.b(20577, this.f16135n));
        u21Var.set(2, java.lang.Long.valueOf(j17));
        u21Var.set(3, java.lang.Integer.valueOf(i17));
        lVar.f70664a = u21Var;
        r45.v21 v21Var = new r45.v21();
        v21Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) v21Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = v21Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderfavpostplay";
        lVar.f70667d = 20577;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderFavPostPlay", "CgiFinderFavPostPlay topicId=" + j17 + ", favActionId=" + i17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.v21 resp = (r45.v21) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiFinderFavPostPlay", "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + resp);
    }
}
