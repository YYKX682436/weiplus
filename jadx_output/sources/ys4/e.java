package ys4;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f465222d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f465223e;

    /* renamed from: f, reason: collision with root package name */
    public final long f465224f = 10;

    /* renamed from: g, reason: collision with root package name */
    public boolean f465225g = false;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.wallet_core.model.p0 f465226h;

    /* renamed from: i, reason: collision with root package name */
    public r45.lm3 f465227i;

    public e(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetRealnameWording", "NetSceneGetRealnameWording call: %s", str);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.km3 km3Var = new r45.km3();
        km3Var.f378818d = at4.g0.c();
        km3Var.f378820f = str;
        if (!h45.y.c()) {
            km3Var.f378819e = h45.y.f278968a;
        }
        lVar.f70664a = km3Var;
        lVar.f70665b = new r45.lm3();
        lVar.f70666c = "/cgi-bin/mmpay-bin/getrealnamewording";
        lVar.f70667d = 1666;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f465223e = a17;
        a17.setIsUserCmd(true);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f465222d = u0Var;
        rp3.c.a().getClass();
        return dispatch(sVar, this.f465223e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1666;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetRealnameWording", "onGYNetEnd,errType=" + i18 + "errCode=" + i19);
        if (i18 == 0 && i19 == 0) {
            r45.lm3 lm3Var = (r45.lm3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            this.f465227i = lm3Var;
            long j17 = lm3Var.f379609p;
            if (j17 <= 0) {
                j17 = this.f465224f;
            }
            boolean z17 = lm3Var.f379619z;
            this.f465225g = z17;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetRealnameWording", "need_agree_duty %s", java.lang.Boolean.valueOf(z17));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("bindcardTitle", lm3Var.f379602f);
                jSONObject.put("bindcardSubTitle", lm3Var.f379603g);
                jSONObject.put("bindIdTitle", lm3Var.f379604h);
                jSONObject.put("bindIdSubTitle", lm3Var.f379605i);
                jSONObject.put("extral_wording", lm3Var.f379606m);
                jSONObject.put("question_answer_switch", lm3Var.f379607n);
                jSONObject.put("question_answer_url", lm3Var.f379608o);
                jSONObject.put("cache_time", j17);
                jSONObject.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
                jSONObject.put("isShowBindCard", lm3Var.f379610q);
                jSONObject.put("isShowBindCardVerify", lm3Var.f379612s);
                jSONObject.put("isShowBindId", lm3Var.f379611r);
                jSONObject.put("bindCardVerifyTitle", lm3Var.f379613t);
                jSONObject.put("bindCardVerifySubtitle", lm3Var.f379614u);
                jSONObject.put("bindCardVerifyAlertViewRightBtnTxt", lm3Var.f379615v);
                jSONObject.put("bindCardVerifyAlertViewContent", lm3Var.f379616w);
                jSONObject.put("isShowBindCardVerifyAlertView", lm3Var.f379617x);
                java.util.LinkedList linkedList = lm3Var.f379618y;
                if (linkedList != null && linkedList.size() > 0) {
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    java.util.Iterator it = linkedList.iterator();
                    boolean z18 = false;
                    while (it.hasNext()) {
                        java.lang.String str2 = (java.lang.String) it.next();
                        if (z18) {
                            stringBuffer.append("\n");
                        }
                        stringBuffer.append(str2);
                        z18 = true;
                    }
                    jSONObject.put("cache_header_titles", stringBuffer.toString());
                }
                jSONObject.put("isShowCapitalSecurity", lm3Var.B);
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_REALNAME_SWITCH_WORDING_STRING_SYNC, jSONObject.toString());
                this.f465226h = com.tencent.mm.wallet_core.model.p0.d(lm3Var.A);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetRealnameWording", e17, "", new java.lang.Object[0]);
            }
        }
        this.f465222d.onSceneEnd(i18, i19, str, this);
    }
}
