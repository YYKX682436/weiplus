package com.tencent.mm.plugin.sns.ui;

@db5.a(1024)
@gm0.a2
/* loaded from: classes4.dex */
public class SnsCommentDetailUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements com.tencent.mm.plugin.sns.model.h0, com.tencent.mm.modelbase.u0, p94.m0 {
    public static final /* synthetic */ int O2 = 0;
    public java.util.LinkedList A;
    public boolean A1;
    public android.widget.LinearLayout A2;
    public com.tencent.mm.plugin.sns.ui.SnsCommentFooter B;
    public android.app.Dialog B1;
    public int B2;
    public boolean C1;
    public boolean C2;
    public java.lang.String D1;
    public com.tencent.mm.plugin.sns.ui.PhotosContent D2;
    public com.tencent.mm.plugin.sns.ui.kj E;
    public boolean E1;
    public android.view.ViewStub E2;
    public com.tencent.mm.plugin.sns.ui.tm F;
    public int F1;
    public a44.k F2;
    public java.lang.String G;
    public boolean G1;
    public int G2;
    public java.lang.String H;
    public int H1;
    public final c01.o8 H2;
    public byte[] I;
    public boolean I1;
    public android.widget.FrameLayout I2;

    /* renamed from: J, reason: collision with root package name */
    public int f166851J;
    public boolean J1;
    public android.widget.FrameLayout J2;
    public com.tencent.mm.storage.e8 K;
    public com.tencent.mm.plugin.sns.ui.v1 K1;
    public com.tencent.mm.plugin.sns.ui.jw K2;
    public java.lang.String L;
    public android.widget.TextView L1;
    public final com.tencent.mm.pluginsdk.ui.span.a L2;
    public final android.view.View.OnTouchListener M;
    public boolean M1;
    public com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic M2;
    public com.tencent.mm.ui.widget.dialog.u3 N;
    public boolean N1;
    public final boolean N2;
    public boolean O1;
    public android.widget.ImageView P;
    public volatile int P1;
    public com.tencent.mm.ui.widget.imageview.WeImageView Q;
    public gc4.b Q1;
    public com.tencent.mm.plugin.ting.widget.MusicView R;
    public boolean R1;
    public com.tencent.mm.plugin.sns.ui.q1 S;
    public boolean S1;
    public java.lang.String T;
    public boolean T1;
    public boolean U;
    public boolean U1;
    public long V;
    public final com.tencent.mm.plugin.sns.model.k5 V1;
    public rl5.r W;
    public final n34.p W1;
    public com.tencent.mm.plugin.sns.ui.kw X;
    public boolean X1;
    public int Y;
    public java.lang.String Y1;
    public int Z;
    public long Z1;

    /* renamed from: a2, reason: collision with root package name */
    public boolean f166852a2;

    /* renamed from: b2, reason: collision with root package name */
    public x74.b f166853b2;

    /* renamed from: c2, reason: collision with root package name */
    public boolean f166854c2;

    /* renamed from: d2, reason: collision with root package name */
    public android.view.View f166856d2;

    /* renamed from: e2, reason: collision with root package name */
    public boolean f166858e2;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f166859f;

    /* renamed from: f2, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.statistics.m f166860f2;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f166861g;

    /* renamed from: g2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f166862g2;

    /* renamed from: h, reason: collision with root package name */
    public bd4.f2 f166863h;

    /* renamed from: h2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f166864h2;

    /* renamed from: i2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f166866i2;

    /* renamed from: j2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f166867j2;

    /* renamed from: k2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f166868k2;

    /* renamed from: l1, reason: collision with root package name */
    public i64.b1 f166869l1;

    /* renamed from: l2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f166870l2;

    /* renamed from: m2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f166872m2;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.RelativeLayout f166873n;

    /* renamed from: n2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f166874n2;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f166875o;

    /* renamed from: o2, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.ScrollUp f166876o2;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f166877p;

    /* renamed from: p0, reason: collision with root package name */
    public final int f166878p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.listener.i f166879p1;

    /* renamed from: p2, reason: collision with root package name */
    public final java.lang.Runnable f166880p2;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader f166881q;

    /* renamed from: q2, reason: collision with root package name */
    public final android.view.View.OnClickListener f166882q2;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f166883r;

    /* renamed from: r2, reason: collision with root package name */
    public final android.view.View.OnClickListener f166884r2;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ListView f166885s;

    /* renamed from: s2, reason: collision with root package name */
    public final android.view.View.OnClickListener f166886s2;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f166887t;

    /* renamed from: t2, reason: collision with root package name */
    public boolean f166888t2;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f166889u;

    /* renamed from: u2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f166890u2;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.CommentListAdapter f166891v;

    /* renamed from: v2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f166892v2;

    /* renamed from: w, reason: collision with root package name */
    public android.view.animation.ScaleAnimation f166893w;

    /* renamed from: w2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f166894w2;

    /* renamed from: x, reason: collision with root package name */
    public android.view.animation.ScaleAnimation f166895x;

    /* renamed from: x0, reason: collision with root package name */
    public int f166896x0;

    /* renamed from: x1, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.j f166897x1;

    /* renamed from: x2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f166898x2;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f166899y;

    /* renamed from: y0, reason: collision with root package name */
    public dc4.v f166900y0;

    /* renamed from: y1, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.m7 f166901y1;

    /* renamed from: y2, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.h0 f166902y2;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f166903z;

    /* renamed from: z1, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsTranslateResultView f166904z1;

    /* renamed from: z2, reason: collision with root package name */
    public boolean f166905z2;

    /* renamed from: d, reason: collision with root package name */
    public boolean f166855d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f166857e = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f166865i = false;

    /* renamed from: m, reason: collision with root package name */
    public ul5.j f166871m = null;
    public int C = -1;
    public boolean D = false;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$10, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass10 implements java.lang.Runnable {
        public AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public void run() {
            final int count;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$10");
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
            if (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.p7(snsCommentDetailUI) != null && com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.V6(snsCommentDetailUI) != null && (count = (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.V6(snsCommentDetailUI).getCount() - 1) + com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.p7(snsCommentDetailUI).getHeaderViewsCount()) >= 0) {
                final boolean hasFocus = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI).hasFocus();
                if (hasFocus) {
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.p7(snsCommentDetailUI).requestFocus();
                }
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.p7(snsCommentDetailUI).postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.10.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$10$1");
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass10 anonymousClass10 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass10.this;
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI2 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                        int i17 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        snsCommentDetailUI2.D = true;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI3 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                        android.widget.ListView p76 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.p7(snsCommentDetailUI3);
                        int i18 = count;
                        p76.setSelectionFromTop(i18, 0);
                        boolean z17 = hasFocus;
                        if (z17) {
                            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI3).requestFocus();
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "scrollToCommentBottomTask: jump pos:%d, editTextHasFocus:%b", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$10$1");
                    }
                }, 0L);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$10");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$34, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass34 implements com.tencent.mm.plugin.sns.ui.cg {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f166981a;

        public AnonymousClass34(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
            this.f166981a = snsInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$35, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass35 implements com.tencent.mm.plugin.sns.ui.eg {
        public AnonymousClass35() {
        }

        public void a() {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShow", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$35");
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
            if (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI).f167114z1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShow", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$35");
                return;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableUseAdjustNothingConfig", "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig");
            boolean z17 = ka4.e.f306129a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableUseAdjustNothingConfig", "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig");
            if (z17) {
                ((com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass10) snsCommentDetailUI.f166880p2).run();
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI).f167114z1 = true;
            } else {
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.d7(snsCommentDetailUI);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShow", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$35");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$38, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass38 implements com.tencent.mm.plugin.sns.model.h0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f166987d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ java.util.Map f166988e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ java.util.List f166989f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ r45.ed4 f166990g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ java.lang.Runnable f166991h;

        public AnonymousClass38(java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.Map map, java.util.List list, r45.ed4 ed4Var, java.lang.Runnable runnable) {
            this.f166987d = atomicInteger;
            this.f166988e = map;
            this.f166989f = list;
            this.f166990g = ed4Var;
            this.f166991h = runnable;
        }

        @Override // com.tencent.mm.plugin.sns.model.h0
        public void onImageFinish(final java.lang.String str, int i17, final boolean z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$38");
            final java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f166987d;
            final java.util.Map map = this.f166988e;
            final java.util.List list = this.f166989f;
            final r45.ed4 ed4Var = this.f166990g;
            final java.lang.Runnable runnable = this.f166991h;
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$38$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass38 anonymousClass38 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass38.this;
                    anonymousClass38.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onImageFinish$0", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$38");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("current thread = ");
                    sb6.append(java.lang.Thread.currentThread());
                    sb6.append(", onImageFinish mediaId = ");
                    java.lang.String str2 = str;
                    sb6.append(str2);
                    sb6.append(", finalUnLocalCount = ");
                    java.util.concurrent.atomic.AtomicInteger atomicInteger2 = atomicInteger;
                    sb6.append(atomicInteger2.get());
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", sb6.toString());
                    if (atomicInteger2.get() != 0) {
                        java.util.Map map2 = map;
                        if (((r45.jj4) map2.get(str2)) != null && z17) {
                            atomicInteger2.getAndDecrement();
                            map2.remove(str2);
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "mediaId = " + str2 + ", download image finish, current unlocal count = " + atomicInteger2.get());
                        }
                    }
                    if (atomicInteger2.get() == 0) {
                        int i18 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                        java.util.ArrayList I7 = snsCommentDetailUI.I7(list);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        n34.h3 h3Var = n34.h3.f334610d;
                        java.lang.String m76 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.m7(snsCommentDetailUI);
                        r45.ed4 ed4Var2 = ed4Var;
                        h3Var.m(m76, ed4Var2, I7, false);
                        java.lang.String m77 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.m7(snsCommentDetailUI);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        snsCommentDetailUI.U7(m77, ed4Var2, I7);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        runnable.run();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onImageFinish$0", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$38");
                }
            });
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$38");
        }

        @Override // com.tencent.mm.plugin.sns.model.h0
        public void onSetbg(java.lang.String str) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$38");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$38");
        }

        @Override // com.tencent.mm.plugin.sns.model.h0
        public void onSightFinish(java.lang.String str, boolean z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$38");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$38");
        }

        @Override // com.tencent.mm.plugin.sns.model.h0
        public void onThumbFinish(java.lang.String str) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$38");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$38");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass4 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsVisibilityChangeByFlutterEvent> {
        public AnonymousClass4(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -530933953;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.SnsVisibilityChangeByFlutterEvent snsVisibilityChangeByFlutterEvent) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$4");
            final com.tencent.mm.autogen.events.SnsVisibilityChangeByFlutterEvent snsVisibilityChangeByFlutterEvent2 = snsVisibilityChangeByFlutterEvent;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$4");
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$4$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass4 anonymousClass4 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass4.this;
                    anonymousClass4.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$callback$0", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$4");
                    if (snsVisibilityChangeByFlutterEvent2 instanceof com.tencent.mm.autogen.events.SnsVisibilityChangeByFlutterEvent) {
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                        com.tencent.mm.plugin.sns.storage.SnsInfo B7 = snsCommentDetailUI.B7(false);
                        com.tencent.mm.protocal.protobuf.SnsObject e17 = com.tencent.mm.plugin.sns.model.s5.e(B7);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        snsCommentDetailUI.Z7(e17, B7);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$callback$0", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$4");
                }
            });
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$4");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$4");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$70, reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass70 implements java.lang.Runnable {
        public AnonymousClass70(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$70");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "updateUnreadErrorNotify: ");
            wa4.p.f444273a.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$70");
        }
    }

    /* loaded from: classes4.dex */
    public class AppClickSpan extends com.tencent.mm.pluginsdk.ui.span.d1 {
        public AppClickSpan() {
        }

        @Override // com.tencent.mm.pluginsdk.ui.span.d1, com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$AppClickSpan");
            int i17 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            com.tencent.mm.plugin.sns.ui.kw kwVar = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this.X;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            kwVar.f169663k.onClick(view);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$AppClickSpan");
        }

        @Override // com.tencent.mm.pluginsdk.ui.span.d1, com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$AppClickSpan");
            int color = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this.getResources().getColor(com.tencent.mm.R.color.f479514a61);
            if (getPress()) {
                textPaint.bgColor = color;
            } else {
                textPaint.bgColor = 0;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$AppClickSpan");
        }
    }

    /* loaded from: classes4.dex */
    public class CommentListAdapter extends android.widget.BaseAdapter {

        /* renamed from: d, reason: collision with root package name */
        public java.util.LinkedList f167064d;

        /* renamed from: e, reason: collision with root package name */
        public java.util.LinkedList f167065e;

        /* renamed from: f, reason: collision with root package name */
        public final android.app.Activity f167066f;

        /* loaded from: classes4.dex */
        public class ViewHolder {

            /* renamed from: a, reason: collision with root package name */
            public android.widget.ImageView f167068a;

            /* renamed from: b, reason: collision with root package name */
            public android.widget.TextView f167069b;

            /* renamed from: c, reason: collision with root package name */
            public android.widget.TextView f167070c;

            /* renamed from: d, reason: collision with root package name */
            public android.widget.TextView f167071d;

            /* renamed from: e, reason: collision with root package name */
            public android.widget.TextView f167072e;

            /* renamed from: f, reason: collision with root package name */
            public android.widget.FrameLayout f167073f;

            /* renamed from: g, reason: collision with root package name */
            public com.tencent.mm.plugin.sns.ui.SnsTranslateResultView f167074g;

            /* renamed from: h, reason: collision with root package name */
            public java.lang.Object f167075h;

            /* renamed from: i, reason: collision with root package name */
            public r45.e86 f167076i;

            /* renamed from: j, reason: collision with root package name */
            public java.lang.String f167077j;

            public ViewHolder(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.CommentListAdapter commentListAdapter) {
            }
        }

        public CommentListAdapter(java.util.LinkedList linkedList, java.util.LinkedList linkedList2, android.app.Activity activity, java.lang.String str) {
            this.f167064d = linkedList;
            this.f167065e = linkedList2;
            this.f167066f = activity;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
            if (this.f167065e.size() > 0) {
                java.util.LinkedList linkedList = this.f167064d;
                int size = (linkedList != null ? linkedList.size() : 0) + 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
                return size;
            }
            java.util.LinkedList linkedList2 = this.f167064d;
            int size2 = linkedList2 != null ? linkedList2.size() : 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
            return size2;
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int i17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
            return 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x0596  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x069b  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x06b6  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x072d  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0744  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x074e  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x0781  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x07a5  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x07ce  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x0809  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x0837  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x08d5  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x07d7  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x07a8  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x072f  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x06be  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x06a9  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x05a3  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x0592  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x052d A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0540  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0567  */
        @Override // android.widget.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.view.View getView(int r40, android.view.View r41, android.view.ViewGroup r42) {
            /*
                Method dump skipped, instructions count: 2336
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.CommentListAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* loaded from: classes3.dex */
    public static class DownloadCallback implements a84.l {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.ref.WeakReference f167078a;

        /* renamed from: b, reason: collision with root package name */
        public final int f167079b;

        /* renamed from: c, reason: collision with root package name */
        public final int f167080c;

        /* renamed from: d, reason: collision with root package name */
        public final int f167081d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f167082e;

        public DownloadCallback(android.widget.ImageView imageView, java.lang.String str) {
            this.f167078a = new java.lang.ref.WeakReference(imageView);
            android.content.Context context = imageView.getContext();
            this.f167079b = i65.a.b(context, 16);
            this.f167080c = com.tencent.mm.sdk.platformtools.j.d(context, 32.0f);
            this.f167081d = com.tencent.mm.sdk.platformtools.j.d(context, 6.0f);
            this.f167082e = str;
        }

        @Override // a84.l
        public void a(android.graphics.Bitmap bitmap, boolean z17) {
            java.lang.ref.WeakReference weakReference;
            int i17 = this.f167080c;
            int i18 = this.f167079b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$DownloadCallback");
            try {
                weakReference = this.f167078a;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "onDownloadResult, exp=" + th6.toString());
            }
            if (weakReference == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$DownloadCallback");
                return;
            }
            android.widget.ImageView imageView = (android.widget.ImageView) weakReference.get();
            if (imageView == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$DownloadCallback");
                return;
            }
            java.lang.Object tag = imageView.getTag(com.tencent.mm.R.id.n5q);
            boolean z18 = tag instanceof java.lang.String;
            java.lang.String str = this.f167082e;
            if (z18) {
                java.lang.String str2 = (java.lang.String) tag;
                if (!str2.equals(str)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "download img but url is not equals! ".concat(str2));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$DownloadCallback");
                    return;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "download img url = " + str);
            if (z17 && bitmap != null) {
                android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), bitmap);
                bitmapDrawable.setBounds(0, 0, i18, i18);
                imageView.setImageDrawable(bitmapDrawable);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i17, i17);
                layoutParams.topMargin = this.f167081d;
                int i19 = (i17 - i18) / 2;
                imageView.setPadding(i19, i19, i19, i19);
                layoutParams.gravity = 49;
                imageView.setLayoutParams(layoutParams);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$DownloadCallback");
        }
    }

    /* loaded from: classes4.dex */
    public class ScrollUp implements java.lang.Runnable {

        /* renamed from: d, reason: collision with root package name */
        public int f167083d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f167084e = 10;

        /* renamed from: f, reason: collision with root package name */
        public int f167085f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f167086g = -1;

        /* renamed from: h, reason: collision with root package name */
        public int f167087h;

        public ScrollUp() {
        }

        public void a(int i17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScrollPosition", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp");
            this.f167086g = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScrollPosition", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp");
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp");
            this.f167084e = 10;
            int i17 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
            snsCommentDetailUI.D = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            int top = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI).getTop();
            this.f167083d = top;
            int i18 = top - this.f167087h;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.p7(snsCommentDetailUI).getBottom());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            int i19 = snsCommentDetailUI.C;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "list.bottom: %d, listOriginalBottom: %d, footerTop: %d, commentFooter.getTop: %d, topSelection: %d", valueOf, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f167083d), java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI).getTop()), java.lang.Integer.valueOf(i18));
            if (i18 == this.f167085f) {
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.p7(snsCommentDetailUI).setSelectionFromTop(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.p7(snsCommentDetailUI).getHeaderViewsCount() + this.f167086g, i18);
                this.f167084e = 0;
                this.f167085f = 0;
            } else {
                int i27 = this.f167084e;
                this.f167084e = i27 - 1;
                if (i27 > 0) {
                    new com.tencent.mm.sdk.platformtools.n3().postDelayed(this, 100L);
                    this.f167085f = i18;
                } else {
                    this.f167085f = 0;
                    this.f167084e = 0;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp");
        }
    }

    static {
        o11.f fVar = new o11.f();
        fVar.f342078b = true;
        fVar.f342077a = true;
        fVar.a();
        new yo0.d() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.9
            @Override // yo0.d, yo0.e
            public dp0.a d() {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeadResourceTranscoder", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$9");
                dp0.e eVar = new dp0.e(true, 0.5f);
                eVar.f242116c = dp0.c.f242111e;
                dp0.a aVar = new dp0.a(eVar);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeadResourceTranscoder", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$9");
                return aVar;
            }
        };
        o11.f fVar2 = new o11.f();
        fVar2.f342078b = true;
        fVar2.f342077a = true;
        fVar2.a();
    }

    public SnsCommentDetailUI() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.M = new com.tencent.mm.sdk.platformtools.o8();
        this.N = null;
        this.T = "";
        this.U = false;
        this.V = 0L;
        this.f166878p0 = 210;
        this.A1 = false;
        this.B1 = null;
        this.C1 = false;
        this.D1 = "";
        this.E1 = true;
        this.G1 = false;
        this.H1 = 0;
        this.I1 = false;
        this.J1 = false;
        this.K1 = null;
        this.L1 = null;
        this.M1 = false;
        this.N1 = true;
        this.O1 = false;
        this.U1 = false;
        this.V1 = new com.tencent.mm.plugin.sns.model.k5(2);
        this.W1 = new n34.p(this);
        this.X1 = false;
        this.Y1 = "";
        this.Z1 = 0L;
        this.f166852a2 = false;
        this.f166854c2 = false;
        this.f166856d2 = null;
        this.f166858e2 = false;
        this.f166860f2 = new com.tencent.mm.plugin.sns.statistics.m();
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f166862g2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTranslateFinishEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.1
            {
                this.__eventId = 2139223297;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsTranslateFinishEvent snsTranslateFinishEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$1");
                com.tencent.mm.autogen.events.SnsTranslateFinishEvent snsTranslateFinishEvent2 = snsTranslateFinishEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$1");
                if (snsTranslateFinishEvent2 instanceof com.tencent.mm.autogen.events.SnsTranslateFinishEvent) {
                    am.dx dxVar = snsTranslateFinishEvent2.f54847g;
                    java.lang.String str = dxVar.f6506b;
                    java.lang.String str2 = dxVar.f6507c;
                    java.lang.String str3 = dxVar.f6508d;
                    int i17 = dxVar.f6505a;
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                    if (i17 == 1) {
                        int i18 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        snsCommentDetailUI.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finishPostDescTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        com.tencent.mm.plugin.sns.storage.SnsInfo B7 = snsCommentDetailUI.B7(false);
                        if (B7 == null || !B7.getSnsId().equals(str)) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishPostDescTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        } else {
                            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                                snsCommentDetailUI.f166904z1.setVisibility(8);
                            } else {
                                com.tencent.mm.plugin.sns.model.s6.a(str, 4);
                                com.tencent.mm.plugin.sns.model.r6 f17 = com.tencent.mm.plugin.sns.model.s6.f(str);
                                snsCommentDetailUI.f166904z1.setVisibility(0);
                                snsCommentDetailUI.f166904z1.e(f17, 1, str2, str3, f17.f164651h);
                            }
                            snsCommentDetailUI.f166861g.setTag(new com.tencent.mm.plugin.sns.ui.go(snsCommentDetailUI.G, B7.getLocalid(), true, false, 2));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishPostDescTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    } else if (i17 == 2) {
                        int i19 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        snsCommentDetailUI.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finishCommentTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        com.tencent.mm.plugin.sns.model.s6.a(str, 4);
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.CommentListAdapter commentListAdapter = snsCommentDetailUI.f166891v;
                        if (commentListAdapter != null) {
                            commentListAdapter.notifyDataSetChanged();
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishCommentTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$1");
                return false;
            }
        };
        this.f166864h2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTranslateStartEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.2
            {
                this.__eventId = 1200144606;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsTranslateStartEvent snsTranslateStartEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$2");
                com.tencent.mm.autogen.events.SnsTranslateStartEvent snsTranslateStartEvent2 = snsTranslateStartEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$2");
                if (snsTranslateStartEvent2 instanceof com.tencent.mm.autogen.events.SnsTranslateStartEvent) {
                    am.fx fxVar = snsTranslateStartEvent2.f54849g;
                    java.lang.String str = fxVar.f6711b;
                    int i17 = fxVar.f6710a;
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                    if (i17 == 1) {
                        int i18 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        snsCommentDetailUI.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPostDescTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        if (snsCommentDetailUI.B7(false).getSnsId().equals(str)) {
                            snsCommentDetailUI.f166904z1.setVisibility(0);
                            snsCommentDetailUI.f166904z1.k(1);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPostDescTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPostDescTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    } else if (i17 == 2) {
                        int i19 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        snsCommentDetailUI.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startCommentTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        com.tencent.mm.plugin.sns.model.s6.a(str, 4);
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.CommentListAdapter commentListAdapter = snsCommentDetailUI.f166891v;
                        if (commentListAdapter != null) {
                            commentListAdapter.notifyDataSetChanged();
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startCommentTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$2");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$2");
                return false;
            }
        };
        this.f166866i2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsUnTranslateEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.3
            {
                this.__eventId = -868441523;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsUnTranslateEvent snsUnTranslateEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$3");
                com.tencent.mm.autogen.events.SnsUnTranslateEvent snsUnTranslateEvent2 = snsUnTranslateEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$3");
                if (snsUnTranslateEvent2 instanceof com.tencent.mm.autogen.events.SnsUnTranslateEvent) {
                    am.gx gxVar = snsUnTranslateEvent2.f54850g;
                    java.lang.String str = gxVar.f6797b;
                    int i17 = gxVar.f6796a;
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                    if (i17 == 1) {
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.i7(snsCommentDetailUI, str);
                    } else if (i17 == 2) {
                        int i18 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        snsCommentDetailUI.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        com.tencent.mm.plugin.sns.model.s6.k(str, 4);
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.CommentListAdapter commentListAdapter = snsCommentDetailUI.f166891v;
                        if (commentListAdapter != null) {
                            commentListAdapter.notifyDataSetChanged();
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$3");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$3");
                return false;
            }
        };
        this.f166867j2 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass4(a0Var);
        this.f166868k2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.5
            {
                this.__eventId = -348375692;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent changeTranslateLanguageEvent) {
                r45.e86 e86Var;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$5");
                com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent changeTranslateLanguageEvent2 = changeTranslateLanguageEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$5");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "changeTranslateListener >> %s", changeTranslateLanguageEvent2.f54035g.f8502a);
                java.lang.String str = changeTranslateLanguageEvent2.f54035g.f8502a;
                if (!android.text.TextUtils.isEmpty(str)) {
                    boolean startsWith = str.startsWith("sns_content_");
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                    if (startsWith) {
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.i7(snsCommentDetailUI, str.replace("sns_content_", ""));
                        com.tencent.mm.plugin.sns.storage.SnsInfo B7 = snsCommentDetailUI.B7(false);
                        if (B7 != null) {
                            com.tencent.mm.plugin.sns.model.s6.m(B7);
                        }
                    } else if (str.startsWith("sns_comment_")) {
                        java.lang.String replace = str.replace("sns_comment_", "");
                        com.tencent.mm.plugin.sns.storage.SnsInfo B72 = snsCommentDetailUI.B7(false);
                        if (B72 != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentInfoByStoreId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                            com.tencent.mm.plugin.sns.storage.SnsInfo B73 = snsCommentDetailUI.B7(false);
                            if (B73 != null) {
                                java.lang.String str2 = replace.split(";")[1];
                                com.tencent.mm.protocal.protobuf.SnsObject e17 = com.tencent.mm.plugin.sns.model.s5.e(B73);
                                if (e17 != null) {
                                    java.util.Iterator<r45.e86> it = e17.CommentUserList.iterator();
                                    while (it.hasNext()) {
                                        e86Var = it.next();
                                        int i17 = e86Var.f373132m;
                                        if (java.lang.Long.toString(i17 != 0 ? i17 : e86Var.f373137r).equals(str2)) {
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentInfoByStoreId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                                            break;
                                        }
                                    }
                                }
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentInfoByStoreId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                            e86Var = null;
                            r45.e86 e86Var2 = e86Var;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                            if (e86Var2 != null) {
                                com.tencent.mm.plugin.sns.model.s6.l(new com.tencent.mm.plugin.sns.ui.u1(null, B72.getSnsId(), e86Var2, null, e86Var2.f373130h, null, 1, B72.field_userName, B72.getTimeLine().Id));
                            }
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$5");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$5");
                return false;
            }
        };
        this.f166870l2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GalleryPhotoInfoEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.6
            {
                this.__eventId = 1036677180;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GalleryPhotoInfoEvent galleryPhotoInfoEvent) {
                com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView maskImageWithLivePhotoTagView;
                int i17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$6");
                com.tencent.mm.autogen.events.GalleryPhotoInfoEvent galleryPhotoInfoEvent2 = galleryPhotoInfoEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$6");
                if (galleryPhotoInfoEvent2 instanceof com.tencent.mm.autogen.events.GalleryPhotoInfoEvent) {
                    am.ie ieVar = galleryPhotoInfoEvent2.f54355g;
                    int i18 = ieVar.f6946b;
                    int i19 = ieVar.f6945a;
                    int i27 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                    snsCommentDetailUI.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPhotoInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    if (i19 == -1) {
                        com.tencent.mm.plugin.sns.storage.SnsInfo B7 = snsCommentDetailUI.B7(false);
                        if (B7 == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhotoInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        } else {
                            com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = B7.getTimeLine();
                            if (B7.isPhoto() && timeLine.ContentObj.f369840h.size() == 4 && i18 > 1 && (i17 = i18 + 1) < 9) {
                                i18 = i17;
                            }
                            com.tencent.mm.plugin.sns.ui.PhotosContent photosContent = snsCommentDetailUI.D2;
                            if (photosContent != null && (maskImageWithLivePhotoTagView = (com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView) photosContent.findViewById(com.tencent.mm.plugin.sns.ui.tm.f170533h[i18])) != null) {
                                com.tencent.mm.plugin.sns.ui.MaskImageView imageView = maskImageWithLivePhotoTagView.getImageView();
                                int[] iArr = new int[2];
                                imageView.getLocationOnScreen(iArr);
                                int i28 = iArr[0];
                                am.je jeVar = galleryPhotoInfoEvent2.f54356h;
                                jeVar.f7027a = i28;
                                jeVar.f7028b = iArr[1];
                                jeVar.f7029c = imageView.getWidth();
                                jeVar.f7030d = imageView.getHeight();
                            }
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhotoInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$6");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$6");
                return false;
            }
        };
        this.f166872m2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdListScrollEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.7
            {
                this.__eventId = 574649668;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsAdListScrollEvent snsAdListScrollEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$7");
                com.tencent.mm.autogen.events.SnsAdListScrollEvent snsAdListScrollEvent2 = snsAdListScrollEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$7");
                if (snsAdListScrollEvent2 instanceof com.tencent.mm.autogen.events.SnsAdListScrollEvent) {
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                    if (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.p7(snsCommentDetailUI) != null) {
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.p7(snsCommentDetailUI).requestDisallowInterceptTouchEvent(!snsAdListScrollEvent2.f54793g.f6290a);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$7");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$7");
                return false;
            }
        };
        this.f166874n2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsCommentUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.8
            {
                this.__eventId = -1499688230;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsCommentUpdateEvent snsCommentUpdateEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$8");
                com.tencent.mm.autogen.events.SnsCommentUpdateEvent snsCommentUpdateEvent2 = snsCommentUpdateEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$8");
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                java.lang.String t07 = ca4.z0.t0(com.tencent.mm.plugin.sns.storage.w2.n(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.U6(snsCommentDetailUI)));
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "commentUpdateListener >> idString: %s eventIdString: %s", t07, snsCommentUpdateEvent2.f54805g.f7463a);
                if (t07.equals(snsCommentUpdateEvent2.f54805g.f7463a)) {
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.V6(snsCommentDetailUI).notifyDataSetChanged();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$8");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$8");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$8");
                return false;
            }
        };
        this.f166876o2 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.ScrollUp();
        this.f166880p2 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass10();
        this.f166882q2 = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.11
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.lang.String str;
                com.tencent.mm.modelsns.SnsAdClick snsAdClick;
                java.lang.String str2;
                java.lang.String str3;
                java.lang.String str4;
                java.lang.String str5;
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
                java.lang.String str6;
                java.lang.String str7;
                com.tencent.mm.plugin.sns.storage.ADXml adXml;
                int i17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$11");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                java.lang.String str8 = (java.lang.String) view.getTag();
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                com.tencent.mm.plugin.sns.storage.SnsInfo B7 = snsCommentDetailUI.B7(true);
                java.lang.Object tag = view.getTag(com.tencent.mm.R.id.f486976n23);
                boolean booleanValue = tag instanceof java.lang.Boolean ? ((java.lang.Boolean) tag).booleanValue() : false;
                java.lang.Object tag2 = view.getTag(com.tencent.mm.R.id.n3k);
                boolean booleanValue2 = tag2 instanceof java.lang.Boolean ? ((java.lang.Boolean) tag2).booleanValue() : false;
                if (B7 == null || !B7.isAd() || (!booleanValue && !booleanValue2)) {
                    android.content.Intent intent = new android.content.Intent();
                    java.lang.Object tag3 = view.getTag(com.tencent.mm.R.id.v8i);
                    if (tag3 instanceof java.lang.Boolean ? ((java.lang.Boolean) tag3).booleanValue() : false) {
                        intent.putExtra("CONTACT_INFO_UI_SOURCE", 105);
                    } else {
                        intent.putExtra("CONTACT_INFO_UI_SOURCE", 106);
                    }
                    intent.putExtra("Contact_User", str8);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, snsCommentDetailUI);
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$11");
                    return;
                }
                try {
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = B7.getTimeLine();
                    if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(B7) && ((i17 = timeLine.ContentObj.f369837e) == 15 || i17 == 5)) {
                        com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent snsAdLivingStreamJumpEvent = new com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent();
                        snsAdLivingStreamJumpEvent.f54794g.f6405a = ca4.z0.T(B7);
                        snsAdLivingStreamJumpEvent.e();
                    }
                    if (B7.isValidAdHeadStateInfo()) {
                        x84.c.c(B7);
                    }
                } catch (java.lang.Throwable unused) {
                }
                com.tencent.mm.modelsns.SnsAdClick snsAdClick2 = new com.tencent.mm.modelsns.SnsAdClick(snsCommentDetailUI.G7(), 2, B7.field_snsId, 1, 0);
                ca4.m0.f(snsAdClick2, com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.X6(snsCommentDetailUI), B7, 1);
                if (booleanValue2) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAdClickPos", "com.tencent.mm.plugin.sns.ad.utils.SnsAdClickUtil");
                    snsAdClick2.f71469g = 43;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAdClickPos", "com.tencent.mm.plugin.sns.ad.utils.SnsAdClickUtil");
                }
                if (str8 == null || !str8.equals(B7.getUserName()) || (adXml = B7.getAdXml()) == null) {
                    str = str8;
                    snsAdClick = snsAdClick2;
                    str2 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$11";
                    str3 = "android/view/View$OnClickListener";
                    str4 = "Contact_User";
                    str5 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$11";
                    snsInfo = B7;
                    str6 = "(Landroid/view/View;)V";
                    str7 = "onClick";
                } else {
                    if (adXml.headClickType == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(adXml.headClickParam)) {
                        l44.b0.e(B7);
                        java.lang.String str9 = adXml.headClickParam;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        com.tencent.mm.plugin.sns.storage.ADInfo C7 = snsCommentDetailUI.C7(B7);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        if (C7 != null) {
                            str9 = ca4.z0.b(str9, C7.uxInfo);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "headClickParam url " + str9 + " " + adXml.headClickRightBarShow);
                        android.content.Intent intent2 = new android.content.Intent();
                        boolean z18 = adXml.headClickRightBarShow == 0;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        com.tencent.mm.plugin.sns.storage.ADInfo C72 = snsCommentDetailUI.C7(B7);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        intent2.putExtra("KsnsViewId", C72.viewId);
                        intent2.putExtra("KRightBtn", z18);
                        intent2.putExtra("jsapiargs", new android.os.Bundle());
                        intent2.putExtra("rawUrl", str9);
                        intent2.putExtra("useJs", true);
                        ca4.z0.a(intent2, 82);
                        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent2, snsCommentDetailUI);
                        ca4.z0.x0(snsAdClick2);
                        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$11");
                        return;
                    }
                    v64.d dVar = new v64.d();
                    dVar.b("ext_sns_ad_click", snsAdClick2);
                    str = str8;
                    str2 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$11";
                    snsAdClick = snsAdClick2;
                    str3 = "android/view/View$OnClickListener";
                    str6 = "(Landroid/view/View;)V";
                    str4 = "Contact_User";
                    str5 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$11";
                    if (l44.k4.f316220a.b(view, snsCommentDetailUI, B7, snsCommentDetailUI.G7(), adXml, com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.X6(snsCommentDetailUI), dVar)) {
                        yj0.a.h(this, str2, str3, "onClick", str6);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", str5);
                        return;
                    }
                    v64.c c17 = v64.a.c(snsCommentDetailUI);
                    if (c17 != null) {
                        str7 = "onClick";
                        snsInfo = B7;
                        if (c17.a(view, snsCommentDetailUI.G7(), snsInfo, dVar)) {
                            l44.b0.e(snsInfo);
                            yj0.a.h(this, str2, str3, str7, str6);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str7, str5);
                            return;
                        }
                    } else {
                        str7 = "onClick";
                        snsInfo = B7;
                    }
                }
                com.tencent.mm.modelsns.SnsAdClick snsAdClick3 = snsAdClick;
                a84.u0.a(snsAdClick3, 40);
                ca4.z0.x0(snsAdClick3);
                l44.b0.e(snsInfo);
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra(str4, str);
                intent3.putExtra("Contact_Scene", 37);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent3, snsCommentDetailUI);
                yj0.a.h(this, str2, str3, str7, str6);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str7, str5);
            }
        };
        this.f166884r2 = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.12
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$12");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "header scrollTopClickListener");
                int i17 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                snsCommentDetailUI.X7();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                boolean z18 = snsCommentDetailUI.D;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                if (!z18) {
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$12");
                    return;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                snsCommentDetailUI.V7(true);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$12");
            }
        };
        this.f166886s2 = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.17
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                boolean z18;
                boolean z19;
                java.lang.String str;
                java.lang.String str2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$17");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "itemView scrollTopClickListener");
                int i17 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                final com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                snsCommentDetailUI.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.CommentListAdapter.ViewHolder viewHolder = view.getTag() instanceof com.tencent.mm.plugin.sns.ui.u1 ? (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.CommentListAdapter.ViewHolder) ((com.tencent.mm.plugin.sns.ui.u1) view.getTag()).f170558f : null;
                if (viewHolder == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                } else {
                    java.lang.Object obj = viewHolder.f167075h;
                    if (obj instanceof r45.e86) {
                        if (snsCommentDetailUI.D) {
                            snsCommentDetailUI.V7(false);
                        }
                        final r45.e86 e86Var = (r45.e86) viewHolder.f167075h;
                        final java.lang.String charSequence = viewHolder.f167072e.getText().toString();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        if (com.tencent.mm.plugin.sns.ui.widget.t2.i(e86Var.f373139t, 64)) {
                            db5.e1.f(snsCommentDetailUI.getContext(), null, new java.lang.String[]{snsCommentDetailUI.getContext().getString(com.tencent.mm.R.string.f490367t0)}, null, snsCommentDetailUI.getContext().getString(com.tencent.mm.R.string.f490347sg), new db5.c1() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.14
                                @Override // db5.c1
                                public void e(int i18) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$14");
                                    if (i18 == 0) {
                                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.Z6(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this, e86Var);
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$14");
                                }
                            });
                        } else {
                            db5.e1.f(snsCommentDetailUI.getContext(), null, new java.lang.String[]{snsCommentDetailUI.getContext().getString(com.tencent.mm.R.string.f490359sr), snsCommentDetailUI.getContext().getString(com.tencent.mm.R.string.f490367t0)}, null, snsCommentDetailUI.getContext().getString(com.tencent.mm.R.string.f490347sg), new db5.c1() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.15
                                @Override // db5.c1
                                public void e(int i18) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                                    r45.e86 e86Var2 = e86Var;
                                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI2 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                                    if (i18 == 0) {
                                        java.lang.CharSequence charSequence2 = charSequence;
                                        if (com.tencent.mm.sdk.platformtools.b0.f(charSequence2)) {
                                            db5.e1.T(snsCommentDetailUI2.getContext(), snsCommentDetailUI2.getContext().getString(com.tencent.mm.R.string.f490361st));
                                            java.lang.String r07 = com.tencent.mm.sdk.platformtools.t8.r0(com.tencent.mm.plugin.sns.storage.w2.n(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.U6(snsCommentDetailUI2)));
                                            if (e86Var2 != null && charSequence2 != null && r07 != null) {
                                                w04.a.INSTANCE.A9(4, r07 + ":" + e86Var2.f373132m, com.tencent.mm.sdk.platformtools.t8.o0(charSequence2.toString()));
                                            }
                                        } else {
                                            db5.e1.T(snsCommentDetailUI2.getContext(), snsCommentDetailUI2.getContext().getString(com.tencent.mm.R.string.f490360ss));
                                        }
                                    } else if (i18 == 1) {
                                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.Z6(snsCommentDetailUI2, e86Var2);
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                                }
                            });
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        com.tencent.mm.plugin.sns.storage.SnsInfo B7 = snsCommentDetailUI.B7(false);
                        if (B7 != null) {
                            com.tencent.mm.plugin.sns.ui.widget.j3.f171174a.c(ca4.z0.t0(B7.field_snsId), e86Var);
                        }
                    } else if (obj instanceof java.lang.Object[]) {
                        final java.lang.Object[] objArr = (java.lang.Object[]) obj;
                        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = snsCommentDetailUI.B;
                        java.lang.String str3 = (java.lang.String) objArr[2];
                        snsCommentFooter.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReplyingTheSameUser", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                        r45.e86 e86Var2 = snsCommentFooter.f167105v;
                        if ((e86Var2 == null || (str2 = e86Var2.f373126d) == null || !str2.equals(str3)) && !snsCommentFooter.z()) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReplyingTheSameUser", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                            z18 = false;
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReplyingTheSameUser", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                            z18 = true;
                        }
                        if (z18) {
                            r45.e86 e86Var3 = (r45.e86) objArr[1];
                            com.tencent.mm.plugin.sns.storage.SnsInfo B72 = snsCommentDetailUI.B7(false);
                            snsCommentDetailUI.B.H(0);
                            snsCommentDetailUI.B.setCommentHint(snsCommentDetailUI.getString(com.tencent.mm.R.string.f493233je0) + objArr[3]);
                            if (B72 != null && B72.isAd() && (str = e86Var3.f373126d) != null && str.equals(B72.getUserName())) {
                                snsCommentDetailUI.B.H(1);
                            }
                            snsCommentDetailUI.B.setCommentInfo(e86Var3);
                            snsCommentDetailUI.B.setSnsInfo(B72);
                            snsCommentDetailUI.B.O(false);
                            snsCommentDetailUI.B.setToSendTextColor(true);
                            snsCommentDetailUI.B.R(true);
                            int intValue = ((java.lang.Integer) objArr[0]).intValue();
                            if (com.tencent.mm.plugin.sns.model.s5.e(B72).LikeUserList.size() <= 0 || (intValue = intValue + 1) <= snsCommentDetailUI.f166891v.getCount()) {
                                z19 = true;
                            } else {
                                z19 = true;
                                intValue = snsCommentDetailUI.f166891v.getCount() - 1;
                            }
                            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.ScrollUp scrollUp = snsCommentDetailUI.f166876o2;
                            scrollUp.a(intValue);
                            int height = view.getHeight();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setItemHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp");
                            scrollUp.f167087h = height;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setItemHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp");
                            com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter2 = snsCommentDetailUI.B;
                            snsCommentFooter2.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInEnlargeStatus", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                            boolean z27 = (snsCommentFooter2.I && snsCommentFooter2.f167098p0 && snsCommentFooter2.C != 0) ? z19 : false;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInEnlargeStatus", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                            if (!z27) {
                                snsCommentDetailUI.W7();
                            }
                            if (B72 != null) {
                                com.tencent.mm.plugin.sns.ui.widget.j3.f171174a.c(ca4.z0.t0(B72.field_snsId), e86Var3);
                            }
                        } else {
                            db5.e1.f(snsCommentDetailUI, null, new java.lang.String[]{snsCommentDetailUI.getString(com.tencent.mm.R.string.f493233je0) + objArr[3]}, null, snsCommentDetailUI.getString(com.tencent.mm.R.string.f490347sg), new db5.c1() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.13
                                @Override // db5.c1
                                public void e(int i18) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$13");
                                    if (i18 == 0) {
                                        java.lang.Object[] objArr2 = objArr;
                                        r45.e86 e86Var4 = (r45.e86) objArr2[1];
                                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI2 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI2).H(0);
                                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI2).s();
                                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI2).setCommentHint(snsCommentDetailUI2.getString(com.tencent.mm.R.string.f493233je0) + objArr2[3]);
                                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI2).setCommentInfo(e86Var4);
                                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI2).O(false);
                                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI2).setToSendTextColor(true);
                                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI2).R(true);
                                        int intValue2 = ((java.lang.Integer) objArr2[0]).intValue();
                                        com.tencent.mm.plugin.sns.storage.SnsInfo B73 = snsCommentDetailUI2.B7(false);
                                        if (com.tencent.mm.plugin.sns.model.s5.e(B73).LikeUserList.size() > 0 && (intValue2 = intValue2 + 1) > com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.V6(snsCommentDetailUI2).getCount()) {
                                            intValue2 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.V6(snsCommentDetailUI2).getCount() - 1;
                                        }
                                        com.tencent.mm.plugin.sns.ui.SnsCommentFooter W6 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI2);
                                        W6.getClass();
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInEnlargeStatus", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                                        boolean z28 = W6.I && W6.f167098p0 && W6.C != 0;
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInEnlargeStatus", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                                        if (!z28) {
                                            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.Y6(snsCommentDetailUI2).a(intValue2);
                                            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.Y6(snsCommentDetailUI2).run();
                                        }
                                        if (B73 != null) {
                                            com.tencent.mm.plugin.sns.ui.widget.j3.f171174a.c(ca4.z0.t0(B73.field_snsId), e86Var4);
                                        }
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$13");
                                }
                            });
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$17");
            }
        };
        this.f166888t2 = false;
        this.f166890u2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsLuckyPayNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.26
            {
                this.__eventId = -702066263;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsLuckyPayNotifyEvent snsLuckyPayNotifyEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$26");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$26");
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this.a8();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$26");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$26");
                return false;
            }
        };
        this.f166892v2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.27
            {
                this.__eventId = -1155728636;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
            
                if (r7 != 7) goto L19;
             */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent r7) {
                /*
                    r6 = this;
                    java.lang.String r0 = "callback"
                    java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$27"
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    com.tencent.mm.autogen.events.MusicPlayerEvent r7 = (com.tencent.mm.autogen.events.MusicPlayerEvent) r7
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    boolean r2 = r7 instanceof com.tencent.mm.autogen.events.MusicPlayerEvent
                    if (r2 == 0) goto L64
                    am.jk r7 = r7.f54512g
                    int r7 = r7.f7036b
                    java.lang.String r2 = "access$3300"
                    java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI r4 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this
                    if (r7 == 0) goto L56
                    r5 = 1
                    if (r7 == r5) goto L56
                    r5 = 2
                    if (r7 == r5) goto L56
                    r5 = 3
                    if (r7 == r5) goto L56
                    r5 = 4
                    if (r7 == r5) goto L2c
                    r5 = 7
                    if (r7 == r5) goto L56
                    goto L64
                L2c:
                    java.lang.String r7 = "MicroMsg.SnsCommentDetailUI"
                    java.lang.String r5 = "musicPlayerListener error"
                    com.tencent.mars.xlog.Log.i(r7, r5)
                    int r7 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                    r4.e8()
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.f7(r4)
                    java.lang.String r7 = "access$4000"
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r3)
                    java.lang.String r2 = "processPlayError"
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                    il4.l r4 = il4.l.f292142a
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
                    goto L64
                L56:
                    int r7 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                    r4.e8()
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.f7(r4)
                L64:
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    r7 = 0
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass27.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f166894w2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicCheckErrorEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.28
            {
                this.__eventId = -1443570203;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicCheckErrorEvent musicCheckErrorEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$28");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$28");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "musicCheckErrorListener check error");
                if (musicCheckErrorEvent.f54511g.f6956a == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "musicCheckErrorListener, must has error.");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$28");
                } else {
                    int i17 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processPlayError", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    il4.l lVar = il4.l.f292142a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processPlayError", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$28");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$28");
                return false;
            }
        };
        this.f166898x2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FullScreenHelperEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.29
            {
                this.__eventId = 1752709249;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FullScreenHelperEvent fullScreenHelperEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$29");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$29");
                boolean z18 = fullScreenHelperEvent instanceof com.tencent.mm.autogen.events.FullScreenHelperEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$29");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$29");
                return false;
            }
        };
        this.f166905z2 = false;
        this.A2 = null;
        this.B2 = -1;
        this.C2 = false;
        this.D2 = null;
        this.G2 = 0;
        this.H2 = new c01.o8() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.44
            @Override // c01.o8
            public void a(final java.lang.String str, final boolean z18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContactCallBack", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$44");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "setAvatar, getContactCallBack, userName=" + str + ", succ=" + z18 + ", retryCount=" + com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this.G2);
                new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.44.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$44$1");
                        boolean z19 = z18;
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass44 anonymousClass44 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass44.this;
                        if (z19 && !com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this.isFinishing() && com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this.G2 < 5) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "setAvatar, setHeader after getContact, userName=" + str);
                            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this.a8();
                        }
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this.G2++;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$44$1");
                    }
                }, 500L);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContactCallBack", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$44");
            }
        };
        this.I2 = null;
        this.J2 = null;
        this.K2 = null;
        this.L2 = new com.tencent.mm.pluginsdk.ui.span.a() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.45
            @Override // com.tencent.mm.pluginsdk.ui.span.a
            public void a(int i17, int i18) {
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAdTagClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$45");
                try {
                    com.tencent.mm.plugin.sns.storage.SnsInfo B7 = snsCommentDetailUI.B7(false);
                    if (B7 != null) {
                        com.tencent.mars.xlog.Log.i("AdTagClickableHelper", "In SnsCommentDetailUI, snsId = " + B7.field_snsId + ", source = " + snsCommentDetailUI.G7() + ", clickPos = " + i18);
                        n74.o0.c(snsCommentDetailUI, snsCommentDetailUI.G7(), B7, i18);
                    } else {
                        com.tencent.mars.xlog.Log.e("AdTagClickableHelper", "In SnsCommentDetailUI, snsInfo is null");
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("AdTagClickableHelper", th6.toString());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdTagClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$45");
            }
        };
        this.N2 = com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic.e();
    }

    public static /* synthetic */ java.lang.String U6(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        java.lang.String str = snsCommentDetailUI.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return str;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.CommentListAdapter V6(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.CommentListAdapter commentListAdapter = snsCommentDetailUI.f166891v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return commentListAdapter;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter W6(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = snsCommentDetailUI.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return snsCommentFooter;
    }

    public static /* synthetic */ i64.b1 X6(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        i64.b1 b1Var = snsCommentDetailUI.f166869l1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return b1Var;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.ScrollUp Y6(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.ScrollUp scrollUp = snsCommentDetailUI.f166876o2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return scrollUp;
    }

    public static void Z6(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI, r45.e86 e86Var) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        snsCommentDetailUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealWithDelete", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("del snsId:");
        sb6.append(snsCommentDetailUI.G);
        sb6.append(" commentId:");
        int i17 = 0;
        sb6.append(e86Var != null ? e86Var.f373132m : 0);
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", sb6.toString());
        final com.tencent.mm.plugin.sns.model.q2 q2Var = new com.tencent.mm.plugin.sns.model.q2(com.tencent.mm.plugin.sns.storage.w2.n(snsCommentDetailUI.G), com.tencent.mm.plugin.sns.storage.w2.g(snsCommentDetailUI.G) ? 4 : 6, e86Var);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(q2Var);
        snsCommentDetailUI.N = db5.e1.Q(snsCommentDetailUI, snsCommentDetailUI.getString(com.tencent.mm.R.string.f490573yv), snsCommentDetailUI.getString(com.tencent.mm.R.string.j9z), true, true, new android.content.DialogInterface.OnCancelListener(snsCommentDetailUI) { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.16
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(android.content.DialogInterface dialogInterface) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$16");
                gm0.j1.i();
                gm0.j1.n().f273288b.d(q2Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$16");
            }
        });
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        s0Var.Q().f60458r = 4L;
        com.tencent.mm.plugin.sns.storage.SnsInfo a17 = com.tencent.mm.plugin.sns.storage.l1.a(snsCommentDetailUI.G);
        if (e86Var != null) {
            i17 = e86Var.f373132m;
            str = e86Var.f373126d;
        } else {
            str = "";
        }
        s0Var.I(a17, i17, str, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealWithDelete", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public static void a7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI, android.view.View view) {
        dc4.v vVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        snsCommentDetailUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealWithLiked", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (com.tencent.mm.plugin.sns.storage.w2.h(snsCommentDetailUI.G)) {
            final com.tencent.mm.plugin.sns.storage.SnsInfo a17 = com.tencent.mm.plugin.sns.storage.l1.a(snsCommentDetailUI.G);
            if (a17 != null) {
                if (a17.isSocialAttitudeAd() && (vVar = snsCommentDetailUI.f166900y0) != null) {
                    a17 = vVar.k(a17);
                }
                int likeFlag = a17.getLikeFlag();
                com.tencent.mm.plugin.sns.statistics.m mVar = snsCommentDetailUI.f166860f2;
                if (likeFlag == 0) {
                    mVar.a(true);
                    a17.setLikeFlag(1);
                    snsCommentDetailUI.S1 = true;
                    com.tencent.mm.plugin.sns.storage.l1.d(a17.getSnsId(), a17);
                    com.tencent.mm.plugin.sns.model.d6.n(a17, a17.isAd() ? 7 : 1, null, snsCommentDetailUI.G7());
                    snsCommentDetailUI.f166891v.notifyDataSetChanged();
                    com.tencent.mm.plugin.sns.statistics.s0.f164937k0.Q().f60459s = 3L;
                    com.tencent.mm.plugin.sns.model.k7.f164367a.b(a17, 3);
                    if (a17.isAd()) {
                        l44.b3.f316041a.e(a17);
                    }
                } else {
                    mVar.a(false);
                    a17.setLikeFlag(0);
                    com.tencent.mm.plugin.sns.storage.l1.d(a17.getSnsId(), a17);
                    com.tencent.mm.plugin.sns.model.d6.a(a17.getSnsId());
                    com.tencent.mm.plugin.sns.statistics.s0.f164937k0.Q().f60459s = 5L;
                    if (a17.isAd()) {
                        l44.b3.f316041a.l(a17);
                    }
                }
                android.widget.LinearLayout linearLayout = snsCommentDetailUI.f166903z;
                if (linearLayout != null) {
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) linearLayout.findViewById(com.tencent.mm.R.id.f482869qc);
                    android.widget.TextView textView = (android.widget.TextView) snsCommentDetailUI.f166903z.findViewById(com.tencent.mm.R.id.f482871qe);
                    if (a17.getLikeFlag() == 1) {
                        if (snsCommentDetailUI.f166855d) {
                            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_like);
                            weImageView.setIconColor(snsCommentDetailUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac));
                            weImageView.setPadding(0, 0, 0, 0);
                        }
                        if (textView != null) {
                            textView.setImportantForAccessibility(2);
                            textView.setText(com.tencent.mm.R.string.jam);
                            textView.announceForAccessibility(view.getResources().getString(com.tencent.mm.R.string.j5n));
                            textView.setImportantForAccessibility(1);
                        }
                        final android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        final com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) linearLayout2.findViewById(com.tencent.mm.R.id.f482869qc);
                        if (weImageView2 == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        } else {
                            android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, 1, 0.5f, 1, 0.5f);
                            final android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, 1, 0.5f, 1, 0.5f);
                            scaleAnimation.setDuration(100L);
                            scaleAnimation.setRepeatCount(0);
                            scaleAnimation.setFillAfter(true);
                            scaleAnimation2.setDuration(100L);
                            scaleAnimation2.setRepeatCount(0);
                            scaleAnimation2.setFillAfter(true);
                            weImageView2.clearAnimation();
                            weImageView2.startAnimation(scaleAnimation);
                            scaleAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener(snsCommentDetailUI) { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.66
                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationEnd(android.view.animation.Animation animation) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$66");
                                    weImageView2.startAnimation(scaleAnimation2);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$66");
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationRepeat(android.view.animation.Animation animation) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$66");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$66");
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationStart(android.view.animation.Animation animation) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$66");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$66");
                                }
                            });
                            scaleAnimation2.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.67
                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationEnd(android.view.animation.Animation animation) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$67");
                                    android.widget.LinearLayout linearLayout3 = linearLayout2;
                                    if (linearLayout3 != null) {
                                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI2 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                                        android.view.View c76 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.c7(snsCommentDetailUI2);
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$6900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                                        snsCommentDetailUI2.z7(c76);
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$6900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                                        linearLayout3.setPressed(false);
                                    }
                                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = a17;
                                    if (snsInfo != null && snsInfo.isAd()) {
                                        l44.b3.f316041a.f(snsInfo);
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$67");
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationRepeat(android.view.animation.Animation animation) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$67");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$67");
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationStart(android.view.animation.Animation animation) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$67");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$67");
                                }
                            });
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        }
                    } else {
                        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_like);
                        weImageView.setIconColor(snsCommentDetailUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
                        if (textView != null) {
                            textView.setImportantForAccessibility(2);
                            textView.setText(com.tencent.mm.R.string.jc8);
                            textView.announceForAccessibility(view.getResources().getString(com.tencent.mm.R.string.j5p));
                            textView.setImportantForAccessibility(1);
                        }
                        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) view;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhileSendUnLiked", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        if (linearLayout3 != null) {
                            snsCommentDetailUI.z7(snsCommentDetailUI.f166887t);
                            linearLayout3.setPressed(false);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhileSendUnLiked", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    }
                }
            }
            com.tencent.mm.protocal.protobuf.SnsObject f17 = com.tencent.mm.plugin.sns.model.s5.f(com.tencent.mm.plugin.sns.storage.l1.a(snsCommentDetailUI.G));
            java.util.LinkedList<r45.e86> linkedList = f17.LikeUserList;
            snsCommentDetailUI.A = linkedList;
            snsCommentDetailUI.b8(linkedList, f17.CommentUserList.isEmpty());
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.CommentListAdapter commentListAdapter = snsCommentDetailUI.f166891v;
            java.util.LinkedList<r45.e86> linkedList2 = f17.LikeUserList;
            commentListAdapter.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLikedList", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
            commentListAdapter.f167065e = linkedList2;
            commentListAdapter.notifyDataSetChanged();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLikedList", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealWithLiked", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealWithLiked", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public static /* synthetic */ dc4.v b7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        dc4.v vVar = snsCommentDetailUI.f166900y0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return vVar;
    }

    public static /* synthetic */ android.view.View c7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        android.view.View view = snsCommentDetailUI.f166887t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return view;
    }

    public static void d7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        snsCommentDetailUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fixScollUp", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        int count = snsCommentDetailUI.f166891v.getCount() - 1;
        r45.e86 commentInfo = snsCommentDetailUI.B.getCommentInfo();
        int i17 = commentInfo.f373132m;
        long j17 = i17 != 0 ? i17 : commentInfo.f373137r;
        int i18 = 0;
        while (true) {
            if (i18 >= snsCommentDetailUI.f166891v.f167064d.size()) {
                break;
            }
            r45.e86 e86Var = (r45.e86) snsCommentDetailUI.f166891v.f167064d.get(i18);
            int i19 = e86Var.f373132m;
            if ((i19 != 0 ? i19 : e86Var.f373137r) == j17) {
                count = i18;
                break;
            }
            i18++;
        }
        int E7 = snsCommentDetailUI.E7();
        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.ScrollUp scrollUp = snsCommentDetailUI.f166876o2;
        scrollUp.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setItemHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp");
        scrollUp.f167087h = E7;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setItemHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp");
        if (com.tencent.mm.plugin.sns.model.s5.f(com.tencent.mm.plugin.sns.storage.l1.a(snsCommentDetailUI.G)).LikeUserList.size() > 0 && (count = count + 1) > snsCommentDetailUI.f166891v.getCount()) {
            count = snsCommentDetailUI.f166891v.getCount() - 1;
        }
        scrollUp.a(count);
        snsCommentDetailUI.W7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixScollUp", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.j e7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.j jVar = snsCommentDetailUI.f166897x1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return jVar;
    }

    public static void f7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        snsCommentDetailUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateMusicMvIconState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = snsCommentDetailUI.Q;
        if (weImageView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMusicMvIconState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        } else {
            weImageView.setPressed(false);
            com.tencent.mm.plugin.ting.widget.MusicView musicView = snsCommentDetailUI.R;
            if (musicView != null) {
                musicView.a(true, com.tencent.mm.plugin.sns.ui.wm.c(snsCommentDetailUI.T, null));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMusicMvIconState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public static /* synthetic */ android.view.View g7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        android.view.View view = snsCommentDetailUI.f166859f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return view;
    }

    public static void h7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        snsCommentDetailUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBlessBubble", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.25
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$25");
                final com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView snsAvatarImageView = (com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView) com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.g7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this).findViewById(com.tencent.mm.R.id.f482806od);
                snsAvatarImageView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupPopWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
                if (snsAvatarImageView.f170841q == null) {
                    com.tencent.mm.plugin.patmsg.ui.PatPopupWindow patPopupWindow = new com.tencent.mm.plugin.patmsg.ui.PatPopupWindow(com.tencent.mm.ui.id.b(com.tencent.mm.sdk.platformtools.x2.f193071a).inflate(com.tencent.mm.R.layout.epa, (android.view.ViewGroup) null));
                    snsAvatarImageView.f170841q = patPopupWindow;
                    patPopupWindow.setAnimationStyle(com.tencent.mm.R.style.f494445ne);
                    snsAvatarImageView.f170841q.setOutsideTouchable(false);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupPopWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showPatTipView", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
                if (snsAvatarImageView.f170841q == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showPatTipView", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
                } else {
                    int[] iArr = new int[2];
                    snsAvatarImageView.getLocationOnScreen(iArr);
                    int dimensionPixelSize = iArr[0] - com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
                    android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                    layoutParams.rightMargin = dimensionPixelSize;
                    layoutParams.leftMargin = dimensionPixelSize;
                    snsAvatarImageView.f170841q.a(snsAvatarImageView, 0, 2, layoutParams, false, false, true);
                    snsAvatarImageView.post(new com.tencent.mm.plugin.sns.ui.widget.d1(snsAvatarImageView, iArr));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showPatTipView", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
                }
                com.tencent.mm.plugin.sns.storage.SnsInfo B7 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this.B7(false);
                if (B7 != null) {
                    java.lang.String feedId = ca4.z0.t0(B7.field_snsId);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSnsDetailCallMsgExp", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
                    kotlin.jvm.internal.o.g(feedId, "feedId");
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsSpring33050Reporter", "reportSnsDetailCallMsgExp >> feedId: ".concat(feedId));
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("pay_new_year_call_to_you", "view_exp", kz5.b1.e(new jz5.l("sns_feed_id", feedId)), 33050);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSnsDetailCallMsgExp", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
                }
                ku5.u0 u0Var2 = ku5.t0.f312615d;
                java.lang.Runnable runnable2 = new java.lang.Runnable(this) { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.25.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$25$1");
                        snsAvatarImageView.r();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$25$1");
                    }
                };
                ku5.t0 t0Var = (ku5.t0) u0Var2;
                t0Var.getClass();
                t0Var.z(runnable2, 5000L, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$25");
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 300L, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBlessBubble", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public static void i7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        snsCommentDetailUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.storage.SnsInfo B7 = snsCommentDetailUI.B7(false);
        if (B7.getSnsId().equals(str)) {
            com.tencent.mm.plugin.sns.model.s6.k(str, 4);
            snsCommentDetailUI.f166904z1.setVisibility(8);
            snsCommentDetailUI.f166861g.setTag(new com.tencent.mm.plugin.sns.ui.go(snsCommentDetailUI.G, B7.getLocalid(), true, false, 2));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public static void j7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        bd4.f2 f2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        snsCommentDetailUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideDescSelectableView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentSnsSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$Companion");
        java.lang.ref.WeakReference e17 = bd4.f2.e();
        wl5.x m17 = (e17 == null || (f2Var = (bd4.f2) e17.get()) == null) ? null : f2Var.m();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentSnsSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$Companion");
        if (m17 == null || snsCommentDetailUI.f166865i) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideDescSelectableView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        } else {
            snsCommentDetailUI.f166865i = true;
            m17.i();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideDescSelectableView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public static void k7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        bd4.f2 f2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        snsCommentDetailUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryResumeDescSelectableView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentSnsSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$Companion");
        java.lang.ref.WeakReference e17 = bd4.f2.e();
        wl5.x m17 = (e17 == null || (f2Var = (bd4.f2) e17.get()) == null) ? null : f2Var.m();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentSnsSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$Companion");
        if (m17 == null || !snsCommentDetailUI.f166865i) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryResumeDescSelectableView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        } else if (snsCommentDetailUI.P1 != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryResumeDescSelectableView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        } else {
            ul5.k bounceView = snsCommentDetailUI.getBounceView();
            if (bounceView == null || bounceView.getOffset() == 0) {
                snsCommentDetailUI.f166865i = false;
                android.view.View view = m17.f447165j;
                if (view != null) {
                    view.removeCallbacks(m17.U);
                    if (!m17.N) {
                        m17.o();
                    }
                    m17.K = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryResumeDescSelectableView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryResumeDescSelectableView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public static void l7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        mb4.r rVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        snsCommentDetailUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchIdleArea", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = snsCommentDetailUI.B;
        if (snsCommentFooter != null) {
            snsCommentFooter.R(false);
            if (snsCommentDetailUI.B.z()) {
                snsCommentDetailUI.B.H(0);
                snsCommentDetailUI.B.s();
                com.tencent.mm.plugin.sns.storage.SnsInfo B7 = snsCommentDetailUI.B7(true);
                if (B7 != null) {
                    B7.getTimeLine();
                }
                java.lang.String D7 = snsCommentDetailUI.D7(B7);
                if (B7 != null && B7.isFireworkCheerAd()) {
                    mb4.c cVar = B7.getAdXml().adSocialInfo;
                    if (cVar != null && (rVar = cVar.f325388m) != null && !com.tencent.mm.sdk.platformtools.t8.K0(rVar.b())) {
                        D7 = cVar.f325388m.b();
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "firework ad onTouchIdleArea: reset comment " + D7);
                }
                snsCommentDetailUI.B.setCommentHint(D7);
                if (B7 != null) {
                    if (!B7.isAd() || (B7.getTimeLine().ContentObj.f369841i & 8) == 0) {
                        snsCommentDetailUI.B.O(false);
                    } else if (snsCommentDetailUI.L7(B7)) {
                        snsCommentDetailUI.B.O(true);
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "isAtInfoValid is false！");
                        snsCommentDetailUI.B.O(false);
                    }
                }
            } else {
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter2 = snsCommentDetailUI.B;
                snsCommentFooter2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                snsCommentFooter2.f167107x = 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchIdleArea", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public static /* synthetic */ java.lang.String m7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        java.lang.String str = snsCommentDetailUI.H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return str;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i n7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.listener.i iVar = snsCommentDetailUI.f166879p1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return iVar;
    }

    public static /* synthetic */ int o7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$6100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        int i17 = snsCommentDetailUI.f166896x0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$6100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return i17;
    }

    public static /* synthetic */ android.widget.ListView p7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        android.widget.ListView listView = snsCommentDetailUI.f166885s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return listView;
    }

    public final xe0.u0 A7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createCommentDetailTextStatusStyle", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        int b17 = i65.a.b(this, 4);
        xe0.r0 a17 = new xe0.r0().a().a();
        a17.f453773a = i65.a.b(this, 20);
        a17.f453779g = true;
        a17.f453780h = xe0.p0.f453768e;
        a17.f453789q = new xe0.t0(b17, b17, b17, b17);
        a17.f453790r = new xe0.t0(b17, b17, b17, b17);
        xe0.u0 a18 = a17.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createCommentDetailTextStatusStyle", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return a18;
    }

    @Override // p94.m0
    public void B4(java.lang.String str, java.lang.String str2, boolean z17, int i17, p94.d0 d0Var, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public com.tencent.mm.plugin.sns.storage.SnsInfo B7(boolean z17) {
        com.tencent.mm.plugin.sns.storage.SnsInfo b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fixId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.H)) {
            b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(this.G);
            if (b17 == null && this.I != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "fixId: getSnsInfo from snsObject data  snsId=%s", this.G);
                try {
                    com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(this.I);
                    com.tencent.mm.plugin.sns.storage.SnsInfo m17 = pb4.e.f353196a.m(snsObject, snsObject.Username, 4);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    return m17;
                } catch (java.io.IOException unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "fixId: getSnsInfo from snsObject data parse error snsId=%s", this.G);
                }
            }
            if (x7(b17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "fixId: info null, localSnsId empty, snsId:%s, try finish", this.G);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                return null;
            }
            java.lang.String localid = b17.getLocalid();
            this.H = localid;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "fixId: update by snsId snsId=%s localSnsId:%s", this.G, localid);
        } else {
            b17 = com.tencent.mm.plugin.sns.storage.l1.b(this.H);
            if (b17 == null) {
                if (z17) {
                    dp.a.makeText(this, com.tencent.mm.R.string.jcs, 0).show();
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "fixId: info null, localSnsId:%s, try finish", this.H);
                finish();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                return null;
            }
            java.lang.String snsId = b17.getSnsId();
            this.G = snsId;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "fixId: update by localSnsId=%s snsId: %s", this.H, snsId);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return b17;
    }

    public final com.tencent.mm.plugin.sns.storage.ADInfo C7(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return null;
        }
        if (G7() == 2) {
            com.tencent.mm.plugin.sns.storage.ADInfo atAdInfo = snsInfo.getAtAdInfo();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return atAdInfo;
        }
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return adInfo;
    }

    public final java.lang.String D7(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentHint", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        java.lang.String string = getString(com.tencent.mm.R.string.jgp);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentHint", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return string;
    }

    public final int E7() {
        android.view.View childAt;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentViewHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        android.widget.ListView listView = this.f166885s;
        if (listView == null || listView.getChildCount() <= 1 || (childAt = this.f166885s.getChildAt(0)) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentViewHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return 0;
        }
        int height = childAt.getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentViewHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return height;
    }

    public final int F7(com.tencent.mm.plugin.sns.ui.PhotosContent photosContent) {
        android.view.ViewGroup.LayoutParams layoutParams;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPhotoWidth", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (photosContent != null) {
            try {
                android.view.View f17 = photosContent.f(0);
                if (f17 != null && (layoutParams = f17.getLayoutParams()) != null) {
                    int i17 = layoutParams.width;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhotoWidth", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    return i17;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "getPhotoWidth, exp=" + e17);
                ca4.q.c("getPhotoWidth, photoAdItem", e17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhotoWidth", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return 0;
    }

    public int G7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (this.F1 == 16) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return 2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return 1;
    }

    public final android.widget.LinearLayout H7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUrlInker", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        android.widget.LinearLayout linearLayout = this.A2;
        if (linearLayout != null && i17 == this.B2) {
            this.f166905z2 = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUrlInker", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return linearLayout;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "getUrlInker: inflate viewId:%d", java.lang.Integer.valueOf(i17));
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) com.tencent.mm.ui.id.b(this).inflate(i17, (android.view.ViewGroup) null);
        this.A2 = linearLayout2;
        this.B2 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUrlInker", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return linearLayout2;
    }

    public final java.util.ArrayList I7(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleExportPic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String l17 = com.tencent.mm.plugin.sns.model.i1.l((r45.jj4) it.next());
            if (com.tencent.mm.sdk.platformtools.y1.g(l17)) {
                java.lang.String c17 = dw3.h.f244211a.c("other", l17.split("/")[r4.length - 1]);
                ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).aj(l17, c17, 2);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "wxam:%s to jpg:%s", c17, c17);
                l17 = c17;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "[handleExportPic] path = " + l17);
            arrayList.add(l17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleExportPic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return arrayList;
    }

    public final void J7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.PhotosContent photosContent = this.D2;
        if (photosContent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "initCommonShakeLogic, photoLL==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        android.view.View view = this.f166859f;
        if (photosContent == null || view == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "initCommonShakeLogic, params err");
        } else {
            this.M2 = new com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic(this, photosContent, view, 1, new b94.d() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.71
                @Override // b94.d
                public void a() {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$71");
                    int i17 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$7900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                    snsCommentDetailUI.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOnShake", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    int i18 = 0;
                    while (true) {
                        try {
                            if (i18 >= com.tencent.mm.plugin.sns.ui.tm.f170529d[2]) {
                                break;
                            }
                            com.tencent.mm.plugin.sns.ui.MaskImageView imageView = ((com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView) snsCommentDetailUI.D2.findViewById(com.tencent.mm.plugin.sns.ui.tm.f170533h[i18])).getImageView();
                            if (imageView != null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "doOnShake, succ");
                                imageView.performClick();
                                break;
                            }
                            i18++;
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "doOnShake, exp=" + e17);
                            ca4.q.c("doOnShake, photoAdItem", e17);
                        }
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.SnsCommentDetailUI", "doOnShake, failed");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnShake", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$7900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$71");
                }
            });
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final void K7(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPostDescTranslateResultView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.SnsTranslateResultView snsTranslateResultView = (com.tencent.mm.plugin.sns.ui.SnsTranslateResultView) this.f166859f.findViewById(com.tencent.mm.R.id.nc8);
        this.f166904z1 = snsTranslateResultView;
        snsTranslateResultView.setResultTextSize(((android.widget.TextView) this.f166859f.findViewById(com.tencent.mm.R.id.cut)).getTextSize());
        this.f166904z1.getResultTextView().setBackgroundResource(com.tencent.mm.R.drawable.b1h);
        this.f166904z1.getResultTextView().setTag(new com.tencent.mm.plugin.sns.ui.go(this.G, snsInfo.getLocalid(), false, true, 2));
        if (pc4.d.f353410a.b(snsInfo.isAd())) {
            this.f166904z1.setCreateContextMenuListener(this.f166879p1.f169812o);
            this.f166904z1.setMenuItemSelectedListener(this.f166879p1.f169809l);
        } else {
            rl5.r rVar = this.W;
            android.widget.TextView resultTextView = this.f166904z1.getResultTextView();
            com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f166879p1;
            rVar.j(resultTextView, iVar.f169812o, iVar.f169809l);
        }
        if (com.tencent.mm.plugin.sns.model.s6.h(this.G, 4)) {
            com.tencent.mm.plugin.sns.model.r6 f17 = com.tencent.mm.plugin.sns.model.s6.f(this.G);
            if (f17 == null || !f17.f164647d) {
                this.f166904z1.setVisibility(8);
            } else {
                this.f166904z1.setVisibility(0);
                this.f166904z1.e(null, 1, f17.f164645b, f17.f164646c, false);
            }
        } else {
            this.f166904z1.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPostDescTranslateResultView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final boolean L7(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        r45.o3 remindInfoGroup;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAtInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (snsInfo == null || snsInfo.getAdSnsInfo() == null || (remindInfoGroup = snsInfo.getAdSnsInfo().getRemindInfoGroup()) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsCommentDetailUI", "isAtInfoValid called obj is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAtInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return false;
        }
        if (G7() == 2) {
            boolean O7 = O7(remindInfoGroup.f381862e);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAtInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return O7;
        }
        boolean z17 = O7(remindInfoGroup.f381861d) || O7(remindInfoGroup.f381862e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAtInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return z17;
    }

    public final boolean M7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isBizCardStyle", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        boolean z17 = false;
        com.tencent.mm.plugin.sns.storage.SnsInfo B7 = B7(false);
        if (pc4.d.f353410a.a() && this.f166896x0 == 1 && B7.getTimeLine().ContentObj.f369843n != null && B7.getTimeLine().ContentObj.f369843n.f376149d == 8 && B7.getTimeLine().ContentObj.f369843n.f376160r > 0 && B7.getTimeLine().ContentObj.f369840h.size() > 1) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBizCardStyle", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return z17;
    }

    public boolean N7(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDisplaySummary", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        boolean z17 = (com.tencent.mm.plugin.sns.model.d6.k() & 1) <= 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDisplaySummary", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return z17;
    }

    @Override // p94.m0
    public void O0(java.lang.String str, boolean z17, int i17, p94.d0 d0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final boolean O7(r45.mo5 mo5Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (mo5Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsCommentDetailUI", "isRemindInfoValid called with: remindInfo = [null]");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return false;
        }
        if (mo5Var.f380713d == 0 && mo5Var.f380718i == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsCommentDetailUI", "isRemindInfoValid called with: remindInfo.ADGroupId = [" + mo5Var.f380713d + "] remindInfo.ADGroupId64 = [" + mo5Var.f380718i + "]");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return false;
        }
        r45.cu5 cu5Var = mo5Var.f380716g;
        if (cu5Var == null || !cu5Var.f371842g) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsCommentDetailUI", "isRemindInfoValid called with: paidInfo is blank!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return false;
        }
        r45.cu5 cu5Var2 = mo5Var.f380717h;
        if (cu5Var2 != null && cu5Var2.f371842g) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.SnsCommentDetailUI", "isRemindInfoValid called with: extraInfo is blank!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return false;
    }

    public void P7(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshAdComplianceView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshAdComplianceView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        if (snsInfo.isAd() && ((i17 = this.f166896x0) == 2 || i17 == 3 || i17 == 4 || i17 == 5)) {
            if (this.F2 == null) {
                this.F2 = new a44.k(this.E2, this.f166889u);
            }
            int i18 = this.f166896x0;
            if (i18 == 3 || i18 == 4 || i18 == 5) {
                this.F2.h(getContext(), snsInfo, a44.k.e(this.f166896x0, this.D2), i65.a.b(getContext(), 1));
            } else if (i18 == 2) {
                this.F2.g(getContext(), snsInfo, a44.k.e(this.f166896x0, this.D2));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshAdComplianceView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final void Q7(wa4.n nVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshCommentError", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.na6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "refreshCommentError", "(Lcom/tencent/mm/plugin/sns/snstimeline/SnsFailComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "refreshCommentError", "(Lcom/tencent/mm/plugin/sns/snstimeline/SnsFailComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.na7);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "refreshCommentError", "(Lcom/tencent/mm/plugin/sns/snstimeline/SnsFailComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "refreshCommentError", "(Lcom/tencent/mm/plugin/sns/snstimeline/SnsFailComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.l0_);
        int i17 = nVar.f444267f;
        if (i17 == 2) {
            textView.setText(com.tencent.mm.R.string.je9);
        } else if (i17 == 1 || i17 == 5) {
            textView.setText(com.tencent.mm.R.string.je_);
        } else if (i17 == 20 || i17 == 21) {
            textView.setText(com.tencent.mm.R.string.f493202md0);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(nVar.f444268g) && !com.tencent.mm.sdk.platformtools.t8.K0(nVar.f444269h)) {
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.n87);
            textView2.setVisibility(0);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(nVar.f444269h);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(nVar.f444268g);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).sj(this, arrayList3, nVar.f444268g, arrayList4, textView2);
        } else if (com.tencent.mm.sdk.platformtools.t8.J0(textView.getText())) {
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.na6);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "refreshCommentError", "(Lcom/tencent/mm/plugin/sns/snstimeline/SnsFailComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "refreshCommentError", "(Lcom/tencent/mm/plugin/sns/snstimeline/SnsFailComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateUnreadErrorNotify", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass70(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateUnreadErrorNotify", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshCommentError", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final void R7(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshCommonShakeView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        try {
            if (this.N2 && com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic.d(snsInfo) && i18 == 2) {
                if (this.M2 == null) {
                    J7();
                }
                com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic = this.M2;
                if (commonShakeLogic != null) {
                    commonShakeLogic.j(snsInfo, snsInfo.getAdInfo().commonShakeInfo, 0, i17);
                }
            } else {
                com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic2 = this.M2;
                if (commonShakeLogic2 != null) {
                    commonShakeLogic2.j(snsInfo, null, 0, i17);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "refreshCommonShakeView, exp=" + e17);
            ca4.q.c("refreshCommonShakeView, photoAdItem", e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshCommonShakeView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    @Override // p94.m0
    public void S0(java.lang.String str, boolean z17, int i17, p94.d0 d0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final void S7(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removePageHeaderView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        this.f166885s.removeHeaderView(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removePageHeaderView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public void T7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSnsFeedDetailPageBlankState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_name", "SnsFeedDetailPageBlankState");
        hashMap.put("sns_feed_id", this.G);
        hashMap.put("blank_rsn", java.lang.Integer.valueOf(i17));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Gj(50302, "page_in", hashMap, 36244);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSnsFeedDetailPageBlankState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final void U7(java.lang.String str, r45.ed4 ed4Var, java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("savePhotoPostInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (pc4.d.f353410a.C()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new wa4.c0((java.lang.String) it.next(), null, false));
            }
            wa4.b0.f444203a.a(str, new wa4.f0(wa4.d0.f444215d, arrayList2, null, ed4Var, true));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("savePhotoPostInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final void V7(boolean z17) {
        mb4.r rVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        this.D = false;
        if (this.B.z()) {
            this.B.H(0);
            this.B.s();
            com.tencent.mm.plugin.sns.storage.SnsInfo B7 = B7(false);
            java.lang.String D7 = D7(B7);
            if (B7 != null && B7.isFireworkCheerAd()) {
                mb4.c cVar = B7.getAdXml().adSocialInfo;
                if (cVar != null && (rVar = cVar.f325388m) != null && !com.tencent.mm.sdk.platformtools.t8.K0(rVar.b())) {
                    D7 = cVar.f325388m.b();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "firework ad scrollDown: reset comment " + D7);
            }
            this.B.setCommentHint(D7);
        }
        this.B.R(false);
        if (z17) {
            android.widget.ListView listView = this.f166885s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(listView);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "scrollDown", "(Z)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            com.tencent.mm.sdk.platformtools.m.a((android.widget.ListView) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "scrollDown", "(Z)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final void W7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToKeyBoard", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (keyboardState() == 1 || this.B.y()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "scrollToKeyBoard: run");
            this.f166876o2.run();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "scrollToKeyBoard: waitForKeyBoardUp");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToKeyBoard", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final void X7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentContainerGone", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        android.view.View view = this.f166887t;
        if (view == null || view.getVisibility() == 8) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentContainerGone", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        this.f166887t.startAnimation(this.f166895x);
        this.f166895x.setAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.65
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation animation) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$65");
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                if (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.c7(snsCommentDetailUI) != null) {
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.c7(snsCommentDetailUI).clearAnimation();
                    android.view.View c76 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.c7(snsCommentDetailUI);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(c76, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$65", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(c76, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$65", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$65");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation animation) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$65");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$65");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation animation) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$65");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$65");
            }
        });
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentContainerGone", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0125, code lost:
    
        if (r4 != 54) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y7(com.tencent.mm.plugin.sns.storage.SnsInfo r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.Y7(com.tencent.mm.plugin.sns.storage.SnsInfo, boolean):void");
    }

    public final void Z7(com.tencent.mm.protocal.protobuf.SnsObject snsObject, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGroupIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        android.view.View findViewById = this.f166859f.findViewById(com.tencent.mm.R.id.f482852pt);
        if (findViewById == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "[setGroupIcon] failed, view not found");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGroupIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        if (snsObject != null && (str = this.L) != null && str.equals(snsObject.Username)) {
            ca4.e1 e1Var = ca4.f1.f39897a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkEnableShowGroupIconBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            boolean z17 = e1Var.e(snsObject) || e1Var.c(snsObject) || e1Var.g(snsObject);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkEnableShowGroupIconBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "setGroupIcon", "(Lcom/tencent/mm/protocal/protobuf/SnsObject;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "setGroupIcon", "(Lcom/tencent/mm/protocal/protobuf/SnsObject;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setTag(java.lang.Integer.valueOf(snsInfo.localid));
                findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        int i17 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                        snsCommentDetailUI.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$setGroupIcon$9", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(view);
                        java.lang.Object[] array = arrayList2.toArray();
                        arrayList2.clear();
                        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", snsCommentDetailUI, array);
                        gc4.k.f270459a.b(snsCommentDetailUI.getContext(), ((java.lang.Integer) view.getTag()).intValue(), 2, 3);
                        yj0.a.h(snsCommentDetailUI, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$setGroupIcon$9", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    }
                });
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGroupIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "setGroupIcon", "(Lcom/tencent/mm/protocal/protobuf/SnsObject;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "setGroupIcon", "(Lcom/tencent/mm/protocal/protobuf/SnsObject;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGroupIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0d8e, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x31d9, code lost:
    
        if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).wi(r3.AppInfo.f390846d) == false) goto L1172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x3108, code lost:
    
        if (((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).Bi(r3.AppInfo.f390846d) != false) goto L1148;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1255:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:1266:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:1267:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:1268:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:1276:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x2b63  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x2cd8  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x2e9a  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x2efe  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x318e  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x336d  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x33da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x33f8  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x3434  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x3485  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x34ca  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x3619  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x36b9  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x36c5  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x36de  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x3738  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x3784  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x37da  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x37ef  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x3804  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x384c  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x34cf  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x34b2  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x339b  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x33b9  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x31f7  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x3277  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x2f06  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0377 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x2bfa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x123f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x136b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x1737  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:821:0x196f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x090d  */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v372 */
    /* JADX WARN: Type inference failed for: r1v71, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a8() {
        /*
            Method dump skipped, instructions count: 14580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.a8():boolean");
    }

    public final boolean b8(java.util.List list, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Boolean bool;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLikedHeader", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.sdk.platformtools.j.d(this, 32.0f);
        com.tencent.mm.sdk.platformtools.j.d(this, 6.0f);
        com.tencent.mm.sdk.platformtools.j.d(this, 10.0f);
        com.tencent.mm.sdk.platformtools.j.d(this, 17.0f);
        int f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.aq9);
        int f18 = i65.a.f(getContext(), com.tencent.mm.R.dimen.aq8);
        int f19 = i65.a.f(getContext(), com.tencent.mm.R.dimen.aq7);
        int f27 = i65.a.f(getContext(), com.tencent.mm.R.dimen.aq6);
        int f28 = i65.a.f(getContext(), com.tencent.mm.R.dimen.aq_);
        int f29 = i65.a.f(getContext(), com.tencent.mm.R.dimen.aqa);
        if (this.f166875o == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLikedHeader", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("guessWidth", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        android.view.Display defaultDisplay = ((android.view.WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        defaultDisplay.getRealMetrics(new android.util.DisplayMetrics());
        int rotation = defaultDisplay.getRotation();
        float min = ((rotation == 0 || rotation == 2) ? java.lang.Math.min(r12.widthPixels, r12.heightPixels) : java.lang.Math.max(r12.widthPixels, r12.heightPixels)) - (getResources().getDimension(com.tencent.mm.R.dimen.i_) * 2.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("guessWidth", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (list.size() <= 0) {
            if (this.f166875o.getParent() != null) {
                this.f166875o.setVisibility(8);
            }
            this.f166875o.removeAllViews();
            this.f166875o.setVisibility(8);
            this.f166883r.setVisibility(8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLikedHeader", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return false;
        }
        this.f166875o.removeAllViews();
        this.f166875o.setVisibility(0);
        if (this.f166896x0 == 10) {
            if (this.A1) {
                com.tencent.mm.plugin.sns.storage.SnsInfo B7 = B7(false);
                if (B7 == null) {
                    this.f166875o.setBackgroundResource(com.tencent.mm.R.drawable.f481840c63);
                } else if (this.L.equals(B7.getUserName())) {
                    this.f166875o.setBackgroundResource(com.tencent.mm.R.drawable.f481841c64);
                } else {
                    this.f166875o.setBackgroundResource(com.tencent.mm.R.drawable.f481840c63);
                }
            } else {
                this.f166875o.setBackgroundResource(com.tencent.mm.R.drawable.f481840c63);
            }
        } else if (this.f166852a2) {
            this.f166875o.setBackgroundResource(com.tencent.mm.R.drawable.a5c);
        } else if (!pc4.d.f353410a.x()) {
            this.f166875o.setBackgroundResource(com.tencent.mm.R.drawable.adw);
        } else if (z17) {
            this.f166875o.setBackgroundResource(com.tencent.mm.R.drawable.d4x);
        } else {
            this.f166875o.setBackgroundResource(com.tencent.mm.R.drawable.d4y);
        }
        this.f166875o.setPadding(0, f17, 0, f18 - f28);
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        com.tencent.mm.plugin.sns.storage.SnsInfo B72 = B7(true);
        if (B72 != null && B72.isFireworkCheerAd()) {
            this.f166875o.setBackground(null);
        }
        if (this.f166896x0 == 10) {
            imageView.setImageResource(com.tencent.mm.R.raw.friendactivity_likeicon_golden);
            str = "setLikedHeader";
        } else if (B72 == null || !B72.isSocialAttitudeAd()) {
            str = "setLikedHeader";
            androidx.appcompat.app.AppCompatActivity context = getContext();
            boolean z18 = this.f166852a2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
            android.graphics.drawable.Drawable q17 = ca4.f1.f39897a.q(context, z18, f19, f19);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
            imageView.setImageDrawable(q17);
        } else {
            java.lang.String str3 = B72.getAdXml().adSocialInfo.cheerIcon;
            if (com.tencent.mm.ui.bk.C() && !com.tencent.mm.sdk.platformtools.t8.K0(B72.getAdXml().adSocialInfo.cheerIconDark)) {
                str3 = B72.getAdXml().adSocialInfo.cheerIconDark;
            }
            if (B72.isFireworkCheerAd()) {
                java.lang.Boolean bool2 = (java.lang.Boolean) k84.e4.f305021d.b(a84.d0.c(B72));
                if (bool2 == null || !bool2.booleanValue()) {
                    str = "setLikedHeader";
                    str3 = B72.getAdXml().adSocialInfo.f325388m.e();
                    if (com.tencent.mm.ui.bk.C() && !com.tencent.mm.sdk.platformtools.t8.K0(B72.getAdXml().adSocialInfo.f325388m.f())) {
                        str3 = B72.getAdXml().adSocialInfo.f325388m.f();
                    }
                } else {
                    mb4.r rVar = B72.getAdXml().adSocialInfo.f325388m;
                    rVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFireworkLikedIcon", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                    str = "setLikedHeader";
                    str3 = (java.lang.String) ((com.tencent.mm.plugin.sns.storage.r0) rVar.f325458e).a(rVar, mb4.r.f325453u[2]);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFireworkLikedIcon", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                    if (com.tencent.mm.ui.bk.C() && !com.tencent.mm.sdk.platformtools.t8.K0(B72.getAdXml().adSocialInfo.f325388m.d())) {
                        str3 = B72.getAdXml().adSocialInfo.f325388m.d();
                    }
                }
            } else {
                str = "setLikedHeader";
            }
            imageView.setTag(com.tencent.mm.R.id.n5q, str3);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "attitudeAd like icon url = " + str3);
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.DownloadCallback downloadCallback = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.DownloadCallback(imageView, str3);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(f19, f19);
            layoutParams.topMargin = (f29 - f19) / 2;
            layoutParams.leftMargin = f27;
            layoutParams.rightMargin = f27;
            layoutParams.gravity = 48;
            imageView.setLayoutParams(layoutParams);
            a84.m.g(str3, downloadCallback);
        }
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(f19, f19);
        layoutParams2.leftMargin = f27;
        layoutParams2.rightMargin = f27;
        layoutParams2.topMargin = (f29 - f19) / 2;
        layoutParams2.gravity = 48;
        if (B72 == null || !B72.isSocialAttitudeAd()) {
            imageView.setLayoutParams(layoutParams2);
        }
        imageView.setClickable(false);
        imageView.setFocusable(false);
        this.f166875o.addView(imageView);
        float f37 = min - (f19 + (f27 * 2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateLikeIconRightMargin", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        int a17 = i65.a.a(getContext(), 4.0f);
        int i17 = f29 * 2;
        int a18 = i65.a.a(getContext(), 4.0f);
        for (float f38 = 4.0f; f38 <= 8.0f; f38 += 0.25f) {
            int a19 = i65.a.a(getContext(), f38);
            int i18 = ((int) (f37 - a18)) % (f29 + a19);
            int i19 = i18 >= f29 ? i18 - f29 : i18 + a19;
            if (i19 < i17) {
                a17 = a19;
                i17 = i19;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateLikeIconRightMargin", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        float f39 = f29 + a17;
        int i27 = (int) (f37 / f39);
        if (((int) (f37 % f39)) > f29) {
            i27++;
        }
        com.tencent.mm.plugin.sns.ui.x0 x0Var = new com.tencent.mm.plugin.sns.ui.x0(getContext());
        x0Var.setClipChildren(false);
        x0Var.setClipToPadding(false);
        x0Var.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        x0Var.setLineMaxCounte(i27);
        for (int i28 = 0; i28 < list.size(); i28++) {
            r45.e86 e86Var = (r45.e86) list.get(i28);
            java.lang.String r17 = c01.z1.r();
            if (i28 <= 0 || B72 == null || !B72.isFireworkCheerAd() || (str2 = e86Var.f373126d) == null || !str2.equals(r17) || ((bool = (java.lang.Boolean) k84.e4.f305021d.b(a84.d0.c(B72))) != null && bool.booleanValue())) {
                android.widget.ImageView storyTouchImageView = new com.tencent.mm.plugin.sns.ui.StoryTouchImageView(getContext(), null);
                storyTouchImageView.setContentDescription(java.lang.String.format(getString(com.tencent.mm.R.string.j1u), e86Var.f373127e));
                storyTouchImageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                storyTouchImageView.setImageResource(com.tencent.mm.R.drawable.ady);
                android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(f29, f29);
                layoutParams3.setMargins(0, 0, a17, f28);
                storyTouchImageView.setLayoutParams(layoutParams3);
                storyTouchImageView.setTag(e86Var.f373126d);
                storyTouchImageView.setTag(com.tencent.mm.R.id.n3k, java.lang.Boolean.FALSE);
                boolean l17 = pc4.d.f353410a.l();
                if (i28 == 0 && ca4.m0.T(B72, e86Var)) {
                    storyTouchImageView.setTag(com.tencent.mm.R.id.n3k, java.lang.Boolean.TRUE);
                    if (!com.tencent.mm.plugin.sns.ui.widget.t2.o(storyTouchImageView, B72, e86Var.f373126d)) {
                        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Bi(storyTouchImageView, e86Var.f373126d, l17);
                    }
                } else {
                    ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Bi(storyTouchImageView, e86Var.f373126d, l17);
                }
                storyTouchImageView.setTag(com.tencent.mm.R.id.v8i, java.lang.Boolean.TRUE);
                storyTouchImageView.setOnClickListener(this.f166882q2);
                x0Var.addView(storyTouchImageView);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "isFireworkCheerAd likeList skip " + i28 + " !");
            }
        }
        this.f166875o.addView(x0Var);
        this.f166883r.setVisibility(z17 ? 8 : 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return true;
    }

    public final android.view.View c8(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSecurityPassTipsView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        android.view.View b17 = mc4.c.f325645a.b(getContext(), snsInfo.getLocalid(), null);
        v7(b17);
        u7(8);
        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$l snsCommentDetailUI$$l = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$l(this, b17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickCallback", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        mc4.c.f325647c = snsCommentDetailUI$$l;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickCallback", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSecurityPassTipsView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return b17;
    }

    public final boolean d8(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldHideCommentEntrance", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        boolean z17 = !ca4.f1.f39897a.k(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldHideCommentEntrance", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return z17;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchGlobalTouch", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        bd4.f2.F.a(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchGlobalTouch", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return dispatchTouchEvent;
    }

    @Override // p94.m0
    public void e6(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final void e8() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateMusicPlaystate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        android.widget.ImageView imageView = this.P;
        if (imageView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMusicPlaystate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        imageView.setPressed(false);
        if (com.tencent.mm.plugin.sns.ui.wm.c(this.T, null)) {
            this.P.setImageResource(com.tencent.mm.R.drawable.as6);
        } else {
            this.P.setImageResource(com.tencent.mm.R.drawable.as8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMusicPlaystate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final void f8(boolean z17, com.tencent.mm.plugin.sns.ui.PhotosContent photosContent, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSnsImageTag", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (photosContent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "updateSnsImageTag, photosContent is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSnsImageTag", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        int i18 = com.tencent.mm.plugin.sns.ui.tm.f170529d[i17];
        for (int i19 = 0; i19 < i18; i19++) {
            com.tencent.mm.plugin.sns.ui.TagImageView g17 = photosContent.g(i19);
            if (g17 != null) {
                java.lang.Object tag = g17.getTag();
                if (tag instanceof com.tencent.mm.plugin.sns.ui.oj) {
                    com.tencent.mm.plugin.sns.ui.oj ojVar = (com.tencent.mm.plugin.sns.ui.oj) tag;
                    if (z17) {
                        ojVar.f170109h = this.K2;
                    } else {
                        ojVar.f170109h = null;
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSnsImageTag", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "finish: ");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.G)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("result_forbid_access", this.O1);
            intent.putExtra("result_access_sns_id", com.tencent.mm.plugin.sns.storage.w2.n(this.G));
            setResult(-1, intent);
        }
        super.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return com.tencent.mm.R.layout.f489496cr0;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0bc5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0bee  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0c3a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0c6f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0ca7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0d53  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0bc7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x09fe  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0afd  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0b1a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0b45  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 3435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.initView():void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int keyboardState() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("keyboardState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        gc4.b bVar = this.Q1;
        if (bVar == null || !bVar.b()) {
            int keyboardState = super.keyboardState();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("keyboardState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return keyboardState;
        }
        gc4.b bVar2 = this.Q1;
        bVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDelegateKeyBoardState", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        int i17 = bVar2.f270443g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDelegateKeyBoardState", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("keyboardState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return i17;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.listener.c cVar;
        java.lang.String str2;
        int i19;
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo;
        java.lang.String str3 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "onAcvityResult requestCode:" + i17);
        if (i17 != 15) {
            if (i17 == 16) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "REQUEST_CODE_FOR_FULLSCREEN");
                com.tencent.mm.autogen.events.FullScreenHelperEvent fullScreenHelperEvent = new com.tencent.mm.autogen.events.FullScreenHelperEvent();
                fullScreenHelperEvent.f54354g.getClass();
                fullScreenHelperEvent.e();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                return;
            }
            if (i17 != 2333) {
                if (i17 == 26) {
                    this.B.K(i18, intent);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    return;
                }
                if (i18 != -1) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    return;
                }
                if (i17 == 1 && i18 == -1) {
                    android.database.Cursor managedQuery = managedQuery(intent.getData(), null, null, null, null);
                    if (managedQuery.moveToFirst()) {
                        android.content.Intent intent2 = new android.content.Intent("android.intent.action.EDIT", android.net.Uri.parse("content://com.android.contacts/contacts/" + managedQuery.getString(managedQuery.getColumnIndexOrThrow("_id"))));
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent2);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                return;
            }
            if (intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    java.lang.String[] split = stringExtra.split(",");
                    if (split.length > 0) {
                        this.B.P();
                        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                        java.lang.String str4 = split[0];
                        ((sg3.a) v0Var).getClass();
                        java.lang.String e17 = c01.a2.e(str4);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                            this.B.s();
                            this.B.setText("@" + e17 + " ");
                            this.B.setCommentAtPrefix("@" + e17 + " ");
                            this.B.setCommentInfo(new r45.e86());
                            this.B.getCommentInfo().f373126d = split[0];
                            this.B.setCommentFlag(8);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        return;
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f166879p1;
        if (iVar == null || (cVar = iVar.f169809l) == null) {
            str = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI";
        } else {
            cVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            java.lang.String str5 = cVar.f169753d;
            if (i18 == -1) {
                if (i17 == 15) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(cVar.f169755f);
                    r45.jj4 jj4Var = (r45.jj4) cVar.f169756g.ContentObj.f369840h.get(0);
                    java.lang.String stringExtra2 = intent.getStringExtra("Select_Conv_User");
                    java.lang.String stringExtra3 = intent.getStringExtra("custom_send_text");
                    java.lang.String str6 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.U(jj4Var);
                    java.util.Iterator it = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(",")).iterator();
                    while (it.hasNext()) {
                        java.lang.String str7 = (java.lang.String) it.next();
                        if (k17.isAd()) {
                            java.lang.String str8 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.R(jj4Var);
                            com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = k17.getTimeLine();
                            com.tencent.mm.plugin.sns.storage.ADXml adXml = k17.getAdXml();
                            r45.uf6 uf6Var = new r45.uf6();
                            uf6Var.f387334e = jj4Var.A;
                            uf6Var.f387333d = jj4Var.f377875x;
                            if (timeLine.ContentObj.f369837e == 15) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                                str2 = str3;
                                i19 = 2;
                                if (cVar.f169758i == 2) {
                                    adInfo = k17.getAtAdInfo();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                                } else {
                                    adInfo = k17.getAdInfo();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                                }
                                uf6Var.f387339m = adInfo.uxInfo;
                                uf6Var.f387340n = timeLine.Id;
                            } else {
                                str2 = str3;
                                i19 = 2;
                                r45.tf6 tf6Var = timeLine.streamvideo;
                                uf6Var.f387339m = tf6Var.f386385m;
                                uf6Var.f387340n = tf6Var.f386386n;
                            }
                            uf6Var.f387337h = timeLine.ContentDesc;
                            uf6Var.f387338i = com.tencent.mm.sdk.platformtools.t8.K0(jj4Var.B) ? jj4Var.f377860i : jj4Var.B;
                            if (adXml != null && adXml.attachShareLinkIsHidden == 0) {
                                uf6Var.f387336g = adXml.attachShareLinkUrl;
                                uf6Var.f387335f = adXml.attachShareLinkWording;
                            }
                            int S = ca4.z0.S(str8);
                            com.tencent.mars.xlog.Log.i(str5, "send adsight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", str7, str8, str6, jj4Var.f377875x, java.lang.Integer.valueOf(jj4Var.A), java.lang.Integer.valueOf(S));
                            ((dk5.s5) tg3.t1.a()).ij(cVar.f169757h, str7, str8, str6, 43, S, uf6Var, false, false, timeLine.statExtStr, null, null);
                            ((dk5.s5) tg3.t1.a()).Ui(stringExtra3, str7);
                            int i27 = cVar.f169758i;
                            ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(i27, i27 == 0 ? 1 : i19, k17.field_snsId, 12, 0));
                            boolean R4 = com.tencent.mm.storage.z3.R4(str7);
                            i64.s1.d(i64.q1.Sight, R4 ? i64.p1.Chatroom : i64.p1.Chat, i64.r1.Samll, R4 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str7) : 0, k17, cVar.f169758i);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                            str = str2;
                        } else {
                            java.lang.String str9 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.R(jj4Var);
                            int S2 = ca4.z0.S(str9);
                            com.tencent.mars.xlog.Log.i(str5, "send sight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", str7, str9, str6, jj4Var.f377875x, java.lang.Integer.valueOf(jj4Var.A), java.lang.Integer.valueOf(S2));
                            ((dk5.s5) tg3.t1.a()).nj(cVar.f169757h, str7, str9, str6, 43, S2, false, false, cVar.f169756g.statExtStr, null);
                            ((dk5.s5) tg3.t1.a()).Ui(stringExtra3, str7);
                            str3 = str3;
                        }
                    }
                    str2 = str3;
                    android.app.Activity activity = cVar.f169757h;
                    com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.fw6), null, activity, null, null);
                } else {
                    str2 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                str = str2;
            } else {
                str2 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI";
                if (i17 == 15) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo k18 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(cVar.f169755f);
                    if (k18 == null) {
                        com.tencent.mars.xlog.Log.w(str5, "menuitemselected and snsinfo is null %s", cVar.f169755f);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                        str = str2;
                    } else {
                        int i28 = cVar.f169758i;
                        ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(i28, i28 == 0 ? 1 : 2, k18.field_snsId, 13, 0));
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                str = str2;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", str);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.jw jwVar;
        android.view.View view;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        super.onConfigurationChanged(configuration);
        com.tencent.mm.plugin.sns.storage.SnsInfo a17 = com.tencent.mm.plugin.sns.storage.l1.a(this.G);
        com.tencent.mm.protocal.protobuf.SnsObject f17 = com.tencent.mm.plugin.sns.model.s5.f(a17);
        b8(f17.LikeUserList, f17.CommentUserList.isEmpty());
        com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader snsDetailLuckyHeader = this.f166881q;
        if (snsDetailLuckyHeader != null) {
            snsDetailLuckyHeader.b(a17, this.f166879p1);
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        android.graphics.Point point = new android.graphics.Point();
        point.x = displayMetrics.widthPixels;
        point.y = displayMetrics.heightPixels;
        com.tencent.mm.plugin.sns.model.l4.bk(point);
        if (this.D2 != null) {
            int nj6 = com.tencent.mm.plugin.sns.model.l4.nj();
            this.Z = nj6;
            this.D2.setParentImageViewWidth(nj6);
        }
        dc4.v vVar = this.f166900y0;
        if (vVar != null) {
            vVar.e(configuration);
        }
        if (a17 != null && a17.isAd() && (jwVar = this.K2) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
            if (jwVar.A == null || (view = jwVar.f169577l) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineAdView", "onConfigurationChanged, snsInfo or view is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
            } else if (view.getContext() == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineAdView", "onConfigurationChanged, context is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
            } else if (jwVar.f169589x == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineAdView", "onConfigurationChanged, snsId is " + ca4.z0.y0(jwVar.A));
                com.tencent.mm.plugin.sns.ad.widget.adpag.c cVar = jwVar.N;
                if (cVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdGeneralPAGLogic");
                    com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar = cVar.f163331b;
                    if (yVar != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                        yVar.c(new com.tencent.mm.plugin.sns.ad.widget.adpag.i(yVar, view));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdGeneralPAGLogic");
                }
                e84.v vVar2 = jwVar.O;
                if (vVar2 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductLogic");
                    e84.t tVar = vVar2.f250295b;
                    if (tVar != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
                        tVar.c(new e84.a(tVar, view));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductLogic");
                }
                y84.j3 j3Var = jwVar.S;
                if (j3Var != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardLogic");
                    y84.h3 h3Var = j3Var.f460120a;
                    if (h3Var != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        java.lang.String j17 = h3Var.j();
                        try {
                            snsInfo = h3Var.f460109z;
                        } catch (java.lang.Throwable th6) {
                            ca4.q.c(j17, th6);
                        }
                        if (snsInfo == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        } else {
                            h3Var.U(snsInfo, true, h3Var.A0(), h3Var.z0(), 2);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardLogic");
                }
                m84.y yVar2 = jwVar.R;
                if (yVar2 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarLogic");
                    com.tencent.mars.xlog.Log.i("MicroMsg.AdWorldCupAvatarLogic", "adjustContentContainerLayout");
                    m84.u uVar = yVar2.f324820b;
                    if (uVar != null) {
                        uVar.C();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarLogic");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        int intExtra;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.ui.bk.u0(this);
        o25.n1.f(this);
        super.onCreate(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkUseNew", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_USE_NEW_GALLERY_FOOTER_INT_SYNC, 0);
        if (r17 == 0) {
            r17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_enhance_like_gallery, 2);
        }
        if (r17 == 1) {
            this.f166855d = false;
        } else {
            this.f166855d = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUseNew", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        ((ze4.f) i95.n0.c(ze4.f.class)).getClass();
        bf4.b bVar = bf4.b.f19696b;
        this.I1 = bVar.f(ze4.g.TimeLine_Comment);
        ((ze4.f) i95.n0.c(ze4.f.class)).getClass();
        this.J1 = bVar.f(ze4.g.TimeLine_Like);
        com.tencent.mm.ui.r0.a(this, true);
        setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_97));
        com.tencent.mm.plugin.sns.model.d6 Kj = com.tencent.mm.plugin.sns.model.l4.Kj();
        Kj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        Kj.w(5, "@__weixintimtline", this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateAbTestCfg", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        try {
            com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "updateFullCardExptCfg, expt=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_timeline_full_card_item_new, 0) + ", snene=2");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FullCardAdWrapper", "updateAbTestCfg, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAbTestCfg", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        this.H1 = com.tencent.mm.ui.zk.a(this, 14);
        this.Y = com.tencent.mm.ui.bk.h(this).y;
        this.f166857e = java.lang.System.currentTimeMillis();
        this.W = new rl5.r(this);
        this.O1 = getIntent().getBooleanExtra("INTENT_COMMENT_forbid_access", false);
        this.M1 = getIntent().getBooleanExtra("intent_content_enable_show_access_view", false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isMustShowInvisibleLayoutIfForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_must_show_invisible_layout_if_forbid_access, false));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMustShowInvisibleLayoutIfForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        this.N1 = valueOf.booleanValue();
        this.X1 = getIntent().getBooleanExtra("INTENT_STAR_LIST", false);
        java.lang.String stringExtra = getIntent().getStringExtra("INTENT_ALBUM_COMMENT_SESSION_ID");
        this.Y1 = stringExtra;
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            this.Y1 = com.tencent.mm.storage.t3.b(getIntent().getStringExtra("INTENT_SNS_PAGE_SCENE")) + "_" + com.tencent.mm.storage.t3.b("detail") + "_" + java.lang.System.currentTimeMillis();
        }
        this.Z1 = java.lang.System.currentTimeMillis();
        this.F1 = getIntent().getIntExtra("INTENT_COMMENT_TYPE", 0);
        boolean booleanExtra = getIntent().getBooleanExtra("INTENT_NEED_RPT_FEED", false);
        this.G1 = booleanExtra;
        if (booleanExtra) {
            if (this.Y1 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SnsCommentDetailUI", "albumSessionId is null");
                this.Y1 = "";
            }
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.F(this.X1 ? 2 : 1, this.Y1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerReporterData", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        o04.g gVar = new o04.g(1);
        ((md0.e) eVar).getClass();
        t04.a aVar = (t04.a) pf5.z.f353948a.a(this).a(t04.a.class);
        if (aVar != null) {
            aVar.S6(gVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerReporterData", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        java.lang.String stringExtra2 = getIntent().getStringExtra("INTENT_SNSID");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.G = stringExtra2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            this.G = com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", getIntent().getLongExtra("INTENT_SNSID", 0L));
        }
        java.lang.String stringExtra3 = getIntent().getStringExtra("INTENT_SNS_LOCAL_ID");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.H = stringExtra3;
        this.I = getIntent().getByteArrayExtra("INTENT_SNS_OBJ");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.H) && (intExtra = getIntent().getIntExtra("INTENT_SNS_LOCAL_ID", -1)) != -1) {
            this.H = com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", intExtra);
        }
        B7(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "onCreate: from intent, snsId=%s, localSnsId=%s", this.G, this.H);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEntranceType", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarActionReporter", "setEntranceType >> 1");
        ta4.g1.f416748b = 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEntranceType", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
        this.f166851J = getIntent().getIntExtra("INTENT_ERROR_OPTIME", -1);
        int b17 = com.tencent.mm.storage.t3.b(getIntent().getStringExtra("INTENT_SNS_PAGE_SCENE"));
        cy1.a aVar2 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.SnsCommentDetailUI);
        aVar2.dk(this, getClass().getSimpleName());
        aVar2.Rj(this, iy1.a.Moments);
        aVar2.Sj(this, "ref_sns_page_scene", java.lang.Integer.valueOf(b17));
        aVar2.Sj(this, "sns_session_id", this.Y1);
        dx1.f fVar = dx1.g.f244489a;
        dx1.b[] bVarArr = dx1.b.f244476d;
        fVar.o("MomentsTogetherTailActionFeed", this.G, "Scene", cm.d.feed);
        java.lang.String str = this.G;
        fVar.o("MomentsTogetherTailActionFeed", str, "PublishId", java.lang.Long.valueOf(com.tencent.mm.plugin.sns.storage.w2.n(str)));
        int G7 = G7();
        com.tencent.mm.plugin.sns.model.k5 k5Var = this.V1;
        this.f166879p1 = new com.tencent.mm.plugin.sns.ui.listener.i(G7, this, k5Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.18
            @Override // com.tencent.mm.plugin.sns.ui.listener.i
            public void A(android.view.View view) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLikeClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                com.tencent.mm.plugin.sns.storage.SnsInfo B7 = snsCommentDetailUI.B7(true);
                if (B7 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "In SnsCommentDetailUI, do onLikeClick but snsInfo is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLikeClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
                    return;
                }
                try {
                    if (this.f169805h != null && B7.getLikeFlag() == 0) {
                        this.f169805h.c(B7.field_snsId);
                    }
                    if (view instanceof android.widget.LinearLayout) {
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.a7(snsCommentDetailUI, (android.widget.LinearLayout) view);
                    }
                    if (k84.f4.e()) {
                        ca4.m0.v0();
                    }
                    com.tencent.mm.plugin.sns.statistics.s0.f164937k0.Q().f60459s = 3L;
                    if (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.b7(snsCommentDetailUI) != null && B7.isSocialAttitudeAd()) {
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.b7(snsCommentDetailUI).j();
                    }
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "In SnsCommentDetailUI, do onLikeClick and exp is " + th7.toString());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLikeClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
            }

            @Override // com.tencent.mm.plugin.sns.ui.listener.i
            public void B() {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNotifyData", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyData", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
            }

            @Override // com.tencent.mm.plugin.sns.ui.listener.i
            public void C(android.view.View view) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOpenIMTagClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.e7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this).f();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOpenIMTagClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
            }

            @Override // com.tencent.mm.plugin.sns.ui.listener.i
            public void D(android.view.View view) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOpenIMUnlikeClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
                int i17 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                com.tencent.mm.plugin.sns.ui.m7 m7Var = snsCommentDetailUI.f166901y1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                m7Var.c();
                snsCommentDetailUI.finish();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOpenIMUnlikeClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
            }

            @Override // com.tencent.mm.plugin.sns.ui.listener.i
            public void E(java.lang.Object obj) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
                int i17 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                snsCommentDetailUI.X7();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                com.tencent.mm.plugin.sns.ui.kj kjVar = snsCommentDetailUI.E;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                android.view.View view = (android.view.View) obj;
                kjVar.d(view, 2, snsCommentDetailUI.G7());
                if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.oj) {
                    com.tencent.mm.plugin.sns.ui.oj ojVar = (com.tencent.mm.plugin.sns.ui.oj) view.getTag();
                    java.lang.String str2 = ojVar.f170102a;
                    int i18 = ojVar.f170103b;
                    com.tencent.mm.plugin.sns.storage.SnsInfo b18 = com.tencent.mm.plugin.sns.storage.l1.b(str2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    boolean z18 = snsCommentDetailUI.X1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    if (z18) {
                        java.util.ArrayList arrayList = ta4.h1.f416750a;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("browseDetailMedia", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
                        if (b18 != null) {
                            java.lang.String str3 = ca4.z0.s0(b18.field_snsId) + '_' + i18;
                            java.util.ArrayList arrayList2 = ta4.h1.f416756g;
                            if (!arrayList2.contains(str3)) {
                                arrayList2.add(str3);
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("browseDetailMedia", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
                    } else {
                        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.a(b18, i18);
                    }
                    com.tencent.mm.plugin.sns.statistics.s0.f164937k0.q(b18, i18);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
            }

            @Override // com.tencent.mm.plugin.sns.ui.listener.i
            public void F(android.view.View view) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUnLickClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.e7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this).g();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUnLickClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
            }

            @Override // com.tencent.mm.plugin.sns.ui.listener.i
            public void G(android.view.View view) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUnLikeFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("result_finish", true);
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                snsCommentDetailUI.setResult(-1, intent);
                try {
                    if (view.getTag() != null) {
                        ca4.j jVar = (ca4.j) view.getTag();
                        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(jVar.f39954c);
                        if (k17 != null && k17.isAd()) {
                            int G72 = snsCommentDetailUI.G7();
                            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "source = " + G72);
                            ca4.c0.b(2, jVar.f39955d, k17.getAdInfo(G72), k17.getAdXml());
                        }
                        com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "reportAdFeedBackDel: info is null or not ad");
                    }
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "reportAdFeedBackDel: " + th7.toString());
                }
                if (view.getTag() != null && this.f169805h != null) {
                    ca4.j jVar2 = (ca4.j) view.getTag();
                    this.f169805h.o(jVar2.f39953b, jVar2.f39954c, jVar2.f39955d, 2);
                }
                snsCommentDetailUI.finish();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUnLikeFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
            }

            @Override // com.tencent.mm.plugin.sns.ui.listener.i
            public void H(android.view.View view) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUnLikeFinishError", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("result_finish", true);
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                snsCommentDetailUI.setResult(-1, intent);
                snsCommentDetailUI.finish();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUnLikeFinishError", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
            }

            @Override // com.tencent.mm.plugin.sns.ui.listener.i
            public void I(android.view.View view) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUnLikeHelperClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.e7(snsCommentDetailUI).b(view);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                com.tencent.mm.plugin.sns.ui.m7 m7Var = snsCommentDetailUI.f166901y1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                m7Var.c();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUnLikeHelperClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
            }

            @Override // com.tencent.mm.plugin.sns.ui.listener.i
            public void z(android.view.View view) {
                mb4.r rVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                com.tencent.mm.plugin.sns.storage.SnsInfo B7 = snsCommentDetailUI.B7(true);
                if (B7 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "In SnsCommentDetailUI, do onCommentClick but snsInfo is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
                    return;
                }
                if (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI) == null || com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.c7(snsCommentDetailUI) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "In SnsCommentDetailUI, do onCommentClick but commentFooter or commentContainer is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
                    return;
                }
                try {
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "In SnsCommentDetailUI, do onCommentClick and exp is " + th7.toString());
                }
                if (!ha4.k.c(B7.getLocalid())) {
                    ja4.d.a(snsCommentDetailUI.getContext(), snsCommentDetailUI.D2.g(0));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
                    return;
                }
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI).setCommentInfo(null);
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI).setCommentFlag(0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                java.lang.String D7 = snsCommentDetailUI.D7(B7);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                if (B7.isFireworkCheerAd()) {
                    mb4.c cVar = B7.getAdXml().adSocialInfo;
                    if (cVar != null && (rVar = cVar.f325388m) != null && !com.tencent.mm.sdk.platformtools.t8.K0(rVar.b())) {
                        D7 = cVar.f325388m.b();
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "firework ad comment click: reset comment " + D7);
                }
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI).setCommentHint(D7);
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI).setCommentInfo(new r45.e86());
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI).setToSendTextColor(true);
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI).R(true);
                if (!B7.isAd() || (B7.getTimeLine().ContentObj.f369841i & 8) == 0) {
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI).O(false);
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    boolean L7 = snsCommentDetailUI.L7(B7);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    if (L7) {
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI).O(true);
                    } else {
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI).O(false);
                    }
                }
                android.view.View c76 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.c7(snsCommentDetailUI);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c76, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$18", "onCommentClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(c76, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$18", "onCommentClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.d7(snsCommentDetailUI);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
            }
        };
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.o8a);
        this.f166897x1 = new com.tencent.mm.plugin.sns.ui.j(this, this.f166879p1, frameLayout, null, new ra4.b(this, this.f166879p1, frameLayout, null));
        this.f166901y1 = new com.tencent.mm.plugin.sns.ui.m7(this, this.f166879p1, frameLayout, (android.view.View) null);
        new com.tencent.mm.plugin.sns.ui.ay(this, this.f166879p1, frameLayout, null);
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f166879p1;
        iVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.f169809l.b();
        iVar.V.alive();
        iVar.W.alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        this.C1 = getIntent().getBooleanExtra("intent_show_collapse_info", false);
        this.D1 = getIntent().getStringExtra("intent_content_collapse_hint");
        this.X = new com.tencent.mm.plugin.sns.ui.kw(this, new com.tencent.mm.plugin.sns.ui.rx(this) { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.19
        }, G7(), k5Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFromSearch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("INTENT_SNS_TIMELINEOBJECT");
        if (byteArrayExtra == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFromSearch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        } else {
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = new com.tencent.mm.protocal.protobuf.TimeLineObject();
            try {
                timeLineObject.parseFrom(byteArrayExtra);
                if (com.tencent.mm.plugin.sns.model.l4.Fj().W0(new java.math.BigInteger(timeLineObject.Id).longValue()) == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "info is null, can insert to sns info");
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
                    snsInfo.field_snsId = new java.math.BigInteger(timeLineObject.Id).longValue();
                    try {
                        snsInfo.field_content = timeLineObject.toByteArray();
                    } catch (java.lang.Exception unused) {
                    }
                    snsInfo.field_createTime = timeLineObject.CreateTime;
                    snsInfo.field_userName = timeLineObject.UserName;
                    snsInfo.field_type = timeLineObject.ContentObj.f369837e;
                    snsInfo.setExtFlag();
                    com.tencent.mm.protocal.protobuf.SnsObject snsObject = new com.tencent.mm.protocal.protobuf.SnsObject();
                    snsObject.ObjectDesc = new r45.cu5();
                    try {
                        snsInfo.field_attrBuf = snsObject.toByteArray();
                    } catch (java.io.IOException unused2) {
                    }
                    com.tencent.mm.plugin.sns.model.l4.Fj().insert(snsInfo);
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SnsComment", "insert sns obj use time %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "info is not null, can not insert to sns info");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFromSearch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            } catch (java.io.IOException unused3) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFromSearch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            }
        }
        final com.tencent.mm.plugin.sns.storage.SnsInfo B7 = B7(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "onCreate()  snsId : " + this.G + " localSnsId: " + this.H);
        if (B7 != null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.lang.String userName = B7.getUserName();
            if (userName == null) {
                userName = "";
            }
            z17 = false;
            objArr[0] = userName;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "commentdetail %s", objArr);
        } else {
            z17 = false;
        }
        this.U1 = z17;
        if (com.tencent.mm.plugin.sns.storage.w2.h(this.G)) {
            if (!com.tencent.mm.plugin.sns.storage.w2.g(this.G)) {
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.k2(com.tencent.mm.plugin.sns.storage.w2.n(this.G), 0, C7(B7).adInfoSyncBuffer));
            } else if (B7 == null) {
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.p2(com.tencent.mm.plugin.sns.storage.w2.n(this.G)));
            } else if (!com.tencent.mm.storage.z3.E4(B7.getUserName())) {
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.p2(com.tencent.mm.plugin.sns.storage.w2.n(this.G)));
            }
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.a(210, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(218, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(213, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.pay.o1.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(214, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(683, this);
        this.K = com.tencent.mm.plugin.sns.model.l4.pj();
        this.E = new com.tencent.mm.plugin.sns.ui.kj(this);
        this.F = new com.tencent.mm.plugin.sns.ui.tm(getContext());
        this.S = new com.tencent.mm.plugin.sns.ui.q1(this, G7(), k5Var);
        if (B7 != null) {
            this.f166896x0 = com.tencent.mm.plugin.sns.ui.bs.k(B7, false);
            if (this.X1) {
                java.util.ArrayList arrayList = ta4.h1.f416750a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("detailPageStart", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
                ta4.h1.f416761l = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("detailPageStart", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("browseDetailFeed", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
                java.lang.String s07 = ca4.z0.s0(B7.field_snsId);
                java.util.ArrayList arrayList2 = ta4.h1.f416755f;
                if (!arrayList2.contains(s07)) {
                    arrayList2.add(s07);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("browseDetailFeed", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
            } else {
                com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                s0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("detailPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                s0Var.C = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("detailPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("browsedetailFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                java.lang.String s08 = ca4.z0.s0(B7.field_snsId);
                java.util.ArrayList arrayList3 = (java.util.ArrayList) s0Var.f164970w;
                if (!arrayList3.contains(s08)) {
                    arrayList3.add(s08);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("browsedetailFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            }
            com.tencent.mm.plugin.sns.statistics.s0 s0Var2 = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            s0Var2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("feedDetailPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            s0Var2.f164938J = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedDetailPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        if (B7 != null && B7.isAd()) {
            if (this.F1 == 16) {
                this.f166869l1 = new i64.b1(this, 2);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 17);
            } else {
                this.f166869l1 = new i64.b1(this, 1);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 16);
            }
            i64.b1 b1Var = this.f166869l1;
            int i17 = this.Y;
            android.view.View j17 = getSupportActionBar().j();
            b1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScreen", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            b1Var.f289097l = i17;
            b1Var.f289098m = j17;
            b1Var.f289099n = this;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScreen", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            com.tencent.mm.plugin.sns.ui.bs.k(B7, false);
            this.f166879p1.T(this.f166869l1);
            com.tencent.mm.plugin.sns.ui.j jVar = this.f166897x1;
            i64.b1 b1Var2 = this.f166869l1;
            jVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            jVar.f169462d = b1Var2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        }
        n34.h3 h3Var = n34.h3.f334610d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pullMaxShowCount", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        n34.h3.f334614h = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_details_show_finder_max_count, 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFinderPostManager", "[pullMaxShowCount] maxShowCount = " + n34.h3.f334614h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pullMaxShowCount", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        initView();
        if (B7 != null && B7.isAd()) {
            this.f166869l1.n(0, B7.getLocalid(), B7.isExposures(), this.f166859f, B7.field_snsId, com.tencent.mm.plugin.sns.model.s5.f(B7), this.f166896x0, 2);
        }
        android.view.View view = this.f166859f;
        if (view != null && B7 != null) {
            com.tencent.mm.plugin.sight.decode.model.a aVar3 = (com.tencent.mm.plugin.sight.decode.model.a) view.findViewById(com.tencent.mm.R.id.h88);
            i64.s1.c(B7, true, (B7.getTimeLine().ContentObj != null && B7.getTimeLine().ContentObj.f369837e == 15 && (aVar3 instanceof com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView)) ? ((com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView) aVar3).M.h() : false, G7());
        }
        android.widget.ListView listView = this.f166885s;
        if (listView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        listView.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.20
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                wl5.q qVar;
                bd4.f2 f2Var;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$20");
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(view2);
                arrayList4.add(motionEvent);
                java.lang.Object[] array = arrayList4.toArray();
                arrayList4.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                if (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.e7(snsCommentDetailUI) != null) {
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.e7(snsCommentDetailUI).f();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentSnsSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$Companion");
                java.lang.ref.WeakReference e17 = bd4.f2.e();
                wl5.x m17 = (e17 == null || (f2Var = (bd4.f2) e17.get()) == null) ? null : f2Var.m();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentSnsSelectableTextHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$Companion");
                if (m17 != null) {
                    wl5.q qVar2 = m17.f447155a;
                    if ((qVar2 != null && qVar2.f447146w) || ((qVar = m17.f447157b) != null && qVar.f447146w)) {
                        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$20");
                        return true;
                    }
                }
                yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$20");
                return false;
            }
        });
        com.tencent.mm.plugin.sns.model.s5.f(B7);
        n34.p pVar = this.W1;
        this.K1 = new com.tencent.mm.plugin.sns.ui.v1(this, pVar);
        if (B7 != null && com.tencent.mm.sdk.platformtools.t8.D0(this.L, B7.getUserName()) && B7.field_snsId != 0) {
            addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.21
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = B7;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$21");
                    try {
                        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(snsInfo2.getLocalid());
                        int i18 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        com.tencent.mm.plugin.sns.ui.v1 v1Var = snsCommentDetailUI.K1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        java.lang.String str2 = snsCommentDetailUI.L;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        v1Var.a(com.tencent.mm.sdk.platformtools.t8.D0(str2, snsInfo2.getUserName()), k17);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsCommentDetailUI", e17, "", new java.lang.Object[0]);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$21");
                    return true;
                }
            });
        }
        this.f166862g2.alive();
        this.f166864h2.alive();
        this.f166866i2.alive();
        this.f166870l2.alive();
        this.f166890u2.alive();
        this.f166898x2.alive();
        this.f166872m2.alive();
        this.f166892v2.alive();
        this.f166894w2.alive();
        this.f166868k2.alive();
        this.f166874n2.alive();
        this.f166867j2.alive();
        o25.n1.c(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initReporter", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (B7 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initReporter", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        } else {
            n34.p2 p2Var = new n34.p2() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.22
                @Override // n34.p2
                public void a(int i18) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRequestSuccess", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$22");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRequestSuccess", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$22");
                }

                @Override // n34.p2
                public void e(int i18) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$22");
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                    int i19 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    com.tencent.mm.plugin.sns.statistics.m mVar = snsCommentDetailUI.f166860f2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    boolean z18 = i18 == 1;
                    mVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickPin", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
                    jz5.l[] lVarArr = new jz5.l[7];
                    lVarArr[0] = new jz5.l("sns_visual_angle", java.lang.Integer.valueOf(mVar.f164905i));
                    lVarArr[1] = new jz5.l("associate_username", mVar.f164904h);
                    lVarArr[2] = new jz5.l("sns_feed_id", mVar.f164899c);
                    lVarArr[3] = new jz5.l("pin_status", java.lang.Integer.valueOf(z18 ? 1 : 2));
                    lVarArr[4] = new jz5.l("snsalbumsid", mVar.f164897a);
                    lVarArr[5] = new jz5.l("is_pin_feed", java.lang.Integer.valueOf(mVar.f164901e));
                    lVarArr[6] = new jz5.l("sns_page_scene", java.lang.Integer.valueOf(mVar.f164898b));
                    java.util.HashMap i27 = kz5.c1.i(lVarArr);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
                    java.util.Objects.toString(ri.l0.a(i27));
                    ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.statistics.t("sns_feed_pin", i27));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickPin", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$22");
                }
            };
            pVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStarClickCallback", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            pVar.f334705f = p2Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStarClickCallback", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            if (this.Y1 == null) {
                this.Y1 = "";
            }
            java.lang.String str2 = this.Y1;
            com.tencent.mm.plugin.sns.statistics.m mVar = this.f166860f2;
            mVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAlbumSessionId", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            mVar.f164897a = str2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAlbumSessionId", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
            int intExtra2 = getIntent().getIntExtra("INTENT_ALBUM_SCENE", 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAlbumScene", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
            mVar.f164898b = intExtra2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAlbumScene", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initWithSnsInfo", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
            if (kotlin.jvm.internal.o.b(B7.getUserName(), c01.z1.r())) {
                mVar.f164905i = 1;
            } else {
                mVar.f164905i = 2;
            }
            java.lang.String userName2 = B7.getUserName();
            kotlin.jvm.internal.o.f(userName2, "getUserName(...)");
            mVar.f164904h = userName2;
            java.lang.String s09 = ca4.z0.s0(B7.field_snsId);
            kotlin.jvm.internal.o.f(s09, "longToFullString(...)");
            mVar.f164899c = s09;
            mVar.f164900d = B7.getTimeLine().ContentObj.f369837e;
            com.tencent.mm.protobuf.f parseFrom = new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(B7.field_attrBuf);
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsObject");
            com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = (com.tencent.mm.protocal.protobuf.SnsObject) parseFrom;
            mVar.f164901e = snsObject2.InTopList;
            mVar.f164903g = B7;
            mVar.f164902f = mVar.b(B7, snsObject2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initWithSnsInfo", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initReporter", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        java.lang.String str;
        v52.c g17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.model.l4.Kj().c(this, 5);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(210, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(218, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(213, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(214, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(683, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.pay.o1.CTRL_INDEX, this);
        com.tencent.mm.plugin.sns.model.l4.hj().N(this);
        bd4.f2 f2Var = this.f166863h;
        if (f2Var != null) {
            f2Var.k();
        }
        if (this.f166871m != null) {
            ul5.k bounceView = getBounceView();
            if (bounceView != null) {
                ((com.tencent.mm.ui.widget.pulldown.NestedBounceView) bounceView).a(this.f166871m);
            }
            this.f166871m = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseClickable", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.q1 q1Var = this.S;
        if (q1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseCallBack", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
            q1Var.f170292a = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseCallBack", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseClickable", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.p5.a();
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.B;
        if (snsCommentFooter != null) {
            snsCommentFooter.A();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.model.AdModelManager$Companion");
        i64.i.f289183d.g();
        i64.t.f289316d.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        i64.y.f289357d.g();
        i64.u.f289322d.g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.model.AdModelManager$Companion");
        a44.k.f1285g.d();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f166857e;
        dx1.f fVar = dx1.g.f244489a;
        dx1.b[] bVarArr = dx1.b.f244476d;
        fVar.l("MomentsTogetherHistoryBrowsing", "withFriendDetailAction", pm0.v.u(com.tencent.mm.plugin.sns.storage.w2.n(this.G)), java.lang.String.format("%d#%d#%d#%d#%d", 1, java.lang.Integer.valueOf(this.S1 ? 1 : 0), java.lang.Integer.valueOf(this.T1 ? 1 : 0), 0, java.lang.Long.valueOf(currentTimeMillis)), bx1.u.f36314i);
        fVar.j("MomentsTogetherHistoryBrowsing", "withFriendDetailTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f166857e), bx1.u.f36310e);
        com.tencent.mm.plugin.sns.storage.SnsInfo B7 = B7(false);
        xa4.c cVar = xa4.c.f452822a;
        cVar.a(B7, 2, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReport", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        if (B7 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReport", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        } else {
            com.tencent.mm.autogen.mmdata.rpt.SnsRabbiot2023ExposeStruct snsRabbiot2023ExposeStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsRabbiot2023ExposeStruct) xa4.c.f452823b.remove(cVar.c(B7, 2));
            if (snsRabbiot2023ExposeStruct != null) {
                if (((n30.r) i95.n0.c(n30.r.class)) == null || (g17 = v52.c.g()) == null || (str = g17.d()) == null) {
                    str = "";
                }
                snsRabbiot2023ExposeStruct.f60700f = snsRabbiot2023ExposeStruct.b("sessionID", str, true);
                snsRabbiot2023ExposeStruct.k();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReport", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        }
        if (B7 != null && B7.isAd()) {
            i64.b1 b1Var = this.f166869l1;
            if (b1Var != null) {
                b1Var.o(0, B7.getLocalid(), B7.field_snsId, 2);
            }
            com.tencent.mm.plugin.sns.storage.ADInfo C7 = C7(B7);
            java.lang.String str2 = C7 != null ? C7.uxInfo : "";
            if (B7.isRecExpAd()) {
                i64.i1 Gj = com.tencent.mm.plugin.sns.model.l4.Gj();
                long j17 = B7.field_snsId;
                Gj.h(14652, i64.q0.a(j17, ca4.z0.t0(j17), str2, java.lang.Long.valueOf(this.f166857e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
            } else {
                i64.i1 Gj2 = com.tencent.mm.plugin.sns.model.l4.Gj();
                long j18 = B7.field_snsId;
                Gj2.h(12012, i64.q0.a(j18, ca4.z0.t0(j18), str2, java.lang.Long.valueOf(this.f166857e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
            }
            m21.w.c(com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION);
            ca4.z0.t0(B7.field_snsId);
            java.lang.System.currentTimeMillis();
            dc4.v vVar = this.f166900y0;
            if (vVar != null) {
                vVar.i();
            }
        }
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f166879p1;
        iVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        iVar.f169809l.r();
        iVar.V.dead();
        iVar.W.dead();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        this.f166862g2.dead();
        this.f166864h2.dead();
        this.f166866i2.dead();
        this.f166870l2.dead();
        this.f166890u2.dead();
        this.f166898x2.dead();
        this.f166872m2.dead();
        this.f166892v2.dead();
        this.f166894w2.dead();
        this.f166868k2.dead();
        this.f166874n2.dead();
        this.f166867j2.dead();
        super.onDestroy();
        if (this.f166902y2 != null) {
            com.tencent.mm.plugin.sns.model.l4.Cj().v(this.f166902y2);
            this.f166902y2 = null;
        }
        if (this.X1) {
            java.util.ArrayList arrayList = ta4.h1.f416750a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("detailPageStop", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
            if (ta4.h1.f416761l != 0) {
                ta4.h1.f416762m += java.lang.System.currentTimeMillis() - ta4.h1.f416761l;
                ta4.h1.f416761l = 0L;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("detailPageStop", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        } else {
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            s0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("detailPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            if (s0Var.C != 0) {
                s0Var.D += java.lang.System.currentTimeMillis() - s0Var.C;
                s0Var.C = 0L;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("detailPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        com.tencent.mm.plugin.sns.statistics.s0 s0Var2 = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        s0Var2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("feedDetailPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (s0Var2.f164938J != 0) {
            s0Var2.K += java.lang.System.currentTimeMillis() - s0Var2.f164938J;
            s0Var2.f164938J = 0L;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedDetailPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (this.G1 && B7 != null && B7.getTimeLine() != null && B7.getTimeLine().ContentObj != null) {
            com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct Q = s0Var2.Q();
            Q.f60445e = s0Var2.y().f60772e;
            Q.f60444d = Q.b("ToUsername", s0Var2.y().f60771d, true);
            Q.f60446f = Q.b("FeedId", ca4.z0.s0(B7.field_snsId), true);
            Q.f60447g = B7.getTimeLine().ContentObj.f369837e;
            s0Var2.h();
        }
        java.lang.String clazz = com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherTailActionStruct.class.getCanonicalName();
        kotlin.jvm.internal.o.g(clazz, "clazz");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) dx1.g.f244494f.get("MomentsTogetherTailActionFeed");
        if (concurrentHashMap != null) {
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                try {
                    java.lang.Object newInstance = java.lang.Class.forName(clazz).newInstance();
                    if (newInstance instanceof jx3.a) {
                        ((dx1.c) entry.getValue()).f244477a = (jx3.a) newInstance;
                        dx1.g.f244489a.c((dx1.c) entry.getValue(), true, true);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.StaticKvStat", "commitKey, clazz:" + clazz + " is error", e17);
                }
            }
        }
        dx1.g.f244494f.remove("MomentsTogetherTailActionFeed");
        n34.p pVar = this.W1;
        pVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroy", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        kotlinx.coroutines.r2 r2Var = pVar.f334703d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.z0.e(pVar.f334702c, null, 1, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroy", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        ((jd0.u1) ((kd0.h2) i95.n0.c(kd0.h2.class))).getClass();
        zs5.u0.f475485h.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reset >> ");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = mc4.c.f325646b;
        sb6.append(snsInfo != null ? snsInfo.getLocalid() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveSnsSecurityPassFooterHelper", sb6.toString());
        mc4.c.f325646b = null;
        mc4.c.f325647c = null;
        mc4.c.f325648d = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        com.tencent.mm.plugin.sns.ui.widget.j3 j3Var = com.tencent.mm.plugin.sns.ui.widget.j3.f171174a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCommentDetailSession", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        java.lang.String str3 = ca4.z0.f40071d;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("reportCommentDetailSession >> ");
        sb7.append(com.tencent.mm.plugin.sns.ui.widget.j3.f171177d);
        sb7.append(", ");
        java.util.HashMap hashMap = com.tencent.mm.plugin.sns.ui.widget.j3.f171175b;
        sb7.append(hashMap.size());
        sb7.append(", ");
        sb7.append(str3);
        ot5.g.c("MicroMsg.SnsSessionCmtReportManager", sb7.toString());
        kotlin.jvm.internal.o.d(str3);
        if ((str3.length() > 0) == false) {
            str3 = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
            kotlin.jvm.internal.o.f(str3, "requestSessionId(...)");
        }
        j3Var.d(3, str3, hashMap);
        hashMap.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCommentDetailSession", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (M7()) {
            a8();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onKeyboardStateChanged() {
        /*
            r7 = this;
            java.lang.String r0 = "onKeyboardStateChanged"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            int r2 = r7.keyboardState()
            r3 = 2
            java.lang.String r4 = "MicroMsg.SnsCommentDetailUI"
            if (r2 != r3) goto L1b
            java.lang.String r2 = "keybaordhide! "
            com.tencent.mars.xlog.Log.i(r4, r2)
            r2 = 0
            r7.D = r2
            goto L62
        L1b:
            int r2 = r7.keyboardState()
            r3 = 1
            if (r2 != r3) goto L62
            java.lang.String r2 = "keybaordShow"
            com.tencent.mars.xlog.Log.i(r4, r2)
            r7.X7()
            java.lang.String r2 = "checkScrollWhenKeyboardUp"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            java.lang.String r5 = "checkScrollWhenKeyboardUp: "
            com.tencent.mars.xlog.Log.i(r4, r5)
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r4 = r7.B
            if (r4 == 0) goto L53
            java.lang.String r4 = "enableUseAdjustNothingConfig"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            boolean r6 = ka4.e.f306129a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            if (r6 == 0) goto L53
            java.lang.Runnable r4 = r7.f166880p2
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$10 r4 = (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass10) r4
            r4.run()
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r4 = r7.B
            r4.f167114z1 = r3
            goto L58
        L53:
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp r3 = r7.f166876o2
            r3.run()
        L58:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            com.tencent.mm.plugin.sns.ui.j r2 = r7.f166897x1
            if (r2 == 0) goto L62
            r2.f()
        L62:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.onKeyboardStateChanged():void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.model.l4.Cj().v(this);
        super.onPause();
        zy2.c9 c9Var = (zy2.c9) i95.n0.c(zy2.c9.class);
        int i18 = 0;
        if (c9Var != null) {
            com.tencent.mm.plugin.finder.service.l3 l3Var = (com.tencent.mm.plugin.finder.service.l3) c9Var;
            if (gm0.j1.a()) {
                l3Var.f126122e = false;
                l3Var.f126121d = false;
            } else {
                com.tencent.mars.xlog.Log.e("FinderMultiTaskService", "onLauncherUIPause: acc not ready");
            }
        }
        gc4.b bVar = this.Q1;
        if (bVar != null) {
            bVar.a();
        }
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.B;
        if (snsCommentFooter != null) {
            snsCommentFooter.u();
            this.B.t(false);
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter2 = this.B;
            snsCommentFooter2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            if (snsCommentFooter2.f167101r != null) {
                snsCommentFooter2.S();
            }
            snsCommentFooter2.f167092i.onPause();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        }
        new com.tencent.mm.autogen.events.UIStatusChangedEvent().f54907g.f7378a = 1;
        i64.b1 b1Var = this.f166869l1;
        if (b1Var != null) {
            b1Var.p();
        }
        dc4.v vVar = this.f166900y0;
        if (vVar != null) {
            vVar.g();
        }
        com.tencent.mm.plugin.sns.statistics.m mVar = this.f166860f2;
        mVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pageOut", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = mVar.f164903g;
        if (snsInfo != null) {
            com.tencent.mm.protocal.protobuf.SnsObject f17 = com.tencent.mm.plugin.sns.model.s5.f(snsInfo);
            int size = f17.LikeUserList.size();
            i17 = f17.CommentCount;
            i18 = size;
        } else {
            i17 = 0;
        }
        java.util.HashMap i19 = kz5.c1.i(new jz5.l("sns_visual_angle", java.lang.Integer.valueOf(mVar.f164905i)), new jz5.l("associate_username", mVar.f164904h), new jz5.l("sns_feed_id", mVar.f164899c), new jz5.l("snsalbumsid", mVar.f164897a), new jz5.l("snscurrlikecnt", java.lang.Integer.valueOf(i18)), new jz5.l("snscurrcmtcnt", java.lang.Integer.valueOf(i17)), new jz5.l("send_type_sns", java.lang.Integer.valueOf(mVar.f164900d)), new jz5.l("is_pin_feed", java.lang.Integer.valueOf(mVar.f164901e)), new jz5.l("sns_page_scene", java.lang.Integer.valueOf(mVar.f164898b)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPageEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        java.util.Objects.toString(ri.l0.a(i19));
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.statistics.u(30018, "page_out", i19));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPageEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pageOut", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
        this.f166858e2 = true;
        com.tencent.mm.plugin.sns.ui.widget.x1.f171306a.h();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Sj(this, "session_stay_time_ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.Z1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.model.l4.Cj().c(this);
        com.tencent.mm.autogen.events.UIStatusChangedEvent uIStatusChangedEvent = new com.tencent.mm.autogen.events.UIStatusChangedEvent();
        am.mz mzVar = uIStatusChangedEvent.f54907g;
        mzVar.f7379b = 0;
        mzVar.f7380c = 1;
        mzVar.f7381d = 0;
        mzVar.f7378a = 0;
        uIStatusChangedEvent.e();
        i64.b1 b1Var = this.f166869l1;
        if (b1Var != null) {
            b1Var.r();
        }
        dc4.v vVar = this.f166900y0;
        if (vVar != null) {
            vVar.j();
        }
        com.tencent.mm.plugin.sns.statistics.m mVar = this.f166860f2;
        mVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pageIn", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
        java.util.HashMap i17 = kz5.c1.i(new jz5.l("sns_visual_angle", java.lang.Integer.valueOf(mVar.f164905i)), new jz5.l("associate_username", mVar.f164904h), new jz5.l("sns_feed_id", mVar.f164899c), new jz5.l("snsalbumsid", mVar.f164897a), new jz5.l("send_type_sns", java.lang.Integer.valueOf(mVar.f164900d)), new jz5.l("is_pin_feed", java.lang.Integer.valueOf(mVar.f164901e)), new jz5.l("sns_page_scene", java.lang.Integer.valueOf(mVar.f164898b)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPageEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        com.tencent.mm.plugin.sns.statistics.w.f164988a.a();
        java.util.Objects.toString(ri.l0.a(i17));
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.statistics.u(30018, "page_in", i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPageEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pageIn", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
        com.tencent.mm.plugin.sns.storage.SnsInfo B7 = B7(false);
        if (this.K2 != null) {
            if (B7 == null || !B7.isAd()) {
                this.K2.j(8);
            } else {
                com.tencent.mm.plugin.sns.storage.ADXml adXml = B7.getAdXml();
                if (adXml != null && (adClickActionInfo = adXml.adActionLinkClickInfo) != null && adXml.adCheckDownloadAppInfo != null && adClickActionInfo.a()) {
                    this.K2.b(B7, adXml, C7(B7), 0);
                    this.K2.j(0);
                }
                if (this.f166858e2 && B7.isValidAdHeadStateInfo()) {
                    x84.c.a((android.widget.TextView) this.f166859f.findViewById(com.tencent.mm.R.id.kbq), x84.c.b(B7), i65.a.b(this, 24), i65.a.b(this, 20), i65.a.b(this, 4), true);
                }
            }
        }
        this.f166858e2 = false;
        P7(B7);
        super.onResume();
        gc4.b bVar = this.Q1;
        if (bVar != null) {
            bVar.c();
        }
        zy2.c9 c9Var = (zy2.c9) i95.n0.c(zy2.c9.class);
        if (c9Var != null && ((com.tencent.mm.plugin.finder.service.l3) c9Var).Ai(this)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshSnsSecurityErrorView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (this.f166854c2) {
            com.tencent.mm.plugin.sns.storage.SnsInfo B72 = B7(false);
            if (B72.isSecurityPassDieItem() && this.f166856d2.getVisibility() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "refreshSnsSecurityErrorView to hide errorTipsTopParentView and show pass tipsView");
                android.view.View view = this.f166856d2;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "refreshSnsSecurityErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "refreshSnsSecurityErrorView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mc4.c.f325645a.c(getContext(), new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$g(this, c8(B72)));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshSnsSecurityErrorView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.B;
        if (snsCommentFooter != null) {
            snsCommentFooter.B();
        }
        com.tencent.mm.plugin.sns.ui.widget.j3.f171174a.f(this.U ? 3 : 2);
        com.tencent.mm.plugin.sns.ui.widget.x1.f171306a.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0335  */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r29, int r30, java.lang.String r31, com.tencent.mm.modelbase.m1 r32) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        zy2.c9 c9Var = (zy2.c9) i95.n0.c(zy2.c9.class);
        if (c9Var != null) {
            ((com.tencent.mm.plugin.finder.service.l3) c9Var).aj();
        }
        super.onStart();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        super.onWindowFocusChanged(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "hasFocus = " + z17);
        gc4.b bVar = this.Q1;
        if (bVar != null && z17) {
            bVar.c();
        }
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowBlessBubble", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            if (this.f166888t2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowBlessBubble", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            } else if (!xa4.g.f452830d.z()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowBlessBubble", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            } else if (!getIntent().getBooleanExtra("intent_show_bless_bubble", false)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowBlessBubble", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            } else if (this.f166859f == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "show bless bubble fail,null header");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowBlessBubble", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            } else {
                this.f166888t2 = true;
                final ul5.k bounceView = getBounceView();
                if (bounceView != 0) {
                    ((com.tencent.mm.ui.widget.pulldown.NestedBounceView) bounceView).c(new ul5.j() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.23
                        @Override // ul5.j
                        public void c(int i17) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBounceOffsetChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$23");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBounceOffsetChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$23");
                        }

                        @Override // ul5.j
                        public void w(int i17) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBounceStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$23");
                            ((com.tencent.mm.ui.widget.pulldown.NestedBounceView) bounceView).a(this);
                            ((com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView) com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.g7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this).findViewById(com.tencent.mm.R.id.f482806od)).r();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBounceStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$23");
                        }
                    });
                }
                getWindow().getDecorView().post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.24
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$24");
                        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
                        if (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.g7(snsCommentDetailUI).getHeight() > 0) {
                            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.h7(snsCommentDetailUI);
                        } else {
                            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.g7(snsCommentDetailUI).getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.24.1
                                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                public void onGlobalLayout() {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$24$1");
                                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass24 anonymousClass24 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass24.this;
                                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.g7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.h7(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$24$1");
                                }
                            });
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$24");
                    }
                });
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowBlessBubble", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final void q7(com.tencent.mm.plugin.sns.ui.PhotosContent photosContent, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        android.widget.ImageView a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addAdActionIconForPics", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (photosContent == null || i17 <= 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "photosContent == null or imgNums <= 1");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addAdActionIconForPics", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        try {
            int b17 = i65.a.b(getContext(), 20);
            int i18 = 0;
            for (int i19 = 0; i19 < i17; i19++) {
                if (photosContent.g(i19).getVisibility() == 8) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "current index " + i19 + " imageView is a placeholder, so visibility is gone");
                } else {
                    int r17 = ca4.m0.r(snsInfo, G7(), i18);
                    if ((r17 == 1 || r17 == 2) && (a17 = n74.x0.a(getContext(), photosContent, i19, b17)) != null) {
                        if (r17 == 1) {
                            a17.setImageDrawable(i65.a.i(getContext(), com.tencent.mm.R.drawable.bpt));
                        } else if (r17 == 2) {
                            a17.setImageResource(com.tencent.mm.R.drawable.csw);
                        }
                        a17.setVisibility(0);
                        photosContent.addView(a17);
                    }
                    i18++;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addAdActionIconForPics", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final void r7(com.tencent.mm.plugin.sns.ui.PhotosContent photosContent, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addAdWeAppIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (photosContent == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addAdWeAppIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        try {
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            int b17 = i65.a.b(getContext(), 24);
            int b18 = i65.a.b(getContext(), 4);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(b17, b17);
            layoutParams.leftMargin = b18;
            layoutParams.topMargin = b18;
            imageView.setImageResource(i17);
            imageView.setLayoutParams(layoutParams);
            photosContent.addView(imageView);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addAdWeAppIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final void s7(com.tencent.mm.plugin.sns.ui.PhotosContent photosContent, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        r45.a90 a90Var;
        int i18;
        com.tencent.mm.plugin.sns.ui.PhotosContent photosContent2 = photosContent;
        int i19 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addCollectedAdGameInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (photosContent2 == null || i19 <= 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "addCollectedAdGameInfo, photosContent == null or imgNums <= 1");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdGameInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        if (timeLineObject == null || (a90Var = timeLineObject.ContentObj) == null || a84.b0.b(a90Var.f369840h)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "addCollectedAdGameInfo, mediaList is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdGameInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        java.util.List a17 = snsInfo.getAdXml().collectedAdInfo.a();
        if (a17 != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) a17;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() != i19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "addCollectedAdGameInfo, subAdInfo size != imgNums");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdGameInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    return;
                }
                try {
                    java.util.LinkedList linkedList = timeLineObject.ContentObj.f369840h;
                    java.lang.String snsId = snsInfo.getSnsId();
                    int hashCode = hashCode();
                    int i27 = 0;
                    int i28 = 0;
                    while (i28 < i19) {
                        android.view.View f17 = photosContent2.f(i28);
                        if (f17 != null && f17.getVisibility() != 8) {
                            final com.tencent.mm.plugin.sns.ui.TagImageView g17 = photosContent2.g(i28);
                            if (g17 != null) {
                                g17.setVisibility(8);
                            }
                            s34.v1 v1Var = i27 < arrayList.size() ? (s34.v1) arrayList.get(i27) : null;
                            r45.jj4 jj4Var = i27 < linkedList.size() ? (r45.jj4) linkedList.get(i27) : null;
                            if (v1Var == null) {
                                i27++;
                                i18 = i28;
                            } else {
                                android.view.ViewGroup.LayoutParams layoutParams = f17.getLayoutParams();
                                int i29 = layoutParams != null ? layoutParams.width : 0;
                                if (i29 <= 0) {
                                    i29 = com.tencent.mm.plugin.sns.model.l4.nj();
                                    com.tencent.mars.xlog.Log.w("MicroMsg.SnsCommentDetailUI", "addCollectedAdGameInfo, parentView width invalid, fallback=" + i29);
                                }
                                int i37 = i27;
                                i18 = i28;
                                android.view.View a18 = b84.a.a(this, v1Var, jj4Var, snsInfo, snsId, hashCode, i29, com.tencent.mm.storage.s7.f195306j, this.R1);
                                if (a18 != null && (f17 instanceof android.widget.FrameLayout)) {
                                    ((android.widget.FrameLayout) f17).addView(a18);
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                    arrayList2.add(0);
                                    java.util.Collections.reverse(arrayList2);
                                    yj0.a.d(a18, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "addCollectedAdGameInfo", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    a18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                    yj0.a.f(a18, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "addCollectedAdGameInfo", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    a18.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$k
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(android.view.View view) {
                                            int i38 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$addCollectedAdGameInfo$10", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                                            java.lang.Object obj = new java.lang.Object();
                                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                            com.tencent.mm.plugin.sns.ui.TagImageView tagImageView = com.tencent.mm.plugin.sns.ui.TagImageView.this;
                                            arrayList3.add(tagImageView);
                                            arrayList3.add(view);
                                            java.lang.Object[] array = arrayList3.toArray();
                                            arrayList3.clear();
                                            yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
                                            if (tagImageView != null) {
                                                tagImageView.performClick();
                                            }
                                            yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$addCollectedAdGameInfo$10", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                                        }
                                    });
                                }
                                i27 = i37 + 1;
                            }
                            i28 = i18 + 1;
                            photosContent2 = photosContent;
                            i19 = i17;
                        }
                        i18 = i28;
                        i27 = i27;
                        i28 = i18 + 1;
                        photosContent2 = photosContent;
                        i19 = i17;
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "addCollectedAdGameInfo error: " + th6);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdGameInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "addCollectedAdGameInfo, subAdInfoList is null or empty");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdGameInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("superImportUIComponents", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        super.superImportUIComponents(hashSet);
        hashSet.add(o34.b.class);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("superImportUIComponents", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final void t7(com.tencent.mm.plugin.sns.ui.PhotosContent photosContent, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.PhotosContent photosContent2 = photosContent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addCollectedAdPrice", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (photosContent2 == null || i17 <= 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "photosContent == null or imgNums <= 1");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdPrice", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        java.util.List a17 = snsInfo.getAdXml().collectedAdInfo.a();
        if (a17 != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) a17;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() != i17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "subAdInfo size != imgNums");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdPrice", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    return;
                }
                int i18 = 0;
                int i19 = 0;
                while (i18 < i17) {
                    try {
                        if (photosContent2.g(i18).getVisibility() == 8) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "current index " + i18 + " imageView is a placeholder, so visibility is gone");
                        } else {
                            try {
                                android.view.View b17 = b84.a.b(this, i19 < arrayList.size() ? (s34.v1) arrayList.get(i19) : null, photosContent2);
                                if (b17 != null) {
                                    ((android.widget.FrameLayout) photosContent2.f(i18)).addView(b17);
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                    arrayList2.add(0);
                                    java.util.Collections.reverse(arrayList2);
                                    yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "addCollectedAdPrice", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                    yj0.a.f(b17, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "addCollectedAdPrice", "(Lcom/tencent/mm/plugin/sns/ui/PhotosContent;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                i19++;
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", th.toString());
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdPrice", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                                return;
                            }
                        }
                        i18++;
                        photosContent2 = photosContent;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdPrice", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "subAdInfoList is null or empty");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCollectedAdPrice", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final android.view.View u7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addEmptyMarginView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        android.widget.AbsListView.LayoutParams layoutParams = new android.widget.AbsListView.LayoutParams(-1, com.tencent.mm.sdk.platformtools.j.d(this, i17));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setLayoutParams(layoutParams);
        v7(linearLayout);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addEmptyMarginView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return linearLayout;
    }

    public final void v7(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPageHeaderView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        this.f166885s.addHeaderView(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPageHeaderView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final void w7(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ui.PhotosContent photosContent, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowStatusIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (snsInfo != null && snsInfo.isAd() && i17 == 2) {
            android.view.View view = null;
            try {
                com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
                if (adXml != null && adXml.isShowPlayIconOnCover() && (view = photosContent.findViewById(com.tencent.mm.R.id.nhu)) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "checkShowStatusIcon", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ui/PhotosContent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "checkShowStatusIcon", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ui/PhotosContent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) photosContent.f(0).getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
                    int i18 = ((layoutParams.width / 2) - (layoutParams2.width / 2)) + layoutParams.leftMargin;
                    int i19 = ((layoutParams.height / 2) - (layoutParams2.height / 2)) + layoutParams.topMargin;
                    if (i18 != layoutParams2.leftMargin || i19 != layoutParams2.topMargin) {
                        layoutParams2.leftMargin = i18;
                        layoutParams2.topMargin = i19;
                        view.setLayoutParams(layoutParams2);
                    }
                }
            } catch (java.lang.Throwable th6) {
                android.view.View view2 = view;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "checkShowStatusIcon", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ui/PhotosContent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "checkShowStatusIcon", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ui/PhotosContent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentDetailUI", "checkShowStatusIcon exp=" + th6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowStatusIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final boolean x7(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSnsInfoInvalidShow", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (snsInfo != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsInfoInvalidShow", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentDetailUI", "checkSnsInfoInvalidShow: info null, snsId:%s, localSnsId=%s, forbidAccess=%b", this.G, this.H, java.lang.Boolean.valueOf(this.O1));
        if (!this.O1) {
            finish();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsInfoInvalidShow", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return true;
    }

    public final void y7(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSnsThumbNeedFallbackAvif", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (snsInfo == null || !snsInfo.isAd() || timeLineObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsThumbNeedFallbackAvif", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        r45.a90 a90Var = timeLineObject.ContentObj;
        if (a90Var != null && !a84.b0.b(a90Var.f369840h)) {
            java.util.Iterator it = timeLineObject.ContentObj.f369840h.iterator();
            while (it.hasNext()) {
                m44.a.g((r45.jj4) it.next());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsThumbNeedFallbackAvif", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public final void z7(final android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeCommentView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        view.clearAnimation();
        view.startAnimation(this.f166895x);
        this.f166895x.setAnimationListener(new android.view.animation.Animation.AnimationListener(this) { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.68
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation animation) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$68");
                android.view.View view2 = view;
                if (view2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$68", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$68", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$68");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation animation) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$68");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$68");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation animation) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$68");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$68");
            }
        });
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeCommentView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }
}
