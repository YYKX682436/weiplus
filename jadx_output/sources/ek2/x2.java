package ek2;

/* loaded from: classes3.dex */
public final class x2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253563u;

    /* renamed from: v, reason: collision with root package name */
    public final ek2.w2 f253564v;

    /* renamed from: w, reason: collision with root package name */
    public final r45.of2 f253565w;

    /* renamed from: x, reason: collision with root package name */
    public final org.json.JSONObject f253566x;

    /* renamed from: y, reason: collision with root package name */
    public final org.json.JSONObject f253567y;

    public x2(long j17, long j18, java.lang.String str, ek2.w2 w2Var) {
        super(null, 1, null);
        this.f253563u = "Finder.CgiFinderManualCloseLive";
        this.f253564v = w2Var;
        r45.of2 of2Var = new r45.of2();
        this.f253565w = of2Var;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f253566x = jSONObject;
        this.f253567y = new org.json.JSONObject();
        of2Var.set(1, java.lang.Long.valueOf(j17));
        of2Var.set(2, xy2.c.f(this.f16135n));
        of2Var.set(3, java.lang.Long.valueOf(j18));
        of2Var.set(4, str);
        jSONObject.put("liveId", j17);
        jSONObject.put(dm.i4.COL_USERNAME, of2Var.getString(2));
        jSONObject.put("object_id", j18);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = of2Var;
        r45.pf2 pf2Var = new r45.pf2();
        pf2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) pf2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = pf2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findermanualcloselive";
        lVar.f70667d = 5857;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderManualCloseLive", "CgiFinderManualCloseLive init liveId:" + of2Var.getLong(1) + ", objectId:" + of2Var.getLong(3) + ", nonceId:" + of2Var.getString(4) + ", finderUsername:" + of2Var.getString(2));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.pf2 resp = (r45.pf2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.String str2 = "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str3 = this.f253563u;
        com.tencent.mars.xlog.Log.i(str3, str2);
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i(str3, "close live result:" + pm0.b0.g(resp));
        }
        fo3.s.INSTANCE.y1(this.f253565w.getLong(1));
        ek2.w2 w2Var = this.f253564v;
        if (w2Var != null) {
            dk2.z1 z1Var = (dk2.z1) w2Var;
            yz5.s sVar = z1Var.f234410b;
            if (i17 == 0 && i18 == 0) {
                if (sVar != null) {
                    sVar.v(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str == null ? "" : str, resp);
                }
            } else {
                com.tencent.mars.xlog.Log.i(z1Var.f234409a.f234009d, "manual close live room failed");
                if (sVar != null) {
                    sVar.v(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str == null ? "" : str, resp);
                }
            }
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f253567y;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f253566x;
    }
}
