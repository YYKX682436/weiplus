package uj3;

/* loaded from: classes14.dex */
public final class p extends uj3.v0 {
    public android.widget.FrameLayout G;
    public android.widget.RelativeLayout H;
    public uj3.b1 I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.xweb.p1 f428335J;
    public int K;
    public boolean L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String P;
    public int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.K = -1;
        this.Q = -1;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.HashSet hashSet3 = new java.util.HashSet();
        hashSet.add(java.lang.Integer.valueOf(new int[]{1}[0]));
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.ibq);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        hashSet2.add(new uj3.j[]{new uj3.j(string, 8)}[0]);
        int[] iArr = {9, 10};
        for (int i17 = 0; i17 < 2; i17++) {
            hashSet3.add(java.lang.Integer.valueOf(iArr[i17]));
        }
        setScreenFuncConfig(new uj3.k(hashSet, hashSet2, hashSet3, 2));
        android.view.LayoutInflater.from(getContext()).inflate(getLayoutId(), this);
        this.H = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.mbm);
        setMReadyLayout((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.mbi));
        setMEditLayout((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.mbl));
        setBottomRoot((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.mbe));
        setTopRoot((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.mbj));
        setAvatarRoot((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.mbk));
        this.G = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.mbn);
        android.widget.RelativeLayout relativeLayout = this.H;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        android.widget.FrameLayout mEditLayout = getMEditLayout();
        if (mEditLayout != null) {
            mEditLayout.setVisibility(8);
        }
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        setMultiTalkStrokeContext(new uj3.c(context2, this, getScreenFuncConfig()));
        uj3.c multiTalkStrokeContext = getMultiTalkStrokeContext();
        if (multiTalkStrokeContext != null) {
            multiTalkStrokeContext.f428251j = new uj3.l(this);
        }
        android.content.Context context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        setTopUiLayout(new uj3.f1(context3, this));
        android.content.Context context4 = getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        setAvatarLayout(new uj3.b0(context4, this));
        android.content.Context context5 = getContext();
        kotlin.jvm.internal.o.f(context5, "getContext(...)");
        setBottomUiLayout(new uj3.l0(context5, this, getScreenFuncConfig()));
        android.content.Context context6 = getContext();
        kotlin.jvm.internal.o.f(context6, "getContext(...)");
        this.I = new uj3.b1(context6, this);
        android.content.Context context7 = getContext();
        kotlin.jvm.internal.o.f(context7, "getContext(...)");
        setReadyUI(new uj3.j1(context7, this, getScreenFuncConfig()));
        setMScreenReportData(new uj3.k1());
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMCurrentIndex(int i17) {
        this.Q = i17;
        uj3.c multiTalkStrokeContext = getMultiTalkStrokeContext();
        if (multiTalkStrokeContext != null) {
            multiTalkStrokeContext.f428248g = i17;
            yz5.l lVar = multiTalkStrokeContext.f428251j;
            if (lVar != null) {
            }
        }
        uj3.b1 b1Var = this.I;
        if (b1Var == null) {
            return;
        }
        uj3.y0 y0Var = b1Var.f428232j;
        if (y0Var != null) {
            y0Var.f428391h = i17;
        }
        b1Var.f428235m = i17;
    }

    private final void setMFilePath(java.lang.String str) {
        uj3.c multiTalkStrokeContext = getMultiTalkStrokeContext();
        if (multiTalkStrokeContext != null) {
            multiTalkStrokeContext.f428247f = str;
        }
        this.N = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMMaxCount(int i17) {
        this.K = i17;
        uj3.c multiTalkStrokeContext = getMultiTalkStrokeContext();
        if (multiTalkStrokeContext != null) {
            multiTalkStrokeContext.f428249h = i17;
        }
        uj3.b1 b1Var = this.I;
        if (b1Var == null) {
            return;
        }
        uj3.y0 y0Var = b1Var.f428232j;
        if (y0Var != null) {
            y0Var.f428392i = i17;
        }
        b1Var.f428241s = (i17 / 10) + 1;
        b1Var.f428236n = i17;
    }

    private final void setMToken(java.lang.String str) {
        uj3.c multiTalkStrokeContext = getMultiTalkStrokeContext();
        if (multiTalkStrokeContext != null) {
            multiTalkStrokeContext.f428246e = str;
        }
        this.M = str;
    }

    @Override // uj3.v0, uj3.b
    public void f(uj3.a status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        super.f(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 2) {
            uj3.b1 b1Var = this.I;
            if (b1Var != null) {
                b1Var.a();
                return;
            }
            return;
        }
        if (ordinal == 3) {
            uj3.b1 b1Var2 = this.I;
            if (b1Var2 != null) {
                b1Var2.c();
                return;
            }
            return;
        }
        if (ordinal == 9) {
            if (bundle != null) {
                int i17 = bundle.getInt("thumb_flip_target_position");
                j();
                com.tencent.xweb.r1.f(this.M, this.N, i17, 1.0f, 0, 0);
                return;
            }
            return;
        }
        boolean z17 = false;
        switch (ordinal) {
            case 11:
                if (this.f428376y) {
                    return;
                }
                int i18 = this.Q + 1;
                if (i18 >= 0 && i18 < this.K) {
                    z17 = true;
                }
                if (!z17) {
                    db5.t7.m(getContext(), "没有更多内容");
                    return;
                }
                j();
                uj3.b1 b1Var3 = this.I;
                if (b1Var3 != null) {
                    b1Var3.d(i18);
                    return;
                }
                return;
            case 12:
                if (this.f428376y) {
                    return;
                }
                int i19 = this.Q - 1;
                if (i19 >= 0 && i19 < this.K) {
                    z17 = true;
                }
                if (!z17) {
                    db5.t7.m(getContext(), "没有更多内容");
                    return;
                }
                j();
                uj3.b1 b1Var4 = this.I;
                if (b1Var4 != null) {
                    b1Var4.d(i19);
                    return;
                }
                return;
            case 13:
                if (bundle == null) {
                    return;
                }
                int i27 = bundle.getInt("thumb_current_page");
                int i28 = i27 * 10;
                int i29 = (i27 + 1) * 10;
                int i37 = this.K;
                if (i29 >= i37) {
                    i29 = i37;
                }
                if (i28 > i29) {
                    return;
                }
                while (true) {
                    com.tencent.xweb.r1.e(this.M, this.N, i28);
                    if (i28 == i29) {
                        return;
                    } else {
                        i28++;
                    }
                }
            default:
                return;
        }
    }

    @Override // uj3.v0
    public android.view.View getBackgroundView() {
        return this.H;
    }

    @Override // uj3.v0
    public java.lang.String getCurrentFileMd5() {
        return com.tencent.mm.vfs.w6.p(this.N);
    }

    @Override // uj3.v0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c3o;
    }

    public final com.tencent.xweb.p1 getMCurrentViewStatus() {
        return this.f428335J;
    }

    public final android.widget.RelativeLayout getMReaderLayout() {
        return this.H;
    }

    public final uj3.b1 getThumbUiLayout() {
        return this.I;
    }

    public final android.widget.FrameLayout getThumbnailRoot() {
        return this.G;
    }

    @Override // uj3.v0
    public void h() {
        android.widget.RelativeLayout relativeLayout = this.H;
        if (relativeLayout != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            sj3.n3 n3Var = sj3.o3.f408666e;
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (n3Var.a(context) != 90) {
                android.content.Context context2 = getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                if (n3Var.a(context2) != 270) {
                    layoutParams.removeRule(16);
                    layoutParams.removeRule(3);
                    layoutParams.removeRule(17);
                    layoutParams.removeRule(2);
                    android.widget.FrameLayout topRoot = getTopRoot();
                    kotlin.jvm.internal.o.d(topRoot);
                    layoutParams.addRule(3, topRoot.getId());
                    android.widget.FrameLayout bottomRoot = getBottomRoot();
                    kotlin.jvm.internal.o.d(bottomRoot);
                    layoutParams.addRule(2, bottomRoot.getId());
                    relativeLayout.setLayoutParams(layoutParams);
                }
            }
            layoutParams.removeRule(16);
            layoutParams.removeRule(3);
            layoutParams.removeRule(17);
            layoutParams.removeRule(2);
            android.widget.FrameLayout topRoot2 = getTopRoot();
            kotlin.jvm.internal.o.d(topRoot2);
            layoutParams.addRule(17, topRoot2.getId());
            android.widget.FrameLayout bottomRoot2 = getBottomRoot();
            kotlin.jvm.internal.o.d(bottomRoot2);
            layoutParams.addRule(16, bottomRoot2.getId());
            relativeLayout.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    @Override // uj3.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i() {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uj3.p.i():void");
    }

    @Override // uj3.v0
    public void k() {
        super.k();
        com.tencent.xweb.r1.a(this.M, this.N);
        setMToken(null);
        setMFilePath(null);
    }

    @Override // uj3.v0
    public void l() {
        setMToken(null);
        super.l();
    }

    @Override // uj3.v0
    public void p() {
        this.L = false;
        super.p();
        uj3.b1 b1Var = this.I;
        if (b1Var != null) {
            b1Var.b();
        }
    }

    @Override // uj3.v0
    public int q() {
        int q17 = super.q();
        android.widget.FrameLayout frameLayout = this.G;
        if (frameLayout != null) {
            frameLayout.setVisibility(q17);
        }
        return q17;
    }

    @Override // uj3.v0
    public void r(boolean z17) {
        super.r(z17);
        android.widget.RelativeLayout relativeLayout = this.H;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setVisibility(z17 ? 0 : 8);
    }

    public final void setMCurrentViewStatus(com.tencent.xweb.p1 p1Var) {
        uj3.c multiTalkStrokeContext = getMultiTalkStrokeContext();
        if (multiTalkStrokeContext != null) {
            multiTalkStrokeContext.f428245d = p1Var;
        }
        this.f428335J = p1Var;
    }

    public final void setMReaderLayout(android.widget.RelativeLayout relativeLayout) {
        this.H = relativeLayout;
    }

    public final void setThumbUiLayout(uj3.b1 b1Var) {
        this.I = b1Var;
    }

    public final void setThumbnailRoot(android.widget.FrameLayout frameLayout) {
        this.G = frameLayout;
    }

    public void x(android.os.Bundle bundle, int i17) {
        if (bundle != null) {
            setVisibility(0);
            setVisibility(0);
            if (this.M == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(hashCode());
                sb6.append(java.lang.System.currentTimeMillis());
                setMToken(sb6.toString());
            }
            setMFilePath(bundle.getString("file_path"));
            java.lang.String string = bundle.getString("file_ext");
            this.P = string;
            java.lang.String str = this.N;
            if (str != null && string != null) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
                if (r6Var.m() && r6Var.A()) {
                    uj3.k1 mScreenReportData = getMScreenReportData();
                    if (mScreenReportData != null) {
                        mScreenReportData.f428311g = this.P;
                    }
                    uj3.k1 mScreenReportData2 = getMScreenReportData();
                    if (mScreenReportData2 != null) {
                        mScreenReportData2.f428313i = this.N;
                    }
                    uj3.k1 mScreenReportData3 = getMScreenReportData();
                    if (mScreenReportData3 != null) {
                        mScreenReportData3.f428312h = com.tencent.mm.vfs.w6.k(this.N);
                    }
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("extra_param_disable_scale", "false");
                    hashMap.put("extra_param_enable_receive_view_status_change", "true");
                    hashMap.put("extra_param_bg_color", java.lang.String.valueOf(getResources().getColor(com.tencent.mm.R.color.f478514w)));
                    hashMap.put("extra_param_disable_finish_activity", "true");
                    hashMap.put("extra_param_disable_password", "true");
                    hashMap.put("extra_param_set_max_scale", "3");
                    hashMap.put("extra_param_can_download_when_plugin_error", "true");
                    hashMap.put("extra_param_open_file_scene", "11");
                    java.lang.String str2 = this.N;
                    java.lang.String str3 = this.P;
                    java.lang.String str4 = this.M;
                    com.tencent.xweb.q1 q1Var = com.tencent.xweb.q1.ReaderView;
                    android.content.Context context = getContext();
                    kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                    com.tencent.xweb.r1.d(str2, str3, str4, true, hashMap, q1Var, (android.app.Activity) context, this.H, new uj3.n(this), new uj3.o(this));
                }
            }
            r(true);
        }
    }
}
