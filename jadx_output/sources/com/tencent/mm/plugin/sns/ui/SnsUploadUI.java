package com.tencent.mm.plugin.sns.ui;

@db5.a(com.tencent.mm.plugin.appbrand.jsapi.auth.v1.CTRL_INDEX)
@gm0.a2
/* loaded from: classes4.dex */
public class SnsUploadUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements com.tencent.mm.plugin.sns.ui.f5 {

    /* renamed from: x1, reason: collision with root package name */
    public static final /* synthetic */ int f167517x1 = 0;
    public ta4.x0 Q;
    public com.tencent.mm.ui.widget.dialog.f4 T;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.WrapScollview f167519d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f167520e;

    /* renamed from: f, reason: collision with root package name */
    public fl5.i f167521f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f167522g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f167523h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.AtContactWidget f167524i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.LocationWidget f167526m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.BaseRangeWidget f167527n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter f167528o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsUploadConfigView f167529p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f167530p0;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView f167532q;

    /* renamed from: r, reason: collision with root package name */
    public int f167533r = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f167534s = false;

    /* renamed from: t, reason: collision with root package name */
    public long f167535t = 0;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.z4 f167536u = null;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f167537v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f167538w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f167539x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f167541y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.util.ArrayList f167543z = new java.util.ArrayList();
    public java.util.ArrayList A = new java.util.ArrayList();
    public int B = 0;
    public int C = 0;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public java.lang.String H = null;
    public java.lang.String I = "";

    /* renamed from: J, reason: collision with root package name */
    public boolean f167518J = false;
    public boolean K = false;
    public boolean L = false;
    public final java.util.Map M = new java.util.HashMap();
    public final java.util.concurrent.ConcurrentHashMap N = new java.util.concurrent.ConcurrentHashMap();
    public final java.util.Map P = new java.util.HashMap();
    public final com.tencent.mm.plugin.sns.ui.bi R = new com.tencent.mm.plugin.sns.ui.bi();
    public boolean S = false;
    public java.lang.String U = "";
    public java.lang.String V = "";
    public long W = 3000;
    public final java.lang.Runnable X = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.1
        @Override // java.lang.Runnable
        public void run() {
            com.tencent.mm.plugin.sns.ui.z4 z4Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$1");
            com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this;
            if (snsUploadUI.f167521f != null && (z4Var = snsUploadUI.f167536u) != null && z4Var.j()) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                snsUploadUI.getIntent().putExtra("Kdescription", snsUploadUI.f167521f.getText().toString());
                snsUploadUI.getIntent().putExtra("KparseLen", snsUploadUI.f167521f.getPasterLen());
                com.tencent.mm.plugin.sns.ui.SnsUploadUI.U6(snsUploadUI);
                snsUploadUI.getIntent().writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(marshall);
                snsUploadUI.f167536u.d(true);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                java.lang.String str = snsUploadUI.V;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                if (!com.tencent.mm.sdk.platformtools.t8.D0(str, b17)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    snsUploadUI.V = b17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    com.tencent.mm.plugin.sns.ui.SnsUploadUI.X6(snsUploadUI, marshall, 1);
                }
                com.tencent.mm.sdk.platformtools.n3 Tj = com.tencent.mm.plugin.sns.model.l4.Tj();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                java.lang.Runnable runnable = snsUploadUI.X;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                long j17 = snsUploadUI.W;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                Tj.postDelayed(runnable, j17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$1");
        }
    };
    public android.widget.FrameLayout Y = null;
    public long Z = 0;

    /* renamed from: x0, reason: collision with root package name */
    public long f167540x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public int f167542y0 = 0;

    /* renamed from: l1, reason: collision with root package name */
    public int f167525l1 = 0;

    /* renamed from: p1, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f167531p1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HellBizIdEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.26
        {
            this.__eventId = 184294137;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.HellBizIdEvent hellBizIdEvent) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$26");
            com.tencent.mm.autogen.events.HellBizIdEvent hellBizIdEvent2 = hellBizIdEvent;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$26");
            if (hellBizIdEvent2 != null) {
                am.ih ihVar = hellBizIdEvent2.f54433g;
                if (com.tencent.mm.sdk.platformtools.t8.D0(ihVar.f6952a, com.tencent.mm.plugin.sns.ui.SnsUploadUI.this.hashCode() + "")) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_POST_BIZ_ID_STRING, ihVar.f6953b);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$26");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$26");
            return false;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadUI$10, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass10 implements android.view.MenuItem.OnMenuItemClickListener {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean[] f167550d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadUI$10$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public class AnonymousClass1 implements ck5.e {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f167552d;

            public AnonymousClass1(int i17) {
                this.f167552d = i17;
            }

            @Override // ck5.e
            public void R5(java.lang.String str) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhenLess", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhenLess", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10$1");
            }

            @Override // ck5.e
            public void c1(java.lang.String str) {
                com.tencent.mm.ui.widget.dialog.f4 f4Var;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhenOK", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10$1");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "commit after check");
                if (com.tencent.mm.plugin.sns.ui.SnsUploadUI.this.getIntent().getBooleanExtra("sns_upload_is_show_dialog", false)) {
                    com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this;
                    int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(snsUploadUI);
                    e4Var.f211776c = snsUploadUI.getString(com.tencent.mm.R.string.f490560yi, "");
                    e4Var.b(com.tencent.mm.R.raw.toast_ok);
                    f4Var = e4Var.c();
                } else {
                    f4Var = null;
                }
                com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI2 = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this;
                int i18 = com.tencent.mm.plugin.sns.ui.SnsUploadUI.f167517x1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                snsUploadUI2.T = f4Var;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                long j17 = com.tencent.mm.plugin.sns.ui.SnsUploadUI.W6(com.tencent.mm.plugin.sns.ui.SnsUploadUI.this) != null ? 1000L : 0L;
                ku5.u0 u0Var = ku5.t0.f312615d;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI$10$1$$a
                    /* JADX WARN: Removed duplicated region for block: B:60:0x031b  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 808
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsUploadUI$10$1$$a.run():void");
                    }
                };
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(runnable, j17, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhenOK", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10$1");
            }

            @Override // ck5.e
            public void w0(java.lang.String str) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhenMore", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10$1");
                com.tencent.mm.plugin.sns.ui.SnsUploadUI.AnonymousClass10 anonymousClass10 = com.tencent.mm.plugin.sns.ui.SnsUploadUI.AnonymousClass10.this;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.ui.tools.v4.f(com.tencent.mm.plugin.sns.ui.SnsUploadUI.this.f167521f.getText().toString()));
                int i17 = this.f167552d;
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsUploadUI", "user click post failed, count over, currentCharacterCount:%d, maxCount:%d", valueOf, java.lang.Integer.valueOf(i17));
                com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this;
                androidx.appcompat.app.AppCompatActivity context = snsUploadUI.getContext();
                java.lang.String r17 = i65.a.r(snsUploadUI.getContext(), com.tencent.mm.R.string.f493262jh4);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("characterCount2TextCount", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                int ceil = (int) java.lang.Math.ceil(i17 / 2.0d);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("characterCount2TextCount", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                db5.t7.m(context, java.lang.String.format(r17, java.lang.Integer.valueOf(ceil)));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                ta4.x0 d76 = snsUploadUI.d7();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                d76.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hitWordLimitToast", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
                d76.f416860h++;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hitWordLimitToast", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhenMore", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10$1");
            }
        }

        public AnonymousClass10(boolean[] zArr) {
            this.f167550d = zArr;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem menuItem) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10");
            com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this;
            if (snsUploadUI.isFinishing()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsUploadUI", "skip commit, activity is finishing");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10");
                return false;
            }
            com.tencent.mm.plugin.sns.ui.z4 z4Var = snsUploadUI.f167536u;
            if (z4Var != null && !z4Var.h()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsUploadUI", "skip commit, beforeCommit: false");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10");
                return false;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            long j17 = snsUploadUI.Z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            if (currentTimeMillis - j17 < 500) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsUploadUI", "skip commit, click frequently");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10");
                return false;
            }
            if (snsUploadUI.G) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsUploadUI", "skip commit, has commited");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10");
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "user click send.");
            com.tencent.mm.sdk.platformtools.n3 Tj = com.tencent.mm.plugin.sns.model.l4.Tj();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            java.lang.Runnable runnable = snsUploadUI.X;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            Tj.removeCallbacks(runnable);
            android.os.Parcel obtain = android.os.Parcel.obtain();
            snsUploadUI.getIntent().putExtra("Kdescription", snsUploadUI.f167521f.getText().toString());
            snsUploadUI.getIntent().putExtra("KparseLen", snsUploadUI.f167521f.getPasterLen());
            com.tencent.mm.plugin.sns.ui.z4 z4Var2 = snsUploadUI.f167536u;
            if (z4Var2 instanceof de4.a) {
                z4Var2.d(true);
            }
            com.tencent.mm.plugin.sns.ui.SnsUploadUI.U6(snsUploadUI);
            snsUploadUI.getIntent().writeToParcel(obtain, 0);
            com.tencent.mm.plugin.sns.ui.SnsUploadUI.X6(snsUploadUI, obtain.marshall(), 2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            snsUploadUI.a7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            boolean[] zArr = this.f167550d;
            if (zArr[0]) {
                zArr[0] = false;
            } else {
                fo3.s sVar = fo3.s.INSTANCE;
                sVar.Z7("ce_sns_upload", "<SnsUpload>");
                sVar.H2("ce_sns_upload", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
                sVar.Qa("ce_sns_upload");
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            snsUploadUI.Z = currentTimeMillis2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            com.tencent.mm.plugin.report.service.f0.a(22);
            int n17 = ip.c.n();
            xa4.b.f452821a.d("view_clk");
            fl5.j g17 = fl5.j.g(snsUploadUI.f167521f);
            int n18 = ip.c.n();
            g17.f42561f = 0;
            g17.f42560e = n18;
            g17.f42556a = true;
            g17.d(new com.tencent.mm.plugin.sns.ui.SnsUploadUI.AnonymousClass10.AnonymousClass1(n17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$10");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadUI$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass3 implements java.lang.Runnable {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ byte[] f167576d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f167577e;

        public AnonymousClass3(byte[] bArr, int i17) {
            this.f167576d = bArr;
            this.f167577e = i17;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$3");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.storage.c2 Dj = com.tencent.mm.plugin.sns.model.l4.Dj();
            int i17 = com.tencent.mm.plugin.sns.ui.SnsUploadUI.f167517x1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this;
            java.lang.String str = snsUploadUI.U;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            Dj.J0(str, this.f167576d, this.f167577e);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            java.lang.String str2 = snsUploadUI.U;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "saveDraft draftKey:%s, cost time:%s", str2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$3");
        }
    }

    public static void U6(com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        snsUploadUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetIntent", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        snsUploadUI.getIntent().putExtra("Kis_retry_edit", false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetIntent", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public static void V6(com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        snsUploadUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("descTextViewOnClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        snsUploadUI.f167521f.k();
        if (snsUploadUI.f167528o.b()) {
            snsUploadUI.f167528o.g();
        }
        if (!com.tencent.mm.sdk.platformtools.d2.j(snsUploadUI)) {
            snsUploadUI.f167528o.f();
        }
        snsUploadUI.getContentView().postInvalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("descTextViewOnClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public static /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 W6(com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.tencent.mm.ui.widget.dialog.f4 f4Var = snsUploadUI.T;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return f4Var;
    }

    public static void X6(com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI, byte[] bArr, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        snsUploadUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveDraft", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.ui.SnsUploadUI.AnonymousClass3(bArr, i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveDraft", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public static void i7(int i17, java.lang.String str, java.lang.String str2, long j17, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportInputMenu", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        ((sg0.c2) ((tg0.n1) i95.n0.c(tg0.n1.class))).wi(null, 1, 1, c01.z1.r(), str2, 1, "", str3, i17, str, j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportInputMenu", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x068d  */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y6() {
        /*
            Method dump skipped, instructions count: 1714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsUploadUI.Y6():void");
    }

    public void Z6(android.os.Bundle bundle) {
        android.view.View b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("attachWidget", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "attachWidget. share type %d, isManuSnsPost:%b", java.lang.Integer.valueOf(this.f167533r), java.lang.Boolean.valueOf(this.f167534s));
        int i17 = this.f167533r;
        if (i17 == 0 || i17 == 14 || i17 == 9) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            getIntent().writeToParcel(obtain, 0);
            obtain.marshall();
            if (this.f167533r == 9) {
                setMMTitle(getContext().getResources().getString(com.tencent.mm.R.string.f493252jg3));
            } else {
                setMMTitle("");
            }
        } else {
            setMMTitle(getContext().getResources().getString(com.tencent.mm.R.string.pie));
        }
        int i18 = this.f167533r;
        switch (i18) {
            case 0:
            case 28:
                this.U = "draft_normal";
                this.f167536u = e7(i18);
                this.f167521f.addTextChangedListener(new android.text.TextWatcher() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.22
                    @Override // android.text.TextWatcher
                    public void afterTextChanged(android.text.Editable editable) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$22");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$22");
                    }

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(java.lang.CharSequence charSequence, int i19, int i27, int i28) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$22");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$22");
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(java.lang.CharSequence charSequence, int i19, int i27, int i28) {
                        android.view.View findViewById;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$22");
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this;
                        if (snsUploadUI.f167521f.getText().toString().trim().length() > 10 && (findViewById = snsUploadUI.findViewById(com.tencent.mm.R.id.f487028n91)) != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsUploadUI$22", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$22", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$22");
                    }
                });
                break;
            case 1:
                java.lang.String stringExtra = getIntent().getStringExtra("ksnsupload_bizstyle_cover_url");
                if (pc4.d.f353410a.a() && !android.text.TextUtils.isEmpty(stringExtra)) {
                    this.f167536u = new com.tencent.mm.plugin.sns.ui.p1(this);
                    break;
                } else {
                    this.f167536u = new com.tencent.mm.plugin.sns.ui.b5(this);
                    break;
                }
                break;
            case 2:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.f6(this);
                break;
            case 3:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.a8(this, 9);
                break;
            case 4:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.c2(this);
                break;
            case 5:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.a8(this, 14);
                break;
            case 6:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.a8(this, 12);
                break;
            case 7:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.a8(this, 13);
                break;
            case 8:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.fw(this);
                break;
            case 9:
                this.U = "draft_text";
                java.lang.String stringExtra2 = getIntent().getStringExtra("Kdescription");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
                int j17 = com.tencent.mm.sdk.platformtools.t8.j1(java.lang.Integer.valueOf(getIntent().getIntExtra("KparseLen", 0)), 0);
                this.f167536u = new com.tencent.mm.plugin.sns.ui.y6(this, str);
                this.f167521f.setPasterLen(j17);
                this.f167521f.setText(pg5.d.a(getContext(), str));
                androidx.appcompat.app.AppCompatActivity context = getContext();
                android.view.View j18 = this.f167521f.j();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("launch", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate");
                if (j18 != null) {
                    j18.requestFocus();
                }
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.plugin.sns.ui.listener.b bVar = new com.tencent.mm.plugin.sns.ui.listener.b(context, j18);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(bVar, 200L, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("launch", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate");
                fl5.i iVar = this.f167521f;
                iVar.setSelection(iVar.getText().length());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("watchInputTextEnablePost", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "watchInputTextEnablePost: ");
                this.f167521f.addTextChangedListener(new android.text.TextWatcher() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.27
                    @Override // android.text.TextWatcher
                    public void afterTextChanged(android.text.Editable editable) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$27");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$27");
                    }

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(java.lang.CharSequence charSequence, int i19, int i27, int i28) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$27");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$27");
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(java.lang.CharSequence charSequence, int i19, int i27, int i28) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$27");
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this;
                        snsUploadUI.enableOptionMenu(com.tencent.mm.plugin.sns.ui.y6.o(snsUploadUI.f167521f.getText().toString()));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$27");
                    }
                });
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("watchInputTextEnablePost", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                break;
            case 10:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.a2(this);
                break;
            case 11:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 29:
            case 32:
            case 34:
            case 40:
            case 41:
            case 42:
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
            case 46:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.b5(this);
                break;
            case 12:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.b2(this);
                break;
            case 13:
            case 33:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.d2(this, i18);
                break;
            case 14:
                this.U = "draft_normal";
                this.f167536u = e7(i18);
                break;
            case 17:
            case 45:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.q2(this);
                break;
            case 19:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.r5(this);
                break;
            case 21:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.o2(this);
                break;
            case 23:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.x5(this);
                break;
            case 25:
            case 37:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.fy(this);
                break;
            case 27:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.n2(this);
                break;
            case 30:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.v2(this);
                break;
            case 35:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.b6(this);
                break;
            case 36:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.h2(this);
                break;
            case 38:
                this.f167536u = new com.tencent.mm.plugin.sns.ui.q2(this);
                break;
            case 44:
                if (!pc4.d.f353410a.B()) {
                    this.f167536u = new com.tencent.mm.plugin.sns.ui.o7(this);
                    break;
                } else {
                    this.f167536u = new de4.a(this);
                    break;
                }
        }
        this.f167536u.i(bundle);
        if (this.R.c()) {
            this.U = this.R.b();
        }
        com.tencent.mm.plugin.sns.ui.z4 z4Var = this.f167536u;
        if ((z4Var instanceof com.tencent.mm.plugin.sns.ui.p7) && !(z4Var instanceof com.tencent.mm.plugin.sns.ui.t2)) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.n7x);
            com.tencent.mm.plugin.sns.ui.widget.SnsPopover snsPopover = (com.tencent.mm.plugin.sns.ui.widget.SnsPopover) findViewById(com.tencent.mm.R.id.f487028n91);
            snsPopover.setTriangleCenterToRelativeX((i65.a.f(getContext(), com.tencent.mm.R.dimen.f479714d7) + (ud4.k.g(getContext()) / 2)) - i65.a.f(getContext(), com.tencent.mm.R.dimen.f479672c9));
            com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView = (com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView) findViewById(com.tencent.mm.R.id.naf);
            this.f167532q = dynamicGridView;
            dynamicGridView.setNeedBanTouch(this.L);
            this.f167532q.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.23
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$23");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    arrayList.add(motionEvent);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUploadUI$23", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                    boolean l76 = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this.l7();
                    yj0.a.i(l76, this, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$23", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$23");
                    return l76;
                }
            });
            b17 = ((com.tencent.mm.plugin.sns.ui.p7) this.f167536u).s(findViewById, findViewById(com.tencent.mm.R.id.cry), this.f167532q, snsPopover, findViewById(com.tencent.mm.R.id.pmh));
            this.f167532q.setVisibility(0);
            this.R.a((android.widget.RelativeLayout) this.f167532q.getParent(), this.f167532q.getPaddingLeft());
        } else if (z4Var instanceof de4.a) {
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.n7x);
            com.tencent.mm.plugin.sns.ui.widget.SnsPopover snsPopover2 = (com.tencent.mm.plugin.sns.ui.widget.SnsPopover) findViewById(com.tencent.mm.R.id.f487028n91);
            snsPopover2.setTriangleCenterToRelativeX((i65.a.f(getContext(), com.tencent.mm.R.dimen.f479714d7) + (ud4.k.g(getContext()) / 2)) - i65.a.f(getContext(), com.tencent.mm.R.dimen.f479672c9));
            com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView2 = (com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView) findViewById(com.tencent.mm.R.id.naf);
            this.f167532q = dynamicGridView2;
            dynamicGridView2.setNeedBanTouch(this.L);
            this.f167532q.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.24
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$24");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    arrayList.add(motionEvent);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUploadUI$24", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                    boolean l76 = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this.l7();
                    yj0.a.i(l76, this, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$24", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$24");
                    return l76;
                }
            });
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.pmh);
            de4.a aVar = (de4.a) this.f167536u;
            android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.cry);
            com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView3 = this.f167532q;
            aVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
            ee4.e1 e1Var = (ee4.e1) aVar.k(ee4.e1.class);
            e1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initView: previewImage null[");
            sb6.append(e1Var.f251700n == null);
            sb6.append(']');
            e1Var.f(sb6.toString());
            if (e1Var.f251700n == null) {
                e1Var.f251700n = new ud4.k(findViewById2, findViewById4, snsPopover2, findViewById3, e1Var.c(), e1Var.m().v().e(), 9, dynamicGridView3, e1Var.f251702p, e1Var.f251703q, !e1Var.f251701o);
            } else {
                e1Var.p();
            }
            com.tencent.mm.plugin.sns.ui.v4 v4Var = e1Var.f251700n;
            kotlin.jvm.internal.o.d(v4Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            b17 = ((ud4.t) v4Var).f426734c;
            kotlin.jvm.internal.o.f(b17, "getView(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
            this.f167532q.setVisibility(0);
            this.R.a((android.widget.RelativeLayout) this.f167532q.getParent(), this.f167532q.getPaddingLeft());
        } else {
            b17 = z4Var.b();
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.pm_);
            this.f167522g = linearLayout;
            linearLayout.setVisibility(0);
            this.f167522g.setClipChildren(false);
            if (b17 != null) {
                this.f167522g.addView(b17);
                com.tencent.mm.plugin.sns.ui.bi biVar = this.R;
                android.widget.LinearLayout parent = this.f167522g;
                biVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addEcsViewToWidgetContainer", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
                kotlin.jvm.internal.o.g(parent, "parent");
                if (biVar.c()) {
                    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                    layoutParams.setMargins(0, i65.a.b(parent.getContext(), 4), 0, 0);
                    android.content.Context context2 = parent.getContext();
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    android.view.View d17 = com.tencent.mm.plugin.sns.ui.bi.d(biVar, context2, false, 2, null);
                    com.tencent.mm.plugin.sns.ui.bi.f167914c.f(d17, 15, biVar.f167915a);
                    parent.addView(d17, layoutParams);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addEcsViewToWidgetContainer", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addEcsViewToWidgetContainer", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
                }
            } else {
                this.f167522g.setVisibility(8);
            }
            if (this.f167522g.getVisibility() == 0) {
                this.f167522g.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.25
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$25");
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this;
                        int g17 = ud4.k.g(snsUploadUI.getContext());
                        snsUploadUI.f167522g.getViewTreeObserver().removeOnPreDrawListener(this);
                        int height = (snsUploadUI.f167522g.getHeight() - snsUploadUI.f167522g.getPaddingTop()) - snsUploadUI.f167522g.getPaddingBottom();
                        boolean z18 = snsUploadUI.f167536u instanceof com.tencent.mm.plugin.sns.ui.h2;
                        int i19 = com.tencent.mm.R.dimen.f479731dn;
                        if (!z18 && height <= g17) {
                            i19 = com.tencent.mm.R.dimen.f479657bu;
                        }
                        int f17 = i65.a.f(snsUploadUI.getContext(), i19);
                        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) snsUploadUI.f167522g.getLayoutParams();
                        if (layoutParams2.bottomMargin != f17) {
                            layoutParams2.bottomMargin = f17;
                            snsUploadUI.f167522g.setLayoutParams(layoutParams2);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$25");
                        return true;
                    }
                });
            }
            int i19 = this.f167533r;
            if (i19 == 9 || i19 == 14) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "attachWidget: show view: widget_line");
                android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.pmh);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) findViewById5.getLayoutParams();
                layoutParams2.addRule(3, com.tencent.mm.R.id.pm_);
                layoutParams2.topMargin = (int) (com.tencent.mm.sdk.platformtools.x.l0().density * (this.f167533r == 9 ? 128 : 96));
                findViewById5.setLayoutParams(layoutParams2);
            }
        }
        com.tencent.mm.plugin.sns.ui.z4 z4Var2 = this.f167536u;
        if ((z4Var2 instanceof com.tencent.mm.plugin.sns.ui.b5) || (z4Var2 instanceof com.tencent.mm.plugin.sns.ui.r5)) {
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) b17.getLayoutParams();
            layoutParams3.width = -1;
            b17.setLayoutParams(layoutParams3);
        }
        com.tencent.mm.plugin.sns.ui.z4 z4Var3 = this.f167536u;
        if ((z4Var3 instanceof com.tencent.mm.plugin.sns.ui.c2) || (z4Var3 instanceof com.tencent.mm.plugin.sns.ui.a2) || (z4Var3 instanceof com.tencent.mm.plugin.sns.ui.b2) || (z4Var3 instanceof com.tencent.mm.plugin.sns.ui.d2)) {
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) b17.getLayoutParams();
            layoutParams4.width = -1;
            b17.setLayoutParams(layoutParams4);
        }
        q7();
        if (this.f167533r == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initDragDropEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            com.tencent.mm.plugin.sns.ui.z4 z4Var4 = this.f167536u;
            if ((z4Var4 instanceof com.tencent.mm.plugin.sns.ui.p7) || (z4Var4 instanceof de4.a)) {
                com.tencent.mm.plugin.sns.model.l4.Uj().post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$2");
                        android.view.View.OnDragListener onDragListener = new android.view.View.OnDragListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.2.1
                            /* JADX WARN: Removed duplicated region for block: B:35:0x01be A[ADDED_TO_REGION] */
                            @Override // android.view.View.OnDragListener
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public boolean onDrag(android.view.View r26, android.view.DragEvent r27) {
                                /*
                                    Method dump skipped, instructions count: 595
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsUploadUI.AnonymousClass2.AnonymousClass1.onDrag(android.view.View, android.view.DragEvent):boolean");
                            }
                        };
                        int i27 = com.tencent.mm.plugin.sns.ui.SnsUploadUI.f167517x1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this;
                        android.widget.FrameLayout frameLayout = snsUploadUI.Y;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        if (frameLayout != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            android.widget.FrameLayout frameLayout2 = snsUploadUI.Y;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            frameLayout2.setOnDragListener(onDragListener);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$2");
                    }
                });
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDragDropEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsUploadUI", "widget is not instanceof PicWidget");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDragDropEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("attachWidget", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public final void a7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanDraftSessionId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (this.f167533r == 9) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_OPEN_UPLOAD_DRAFT_NEWTEXT_LAST_SESSIONID_STRING, this.I);
        } else {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_OPEN_UPLOAD_DRAFT_LAST_SESSIONID_STRING, this.I);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanDraftSessionId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public final void b7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exit", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.tencent.mm.plugin.sns.statistics.w0.f164989a.b(i17 == -1 ? 1 : 2);
        if (this.f167521f != null) {
            ta4.x0 d76 = d7();
            d76.d(this.f167521f.getLayout());
            d76.c(1, 2);
            d76.b();
        }
        if (this.f167518J) {
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            long c17 = c01.id.c();
            s0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSnsFinderEntrance", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            s0Var.J(10, "", 0, 0, c17, 0L, 0L, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSnsFinderEntrance", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_upload_is_cancel_save_draft", i17 == -1);
        setResult(0, intent);
        finish();
        ca4.z0.m();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exit", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c7() {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsUploadUI.c7():void");
    }

    public final ta4.x0 d7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInputAreaReporter", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (this.Q == null) {
            this.Q = new ta4.x0();
        }
        ta4.x0 x0Var = this.Q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInputAreaReporter", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return x0Var;
    }

    public final com.tencent.mm.plugin.sns.ui.z4 e7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWidgetFromCache", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        java.util.Map map = this.M;
        com.tencent.mm.plugin.sns.ui.z4 z4Var = (com.tencent.mm.plugin.sns.ui.z4) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
        if (z4Var == null) {
            if (i17 == 0) {
                z4Var = pc4.d.f353410a.B() ? new de4.a(this) : new com.tencent.mm.plugin.sns.ui.o7(this);
            } else if (i17 == 14) {
                z4Var = new com.tencent.mm.plugin.sns.ui.i6(this);
            } else if (i17 == 28) {
                z4Var = new com.tencent.mm.plugin.sns.ui.t2(this);
            }
            ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), z4Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWidgetFromCache", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return z4Var;
    }

    public final void f7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f167534s = getIntent().getBooleanExtra("KSnsPostManu", false);
        this.f167535t = getIntent().getLongExtra("KTouchCameraTime", 0L);
        int intExtra = getIntent().getIntExtra("Ksnsupload_type", 0);
        this.f167533r = intExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "initData shareType:%s", java.lang.Integer.valueOf(intExtra));
        this.f167525l1 = getIntent().getBooleanExtra("Kis_take_photo", false) ? 2 : 1;
        this.E = getIntent().getBooleanExtra("need_result", false);
        this.F = getIntent().getBooleanExtra("K_go_to_SnsTimeLineUI", false);
        this.H = getIntent().getStringExtra("Ksnsupload_canvas_info");
        this.I = getIntent().getStringExtra("KSessionID");
        this.f167518J = getIntent().getBooleanExtra("ksnsupload_finder_need_report", false);
        this.K = getIntent().getBooleanExtra("need_ban_back_tips", false);
        this.L = getIntent().getBooleanExtra("need_ban_pic_touch", false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.I)) {
            this.I = ca4.z0.l();
            getIntent().putExtra("KSessionID", this.I);
        } else {
            this.f167525l1 = 3;
        }
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        this.f167530p0 = o13.n.l(79);
        wa4.u uVar = (wa4.u) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(this, 2, wa4.u.class);
        if (uVar != null) {
            uVar.f444285d = this.f167530p0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g7(android.os.Bundle bundle) {
        java.lang.String string;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f167519d = (com.tencent.mm.plugin.sns.ui.WrapScollview) findViewById(com.tencent.mm.R.id.mcm);
        this.f167520e = findViewById(com.tencent.mm.R.id.n7x);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customizeInputView", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customizeInputView", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        fl5.i iVar = (fl5.i) findViewById(com.tencent.mm.R.id.n7y);
        this.f167521f = iVar;
        iVar.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479897ia) * i65.a.q(this));
        fl5.j g17 = fl5.j.g(this.f167521f);
        int n17 = ip.c.n();
        g17.f42561f = 0;
        g17.f42560e = n17;
        g17.f42556a = true;
        g17.d(null);
        this.f167521f.d(((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).cj());
        this.f167521f.getInputExtras(true).putInt("wechat_scene", 3);
        this.f167521f.getInputExtras(true).putBoolean("if_support_wx_emoji", true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSelectHelper", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        final ul5.k bounceView = getBounceView();
        if (bounceView != 0) {
            ((com.tencent.mm.ui.widget.pulldown.NestedBounceView) bounceView).c(new ul5.j() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.13
                @Override // ul5.j
                public void c(int i17) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBounceOffsetChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$13");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBounceOffsetChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$13");
                }

                @Override // ul5.j
                public void w(int i17) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBounceStart", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$13");
                    com.tencent.mm.plugin.sns.ui.SnsUploadUI.this.l7();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBounceStart", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$13");
                }
            });
        }
        this.f167521f.b(((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).bj(), com.tencent.mm.sdk.platformtools.m2.f(getContext()), new nl5.a0() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.14
            @Override // nl5.a0
            public void a(android.view.View view, nl5.z zVar, java.lang.String str) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClicked", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$14");
                long e17 = c01.id.e();
                if (zVar.f338398b == 2) {
                    com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this;
                    snsUploadUI.f167521f.getText().insert(snsUploadUI.f167521f.getSelectionStart(), snsUploadUI.f167521f.p().getString(com.tencent.mm.R.string.jo7));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    java.lang.String str2 = snsUploadUI.f167530p0;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    com.tencent.mm.plugin.sns.ui.SnsUploadUI.i7(2, "", "", e17, str2);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClicked", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$14");
            }

            @Override // nl5.a0
            public void b(java.util.List list, int i17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuInit", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$14");
                long e17 = c01.id.e();
                ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
                if (i17 != 8 && i17 != 1) {
                    ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
                    if (!su4.r2.l()) {
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this;
                        list.add(new nl5.z(snsUploadUI.f167521f.p().getString(com.tencent.mm.R.string.jo7), 2));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        java.lang.String str = snsUploadUI.f167530p0;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI.i7(1, "", "", e17, str);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuInit", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$14");
            }
        }, new nl5.w(this) { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.15
            @Override // nl5.w
            public nl5.y a(nl5.y yVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAppend", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$15");
                yVar.f338393h = true;
                yVar.f338394i = bounceView;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAppend", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$15");
                return yVar;
            }
        });
        this.f167521f.addTextChangedListener(new android.text.TextWatcher() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.16

            /* renamed from: d, reason: collision with root package name */
            public final java.util.List f167559d = new java.util.LinkedList();

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$16");
                com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this;
                android.text.Editable text = snsUploadUI.f167521f.getText();
                java.util.List list = this.f167559d;
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    text.removeSpan((android.text.style.ForegroundColorSpan) it.next());
                }
                ((java.util.LinkedList) list).clear();
                java.lang.String obj = snsUploadUI.f167521f.getText().toString();
                ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
                java.util.regex.Matcher matcher = com.tencent.mm.pluginsdk.ui.span.b0.f191186u.matcher(obj);
                while (matcher.find()) {
                    matcher.group();
                    int start = matcher.start();
                    int end = matcher.end();
                    snsUploadUI.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopicSpanLinkColor", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    int color = snsUploadUI.getResources().getColor(com.tencent.mm.R.color.Link_100);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopicSpanLinkColor", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(color);
                    ((java.util.LinkedList) list).add(foregroundColorSpan);
                    text.setSpan(foregroundColorSpan, start, end, 33);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$16");
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$16");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$16");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$16");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$16");
            }
        });
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSelectHelper", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(getIntent().getStringExtra("Kdescription"))) {
            this.f167521f.setText(pg5.d.a(getContext(), getIntent().getStringExtra("Kdescription")));
        } else if (this.f167521f != null && bundle != null && (string = bundle.getString("contentdesc")) != null) {
            this.f167521f.setText(string);
        }
        if (this.f167533r == 8) {
            this.f167521f.setText(pg5.d.a(getContext(), getIntent().getStringExtra("Kdescription")));
        }
        this.f167521f.setPasterLen(getIntent().getIntExtra("KparseLen", 0));
        com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter = (com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter) findViewById(com.tencent.mm.R.id.m9x);
        this.f167528o = absSnsUploadSayFooter;
        absSnsUploadSayFooter.setMMEditText(this.f167521f);
        this.f167528o.setVisibility(4);
        this.Y = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.m7m);
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        com.tencent.mm.plugin.sns.model.l4.Hj().V2(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f167521f.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.6

            /* renamed from: d, reason: collision with root package name */
            public long f167585d;

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$6");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUploadUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (java.lang.System.currentTimeMillis() - this.f167585d > 500) {
                    com.tencent.mm.plugin.sns.ui.SnsUploadUI.V6(com.tencent.mm.plugin.sns.ui.SnsUploadUI.this);
                }
                this.f167585d = java.lang.System.currentTimeMillis();
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$6");
            }
        });
        this.f167521f.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.7
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(android.view.View view) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$7");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUploadUI$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                com.tencent.mm.plugin.sns.ui.SnsUploadUI.V6(com.tencent.mm.plugin.sns.ui.SnsUploadUI.this);
                yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$7");
                return false;
            }
        });
        final boolean[] zArr = {true};
        final boolean[] zArr2 = {false};
        this.f167521f.addTextChangedListener(new android.text.TextWatcher() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.8
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$8");
                com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this;
                com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter2 = snsUploadUI.f167528o;
                java.lang.String obj = snsUploadUI.f167521f.getText().toString();
                absSnsUploadSayFooter2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkTipsVisibilityByText", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
                com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget snsEditTipsWidget = absSnsUploadSayFooter2.f170760m;
                if (snsEditTipsWidget != null) {
                    snsEditTipsWidget.b(obj);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkTipsVisibilityByText", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$8");
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$8");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$8");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$8");
                boolean[] zArr3 = zArr;
                boolean z18 = zArr3[0];
                fo3.s sVar = fo3.s.INSTANCE;
                if (z18) {
                    zArr3[0] = false;
                    sVar.Ab("ie_sns_upload");
                }
                sVar.a6("ie_sns_upload");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$8");
            }
        });
        this.f167519d.setContentView(this.f167521f.j());
        this.f167519d.setDoComputeScrollDeltaToGetChildRectOnScreen(false);
        java.lang.String stringExtra = getIntent().getStringExtra("reportSessionId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.plugin.sns.ui.SnsUploadConfigView snsUploadConfigView = (com.tencent.mm.plugin.sns.ui.SnsUploadConfigView) findViewById(com.tencent.mm.R.id.c9w);
        this.f167529p = snsUploadConfigView;
        boolean z18 = this.f167533r == 14 && !stringExtra.contains("wx5dfbe0a95623607b");
        snsUploadConfigView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSettings", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        snsUploadConfigView.f167514n = z18;
        if (z18) {
            gm0.j1.i();
            gm0.j1.n().f273288b.a(2842, snsUploadConfigView);
            com.tencent.mm.plugin.sns.model.h2 h2Var = new com.tencent.mm.plugin.sns.model.h2(-1216949095);
            gm0.j1.i();
            gm0.j1.n().f273288b.g(h2Var);
        }
        r45.ed4 ed4Var = snsUploadConfigView.f167516p;
        ed4Var.f373312e = -1000.0f;
        ed4Var.f373311d = -1000.0f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restoreSyncFlagStatus", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        if (snsUploadConfigView.f167511h) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreSyncFlagStatus", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        } else {
            gm0.j1.i();
            com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(68404, null));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreSyncFlagStatus", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        }
        snsUploadConfigView.a();
        snsUploadConfigView.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSettings", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        if (this.f167533r != 0) {
            com.tencent.mm.plugin.sns.ui.SnsUploadConfigView snsUploadConfigView2 = this.f167529p;
            snsUploadConfigView2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSyncGone", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            snsUploadConfigView2.f167507d.setVisibility(8);
            snsUploadConfigView2.f167508e.setVisibility(8);
            snsUploadConfigView2.f167512i = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSyncGone", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        }
        if (this.f167533r == 9) {
            com.tencent.mm.plugin.sns.ui.SnsUploadConfigView snsUploadConfigView3 = this.f167529p;
            snsUploadConfigView3.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showQzone", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            if (snsUploadConfigView3.f167509f && snsUploadConfigView3.f167510g) {
                snsUploadConfigView3.f167507d.setVisibility(0);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showQzone", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        }
        setBackBtnVisible(false);
        getController().x0(getString(com.tencent.mm.R.string.f490347sg), new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.9
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$9");
                int i17 = com.tencent.mm.plugin.sns.ui.SnsUploadUI.f167517x1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                com.tencent.mm.plugin.sns.ui.SnsUploadUI.this.c7();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$9");
            }
        });
        xa4.b.f452821a.d("view_exp");
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.je8), new com.tencent.mm.plugin.sns.ui.SnsUploadUI.AnonymousClass10(zArr2), null, new android.view.View.OnTouchListener(this) { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.11
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
            
                if (r13 != 6) goto L12;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
                /*
                    r12 = this;
                    java.lang.String r0 = "onTouch"
                    java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsUploadUI$11"
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/SnsUploadUI$11"
                    java.lang.String r3 = "android/view/View$OnTouchListener"
                    java.lang.String r4 = "onTouch"
                    java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r6.<init>()
                    r6.add(r13)
                    r6.add(r14)
                    java.lang.Object[] r7 = r6.toArray()
                    r6.clear()
                    r6 = r12
                    yj0.a.b(r2, r3, r4, r5, r6, r7)
                    int r13 = r14.getAction()
                    fo3.s r2 = fo3.s.INSTANCE
                    r3 = 0
                    r4 = 1
                    java.lang.String r5 = "ce_sns_upload"
                    if (r13 == 0) goto L43
                    if (r13 == r4) goto L3c
                    r6 = 5
                    if (r13 == r6) goto L43
                    r4 = 6
                    if (r13 == r4) goto L3c
                    goto L4c
                L3c:
                    r2.H2(r5, r14)
                    r2.Qa(r5)
                    goto L4c
                L43:
                    boolean[] r13 = r2
                    r13[r3] = r4
                    java.lang.String r13 = "<SnsUpload>"
                    r2.Z7(r5, r13)
                L4c:
                    java.lang.String r8 = "com/tencent/mm/plugin/sns/ui/SnsUploadUI$11"
                    java.lang.String r9 = "android/view/View$OnTouchListener"
                    java.lang.String r10 = "onTouch"
                    java.lang.String r11 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                    r6 = 0
                    r7 = r12
                    yj0.a.i(r6, r7, r8, r9, r10, r11)
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsUploadUI.AnonymousClass11.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        }, com.tencent.mm.ui.fb.GREEN);
        findViewById(com.tencent.mm.R.id.otq).setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.12
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$12");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUploadUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                if (com.tencent.mm.plugin.sns.ui.SnsUploadUI.this.l7()) {
                    yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$12");
                    return true;
                }
                yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$12");
                return false;
            }
        });
        com.tencent.mm.plugin.sns.model.o7 Nj = com.tencent.mm.plugin.sns.model.l4.Nj();
        boolean z19 = !this.f167534s;
        Nj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsReportShareFlag", "com.tencent.mm.plugin.sns.model.UploadManager");
        Nj.f164558c = z19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsReportShareFlag", "com.tencent.mm.plugin.sns.model.UploadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupInputScrollWithV2Config", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.tencent.mm.plugin.sns.ui.hu huVar = new com.tencent.mm.plugin.sns.ui.hu(getContext());
        int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479657bu);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExtraPadding", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        huVar.f168537d = h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExtraPadding", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        android.view.View containerView = findViewById(com.tencent.mm.R.id.otq);
        fl5.i inputView = this.f167521f;
        com.tencent.mm.plugin.sns.ui.WrapScollview scrollView = this.f167519d;
        com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter footer = this.f167528o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUpView", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(inputView, "inputView");
        kotlin.jvm.internal.o.g(scrollView, "scrollView");
        kotlin.jvm.internal.o.g(footer, "footer");
        containerView.setOnTouchListener(null);
        huVar.f168540g = inputView;
        huVar.f168541h = scrollView;
        huVar.f168542i = footer;
        scrollView.setCheckInterceptTouchEventByCheckArea(false);
        inputView.j().setOnTouchListener(new com.tencent.mm.plugin.sns.ui.eu(footer, scrollView, huVar));
        inputView.setSelectionChangedListener(new com.tencent.mm.plugin.sns.ui.fu(huVar, footer, inputView));
        footer.setUploadFooterPanelChangeListener(new com.tencent.mm.plugin.sns.ui.gu(inputView, footer, huVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUpView", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupInputScrollWithV2Config", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.tencent.mm.plugin.sns.ui.AtContactWidget atContactWidget = (com.tencent.mm.plugin.sns.ui.AtContactWidget) findViewById(com.tencent.mm.R.id.a5o);
        this.f167524i = atContactWidget;
        com.tencent.mm.plugin.sns.ui.SnsUploadConfigView snsUploadConfigView4 = this.f167529p;
        atContactWidget.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initWidget", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        atContactWidget.f166245m = snsUploadConfigView4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initWidget", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        com.tencent.mm.plugin.sns.ui.LocationWidget locationWidget = (com.tencent.mm.plugin.sns.ui.LocationWidget) findViewById(com.tencent.mm.R.id.f485692io1);
        this.f167526m = locationWidget;
        locationWidget.setLocationWidgetListener(this);
        switch (this.f167533r) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 40:
            case 41:
            case 42:
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
            case 44:
            case 45:
            case 46:
                android.view.ViewStub viewStub = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.f486516li1);
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
                viewStub.setLayoutResource(z17 ? com.tencent.mm.R.layout.cun : com.tencent.mm.R.layout.cuo);
                this.f167527n = (com.tencent.mm.plugin.sns.ui.BaseRangeWidget) viewStub.inflate();
                break;
        }
        this.f167527n.a(this.f167529p);
        this.f167527n.setRangeTipClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI$$b
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.util.Iterator it;
                boolean z27;
                boolean z28;
                boolean z29;
                int i17 = com.tencent.mm.plugin.sns.ui.SnsUploadUI.f167517x1;
                com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this;
                snsUploadUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUploadUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", snsUploadUI, array);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$initView$1", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUploadUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", snsUploadUI, array2);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "restoreLastRangeInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restoreLastRangeInfo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                wa4.x g18 = com.tencent.mm.plugin.sns.model.l4.Nj().g();
                java.util.Iterator it6 = g18.f444299d.iterator();
                boolean z37 = true;
                boolean z38 = true;
                while (it6.hasNext()) {
                    wa4.y yVar = (wa4.y) it6.next();
                    int i18 = yVar.f444306e;
                    if (i18 == 2) {
                        gm0.j1.i();
                        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f444305d, z37);
                        if (n18 != null && ((int) n18.E2) != 0) {
                            arrayList3.add(yVar.f444305d);
                        }
                        it = it6;
                        z27 = z37;
                    } else if (i18 == z37) {
                        if (z38) {
                            snsUploadUI.f167543z.clear();
                            z38 = false;
                        }
                        snsUploadUI.f167543z.add(yVar.f444305d);
                        java.lang.String g19 = ((b93.b) c93.a.a()).g(yVar.f444305d);
                        if (g19 != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                            it = it6;
                            boolean z39 = z38;
                            int r18 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_GROUP_INT_SYNC, 0);
                            if (r18 == 0) {
                                z27 = true;
                                boolean z47 = cc4.a.f40481a;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                                z28 = z47;
                            } else if (r18 != 2) {
                                if (cc4.a.f40481a) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl false");
                                    z29 = false;
                                    cc4.a.f40481a = false;
                                } else {
                                    z29 = false;
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                                z28 = z29;
                                z27 = true;
                            } else {
                                if (cc4.a.f40481a) {
                                    z27 = true;
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl true");
                                    z27 = true;
                                    cc4.a.f40481a = true;
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                                z28 = z27;
                            }
                            if (z28) {
                                if (!com.tencent.mm.sdk.platformtools.t8.L0(((b93.b) c93.a.a()).j(yVar.f444305d))) {
                                    arrayList4.add(g19);
                                }
                            } else {
                                arrayList4.add(g19);
                            }
                            z38 = z39;
                        } else {
                            z37 = true;
                        }
                    } else {
                        it = it6;
                        z27 = z37;
                        if (i18 == 0) {
                            arrayList5.add(yVar.f444305d);
                        }
                    }
                    z37 = z27;
                    it6 = it;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "[restoreLastRangeInfo] mLabelIdList:%s", snsUploadUI.f167543z);
                snsUploadUI.f167541y = com.tencent.mm.sdk.platformtools.t8.c1(arrayList3, ",");
                snsUploadUI.f167537v = com.tencent.mm.sdk.platformtools.t8.c1(arrayList4, ",");
                snsUploadUI.f167539x = com.tencent.mm.sdk.platformtools.t8.c1(arrayList5, ",");
                java.util.LinkedList linkedList = g18.f444303h;
                java.util.LinkedList linkedList2 = g18.f444304i;
                java.util.LinkedList linkedList3 = g18.f444302g;
                snsUploadUI.getIntent().putStringArrayListExtra("label_id", snsUploadUI.f167543z);
                snsUploadUI.getIntent().putExtra("Kother_user_name_list", snsUploadUI.f167539x);
                snsUploadUI.getIntent().putExtra("Klabel_name_list", snsUploadUI.f167537v);
                snsUploadUI.getIntent().putExtra("Kchat_room_name_list", snsUploadUI.f167541y);
                snsUploadUI.getIntent().putStringArrayListExtra("KInteract_user_list", new java.util.ArrayList<>(linkedList3));
                snsUploadUI.getIntent().putStringArrayListExtra("KExclude_user_list", new java.util.ArrayList<>(linkedList));
                snsUploadUI.getIntent().putStringArrayListExtra("KExclude_label_list", new java.util.ArrayList<>(linkedList2));
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "[restoreLastRangeInfo] mLabelNameList size:%d", java.lang.Integer.valueOf(arrayList4.size()));
                if (g18.f444301f) {
                    snsUploadUI.getIntent().putExtra("Ktag_range_index", 3);
                } else {
                    snsUploadUI.getIntent().putExtra("Ktag_range_index", 2);
                }
                snsUploadUI.o7(snsUploadUI.getIntent());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreLastRangeInfo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                yj0.a.h(snsUploadUI, "com/tencent/mm/plugin/sns/ui/SnsUploadUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$initView$1", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                yj0.a.h(snsUploadUI, "com/tencent/mm/plugin/sns/ui/SnsUploadUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRangeWidgetRangeChangeCallback", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f167527n.setSnsRangeChangeComplexCallback(new com.tencent.mm.plugin.sns.ui.SnsUploadUI$$c(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRangeWidgetRangeChangeCallback", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f167526m.d(10, -1, getIntent());
        this.f167524i.e(6, -1, getIntent(), this.f167527n.getLabelRange() == 0);
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        s0Var.U(0);
        s0Var.B().f61240g = 2;
        o7(getIntent());
        hideVKB();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        boolean v07 = com.tencent.mm.ui.bk.v0();
        int i17 = com.tencent.mm.R.layout.cur;
        if (v07 && com.tencent.mm.ui.bk.y()) {
            if (fp.h.c(30) && com.tencent.mm.ui.ee.a(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "getLayoutId: use v2 layout large");
            } else if ((com.tencent.mm.ui.bk.N(getTaskId()) || (com.tencent.mm.ui.bk.O(getContentResolver()) && !isInMultiWindowMode())) && !com.tencent.mm.ui.ee.b(getTaskId())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "getLayoutId: use v2 layout large");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "getLayoutId: use v2 layout");
            }
            i17 = com.tencent.mm.R.layout.cuq;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "getLayoutId: use v2 layout, no magic window");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return i17;
    }

    public final void h7(java.lang.Boolean bool) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reflectSetBundleDefusable", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (fp.h.c(33) && ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_reflect_set_bundle_defuse, true)) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "reflectBundleDefusable: defusable:%b, build version:%d", bool, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
                java.lang.reflect.Method declaredMethod = android.os.BaseBundle.class.getDeclaredMethod("setShouldDefuse", java.lang.Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, bool);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsUploadUI", e17, "reflectSetBundleDefusable failed", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reflectSetBundleDefusable", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean isCallSuperOnSaveInstanceState() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCallSuperOnSaveInstanceState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_media_opt_saveinstance, true) && (com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCallSuperOnSaveInstanceState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return z17;
    }

    public final void j7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSnsPostGroup", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct B = s0Var.B();
        B.f61237d = B.b("SessionID", this.I, true);
        s0Var.B().f61255v = i17;
        if (i17 == 3 || i17 == 2) {
            s0Var.K();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSnsPostGroup", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public final void k7() {
        java.lang.String str;
        java.util.Map map;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSnsPostInfo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        dx1.g.f244489a.j("SnsPublishProcess", "opresult_", java.lang.Integer.valueOf(this.f167542y0), bx1.u.f36309d);
        w52.g gVar = (w52.g) ((e42.f0) i95.n0.c(e42.f0.class));
        gVar.Di("startTime", this.f167540x0 + "");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append("");
        gVar.Di("endTime", sb6.toString());
        gVar.Di("bussinessId", this.I);
        gVar.Di("shareType", this.f167533r + "");
        gVar.Di("hadLocation", this.f167526m.getShowFlag() + "");
        gVar.Di("desc", this.f167521f.getText().toString());
        gVar.Di("nextStep", this.f167542y0 + "");
        gVar.Di("beforeStep", this.f167525l1 + "");
        gVar.Di("ContactTagCount", this.B + "");
        gVar.Di("mIsBlackGroup", this.D + "");
        if (this.A != null) {
            str = this.A.size() + "";
        } else {
            str = "0";
        }
        gVar.Di("mContactNameList", str);
        com.tencent.mm.plugin.sns.ui.z4 z4Var = this.f167536u;
        if (z4Var instanceof com.tencent.mm.plugin.sns.ui.p7) {
            com.tencent.mm.plugin.sns.ui.p7 p7Var = (com.tencent.mm.plugin.sns.ui.p7) z4Var;
            p7Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPathsSourceMap", "com.tencent.mm.plugin.sns.ui.PicWidget");
            java.util.HashMap hashMap = new java.util.HashMap();
            com.tencent.mm.plugin.sns.ui.x7 x7Var = p7Var.f170164g;
            if (x7Var != null && !com.tencent.mm.plugin.sns.ui.x7.a(x7Var).isEmpty()) {
                java.util.Iterator it = com.tencent.mm.plugin.sns.ui.x7.a(x7Var).iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
                    java.util.Map map2 = x7Var.f171493b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
                    if (((java.lang.Boolean) ((java.util.HashMap) map2).get(str2)) != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
                        hashMap.put(str2, (java.lang.Boolean) ((java.util.HashMap) map2).get(str2));
                    }
                }
            }
            if (x7Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
                map = x7Var.f171493b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
            } else {
                map = null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPathsSourceMap", "com.tencent.mm.plugin.sns.ui.PicWidget");
            if (map != null && !map.isEmpty()) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.util.Iterator it6 = map.values().iterator();
                while (it6.hasNext()) {
                    sb7.append(((java.lang.Boolean) it6.next()).booleanValue() ? 1 : 2);
                    sb7.append("#");
                }
                gVar.Di("picSource", sb7.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.z4 z4Var2 = this.f167536u;
        if (z4Var2 instanceof de4.a) {
            de4.a aVar = (de4.a) z4Var2;
            aVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPathsSourceMap", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
            fe4.b v17 = ((ee4.b1) aVar.k(ee4.b1.class)).v();
            v17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPathSourceMap", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
            java.util.HashMap hashMap2 = v17.f261564c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPathSourceMap", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPathsSourceMap", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
            if (!hashMap2.isEmpty()) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                java.util.Iterator it7 = hashMap2.values().iterator();
                while (it7.hasNext()) {
                    sb8.append(((java.lang.Boolean) it7.next()).booleanValue() ? 1 : 2);
                    sb8.append("#");
                }
                gVar.Di("picSource", sb8.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.z4 z4Var3 = this.f167536u;
        if (z4Var3 instanceof com.tencent.mm.plugin.sns.ui.i6) {
            com.tencent.mm.plugin.sns.ui.i6 i6Var = (com.tencent.mm.plugin.sns.ui.i6) z4Var3;
            i6Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLocalCaptureVideo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            r45.vh4 vh4Var = i6Var.f168582p;
            boolean z18 = vh4Var != null ? vh4Var.f388235e : false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLocalCaptureVideo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            gVar.Di("sightSource", z18 ? "1" : "2");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSnsPostInfo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public boolean l7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetFooter", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "resetFooter: ");
        hideVKB();
        if (!this.f167528o.b()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetFooter", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return false;
        }
        this.f167528o.g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetFooter", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return true;
    }

    public void m7(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetWidget", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "resetWidget");
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView = this.f167532q;
        if (dynamicGridView != null) {
            dynamicGridView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = this.f167522g;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.f167522g.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.z4 z4Var = this.f167536u;
        if (z4Var != null) {
            z4Var.e();
        }
        f7();
        Z6(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetWidget", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void n7(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHasCommited", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.G = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHasCommited", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void o7(android.content.Intent intent) {
        java.util.List list;
        final java.util.List list2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRange", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f167527n.b(5, -1, intent, this.f167524i);
        this.f167524i.g(this.f167527n.getLabelRange() == 0);
        final int intExtra = intent.getIntExtra("Ktag_range_index", 0);
        if (intExtra >= 2) {
            this.f167537v = intent.getStringExtra("Klabel_name_list");
            this.f167538w = intent.getStringExtra("KNew_label_name_list");
            this.f167539x = intent.getStringExtra("Kother_user_name_list");
            this.f167541y = intent.getStringExtra("Kchat_room_name_list");
            this.f167543z = intent.getStringArrayListExtra("label_id");
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f167537v)) {
                list = null;
            } else {
                list = java.util.Arrays.asList(this.f167537v.split(","));
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "[setRange] mLabelNameList size:%d", java.lang.Integer.valueOf(list.size()));
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f167539x)) {
                list2 = null;
            } else {
                list2 = java.util.Arrays.asList(this.f167539x.split(","));
                com.tencent.mm.plugin.sns.statistics.s0.f164937k0.T(list2);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f167538w)) {
                if (list2 == null) {
                    list2 = java.util.Arrays.asList(this.f167538w.split(","));
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.addAll(list2);
                    arrayList.addAll(java.util.Arrays.asList(this.f167538w.split(",")));
                    list2 = arrayList;
                }
            }
            final java.util.List asList = com.tencent.mm.sdk.platformtools.t8.K0(this.f167541y) ? null : java.util.Arrays.asList(this.f167541y.split(","));
            if (com.tencent.mm.sdk.platformtools.t8.L0(this.f167543z)) {
                this.f167543z = new java.util.ArrayList();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "[setRange] mLabelIdList:%s", this.f167543z);
            final java.util.List list3 = list;
            com.tencent.mm.plugin.sns.model.l4.Uj().post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.19
                @Override // java.lang.Runnable
                public void run() {
                    boolean z17;
                    java.util.Iterator it;
                    com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct;
                    com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct2;
                    com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct3;
                    java.util.Iterator it6;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$19");
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
                    java.util.List<java.lang.String> list4 = list2;
                    com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this;
                    if (z17) {
                        int i17 = 0;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int i18 = com.tencent.mm.plugin.sns.ui.SnsUploadUI.f167517x1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2302", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        snsUploadUI.A = arrayList2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2302", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        if (!com.tencent.mm.sdk.platformtools.t8.L0(list4)) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList(list4);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2302", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            snsUploadUI.A = arrayList3;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2302", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        java.util.ArrayList arrayList4 = snsUploadUI.f167543z;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLabelReportStructByLabelIdList", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = snsUploadUI.N;
                        concurrentHashMap.clear();
                        if (arrayList4 != null && arrayList4.size() > 0) {
                            java.util.Iterator it7 = arrayList4.iterator();
                            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                            int i19 = intExtra;
                            java.util.Set w17 = s0Var.w(i19);
                            if (w17 == null) {
                                w17 = new java.util.HashSet();
                            }
                            while (it7.hasNext()) {
                                java.lang.String str = (java.lang.String) it7.next();
                                java.util.List<java.lang.String> j17 = ((b93.b) c93.a.a()).j(str);
                                if (j17 == null || j17.size() == 0) {
                                    it = it7;
                                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsUploadUI", "[updateLabelReportStructByLabelIdList] namList empty, labelId is %s", str);
                                } else {
                                    it = it7;
                                    java.lang.String g17 = ((b93.b) c93.a.a()).g(str);
                                    for (java.lang.String str2 : j17) {
                                    }
                                    if (g17 == null) {
                                        com.tencent.mars.xlog.Log.e("MicroMsg.SnsUploadUI", "[updateLabelReportStructByLabelIdList] labelName empty, labelId is %s", str);
                                    } else {
                                        if (w17.contains(str)) {
                                            i17++;
                                        }
                                        concurrentHashMap.put(g17, j17);
                                    }
                                }
                                it7 = it;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "updateLabelReportStructByLabelIdList: selectVisibleState:%d, matchCountFromSearch:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
                            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.B().M = i17;
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLabelReportStructByLabelIdList", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    } else {
                        int i27 = com.tencent.mm.plugin.sns.ui.SnsUploadUI.f167517x1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        snsUploadUI.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContactNamesFromLabelsAndOtherUserName", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        snsUploadUI.A = new java.util.ArrayList();
                        snsUploadUI.B = 0;
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = snsUploadUI.N;
                        concurrentHashMap2.clear();
                        java.util.List list5 = list3;
                        if (list5 != null && list5.size() > 0) {
                            java.util.Iterator it8 = list5.iterator();
                            java.util.HashSet hashSet = new java.util.HashSet();
                            while (it8.hasNext()) {
                                java.lang.String str3 = (java.lang.String) it8.next();
                                java.util.Iterator it9 = it8;
                                java.util.List j18 = ((b93.b) c93.a.a()).j(((b93.b) c93.a.a()).e(str3));
                                if (j18 == null || j18.size() == 0) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsUploadUI", "dz: getContactNamesFromLabelsAndOtherUserName,namelist get bu label is null");
                                    break;
                                }
                                for (java.util.Iterator it10 = j18.iterator(); it10.hasNext(); it10 = it10) {
                                    hashSet.add((java.lang.String) it10.next());
                                    snsUploadUI.B++;
                                }
                                concurrentHashMap2.put(str3, j18);
                                it8 = it9;
                            }
                            snsUploadUI.A = new java.util.ArrayList(hashSet);
                        }
                        if (list5 != null) {
                            java.util.Iterator it11 = list5.iterator();
                            int i28 = 0;
                            while (it11.hasNext()) {
                                if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) it11.next())) {
                                    i28++;
                                }
                            }
                            snsUploadUI.B = i28;
                        }
                        snsUploadUI.C = 0;
                        if (list4 != null && list4.size() > 0) {
                            for (java.lang.String str4 : list4) {
                                if (!snsUploadUI.A.contains(str4)) {
                                    snsUploadUI.A.add(str4);
                                    snsUploadUI.C++;
                                }
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContactNamesFromLabelsAndOtherUserName", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    }
                    int i29 = com.tencent.mm.plugin.sns.ui.SnsUploadUI.f167517x1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    snsUploadUI.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContactNamesFromChatroom", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    java.util.Map map = snsUploadUI.P;
                    java.util.List list6 = asList;
                    if (list6 == null || list6.isEmpty()) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContactNamesFromChatroom", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    } else {
                        java.util.HashMap hashMap = (java.util.HashMap) map;
                        hashMap.clear();
                        java.util.Iterator it12 = list6.iterator();
                        while (it12.hasNext()) {
                            java.lang.String str5 = (java.lang.String) it12.next();
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                            java.util.List<java.lang.String> n17 = c01.v1.n(str5);
                            if (n17 != null) {
                                ((java.util.LinkedList) n17).size();
                                for (java.lang.String str6 : n17) {
                                    if (snsUploadUI.A.contains(str6) || !c01.e2.J(str6)) {
                                        it6 = it12;
                                    } else {
                                        it6 = it12;
                                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "getContactNamesFromChatroom memberName:%s", str6);
                                        snsUploadUI.A.add(str6);
                                        snsUploadUI.C++;
                                    }
                                    if (c01.e2.J(str6)) {
                                        arrayList5.add(str6);
                                    }
                                    it12 = it6;
                                }
                                arrayList5.size();
                                hashMap.put(str5, arrayList5);
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContactNamesFromChatroom", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = snsUploadUI.N;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    if (concurrentHashMap3 != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        if (!concurrentHashMap3.isEmpty()) {
                            com.tencent.mm.plugin.sns.statistics.s0 s0Var2 = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            java.util.ArrayList arrayList6 = snsUploadUI.f167543z;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            s0Var2.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSelectedLabelReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                            if (concurrentHashMap3 != null && !concurrentHashMap3.isEmpty() && (timelineGroupUserBehaviorStruct3 = s0Var2.f164959l) != null) {
                                timelineGroupUserBehaviorStruct3.f61256w = concurrentHashMap3.keySet().size();
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                for (java.util.Map.Entry entry : concurrentHashMap3.entrySet()) {
                                    java.util.List list7 = (java.util.List) entry.getValue();
                                    if (list7 != null) {
                                        sb6.append((java.lang.String) entry.getKey());
                                        sb6.append("|");
                                        sb6.append(list7.size());
                                        sb6.append(";");
                                    }
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.SnsReportHelper", "[updateSelectedLabelReport] SelectedLabelList size:%d", java.lang.Integer.valueOf(concurrentHashMap3.size()));
                                com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct4 = s0Var2.f164959l;
                                timelineGroupUserBehaviorStruct4.f61257x = timelineGroupUserBehaviorStruct4.b("SelectedLabelList", sb6.toString(), true);
                            }
                            if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList6) && (timelineGroupUserBehaviorStruct2 = s0Var2.f164959l) != null) {
                                timelineGroupUserBehaviorStruct2.C = timelineGroupUserBehaviorStruct2.b("SelectedLabelidList", com.tencent.mm.sdk.platformtools.t8.c1(arrayList6, ";"), true);
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSelectedLabelReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    if (map != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        if (!((java.util.HashMap) map).isEmpty()) {
                            com.tencent.mm.plugin.sns.statistics.s0 s0Var3 = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            s0Var3.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSelectedChatroomReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                            if (map != null) {
                                java.util.HashMap hashMap2 = (java.util.HashMap) map;
                                if (!hashMap2.isEmpty() && (timelineGroupUserBehaviorStruct = s0Var3.f164959l) != null) {
                                    timelineGroupUserBehaviorStruct.f61250q = hashMap2.keySet().size();
                                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                    for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
                                        java.util.List list8 = (java.util.List) entry2.getValue();
                                        if (list8 != null) {
                                            sb7.append((java.lang.String) entry2.getKey());
                                            sb7.append("|");
                                            sb7.append(list8.size());
                                            sb7.append(";");
                                        }
                                    }
                                    com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct5 = s0Var3.f164959l;
                                    timelineGroupUserBehaviorStruct5.f61251r = timelineGroupUserBehaviorStruct5.b("SelectedChatroomList", sb7.toString(), true);
                                }
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSelectedChatroomReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$19");
                }
            });
            if (intExtra == 2) {
                this.D = false;
            } else {
                this.D = true;
            }
        } else if (!com.tencent.mm.sdk.platformtools.t8.L0(this.A)) {
            this.A.clear();
        }
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.U(intExtra);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRange", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        int i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.onActivityResult(i17, i18, intent);
        dx1.f fVar = dx1.g.f244489a;
        fVar.j("SnsPublishProcess", "editPageTimes", 1, bx1.u.f36310e);
        com.tencent.mm.plugin.sns.statistics.i0 i0Var = com.tencent.mm.plugin.sns.statistics.j0.f164861a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addTraceFromRequestCode", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        switch (i17) {
            case 5:
                i19 = 4;
                break;
            case 6:
                i19 = 3;
                break;
            case 7:
                i19 = 6;
                break;
            case 8:
            default:
                i19 = -1;
                break;
            case 9:
                i19 = 7;
                break;
            case 10:
                i19 = 2;
                break;
            case 11:
                i19 = 8;
                break;
            case 12:
                i19 = 9;
                break;
        }
        if (i19 != -1) {
            fVar.j("SnsPublishProcess", "actionTrace_", java.lang.Integer.valueOf(i19), bx1.u.f36311f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addTraceFromRequestCode", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        fl5.i iVar = this.f167521f;
        if (iVar != null) {
            iVar.clearFocus();
        }
        if (i18 != -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return;
        }
        if (i17 == 30764) {
            android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
            if (bundleExtra != null && bundleExtra.getString("go_next", "").equals("gdpr_auth_location")) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                androidx.appcompat.app.AppCompatActivity context = getContext();
                ((sb0.f) jVar).getClass();
                j35.u.i(context, "android.permission.ACCESS_FINE_LOCATION", 64);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return;
        }
        if (this.f167536u.onActivityResult(i17, i18, intent)) {
            q7();
        }
        if (i17 != 5) {
            if (i17 != 6) {
                if (i17 == 10) {
                    if (intent == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        return;
                    }
                    java.lang.String stringExtra = intent.getStringExtra("get_poi_name");
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    java.lang.String stringExtra2 = intent.getStringExtra("get_city");
                    java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
                    if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                        getIntent().removeExtra("get_poi_name");
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        getIntent().removeExtra("get_city");
                    }
                    getIntent().putExtras(intent.getExtras());
                    this.f167526m.d(i17, i18, intent);
                }
            } else if (intent == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                return;
            } else {
                getIntent().putExtras(intent.getExtras());
                this.f167524i.e(i17, i18, intent, this.f167527n.getLabelRange() == 0);
                this.f167527n.f166249d = !com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("Select_Contact"));
            }
        } else if (intent == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return;
        } else {
            getIntent().putExtras(intent.getExtras());
            o7(intent);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0418  */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r37) {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsUploadUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.SnsUploadConfigView snsUploadConfigView = this.f167529p;
        if (snsUploadConfigView != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            gm0.j1.i();
            gm0.j1.n().f273288b.q(2842, snsUploadConfigView);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        }
        com.tencent.mm.plugin.sns.ui.z4 z4Var = this.f167536u;
        if (z4Var != null) {
            z4Var.e();
        }
        com.tencent.mm.plugin.sns.ui.LocationWidget locationWidget = this.f167526m;
        if (locationWidget != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            i11.e eVar = locationWidget.E;
            if (eVar != null) {
                ((i11.h) eVar).m(locationWidget.H);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        }
        com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter = this.f167528o;
        if (absSnsUploadSayFooter != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = absSnsUploadSayFooter.f170757g;
            if (chatFooterPanel != null) {
                chatFooterPanel.l();
                absSnsUploadSayFooter.f170757g.a();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        }
        com.tencent.mm.ui.widget.dialog.f4 f4Var = this.T;
        if (f4Var != null && f4Var.isShowing()) {
            this.T.cancel();
        }
        ((java.util.HashMap) this.M).clear();
        fo3.s.INSTANCE.E7("ie_sns_upload");
        ca4.z0.m();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unregHellBizId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f167531p1.dead();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unregHellBizId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        fl5.i iVar = this.f167521f;
        if (iVar != null) {
            iVar.destroy();
        }
        com.tencent.mm.plugin.sns.statistics.i0 i0Var = com.tencent.mm.plugin.sns.statistics.j0.f164861a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(i0Var.h())) {
            i0Var.n("");
        }
        dx1.g.f244489a.j("SnsPublishProcess", "editPageStaytime_", java.lang.Long.valueOf(getActivityBrowseTimeMs()), bx1.u.f36310e);
        if (this.f167542y0 != 3) {
            i0Var.d(null);
        }
        ((b93.b) c93.a.a()).getClass();
        b93.r.wi().D0();
        dw3.k.f244219a.d(je4.c.f299317a.a());
        h7(java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (keyEvent.getKeyCode() != 4) {
            boolean onKeyDown = super.onKeyDown(i17, keyEvent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return onKeyDown;
        }
        com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter = this.f167528o;
        absSnsUploadSayFooter.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSmileVisble", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        boolean z17 = absSnsUploadSayFooter.b() && absSnsUploadSayFooter.getVisibility() == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSmileVisble", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "onKeyDown: back, panel & footer is visible");
            this.f167528o.g();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "onKeyDown: back, start exit save");
        c7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.hideVKB();
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "onPause: ");
        fl5.i iVar = this.f167521f;
        if (iVar != null) {
            iVar.onPause();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void onPreDestroyed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDestroyed", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.onPreDestroyed();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("savePostModel", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        wa4.u uVar = (wa4.u) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(this, 2, wa4.u.class);
        if (uVar == null || uVar.f444286e <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("savePostModel", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        } else {
            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Vi(2, "SnsPostEnd_" + uVar.f444286e, uVar, new o04.q(this) { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.18
                @Override // o04.q
                public void a(int i17, boolean z17, dm.ba baVar, com.tencent.mm.protobuf.f fVar) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActionDone", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$18");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActionDone", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$18");
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "PluginSecData onActionDone %s %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActionDone", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$18");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActionDone", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$18");
                }
            });
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("savePostModel", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDestroyed", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 16) {
            if (i17 == 64) {
                if (iArr[0] == 0) {
                    this.f167526m.b();
                } else {
                    db5.e1.C(this, getString(com.tencent.mm.R.string.hhm), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.20
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$20");
                            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                            androidx.appcompat.app.AppCompatActivity context = com.tencent.mm.plugin.sns.ui.SnsUploadUI.this.getContext();
                            ((sb0.f) jVar).getClass();
                            j35.u.g(context);
                            dialogInterface.dismiss();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$20");
                        }
                    }, new android.content.DialogInterface.OnClickListener(this) { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.21
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$21");
                            dialogInterface.dismiss();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$21");
                        }
                    });
                }
            }
        } else if (iArr[0] == 0) {
            com.tencent.mm.plugin.sns.ui.z4 z4Var = this.f167536u;
            if (z4Var instanceof com.tencent.mm.plugin.sns.ui.p7) {
                ((com.tencent.mm.plugin.sns.ui.p7) z4Var).q();
            } else if (z4Var instanceof com.tencent.mm.plugin.sns.ui.i6) {
                ((com.tencent.mm.plugin.sns.ui.i6) z4Var).t();
            } else if (z4Var instanceof de4.a) {
                de4.a aVar = (de4.a) z4Var;
                aVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
                ((ee4.v) aVar.k(ee4.v.class)).p();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.onResume();
        this.f167528o.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsUploadUI.17
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$17");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "onResume run: refreshContentHeight");
                fp.w.l(com.tencent.mm.plugin.sns.ui.SnsUploadUI.this);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$17");
            }
        });
        com.tencent.mm.plugin.sns.ui.z4 z4Var = this.f167536u;
        if (z4Var != null && (z4Var instanceof com.tencent.mm.plugin.sns.ui.i6)) {
            com.tencent.mm.plugin.sns.ui.i6 i6Var = (com.tencent.mm.plugin.sns.ui.i6) z4Var;
            i6Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resume", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            if (i6Var.f168566h != null) {
                if (i6Var.A) {
                    i6Var.B();
                } else {
                    i6Var.A();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resume", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        }
        this.f167521f.d(((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).cj());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSaveInstanceState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (bundle != null) {
            fl5.i iVar = this.f167521f;
            if (iVar != null) {
                bundle.putString("contentdesc", iVar.getText().toString());
            }
            this.f167536u.g(bundle);
        }
        super.onSaveInstanceState(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSaveInstanceState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.onStart();
        com.tencent.mm.plugin.sns.model.l4.Tj().postDelayed(this.X, this.W);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.onStop();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "onStop: ");
        com.tencent.mm.plugin.sns.model.l4.Tj().removeCallbacks(this.X);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void p7(com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult) {
        byte[] bArr;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("talkVideo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        java.lang.String str = sightCaptureResult.f148809g;
        java.lang.String str2 = sightCaptureResult.f148810h;
        getIntent().putExtra("KSightThumbPath", sightCaptureResult.f148810h);
        getIntent().putExtra("KSnsFrom", 17);
        java.lang.String str3 = sightCaptureResult.f148812m;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            str3 = com.tencent.mm.vfs.w6.p(str);
        }
        java.lang.String str4 = str3;
        try {
            bArr = sightCaptureResult.f148814o.toByteArray();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "put sight extinfo to snsuploadui error: %s", e17.getMessage());
            bArr = null;
        }
        s7(str, str2, str4, bArr, true, true);
        m7(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("talkVideo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void q7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateNavState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.tencent.mm.plugin.sns.ui.z4 z4Var = this.f167536u;
        boolean z17 = z4Var != null && z4Var.f();
        enableOptionMenu(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "updateNavState: enableOptionMenu=%b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateNavState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void r7(java.lang.String str, boolean z17, int i17, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i18, java.util.ArrayList arrayList3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updatePicConfig", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "updatePicConfig");
        getIntent().getExtras().clear();
        getIntent().putExtra("KTouchCameraTime", com.tencent.mm.sdk.platformtools.t8.i1());
        getIntent().putExtra("KSnsPostManu", true);
        getIntent().putExtra("Ksnsupload_type", 0);
        getIntent().putExtra("KFilterId", i17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            getIntent().putExtra("sns_kemdia_path", str);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            getIntent().putExtra("sns_kemdia_path_list", arrayList);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList3) && pc4.d.f353410a.B()) {
            getIntent().putParcelableArrayListExtra("KMulti_Pic_Item_List", arrayList3);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList2)) {
            getIntent().putStringArrayListExtra("sns_media_latlong_list", arrayList2);
        }
        if (z17) {
            getIntent().putExtra("Kis_take_photo", z17);
        }
        if (i18 != 0) {
            getIntent().putExtra("Ksnsupload_source", 11);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePicConfig", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void s7(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr, boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSightConfig", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadUI", "updateSightConfig");
        getIntent().getExtras().clear();
        getIntent().putExtra("KSightPath", str);
        getIntent().putExtra("KSightThumbPath", str2);
        getIntent().putExtra("sight_md5", str3);
        getIntent().putExtra("KSnsPostManu", true);
        getIntent().putExtra("Ksnsupload_type", 14);
        getIntent().putExtra("Kis_take_photo", z18);
        getIntent().putExtra("KMMSightExtInfo", bArr);
        if (z17) {
            android.content.Intent intent = getIntent();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append("_");
            sb6.append(com.tencent.mm.sdk.platformtools.t8.Y(5));
            intent.putExtra("KSessionID", sb6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSightConfig", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }
}
