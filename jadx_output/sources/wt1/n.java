package wt1;

/* loaded from: classes15.dex */
public class n implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public lu1.e f449311e;

    /* renamed from: f, reason: collision with root package name */
    public int f449312f;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f449310d = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f449313g = new com.tencent.mm.sdk.platformtools.b4(new wt1.l(this), false);

    public final xt1.m a(r45.fg5 fg5Var) {
        xt1.m mVar = new xt1.m();
        mVar.field_card_id = fg5Var.f374317d;
        mVar.field_lower_bound = fg5Var.f374318e;
        mVar.field_expire_time_interval = fg5Var.f374321h;
        mVar.field_need_insert_show_timestamp = fg5Var.f374319f;
        mVar.field_show_expire_interval = fg5Var.f374322i;
        mVar.field_show_timestamp_encrypt_key = fg5Var.f374320g;
        mVar.field_fetch_time = java.lang.System.currentTimeMillis();
        return mVar;
    }

    public final r45.c25 b(java.lang.String str, java.lang.String str2, lu1.e eVar) {
        r45.c25 c25Var = new r45.c25();
        c25Var.f371242d = str;
        c25Var.f371243e = str2;
        c25Var.f371244f = new java.lang.Long(java.lang.System.currentTimeMillis() / 1000).intValue();
        c25Var.f371245g = eVar == null ? -1 : eVar.f321337d;
        return c25Var;
    }

    public final void c(java.lang.String str, lu1.h0 h0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doNetSceneGetDynamicQrcode, cardId:");
        sb6.append(str);
        sb6.append(",scene :");
        sb6.append(h0Var == null ? 0 : h0Var.f321349d);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", sb6.toString());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str);
        xt1.l0 l0Var = new xt1.l0(linkedList, h0Var != null ? h0Var.f321349d : 0);
        gm0.j1.n().f273288b.a(1382, this);
        gm0.j1.n().f273288b.g(l0Var);
    }

    public final void d(java.lang.String str, java.lang.String str2, lu1.e eVar) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(b(str, str2, eVar));
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doNetSceneReport, operate_list=%d,refreshAction=%d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(eVar.f321337d));
        f(linkedList);
    }

    public final void e(java.lang.String str, java.util.List list, lu1.e eVar) {
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doNetSceneReport error! CardCodeRefreshAction is null! cannot report!");
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(b(str, ((xt1.o) it.next()).field_code_id, eVar));
        }
        f(linkedList);
    }

    public final void f(java.util.LinkedList linkedList) {
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.finder.f1.CTRL_INDEX, this);
        gm0.j1.n().f273288b.g(new xt1.o0(linkedList));
    }

    public final void g(tt1.j jVar, lu1.h0 h0Var) {
        boolean z17 = false;
        if (jVar != null) {
            if (jVar.i0() == null || !jVar.i0().E) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get cardInfo is_commom_card is false!");
            } else {
                z17 = true;
            }
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "cannot  get qrCode !");
            j(2, "");
            return;
        }
        if (!lu1.a0.x(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "isNetworkAvailable false cannot connet network!");
            j(-1, "");
        } else if (this.f449312f < 3) {
            c(jVar.g(), h0Var);
            this.f449312f++;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doRequestNetSceneGetDynamicQrcode is  limit requestcount:" + this.f449312f + ",cannot request!");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(lu1.h0 r10) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wt1.n.h(lu1.h0):void");
    }

    public final boolean i(xt1.m mVar) {
        if (java.lang.System.currentTimeMillis() - mVar.field_fetch_time <= mVar.field_expire_time_interval * 1000) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "code  expire time is true! currentTime= %s,codeFetchTime=%s,field_expire_time_interval=%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(mVar.field_fetch_time), java.lang.Integer.valueOf(mVar.field_expire_time_interval));
        return true;
    }

    public final void j(int i17, java.lang.String str) {
        wt1.m mVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onFail()");
        if (this.f449310d == null) {
            return;
        }
        for (int i18 = 0; i18 < ((java.util.ArrayList) this.f449310d).size(); i18++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f449310d).get(i18);
            if (weakReference != null && (mVar = (wt1.m) weakReference.get()) != null) {
                com.tencent.mm.plugin.card.ui.b0 b0Var = (com.tencent.mm.plugin.card.ui.b0) mVar;
                com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUIContoller", "onGetCodeFail! errCode = %d, errMsg=%s", java.lang.Integer.valueOf(i17), str);
                android.os.Message obtain = android.os.Message.obtain();
                com.tencent.mm.plugin.card.ui.r0 r0Var = new com.tencent.mm.plugin.card.ui.r0(null);
                r0Var.f95142a = com.tencent.mm.plugin.card.ui.q0.onGetCodeFail;
                r0Var.f95143b = i17 == -1 ? b0Var.h(com.tencent.mm.R.string.ase) : i17 == 2 ? b0Var.h(com.tencent.mm.R.string.ars) : b0Var.h(com.tencent.mm.R.string.asd);
                obtain.obj = r0Var;
                b0Var.W.sendMessage(obtain);
            }
        }
    }

    public final void k(lu1.e eVar) {
        wt1.m mVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onReceiveCodeUnavailable()");
        if (this.f449310d == null) {
            return;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.f449310d).size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f449310d).get(i17);
            if (weakReference != null && (mVar = (wt1.m) weakReference.get()) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "on onReceiveCodeUnavailable! do update refresh code view!");
                android.os.Message obtain = android.os.Message.obtain();
                com.tencent.mm.plugin.card.ui.r0 r0Var = new com.tencent.mm.plugin.card.ui.r0(null);
                r0Var.f95142a = com.tencent.mm.plugin.card.ui.q0.onReceiveCodeUnavailable;
                r0Var.f95144c = eVar;
                obtain.obj = r0Var;
                ((com.tencent.mm.plugin.card.ui.b0) mVar).W.sendMessage(obtain);
            }
        }
    }

    public void l() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "stopRefreshCodeTimer!");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f449313g;
        if (b4Var.e()) {
            return;
        }
        b4Var.d();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        wt1.m mVar;
        lu1.e eVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd, errType = ");
        sb6.append(i17);
        sb6.append(" errCode = ");
        sb6.append(i18);
        sb6.append(",NetSceneBase=");
        sb6.append(m1Var != null ? m1Var.getClass() : "");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", sb6.toString());
        if (i17 != 0 || i18 != 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onSceneEnd, errType = ");
            sb7.append(i17);
            sb7.append(" errCode = ");
            sb7.append(i18);
            sb7.append(" cmd:");
            sb7.append(m1Var != null ? m1Var.getType() : 0);
            sb7.append("  NetSceneBase=");
            sb7.append(m1Var != null ? m1Var.getClass() : "");
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDynamicQrcodeOfflineMgr", sb7.toString());
            if (!(m1Var instanceof xt1.l0)) {
                gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.finder.f1.CTRL_INDEX, this);
                return;
            } else {
                j(i18, str);
                gm0.j1.n().f273288b.q(1382, this);
                return;
            }
        }
        if (!(m1Var instanceof xt1.l0)) {
            gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.finder.f1.CTRL_INDEX, this);
            return;
        }
        r45.fg5 fg5Var = ((xt1.l0) m1Var).f456521f;
        if (fg5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "onSceneEnd, resp  qr_code_item_list is null ");
            return;
        }
        java.lang.String str2 = fg5Var.f374317d;
        if (xt1.t0.Zi().y0(str2) == null) {
            xt1.t0.Zi().insert(a(fg5Var));
        } else {
            xt1.t0.Zi().update(a(fg5Var), new java.lang.String[0]);
        }
        java.util.List z07 = xt1.t0.aj().z0(str2);
        if (!((java.util.ArrayList) z07).isEmpty() && xt1.t0.aj().d(str2) && (eVar = this.f449311e) != null) {
            e(str2, z07, eVar);
        }
        java.util.Iterator it = fg5Var.f374323m.iterator();
        while (true) {
            java.lang.String str3 = null;
            if (!it.hasNext()) {
                break;
            }
            r45.eg5 eg5Var = (r45.eg5) it.next();
            xt1.o oVar = new xt1.o();
            oVar.field_card_id = str2;
            oVar.field_code_id = eg5Var.f373464d;
            java.lang.String str4 = eg5Var.f373465e;
            if (str4 != null && str4.length() > 0) {
                try {
                    str3 = lu1.s.c("CbW9HMPiil38ldOjZp5WkwlIfzvLwiX6_" + gm0.j1.b().h() + "_" + str2, str4);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardDymanicQrcodeOfflineHelper", e17, "", new java.lang.Object[0]);
                }
            }
            oVar.field_code = str3;
            xt1.t0.aj().insert(oVar);
        }
        lu1.e eVar2 = this.f449311e;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onSuccess()");
        if (this.f449310d != null) {
            while (r6 < ((java.util.ArrayList) this.f449310d).size()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f449310d).get(r6);
                if (weakReference != null && (mVar = (wt1.m) weakReference.get()) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "onGetCodeSuccess! do update code view!");
                    android.os.Message obtain = android.os.Message.obtain();
                    com.tencent.mm.plugin.card.ui.r0 r0Var = new com.tencent.mm.plugin.card.ui.r0(null);
                    r0Var.f95142a = com.tencent.mm.plugin.card.ui.q0.onGetCodeSuccess;
                    r0Var.f95144c = eVar2;
                    obtain.obj = r0Var;
                    ((com.tencent.mm.plugin.card.ui.b0) mVar).W.sendMessage(obtain);
                }
                r6++;
            }
        }
        gm0.j1.n().f273288b.q(1382, this);
    }
}
