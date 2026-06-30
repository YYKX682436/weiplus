package ek2;

/* loaded from: classes.dex */
public final class d0 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.c0 f253431u;

    /* renamed from: v, reason: collision with root package name */
    public final org.json.JSONObject f253432v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.lang.String str, long j17, ek2.c0 callback) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253431u = callback;
        this.f253432v = new org.json.JSONObject();
        r45.e81 e81Var = new r45.e81();
        e81Var.set(1, db2.t4.f228171a.b(11609, this.f16135n));
        e81Var.set(2, str == null ? "" : str);
        e81Var.set(3, java.lang.Long.valueOf(j17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = e81Var;
        r45.f81 f81Var = new r45.f81();
        f81Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) f81Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = f81Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetlivesonglist";
        lVar.f70667d = 11609;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.f81 resp = (r45.f81) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveReward", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.c0 c0Var = this.f253431u;
        if (c0Var != null) {
            c0Var.a(i17, i18, str, resp);
        }
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f253432v;
    }
}
