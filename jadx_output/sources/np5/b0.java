package np5;

/* loaded from: classes9.dex */
public class b0 implements com.tencent.mm.modelbase.u0, np5.e {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f338818d;

    /* renamed from: e, reason: collision with root package name */
    public np5.f f338819e;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f338825n;

    /* renamed from: o, reason: collision with root package name */
    public android.os.Bundle f338826o;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f338820f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f338821g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f338822h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public android.app.Dialog f338823i = null;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f338824m = new java.util.HashSet();

    /* renamed from: p, reason: collision with root package name */
    public final np5.a f338827p = new np5.a(this);

    /* renamed from: q, reason: collision with root package name */
    public final np5.b f338828q = new np5.b(this);

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f338829r = new java.util.HashMap();

    public b0(android.content.Context context, np5.f fVar) {
        this.f338819e = null;
        this.f338818d = context;
        this.f338819e = fVar;
    }

    @Override // np5.e
    public void a(com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        android.app.Dialog dialog;
        h(m1Var);
        this.f338820f.add(m1Var);
        if (z17 && ((dialog = this.f338823i) == null || (dialog != null && !dialog.isShowing()))) {
            android.app.Dialog dialog2 = this.f338823i;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            android.content.Context context = this.f338818d;
            if (context == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletNetSceneMgr", "%s activity has destroyed!!!", this);
                return;
            }
            this.f338823i = com.tencent.mm.wallet_core.ui.b2.h(context, false, new np5.u(this));
        }
        if (x51.o1.S && (m1Var instanceof com.tencent.mm.wallet_core.tenpay.model.o)) {
            com.tencent.mm.wallet_core.tenpay.model.o oVar = (com.tencent.mm.wallet_core.tenpay.model.o) m1Var;
            if (oVar.getUri().contains("authen") || oVar.getUri().contains("verify")) {
                oVar.setFake();
            }
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.g(m1Var);
    }

    @Override // np5.e
    public void b() {
        android.app.Dialog dialog = this.f338823i;
        if (dialog != null) {
            dialog.dismiss();
            this.f338823i = null;
        }
    }

    public void c(int i17) {
        ((java.util.HashSet) this.f338824m).add(java.lang.Integer.valueOf(i17));
        gm0.j1.i();
        gm0.j1.n().f273288b.a(i17, this);
    }

    public void d(com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        e(m1Var, z17, 1, 0);
    }

    public void e(com.tencent.mm.modelbase.m1 m1Var, boolean z17, int i17, int i18) {
        android.app.Dialog dialog;
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = this;
        objArr[1] = java.lang.Boolean.valueOf(z17);
        objArr[2] = m1Var;
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = java.lang.Integer.valueOf(m1Var.getType());
        boolean z18 = m1Var instanceof com.tencent.mm.wallet_core.model.t;
        objArr[5] = java.lang.Boolean.valueOf(z18);
        android.app.Dialog dialog2 = this.f338823i;
        objArr[6] = java.lang.Boolean.valueOf(dialog2 == null || !(dialog2 == null || dialog2.isShowing()));
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneMgr", "this %s isShowProgress %s scene: %s dialogType %s type %s IWxSafePay %s tipDialog showing? %s", objArr);
        h(m1Var);
        if (z17) {
            this.f338821g.add(m1Var);
        } else {
            this.f338822h.add(m1Var);
        }
        if (z17 && ((dialog = this.f338823i) == null || (dialog != null && !dialog.isShowing()))) {
            android.app.Dialog dialog3 = this.f338823i;
            if (dialog3 != null) {
                dialog3.dismiss();
            }
            android.content.Context context = this.f338818d;
            if (context == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletNetSceneMgr", "activity has destroyed!!!");
                return;
            }
            if (i17 == 1) {
                if (z18) {
                    this.f338823i = com.tencent.mm.wallet_core.ui.b2.h(context, false, new np5.v(this));
                } else {
                    this.f338823i = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490386tj), this.f338818d.getString(com.tencent.mm.R.string.kvq), false, false, new np5.w(this));
                }
            } else if (i17 == 2) {
                this.f338823i = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490386tj), this.f338818d.getString(com.tencent.mm.R.string.kvq), false, false, new np5.x(this));
            } else if (i17 == 3) {
                this.f338823i = com.tencent.mm.wallet_core.ui.b2.f(context, "验证中", false, 0, new np5.y(this));
            } else if (i17 == 4) {
                this.f338823i = com.tencent.mm.wallet_core.ui.b2.h(context, false, new np5.z(this));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneMgr", "unknown dialog type: %d", java.lang.Integer.valueOf(i17));
                android.content.Context context2 = this.f338818d;
                this.f338823i = db5.e1.Q(context2, context2.getString(com.tencent.mm.R.string.f490386tj), this.f338818d.getString(com.tencent.mm.R.string.kvq), false, false, new np5.a0(this));
            }
        }
        if (x51.o1.S && (m1Var instanceof com.tencent.mm.wallet_core.tenpay.model.o)) {
            com.tencent.mm.wallet_core.tenpay.model.o oVar = (com.tencent.mm.wallet_core.tenpay.model.o) m1Var;
            if (oVar.getUri().contains("authen") || oVar.getUri().contains("verify")) {
                oVar.setFake();
            }
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.h(m1Var, i18);
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        objArr2[0] = this;
        objArr2[1] = m1Var;
        objArr2[2] = m1Var.getReqResp() == null ? "" : m1Var.getReqResp().getUri();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneMgr", "this %s scene url %s %s", objArr2);
    }

    public void f() {
        android.app.Dialog dialog = this.f338823i;
        if (dialog != null) {
            dialog.dismiss();
            this.f338823i = null;
        }
        java.util.HashSet hashSet = this.f338820f;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.tencent.mm.modelbase.m1 m1Var = (com.tencent.mm.modelbase.m1) it.next();
            gm0.j1.i();
            gm0.j1.n().f273288b.d(m1Var);
        }
        java.util.HashSet hashSet2 = this.f338821g;
        java.util.Iterator it6 = hashSet2.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.modelbase.m1 m1Var2 = (com.tencent.mm.modelbase.m1) it6.next();
            gm0.j1.i();
            gm0.j1.n().f273288b.d(m1Var2);
        }
        hashSet.clear();
        hashSet2.clear();
    }

    public boolean g() {
        return (this.f338821g.isEmpty() && this.f338820f.isEmpty()) ? false : true;
    }

    public final void h(com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var == null || !(m1Var instanceof com.tencent.mm.wallet_core.model.d1)) {
            return;
        }
        com.tencent.mm.wallet_core.model.d1 d1Var = (com.tencent.mm.wallet_core.model.d1) m1Var;
        d1Var.setProcessName(this.f338825n);
        android.os.Bundle bundle = this.f338826o;
        if (bundle != null) {
            d1Var.setProcessBundle(bundle);
            return;
        }
        android.content.Context context = this.f338818d;
        if (context instanceof com.tencent.mm.wallet_core.ui.WalletBaseUI) {
            d1Var.setProcessBundle(((com.tencent.mm.wallet_core.ui.WalletBaseUI) context).getInput());
        }
    }

    public void i(int i17) {
        gm0.j1.i();
        gm0.j1.n().f273288b.q(i17, this);
        java.util.Set set = this.f338824m;
        ((java.util.HashSet) set).remove(java.lang.Integer.valueOf(i17));
        if (((java.util.HashSet) set).isEmpty()) {
            f();
            this.f338819e = null;
            this.f338818d = null;
            np5.a aVar = this.f338827p;
            aVar.f338812g = null;
            gm0.j1.i();
            gm0.j1.n().f273288b.q(385, aVar);
            np5.b bVar = this.f338828q;
            bVar.f338817f = null;
            gm0.j1.i();
            gm0.j1.n().f273288b.q(385, bVar);
            java.util.HashMap hashMap = this.f338829r;
            for (np5.c cVar : hashMap.values()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IDelayQueryOrder", "onDestory rtType %s", java.lang.Integer.valueOf(cVar.f338831e));
                gm0.j1.i();
                gm0.j1.n().f273288b.q(cVar.f338831e, cVar);
            }
            hashMap.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean j(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneMgr", "onSceneEnd scene is %s %s", this, m1Var.toString());
        boolean z17 = x51.o1.S;
        np5.a aVar = this.f338827p;
        if (z17 && (m1Var instanceof com.tencent.mm.wallet_core.tenpay.model.p)) {
            com.tencent.mm.wallet_core.tenpay.model.p pVar = (com.tencent.mm.wallet_core.tenpay.model.p) m1Var;
            if (!pVar.getHasRetried() && !pVar.H()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneMgr", "test do delay query order");
                aVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "startDelayScene");
                aVar.f338811f = 0;
                aVar.a(pVar);
                return true;
            }
        }
        boolean z18 = m1Var instanceof com.tencent.mm.wallet_core.tenpay.model.c;
        np5.b bVar = this.f338828q;
        if (z18) {
            bVar.getClass();
            com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo iTenpaySave$RetryPayInfo = ((rr4.d) ((com.tencent.mm.wallet_core.tenpay.model.c) m1Var)).f399233m;
            if (iTenpaySave$RetryPayInfo != null && iTenpaySave$RetryPayInfo.b()) {
                np5.b.f338814g = iTenpaySave$RetryPayInfo;
            }
        }
        boolean z19 = m1Var instanceof com.tencent.mm.wallet_core.tenpay.model.p;
        if (z19) {
            com.tencent.mm.wallet_core.tenpay.model.p pVar2 = (com.tencent.mm.wallet_core.tenpay.model.p) m1Var;
            if (pVar2.getHasRetried()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneMgr", "getHasRetried pass %s", m1Var);
                return false;
            }
            if (pVar2.H() && (m1Var instanceof com.tencent.mm.wallet_core.tenpay.model.a)) {
                boolean canPayRetry = pVar2.canPayRetry();
                boolean z27 = !pVar2.checkRecSrvResp();
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneMgr", "%s save or fetch shouldRetry, network: %B, server: %B", this, java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(canPayRetry));
                if (!canPayRetry && !z27) {
                    return false;
                }
                bVar.getClass();
                com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo retryPayInfo = ((com.tencent.mm.wallet_core.tenpay.model.a) m1Var).getRetryPayInfo();
                if (retryPayInfo != null && retryPayInfo.b()) {
                    np5.b.f338814g = retryPayInfo;
                }
                return bVar.a(pVar2);
            }
        }
        int type = m1Var.getType();
        java.util.HashMap hashMap = this.f338829r;
        if (hashMap != null) {
            np5.c cVar = (np5.c) hashMap.get(java.lang.Integer.valueOf(type));
            if (m1Var instanceof np5.d) {
                np5.d dVar = (np5.d) m1Var;
                if (((com.tencent.mm.plugin.remittance.model.t) dVar).f157018h) {
                    return false;
                }
                cVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.IDelayQueryOrder", "startQueryOrder %s ", dVar);
                cVar.f338832f = dVar;
                if (cVar.b(i17, i18, dVar)) {
                    return true;
                }
            }
        }
        if (!z19) {
            return false;
        }
        com.tencent.mm.wallet_core.tenpay.model.p pVar3 = (com.tencent.mm.wallet_core.tenpay.model.p) m1Var;
        if (pVar3.H()) {
            return false;
        }
        if (pVar3.getHasRetried()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneMgr", "getHasRetried pass");
            return false;
        }
        aVar.getClass();
        int i19 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14010s;
        com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", " isServerDelayQuery %s mDelayQueryTime %s ", java.lang.Boolean.valueOf(pVar3.f214050e == 1), java.lang.Integer.valueOf(aVar.f338811f));
        boolean z28 = (pVar3.f214050e == 1) && aVar.f338811f < i19;
        boolean z29 = !pVar3.checkRecSrvResp();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(965L, 13L, 1L);
        if (z29) {
            g0Var.C(965L, 14L, 1L);
        }
        if (!z28 && !z29) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneMgr", "%s doing delay order query retry", this);
        com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderHelper", "startDelayScene");
        aVar.f338811f = 0;
        aVar.a(pVar3);
        return true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        boolean z18;
        np5.f fVar;
        java.util.HashSet hashSet = this.f338822h;
        boolean contains = hashSet.contains(m1Var);
        java.util.HashSet hashSet2 = this.f338820f;
        java.util.HashSet hashSet3 = this.f338821g;
        if (contains) {
            hashSet.remove(m1Var);
        } else if (hashSet3.contains(m1Var)) {
            if (j(i17, i18, str, m1Var)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneMgr", "%s do delay order query.break off!", this);
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneMgr", "%s Not need delay query order,remove scene", this);
                hashSet3.remove(m1Var);
            }
        } else {
            if (!hashSet2.contains(m1Var)) {
                z17 = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneMgr", "%s onSceneEnd scenes %s forcescenes %s", this, java.lang.Integer.valueOf(hashSet3.size()), java.lang.Integer.valueOf(hashSet2.size()));
                if (hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    z18 = false;
                } else {
                    android.app.Dialog dialog = this.f338823i;
                    if (dialog != null) {
                        dialog.dismiss();
                        this.f338823i = null;
                    }
                    z18 = true;
                }
                if (z17 || (fVar = this.f338819e) == null) {
                }
                fVar.onSceneEnd(i17, i18, str, m1Var, z18);
                return;
            }
            if (j(i17, i18, str, m1Var)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneMgr", "%s do delay order query.break off!", this);
                return;
            } else {
                hashSet2.remove(m1Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneMgr", "%s Not need delay query order,remove scene", this);
            }
        }
        z17 = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneMgr", "%s onSceneEnd scenes %s forcescenes %s", this, java.lang.Integer.valueOf(hashSet3.size()), java.lang.Integer.valueOf(hashSet2.size()));
        if (hashSet3.isEmpty()) {
        }
        z18 = false;
        if (z17) {
        }
    }
}
