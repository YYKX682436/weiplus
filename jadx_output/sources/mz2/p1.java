package mz2;

/* loaded from: classes9.dex */
public class p1 extends mz2.a {
    @Override // pz2.a
    public java.util.Map C() {
        return this.f333085d.C();
    }

    @Override // mz2.a, pz2.a
    public boolean D() {
        return this.f333085d.D();
    }

    @Override // pz2.a
    public boolean Ge(boolean z17, boolean z18, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthMgrImp", "hy: post pay. is fingerprint pay: %b, is pay ok: %b, extInfo: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), bundle);
        this.f333085d.Mf(z17, z18, mz2.d2.IML.f333113f, bundle);
        return false;
    }

    @Override // mz2.a, pz2.a
    public boolean H4() {
        return this.f333085d.E2();
    }

    @Override // pz2.a
    public boolean Ic() {
        return this.f333085d.Lf(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    @Override // pz2.a
    public boolean L2() {
        boolean mf6 = this.f333085d.mf();
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthMgrImp", "py: hasAuthKey: %b", java.lang.Boolean.valueOf(mf6));
        if (!mf6 && this.f333085d.wh()) {
            ((nz2.a) this.f333085d).getClass();
            if ((mz2.m0.a() && this.f333085d.ja()) || (((nz2.a) this.f333085d).a() && this.f333085d.h1())) {
                m05.i.f322570a.a("5", "4", "1", "key invalid when pay");
            }
        }
        return mf6;
    }

    @Override // pz2.a
    public boolean Nh() {
        return false;
    }

    @Override // pz2.a
    public void O(com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent openFingerPrintAuthEvent, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthMgrImp", "hy: soter onOpenFingerprintAuthSuccess");
        openFingerPrintAuthEvent.f54596h.f7639e = Uh();
        am.pn pnVar = openFingerPrintAuthEvent.f54596h;
        pnVar.f7635a = com.tencent.mm.sdk.platformtools.t8.K0(pnVar.f7639e) ? 1 : 0;
        am.pn pnVar2 = openFingerPrintAuthEvent.f54596h;
        pnVar2.f7640f = 2;
        pnVar2.f7636b = "";
        pnVar2.f7637c = "";
        java.lang.Runnable runnable = openFingerPrintAuthEvent.f54595g.f7565c;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // pz2.a
    public int Q7(pz2.c cVar, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthMgrImp", "start face auth: %s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new mz2.n1(this, i17, cVar), false);
        long j17 = i17;
        b4Var.c(j17, j17);
        this.f333085d.C3(com.tencent.mm.sdk.platformtools.x2.f193071a, new nz2.f(mz2.d2.IML.f333111d, i18 == 2 ? 3 : 1), new mz2.o1(this, b4Var, cVar));
        return 0;
    }

    @Override // pz2.a
    public boolean Rb() {
        return this.f333085d.uf(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    @Override // mz2.a, pz2.a
    public java.lang.String Uh() {
        zt5.s sVar = mz2.d2.IML.f333114g;
        if (sVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthMgrImp", "hy: signature result is null");
            return "";
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("json", sVar.f475629j);
            jSONObject.put("signature", sVar.f475630k);
            jSONObject.put("soter_type", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G());
            return jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthMgrImp", "hy: error when convert to json: %s", e17.toString());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SoterAuthMgrImp", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // pz2.a
    public boolean a1() {
        boolean h17 = this.f333085d.h1();
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthMgrImp", "isDeviceHasFaceID:%s", java.lang.Boolean.valueOf(h17));
        return h17;
    }

    @Override // pz2.a
    public void af() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthMgrImp", "hy: soter init fp. Do nothing?? Prepare ASK??");
        this.f333085d.prepare();
    }

    @Override // pz2.a
    public void dc(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthMgrImp", "hy: start startRigesterSysFP");
    }

    @Override // pz2.a
    public int dg(pz2.c cVar, int i17, boolean z17) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthMgrImp", "hy: req restart after fail, but no need");
            return 0;
        }
        this.f333085d.g9(com.tencent.mm.sdk.platformtools.x2.f193071a, new nz2.f(mz2.d2.IML.f333111d, 1), new mz2.m1(this, cVar));
        return 0;
    }

    @Override // pz2.a
    public boolean isRoot() {
        return false;
    }

    @Override // pz2.a
    public int type() {
        return 2;
    }

    @Override // pz2.a
    public void userCancel() {
        this.f333085d.cancel();
    }

    @Override // pz2.a
    public boolean wc() {
        return this.f333085d.Je();
    }

    @Override // pz2.a
    public boolean yh() {
        boolean ja6 = this.f333085d.ja();
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthMgrImp", "isDeviceHasFingerPrint:%s", java.lang.Boolean.valueOf(ja6));
        return ja6;
    }
}
