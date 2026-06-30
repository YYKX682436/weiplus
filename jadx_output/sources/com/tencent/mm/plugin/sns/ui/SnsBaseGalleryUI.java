package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public abstract class SnsBaseGalleryUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.sns.ui.n4, com.tencent.mm.plugin.sns.ui.ak, g04.h, com.tencent.mm.plugin.sns.model.h0 {
    public static final /* synthetic */ int R = 0;
    public com.tencent.mm.plugin.sns.ui.te G;
    public com.tencent.mm.ui.base.MMViewPager I;
    public final sy3.d K;
    public final sy3.e L;
    public final com.tencent.mm.sdk.event.IListener M;
    public final com.tencent.mm.sdk.event.IListener N;
    public final com.tencent.mm.sdk.event.IListener P;
    public final com.tencent.mm.network.s0 Q;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f166803e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.o3 f166804f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.p3 f166805g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f166806h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.c4 f166807i;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsInfoFlip f166810o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsInfoFlip f166811p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f166812q;

    /* renamed from: s, reason: collision with root package name */
    public g04.j f166814s;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.MultiCodeMaskView f166816u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f166817v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f166818w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f166819x;

    /* renamed from: y, reason: collision with root package name */
    public android.animation.ValueAnimator f166820y;

    /* renamed from: d, reason: collision with root package name */
    public boolean f166802d = true;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f166808m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f166809n = true;

    /* renamed from: r, reason: collision with root package name */
    public int f166813r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f166815t = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f166821z = 0;
    public int A = -1;
    public boolean B = false;
    public java.lang.String C = "";
    public final com.tencent.mm.plugin.sns.ui.e3 D = new com.tencent.mm.plugin.sns.ui.je(this);
    public final com.tencent.mm.plugin.sns.ui.f3 E = new com.tencent.mm.plugin.sns.ui.le(this);
    public final android.view.View.OnLongClickListener F = new com.tencent.mm.plugin.sns.ui.me(this);
    public long H = 0;

    /* renamed from: J, reason: collision with root package name */
    public sy3.c f166801J = null;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$13, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass13 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanTranslationResultEvent> {
        public AnonymousClass13(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -1699517927;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$13");
            com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent2 = scanTranslationResultEvent;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$13");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsBaseGalleryUI", "scanTranslationResult %d, %s", java.lang.Integer.valueOf(scanTranslationResultEvent2.f54739g.f6400a), java.lang.Boolean.valueOf(scanTranslationResultEvent2.f54739g.f6402c));
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.ui.ge(this, scanTranslationResultEvent2));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$13");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$13");
            return true;
        }
    }

    public SnsBaseGalleryUI() {
        ((yz3.q) ((ty3.e) i95.n0.c(ty3.e.class))).getClass();
        this.K = new kz3.o();
        this.L = new com.tencent.mm.plugin.sns.ui.ne(this);
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.M = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTranslateImageEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.11
            {
                this.__eventId = 1330515845;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsTranslateImageEvent snsTranslateImageEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$11");
                com.tencent.mm.autogen.events.SnsTranslateImageEvent snsTranslateImageEvent2 = snsTranslateImageEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$11");
                com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI = com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.this;
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = snsBaseGalleryUI.f166810o;
                r45.jj4 cntMedia = snsInfoFlip != null ? snsInfoFlip.getCntMedia() : null;
                if (cntMedia != null && snsTranslateImageEvent2.f54848g.f6615a.equals(cntMedia.f377855d)) {
                    snsBaseGalleryUI.Z6(com.tencent.mm.plugin.sns.model.i1.l(cntMedia));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$11");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$11");
                return true;
            }
        };
        this.N = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsOCRImageEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.12
            {
                this.__eventId = -1384491691;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsOCRImageEvent snsOCRImageEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$12");
                com.tencent.mm.autogen.events.SnsOCRImageEvent snsOCRImageEvent2 = snsOCRImageEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$12");
                com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI = com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.this;
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = snsBaseGalleryUI.f166810o;
                r45.jj4 cntMedia = snsInfoFlip != null ? snsInfoFlip.getCntMedia() : null;
                if (cntMedia != null && snsOCRImageEvent2.f54825g.f6874b.equals(cntMedia.f377855d)) {
                    am.hw hwVar = snsOCRImageEvent2.f54825g;
                    int i17 = hwVar.f6873a;
                    java.lang.String str = hwVar.f6875c;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOCRImage", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                    if (snsBaseGalleryUI.I == null) {
                        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip2 = snsBaseGalleryUI.f166810o;
                        if (snsInfoFlip2 != null) {
                            snsBaseGalleryUI.I = snsInfoFlip2.getGallery();
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initGallery", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                        com.tencent.mm.ui.base.MMViewPager mMViewPager = snsBaseGalleryUI.I;
                        if (mMViewPager == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initGallery", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                        } else {
                            mMViewPager.setDoubleClickListener(new com.tencent.mm.plugin.sns.ui.pe(snsBaseGalleryUI));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initGallery", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                        }
                    }
                    if (snsBaseGalleryUI.f166801J == null) {
                        sy3.c Ai = ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).Ai(snsBaseGalleryUI, snsBaseGalleryUI.d7());
                        snsBaseGalleryUI.f166801J = Ai;
                        ((kz3.l) Ai).f313887e = snsBaseGalleryUI.I;
                    }
                    ry3.p pVar = new ry3.p();
                    pVar.f401533g = i17;
                    pVar.f401531e = com.tencent.mm.plugin.sns.model.i1.l(cntMedia);
                    pVar.f401527a = java.lang.System.currentTimeMillis();
                    pVar.f401528b = 3;
                    pVar.f401538l = false;
                    pVar.f401539m = true;
                    try {
                        pVar.f401542p.putByteArray("key_sns_media_data", cntMedia.toByteArray());
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsBaseGalleryUI", e17, "doOCRImage mediaObj to byte array exception", new java.lang.Object[0]);
                    }
                    if (snsBaseGalleryUI instanceof com.tencent.mm.plugin.sns.ui.SnsGalleryUI) {
                        pVar.f401540n = 203;
                    } else {
                        pVar.f401540n = 202;
                    }
                    pVar.f401541o.f401526a = str;
                    snsBaseGalleryUI.m7();
                    com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip3 = snsBaseGalleryUI.f166810o;
                    if (snsInfoFlip3 != null) {
                        ((kz3.l) snsBaseGalleryUI.f166801J).a(snsInfoFlip3.getCurrentImageView());
                    }
                    ry3.m mVar = new ry3.m();
                    mVar.f401524a = snsBaseGalleryUI instanceof com.tencent.mm.plugin.sns.ui.SnsBrowseUI;
                    mVar.f401525b = true;
                    ((kz3.o) snsBaseGalleryUI.K).a(1, snsBaseGalleryUI.d7(), snsBaseGalleryUI.f166815t);
                    snsBaseGalleryUI.H = ((kz3.l) snsBaseGalleryUI.f166801J).i(pVar, mVar, snsBaseGalleryUI.L);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOCRImage", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$12");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$12");
                return true;
            }
        };
        this.P = new com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.AnonymousClass13(a0Var);
        this.Q = new com.tencent.mm.plugin.sns.ui.ie(this);
    }

    public static /* synthetic */ sy3.d T6(com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        sy3.d dVar = snsBaseGalleryUI.K;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return dVar;
    }

    public static void U6(com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        snsBaseGalleryUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageOCRStart", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = snsBaseGalleryUI.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.setEnableSingleClickOver(false);
            snsBaseGalleryUI.f166810o.setShowLongClickMenu(false);
            com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar imgBottomBarView = snsBaseGalleryUI.f166810o.getImgBottomBarView();
            if (imgBottomBarView != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(imgBottomBarView, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI", "onImageOCRStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                imgBottomBarView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(imgBottomBarView, "com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI", "onImageOCRStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mm.ui.base.MMViewPager mMViewPager = snsBaseGalleryUI.I;
        if (mMViewPager != null) {
            mMViewPager.setEnableGalleryScale(false);
            snsBaseGalleryUI.I.setSingleMode(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageOCRStart", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public static /* synthetic */ android.widget.ImageView V6(com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        android.widget.ImageView imageView = snsBaseGalleryUI.f166817v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return imageView;
    }

    private void l7(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNeedTranslationImg", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (this.f166810o != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("alwaysShowImageTranslateMenu", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            boolean z18 = com.tencent.mm.plugin.scanner.k1.f158750b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("alwaysShowImageTranslateMenu", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            if (z18) {
                this.f166810o.setNeedTranslationImg(true);
            } else {
                this.f166810o.setNeedTranslationImg(z17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNeedTranslationImg", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void L0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enterTranslateStatus", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (gm0.j1.d().n() != 6 && gm0.j1.d().n() != 4) {
            db5.e1.s(this, getString(com.tencent.mm.R.string.f490500wu), "");
            l5();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterTranslateStatus", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        } else {
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
            if (snsInfoFlip != null) {
                snsInfoFlip.setEnableSingleClickOver(true);
            }
            this.f166813r = 1;
            m7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterTranslateStatus", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        }
    }

    public void W6(boolean z17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildFoot", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (this.f166802d) {
            com.tencent.mm.plugin.sns.ui.p3 p3Var = new com.tencent.mm.plugin.sns.ui.p3(this, i17, z17);
            this.f166805g = p3Var;
            p3Var.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.a9e));
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            this.f166805g.getBackground().setAlpha(50);
            this.f166806h.addView(this.f166805g, layoutParams);
            this.f166805g.setSnsSource(getIntent().getIntExtra("sns_source", 0));
            this.f166805g.setIsFromStarList(this.B);
            this.f166805g.setAlbumSessionId(this.C);
            this.f166805g.setCallBack(new com.tencent.mm.plugin.sns.ui.fe(this));
        } else {
            com.tencent.mm.plugin.sns.ui.o3 o3Var = new com.tencent.mm.plugin.sns.ui.o3(this, i17, z17);
            this.f166804f = o3Var;
            o3Var.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.a9e));
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
            this.f166804f.getBackground().setAlpha(50);
            this.f166806h.addView(this.f166804f, layoutParams2);
            this.f166804f.setSnsSource(getIntent().getIntExtra("sns_source", 0));
            this.f166804f.setIsFromStarList(this.B);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildFoot", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public boolean X6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancelImageOCR", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        i7();
        sy3.c cVar = this.f166801J;
        if (cVar != null) {
            if (((kz3.l) cVar).b(this.H)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelImageOCR", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelImageOCR", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return false;
    }

    public final boolean Y6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancelTranslate", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (this.f166813r == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentMediaObj", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
            r45.jj4 jj4Var = null;
            if (snsInfoFlip == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMediaObj", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            } else {
                r45.jj4 cntMedia = snsInfoFlip.getCntMedia();
                if (cntMedia == null) {
                    r45.m33 currentFlipItem = snsInfoFlip.getCurrentFlipItem();
                    if (currentFlipItem != null) {
                        jj4Var = currentFlipItem.f380109d;
                    }
                } else {
                    jj4Var = cntMedia;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMediaObj", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            }
            if (jj4Var != null) {
                com.tencent.mm.plugin.sns.model.i1.l(jj4Var);
            }
            com.tencent.mm.autogen.events.CancelScanTranslationEvent cancelScanTranslationEvent = new com.tencent.mm.autogen.events.CancelScanTranslationEvent();
            am.r1 r1Var = cancelScanTranslationEvent.f54027g;
            r1Var.f7757a = 1;
            r1Var.f7758b = this.f166821z;
            cancelScanTranslationEvent.e();
        }
        boolean isRunning = this.f166820y.isRunning();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetTranslateStatus", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        l5();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f166821z = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetTranslateStatus", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelTranslate", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return isRunning;
    }

    public void Z6(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doTranslateImage", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f166821z = (int) (c01.z1.r().hashCode() + java.lang.System.currentTimeMillis());
        dm.aa bj6 = ((com.tencent.mm.plugin.scanner.q0) ((com.tencent.mm.plugin.scanner.z) i95.n0.c(com.tencent.mm.plugin.scanner.z.class))).bj(str);
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.m2.c(this);
        if (bj6 != null && com.tencent.mm.vfs.w6.j(bj6.field_resultFile) && android.text.TextUtils.equals(c17, bj6.field_toLang)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsBaseGalleryUI", "trans result success path %s", bj6.field_resultFile);
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
            if (snsInfoFlip != null) {
                r45.m33 currentFlipItem = snsInfoFlip.getCurrentFlipItem();
                if (currentFlipItem != null) {
                    currentFlipItem.f380113h = true;
                    currentFlipItem.f380114i = bj6.field_resultFile;
                    if (this.f166810o.getGallery() != null && this.f166810o.getGallery().getAdapter() != null) {
                        this.f166810o.getGallery().getAdapter().notifyDataSetChanged();
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsBaseGalleryUI", "doTranslateImage item is null");
                }
            }
        } else {
            this.f166811p = this.f166810o;
            L0();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsBaseGalleryUI", "try to translate img %s, sessionId %d", str, java.lang.Integer.valueOf(this.f166821z));
            com.tencent.mm.autogen.events.ScanTranslationEvent scanTranslationEvent = new com.tencent.mm.autogen.events.ScanTranslationEvent();
            int e76 = e7();
            am.bt btVar = scanTranslationEvent.f54738g;
            btVar.f6282a = e76;
            btVar.f6284c = str;
            btVar.f6283b = this.f166821z;
            scanTranslationEvent.e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doTranslateImage", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public com.tencent.mm.plugin.sns.ui.o3 a7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFooter", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.o3 o3Var = this.f166804f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFooter", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return o3Var;
    }

    public void addView(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addView", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f166803e.addView(view, new android.widget.LinearLayout.LayoutParams(-1, -1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public com.tencent.mm.plugin.sns.ui.p3 b7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFooterNew", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.p3 p3Var = this.f166805g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFooterNew", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return p3Var;
    }

    public int c7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFromScene", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        int intExtra = getIntent().getIntExtra("key_from_scene", 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFromScene", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return intExtra;
    }

    public int d7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageOCRScene", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageOCRScene", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return 3;
    }

    public int e7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTranslationScene", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTranslationScene", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return 3;
    }

    public com.tencent.mm.plugin.sns.ui.c4 f7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gettitleManager", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.c4 c4Var = this.f166807i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gettitleManager", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return c4Var;
    }

    public boolean g7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTranslationImgEnable", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTranslationImgEnable", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return com.tencent.mm.R.layout.crv;
    }

    @Override // com.tencent.mm.plugin.sns.ui.n4
    public void h6(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUpdateTitle", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (!this.f166808m) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUpdateTitle", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            return;
        }
        setMMTitle(str);
        setMMSubTitle(str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUpdateTitle", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void h7(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFooterDetailClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFooterDetailClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public final void i7() {
        r45.jj4 cntMedia;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageOCREnd", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.setEnableSingleClickOver(true);
            this.f166810o.setShowLongClickMenu(true);
            com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar imgBottomBarView = this.f166810o.getImgBottomBarView();
            if (imgBottomBarView != null && (cntMedia = this.f166810o.getCntMedia()) != null) {
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip2 = this.f166810o;
                snsInfoFlip2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowPageControl", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                boolean z17 = snsInfoFlip2.A1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowPageControl", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                if (z17) {
                    imgBottomBarView.b(cntMedia, this.f166810o.getSnsId(), com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar.f166825d.a(c7()));
                }
            }
        }
        com.tencent.mm.ui.base.MMViewPager mMViewPager = this.I;
        if (mMViewPager != null) {
            mMViewPager.setEnableGalleryScale(true);
            this.I.setSingleMode(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageOCREnd", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void j7(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTranslateEnd", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTranslateEnd", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f3  */
    @Override // g04.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k5(java.lang.Object r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI.k5(java.lang.Object, java.lang.Object):void");
    }

    public boolean k7(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFlipViewListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (snsInfoFlip == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFlipViewListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            return false;
        }
        snsInfoFlip.setOnMenuShowListener(this.D);
        snsInfoFlip.setOnLongClickListener(this.F);
        snsInfoFlip.setOnMultiCodeListener(this.E);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("alwaysShowImageTranslateMenu", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        boolean z17 = com.tencent.mm.plugin.scanner.k1.f158750b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("alwaysShowImageTranslateMenu", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (z17) {
            l7(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFlipViewListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return true;
    }

    public void l5() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exitTranslateStatus", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.setEnableSingleClickOver(true);
        }
        this.f166813r = 0;
        o7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exitTranslateStatus", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void m7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startScanLineAnimation", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeScanLineAnimation", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f166817v.setVisibility(0);
        this.f166818w.setVisibility(0);
        this.f166819x.setVisibility(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeScanLineAnimation", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f166820y.setRepeatMode(1);
        this.f166820y.setRepeatCount(-1);
        this.f166820y.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startScanLineAnimation", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void n7(java.lang.String str, boolean z17) {
        android.graphics.Point point;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startWordDetectImage", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (com.tencent.mm.plugin.scanner.k1.e()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWordDetectImage", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            if (this.f166814s == null) {
                ((jd0.u1) ((kd0.h2) i95.n0.c(kd0.h2.class))).getClass();
                this.f166814s = new com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine(this);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                if (!(str == null || str.length() == 0) && com.tencent.mm.vfs.w6.j(str)) {
                    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    com.tencent.mm.graphics.e.d(str, options);
                    point = new android.graphics.Point(options.outWidth, options.outHeight);
                } else {
                    point = null;
                }
                if (point != null) {
                    if (((jd0.u2) ((kd0.z2) i95.n0.c(kd0.z2.class))).wi(point.x, point.y)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsBaseGalleryUI", "doWordDetectImage image overRatioLimit: %s", point);
                        ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).getClass();
                        boolean z18 = bz3.h.f36777d;
                        this.f166815t = 1;
                        q7(false, z18);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWordDetectImage", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                    }
                }
                ((com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine) this.f166814s).b(str, this);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWordDetectImage", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsBaseGalleryUI", "startWordDetectImage wordDetect not enable");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startWordDetectImage", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void o7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopScanLineAnimation", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterScanLineAnimation", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f166817v.setVisibility(8);
        this.f166818w.setVisibility(8);
        this.f166819x.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterScanLineAnimation", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f166820y.setRepeatMode(1);
        this.f166820y.setRepeatCount(0);
        this.f166820y.end();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopScanLineAnimation", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = this.f166816u;
        if (multiCodeMaskView == null || multiCodeMaskView.getVisibility() != 0) {
            super.onBackPressed();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        } else {
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
            this.f166816u.d(snsInfoFlip != null ? snsInfoFlip.H.longValue() : 0L, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        super.onConfigurationChanged(configuration);
        sy3.c cVar = this.f166801J;
        if (cVar != null) {
            ((kz3.l) cVar).d(configuration);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        super.onCreate(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useNew", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_USE_NEW_GALLERY_FOOTER_INT_SYNC, 0);
        if (r17 == 0) {
            r17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_enhance_like_gallery, 2);
        }
        if (r17 == 1) {
            this.f166802d = false;
        } else {
            this.f166802d = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useNew", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.model.l4.Cj().z(3, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prevView", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f166803e = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.hw8);
        this.f166806h = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cgi);
        com.tencent.mm.plugin.sns.ui.c4 c4Var = new com.tencent.mm.plugin.sns.ui.c4(this, this, c7());
        this.f166807i = c4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttach", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "onAttach");
        gm0.j1.i();
        gm0.j1.n().f273288b.a(218, c4Var);
        c4Var.C.alive();
        c4Var.D.alive();
        c4Var.E.alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttach", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.tencent.mm.plugin.sns.ui.c4 c4Var2 = this.f166807i;
        com.tencent.mm.plugin.sns.ui.se seVar = new com.tencent.mm.plugin.sns.ui.se(this);
        c4Var2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnMenuShowListener", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        c4Var2.f168105y = seVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnMenuShowListener", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        this.f166816u = (com.tencent.mm.plugin.scanner.MultiCodeMaskView) findViewById(com.tencent.mm.R.id.jun);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prevView", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (g7()) {
            this.f166817v = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ma_);
            this.f166818w = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ma9);
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ma7);
            this.f166819x = imageView;
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.bottomMargin += com.tencent.mm.ui.bk.j(this);
            this.f166819x.setLayoutParams(layoutParams);
            this.f166819x.setOnClickListener(new com.tencent.mm.plugin.sns.ui.oe(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initScanTransAnimator", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            this.f166817v = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ma_);
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f166820y = ofFloat;
            ofFloat.setDuration(5000L);
            this.f166820y.addListener(new com.tencent.mm.plugin.sns.ui.qe(this));
            this.f166820y.addUpdateListener(new com.tencent.mm.plugin.sns.ui.re(this, getWindowManager().getDefaultDisplay().getHeight()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initScanTransAnimator", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        }
        com.tencent.mm.plugin.sns.model.l4.Cj().c(this);
        this.B = getIntent().getBooleanExtra("INTENT_STAR_LIST", false);
        this.C = getIntent().getStringExtra("INTENT_ALBUM_COMMENT_SESSION_ID");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.c4 c4Var = this.f166807i;
        if (c4Var != null) {
            c4Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetach", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryTitleManager", "onDetach");
            gm0.j1.i();
            gm0.j1.n().f273288b.q(218, c4Var);
            c4Var.C.dead();
            c4Var.D.dead();
            c4Var.E.dead();
            n34.m3 m3Var = c4Var.B;
            m3Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroy", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
            kotlinx.coroutines.r2 r2Var = m3Var.f334682b;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            kotlinx.coroutines.z0.e(m3Var.f334681a, null, 1, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroy", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetach", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        }
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.h0();
            this.f166810o.Z();
            this.f166810o.Y();
        }
        com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = this.f166816u;
        if (multiCodeMaskView != null) {
            multiCodeMaskView.a();
        }
        if (g7()) {
            l5();
        }
        gm0.j1.n().d(this.Q);
        this.P.dead();
        com.tencent.mm.plugin.sns.model.l4.Cj().v(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsBaseGalleryUI", "[%s][media:%s]onImageFinish result:%b", "[image-flow]", str, java.lang.Boolean.valueOf(z17));
        if (this.f166810o != null && z17 && !com.tencent.mm.sdk.platformtools.t8.K0(str) && str.equals(this.f166810o.getSelectedMediaId())) {
            n7(com.tencent.mm.plugin.sns.model.i1.l(this.f166810o.getCntMedia()), false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.b0();
        }
        com.tencent.mm.plugin.sns.ui.c4 c4Var = this.f166807i;
        if (c4Var != null) {
            c4Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            if (c4Var.f168103w != null) {
                com.tencent.mm.autogen.events.CancelDealQBarStrEvent cancelDealQBarStrEvent = new com.tencent.mm.autogen.events.CancelDealQBarStrEvent();
                android.app.Activity activity = (android.app.Activity) c4Var.f168087d;
                am.p1 p1Var = cancelDealQBarStrEvent.f54025g;
                p1Var.f7594b = activity;
                p1Var.f7593a = c4Var.f168103w.f158619d;
                cancelDealQBarStrEvent.e();
                c4Var.f168103w = null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        }
        super.onPause();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.o3 o3Var;
        com.tencent.mm.plugin.sns.ui.p3 p3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        super.onResume();
        boolean z17 = this.f166802d;
        if (z17 && (p3Var = this.f166805g) != null) {
            p3Var.f();
        } else if (!z17 && (o3Var = this.f166804f) != null) {
            o3Var.f();
        }
        if (g7()) {
            gm0.j1.n().a(this.Q);
            this.M.alive();
            this.P.alive();
            this.N.alive();
        }
        k7(this.f166810o);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        super.onStop();
        this.M.dead();
        this.N.dead();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void p7() {
        com.tencent.mm.plugin.sns.ui.o3 o3Var;
        com.tencent.mm.plugin.sns.ui.p3 p3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("titleBarGone", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f166809n = false;
        setTitleVisibility(8);
        boolean z17 = this.f166802d;
        if (z17 && (p3Var = this.f166805g) != null) {
            p3Var.setVisibility(8);
        } else if (!z17 && (o3Var = this.f166804f) != null) {
            o3Var.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("titleBarGone", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.ak
    public void q6(r45.jj4 jj4Var, int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageChange", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f166815t = 0;
        if (jj4Var.f377856e == 2) {
            if (i17 != this.A) {
                l7(false);
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
                if (snsInfoFlip != null) {
                    snsInfoFlip.setNeedOCRImg(false);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                this.f166821z = 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            }
            this.A = i17;
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
            if (k17 != null && !k17.isWaitPost()) {
                n7(com.tencent.mm.plugin.sns.model.i1.l(jj4Var), false);
                yc4.b0.f460839a.c(ca4.z0.t0(k17.field_snsId), i17 + 1);
            }
        } else {
            l7(false);
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip2 = this.f166810o;
            if (snsInfoFlip2 != null) {
                snsInfoFlip2.setNeedOCRImg(false);
            }
        }
        if (f7() != null) {
            com.tencent.mm.plugin.sns.ui.c4 f76 = f7();
            f76.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageChanged", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            f76.f168098r = false;
            f76.f168099s = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageChanged", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        }
        com.tencent.mm.plugin.sns.ui.te teVar = this.G;
        if (teVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGalleryPageChange", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$initFlipView$3");
            java.lang.String Id = jj4Var.f377855d;
            kotlin.jvm.internal.o.f(Id, "Id");
            com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI = ((td4.o0) teVar).f417713a;
            java.util.ArrayList mediaObjList = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI.r7(snsAlbumPickerPreviewUI);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isMediaObjSelected", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            kotlin.jvm.internal.o.g(mediaObjList, "mediaObjList");
            boolean contains = mediaObjList.contains(Id);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMediaObjSelected", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            snsAlbumPickerPreviewUI.z7(contains);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(i17 + 1);
            sb6.append('/');
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getFlipView$p$s973405815", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip3 = snsAlbumPickerPreviewUI.f166810o;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getFlipView$p$s973405815", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            sb6.append(snsInfoFlip3.getCount());
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updateCurrentPageTitleText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCurrentPageTitleText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            snsAlbumPickerPreviewUI.f170225y1 = sb7;
            snsAlbumPickerPreviewUI.h6(sb7, "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCurrentPageTitleText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updateCurrentPageTitleText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            java.lang.String Id2 = jj4Var.f377855d;
            kotlin.jvm.internal.o.f(Id2, "Id");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMCurrentMediaId$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            snsAlbumPickerPreviewUI.f170221p1 = Id2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMCurrentMediaId$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGalleryPageChange", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$initFlipView$3");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageChange", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public final void q7(boolean z17, boolean z18) {
        com.tencent.mm.ui.base.MMViewPager mMViewPager;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateWordDetectStatus", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            if (z18) {
                snsInfoFlip.setNeedOCRImg(true);
            }
            if (z17 || z18) {
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip2 = this.f166810o;
                snsInfoFlip2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowingBottomSheet", "com.tencent.mm.plugin.sns.ui.FlipView");
                wd4.l1 l1Var = snsInfoFlip2.f166290u;
                boolean z19 = l1Var != null && l1Var.g();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowingBottomSheet", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (z19) {
                    com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip3 = this.f166810o;
                    snsInfoFlip3.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    if (snsInfoFlip3.f167202p0 == null || (mMViewPager = snsInfoFlip3.W) == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    } else {
                        try {
                            r45.m33 m17 = snsInfoFlip3.f167202p0.m(mMViewPager.getCurrentItem());
                            r45.jj4 jj4Var = m17.f380109d;
                            snsInfoFlip3.x(jj4Var, com.tencent.mm.plugin.sns.model.i1.l(jj4Var), m17.f380110e, jj4Var.f377855d, 1);
                        } catch (java.lang.Exception unused) {
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    }
                }
            }
            j7(z17, z18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateWordDetectStatus", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void s3(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.n4
    public void y0() {
        com.tencent.mm.plugin.sns.ui.o3 o3Var;
        com.tencent.mm.plugin.sns.ui.p3 p3Var;
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView selectLivePhotoView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toggleTitleBar", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (!this.f166808m) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toggleTitleBar", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            return;
        }
        setTitleVisibility(this.f166809n ? 8 : 0);
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null && (selectLivePhotoView = snsInfoFlip.getSelectLivePhotoView()) != null) {
            int i17 = this.f166809n ? 8 : 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toggleGalleryTitle", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            selectLivePhotoView.m("toggleGalleryTitle >> " + i17);
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.q(selectLivePhotoView, selectLivePhotoView.f169208z, selectLivePhotoView.A, false, null, 8, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toggleGalleryTitle", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        }
        boolean z17 = this.f166802d;
        if (z17 && (p3Var = this.f166805g) != null) {
            p3Var.setVisibility(this.f166809n ? 8 : 0);
        } else if (!z17 && (o3Var = this.f166804f) != null) {
            o3Var.setVisibility(this.f166809n ? 8 : 0);
        }
        this.f166809n = !this.f166809n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toggleTitleBar", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void y1(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (!this.f166808m || com.tencent.mm.plugin.sns.model.l4.Xj()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
        if (k17 == null || k17.field_snsId == 0) {
            enableOptionMenu(false);
        } else {
            enableOptionMenu(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }
}
