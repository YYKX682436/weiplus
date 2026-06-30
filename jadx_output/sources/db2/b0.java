package db2;

/* loaded from: classes.dex */
public final class b0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f227905t;

    public b0(long j17) {
        super(null, null, 3, null);
        this.f227905t = "Finder.CgiFinderDelCollectionWatching";
        r45.v01 v01Var = new r45.v01();
        v01Var.set(1, db2.t4.f228171a.b(22894, this.f16135n));
        v01Var.set(2, java.lang.Long.valueOf(j17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = v01Var;
        r45.w01 w01Var = new r45.w01();
        w01Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) w01Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = w01Var;
        lVar.f70666c = " /cgi-bin/micromsg-bin/finderdelcollectionwatching";
        lVar.f70667d = 22894;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.w01 resp = (r45.w01) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f227905t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
