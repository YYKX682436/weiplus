package db2;

/* loaded from: classes.dex */
public final class s2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228149t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(int i17, java.lang.String username) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(username, "username");
        this.f228149t = "Finder.CgiFinderPoiSearch";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.fq2 fq2Var = new r45.fq2();
        fq2Var.set(3, java.lang.Integer.valueOf(i17));
        fq2Var.set(2, username);
        lVar.f70664a = fq2Var;
        r45.gq2 gq2Var = new r45.gq2();
        gq2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) gq2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = gq2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetpostprevdata";
        lVar.f70667d = 4139;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderPoiSearch", "[init] dataType:" + i17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.gq2 resp = (r45.gq2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228149t, "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
