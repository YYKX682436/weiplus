package ek2;

/* loaded from: classes.dex */
public final class m extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.l f253498u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f253499v;

    /* renamed from: w, reason: collision with root package name */
    public final org.json.JSONObject f253500w;

    /* renamed from: x, reason: collision with root package name */
    public final org.json.JSONObject f253501x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j17, long j18, java.lang.String str, byte[] bArr, int i17, r45.ch1 msg, ek2.l lVar) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f253498u = lVar;
        this.f253499v = "Finder.CgiFinderCloseLiveMic";
        this.f253500w = new org.json.JSONObject();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f253501x = jSONObject;
        r45.sn1 sn1Var = new r45.sn1();
        sn1Var.set(4, java.lang.Long.valueOf(j17));
        sn1Var.set(1, db2.t4.f228171a.a(4142));
        sn1Var.set(5, java.lang.Long.valueOf(j18));
        sn1Var.set(6, str);
        sn1Var.set(8, xy2.c.f(this.f16135n));
        sn1Var.set(7, java.lang.Integer.valueOf(i17));
        sn1Var.set(2, com.tencent.mm.protobuf.g.b(bArr));
        sn1Var.set(3, msg);
        jSONObject.put("liveId", j17);
        jSONObject.put("objectId", j18);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, sn1Var.getInteger(7));
        jSONObject.put(dm.i4.COL_USERNAME, sn1Var.getString(8));
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70664a = sn1Var;
        r45.tn1 tn1Var = new r45.tn1();
        tn1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) tn1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar2.f70665b = tn1Var;
        lVar2.f70666c = "/cgi-bin/micromsg-bin/finderliveclosemicwithaudience";
        lVar2.f70667d = 4142;
        com.tencent.mm.modelbase.o a17 = lVar2.a();
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderCloseLiveMic", "liveId:" + sn1Var.getLong(4) + " objectId:" + sn1Var.getLong(5) + " objectNonceId:" + sn1Var.getString(6) + " scene:" + sn1Var.getInteger(7));
        p(a17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.tn1 resp = (r45.tn1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253499v, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.l lVar = this.f253498u;
        if (lVar != null) {
            lVar.a(i17, i18, str, resp);
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f253501x;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f253500w;
    }
}
