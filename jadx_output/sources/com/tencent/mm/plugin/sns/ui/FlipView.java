package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public abstract class FlipView extends android.widget.LinearLayout implements com.tencent.mm.plugin.sns.model.h0 {
    public static final /* synthetic */ int U = 0;
    public java.util.ArrayList A;
    public com.tencent.mm.plugin.scanner.ImageQBarDataBean B;
    public com.tencent.mm.storage.s7 C;
    public int D;
    public com.tencent.mm.plugin.sns.ui.e3 E;
    public android.view.View.OnLongClickListener F;
    public com.tencent.mm.plugin.sns.ui.f3 G;
    public java.lang.Long H;
    public java.lang.Long I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.Long f166275J;
    public final com.tencent.mm.plugin.sns.ui.a3 K;
    public final com.tencent.mm.sdk.event.IListener L;
    public final com.tencent.mm.sdk.event.IListener M;
    public final com.tencent.mm.sdk.event.IListener N;
    public java.lang.String P;
    public r45.jj4 Q;
    public java.util.List R;
    public java.util.List S;
    public java.util.List T;

    /* renamed from: d, reason: collision with root package name */
    public double f166276d;

    /* renamed from: e, reason: collision with root package name */
    public double f166277e;

    /* renamed from: f, reason: collision with root package name */
    public long f166278f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.s4 f166279g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.n4 f166280h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f166281i;

    /* renamed from: m, reason: collision with root package name */
    public int f166282m;

    /* renamed from: n, reason: collision with root package name */
    public android.content.Context f166283n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f166284o;

    /* renamed from: p, reason: collision with root package name */
    public long f166285p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f166286q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f166287r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f166288s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f166289t;

    /* renamed from: u, reason: collision with root package name */
    public wd4.l1 f166290u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f166291v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f166292w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f166293x;

    /* renamed from: y, reason: collision with root package name */
    public r45.jj4 f166294y;

    /* renamed from: z, reason: collision with root package name */
    public long f166295z;

    public FlipView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166276d = 0.0d;
        this.f166277e = 0.0d;
        this.f166278f = 0L;
        this.f166284o = false;
        this.f166285p = 0L;
        this.f166287r = false;
        this.f166288s = false;
        this.f166289t = false;
        this.A = new java.util.ArrayList();
        this.B = null;
        this.C = com.tencent.mm.storage.s7.f195307k;
        this.D = 0;
        this.H = 0L;
        this.I = 0L;
        this.f166275J = 0L;
        this.K = new com.tencent.mm.plugin.sns.ui.a3(this);
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.L = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.FlipView.5
            {
                this.__eventId = 812146647;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
                java.lang.String str;
                java.lang.String str2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$5");
                com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = recogQBarOfImageFileResultEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$5");
                int i17 = com.tencent.mm.plugin.sns.ui.FlipView.U;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.FlipView");
                com.tencent.mm.plugin.sns.ui.FlipView flipView = com.tencent.mm.plugin.sns.ui.FlipView.this;
                boolean z17 = flipView.f166287r;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "no need to scan image");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$5");
                } else if (com.tencent.mm.plugin.sns.ui.FlipView.a(flipView) == null || com.tencent.mm.plugin.sns.ui.FlipView.b(flipView) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "not in recoging");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$5");
                } else if (recogQBarOfImageFileResultEvent2 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "receive invalid callbak");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$5");
                } else if (recogQBarOfImageFileResultEvent2.f54661g.f6368a.equals(com.tencent.mm.plugin.sns.ui.FlipView.b(flipView))) {
                    flipView.H = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.FlipView");
                    java.lang.Long l17 = flipView.f166275J;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.FlipView");
                    flipView.I = java.lang.Long.valueOf(currentTimeMillis - l17.longValue());
                    flipView.A = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a.a(recogQBarOfImageFileResultEvent2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "recog result: " + flipView.A.size());
                    com.tencent.mm.plugin.sns.ui.FlipView.c(flipView, com.tencent.mm.plugin.sns.ui.FlipView.b(flipView), flipView.A);
                    if (com.tencent.mm.sdk.platformtools.t8.L0(flipView.A)) {
                        str = "com.tencent.mm.plugin.sns.ui.FlipView";
                    } else {
                        if (com.tencent.mm.plugin.sns.ui.FlipView.a(flipView) != null) {
                            wd4.l1 a17 = com.tencent.mm.plugin.sns.ui.FlipView.a(flipView);
                            android.view.View currentImageView = flipView.getCurrentImageView();
                            java.util.ArrayList imageQBarDataList = flipView.A;
                            com.tencent.mm.plugin.sns.storage.SnsInfo d17 = com.tencent.mm.plugin.sns.ui.FlipView.d(flipView);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fetchCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
                            kotlin.jvm.internal.o.g(a17, "<this>");
                            kotlin.jvm.internal.o.g(imageQBarDataList, "imageQBarDataList");
                            com.tencent.mm.plugin.scanner.ImageQBarDataBean b17 = wd4.r0.b(a17, currentImageView, imageQBarDataList);
                            if (b17 != null) {
                                java.lang.String str3 = b17.f158619d;
                                kd0.f2 f2Var = new kd0.f2(str3);
                                if (d17 != null) {
                                    java.lang.String userName = d17.getUserName();
                                    str2 = "com.tencent.mm.plugin.sns.ui.FlipView";
                                    java.lang.String valueOf = java.lang.String.valueOf(d17.field_snsId);
                                    kd0.f2 f2Var2 = new kd0.f2(str3);
                                    f2Var2.f306635b = 3;
                                    f2Var2.f306636c = userName;
                                    f2Var2.f306637d = valueOf;
                                    f2Var = f2Var2;
                                } else {
                                    str2 = "com.tencent.mm.plugin.sns.ui.FlipView";
                                }
                                ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) a17.e()).k(b17.f158620e, f2Var, new wd4.p0(a17, currentImageView, imageQBarDataList));
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
                            } else {
                                str2 = "com.tencent.mm.plugin.sns.ui.FlipView";
                                int size = imageQBarDataList.size();
                                if (size == 1) {
                                    java.lang.Object obj = imageQBarDataList.get(0);
                                    kotlin.jvm.internal.o.f(obj, "get(...)");
                                    com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) obj;
                                    kd0.p2 e17 = a17.e();
                                    java.lang.String str4 = imageQBarDataBean.f158619d;
                                    kd0.f2 f2Var3 = new kd0.f2(str4);
                                    if (d17 != null) {
                                        java.lang.String userName2 = d17.getUserName();
                                        java.lang.String valueOf2 = java.lang.String.valueOf(d17.field_snsId);
                                        f2Var3 = new kd0.f2(str4);
                                        f2Var3.f306635b = 3;
                                        f2Var3.f306636c = userName2;
                                        f2Var3.f306637d = valueOf2;
                                    }
                                    ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) e17).k(imageQBarDataBean.f158620e, f2Var3, new wd4.q0(a17, currentImageView, imageQBarDataList));
                                } else if (size > 1 && a17.d().i()) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                                    a17.f444956e = true;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                                    wd4.r0.a(a17, currentImageView, imageQBarDataList);
                                    a17.m();
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
                            }
                        } else {
                            str2 = "com.tencent.mm.plugin.sns.ui.FlipView";
                        }
                        str = str2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", str);
                        r45.jj4 jj4Var = flipView.f166294y;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", str);
                        java.lang.String b18 = com.tencent.mm.plugin.sns.ui.FlipView.b(flipView);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", str);
                        java.lang.String str5 = flipView.f166292w;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", str);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", str);
                        java.lang.String str6 = flipView.f166293x;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", str);
                        flipView.x(jj4Var, b18, str5, str6, 2);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", str);
                    flipView.f166291v = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$5");
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "not same filepath");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$5");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$5");
                return false;
            }
        };
        this.M = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.FlipView.6
            {
                this.__eventId = 1700407223;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent2 = recogQBarOfImageFileFailedEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                int i17 = com.tencent.mm.plugin.sns.ui.FlipView.U;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.FlipView");
                com.tencent.mm.plugin.sns.ui.FlipView flipView = com.tencent.mm.plugin.sns.ui.FlipView.this;
                boolean z17 = flipView.f166287r;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "no need to scan image");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                } else if (com.tencent.mm.plugin.sns.ui.FlipView.a(flipView) == null || com.tencent.mm.plugin.sns.ui.FlipView.b(flipView) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "not in recoging");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                } else if (recogQBarOfImageFileFailedEvent2.f54660g.f6278a.equals(com.tencent.mm.plugin.sns.ui.FlipView.b(flipView))) {
                    am.bq bqVar = recogQBarOfImageFileFailedEvent2.f54660g;
                    if (bqVar.f6280c && bqVar.f6279b == 2) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.FlipView");
                        r45.jj4 jj4Var = flipView.f166294y;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.FlipView");
                        java.lang.String b17 = com.tencent.mm.plugin.sns.ui.FlipView.b(flipView);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.FlipView");
                        java.lang.String str = flipView.f166292w;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.FlipView");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.FlipView");
                        java.lang.String str2 = flipView.f166293x;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.FlipView");
                        flipView.x(jj4Var, b17, str, str2, 3);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                    } else {
                        com.tencent.mm.plugin.sns.ui.FlipView.c(flipView, com.tencent.mm.plugin.sns.ui.FlipView.b(flipView), null);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.FlipView");
                        flipView.f166291v = null;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.FlipView");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "not same filepath");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                return false;
            }
        };
        this.N = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.FlipView.7
            {
                this.__eventId = 1280295539;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent) {
                com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$7");
                com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent2 = notifyDealQBarStrResultEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$7");
                int i17 = com.tencent.mm.plugin.sns.ui.FlipView.U;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.FlipView");
                com.tencent.mm.plugin.sns.ui.FlipView flipView = com.tencent.mm.plugin.sns.ui.FlipView.this;
                boolean z17 = flipView.f166287r;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "no need to scan image");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$7");
                } else if (notifyDealQBarStrResultEvent2 != null) {
                    am.kl klVar = notifyDealQBarStrResultEvent2.f54539g;
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "notify Event: %d", java.lang.Integer.valueOf(klVar.f7168c));
                    android.app.Activity activity = klVar.f7167b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.FlipView");
                    android.content.Context context2 = flipView.f166283n;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.FlipView");
                    if (activity == ((android.app.Activity) context2) && (imageQBarDataBean = flipView.B) != null && klVar.f7166a.equals(imageQBarDataBean.f158619d)) {
                        if (klVar.f7168c == 3) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.FlipView");
                            android.content.Context context3 = flipView.f166283n;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.FlipView");
                            ((android.app.Activity) context3).finish();
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$7");
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "not the same");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$7");
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "event is null or not a instant of NotifyDealQBarStrResultEvent");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$7");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$7");
                return false;
            }
        };
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        p(context);
    }

    public static /* synthetic */ wd4.l1 a(com.tencent.mm.plugin.sns.ui.FlipView flipView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.FlipView");
        wd4.l1 l1Var = flipView.f166290u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.FlipView");
        return l1Var;
    }

    public static /* synthetic */ java.lang.String b(com.tencent.mm.plugin.sns.ui.FlipView flipView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.FlipView");
        java.lang.String str = flipView.f166291v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.FlipView");
        return str;
    }

    public static void c(final com.tencent.mm.plugin.sns.ui.FlipView flipView, final java.lang.String str, final java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.FlipView");
        flipView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchCodeScanned", "com.tencent.mm.plugin.sns.ui.FlipView");
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.FlipView$$g
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.tencent.mm.plugin.sns.ui.FlipView.U;
                com.tencent.mm.plugin.sns.ui.FlipView flipView2 = com.tencent.mm.plugin.sns.ui.FlipView.this;
                flipView2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$dispatchCodeScanned$5", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (flipView2.R == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$dispatchCodeScanned$5", "com.tencent.mm.plugin.sns.ui.FlipView");
                    return;
                }
                java.util.Iterator it = new java.util.ArrayList(flipView2.R).iterator();
                while (it.hasNext()) {
                    wd4.b0 b0Var = (wd4.b0) ((com.tencent.mm.plugin.sns.ui.d3) it.next());
                    b0Var.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$scanCodeListener$1");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCodeScanned, mediaPath: ");
                    java.lang.String str2 = str;
                    sb6.append(str2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials_FlipView", sb6.toString());
                    if (kotlin.jvm.internal.o.b(str2, b0Var.f444865a)) {
                        ((yz5.l) b0Var.f444866b.f310123d).invoke(java.lang.Boolean.valueOf(((zh1.p) b0Var.f444867c).wi(list)));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$scanCodeListener$1");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$scanCodeListener$1");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$dispatchCodeScanned$5", "com.tencent.mm.plugin.sns.ui.FlipView");
            }
        };
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            runnable.run();
        }
        ((ku5.t0) ku5.t0.f312615d).B(runnable);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchCodeScanned", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo d(com.tencent.mm.plugin.sns.ui.FlipView flipView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = flipView.getSnsInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.FlipView");
        return snsInfo;
    }

    private java.lang.String getMediaPath() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.FlipView");
        java.lang.String b17 = wd4.x0.b(this.P, this.Q);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.FlipView");
        return b17;
    }

    private com.tencent.mm.plugin.scanner.ImageQBarDataBean getQBarDataOnCurrentDisplay() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQBarDataOnCurrentDisplay", "com.tencent.mm.plugin.sns.ui.FlipView");
        java.lang.Object obj = com.tencent.mm.plugin.scanner.c0.a(this.f166283n, getCurrentImageView(), this.A, 0).f302833d;
        com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = ((java.util.ArrayList) obj).size() == 1 ? (com.tencent.mm.plugin.scanner.ImageQBarDataBean) ((java.util.ArrayList) obj).get(0) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQBarDataOnCurrentDisplay", "com.tencent.mm.plugin.sns.ui.FlipView");
        return imageQBarDataBean;
    }

    private com.tencent.mm.plugin.sns.storage.SnsInfo getSnsInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.FlipView");
        if (this instanceof com.tencent.mm.plugin.sns.ui.SnsInfoFlip) {
            if (((com.tencent.mm.plugin.sns.ui.SnsInfoFlip) this).getFromScene().f195312a.equals(com.tencent.mm.storage.s7.f195299c.f195312a)) {
                com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f166292w);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.FlipView");
                return k17;
            }
            java.lang.String str = this.f166292w;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "getFetchCodeInfoParam of SnsInfoFlip, getSnsInfo failed: ".concat(str));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.FlipView");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m(java.lang.String r12, android.content.Context r13) {
        /*
            java.lang.String r0 = "MicroMsg.FlipView"
            java.lang.String r1 = "getImagePath"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.FlipView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 0
            if (r12 == 0) goto Lbb
            java.lang.String r4 = ""
            boolean r5 = r12.equals(r4)
            if (r5 != 0) goto Lbb
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = lp0.b.m()
            r5.append(r6)
            int r6 = r12.hashCode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "jpg"
            java.lang.String r8 = "image"
            java.lang.Object[] r6 = new java.lang.Object[]{r8, r6, r7}
            java.lang.String r7 = "%s%d.%s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.mm.vfs.r6 r6 = new com.tencent.mm.vfs.r6
            android.content.Context r7 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.io.File r7 = r7.getCacheDir()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "tmp"
            r8.<init>(r9)
            long r9 = java.lang.System.currentTimeMillis()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r6.<init>(r7, r8)
            java.lang.String r6 = r6.o()
            r7 = 0
            long r8 = com.tencent.mm.vfs.w6.d(r12, r6, r7)
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L70
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        L70:
            boolean r8 = com.tencent.mm.sdk.platformtools.MMNativeJpeg.isProgressive(r6)
            if (r8 == 0) goto La5
            android.graphics.Bitmap r8 = com.tencent.mm.sdk.platformtools.MMNativeJpeg.decodeAsBitmap(r6)     // Catch: java.lang.Throwable -> L8b java.lang.OutOfMemoryError -> L8d java.io.FileNotFoundException -> L94
            if (r8 == 0) goto L86
            com.tencent.mm.plugin.sns.ui.z2 r9 = new com.tencent.mm.plugin.sns.ui.z2     // Catch: java.lang.Throwable -> L8b java.lang.OutOfMemoryError -> L8d java.io.FileNotFoundException -> L94
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L8b java.lang.OutOfMemoryError -> L8d java.io.FileNotFoundException -> L94
            com.tencent.mm.sdk.platformtools.x.o0(r5, r9)     // Catch: java.lang.Throwable -> L8b java.lang.OutOfMemoryError -> L8d java.io.FileNotFoundException -> L94
            r0 = 1
            goto L87
        L86:
            r0 = r7
        L87:
            com.tencent.mm.vfs.w6.h(r6)
            goto La6
        L8b:
            r12 = move-exception
            goto L9e
        L8d:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L8b
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r8, r4, r9)     // Catch: java.lang.Throwable -> L8b
            goto L9a
        L94:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L8b
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r8, r4, r9)     // Catch: java.lang.Throwable -> L8b
        L9a:
            com.tencent.mm.vfs.w6.h(r6)
            goto La5
        L9e:
            com.tencent.mm.vfs.w6.h(r6)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r12
        La5:
            r0 = r7
        La6:
            if (r0 != 0) goto Lb4
            long r6 = com.tencent.mm.vfs.w6.d(r12, r5, r7)
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 >= 0) goto Lb4
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        Lb4:
            q75.c.f(r5, r13)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r5
        Lbb:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.FlipView.m(java.lang.String, android.content.Context):java.lang.String");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.FlipView");
        if (motionEvent.getAction() == 0) {
            this.f166276d = motionEvent.getX();
            this.f166277e = motionEvent.getY();
            this.f166278f = java.lang.System.currentTimeMillis();
            if (motionEvent.getPointerCount() == 1) {
                this.f166284o = false;
            }
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f166284o = true;
        }
        if (motionEvent.getAction() == 1 && !this.f166284o) {
            java.lang.System.currentTimeMillis();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j17 = elapsedRealtime - this.f166285p;
            com.tencent.mm.plugin.sns.ui.a3 a3Var = this.K;
            if (j17 < 300) {
                this.f166281i.removeCallbacks(a3Var);
                this.f166281i.post(new com.tencent.mm.plugin.sns.ui.w2(this));
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.FlipView");
                return dispatchTouchEvent;
            }
            this.f166285p = elapsedRealtime;
            if (java.lang.System.currentTimeMillis() - this.f166278f < 500 && java.lang.Math.abs(motionEvent.getX() - this.f166276d) <= 10.0d && java.lang.Math.abs(motionEvent.getY() - this.f166277e) <= 10.0d && motionEvent.getY() > 110.0f && motionEvent.getY() < this.f166282m - 100) {
                float x17 = motionEvent.getX();
                float y17 = motionEvent.getY();
                a3Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setXY", "com.tencent.mm.plugin.sns.ui.FlipView$ClickRunnable");
                a3Var.f167721d = x17;
                a3Var.f167722e = y17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setXY", "com.tencent.mm.plugin.sns.ui.FlipView$ClickRunnable");
                this.f166281i.postDelayed(a3Var, 10L);
            }
        }
        boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.FlipView");
        return dispatchTouchEvent2;
    }

    public void e(com.tencent.mm.plugin.sns.ui.c3 c3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addMediaChangeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        if (this.T == null) {
            this.T = new java.util.ArrayList();
        }
        this.T.add(c3Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addMediaChangeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public final void f(java.util.List list, java.util.List list2, java.util.List list3, final r45.jj4 jj4Var, final com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealSheetInternal", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f166290u.n(list, list2, new com.tencent.mm.plugin.sns.ui.FlipView$$b());
        this.f166290u.k(new yz5.a() { // from class: com.tencent.mm.plugin.sns.ui.FlipView$$c
            @Override // yz5.a
            public final java.lang.Object invoke() {
                int i18 = com.tencent.mm.plugin.sns.ui.FlipView.U;
                com.tencent.mm.plugin.sns.ui.FlipView flipView = com.tencent.mm.plugin.sns.ui.FlipView.this;
                flipView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$dealSheetInternal$1", "com.tencent.mm.plugin.sns.ui.FlipView");
                com.tencent.mm.plugin.sns.ui.e3 e3Var = flipView.E;
                if (e3Var != null) {
                    e3Var.b();
                }
                com.tencent.mm.autogen.events.CancelRecogImageFileEvent cancelRecogImageFileEvent = new com.tencent.mm.autogen.events.CancelRecogImageFileEvent();
                cancelRecogImageFileEvent.f54026g.f7686a = flipView.f166295z;
                cancelRecogImageFileEvent.e();
                flipView.f166290u = null;
                flipView.f166291v = null;
                flipView.f166292w = "";
                flipView.f166293x = null;
                flipView.f166294y = null;
                flipView.B = null;
                flipView.A.clear();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$dealSheetInternal$1", "com.tencent.mm.plugin.sns.ui.FlipView");
                return null;
            }
        });
        this.f166290u.j(new db5.t4() { // from class: com.tencent.mm.plugin.sns.ui.FlipView$$d
            @Override // db5.t4
            public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                int i19 = com.tencent.mm.plugin.sns.ui.FlipView.U;
                com.tencent.mm.plugin.sns.ui.FlipView flipView = com.tencent.mm.plugin.sns.ui.FlipView.this;
                flipView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$dealSheetInternal$2", "com.tencent.mm.plugin.sns.ui.FlipView");
                boolean w17 = flipView.w();
                java.lang.String str4 = str3;
                r45.jj4 jj4Var2 = jj4Var;
                if (w17) {
                    flipView.j(snsInfo, str4, menuItem, jj4Var2);
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doFootSheetClick", "com.tencent.mm.plugin.sns.ui.FlipView");
                    flipView.j(com.tencent.mm.plugin.sns.model.l4.Fj().k1(str2), str4, menuItem, jj4Var2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFootSheetClick", "com.tencent.mm.plugin.sns.ui.FlipView");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$dealSheetInternal$2", "com.tencent.mm.plugin.sns.ui.FlipView");
            }
        });
        this.f166290u.l(new db5.t4() { // from class: com.tencent.mm.plugin.sns.ui.FlipView$$e
            @Override // db5.t4
            public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                r45.jj4 jj4Var2 = jj4Var;
                java.lang.String str4 = str2;
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = snsInfo;
                java.lang.String str5 = str;
                java.lang.String str6 = str3;
                int i19 = com.tencent.mm.plugin.sns.ui.FlipView.U;
                com.tencent.mm.plugin.sns.ui.FlipView flipView = com.tencent.mm.plugin.sns.ui.FlipView.this;
                flipView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$dealSheetInternal$3", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (flipView.w()) {
                    flipView.t(jj4Var2, menuItem, str4, snsInfo2, str5, str6);
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemSelected", "com.tencent.mm.plugin.sns.ui.FlipView");
                    flipView.t(jj4Var2, menuItem, str4, com.tencent.mm.plugin.sns.model.l4.Fj().k1(str4), str5, str6);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemSelected", "com.tencent.mm.plugin.sns.ui.FlipView");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$dealSheetInternal$3", "com.tencent.mm.plugin.sns.ui.FlipView");
            }
        });
        this.f166290u.m();
        com.tencent.mm.plugin.sns.ui.e3 e3Var = this.E;
        if (e3Var != null) {
            e3Var.a(list3);
        }
        if (this.f166287r && i17 != 2) {
            gm0.j1.i();
            if (gm0.j1.n().f273288b.n() != 0) {
                this.f166291v = str;
                this.f166292w = str2;
                this.f166293x = str3;
                this.f166294y = jj4Var;
                this.f166295z = java.lang.System.currentTimeMillis();
                this.f166275J = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                je4.d.a(this.f166283n, this.f166295z, getCurrentImageView(), str, i17 == 3, str3, jj4Var);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealSheetInternal", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public void g(com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealWithCode", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.B = imageQBarDataBean;
        com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "request deal QBAR string");
        if (imageQBarDataBean == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealWithCode", "com.tencent.mm.plugin.sns.ui.FlipView");
            return;
        }
        com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
        android.app.Activity activity = (android.app.Activity) this.f166283n;
        am.r3 r3Var = dealQBarStrEvent.f54079g;
        r3Var.f7781b = activity;
        r3Var.f7780a = imageQBarDataBean.f158619d;
        r3Var.f7782c = imageQBarDataBean.f158620e;
        r3Var.f7783d = imageQBarDataBean.f158621f;
        r3Var.f7792m = imageQBarDataBean.f158627o;
        r3Var.f7794o = true;
        r3Var.f7795p = new r45.db0();
        r3Var.f7795p.f372282e = snsInfo.getTimeLine() != null ? snsInfo.getTimeLine().Id : "";
        r45.jj4 d17 = com.tencent.mm.plugin.sns.model.s5.d(snsInfo, str);
        if (d17 != null) {
            r3Var.f7789j = d17.f377858g;
            r3Var.f7790k = d17.I;
        }
        r3Var.f7788i = 38;
        android.content.Context context = this.f166283n;
        if (context instanceof android.app.Activity) {
            r3Var.f7791l = ((android.app.Activity) context).getIntent().getBundleExtra("_stat_obj");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addStatInfo4AppBrand", "com.tencent.mm.plugin.sns.ui.FlipView");
        android.os.Bundle bundle = r3Var.f7791l;
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "addStatInfo4AppBrand, statObj is null");
            bundle = new android.os.Bundle();
            r3Var.f7791l = bundle;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "addStatInfo4AppBrand, from sns");
        bundle.putInt("LaunchCodeScene_ScanScene", 2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addStatInfo4AppBrand", "com.tencent.mm.plugin.sns.ui.FlipView");
        android.os.Bundle bundle2 = r3Var.f7791l;
        java.lang.String str2 = snsInfo.field_userName;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        bundle2.putString("stat_chat_talker_username", str2);
        if (this instanceof com.tencent.mm.plugin.sns.ui.SnsInfoFlip) {
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = (com.tencent.mm.plugin.sns.ui.SnsInfoFlip) this;
            com.tencent.mm.storage.s7 fromScene = snsInfoFlip.getFromScene();
            if (!fromScene.f195312a.equals(com.tencent.mm.storage.s7.f195300d.f195312a)) {
                java.lang.String str3 = com.tencent.mm.storage.s7.f195301e.f195312a;
                java.lang.String str4 = fromScene.f195312a;
                if (!str4.equals(str3) && !str4.equals(com.tencent.mm.storage.s7.f195302f.f195312a)) {
                    if (str4.equals(com.tencent.mm.storage.s7.f195299c.f195312a)) {
                        r3Var.f7784e = 3;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "other scene_from: %s", str4);
                    }
                }
            }
            r3Var.f7784e = 5;
            if (com.tencent.mm.sdk.platformtools.t8.K0(snsInfoFlip.f166286q)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "empty username");
                snsInfoFlip.f166286q = "";
            }
            r3Var.f7785f = snsInfoFlip.f166286q;
        }
        r3Var.f7798s = imageQBarDataBean.f158626n;
        r3Var.f7797r = imageQBarDataBean.f158625m;
        r3Var.f7796q = imageQBarDataBean.f158630r;
        dealQBarStrEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealWithCode", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public com.tencent.mm.ui.widget.dialog.k0 getBottomSheet() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.FlipView");
        wd4.l1 l1Var = this.f166290u;
        if (l1Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "getBottomSheet, mShareSheet is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.FlipView");
            return null;
        }
        com.tencent.mm.ui.widget.dialog.k0 d17 = l1Var.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.FlipView");
        return d17;
    }

    public r45.jj4 getCntMedia() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCntMedia", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCntMedia", "com.tencent.mm.plugin.sns.ui.FlipView");
        return null;
    }

    public android.view.View getCurrentImageView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentImageView", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentImageView", "com.tencent.mm.plugin.sns.ui.FlipView");
        return null;
    }

    public wd4.g getCurrentMaterialInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.FlipView");
        java.lang.String str = this.P;
        r45.jj4 jj4Var = this.Q;
        wd4.r rVar = wd4.r.f445015a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        wd4.g a17 = wd4.r.a(wd4.x0.d(str), jj4Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.FlipView");
        return a17;
    }

    public java.lang.String getCurrentMaterialPath() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.FlipView");
        java.lang.String mediaPath = getMediaPath();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.FlipView");
        return mediaPath;
    }

    public abstract com.tencent.mm.ui.base.MMViewPager getGallery();

    public abstract int getPosition();

    public abstract java.lang.String getSelectedMediaId();

    public abstract long getSnsId();

    public final void h(final java.lang.String str, final boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchDownloadFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.FlipView$$f
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.tencent.mm.plugin.sns.ui.FlipView.U;
                com.tencent.mm.plugin.sns.ui.FlipView flipView = com.tencent.mm.plugin.sns.ui.FlipView.this;
                flipView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$dispatchDownloadFinish$6", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (flipView.S == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$dispatchDownloadFinish$6", "com.tencent.mm.plugin.sns.ui.FlipView");
                    return;
                }
                java.util.Iterator it = new java.util.ArrayList(flipView.S).iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.plugin.sns.ui.b3) it.next()).r(str, z17);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$dispatchDownloadFinish$6", "com.tencent.mm.plugin.sns.ui.FlipView");
            }
        };
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            runnable.run();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchDownloadFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(runnable);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchDownloadFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
        }
    }

    public abstract boolean i(float f17, float f18);

    public final void j(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str, android.view.MenuItem menuItem, r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doFootSheetClick", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "request deal QBAR string");
        wd4.l1 l1Var = this.f166290u;
        if (l1Var != null && l1Var.g()) {
            this.f166290u.d().u();
        }
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "error beacause info null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFootSheetClick", "com.tencent.mm.plugin.sns.ui.FlipView");
        } else if (menuItem.getItemId() == 1021) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.c(getContext(), jj4Var.G1.f388072d, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFootSheetClick", "com.tencent.mm.plugin.sns.ui.FlipView");
        } else {
            if (this.A.size() > 0) {
                com.tencent.mm.plugin.scanner.c0.b(this.f166283n, getCurrentImageView(), this.A, 0, new com.tencent.mm.plugin.sns.ui.y2(this, snsInfo, str));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFootSheetClick", "com.tencent.mm.plugin.sns.ui.FlipView");
        }
    }

    public java.util.List k(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.FlipView");
        java.lang.String mediaPath = getMediaPath();
        if (!str.equals(mediaPath)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "getCodeScanResult, mediaPath: %s, curMediaPath: %s", str, mediaPath);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.FlipView");
            return null;
        }
        if (this.f166291v != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "getCodeScanResult, recognizingFilePath not null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.FlipView");
            return null;
        }
        java.util.ArrayList arrayList = this.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.FlipView");
        return arrayList;
    }

    public boolean l(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.FlipView");
        java.lang.String mediaPath = getMediaPath();
        if (str.equals(mediaPath)) {
            boolean j17 = com.tencent.mm.vfs.w6.j(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.FlipView");
            return j17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "getDownloadResult, mediaPath: %s, curMediaPath: %s", str, mediaPath);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.FlipView");
        return false;
    }

    public void n(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gotoPhotoEditUI", "com.tencent.mm.plugin.sns.ui.FlipView");
        if (com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(str, "");
            if (this.C != null) {
                com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo();
                videoCaptureReportInfo.f155690d = -1;
                b17.I = videoCaptureReportInfo;
            }
            fu3.e.f266880a.b(b17);
            ut3.m.f431182a.f(getContext(), 0, com.tencent.mm.R.anim.f477876e0, -1, b17, 1, 2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoPhotoEditUI", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public void o(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gotoPhotoEditUI", "com.tencent.mm.plugin.sns.ui.FlipView");
        if (jj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoPhotoEditUI", "com.tencent.mm.plugin.sns.ui.FlipView");
            return;
        }
        java.lang.String l17 = com.tencent.mm.plugin.sns.model.i1.l(jj4Var);
        if (com.tencent.mm.vfs.w6.j(l17)) {
            n(l17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoPhotoEditUI", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
        h(wd4.x0.a(str), z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
        h(wd4.x0.a(str), z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.FlipView");
        return true;
    }

    public final void p(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f166283n = context;
        this.f166281i = new com.tencent.mm.sdk.platformtools.n3();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initDM", "com.tencent.mm.plugin.sns.ui.FlipView");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.app.Activity) this.f166283n).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f166282m = displayMetrics.heightPixels;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDM", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.L.alive();
        this.M.alive();
        this.N.alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public final java.util.List q(java.lang.String str, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initMenuItem", "com.tencent.mm.plugin.sns.ui.FlipView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (snsInfo.getTypeFlag() != 21) {
            arrayList.add(1003);
            j45.l.g("favorite");
            arrayList.add(1006);
            if (snsInfo.isPhoto()) {
                ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
                if (ca4.z0.o0(this.D)) {
                    ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
                    if (!su4.r2.l()) {
                        if (snsInfo.getTimeLine().isExcerpt || !((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(2, 2)) {
                            arrayList.add(1010);
                        } else {
                            arrayList.add(java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST));
                            if (z17) {
                                ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ri(2, 2, tg0.e1.f419061d);
                            }
                        }
                        wd4.l1 l1Var = this.f166290u;
                        l1Var.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                        boolean z18 = l1Var.f444956e;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                        if (!z18) {
                            com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct();
                            chatImageWebSearchActionStruct.t("");
                            chatImageWebSearchActionStruct.r(ca4.z0.t0(getSnsId()));
                            chatImageWebSearchActionStruct.f55628f = ca4.z0.H(this.D);
                            chatImageWebSearchActionStruct.f55627e = 1;
                            chatImageWebSearchActionStruct.f55629g = 81;
                            chatImageWebSearchActionStruct.q("");
                            chatImageWebSearchActionStruct.p("");
                            chatImageWebSearchActionStruct.s(kk.k.e(str));
                            chatImageWebSearchActionStruct.f55635m = java.lang.System.currentTimeMillis();
                            chatImageWebSearchActionStruct.k();
                            ((sg0.q3) ((tg0.v1) i95.n0.c(tg0.v1.class))).getClass();
                            su4.k3.m(chatImageWebSearchActionStruct);
                        }
                    }
                }
            }
        } else if (!snsInfo.getUserName().equals(c01.z1.r())) {
            arrayList.add(1004);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initMenuItem", "com.tencent.mm.plugin.sns.ui.FlipView");
        return arrayList;
    }

    public final java.util.List r(java.lang.String str, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSecondMenu", "com.tencent.mm.plugin.sns.ui.FlipView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = snsInfo.field_type;
        if (i17 == 15 || i17 == 5) {
            arrayList.add(1002);
        } else if (snsInfo.isPhoto()) {
            arrayList.add(1002);
            if (!com.tencent.mm.plugin.sns.storage.w2.e(str)) {
                arrayList.add(1012);
            }
            if (this.f166288s) {
                arrayList.add(1009);
                com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
                galleryTranslateReportStruct.f58317e = 2L;
                if (s()) {
                    galleryTranslateReportStruct.f58318f = 6L;
                } else {
                    galleryTranslateReportStruct.f58318f = 7L;
                }
                r45.jj4 cntMedia = getCntMedia();
                if (cntMedia != null) {
                    galleryTranslateReportStruct.q(cntMedia.f377858g);
                }
                galleryTranslateReportStruct.k();
            }
            if (this.f166289t) {
                arrayList.add(1011);
            }
        } else {
            arrayList.add(1014);
        }
        com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
        exDeviceHaveBindNetworkDeviceEvent.f54141g.f6221c = str;
        exDeviceHaveBindNetworkDeviceEvent.e();
        if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
            arrayList.add(1008);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSecondMenu", "com.tencent.mm.plugin.sns.ui.FlipView");
        return arrayList;
    }

    public abstract boolean s();

    public void setNeedOCRImg(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNeedOCRImg", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f166289t = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNeedOCRImg", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public void setNeedScanImage(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNeedScanImage", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f166287r = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNeedScanImage", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public void setNeedTranslationImg(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNeedTranslationImg", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f166288s = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNeedTranslationImg", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    @Override // android.view.View
    public void setOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnLongClickListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.F = onLongClickListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnLongClickListener", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public void setOnMenuShowListener(com.tencent.mm.plugin.sns.ui.e3 e3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnMenuShowListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.E = e3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnMenuShowListener", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public void setOnMultiCodeListener(com.tencent.mm.plugin.sns.ui.f3 f3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnMultiCodeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.G = f3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnMultiCodeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public final void t(r45.jj4 jj4Var, android.view.MenuItem menuItem, java.lang.String str, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, final java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemSelected", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.tencent.mm.plugin.sns.ui.e3 e3Var = this.E;
        if (e3Var != null) {
            e3Var.b();
        }
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "error beacause info null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemSelected", "com.tencent.mm.plugin.sns.ui.FlipView");
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId != 1006) {
            if (itemId != 1020) {
                switch (itemId) {
                    case 1002:
                        if (snsInfo.field_type == 15) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveVideo", "com.tencent.mm.plugin.sns.ui.FlipView");
                            com.tencent.mm.autogen.events.SnsVideoMenuEvent snsVideoMenuEvent = new com.tencent.mm.autogen.events.SnsVideoMenuEvent();
                            am.ix ixVar = snsVideoMenuEvent.f54852g;
                            ixVar.f6980a = 3;
                            ixVar.f6983d = str;
                            snsVideoMenuEvent.e();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveVideo", "com.tencent.mm.plugin.sns.ui.FlipView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 2 6");
                            com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct msgFullScreenOperateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct();
                            msgFullScreenOperateReportStruct.f59268e = 2;
                            msgFullScreenOperateReportStruct.f59267d = 6;
                            msgFullScreenOperateReportStruct.f59269f = 3L;
                            msgFullScreenOperateReportStruct.k();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
                            break;
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 1 6");
                            com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct msgFullScreenOperateReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct();
                            msgFullScreenOperateReportStruct2.f59268e = 1;
                            msgFullScreenOperateReportStruct2.f59267d = 6;
                            msgFullScreenOperateReportStruct2.f59269f = 3L;
                            msgFullScreenOperateReportStruct2.k();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
                            ta4.e1 e1Var = ta4.e1.f416740a;
                            e1Var.b(e1Var.a(e1Var.d(this.D), false), this.D, "", snsInfo, true, ta4.k.f416790e);
                            if (snsInfo.field_type == 54 && jj4Var.X != null) {
                                pc4.e eVar = pc4.e.f353426a;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableSaveLivePhoto", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
                                boolean z17 = eVar.a() && pc4.e.f353432g;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableSaveLivePhoto", "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig");
                                if (z17) {
                                    int i17 = jj4Var.Y;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveLivePhoto", "com.tencent.mm.plugin.sns.ui.FlipView");
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "saveLivePhoto position %d index: %d", java.lang.Integer.valueOf(getPosition()), java.lang.Integer.valueOf(i17));
                                    com.tencent.mm.autogen.events.SnsLivePhotoMenuEvent snsLivePhotoMenuEvent = new com.tencent.mm.autogen.events.SnsLivePhotoMenuEvent();
                                    am.ew ewVar = snsLivePhotoMenuEvent.f54822g;
                                    ewVar.f6612a = 3;
                                    ewVar.f6613b = str;
                                    ewVar.f6614c = i17;
                                    snsLivePhotoMenuEvent.e();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveLivePhoto", "com.tencent.mm.plugin.sns.ui.FlipView");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemSelected", "com.tencent.mm.plugin.sns.ui.FlipView");
                                    return;
                                }
                            }
                            ca4.z0.z0(str2, this.f166283n);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportExportAsync", "com.tencent.mm.plugin.sns.ui.FlipView");
                            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.sns.ui.x2(this), "SnsImgExportReport");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportExportAsync", "com.tencent.mm.plugin.sns.ui.FlipView");
                            break;
                        }
                        break;
                    case 1003:
                        if (snsInfo.field_type == 15) {
                            com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), str3);
                            ca4.z0.U((r45.jj4) snsInfo.getTimeLine().ContentObj.f369840h.get(0));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendVideo", "com.tencent.mm.plugin.sns.ui.FlipView");
                            com.tencent.mm.autogen.events.SnsVideoMenuEvent snsVideoMenuEvent2 = new com.tencent.mm.autogen.events.SnsVideoMenuEvent();
                            am.ix ixVar2 = snsVideoMenuEvent2.f54852g;
                            ixVar2.f6980a = 1;
                            ixVar2.f6984e = 2;
                            ixVar2.f6983d = str;
                            snsVideoMenuEvent2.e();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendVideo", "com.tencent.mm.plugin.sns.ui.FlipView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 2 5");
                            com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct msgFullScreenOperateReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct();
                            msgFullScreenOperateReportStruct3.f59268e = 2;
                            msgFullScreenOperateReportStruct3.f59267d = 5;
                            msgFullScreenOperateReportStruct3.f59269f = 3L;
                            msgFullScreenOperateReportStruct3.k();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
                            break;
                        } else {
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("Select_Data_Send_To_WeWork", new com.tencent.mm.sendtowework.ImgData(str2));
                            intent.putExtra("content_type_forward_to_wework", 2);
                            intent.putExtra("Retr_File_Name", str2);
                            intent.putExtra("Retr_Compress_Type", 0);
                            intent.putExtra("Retr_Msg_Type", 0);
                            if (snsInfo.getTimeLine() != null && snsInfo.getTimeLine().isExcerpt) {
                                intent.putExtra("img_source_url", snsInfo.getTimeLine().snsExcerptUrl);
                            }
                            intent.putExtra("Retr_FromMainTimeline", s());
                            intent.putExtra("Retr_KSnsId", ca4.z0.T(snsInfo));
                            intent.putExtra("scene_from", 15);
                            intent.putExtra("msg_forward_sns_obj_id", str);
                            if (this.f166283n instanceof androidx.appcompat.app.AppCompatActivity) {
                                ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                                jd5.a aVar = new jd5.a();
                                aVar.p(str2);
                                aVar.set(aVar.f43702d + 4, str);
                                n13.r rVar = new n13.r();
                                rVar.f334117a = true;
                                rVar.f334120d.f334139a = 7;
                                ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(this.f166283n, aVar, rVar);
                            } else {
                                intent.putExtra("KEY_START_TIME", c01.id.c());
                                intent.putExtra("KEY_REPORT_PAGE_ID", 0);
                                intent.putExtra("KEY_REPORT_SCENE_TYPE", 1);
                                intent.putExtra("KEY_REPORT_MSG_TYPE", 3);
                                ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(5);
                                ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Bi(intent, je4.d.b(jj4Var != null ? jj4Var.W : null));
                                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.v(intent, this.f166283n);
                            }
                            com.tencent.mm.plugin.sns.model.k7.f164367a.c(snsInfo, 1);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 1 5");
                            com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct msgFullScreenOperateReportStruct4 = new com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct();
                            msgFullScreenOperateReportStruct4.f59268e = 1;
                            msgFullScreenOperateReportStruct4.f59267d = 5;
                            msgFullScreenOperateReportStruct4.f59269f = 3L;
                            msgFullScreenOperateReportStruct4.k();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
                            break;
                        }
                        break;
                    case 1004:
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("k_expose_msg_id", getSnsId());
                        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(getSnsId());
                        intent2.putExtra("k_username", W0 == null ? "" : W0.field_userName);
                        intent2.putExtra("showShare", false);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        java.lang.String str4 = com.tencent.mm.ui.n2.f209398a;
                        sb6.append(str4);
                        sb6.append(33);
                        intent2.putExtra("rawUrl", sb6.toString());
                        intent2.putExtra("rawUrl", java.lang.String.format(str4, 33));
                        j45.l.j(this.f166283n, "webview", ".ui.tools.WebViewUI", intent2, null);
                        break;
                    default:
                        com.tencent.mm.sdk.platformtools.f9 f9Var = com.tencent.mm.sdk.platformtools.f9.ContextTranslate;
                        switch (itemId) {
                            case 1008:
                                if (snsInfo.getTimeLine().ContentObj.f369840h.size() != 0) {
                                    android.content.Intent intent3 = new android.content.Intent();
                                    if (snsInfo.isPhoto()) {
                                        java.lang.String m17 = m(str2, this.f166283n);
                                        if (m17 == null) {
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemSelected", "com.tencent.mm.plugin.sns.ui.FlipView");
                                            return;
                                        } else {
                                            intent3.putExtra("sns_send_data_ui_image_path", m17);
                                            intent3.putExtra("sns_send_data_ui_image_media_id", getSelectedMediaId());
                                        }
                                    }
                                    intent3.putExtra("sns_send_data_ui_activity", true);
                                    intent3.putExtra("sns_local_id", str);
                                    j45.l.u(this.f166283n, ".ui.chatting.ChattingSendDataToDeviceUI", intent3, null);
                                    break;
                                } else {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemSelected", "com.tencent.mm.plugin.sns.ui.FlipView");
                                    return;
                                }
                            case 1009:
                                if (f9Var.k(getContext(), null)) {
                                    com.tencent.mm.autogen.events.SnsTranslateImageEvent snsTranslateImageEvent = new com.tencent.mm.autogen.events.SnsTranslateImageEvent();
                                    snsTranslateImageEvent.f54848g.f6615a = str3;
                                    snsTranslateImageEvent.e();
                                    com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
                                    galleryTranslateReportStruct.f58317e = 3L;
                                    if (s()) {
                                        galleryTranslateReportStruct.f58318f = 6L;
                                    } else {
                                        galleryTranslateReportStruct.f58318f = 7L;
                                    }
                                    r45.jj4 cntMedia = getCntMedia();
                                    if (cntMedia != null) {
                                        galleryTranslateReportStruct.q(cntMedia.f377858g);
                                    }
                                    galleryTranslateReportStruct.k();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
                                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 1 12");
                                    com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct msgFullScreenOperateReportStruct5 = new com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct();
                                    msgFullScreenOperateReportStruct5.f59268e = 1;
                                    msgFullScreenOperateReportStruct5.f59267d = 12;
                                    msgFullScreenOperateReportStruct5.f59269f = 3L;
                                    msgFullScreenOperateReportStruct5.k();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
                                    break;
                                }
                                break;
                            case 1010:
                                su4.i1 i1Var = new su4.i1();
                                i1Var.f412923b = this.f166283n;
                                i1Var.f412928g = str2;
                                i1Var.f412927f = snsInfo.field_userName;
                                i1Var.f412926e = ca4.z0.t0(getSnsId());
                                i1Var.f412925d = ca4.z0.H(this.D);
                                i1Var.f412929h = getCntMedia();
                                ((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).fj(i1Var);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
                                com.tencent.mars.xlog.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 1 26");
                                com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct msgFullScreenOperateReportStruct6 = new com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct();
                                msgFullScreenOperateReportStruct6.f59268e = 1;
                                msgFullScreenOperateReportStruct6.f59267d = 26;
                                msgFullScreenOperateReportStruct6.f59269f = 3L;
                                msgFullScreenOperateReportStruct6.k();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
                                break;
                            case 1011:
                                if (f9Var.k(getContext(), null)) {
                                    com.tencent.mm.autogen.events.SnsOCRImageEvent snsOCRImageEvent = new com.tencent.mm.autogen.events.SnsOCRImageEvent();
                                    snsOCRImageEvent.f54825g.f6873a = ca4.z0.Q(this.D);
                                    am.hw hwVar = snsOCRImageEvent.f54825g;
                                    hwVar.f6874b = str3;
                                    hwVar.f6875c = snsInfo.getUserName();
                                    snsOCRImageEvent.e();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
                                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 1 19");
                                    com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct msgFullScreenOperateReportStruct7 = new com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct();
                                    msgFullScreenOperateReportStruct7.f59268e = 1;
                                    msgFullScreenOperateReportStruct7.f59267d = 19;
                                    msgFullScreenOperateReportStruct7.f59269f = 3L;
                                    msgFullScreenOperateReportStruct7.k();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
                                    break;
                                }
                                break;
                            case 1012:
                                if (jj4Var.X != null) {
                                    android.content.Context context = this.f166283n;
                                    android.content.DialogInterface.OnClickListener onClickListener = new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.FlipView$$h
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                                            int i19 = com.tencent.mm.plugin.sns.ui.FlipView.U;
                                            com.tencent.mm.plugin.sns.ui.FlipView flipView = com.tencent.mm.plugin.sns.ui.FlipView.this;
                                            flipView.getClass();
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onMenuItemSelected$4", "com.tencent.mm.plugin.sns.ui.FlipView");
                                            flipView.n(str2);
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onMenuItemSelected$4", "com.tencent.mm.plugin.sns.ui.FlipView");
                                        }
                                    };
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showEditLiveAlert", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoUIHelper");
                                    kotlin.jvm.internal.o.g(context, "context");
                                    db5.e1.C(context, i65.a.r(context, com.tencent.mm.R.string.ojq), "", i65.a.r(context, com.tencent.mm.R.string.ojp), i65.a.r(context, com.tencent.mm.R.string.f490347sg), false, onClickListener, ke4.d.f307039d);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showEditLiveAlert", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoUIHelper");
                                } else {
                                    n(str2);
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
                                com.tencent.mars.xlog.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 1 7");
                                com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct msgFullScreenOperateReportStruct8 = new com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct();
                                msgFullScreenOperateReportStruct8.f59268e = 1;
                                msgFullScreenOperateReportStruct8.f59267d = 7;
                                msgFullScreenOperateReportStruct8.f59269f = 3L;
                                msgFullScreenOperateReportStruct8.k();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
                                break;
                        }
                }
            } else {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("imgPath", str2);
                hashMap.put("snsMediaMid", str3);
                hashMap.put("snsMediaTid", ca4.z0.t0(getSnsId()));
                hashMap.put("reuseImageInfo", new tg0.a(jj4Var.G, jj4Var.I, jj4Var.H, jj4Var.f377859h, jj4Var.f377858g).a());
                ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ai(this.f166283n, 2, 2, hashMap);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 1 26");
                com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct msgFullScreenOperateReportStruct9 = new com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct();
                msgFullScreenOperateReportStruct9.f59268e = 1;
                msgFullScreenOperateReportStruct9.f59267d = 26;
                msgFullScreenOperateReportStruct9.f59269f = 3L;
                msgFullScreenOperateReportStruct9.k();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
            }
        } else if (snsInfo.field_type != 15) {
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            if (w()) {
                qb4.a.d(doFavoriteEvent, snsInfo, str3);
            } else {
                qb4.a.d(doFavoriteEvent, com.tencent.mm.plugin.sns.model.l4.Fj().k1(str), str3);
            }
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6327m = 13;
            c4Var.f6323i = (android.app.Activity) this.f166283n;
            doFavoriteEvent.e();
            if (s()) {
                com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent snsFavFeedForDataReportEvent = new com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent();
                snsFavFeedForDataReportEvent.f54806g.f7579a = ca4.z0.T(snsInfo);
                am.ov ovVar = snsFavFeedForDataReportEvent.f54806g;
                snsInfo.getLocalid();
                ovVar.getClass();
                snsFavFeedForDataReportEvent.e();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 1 8");
            com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct msgFullScreenOperateReportStruct10 = new com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct();
            msgFullScreenOperateReportStruct10.f59268e = 1;
            msgFullScreenOperateReportStruct10.f59267d = 8;
            msgFullScreenOperateReportStruct10.f59269f = 3L;
            msgFullScreenOperateReportStruct10.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
        } else {
            if (snsInfo.isAd()) {
                com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent2 = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                qb4.a.e(doFavoriteEvent2, snsInfo);
                am.c4 c4Var2 = doFavoriteEvent2.f54090g;
                c4Var2.f6327m = 14;
                c4Var2.f6323i = (android.app.Activity) this.f166283n;
                doFavoriteEvent2.e();
            } else {
                boolean s17 = s();
                java.lang.String localid = snsInfo.getLocalid();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favVideo", "com.tencent.mm.plugin.sns.ui.FlipView");
                com.tencent.mm.autogen.events.SnsVideoMenuEvent snsVideoMenuEvent3 = new com.tencent.mm.autogen.events.SnsVideoMenuEvent();
                am.ix ixVar3 = snsVideoMenuEvent3.f54852g;
                ixVar3.f6980a = 2;
                ixVar3.f6981b = 14;
                ixVar3.f6982c = s17;
                ixVar3.f6983d = localid;
                snsVideoMenuEvent3.e();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favVideo", "com.tencent.mm.plugin.sns.ui.FlipView");
            }
            if (s()) {
                com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent snsFavFeedForDataReportEvent2 = new com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent();
                snsFavFeedForDataReportEvent2.f54806g.f7579a = ca4.z0.T(snsInfo);
                am.ov ovVar2 = snsFavFeedForDataReportEvent2.f54806g;
                snsInfo.getLocalid();
                ovVar2.getClass();
                snsFavFeedForDataReportEvent2.e();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFullScreenMediaReporter", "reportMediaOperate >> 2 8");
            com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct msgFullScreenOperateReportStruct11 = new com.tencent.mm.autogen.mmdata.rpt.MsgFullScreenOperateReportStruct();
            msgFullScreenOperateReportStruct11.f59268e = 2;
            msgFullScreenOperateReportStruct11.f59267d = 8;
            msgFullScreenOperateReportStruct11.f59269f = 3L;
            msgFullScreenOperateReportStruct11.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMediaOperate", "com.tencent.mm.plugin.sns.report.SnsFullScreenMediaReporter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemSelected", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public void u(com.tencent.mm.plugin.sns.ui.b3 b3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        java.util.List list = this.S;
        if (list == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
            return;
        }
        list.remove(b3Var);
        if (this.S.isEmpty()) {
            this.S = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public void v(com.tencent.mm.plugin.sns.ui.c3 c3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeMediaChangeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        java.util.List list = this.T;
        if (list == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeMediaChangeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
            return;
        }
        list.remove(c3Var);
        if (this.T.isEmpty()) {
            this.T = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeMediaChangeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public boolean w() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldIgnoreLocalId", "com.tencent.mm.plugin.sns.ui.FlipView");
        boolean z17 = this.D == 8;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldIgnoreLocalId", "com.tencent.mm.plugin.sns.ui.FlipView");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(r45.jj4 r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.FlipView.x(r45.jj4, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public boolean y(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDownloadVideo", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "startDownloadVideo, mediaPath: %s", str);
        com.tencent.mm.ui.base.MMViewPager gallery = getGallery();
        if (gallery == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlipView", "startDownloadVideo, viewPager is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownloadVideo", "com.tencent.mm.plugin.sns.ui.FlipView");
            return false;
        }
        android.view.View selectedView = gallery.getSelectedView();
        if (selectedView instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView) {
            boolean T = ((com.tencent.mm.plugin.sns.ui.OnlineVideoView) selectedView).T(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownloadVideo", "com.tencent.mm.plugin.sns.ui.FlipView");
            return T;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FlipView", "startDownloadVideo, curView not OnlineVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownloadVideo", "com.tencent.mm.plugin.sns.ui.FlipView");
        return false;
    }

    public FlipView(android.content.Context context) {
        super(context);
        this.f166276d = 0.0d;
        this.f166277e = 0.0d;
        this.f166278f = 0L;
        this.f166284o = false;
        this.f166285p = 0L;
        this.f166287r = false;
        this.f166288s = false;
        this.f166289t = false;
        this.A = new java.util.ArrayList();
        this.B = null;
        this.C = com.tencent.mm.storage.s7.f195307k;
        this.D = 0;
        this.H = 0L;
        this.I = 0L;
        this.f166275J = 0L;
        this.K = new com.tencent.mm.plugin.sns.ui.a3(this);
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.L = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.FlipView.5
            {
                this.__eventId = 812146647;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
                java.lang.String str;
                java.lang.String str2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$5");
                com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = recogQBarOfImageFileResultEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$5");
                int i17 = com.tencent.mm.plugin.sns.ui.FlipView.U;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.FlipView");
                com.tencent.mm.plugin.sns.ui.FlipView flipView = com.tencent.mm.plugin.sns.ui.FlipView.this;
                boolean z17 = flipView.f166287r;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "no need to scan image");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$5");
                } else if (com.tencent.mm.plugin.sns.ui.FlipView.a(flipView) == null || com.tencent.mm.plugin.sns.ui.FlipView.b(flipView) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "not in recoging");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$5");
                } else if (recogQBarOfImageFileResultEvent2 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "receive invalid callbak");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$5");
                } else if (recogQBarOfImageFileResultEvent2.f54661g.f6368a.equals(com.tencent.mm.plugin.sns.ui.FlipView.b(flipView))) {
                    flipView.H = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.FlipView");
                    java.lang.Long l17 = flipView.f166275J;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.FlipView");
                    flipView.I = java.lang.Long.valueOf(currentTimeMillis - l17.longValue());
                    flipView.A = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a.a(recogQBarOfImageFileResultEvent2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "recog result: " + flipView.A.size());
                    com.tencent.mm.plugin.sns.ui.FlipView.c(flipView, com.tencent.mm.plugin.sns.ui.FlipView.b(flipView), flipView.A);
                    if (com.tencent.mm.sdk.platformtools.t8.L0(flipView.A)) {
                        str = "com.tencent.mm.plugin.sns.ui.FlipView";
                    } else {
                        if (com.tencent.mm.plugin.sns.ui.FlipView.a(flipView) != null) {
                            wd4.l1 a17 = com.tencent.mm.plugin.sns.ui.FlipView.a(flipView);
                            android.view.View currentImageView = flipView.getCurrentImageView();
                            java.util.ArrayList imageQBarDataList = flipView.A;
                            com.tencent.mm.plugin.sns.storage.SnsInfo d17 = com.tencent.mm.plugin.sns.ui.FlipView.d(flipView);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fetchCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
                            kotlin.jvm.internal.o.g(a17, "<this>");
                            kotlin.jvm.internal.o.g(imageQBarDataList, "imageQBarDataList");
                            com.tencent.mm.plugin.scanner.ImageQBarDataBean b17 = wd4.r0.b(a17, currentImageView, imageQBarDataList);
                            if (b17 != null) {
                                java.lang.String str3 = b17.f158619d;
                                kd0.f2 f2Var = new kd0.f2(str3);
                                if (d17 != null) {
                                    java.lang.String userName = d17.getUserName();
                                    str2 = "com.tencent.mm.plugin.sns.ui.FlipView";
                                    java.lang.String valueOf = java.lang.String.valueOf(d17.field_snsId);
                                    kd0.f2 f2Var2 = new kd0.f2(str3);
                                    f2Var2.f306635b = 3;
                                    f2Var2.f306636c = userName;
                                    f2Var2.f306637d = valueOf;
                                    f2Var = f2Var2;
                                } else {
                                    str2 = "com.tencent.mm.plugin.sns.ui.FlipView";
                                }
                                ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) a17.e()).k(b17.f158620e, f2Var, new wd4.p0(a17, currentImageView, imageQBarDataList));
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
                            } else {
                                str2 = "com.tencent.mm.plugin.sns.ui.FlipView";
                                int size = imageQBarDataList.size();
                                if (size == 1) {
                                    java.lang.Object obj = imageQBarDataList.get(0);
                                    kotlin.jvm.internal.o.f(obj, "get(...)");
                                    com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) obj;
                                    kd0.p2 e17 = a17.e();
                                    java.lang.String str4 = imageQBarDataBean.f158619d;
                                    kd0.f2 f2Var3 = new kd0.f2(str4);
                                    if (d17 != null) {
                                        java.lang.String userName2 = d17.getUserName();
                                        java.lang.String valueOf2 = java.lang.String.valueOf(d17.field_snsId);
                                        f2Var3 = new kd0.f2(str4);
                                        f2Var3.f306635b = 3;
                                        f2Var3.f306636c = userName2;
                                        f2Var3.f306637d = valueOf2;
                                    }
                                    ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) e17).k(imageQBarDataBean.f158620e, f2Var3, new wd4.q0(a17, currentImageView, imageQBarDataList));
                                } else if (size > 1 && a17.d().i()) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                                    a17.f444956e = true;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                                    wd4.r0.a(a17, currentImageView, imageQBarDataList);
                                    a17.m();
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
                            }
                        } else {
                            str2 = "com.tencent.mm.plugin.sns.ui.FlipView";
                        }
                        str = str2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", str);
                        r45.jj4 jj4Var = flipView.f166294y;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", str);
                        java.lang.String b18 = com.tencent.mm.plugin.sns.ui.FlipView.b(flipView);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", str);
                        java.lang.String str5 = flipView.f166292w;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", str);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", str);
                        java.lang.String str6 = flipView.f166293x;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", str);
                        flipView.x(jj4Var, b18, str5, str6, 2);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", str);
                    flipView.f166291v = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$5");
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "not same filepath");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$5");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$5");
                return false;
            }
        };
        this.M = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.FlipView.6
            {
                this.__eventId = 1700407223;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent2 = recogQBarOfImageFileFailedEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                int i17 = com.tencent.mm.plugin.sns.ui.FlipView.U;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.FlipView");
                com.tencent.mm.plugin.sns.ui.FlipView flipView = com.tencent.mm.plugin.sns.ui.FlipView.this;
                boolean z17 = flipView.f166287r;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "no need to scan image");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                } else if (com.tencent.mm.plugin.sns.ui.FlipView.a(flipView) == null || com.tencent.mm.plugin.sns.ui.FlipView.b(flipView) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "not in recoging");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                } else if (recogQBarOfImageFileFailedEvent2.f54660g.f6278a.equals(com.tencent.mm.plugin.sns.ui.FlipView.b(flipView))) {
                    am.bq bqVar = recogQBarOfImageFileFailedEvent2.f54660g;
                    if (bqVar.f6280c && bqVar.f6279b == 2) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.FlipView");
                        r45.jj4 jj4Var = flipView.f166294y;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.FlipView");
                        java.lang.String b17 = com.tencent.mm.plugin.sns.ui.FlipView.b(flipView);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.FlipView");
                        java.lang.String str = flipView.f166292w;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.FlipView");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.FlipView");
                        java.lang.String str2 = flipView.f166293x;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.FlipView");
                        flipView.x(jj4Var, b17, str, str2, 3);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                    } else {
                        com.tencent.mm.plugin.sns.ui.FlipView.c(flipView, com.tencent.mm.plugin.sns.ui.FlipView.b(flipView), null);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.FlipView");
                        flipView.f166291v = null;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.FlipView");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "not same filepath");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                return false;
            }
        };
        this.N = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.FlipView.7
            {
                this.__eventId = 1280295539;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent) {
                com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$7");
                com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent2 = notifyDealQBarStrResultEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$7");
                int i17 = com.tencent.mm.plugin.sns.ui.FlipView.U;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.FlipView");
                com.tencent.mm.plugin.sns.ui.FlipView flipView = com.tencent.mm.plugin.sns.ui.FlipView.this;
                boolean z17 = flipView.f166287r;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "no need to scan image");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$7");
                } else if (notifyDealQBarStrResultEvent2 != null) {
                    am.kl klVar = notifyDealQBarStrResultEvent2.f54539g;
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "notify Event: %d", java.lang.Integer.valueOf(klVar.f7168c));
                    android.app.Activity activity = klVar.f7167b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.FlipView");
                    android.content.Context context2 = flipView.f166283n;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.FlipView");
                    if (activity == ((android.app.Activity) context2) && (imageQBarDataBean = flipView.B) != null && klVar.f7166a.equals(imageQBarDataBean.f158619d)) {
                        if (klVar.f7168c == 3) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.FlipView");
                            android.content.Context context3 = flipView.f166283n;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.FlipView");
                            ((android.app.Activity) context3).finish();
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$7");
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "not the same");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$7");
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlipView", "event is null or not a instant of NotifyDealQBarStrResultEvent");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$7");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$7");
                return false;
            }
        };
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        p(context);
    }
}
