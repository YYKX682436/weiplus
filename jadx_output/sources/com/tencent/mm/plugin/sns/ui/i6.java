package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class i6 extends com.tencent.mm.plugin.sns.ui.n1 implements be4.a, com.tencent.mm.plugin.sns.ui.t4 {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public android.util.Pair E;
    public android.graphics.Bitmap F;
    public boolean G;
    public boolean H;
    public final be4.b I;

    /* renamed from: J */
    public com.tencent.mm.ui.widget.dialog.u3 f168557J;
    public int K;
    public java.lang.String L;
    public cl0.g M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public java.lang.String R;
    public com.tencent.mm.plugin.sns.ui.n9 S;
    public ec4.h T;
    public android.view.View U;
    public android.widget.TextView V;
    public gc4.l W;
    public final r45.p76 X;
    public final com.tencent.mm.sdk.event.IListener Y;
    public com.tencent.mm.plugin.sns.model.y7 Z;

    /* renamed from: a0 */
    public java.lang.String f168558a0;

    /* renamed from: b0 */
    public android.app.ProgressDialog f168559b0;

    /* renamed from: c0 */
    public int f168560c0;

    /* renamed from: d0 */
    public int f168561d0;

    /* renamed from: e0 */
    public l56.i f168562e0;

    /* renamed from: f0 */
    public java.lang.String f168563f0;

    /* renamed from: g */
    public android.view.View f168564g;

    /* renamed from: g0 */
    public java.util.List f168565g0;

    /* renamed from: h */
    public com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView f168566h;

    /* renamed from: h0 */
    public r45.ed4 f168567h0;

    /* renamed from: i */
    public android.widget.ImageView f168568i;

    /* renamed from: i0 */
    public java.util.LinkedList f168569i0;

    /* renamed from: j */
    public java.lang.String f168570j;

    /* renamed from: j0 */
    public int f168571j0;

    /* renamed from: k */
    public java.lang.String f168572k;

    /* renamed from: k0 */
    public boolean f168573k0;

    /* renamed from: l */
    public java.lang.String f168574l;

    /* renamed from: l0 */
    public java.util.List f168575l0;

    /* renamed from: m */
    public boolean f168576m;

    /* renamed from: m0 */
    public com.tencent.mm.pointers.PInt f168577m0;

    /* renamed from: n */
    public int f168578n;

    /* renamed from: n0 */
    public java.lang.String f168579n0;

    /* renamed from: o */
    public m21.w f168580o;

    /* renamed from: o0 */
    public int f168581o0;

    /* renamed from: p */
    public r45.vh4 f168582p;

    /* renamed from: p0 */
    public int f168583p0;

    /* renamed from: q */
    public java.lang.String f168584q;

    /* renamed from: q0 */
    public final java.lang.Runnable f168585q0;

    /* renamed from: r */
    public java.lang.String f168586r;

    /* renamed from: r0 */
    public final java.lang.Runnable f168587r0;

    /* renamed from: s */
    public java.lang.String f168588s;

    /* renamed from: t */
    public java.lang.String f168589t;

    /* renamed from: u */
    public boolean f168590u;

    /* renamed from: v */
    public boolean f168591v;

    /* renamed from: w */
    public com.tencent.mm.opensdk.modelmsg.WXMediaMessage f168592w;

    /* renamed from: x */
    public java.lang.String f168593x;

    /* renamed from: y */
    public java.lang.String f168594y;

    /* renamed from: z */
    public boolean f168595z;

    public i6(com.tencent.mm.ui.MMActivity mMActivity) {
        super(mMActivity);
        this.f168564g = null;
        this.f168568i = null;
        this.f168570j = "";
        this.f168572k = "";
        this.f168574l = "";
        this.f168576m = false;
        this.f168580o = null;
        this.f168582p = new r45.vh4();
        this.f168590u = false;
        this.f168591v = false;
        this.f168592w = null;
        this.f168595z = false;
        this.A = false;
        this.B = 0;
        new gp.d();
        this.C = 0;
        this.D = 0;
        this.E = null;
        this.F = null;
        this.G = false;
        this.H = false;
        this.K = 1;
        this.L = "";
        this.N = true;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.R = "";
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = new r45.p76();
        this.Y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SightSendResultEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.sns.ui.NewSightWidget$3
            {
                this.__eventId = 2027183784;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SightSendResultEvent sightSendResultEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSightWidget$3");
                com.tencent.mm.autogen.events.SightSendResultEvent sightSendResultEvent2 = sightSendResultEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSightWidget$3");
                com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "on sight send result callback, type %d", java.lang.Integer.valueOf(sightSendResultEvent2.f54784g.f7936a));
                am.su suVar = sightSendResultEvent2.f54784g;
                if (suVar.f7936a == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "come event done");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    com.tencent.mm.plugin.sns.ui.i6 i6Var = com.tencent.mm.plugin.sns.ui.i6.this;
                    i6Var.f168572k = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    i6Var.f168574l = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    android.app.ProgressDialog progressDialog = i6Var.f168559b0;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    if (progressDialog != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                        android.app.ProgressDialog progressDialog2 = i6Var.f168559b0;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                        progressDialog2.dismiss();
                    }
                    if (suVar.f7937b && i6Var.Z != null) {
                        com.tencent.mm.plugin.sns.ui.i6.r(i6Var);
                    }
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(suVar.f7937b);
                    java.lang.Long valueOf2 = java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(null));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    java.lang.String str = i6Var.f168574l;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "mux finish %B videoPath %s %d md5 %s", valueOf, null, valueOf2, str);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSightWidget$3");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSightWidget$3");
                return false;
            }
        };
        this.Z = null;
        this.f168558a0 = "";
        this.f168559b0 = null;
        this.f168585q0 = new com.tencent.mm.plugin.sns.ui.s6(this);
        this.f168587r0 = new com.tencent.mm.plugin.sns.ui.u6(this);
        this.I = new be4.b(mMActivity, this);
    }

    public static /* synthetic */ java.lang.String o(com.tencent.mm.plugin.sns.ui.i6 i6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        java.lang.String str = i6Var.R;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        return str;
    }

    public static /* synthetic */ boolean p(com.tencent.mm.plugin.sns.ui.i6 i6Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1902", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        i6Var.f168576m = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1902", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        return z17;
    }

    public static void q(com.tencent.mm.plugin.sns.ui.i6 i6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        i6Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFakeViewError", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        if (i6Var.f168576m) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFakeViewError", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "updateFakeViewError ");
            android.view.View view = i6Var.U;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/NewSightWidget", "updateFakeViewError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/NewSightWidget", "updateFakeViewError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.MMActivity mMActivity = i6Var.f169957c;
            if (mMActivity instanceof com.tencent.mm.plugin.sns.ui.SnsUploadUI) {
                mMActivity.enableOptionMenu(false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFakeViewError", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    public static void r(com.tencent.mm.plugin.sns.ui.i6 i6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        i6Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commitDone", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        com.tencent.mm.plugin.sns.model.y7 y7Var = i6Var.Z;
        if (y7Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commitDone", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        } else {
            int i17 = y7Var.i();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(i6Var.f168572k);
            ta4.b1.f416725a.b(i17, arrayList);
            java.lang.String j17 = com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", i17);
            n34.h3 h3Var = n34.h3.f334610d;
            r45.ed4 ed4Var = i6Var.f168567h0;
            com.tencent.mm.ui.MMActivity mMActivity = i6Var.f169957c;
            h3Var.l(j17, ed4Var, mMActivity.getIntent(), i6Var.f168590u && i6Var.f168584q.equals("wxa5e0de08d96cc09d"));
            if (i6Var.f168590u && i6Var.f168584q.equals("wxa5e0de08d96cc09d")) {
                com.tencent.mm.plugin.sns.statistics.s0.f164937k0.T = i17;
            }
            android.app.ProgressDialog progressDialog = i6Var.f168559b0;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "commitDone");
            com.tencent.mm.autogen.events.SightSendResultEvent sightSendResultEvent = new com.tencent.mm.autogen.events.SightSendResultEvent();
            am.su suVar = sightSendResultEvent.f54784g;
            suVar.f7936a = 0;
            suVar.f7937b = true;
            sightSendResultEvent.e();
            i6Var.f168576m = true;
            m21.w wVar = i6Var.f168580o;
            if (wVar != null) {
                wVar.a(i17);
                com.tencent.mm.plugin.sns.statistics.x0.f164998b.b(i6Var.f168580o);
            }
            com.tencent.mm.plugin.sns.model.l4.qj().a();
            if (mMActivity.getIntent() != null && mMActivity.getIntent().getBooleanExtra("K_go_to_SnsTimeLineUI", false)) {
                fe0.j4 j4Var = new fe0.j4();
                j4Var.f261410g = false;
                j4Var.f261404a = true;
                ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ui(mMActivity, null, 7, j4Var);
            }
            mMActivity.setResult(-1, new android.content.Intent());
            mMActivity.finish();
            com.tencent.mm.plugin.sns.model.l4.Nj().d();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commitDone", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    public final void A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showPreviewView", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        android.graphics.Bitmap bitmap = this.F;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f168566h.setImageBitmap(this.F);
            this.f168566h.e(((java.lang.Integer) this.E.first).intValue(), ((java.lang.Integer) this.E.second).intValue());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showPreviewView", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    public final void B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showSightCapture", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        this.f168568i.setVisibility(8);
        this.f168566h.p();
        com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView sightPlayImageView = this.f168566h;
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        sightPlayImageView.e(i65.a.b(mMActivity, 100), i65.a.b(mMActivity, 100));
        this.f168566h.setBackgroundResource(com.tencent.mm.R.color.a6n);
        this.f168566h.setImageResource(com.tencent.mm.R.raw.album_post_add_picture_btn);
        com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView sightPlayImageView2 = this.f168566h;
        sightPlayImageView2.setContentDescription(sightPlayImageView2.getContext().getString(com.tencent.mm.R.string.j8x));
        int b17 = (i65.a.b(mMActivity, 100) * 35) / 100;
        this.f168566h.setPadding(b17, b17, b17, b17);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_clear_sns_tmp_file, true)) {
            dw3.c0 c0Var = dw3.c0.f244182a;
            c0Var.l(this.f168572k);
            c0Var.l(this.f168570j);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showSightCapture", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.t4
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        if (obj instanceof qc0.m1) {
            qc0.m1 m1Var = (qc0.m1) obj;
            if (m1Var.f361411b == -1 && m1Var.f361412c == 0) {
                r45.vh4 vh4Var = new r45.vh4();
                vh4Var.f388235e = true;
                vh4Var.f388234d = false;
                qc0.l1 a17 = m1Var.a();
                com.tencent.mm.plugin.sns.model.g6 g6Var = com.tencent.mm.plugin.sns.model.g6.f164210a;
                java.lang.String str = a17.f361396b;
                android.os.Bundle bundle = m1Var.f361414e;
                g6Var.c(str, bundle, "key_edit_safe_strategy_emotion_info_list");
                boolean b17 = a17.b();
                com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
                if (b17) {
                    java.lang.String q17 = com.tencent.mm.vfs.w6.q(a17.f361396b);
                    java.lang.String str2 = a17.f361396b;
                    com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult = new com.tencent.mm.plugin.mmsight.SightCaptureResult(true, str2, a17.f361397c, q17, by5.x.c(str2), (int) (a17.f361398d / 1000), vh4Var);
                    mMActivity.getIntent().putExtra("key_extra_data", bundle);
                    s(sightCaptureResult);
                } else {
                    java.lang.String str3 = a17.f361396b;
                    this.A = true;
                    mMActivity.getIntent().putExtra("KSightDeleted", this.A);
                    if (mMActivity instanceof com.tencent.mm.plugin.sns.ui.SnsUploadUI) {
                        ((com.tencent.mm.plugin.sns.ui.SnsUploadUI) mMActivity).r7(str3, true, 0, null, null, this.f168578n, null);
                        ((com.tencent.mm.plugin.sns.ui.SnsUploadUI) mMActivity).m7(null);
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0210  */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v29 */
    @Override // com.tencent.mm.plugin.sns.ui.z4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View b() {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.i6.b():android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x034b  */
    @Override // com.tencent.mm.plugin.sns.ui.z4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(int r32, int r33, l56.i r34, java.lang.String r35, java.util.List r36, r45.ed4 r37, java.util.LinkedList r38, int r39, boolean r40, java.util.List r41, com.tencent.mm.pointers.PInt r42, java.lang.String r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 1253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.i6.c(int, int, l56.i, java.lang.String, java.util.List, r45.ed4, java.util.LinkedList, int, boolean, java.util.List, com.tencent.mm.pointers.PInt, java.lang.String, int, int):boolean");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void d(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleExitAndNeedSave", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "handleExitAndNeedSave >> isNeedSave: %b, backgroundRemuxWorkId: %s", java.lang.Boolean.valueOf(z17), this.R);
        if (!this.R.isEmpty()) {
            if (this.P) {
                if (z17) {
                    ((yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class))).Di(this.R, 6);
                } else {
                    ((yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class))).Di(this.R, 5);
                }
            } else if (z17) {
                ((wp4.x) ((n55.f) i95.n0.c(n55.f.class))).Di(this.R, 6);
            } else {
                ((wp4.x) ((n55.f) i95.n0.c(n55.f.class))).Di(this.R, 5);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleExitAndNeedSave", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        super.e();
        android.app.ProgressDialog progressDialog = this.f168559b0;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.Y.dead();
        if (ca4.z0.f(null)) {
            throw null;
        }
        be4.b bVar = this.I;
        bVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVLogHelper", "release");
        lt3.e.f321209a.c(7, bVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
        w(false);
        com.tencent.mm.plugin.sns.ui.n9 n9Var = this.S;
        if (n9Var != null) {
            n9Var.d();
            this.S = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        boolean z17 = !this.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04d4 A[Catch: f -> 0x04d7, TRY_LEAVE, TryCatch #1 {f -> 0x04d7, blocks: (B:71:0x04b3, B:73:0x04c0, B:75:0x04c6, B:76:0x04d0, B:78:0x04d4), top: B:70:0x04b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0550  */
    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 1437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.i6.i(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        int i19;
        android.graphics.Bitmap frameAtTime;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        if (i17 != 13 || intent == null) {
            i19 = i17;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "onActivityResult from AlbumRecordContainer");
            i19 = intent.getIntExtra("intent_request_code", -1);
        }
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        if (i19 == 9) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "onActivityResult: CONTEXT_MENU_IMAGE_FROM_MMGALLERY");
            if (intent.hasExtra("key_video_template_info")) {
                mMActivity.getIntent().putExtra("KSnsVideoTempalteInfo", intent.getByteArrayExtra("key_video_template_info"));
            }
            android.os.Bundle bundleExtra = intent.getBundleExtra("key_extra_data");
            if (bundleExtra != null && bundleExtra.getByteArray("key_bg_generate_pb") != null && bundleExtra.getByteArray("key_bg_generate_extra_config") != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "goto vlog mode");
                mMActivity.getIntent().getExtras().clear();
                mMActivity.getIntent().putExtra("Kis_take_photo", false);
                mMActivity.getIntent().putExtra("KSnsPostManu", true);
                mMActivity.getIntent().putExtra("Ksnsupload_type", 14);
                mMActivity.getIntent().putExtra("key_extra_data", intent.getBundleExtra("key_extra_data"));
                dw3.u0.f244283a.b(mMActivity.getIntent(), intent);
                ((com.tencent.mm.plugin.sns.ui.SnsUploadUI) mMActivity).m7(null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                return true;
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
            if ((stringArrayListExtra != null && stringArrayListExtra.size() > 0) || !com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("K_SEGMENTVIDEOPATH"))) {
                this.A = false;
                mMActivity.getIntent().putExtra("KSightDeleted", this.A);
                java.lang.String stringExtra = (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) ? intent.getStringExtra("K_SEGMENTVIDEOPATH") : stringArrayListExtra.get(0);
                mMActivity.getIntent().putExtra("key_extra_data", intent.getBundleExtra("key_extra_data"));
                mMActivity.getIntent().putExtra("Kis_from_sns_drafg_stg", false);
                java.lang.String stringExtra2 = intent.getStringExtra("KSEGMENTVIDEOTHUMBPATH");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2) || !com.tencent.mm.vfs.w6.j(stringExtra2)) {
                    java.lang.String str3 = com.tencent.mm.plugin.sns.model.l4.Ni() + com.tencent.mm.vfs.w6.p(stringExtra);
                    gp.d dVar = new gp.d();
                    try {
                        try {
                            dVar.setDataSource(stringExtra);
                            zj0.a aVar = new zj0.a();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            aVar.c(0L);
                            yj0.a.d(dVar, aVar.b(), "com/tencent/mm/plugin/sns/ui/NewSightWidget", "onActivityResult", "(IILandroid/content/Intent;)Z", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
                            zj0.c.f473285a.set(aVar);
                            long longValue = ((java.lang.Long) aVar.a(0)).longValue();
                            zj0.c.a();
                            frameAtTime = dVar.getFrameAtTime(longValue);
                            yj0.a.e(dVar, frameAtTime, "com/tencent/mm/plugin/sns/ui/NewSightWidget", "onActivityResult", "(IILandroid/content/Intent;)Z", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.NewSightWidget", "savebitmap error %s", e17.getMessage());
                        }
                        if (frameAtTime == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.NewSightWidget", "get bitmap error");
                            try {
                                dVar.release();
                            } catch (java.lang.Exception unused) {
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "getBitmap1 %d %d", java.lang.Integer.valueOf(frameAtTime.getWidth()), java.lang.Integer.valueOf(frameAtTime.getHeight()));
                            com.tencent.mm.sdk.platformtools.x.D0(frameAtTime, 80, android.graphics.Bitmap.CompressFormat.JPEG, str3, true);
                            android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str3);
                            com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "getBitmap2 %d %d", java.lang.Integer.valueOf(n07.outWidth), java.lang.Integer.valueOf(n07.outHeight));
                            try {
                                dVar.release();
                            } catch (java.lang.Exception unused2) {
                            }
                            stringExtra2 = str3;
                        }
                    } catch (java.lang.Throwable th6) {
                        try {
                            dVar.release();
                        } catch (java.lang.Exception unused3) {
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                        throw th6;
                    }
                }
                this.f168574l = com.tencent.mm.vfs.w6.p(stringExtra);
                com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "video path %s thumb path %s and %s %s ", stringExtra, stringExtra2, java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(stringExtra)), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(stringExtra2)));
                com.tencent.mm.plugin.sns.model.g6.f164210a.c(stringExtra, intent.getBundleExtra("key_extra_data"), "key_edit_safe_strategy_emotion_info_list");
                if (mMActivity instanceof com.tencent.mm.plugin.sns.ui.SnsUploadUI) {
                    com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = (com.tencent.mm.plugin.sns.ui.SnsUploadUI) mMActivity;
                    snsUploadUI.s7(stringExtra, stringExtra2, this.f168574l, null, false, false);
                    snsUploadUI.m7(null);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                return true;
            }
            com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult = (com.tencent.mm.plugin.mmsight.SightCaptureResult) intent.getParcelableExtra("key_req_result");
            if (sightCaptureResult != null && !sightCaptureResult.f148807e) {
                s(sightCaptureResult);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                return true;
            }
            this.A = true;
            mMActivity.getIntent().putExtra("KSightDeleted", this.A);
            java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_select_multi_pic_item");
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("CropImage_OutputPath_List");
            if ((stringArrayListExtra2 == null || stringArrayListExtra2.isEmpty()) && (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "no image selected");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                return false;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<java.lang.String> it = stringArrayListExtra2.iterator();
            while (it.hasNext()) {
                it.next();
            }
            boolean booleanExtra = intent.getBooleanExtra("isTakePhoto", false);
            int intExtra = intent.getIntExtra("CropImage_filterId", 0);
            if (mMActivity instanceof com.tencent.mm.plugin.sns.ui.SnsUploadUI) {
                com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI2 = (com.tencent.mm.plugin.sns.ui.SnsUploadUI) mMActivity;
                snsUploadUI2.r7(null, booleanExtra, intExtra, stringArrayListExtra2, arrayList, this.f168578n, parcelableArrayListExtra);
                snsUploadUI2.m7(null);
            }
        } else if (i19 == 11) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "onActivityResult: MMSIGHT_CAPTURE");
            com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult2 = (com.tencent.mm.plugin.mmsight.SightCaptureResult) intent.getParcelableExtra("key_req_result");
            if (sightCaptureResult2 != null) {
                if (!sightCaptureResult2.f148807e) {
                    mMActivity.getIntent().putExtra("key_extra_data", intent.getBundleExtra("key_extra_data"));
                    s(sightCaptureResult2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    return true;
                }
                this.A = true;
                mMActivity.getIntent().putExtra("KSightDeleted", this.A);
                int intExtra2 = intent.getIntExtra("CropImage_filterId", 0);
                java.lang.String str4 = sightCaptureResult2.f148815p;
                if (mMActivity instanceof com.tencent.mm.plugin.sns.ui.SnsUploadUI) {
                    com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI3 = (com.tencent.mm.plugin.sns.ui.SnsUploadUI) mMActivity;
                    snsUploadUI3.r7(str4, true, intExtra2, null, null, this.f168578n, null);
                    snsUploadUI3.m7(null);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                return true;
            }
        } else if (i19 == 12) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "onActivityResult: PREVIEW_NEW_SIGHT");
            if (intent != null) {
                com.tencent.mm.plugin.sns.statistics.w0 w0Var = com.tencent.mm.plugin.sns.statistics.w0.f164989a;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateEditPagePlayStopTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoPublishReporter", "sessionId: " + com.tencent.mm.plugin.sns.statistics.w0.f164990b + ", startPlayTimeStamp: " + com.tencent.mm.plugin.sns.statistics.w0.f164995g + ", stopTimeStamp: " + currentTimeMillis);
                long j17 = com.tencent.mm.plugin.sns.statistics.w0.f164995g;
                if (j17 == 0 || currentTimeMillis == 0) {
                    str = "onActivityResult";
                    str2 = "com.tencent.mm.plugin.sns.ui.NewSightWidget";
                } else {
                    long j18 = currentTimeMillis - j17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateEditPagePlayTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                    com.tencent.mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct snsVideoPublishLogStruct = com.tencent.mm.plugin.sns.statistics.w0.f164991c;
                    long j19 = snsVideoPublishLogStruct.f60800j;
                    str = "onActivityResult";
                    str2 = "com.tencent.mm.plugin.sns.ui.NewSightWidget";
                    snsVideoPublishLogStruct.f60800j = j19 + j18;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoPublishReporter", "updateEditPagePlayTime >> sessionId: " + com.tencent.mm.plugin.sns.statistics.w0.f164991c.f60794d + ", time: " + j18 + ", lastPlayTime: " + j19 + ", currentTime: " + com.tencent.mm.plugin.sns.statistics.w0.f164991c.f60800j);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateEditPagePlayTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                    com.tencent.mm.plugin.sns.statistics.w0.f164995g = 0L;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateEditPagePlayStopTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                this.A = intent.getBooleanExtra("sns_update_preview_video_del", false);
                mMActivity.getIntent().putExtra("KSightDeleted", this.A);
                if (!this.A) {
                    java.lang.String str5 = str;
                    java.lang.String str6 = str2;
                    boolean z17 = this.U.getVisibility() != 0;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str6);
                    return z17;
                }
                be4.b bVar = this.I;
                bVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancelAndDelete", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVLogHelper", "cancelAndDelete");
                lt3.e.f321209a.c(7, bVar);
                if (!android.text.TextUtils.isEmpty(bVar.f19559d)) {
                    lt3.n nVar = lt3.n.f321260a;
                    java.lang.String taskId = bVar.f19559d;
                    kotlin.jvm.internal.o.g(taskId, "taskId");
                    lt3.h hVar = lt3.n.f321261b;
                    hVar.getClass();
                    hVar.f321243d.delete(lt3.h.f321242f, "taskId=?", new java.lang.String[]{taskId});
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelAndDelete", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
                B();
                w(true);
                com.tencent.mm.plugin.sns.ui.n9 n9Var = this.S;
                if (n9Var != null) {
                    n9Var.c(this.R);
                    this.R = "";
                    this.O = false;
                    w0Var.d(false);
                    if (this.U.getVisibility() == 0) {
                        android.view.View view = this.U;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/NewSightWidget", "onActivityResult", "(IILandroid/content/Intent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/NewSightWidget", "onActivityResult", "(IILandroid/content/Intent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        return false;
    }

    public final void s(com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("captureVideo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        this.A = false;
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        mMActivity.getIntent().putExtra("KSightDeleted", this.A);
        if (mMActivity instanceof com.tencent.mm.plugin.sns.ui.SnsUploadUI) {
            ((com.tencent.mm.plugin.sns.ui.SnsUploadUI) mMActivity).p7(sightCaptureResult);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("captureVideo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    public void t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        x(1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13822, 1, 2, ca4.z0.l(), java.lang.Long.valueOf(c01.id.c()));
        com.tencent.mm.plugin.mmsight.SightParams sightParams = new com.tencent.mm.plugin.mmsight.SightParams(2, 0);
        java.lang.String k17 = ai3.d.k(t21.o2.Bi().Ai());
        java.lang.String m17 = ai3.d.m(k17);
        com.tencent.mm.plugin.sns.statistics.h hVar = com.tencent.mm.plugin.sns.statistics.h.f164856a;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = sightParams.f148819f;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = hVar.b(k17, m17, videoTransPara, videoTransPara.f71195h * 1000, 49);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_ignore_remux_without_edit, false)) {
            b17.f155669d = 2;
        }
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo();
        videoCaptureReportInfo.f155690d = 7;
        b17.I = videoCaptureReportInfo;
        qc0.c1 c1Var = (qc0.c1) i95.n0.c(qc0.c1.class);
        ((pc0.e2) c1Var).wi(this.f169957c, b17, new com.tencent.mm.plugin.sns.ui.l6(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    public final void u() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openGallery", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        java.lang.String e17 = com.tencent.mm.sdk.platformtools.x2.e();
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        java.lang.String string = mMActivity.getSharedPreferences(e17, 0).getString("gallery", "1");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13822, 2, 2, ca4.z0.l(), java.lang.Long.valueOf(c01.id.c()));
        if (string.equalsIgnoreCase("0")) {
            com.tencent.mm.pluginsdk.ui.tools.l7.c(mMActivity, 2, 1, 0, 1, com.tencent.mm.plugin.sns.ui.ws.a(), null);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_edit_video_max_time_length", d11.s.fj().nj().f71195h);
            intent.putExtra("key_can_select_video_and_pic", !(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_enable_vlog, false)));
            intent.putExtra("key_check_third_party_video", true);
            ((uy0.h) i95.n0.c(uy0.h.class)).getClass();
            if (ez0.o.f257835a.h()) {
                intent.putExtra("key_sns_publish_template", true);
                i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_publish_template_media_num, 20);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + i17);
            } else {
                i17 = 9;
            }
            intent.putExtra("Gallery_LivePhoto_Need_Query", pc4.e.f353426a.a());
            intent.putExtra("key_can_select_video_and_pic", false);
            com.tencent.mm.pluginsdk.ui.tools.l7.c(this.f169957c, 9, i17, 4, 3, com.tencent.mm.plugin.sns.ui.ws.a(), intent);
        }
        x(2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openGallery", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    public final void v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replaceBackgroundInfo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        if (!this.O || this.f168576m) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceBackgroundInfo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            return;
        }
        this.f168574l = com.tencent.mm.vfs.w6.p(this.f168572k);
        this.O = false;
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        mMActivity.getIntent().putExtra("KSightThumbPath", this.f168570j);
        mMActivity.getIntent().putExtra("KSightPath", this.f168572k);
        mMActivity.getIntent().putExtra("sight_md5", this.f168574l);
        mMActivity.getIntent().getBundleExtra("key_extra_data").putBoolean("key_is_background_video", false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceBackgroundInfo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    public final void w(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetStatus", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        this.f168572k = "";
        this.f168570j = "";
        this.A = z17;
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        if (z17) {
            mMActivity.getIntent().putExtra("KSightThumbPath", this.f168570j);
            mMActivity.getIntent().putExtra("KSightPath", this.f168572k);
        }
        mMActivity.getIntent().putExtra("KSightDeleted", this.A);
        if (ca4.z0.f(this.F)) {
            this.F.recycle();
            this.F = null;
        }
        if (z17 && (mMActivity instanceof com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI)) {
            mMActivity.getIntent().putExtra("Ksnsupload_type", 0);
            ((com.tencent.mm.plugin.sns.ui.SnsUploadUI) mMActivity).m7(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetStatus", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    public final void x(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptPostImageInfo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        com.tencent.mm.autogen.mmdata.rpt.SnsBeforePostImageInfoStruct snsBeforePostImageInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsBeforePostImageInfoStruct();
        snsBeforePostImageInfoStruct.f60464f = snsBeforePostImageInfoStruct.i();
        snsBeforePostImageInfoStruct.f60462d = i17;
        snsBeforePostImageInfoStruct.f60463e = snsBeforePostImageInfoStruct.b("SessionId", this.f168589t, true);
        snsBeforePostImageInfoStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptPostImageInfo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    public final void y(java.lang.String str, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReportValueToSecondCut", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        cl0.g gVar = this.M;
        if (gVar != null) {
            try {
                gVar.s(str, obj);
            } catch (cl0.f unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NewSightWidget", "put SecondCut JSON Error");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReportValueToSecondCut", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    public final void z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showAddPicDialog", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", "showAddPicDialog: ");
        try {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f169957c, 1, false);
            k0Var.f211872n = new db5.o4() { // from class: com.tencent.mm.plugin.sns.ui.i6$$c
                @Override // db5.o4
                public final void onCreateMMMenu(db5.g4 g4Var) {
                    com.tencent.mm.plugin.sns.ui.i6 i6Var = com.tencent.mm.plugin.sns.ui.i6.this;
                    i6Var.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$showAddPicDialog$1", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    boolean z17 = x51.o1.f452042a;
                    com.tencent.mm.ui.MMActivity mMActivity = i6Var.f169957c;
                    g4Var.f(0, mMActivity.getString(com.tencent.mm.R.string.f490407u4));
                    g4Var.f(1, mMActivity.getString(com.tencent.mm.R.string.f490415uc));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$showAddPicDialog$1", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                }
            };
            k0Var.f211881s = new db5.t4() { // from class: com.tencent.mm.plugin.sns.ui.i6$$d
                @Override // db5.t4
                public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
                    com.tencent.mm.plugin.sns.ui.i6 i6Var = com.tencent.mm.plugin.sns.ui.i6.this;
                    i6Var.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$showAddPicDialog$2", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    int itemId = menuItem.getItemId();
                    if (itemId == 0) {
                        i6Var.t();
                    } else if (itemId == 1) {
                        i6Var.u();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$showAddPicDialog$2", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                }
            };
            k0Var.v();
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAddPicDialog", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }
}
