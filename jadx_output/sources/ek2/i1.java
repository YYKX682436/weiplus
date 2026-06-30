package ek2;

/* loaded from: classes.dex */
public final class i1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final org.json.JSONObject f253465u;

    public i1(java.lang.String str, long j17, long j18) {
        super(null, 1, null);
        this.f253465u = new org.json.JSONObject();
        r45.wu1 wu1Var = new r45.wu1();
        wu1Var.set(1, db2.t4.f228171a.b(7875, this.f16135n));
        wu1Var.set(2, str);
        wu1Var.set(3, java.lang.Long.valueOf(j17));
        wu1Var.set(4, java.lang.Long.valueOf(j18));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = wu1Var;
        r45.xu1 xu1Var = new r45.xu1();
        xu1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) xu1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = xu1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetroommanager";
        lVar.f70667d = 7875;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.xu1 resp = (r45.xu1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveGetRoomManager", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f253465u;
    }
}
