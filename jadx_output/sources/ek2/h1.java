package ek2;

/* loaded from: classes.dex */
public final class h1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.g1 f253458u;

    /* renamed from: v, reason: collision with root package name */
    public final org.json.JSONObject f253459v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h1(java.lang.String str, java.lang.Long l17, java.lang.Long l18, byte[] bArr, long j17, ek2.g1 callback) {
        super(null, 1, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253458u = callback;
        this.f253459v = new org.json.JSONObject();
        r45.st1 st1Var = new r45.st1();
        st1Var.set(1, db2.t4.f228171a.b(21534, this.f16135n));
        st1Var.set(2, str == null ? "" : str);
        if (l17 != null) {
            st1Var.set(3, java.lang.Long.valueOf(l17.longValue()));
        }
        if (l18 != null) {
            st1Var.set(4, java.lang.Long.valueOf(l18.longValue()));
        }
        if (bArr != null) {
            st1Var.set(5, pm0.b0.h(bArr));
        }
        st1Var.set(6, java.lang.Long.valueOf(j17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = st1Var;
        r45.tt1 tt1Var = new r45.tt1();
        tt1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) tt1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = tt1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetnewsonglist";
        lVar.f70667d = 21534;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.tt1 resp = (r45.tt1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveGetNewSongList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.g1 g1Var = this.f253458u;
        if (g1Var != null) {
            g1Var.a(i17, i18, str, resp);
        }
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f253459v;
    }
}
