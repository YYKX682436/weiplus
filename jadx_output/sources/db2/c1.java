package db2;

/* loaded from: classes.dex */
public final class c1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f227915t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(java.lang.String md52) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(md52, "md5");
        this.f227915t = "Finder.CgiFinderGetMiaoJianVideoMeta";
        r45.o81 o81Var = new r45.o81();
        o81Var.set(1, db2.t4.f228171a.a(4198));
        o81Var.set(2, o81Var.getString(2));
        o81Var.set(2, md52);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetMiaoJianVideoMeta", "CgiFinderGetMiaoJianVideoMeta md5:".concat(md52));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = o81Var;
        r45.p81 p81Var = new r45.p81();
        p81Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) p81Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = p81Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetmiaojianvideometa";
        lVar.f70667d = 4198;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.p81 resp = (r45.p81) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f227915t, "onCgiEnd errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
    }
}
