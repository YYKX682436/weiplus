package db2;

/* loaded from: classes.dex */
public final class p0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228109t;

    public p0(int i17, com.tencent.mm.protobuf.g gVar) {
        super(null, null, 3, null);
        this.f228109t = "Finder.CgiFinderGetCollectionWatchingList";
        r45.e51 e51Var = new r45.e51();
        e51Var.set(1, db2.t4.f228171a.b(12120, this.f16135n));
        e51Var.set(2, java.lang.Integer.valueOf(i17));
        e51Var.set(3, gVar);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = e51Var;
        r45.f51 f51Var = new r45.f51();
        f51Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) f51Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = f51Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetcollectionwatchinglist";
        lVar.f70667d = 12120;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.f51 resp = (r45.f51) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(" size ");
        java.util.LinkedList list = resp.getList(1);
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i(this.f228109t, sb6.toString());
    }
}
