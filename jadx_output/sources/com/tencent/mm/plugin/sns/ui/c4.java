package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class c4 implements com.tencent.mm.modelbase.u0 {
    public final com.tencent.mm.sdk.event.IListener C;
    public final com.tencent.mm.sdk.event.IListener D;
    public final com.tencent.mm.sdk.event.IListener E;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f168087d;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.n4 f168090g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f168092i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f168093m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f168094n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f168095o;

    /* renamed from: p, reason: collision with root package name */
    public r45.jj4 f168096p;

    /* renamed from: q, reason: collision with root package name */
    public long f168097q;

    /* renamed from: u, reason: collision with root package name */
    public final int f168101u;

    /* renamed from: x, reason: collision with root package name */
    public final kd0.p2 f168104x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.e3 f168105y;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.data.SnsCmdList f168088e = new com.tencent.mm.plugin.sns.data.SnsCmdList();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f168089f = null;

    /* renamed from: h, reason: collision with root package name */
    public wd4.l1 f168091h = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f168098r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f168099s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f168100t = false;

    /* renamed from: v, reason: collision with root package name */
    public java.util.ArrayList f168102v = new java.util.ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ImageQBarDataBean f168103w = null;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f168106z = new java.util.ArrayList();
    public final java.util.ArrayList A = new java.util.ArrayList();
    public final n34.m3 B = new n34.m3();

    public c4(android.content.Context context, com.tencent.mm.plugin.sns.ui.n4 n4Var, int i17) {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.C = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11
            {
                this.__eventId = 812146647;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = recogQBarOfImageFileResultEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                com.tencent.mm.plugin.sns.ui.c4 c4Var = com.tencent.mm.plugin.sns.ui.c4.this;
                if (com.tencent.mm.plugin.sns.ui.c4.a(c4Var) == null || com.tencent.mm.plugin.sns.ui.c4.b(c4Var) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GalleryTitleManager", "not in recoging");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                } else if (recogQBarOfImageFileResultEvent2 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GalleryTitleManager", "receive invalid callbak");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                } else if (recogQBarOfImageFileResultEvent2.f54661g.f6368a.equals(com.tencent.mm.plugin.sns.ui.c4.b(c4Var))) {
                    java.util.ArrayList a17 = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a.a(recogQBarOfImageFileResultEvent2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    c4Var.f168102v = a17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "recog result: " + com.tencent.mm.plugin.sns.ui.c4.d(c4Var).size());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    c4Var.f168090g.C2(com.tencent.mm.plugin.sns.ui.c4.b(c4Var), com.tencent.mm.plugin.sns.ui.c4.d(c4Var));
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(com.tencent.mm.plugin.sns.ui.c4.d(c4Var))) {
                        com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) com.tencent.mm.plugin.sns.ui.c4.d(c4Var).get(0);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        c4Var.f168103w = imageQBarDataBean;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        if (com.tencent.mm.plugin.sns.ui.c4.c(c4Var) != null && com.tencent.mm.plugin.sns.ui.c4.a(c4Var) != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                            c4Var.f168100t = true;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                            ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) com.tencent.mm.plugin.sns.ui.c4.a(c4Var).e()).h(com.tencent.mm.plugin.sns.ui.c4.c(c4Var).f158620e, com.tencent.mm.plugin.sns.ui.c4.c(c4Var).f158619d);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        boolean z17 = c4Var.f168093m;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = c4Var.f168094n;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        r45.jj4 jj4Var = c4Var.f168096p;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        c4Var.l(z17, snsInfo, jj4Var, 2, null, 0);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    c4Var.f168092i = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GalleryTitleManager", "not same filepath");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                return false;
            }
        };
        this.D = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12
            {
                this.__eventId = 1700407223;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent2 = recogQBarOfImageFileFailedEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                com.tencent.mm.plugin.sns.ui.c4 c4Var = com.tencent.mm.plugin.sns.ui.c4.this;
                if (com.tencent.mm.plugin.sns.ui.c4.a(c4Var) == null || com.tencent.mm.plugin.sns.ui.c4.b(c4Var) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GalleryTitleManager", "not in recoging");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                } else if (recogQBarOfImageFileFailedEvent2.f54660g.f6278a.equals(com.tencent.mm.plugin.sns.ui.c4.b(c4Var))) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    c4Var.f168090g.C2(com.tencent.mm.plugin.sns.ui.c4.b(c4Var), null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    c4Var.f168092i = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GalleryTitleManager", "not same filepath");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                return false;
            }
        };
        this.E = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.GalleryTitleManager$13
            {
                this.__eventId = 1280295539;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$13");
                com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent2 = notifyDealQBarStrResultEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$13");
                if (notifyDealQBarStrResultEvent2 != null) {
                    am.kl klVar = notifyDealQBarStrResultEvent2.f54539g;
                    com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "notify Event: %d", java.lang.Integer.valueOf(klVar.f7168c));
                    android.app.Activity activity = klVar.f7167b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    com.tencent.mm.plugin.sns.ui.c4 c4Var = com.tencent.mm.plugin.sns.ui.c4.this;
                    android.content.Context context2 = c4Var.f168087d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    if (activity == ((android.app.Activity) context2) && com.tencent.mm.plugin.sns.ui.c4.c(c4Var) != null && klVar.f7166a.equals(com.tencent.mm.plugin.sns.ui.c4.c(c4Var).f158619d)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$13");
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GalleryTitleManager", "not the same");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$13");
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GalleryTitleManager", "event is null or not a instant of NotifyDealQBarStrResultEvent");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$13");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$13");
                return false;
            }
        };
        this.f168087d = context;
        this.f168101u = i17;
        this.f168090g = n4Var;
        ((android.app.Activity) context).getIntent().getStringExtra("sns_gallery_pre_title");
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        com.tencent.mm.plugin.sns.ui.e4 e4Var = new com.tencent.mm.plugin.sns.ui.e4(this);
        ((jd0.q2) x2Var).getClass();
        this.f168104x = new com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic(context, e4Var);
    }

    public static /* synthetic */ wd4.l1 a(com.tencent.mm.plugin.sns.ui.c4 c4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        wd4.l1 l1Var = c4Var.f168091h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return l1Var;
    }

    public static /* synthetic */ java.lang.String b(com.tencent.mm.plugin.sns.ui.c4 c4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        java.lang.String str = c4Var.f168092i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return str;
    }

    public static /* synthetic */ com.tencent.mm.plugin.scanner.ImageQBarDataBean c(com.tencent.mm.plugin.sns.ui.c4 c4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = c4Var.f168103w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return imageQBarDataBean;
    }

    public static /* synthetic */ java.util.ArrayList d(com.tencent.mm.plugin.sns.ui.c4 c4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        java.util.ArrayList arrayList = c4Var.f168102v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return arrayList;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.e3 e(com.tencent.mm.plugin.sns.ui.c4 c4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.e3 e3Var = c4Var.f168105y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return e3Var;
    }

    public void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("backClick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_cmd_list", h());
        android.content.Context context = this.f168087d;
        ((android.app.Activity) context).setResult(-1, intent);
        ((android.app.Activity) context).finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("backClick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
    }

    public void g(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealWithDelSns", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        if (snsInfo.isWaitPost() || snsInfo.isDieItem()) {
            com.tencent.mm.plugin.sns.model.l4.Fj().L0(snsInfo.localid);
            h().a(snsInfo.localid);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealWithDelSns", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        boolean z17 = false;
        if (gm0.j1.a()) {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
            if (r17 == 1) {
                z17 = true;
            } else if (r17 != 2) {
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        }
        if (z17) {
            com.tencent.wechat.aff.sns.h.f217503b.a(snsInfo.field_snsId, new com.tencent.mm.plugin.sns.ui.k4(this));
        }
        com.tencent.mm.plugin.sns.model.l4.xj().c(snsInfo.field_snsId);
        com.tencent.mm.plugin.sns.model.q2 q2Var = new com.tencent.mm.plugin.sns.model.q2(snsInfo.field_snsId, 1);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(q2Var);
        android.content.Context context = this.f168087d;
        this.f168089f = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), this.f168087d.getString(com.tencent.mm.R.string.j9z), true, true, new com.tencent.mm.plugin.sns.ui.l4(this, q2Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealWithDelSns", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
    }

    public com.tencent.mm.plugin.sns.data.SnsCmdList h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCmdList", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCmdList", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return this.f168088e;
    }

    public final java.lang.String i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        r45.jj4 jj4Var = this.f168096p;
        if (jj4Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "getMediaPath, mediaObj is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f168094n;
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "getMediaPath, snsInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            return null;
        }
        java.lang.String c17 = wd4.x0.c(wd4.x0.e(snsInfo), jj4Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return c17;
    }

    public void j(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gotoPhotoEditUI", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        if (com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "gotoPhotoEditUI: ");
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(str, "");
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo();
            videoCaptureReportInfo.f155690d = -1;
            b17.I = videoCaptureReportInfo;
            fu3.e.f266880a.b(b17);
            ut3.m.f431182a.f(this.f168087d, 0, com.tencent.mm.R.anim.f477876e0, -1, b17, 1, 2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoPhotoEditUI", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
    }

    public final void k(java.util.ArrayList arrayList, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("myMenuItem", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        if (this.f168093m) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_GROUP_INT_SYNC, 0);
            if (r17 == 0) {
                z17 = cc4.a.f40481a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
            } else if (r17 != 2) {
                if (cc4.a.f40481a) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl false");
                    cc4.a.f40481a = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                z17 = false;
            } else {
                if (!cc4.a.f40481a) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl true");
                    cc4.a.f40481a = true;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                z17 = true;
            }
            if (z17) {
                if (snsInfo.field_snsId != 0) {
                    arrayList.add(1015);
                }
            } else if (snsInfo.getLocalPrivate() <= 0) {
                arrayList.add(1000);
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.sns.model.l4.sj()) && com.tencent.mm.plugin.sns.model.l4.sj().equals(snsInfo.getUserName())) {
                arrayList.add(1005);
            }
            this.B.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isStarFeed", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
            kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
            boolean z18 = com.tencent.mm.plugin.sns.model.s5.f(com.tencent.mm.plugin.sns.storage.l1.a(snsInfo.getSnsId())).InTopList == 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isStarFeed", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
            cc4.b bVar = cc4.b.f40482a;
            if (z18) {
                if (bVar.a()) {
                    arrayList.add(1018);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "isStarFeed >> %s", snsInfo.getSnsId());
                }
            } else if (bVar.b()) {
                arrayList.add(1017);
                com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "no isStarFeed >> %s", snsInfo.getSnsId());
            }
            arrayList.add(-1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("myMenuItem", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
    }

    public void l(boolean z17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.jj4 jj4Var, int i17, android.view.View view, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showInGallery", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        m(z17, snsInfo, jj4Var, this.f168098r, this.f168099s, i17, view, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showInGallery", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(boolean r26, com.tencent.mm.plugin.sns.storage.SnsInfo r27, r45.jj4 r28, boolean r29, boolean r30, int r31, android.view.View r32, int r33) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.c4.m(boolean, com.tencent.mm.plugin.sns.storage.SnsInfo, r45.jj4, boolean, boolean, int, android.view.View, int):void");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        if (i17 != 0 || i18 != 0 || m1Var == null || !(m1Var instanceof com.tencent.mm.plugin.sns.model.q2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " type = " + m1Var.getType() + " @" + hashCode());
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f168089f;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.plugin.sns.model.q2 q2Var = (com.tencent.mm.plugin.sns.model.q2) m1Var;
        int L = q2Var.L();
        com.tencent.mm.plugin.sns.ui.n4 n4Var = this.f168090g;
        if (L == -1) {
            n4Var.s3(true, "", q2Var.L());
        } else if (L == 1) {
            h().a(q2Var.K());
            n4Var.s3(true, com.tencent.mm.plugin.sns.storage.w2.i("sns_table_", q2Var.K()), q2Var.L());
        } else if (L == 2) {
            com.tencent.mm.plugin.sns.data.SnsCmdList h17 = h();
            int K = q2Var.K();
            h17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addChangeItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            ((java.util.LinkedList) h17.f164022g).add(java.lang.Integer.valueOf(K));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addChangeItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            n4Var.s3(true, "", q2Var.L());
        } else if (L == 3) {
            com.tencent.mm.plugin.sns.data.SnsCmdList h18 = h();
            int K2 = q2Var.K();
            h18.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addChangeItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            ((java.util.LinkedList) h18.f164022g).add(java.lang.Integer.valueOf(K2));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addChangeItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            n4Var.s3(true, com.tencent.mm.plugin.sns.storage.w2.i("sns_table_", q2Var.K()), q2Var.L());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
    }
}
