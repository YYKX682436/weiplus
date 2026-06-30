package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsUIAction extends fe0.s4 implements com.tencent.mm.plugin.sns.model.h0, com.tencent.mm.plugin.sns.model.v7 {
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public boolean P;
    public n30.v Q;
    private android.view.View actionbarView;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f167483d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMOverScrollView f167484e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.c3 f167485f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f167487h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f167488i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f167489m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f167490n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.LoadingMoreView f167491o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsHeader f167492p;

    /* renamed from: v, reason: collision with root package name */
    public final android.app.Activity f167498v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.tt f167499w;

    /* renamed from: x, reason: collision with root package name */
    public int f167500x;

    /* renamed from: y, reason: collision with root package name */
    public int f167501y;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.widget.z2 f167486g = new com.tencent.mm.plugin.sns.ui.widget.z2();

    /* renamed from: q, reason: collision with root package name */
    public int f167493q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f167494r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f167495s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f167496t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f167497u = false;

    /* renamed from: z, reason: collision with root package name */
    public int f167502z = 0;
    public float A = 1.0f;
    public float B = 1.0f;
    public int C = 0;
    public int D = 0;
    public int E = 0;
    public final boolean F = true;
    public boolean G = false;
    public boolean H = false;
    public final java.util.ArrayList I = new java.util.ArrayList();

    /* renamed from: J, reason: collision with root package name */
    public final wu5.b f167482J = new com.tencent.mm.plugin.sns.ui.pt(this);
    public final n52.d R = new com.tencent.mm.plugin.sns.ui.jt(this);

    public SnsUIAction(android.app.Activity activity) {
        this.f167498v = activity;
    }

    public static /* synthetic */ android.app.Activity a(com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        android.app.Activity activity = snsUIAction.f167498v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return activity;
    }

    public static /* synthetic */ boolean b(com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        boolean z17 = snsUIAction.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return z17;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.tt c(com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mm.plugin.sns.ui.tt ttVar = snsUIAction.f167499w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return ttVar;
    }

    public static /* synthetic */ java.lang.String d(com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        java.lang.String str = snsUIAction.L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return str;
    }

    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bottomLoadData", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsActivity", "bottomLoad  isAll: %s, isLoading:%s", java.lang.Boolean.valueOf(this.f167495s), java.lang.Boolean.valueOf(this.f167496t));
        if (!this.f167495s && this.f167496t) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsActivity", "bottomLoadData: stack=%s", new com.tencent.mm.sdk.platformtools.z3());
        }
        if (!this.f167495s && !this.f167496t) {
            this.f167496t = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadingMore", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsActivity", "loadingMore: ");
            com.tencent.mm.plugin.sns.ui.iv ivVar = (com.tencent.mm.plugin.sns.ui.iv) this.f167499w;
            ivVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoadingMore", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "onLoadingMore: ");
            com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = ivVar.f169448a;
            if (com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI) == null || !com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).M()) {
                if (com.tencent.mm.plugin.sns.ui.SnsUserUI.c7(snsUserUI) == null) {
                    com.tencent.mm.plugin.sns.model.d6 Kj = com.tencent.mm.plugin.sns.model.l4.Kj();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    snsUserUI.f167598g = Kj;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "onLoadingMore: doNpList");
                ivVar.a();
                com.tencent.mm.plugin.sns.model.d6 c76 = com.tencent.mm.plugin.sns.ui.SnsUserUI.c7(snsUserUI);
                ivVar.a();
                java.lang.String U6 = com.tencent.mm.plugin.sns.ui.SnsUserUI.U6(snsUserUI);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                boolean z18 = snsUserUI.f167601m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                c76.f(2, U6, z18, com.tencent.mm.plugin.sns.ui.SnsUserUI.Y6(snsUserUI), com.tencent.mm.plugin.sns.ui.SnsUserUI.b7(snsUserUI));
                com.tencent.mm.sdk.platformtools.n3 Tj = com.tencent.mm.plugin.sns.model.l4.Tj();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                java.lang.Runnable runnable = snsUserUI.M;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                Tj.postDelayed(runnable, 3000L);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "onLoadingMore: doOtherList");
                com.tencent.mm.plugin.sns.model.d6 c77 = com.tencent.mm.plugin.sns.ui.SnsUserUI.c7(snsUserUI);
                ivVar.a();
                c77.g(2, com.tencent.mm.plugin.sns.ui.SnsUserUI.U6(snsUserUI), 2, com.tencent.mm.plugin.sns.ui.SnsUserUI.Y6(snsUserUI), 0L, com.tencent.mm.plugin.sns.ui.SnsUserUI.b7(snsUserUI));
                com.tencent.mm.plugin.sns.ui.SnsUserUI.d7(snsUserUI, 2);
            }
            if (com.tencent.mm.plugin.sns.ui.SnsUserUI.e7(snsUserUI) != null) {
                com.tencent.mm.plugin.sns.ui.SnsUIAction e76 = com.tencent.mm.plugin.sns.ui.SnsUserUI.e7(snsUserUI);
                e76.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDownLoadingAnimation", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                com.tencent.mm.plugin.sns.ui.LoadingMoreView loadingMoreView = e76.f167491o;
                if (loadingMoreView != null) {
                    loadingMoreView.c();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownLoadingAnimation", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoadingMore", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadingMore", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bottomLoadData", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return true;
    }

    public final void f(android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSightCapture", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult = (com.tencent.mm.plugin.mmsight.SightCaptureResult) intent.getParcelableExtra("key_req_result");
        if (sightCaptureResult == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSightCapture", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            return;
        }
        if (sightCaptureResult.f148807e) {
            java.lang.String str = sightCaptureResult.f148815p;
            this.f167490n = str;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f167497u = true;
                i(intent);
            }
        } else {
            java.lang.String str2 = sightCaptureResult.f148809g;
            java.lang.String str3 = sightCaptureResult.f148810h;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsActivity", "video path %s thumb path ", str2, str3);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("KSightPath", str2);
            intent2.putExtra("KSightThumbPath", str3);
            intent2.putExtra("key_extra_data", intent.getBundleExtra("key_extra_data"));
            java.lang.String str4 = sightCaptureResult.f148812m;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                intent2.putExtra("sight_md5", com.tencent.mm.vfs.w6.p(str2));
            } else {
                intent2.putExtra("sight_md5", str4);
            }
            intent2.putExtra("KSnsPostManu", true);
            intent2.putExtra("KSnsFrom", 17);
            intent2.putExtra("KTouchCameraTime", com.tencent.mm.sdk.platformtools.t8.i1());
            intent2.putExtra("Ksnsupload_type", 14);
            intent2.putExtra("Kis_take_photo", false);
            intent2.putExtra("KSessionID", intent.getStringExtra("KSessionID"));
            com.tencent.mm.plugin.sns.model.g6.f164210a.c(str2, intent.getBundleExtra("key_extra_data"), "key_edit_safe_strategy_emotion_info_list");
            if (this.H) {
                intent2.putExtra("KSnsFromMultiTab", true);
            }
            try {
                byte[] byteArray = sightCaptureResult.f148814o.toByteArray();
                if (byteArray != null) {
                    intent2.putExtra("KMMSightExtInfo", byteArray);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsActivity", "put sight extinfo to snsuploadui error: %s", e17.getMessage());
            }
            j45.l.j(this.f167498v, "sns", ".ui.SnsUploadUI", intent2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSightCapture", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    public final android.widget.BaseAdapter g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        if (this.f167498v == null || this.f167492p == null || this.actionbarView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return null;
    }

    public android.widget.ListView getSnsListView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsListView", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mm.plugin.sns.ui.iv ivVar = (com.tencent.mm.plugin.sns.ui.iv) this.f167499w;
        ivVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsListView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        android.widget.ListView listView = (android.widget.ListView) ivVar.f169448a.findViewById(com.tencent.mm.R.id.f487038na4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsListView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsListView", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return listView;
    }

    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAtBottom", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        android.widget.ListView listView = this.f167483d;
        android.view.View childAt = listView.getChildAt(listView.getChildCount() - 1);
        if (childAt == null || childAt.getBottom() > this.f167483d.getHeight() || this.f167483d.getLastVisiblePosition() != this.f167483d.getAdapter().getCount() - 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAtBottom", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAtBottom", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return true;
    }

    public final void i(android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToUploadUI", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.sns.ui.ct(this));
        java.lang.String str = this.f167490n;
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToUploadUI", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            return;
        }
        dw3.c0 c0Var = dw3.c0.f244182a;
        c0Var.y(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pre_temp_sns_pic");
        sb6.append(kk.k.g((this.f167490n + java.lang.System.currentTimeMillis()).getBytes()));
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.storage.m2.J0(com.tencent.mm.plugin.sns.model.l4.Ni(), this.f167490n, sb7);
        c0Var.k(this.f167490n);
        this.f167490n = com.tencent.mm.plugin.sns.model.l4.Ni() + sb7;
        int intExtra = intent != null ? intent.getIntExtra("CropImage_filterId", 0) : 0;
        android.content.Intent intent2 = new android.content.Intent(this.f167498v, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsUploadUI.class);
        intent2.putExtra("KSnsPostManu", true);
        intent2.putExtra("KTouchCameraTime", com.tencent.mm.sdk.platformtools.t8.i1());
        intent2.putExtra("sns_kemdia_path", this.f167490n);
        intent2.putExtra("KFilterId", intExtra);
        if (this.f167497u) {
            intent2.putExtra("Kis_take_photo", true);
            intent2.putExtra("KSnsFrom", 17);
        }
        if (this.P) {
            intent2.putExtra("Ksnsupload_source", 11);
        }
        if (this.H) {
            intent2.putExtra("KSnsFromMultiTab", true);
        }
        intent2.putExtra("KSessionID", intent.getStringExtra("KSessionID"));
        intent2.putExtra("key_extra_data", intent.getBundleExtra("key_extra_data"));
        android.app.Activity activity = this.f167498v;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(6);
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsUIAction", "jumpToUploadUI", "(Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        this.f167497u = false;
        this.H = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToUploadUI", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    public void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadSnsUserDateInfo", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mm.plugin.sns.ui.tt ttVar = this.f167499w;
        if (ttVar != null) {
            ((com.tencent.mm.plugin.sns.ui.iv) ttVar).a();
            com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.ui.ft(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadSnsUserDateInfo", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x041f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(int r29, int r30, android.content.Intent r31) {
        /*
            Method dump skipped, instructions count: 1644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsUIAction.k(int, int, android.content.Intent):void");
    }

    public void l(boolean z17) {
        com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView snsStoryHeaderView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        android.app.Activity activity = this.f167498v;
        activity.getWindowManager().getDefaultDisplay().getHeight();
        com.tencent.mm.plugin.sns.model.l4.hj().m0();
        android.view.View view = this.actionbarView;
        if (view != null) {
        }
        n30.t tVar = (n30.t) i95.n0.c(n30.t.class);
        n52.d dVar = this.R;
        n30.u uVar = n30.u.f334471e;
        ((m30.q) tVar).getClass();
        this.Q = new n52.c(dVar, "SnsTimelineUI", uVar);
        com.tencent.mm.plugin.sns.ui.iv ivVar = (com.tencent.mm.plugin.sns.ui.iv) this.f167499w;
        ivVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsListView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        android.widget.ListView listView = (android.widget.ListView) ivVar.f169448a.findViewById(com.tencent.mm.R.id.f487038na4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsListView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        this.f167483d = listView;
        listView.post(new com.tencent.mm.plugin.sns.ui.kt(this));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("list is null ? ");
        sb6.append(this.f167483d != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsActivity", sb6.toString());
        this.f167483d.setScrollingCacheEnabled(false);
        com.tencent.mm.plugin.sns.ui.jj jjVar = new com.tencent.mm.plugin.sns.ui.jj(activity);
        this.f167492p = jjVar;
        jjVar.setSessionId(null);
        this.f167492p.setEnterObjectId(null);
        this.f167492p.setIsCoverPreview(!z17);
        this.f167492p.setBackClickListener(new com.tencent.mm.plugin.sns.ui.lt(this));
        com.tencent.mm.plugin.sns.ui.iv ivVar2 = (com.tencent.mm.plugin.sns.ui.iv) this.f167499w;
        ivVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRootBgView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        android.view.View findViewById = ivVar2.f169448a.findViewById(com.tencent.mm.R.id.chq);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRootBgView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        this.f167488i = findViewById;
        com.tencent.mm.plugin.sns.ui.iv ivVar3 = (com.tencent.mm.plugin.sns.ui.iv) this.f167499w;
        ivVar3.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaskView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        android.view.View findViewById2 = ivVar3.f169448a.findViewById(com.tencent.mm.R.id.n7r);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaskView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        this.f167489m = findViewById2;
        this.f167491o = new com.tencent.mm.plugin.sns.ui.LoadingMoreView(activity);
        this.f167483d.addHeaderView(this.f167492p);
        this.f167483d.addFooterView(this.f167491o);
        this.f167483d.setOnScrollListener(new com.tencent.mm.plugin.sns.ui.mt(this));
        com.tencent.mm.plugin.sns.ui.iv ivVar4 = (com.tencent.mm.plugin.sns.ui.iv) this.f167499w;
        ivVar4.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsPushDownView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        com.tencent.mm.ui.base.MMOverScrollView mMOverScrollView = (com.tencent.mm.ui.base.MMOverScrollView) ivVar4.f169448a.findViewById(com.tencent.mm.R.id.nah);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsPushDownView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        this.f167484e = mMOverScrollView;
        com.tencent.mm.plugin.sns.ui.widget.c3 c3Var = new com.tencent.mm.plugin.sns.ui.widget.c3(mMOverScrollView.getViewProvider());
        this.f167485f = c3Var;
        boolean z18 = this.F && w94.a.f444075a.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPullDownOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        c3Var.f171100d = z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPullDownOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        com.tencent.mm.plugin.sns.ui.widget.c3 c3Var2 = this.f167485f;
        c3Var2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnScrollCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        com.tencent.mm.plugin.sns.ui.widget.z2 z2Var = this.f167486g;
        c3Var2.f171102f = z2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnScrollCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        this.f167484e.setScrollConsumer(this.f167485f);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("pullDownView is null ? ");
        sb7.append(this.f167484e != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsActivity", sb7.toString());
        this.f167484e.setAtBottomCallBack(new com.tencent.mm.plugin.sns.ui.nt(this));
        this.f167484e.setAtTopCallBack(new com.tencent.mm.plugin.sns.ui.ot(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        this.f167487h = activity.getIntent().getStringExtra("sns_title");
        this.f167492p.j(com.tencent.mm.sdk.platformtools.t8.K0(this.L) ? this.K : this.L, this.K, this.M, this.N);
        com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = this.f167492p;
        ((com.tencent.mm.plugin.sns.ui.iv) this.f167499w).a();
        snsHeader.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setType", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        snsHeader.f167180v = this.f167485f;
        snsHeader.f167181w = this.f167483d;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) ((android.view.ViewGroup) this.f167484e.getParent()).getLayoutParams();
        if (marginLayoutParams != null) {
            snsHeader.f167165d.f168192i.setExternalMargin(marginLayoutParams.topMargin);
        }
        com.tencent.mm.plugin.sns.ui.ui uiVar = new com.tencent.mm.plugin.sns.ui.ui(snsHeader);
        z2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("add", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
        java.util.LinkedList linkedList = z2Var.f171327a;
        if (!linkedList.contains(uiVar)) {
            linkedList.add(uiVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("add", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout snsCoverContainerLayout = snsHeader.f167165d.f168192i;
        com.tencent.mm.plugin.sns.ui.widget.c3 c3Var3 = snsHeader.f167180v;
        c3Var3.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPullDownOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        boolean z19 = c3Var3.f171100d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPullDownOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        boolean z27 = true ^ z19;
        snsCoverContainerLayout.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showTopMask", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        if (!z27) {
            snsCoverContainerLayout.removeView(snsCoverContainerLayout.f164001g);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showTopMask", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        snsHeader.f167171m = 2;
        com.tencent.mm.plugin.sns.ui.dj djVar = snsHeader.f167165d;
        if (djVar != null && (snsStoryHeaderView = djVar.f168188e) != null && !snsHeader.f167179u) {
            snsStoryHeaderView.setSnsType(2);
        }
        snsHeader.f167165d.getClass();
        com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView snsStoryHeaderView2 = snsHeader.f167165d.f168188e;
        if (snsStoryHeaderView2 != null && snsStoryHeaderView2.getParent() != null && (snsHeader.f167165d.f168188e.getParent() instanceof android.view.ViewGroup)) {
            ((android.view.ViewGroup) snsHeader.f167165d.f168188e.getParent()).removeView(snsHeader.f167165d.f168188e);
        }
        snsHeader.f167165d.f168190g.setPadding(0, com.tencent.mm.ui.bl.a(snsHeader.f167170i) + com.tencent.mm.ui.bl.c(snsHeader.f167170i) + com.tencent.mm.ui.zk.a(snsHeader.getContext(), 90) + com.tencent.mm.ui.zk.a(snsHeader.getContext(), 48), 0, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setType", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader2 = this.f167492p;
        com.tencent.mm.plugin.sns.ui.iv ivVar5 = (com.tencent.mm.plugin.sns.ui.iv) this.f167499w;
        ivVar5.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionBar", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        android.view.View findViewById3 = ivVar5.f169448a.findViewById(com.tencent.mm.R.id.f482435ei);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionBar", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        snsHeader2.setActionBarView(findViewById3);
        updateBackView(com.tencent.mm.plugin.sns.model.l4.Bj().L0(com.tencent.mm.sdk.platformtools.t8.K0(this.L) ? this.K : this.L));
        j();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initDragDropEvent", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        new com.tencent.mm.plugin.sns.ui.ht(this).run();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDragDropEvent", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mm.plugin.sns.model.l4.Nj().b(this);
        com.tencent.mm.plugin.sns.model.l4.Cj().c(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    public void m(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        ((com.tencent.mm.plugin.sns.ui.iv) this.f167499w).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    public void n(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onIsDownAll", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        this.f167491o.b(0, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onIsDownAll", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    public boolean o(int i17, int i18) {
        boolean z17;
        int i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        gm0.j1.i();
        boolean l17 = gm0.j1.u().l();
        android.app.Activity activity = this.f167498v;
        if (!l17) {
            db5.t7.k(activity, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            return false;
        }
        if (i17 == 2) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(dm.i4.COL_USERNAME, this.K);
            intent.setClass(activity, com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI.class);
            android.app.Activity activity2 = this.f167498v;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(7);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsUIAction", "selectPhoto", "(II)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            return true;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.SnsUIAction$$a snsUIAction$$a = new com.tencent.mm.plugin.sns.ui.SnsUIAction$$a(this, i17, i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowWelcomeTipsBeforeSelectPhoto", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            gm0.j1.i();
            int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(68385, null), 0);
            gm0.j1.i();
            int j18 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(68386, null), 0);
            if (this.f167494r || j17 >= 3 || j18 != 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowWelcomeTipsBeforeSelectPhoto", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                z17 = false;
            } else {
                this.f167494r = true;
                com.tencent.mm.plugin.sns.ui.rv.a(activity, new com.tencent.mm.plugin.sns.ui.dt(this, snsUIAction$$a));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowWelcomeTipsBeforeSelectPhoto", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                return true;
            }
            if (activity.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getString("gallery", "1").equalsIgnoreCase("0")) {
                com.tencent.mm.pluginsdk.ui.tools.l7.h(activity, 2, null);
            } else {
                int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsCanPickVideoFromAlbum", 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsActivity", "takeVideo %d", java.lang.Integer.valueOf(b17));
                boolean z18 = x51.o1.f452042a;
                int i27 = (b17 != 1 && b17 == 0) ? 1 : 3;
                android.content.Intent intent2 = new android.content.Intent();
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_enable_vlog, false);
                ((uy0.h) i95.n0.c(uy0.h.class)).getClass();
                boolean h17 = ez0.o.f257835a.h();
                boolean a17 = pc4.e.f353426a.a();
                intent2.putExtra("Gallery_LivePhoto_Need_Query", a17);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsActivity", "enableSnsTemplate:%b, canPostLivePhoto:%b", java.lang.Boolean.valueOf(h17), java.lang.Boolean.valueOf(a17));
                if (h17) {
                    i19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_publish_template_media_num, 20);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + i19);
                } else {
                    i19 = 9;
                }
                int i28 = i19;
                intent2.putExtra("key_can_select_video_and_pic", !(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || fj6 || h17));
                intent2.putExtra("key_edit_video_max_time_length", d11.s.fj().nj().f71195h);
                intent2.putExtra("key_sns_publish_template", h17);
                intent2.putExtra("key_filter_hdr_video", h17);
                if (activity instanceof com.tencent.mm.plugin.sns.ui.SnsUserUI) {
                    intent2.putExtra("gallery_report_tag", 17);
                } else {
                    intent2.putExtra("gallery_report_tag", 4);
                }
                intent2.putExtra("key_check_third_party_video", true);
                intent2.putExtra("KSnsFrom", i18);
                intent2.putExtra("record_video_is_sight_capture", true);
                com.tencent.mm.pluginsdk.ui.tools.l7.c(this.f167498v, 14, i28, 4, i27, com.tencent.mm.plugin.sns.ui.ws.a(), intent2);
                if (com.tencent.mm.plugin.sns.ui.ws.a()) {
                    activity.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        ((com.tencent.mm.plugin.sns.ui.iv) this.f167499w).a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    @Override // com.tencent.mm.plugin.sns.model.v7
    public void onPostEnd(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mm.plugin.sns.ui.iv ivVar = (com.tencent.mm.plugin.sns.ui.iv) this.f167499w;
        ivVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = ivVar.f169448a;
        if (com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI) != null) {
            com.tencent.mm.plugin.sns.ui.so T6 = com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI);
            T6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            com.tencent.mm.plugin.sns.ui.vo voVar = T6.G;
            if (voVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                com.tencent.mm.plugin.sns.storage.SnsInfo i18 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(i17);
                if (i18 == null || i18.getTimeLine().ContentObj == null || voVar.f170699d.size() <= 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                } else {
                    boolean z18 = false;
                    int i19 = 0;
                    while (true) {
                        if (i19 >= voVar.f170699d.size()) {
                            break;
                        }
                        if (((com.tencent.mm.plugin.sns.storage.SnsInfo) voVar.f170699d.get(i19)).getLocalid() == i18.getLocalid()) {
                            voVar.f170699d.remove(i19);
                            z18 = true;
                            break;
                        }
                        i19++;
                    }
                    if (z18) {
                        voVar.f170699d.add(i18);
                        voVar.f();
                        voVar.e();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String mediaId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        ka4.m mVar = ka4.m.f306136a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaIdToPredictAfterLoadThumb", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        ka4.o oVar = ka4.o.f306149a;
        if (oVar.a()) {
            boolean z17 = true;
            if (oVar.c() == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "setMediaIdToPredictAfterLoadThumb ".concat(mediaId));
                java.util.HashSet hashSet = ka4.m.f306140e;
                if (hashSet.contains(mediaId)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "media is predicted");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaIdToPredictAfterLoadThumb", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                } else {
                    hashSet.add(mediaId);
                    java.lang.String str = (java.lang.String) ka4.m.f306139d.get(mediaId);
                    if (str != null && str.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SnsKaraOptionConfig", "mediaIdToSnsId no have sns ".concat(mediaId));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaIdToPredictAfterLoadThumb", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    } else {
                        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new ka4.k(str, null), 2, null);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaIdToPredictAfterLoadThumb", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "setMediaIdToPredictAfterLoadThumb >> is no to predict");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaIdToPredictAfterLoadThumb", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    public void p(boolean z17) {
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchPullDownMode", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsActivity", "switchPullDownMode %b", java.lang.Boolean.valueOf(z17));
        this.G = z17;
        if (z17) {
            com.tencent.mm.ui.base.MMOverScrollView mMOverScrollView = this.f167484e;
            if (mMOverScrollView != null) {
                mMOverScrollView.setEnableGesture(false);
            }
            com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = this.f167492p;
            snsHeader.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchPullDownMode", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            com.tencent.mm.plugin.sns.ui.dj djVar = snsHeader.f167165d;
            if (djVar != null && (linearLayout2 = djVar.f168190g) != null && djVar.f168189f != null) {
                linearLayout2.setVisibility(0);
                snsHeader.f167165d.f168189f.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchPullDownMode", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        } else {
            com.tencent.mm.ui.base.MMOverScrollView mMOverScrollView2 = this.f167484e;
            if (mMOverScrollView2 != null) {
                mMOverScrollView2.setEnableGesture(true);
            }
            com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader2 = this.f167492p;
            snsHeader2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchHeaderMode", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            com.tencent.mm.plugin.sns.ui.dj djVar2 = snsHeader2.f167165d;
            if (djVar2 != null && (linearLayout = djVar2.f168190g) != null && djVar2.f168189f != null) {
                linearLayout.setVisibility(4);
                snsHeader2.f167165d.f168189f.setVisibility(0);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchHeaderMode", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchPullDownMode", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }

    @Override // com.tencent.mm.plugin.sns.model.v7
    public void updateBackView(com.tencent.mm.plugin.sns.storage.x1 x1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBackView", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = this.f167492p;
        if (snsHeader != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBackView", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsHeader", "loadCover:%s", x1Var.toString());
            if (pc4.d.f353410a.y()) {
                snsHeader.postDelayed(new com.tencent.mm.plugin.sns.ui.ri(snsHeader), 500L);
            } else {
                snsHeader.f167180v.h();
                snsHeader.f167165d.f168192i.a();
            }
            snsHeader.f167168g = x1Var;
            snsHeader.f167169h = x1Var.field_snsBgId;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCoverInvalid", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            com.tencent.mm.plugin.sns.storage.x1 x1Var2 = snsHeader.f167168g;
            if (x1Var2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCoverInvalid", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            } else if (snsHeader.f167174p) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(x1Var2.T) && !com.tencent.mm.sdk.platformtools.t8.D0(snsHeader.f167168g.T, "0")) {
                    r7 = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCoverInvalid", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            } else {
                r7 = x1Var2.field_snsBgId == 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCoverInvalid", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            }
            snsHeader.f167175q = r7;
            if (r7) {
                com.tencent.mm.plugin.sns.ui.widget.c3 c3Var = snsHeader.f167180v;
                c3Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPullDownOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                c3Var.f171100d = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPullDownOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            }
            snsHeader.k();
            snsHeader.f167165d.f168192i.d(x1Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBackView", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBackView", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
    }
}
