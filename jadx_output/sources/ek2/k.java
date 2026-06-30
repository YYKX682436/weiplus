package ek2;

/* loaded from: classes3.dex */
public final class k extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253482u;

    /* renamed from: v, reason: collision with root package name */
    public final ek2.j f253483v;

    /* renamed from: w, reason: collision with root package name */
    public final r45.ex0 f253484w;

    /* renamed from: x, reason: collision with root package name */
    public final org.json.JSONObject f253485x;

    /* renamed from: y, reason: collision with root package name */
    public final org.json.JSONObject f253486y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j17, java.lang.String finderUsername, long j18, java.lang.String nonceId, int i17, ek2.j callback) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253482u = "Finder.CgiFinderCloseLive";
        this.f253483v = callback;
        r45.ex0 ex0Var = new r45.ex0();
        this.f253484w = ex0Var;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f253485x = jSONObject;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        this.f253486y = jSONObject2;
        ex0Var.set(1, java.lang.Long.valueOf(j17));
        ex0Var.set(2, finderUsername);
        ex0Var.set(3, java.lang.Long.valueOf(j18));
        ex0Var.set(4, nonceId);
        ex0Var.set(5, java.lang.Integer.valueOf(i17));
        jSONObject2.put("liveId", j17);
        jSONObject2.put("objectId", j18);
        jSONObject.put(dm.i4.COL_USERNAME, ex0Var.getString(2));
        jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ex0Var;
        r45.fx0 fx0Var = new r45.fx0();
        fx0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) fx0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = fx0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findercloselive";
        lVar.f70667d = uc1.g0.CTRL_INDEX;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderCloseLive", "CgiFinderCloseLive init liveId:" + ex0Var.getLong(1) + ", username:" + ex0Var.getString(2) + ",objectId:" + ex0Var.getLong(3) + ",nonceId:" + ex0Var.getString(4) + ",scene:" + ex0Var.getInteger(5));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.fx0 resp = (r45.fx0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.String str2 = "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str3 = this.f253482u;
        com.tencent.mars.xlog.Log.i(str3, str2);
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i(str3, "close live result:" + pm0.b0.g(resp));
        }
        fo3.s.INSTANCE.y1(this.f253484w.getLong(1));
        dk2.a1 a1Var = (dk2.a1) this.f253483v;
        a1Var.getClass();
        yz5.s sVar = a1Var.f233167b;
        if (i17 == 0 && i18 == 0) {
            if (sVar != null) {
                sVar.v(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str == null ? "" : str, resp);
            }
        } else {
            com.tencent.mars.xlog.Log.i(a1Var.f233166a.f234009d, "close live room failed");
            if (sVar != null) {
                sVar.v(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str == null ? "" : str, resp);
            }
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f253486y;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f253485x;
    }
}
