package ek2;

/* loaded from: classes.dex */
public final class w1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.v1 f253559u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f253560v;

    public w1(long j17, java.lang.String str, long j18, int i17, int i18, int i19, ek2.v1 v1Var) {
        super(null, 1, null);
        this.f253559u = v1Var;
        this.f253560v = "Finder.CgiFinderLivePause";
        r45.jo2 jo2Var = new r45.jo2();
        jo2Var.set(3, java.lang.Long.valueOf(j17));
        jo2Var.set(1, str);
        jo2Var.set(2, java.lang.Long.valueOf(j18));
        jo2Var.set(4, java.lang.Integer.valueOf(i17));
        jo2Var.set(5, java.lang.Integer.valueOf(i18));
        jo2Var.set(6, java.lang.Integer.valueOf(i19));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = jo2Var;
        r45.ko2 ko2Var = new r45.ko2();
        ko2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ko2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = ko2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderpauselive";
        lVar.f70667d = 4197;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLivePause", "CgiFinderLivePause init " + jo2Var.getLong(3) + ',' + jo2Var.getString(1) + ",pause_second:" + jo2Var.getInteger(4) + ",pause_mode:" + jo2Var.getInteger(5));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ko2 resp = (r45.ko2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253560v, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.v1 v1Var = this.f253559u;
        if (v1Var != null) {
            v1Var.a(i17, i18, str, resp);
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }
}
