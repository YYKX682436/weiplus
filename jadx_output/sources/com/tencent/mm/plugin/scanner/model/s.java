package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes12.dex */
public class s extends com.tencent.mm.sdk.event.n {

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f159011i;

    /* renamed from: m, reason: collision with root package name */
    public static android.app.Activity f159012m;

    /* renamed from: n, reason: collision with root package name */
    public static e04.p f159013n;

    /* renamed from: d, reason: collision with root package name */
    public e04.f f159014d;

    /* renamed from: e, reason: collision with root package name */
    public final rz3.e f159015e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f159016f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f159017g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f159018h;

    public s() {
        super(0);
        this.f159015e = new com.tencent.mm.plugin.scanner.model.r(this);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f159016f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.DealQBarStrEvent>(a0Var) { // from class: com.tencent.mm.plugin.scanner.model.ExternRequestDealQBarStrHandler$2
            {
                this.__eventId = 1907055527;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent) {
                com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent2 = dealQBarStrEvent;
                if (dealQBarStrEvent2 != null) {
                    com.tencent.mm.plugin.scanner.model.s.b();
                    am.r3 r3Var = dealQBarStrEvent2.f54079g;
                    com.tencent.mm.plugin.scanner.model.s.f159011i = r3Var.f7780a;
                    com.tencent.mm.plugin.scanner.model.s.f159012m = r3Var.f7781b;
                    com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo = new com.tencent.qbar.ScanIdentifyReportInfo(r3Var.f7792m, r3Var.f7793n, r3Var.f7794o);
                    if (r3Var.f7791l == null) {
                        r3Var.f7791l = new android.os.Bundle();
                    }
                    r3Var.f7791l.putInt("result_image_height", r3Var.f7798s);
                    r3Var.f7791l.putInt("result_image_width", r3Var.f7797r);
                    com.tencent.mm.plugin.scanner.CodePointRect codePointRect = r3Var.f7796q;
                    if (codePointRect != null) {
                        r3Var.f7791l.putParcelable("result_normalize_rect", codePointRect);
                        scanIdentifyReportInfo.b(r3Var.f7796q, r3Var.f7797r, r3Var.f7798s);
                    } else {
                        r3Var.f7791l.putParcelable("result_normalize_rect", new com.tencent.mm.plugin.scanner.CodePointRect(0.0f, 0.0f, 1.0f, 1.0f));
                        scanIdentifyReportInfo.b(new com.tencent.mm.plugin.scanner.CodePointRect(0.0f, 0.0f, 1.0f, 1.0f), r3Var.f7797r, r3Var.f7798s);
                    }
                    r3Var.f7791l.putString("result_image_path", r3Var.f7792m);
                    r3Var.f7791l.putInt("result_image_source", 2);
                    android.app.Activity activity = com.tencent.mm.plugin.scanner.model.s.f159012m;
                    if (activity instanceof com.tencent.mm.ui.MMActivity) {
                        ((com.tencent.mm.ui.MMActivity) activity).mo133getLifecycle().a(new androidx.lifecycle.x(this) { // from class: com.tencent.mm.plugin.scanner.model.ExternRequestDealQBarStrHandler$2.1
                            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                            public void onDestroy() {
                                android.app.Activity activity2 = com.tencent.mm.plugin.scanner.model.s.f159012m;
                                if (activity2 == null) {
                                    return;
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.ExternRequestDealQBarStrHandler", "auto release for %s", activity2.getClass().getName());
                                com.tencent.mm.autogen.events.ReleaseDealQBarStrEvent releaseDealQBarStrEvent = new com.tencent.mm.autogen.events.ReleaseDealQBarStrEvent();
                                releaseDealQBarStrEvent.f54672g.f7446a = com.tencent.mm.plugin.scanner.model.s.f159012m;
                                releaseDealQBarStrEvent.e();
                            }
                        });
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ExternRequestDealQBarStrHandler", "request deal qbar, activity:%s, str:%s, codeType %d, codeVersion: %s, from : %d", com.tencent.mm.plugin.scanner.model.s.f159012m, com.tencent.mm.plugin.scanner.model.s.f159011i, java.lang.Integer.valueOf(r3Var.f7782c), java.lang.Integer.valueOf(r3Var.f7783d), java.lang.Integer.valueOf(r3Var.f7786g));
                    boolean b17 = com.tencent.mm.plugin.scanner.j1.b(r3Var.f7782c);
                    com.tencent.mm.plugin.scanner.model.s sVar = com.tencent.mm.plugin.scanner.model.s.this;
                    if (b17) {
                        e04.p pVar = new e04.p();
                        com.tencent.mm.plugin.scanner.model.s.f159013n = pVar;
                        pVar.A = r3Var.f7784e;
                        pVar.B = r3Var.f7789j;
                        pVar.C = r3Var.f7790k;
                        java.lang.String str = r3Var.f7785f;
                        android.os.Bundle bundle = r3Var.f7791l;
                        if (bundle != null && bundle.getString("stat_send_msg_user") != null) {
                            com.tencent.mm.plugin.scanner.model.s.f159013n.F = r3Var.f7791l.getString("stat_send_msg_user");
                        }
                        int i17 = r3Var.f7786g;
                        if (i17 < 0) {
                            i17 = 2;
                        }
                        int i18 = r3Var.f7788i;
                        if (i18 > 0) {
                            com.tencent.mm.plugin.scanner.model.s.f159013n.E = i18;
                        }
                        if (i17 == 3) {
                            com.tencent.mm.plugin.scanner.model.s.f159013n.D = r3Var.f7787h;
                        }
                        com.tencent.mm.plugin.scanner.model.s.f159013n.g(com.tencent.mm.plugin.scanner.model.s.f159012m, com.tencent.mm.plugin.scanner.model.s.f159011i, 0, i17, i18, "", r3Var.f7782c, r3Var.f7783d, sVar.f159015e, null, r3Var.f7791l, false, -1, false, scanIdentifyReportInfo, r3Var.f7795p);
                    } else {
                        e04.f fVar = new e04.f(scanIdentifyReportInfo);
                        sVar.f159014d = fVar;
                        android.app.Activity activity2 = com.tencent.mm.plugin.scanner.model.s.f159012m;
                        rz3.e eVar = sVar.f159015e;
                        int i19 = r3Var.f7782c;
                        java.lang.String str2 = com.tencent.mm.plugin.scanner.model.s.f159011i;
                        int i27 = r3Var.f7783d;
                        android.os.Bundle bundle2 = r3Var.f7791l;
                        r45.db0 db0Var = r3Var.f7795p;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                            fVar.f245898e = activity2;
                            fVar.f245899f = bundle2;
                            fVar.f245909s = eVar;
                            fVar.f245907q = false;
                            nz3.c.a(new oz3.e(0, 0, str2, i19, 0, db0Var != null ? db0Var.f372282e : null, scanIdentifyReportInfo, oz3.f.f350265e));
                            com.tencent.mm.plugin.scanner.model.f0 f0Var = new com.tencent.mm.plugin.scanner.model.f0(i19, str2, i27, 2, 0, (r45.im) null);
                            gm0.j1.d().a(1061, fVar);
                            gm0.j1.d().g(f0Var);
                            fVar.d(activity2.getString(com.tencent.mm.R.string.hq_), new e04.c(fVar, f0Var));
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ExternRequestDealQBarStrHandler", "event is null or not a DealQBarStrEvent instance");
                }
                return false;
            }
        };
        this.f159017g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CancelDealQBarStrEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.scanner.model.ExternRequestDealQBarStrHandler$3
            {
                this.__eventId = 1615476289;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CancelDealQBarStrEvent cancelDealQBarStrEvent) {
                com.tencent.mm.autogen.events.CancelDealQBarStrEvent cancelDealQBarStrEvent2 = cancelDealQBarStrEvent;
                if (cancelDealQBarStrEvent2 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ExternRequestDealQBarStrHandler", "event is null or not a CancelDealQBarStrEvent instance");
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ExternRequestDealQBarStrHandler", "cancel deal qbar, activity:%s, str:%s", com.tencent.mm.plugin.scanner.model.s.f159012m, com.tencent.mm.plugin.scanner.model.s.f159011i);
                am.p1 p1Var = cancelDealQBarStrEvent2.f54025g;
                if (p1Var.f7594b == com.tencent.mm.plugin.scanner.model.s.f159012m && p1Var.f7593a.equals(com.tencent.mm.plugin.scanner.model.s.f159011i)) {
                    com.tencent.mm.plugin.scanner.model.s.b();
                    return false;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.ExternRequestDealQBarStrHandler", "not same as string that are dealing");
                return false;
            }
        };
        this.f159018h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ReleaseDealQBarStrEvent>(a0Var) { // from class: com.tencent.mm.plugin.scanner.model.ExternRequestDealQBarStrHandler$4
            {
                this.__eventId = -1623890066;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ReleaseDealQBarStrEvent releaseDealQBarStrEvent) {
                com.tencent.mm.autogen.events.ReleaseDealQBarStrEvent releaseDealQBarStrEvent2 = releaseDealQBarStrEvent;
                if (releaseDealQBarStrEvent2 == null) {
                    return false;
                }
                am.nq nqVar = releaseDealQBarStrEvent2.f54672g;
                if (nqVar.f7446a != com.tencent.mm.plugin.scanner.model.s.f159012m) {
                    return false;
                }
                com.tencent.mm.plugin.scanner.model.s.f159012m = null;
                e04.p pVar = com.tencent.mm.plugin.scanner.model.s.f159013n;
                if (pVar != null && pVar.j() == nqVar.f7446a) {
                    e04.p pVar2 = com.tencent.mm.plugin.scanner.model.s.f159013n;
                    java.lang.ref.WeakReference weakReference = pVar2.f246043d;
                    if (weakReference != null) {
                        weakReference.clear();
                        pVar2.f246043d = null;
                    }
                    android.app.ProgressDialog progressDialog = pVar2.f246058v;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    pVar2.f246058v = null;
                }
                e04.f fVar = com.tencent.mm.plugin.scanner.model.s.this.f159014d;
                if (fVar == null || fVar.f245898e != nqVar.f7446a) {
                    return false;
                }
                fVar.f245898e = null;
                android.app.ProgressDialog progressDialog2 = fVar.f245897d;
                if (progressDialog2 != null) {
                    progressDialog2.dismiss();
                }
                fVar.f245897d = null;
                return false;
            }
        };
    }

    public static void b() {
        e04.p pVar = f159013n;
        if (pVar != null) {
            pVar.d();
            f159013n = null;
        }
        f159012m = null;
        f159011i = null;
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (iEvent instanceof com.tencent.mm.autogen.events.DealQBarStrEvent) {
            return this.f159016f.callback((com.tencent.mm.autogen.events.DealQBarStrEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.CancelDealQBarStrEvent) {
            return this.f159017g.callback((com.tencent.mm.autogen.events.CancelDealQBarStrEvent) iEvent);
        }
        if (iEvent instanceof com.tencent.mm.autogen.events.ReleaseDealQBarStrEvent) {
            return this.f159018h.callback((com.tencent.mm.autogen.events.ReleaseDealQBarStrEvent) iEvent);
        }
        return false;
    }
}
