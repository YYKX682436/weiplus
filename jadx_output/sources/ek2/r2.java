package ek2;

/* loaded from: classes5.dex */
public final class r2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.q2 f253526u;

    /* renamed from: v, reason: collision with root package name */
    public final org.json.JSONObject f253527v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r2(java.lang.String str, java.lang.Long l17, java.lang.Long l18, byte[] bArr, int i17, r45.b32 b32Var, r45.dy1 dy1Var, ek2.q2 callback) {
        super(null, 1, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253526u = callback;
        this.f253527v = new org.json.JSONObject();
        r45.qd2 qd2Var = new r45.qd2();
        qd2Var.set(1, db2.t4.f228171a.b(21535, this.f16135n));
        qd2Var.set(2, str == null ? "" : str);
        if (l17 != null) {
            qd2Var.set(3, java.lang.Long.valueOf(l17.longValue()));
        }
        if (l18 != null) {
            qd2Var.set(4, java.lang.Long.valueOf(l18.longValue()));
        }
        if (bArr != null) {
            qd2Var.set(5, pm0.b0.h(bArr));
        }
        qd2Var.set(6, java.lang.Integer.valueOf(i17));
        qd2Var.set(7, b32Var);
        qd2Var.set(8, dy1Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = qd2Var;
        r45.rd2 rd2Var = new r45.rd2();
        rd2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) rd2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = rd2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveupdatenewsonglist";
        lVar.f70667d = 21535;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.rd2 resp = (r45.rd2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveUpdateNewSongList", "onCgiEnd errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        this.f253526u.a(i17, i18, str, resp);
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f253527v;
    }
}
