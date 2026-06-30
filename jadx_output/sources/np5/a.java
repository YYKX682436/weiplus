package np5;

/* loaded from: classes9.dex */
public class a implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.tenpay.model.p f338809d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.tenpay.model.i f338810e;

    /* renamed from: f, reason: collision with root package name */
    public int f338811f = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f338812g;

    public a(com.tencent.mm.modelbase.u0 u0Var) {
        this.f338812g = u0Var;
    }

    public final void a(com.tencent.mm.wallet_core.tenpay.model.p pVar) {
        com.tencent.mm.wallet_core.tenpay.model.i dVar;
        this.f338809d = pVar;
        pVar.setHasRetried(true);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(385, this);
        int i17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14009r;
        if (i17 <= 0) {
            i17 = 10000;
        }
        this.f338811f++;
        java.util.HashMap hashMap = (java.util.HashMap) this.f338809d.f214049d;
        java.lang.String str = (java.lang.String) hashMap.get("req_key");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "no reqKey");
            dVar = new com.tencent.mm.wallet_core.tenpay.model.i(hashMap);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "payorder reqKey: %s", str);
            com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "delayquery go new split cgi");
            dVar = str.startsWith("sns_aa_") ? new com.tencent.mm.wallet_core.tenpay.model.d(hashMap) : str.startsWith("sns_tf_") ? new com.tencent.mm.wallet_core.tenpay.model.m(hashMap) : str.startsWith("sns_ff_") ? new com.tencent.mm.wallet_core.tenpay.model.f(hashMap) : str.startsWith("ts_") ? new com.tencent.mm.wallet_core.tenpay.model.g(hashMap) : str.startsWith("sns_") ? new com.tencent.mm.wallet_core.tenpay.model.k(hashMap) : str.startsWith("offline_") ? new com.tencent.mm.wallet_core.tenpay.model.h(hashMap) : str.startsWith("up_") ? new com.tencent.mm.wallet_core.tenpay.model.n(hashMap) : str.startsWith("seb_ff_") ? new com.tencent.mm.wallet_core.tenpay.model.j(hashMap) : str.startsWith("tax_") ? new com.tencent.mm.wallet_core.tenpay.model.l(hashMap) : str.startsWith("dc_") ? new com.tencent.mm.wallet_core.tenpay.model.e(hashMap) : new com.tencent.mm.wallet_core.tenpay.model.i(hashMap);
        }
        this.f338810e = dVar;
        int i18 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14010s;
        com.tencent.mm.wallet_core.tenpay.model.i iVar = this.f338810e;
        int i19 = this.f338811f;
        int i27 = i19 < i18 ? 0 : 1;
        iVar.getClass();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("is_last_query", i27 + "");
        hashMap2.put("curr_query_count", i19 + "");
        iVar.addRequestData(hashMap2);
        com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "doLoopDelayScene,delay = %s queryOrderCount %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        gm0.j1.i();
        gm0.j1.n().f273288b.h(this.f338810e, i17);
    }

    public void b(int i17, int i18, java.lang.String str, org.json.JSONObject jSONObject, com.tencent.mm.wallet_core.tenpay.model.i iVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback errCode = " + i18 + "errType = " + i17);
        if (this.f338809d != null && jSONObject != null && i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback mScene !=null");
            this.f338809d.onGYNetEnd(i18, str, jSONObject);
            this.f338812g.onSceneEnd(i17, i18, str, this.f338809d);
            int i19 = this.f338811f;
            if (i19 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(965L, 4L, 1L);
            } else if (i19 == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(965L, 5L, 1L);
            } else if (i19 == 3) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(965L, 6L, 1L);
            }
        } else if (this.f338812g != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback mRealCallback !=null");
            this.f338812g.onSceneEnd(i17, i18, str, this.f338809d);
            int i27 = this.f338811f;
            if (i27 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(965L, 7L, 1L);
            } else if (i27 == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(965L, 8L, 1L);
            } else if (i27 == 3) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(965L, 9L, 1L);
            }
            if (!iVar.checkRecSrvResp()) {
                int i28 = this.f338811f;
                if (i28 == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(965L, 15L, 1L);
                } else if (i28 == 2) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(965L, 16L, 1L);
                } else if (i28 == 3) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(965L, 17L, 1L);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback reset");
        this.f338811f = 0;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof com.tencent.mm.wallet_core.tenpay.model.i) || !this.f338810e.equals(m1Var)) {
            if ((m1Var instanceof com.tencent.mm.wallet_core.tenpay.model.p) && this.f338809d.equals(m1Var)) {
                gm0.j1.i();
                gm0.j1.n().f273288b.q(385, this);
                com.tencent.mm.wallet_core.tenpay.model.p pVar = (com.tencent.mm.wallet_core.tenpay.model.p) m1Var;
                if (pVar.ishasCGiRetried()) {
                    if (this.f338809d.checkPaySuccess()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess ok");
                        b(i17, i18, str, pVar.f214055m, this.f338810e);
                        return;
                    }
                    if (this.f338809d.f214050e == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "try isServerDelayQuery true");
                        a(this.f338809d);
                        return;
                    } else {
                        java.lang.String str2 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14011t;
                        com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", str2);
                        b(i17, i18, str2, pVar.f214055m, this.f338810e);
                        return;
                    }
                }
                return;
            }
            return;
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.q(385, this);
        com.tencent.mm.wallet_core.tenpay.model.i iVar = (com.tencent.mm.wallet_core.tenpay.model.i) m1Var;
        if (iVar.f214048e == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step A");
            b(i17, i18, str, iVar.f214047d, iVar);
            return;
        }
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step B");
            if (iVar.f214048e != 2) {
                b(i17, i18, str, iVar.f214047d, iVar);
                return;
            } else {
                com.tencent.mm.wallet_core.tenpay.model.p pVar2 = this.f338809d;
                b(pVar2.f214052g, pVar2.f214053h, pVar2.f214054i, pVar2.f214055m, iVar);
                return;
            }
        }
        if (!iVar.checkRecSrvResp() && this.f338811f < ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14010s) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step C");
            com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14011t);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(965L, 0L, 1L);
            a(this.f338809d);
            return;
        }
        com.tencent.mm.wallet_core.tenpay.model.p pVar3 = this.f338809d;
        int i19 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14010s;
        com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", " isServerDelayQuery %s mDelayQueryTime %s ", java.lang.Boolean.valueOf(pVar3.f214050e == 1), java.lang.Integer.valueOf(this.f338811f));
        if (this.f338811f < i19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step D doLoopDelayScene");
            a(this.f338809d);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step D fail, retmsg_type: %s", java.lang.Integer.valueOf(iVar.f214048e));
        int i27 = iVar.f214048e;
        if (i27 == 1) {
            b(i17, i18, str, iVar.f214047d, iVar);
            return;
        }
        if (i27 == 2) {
            com.tencent.mm.wallet_core.tenpay.model.p pVar4 = this.f338809d;
            b(pVar4.f214052g, pVar4.f214053h, pVar4.f214054i, pVar4.f214055m, iVar);
            return;
        }
        java.lang.String str3 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14011t;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f338809d.f214054i)) {
            str3 = this.f338809d.f214054i;
        }
        java.lang.String str4 = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", str4);
        com.tencent.mm.wallet_core.tenpay.model.p pVar5 = this.f338809d;
        b(pVar5.f214052g, pVar5.f214053h, str4, pVar5.f214055m, iVar);
    }
}
