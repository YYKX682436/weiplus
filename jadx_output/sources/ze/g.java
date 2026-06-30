package ze;

/* loaded from: classes7.dex */
public abstract class g implements ze.p, xi1.s {
    private java.lang.String _softOrientation;
    private final xi1.p activityOrientationHandler;
    private final android.util.DisplayMetrics displayMetrics;
    private final boolean dryRun;
    private int heightPx;
    private com.tencent.luggage.sdk.config.AppBrandInitConfigLU initConfig;
    private boolean isFold;
    private final boolean isFoldDevice;
    private boolean isLastInMultiWindowMode;
    private int lastLandscapeVHeight;
    private int lastLandscapeVWidth;
    private int lastOrientation;
    private int lastPortraitVHeight;
    private int lastPortraitVWidth;
    private int lastScreenHDp;
    private int lastScreenWDp;
    private int maxEdge;
    private int minEdge;
    private java.lang.String orientation;
    private boolean resizable;

    /* renamed from: rt, reason: collision with root package name */
    private final com.tencent.mm.plugin.appbrand.AppBrandRuntime f471728rt;
    private float scale;
    private double systemRatio;
    private int widthPx;
    private ze.b windowOrientation;

    public g(com.tencent.mm.plugin.appbrand.AppBrandRuntime rt6, xi1.p pVar, boolean z17) {
        kotlin.jvm.internal.o.g(rt6, "rt");
        this.f471728rt = rt6;
        this.activityOrientationHandler = pVar;
        this.dryRun = z17;
        this.orientation = "portrait";
        this.scale = 1.0f;
        nf.y yVar = nf.x.f336616b;
        boolean z18 = false;
        boolean e17 = yVar != null ? yVar.e() : false;
        this.isFoldDevice = e17;
        this.displayMetrics = new android.util.DisplayMetrics();
        if (e17 && !rt6.getWindowAndroid().isInMultiWindowMode()) {
            z18 = true;
        }
        this.isFold = z18;
        this.systemRatio = -1.0d;
        android.app.Activity r07 = rt6.r0();
        kotlin.jvm.internal.o.d(r07);
        this.windowOrientation = parseOrientation(r07.getResources().getConfiguration().orientation);
        android.app.Activity r08 = rt6.r0();
        kotlin.jvm.internal.o.d(r08);
        this.lastOrientation = r08.getResources().getConfiguration().orientation;
        android.app.Activity r09 = rt6.r0();
        kotlin.jvm.internal.o.d(r09);
        this.lastScreenWDp = r09.getResources().getConfiguration().screenWidthDp;
        android.app.Activity r010 = rt6.r0();
        kotlin.jvm.internal.o.d(r010);
        this.lastScreenHDp = r010.getResources().getConfiguration().screenHeightDp;
        refreshDisplayInfo();
    }

    private final android.view.View getBackgroundView() {
        com.tencent.mm.plugin.appbrand.widget.q qVar = this.f471728rt.f74810s;
        android.view.ViewParent parent = qVar != null ? qVar.getParent() : null;
        if (parent instanceof android.view.View) {
            return (android.view.View) parent;
        }
        return null;
    }

    private final ze.b parseOrientation(int i17) {
        if (i17 == 1) {
            return ze.b.f471717e;
        }
        if (i17 == 2) {
            return ze.b.f471716d;
        }
        com.tencent.mars.xlog.Log.w("Luggage.AppBrandWindowLayoutManager", "unexpected orientation [%d], fallback to portrait", java.lang.Integer.valueOf(i17));
        return ze.b.f471717e;
    }

    private final void refreshDisplayInfo() {
        android.graphics.Point point = new android.graphics.Point();
        android.app.Activity r07 = this.f471728rt.r0();
        kotlin.jvm.internal.o.d(r07);
        java.lang.Object systemService = r07.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        android.app.Activity r08 = this.f471728rt.r0();
        kotlin.jvm.internal.o.d(r08);
        if (com.tencent.mm.plugin.appbrand.utils.m3.b(r08)) {
            nf.y yVar = nf.x.f336616b;
            if (yVar != null ? yVar.a() : false) {
                defaultDisplay.getRealSize(point);
                defaultDisplay.getRealMetrics(this.displayMetrics);
                int i17 = point.x;
                this.widthPx = i17;
                int i18 = point.y;
                this.heightPx = i18;
                this.maxEdge = java.lang.Math.max(i17, i18);
                this.minEdge = java.lang.Math.min(this.widthPx, this.heightPx);
                com.tencent.mars.xlog.Log.i("Luggage.AppBrandWindowLayoutManager", "refreshDisplayInfo: system [w,h] = [%d,%d]", java.lang.Integer.valueOf(this.widthPx), java.lang.Integer.valueOf(this.heightPx));
            }
        }
        defaultDisplay.getSize(point);
        defaultDisplay.getMetrics(this.displayMetrics);
        int i172 = point.x;
        this.widthPx = i172;
        int i182 = point.y;
        this.heightPx = i182;
        this.maxEdge = java.lang.Math.max(i172, i182);
        this.minEdge = java.lang.Math.min(this.widthPx, this.heightPx);
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandWindowLayoutManager", "refreshDisplayInfo: system [w,h] = [%d,%d]", java.lang.Integer.valueOf(this.widthPx), java.lang.Integer.valueOf(this.heightPx));
    }

    private final void resetWindowOrientation() {
        if (!this.f471728rt.V || this.activityOrientationHandler == null) {
            return;
        }
        if (!android.text.TextUtils.isEmpty(this._softOrientation)) {
            com.tencent.mars.xlog.Log.i("Luggage.AppBrandWindowLayoutManager", "resetWindowOrientation by softOrientation[%s]", this._softOrientation);
            this.activityOrientationHandler.b(xi1.o.d(this._softOrientation), null);
        } else {
            xi1.o a17 = this.activityOrientationHandler.a();
            kotlin.jvm.internal.o.f(a17, "getCurrentOrientation(...)");
            com.tencent.mars.xlog.Log.i("Luggage.AppBrandWindowLayoutManager", "resetWindowOrientation with orientation[%s]", a17);
            this.activityOrientationHandler.b(a17, null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(7:3|(2:5|(2:7|(1:11))(2:44|(1:46)))(2:47|(1:49))|12|13|14|(1:18)|(2:27|(2:34|(1:40)(2:38|39))(1:42))(1:25))|50|12|13|14|(2:16|18)|(1:21)|27|(1:29)|32|34|(2:36|40)(1:41)) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void set_softOrientation(java.lang.String r5) {
        /*
            r4 = this;
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r4.f471728rt
            android.app.Activity r0 = r0.r0()
            kotlin.jvm.internal.o.d(r0)
            java.lang.String r1 = "_softOrientation = [%s]"
            java.lang.Object[] r2 = new java.lang.Object[]{r5}
            java.lang.String r3 = "Luggage.AppBrandWindowLayoutManager"
            com.tencent.mars.xlog.Log.i(r3, r1, r2)
            if (r5 == 0) goto L5f
            int r1 = r5.hashCode()
            r2 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r2) goto L45
            r2 = 729267099(0x2b77bb9b, float:8.8012383E-13)
            if (r1 == r2) goto L37
            r2 = 1430647483(0x5545f2bb, float:1.3602894E13)
            if (r1 == r2) goto L2a
            goto L5f
        L2a:
            java.lang.String r1 = "landscape"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L5f
            ze.b r1 = ze.b.f471716d
            r4.windowOrientation = r1
            goto L69
        L37:
            java.lang.String r1 = "portrait"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L40
            goto L5f
        L40:
            ze.b r1 = ze.b.f471717e
            r4.windowOrientation = r1
            goto L69
        L45:
            java.lang.String r1 = "auto"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L4e
            goto L5f
        L4e:
            android.content.res.Resources r1 = r0.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            ze.b r1 = r4.parseOrientation(r1)
            r4.windowOrientation = r1
            goto L69
        L5f:
            java.lang.String r1 = "unhandled orientation = [%s]"
            java.lang.Object[] r2 = new java.lang.Object[]{r5}
            com.tencent.mars.xlog.Log.w(r3, r1, r2)
        L69:
            r1 = 0
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r4.f471728rt     // Catch: iz5.b -> L7c
            com.tencent.mm.plugin.appbrand.page.i3 r2 = r2.x0()     // Catch: iz5.b -> L7c
            if (r2 == 0) goto L7c
            com.tencent.mm.plugin.appbrand.page.v5 r2 = r2.getPageView()     // Catch: iz5.b -> L7c
            if (r2 == 0) goto L7c
            xi1.m r1 = r2.C1()     // Catch: iz5.b -> L7c
        L7c:
            if (r1 == 0) goto L89
            boolean r2 = r1 instanceof com.tencent.mm.plugin.appbrand.zf
            if (r2 == 0) goto L89
            com.tencent.mm.plugin.appbrand.zf r1 = (com.tencent.mm.plugin.appbrand.zf) r1
            boolean r1 = r1.f92463p
            if (r1 == 0) goto L89
            return
        L89:
            r4._softOrientation = r5
            java.lang.String r5 = "set softOrientation"
            r1 = 1
            r4.tuningRtContentView(r5, r1)
            boolean r5 = r4.shouldInLargeScreenCompatMode()
            if (r5 != 0) goto L9b
            boolean r5 = r4.resizable
            if (r5 == 0) goto Lbb
        L9b:
            xi1.p r5 = r4.activityOrientationHandler
            if (r5 == 0) goto Lbb
            java.lang.String r5 = "_softOrientation: unlock orientation"
            com.tencent.mars.xlog.Log.i(r3, r5)
            int r5 = r0.getRequestedOrientation()
            r0 = 14
            if (r5 == r0) goto Lbb
            r0 = -1
            if (r5 == r0) goto Lbb
            xi1.p r5 = r4.activityOrientationHandler
            xi1.o r0 = xi1.o.UNSPECIFIED
            ze.c r1 = new ze.c
            r1.<init>(r4)
            r5.b(r0, r1)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.g.set_softOrientation(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tuningRtContentView(java.lang.String str, boolean z17) {
        tuningRtContentView(true, false, str, z17);
    }

    public static /* synthetic */ void tuningRtContentView$default(ze.g gVar, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tuningRtContentView");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        gVar.tuningRtContentView(str, z17);
    }

    @Override // xi1.s
    public xi1.m createFullscreenHandler(xi1.k kVar) {
        android.app.Activity r07 = this.f471728rt.r0();
        if (r07 == null) {
            r07 = null;
        }
        xi1.g windowAndroid = this.f471728rt.getWindowAndroid();
        kotlin.jvm.internal.o.f(windowAndroid, "getWindowAndroid(...)");
        return new com.tencent.mm.plugin.appbrand.zf(windowAndroid, kVar, r07);
    }

    @Override // xi1.s
    public boolean forceLightMode() {
        return false;
    }

    public int getBackgroundColor() {
        return com.tencent.mm.R.color.f478492d;
    }

    public final com.tencent.luggage.sdk.config.AppBrandInitConfigLU getInitConfig() {
        return this.initConfig;
    }

    public final int getLastLandscapeVHeight() {
        return this.lastLandscapeVHeight;
    }

    public final int getLastLandscapeVWidth() {
        return this.lastLandscapeVWidth;
    }

    public final int getLastPortraitVHeight() {
        return this.lastPortraitVHeight;
    }

    public final int getLastPortraitVWidth() {
        return this.lastPortraitVWidth;
    }

    @Override // xi1.s
    public xi1.p getOrientationHandler() {
        xi1.g windowAndroid = this.f471728rt.getWindowAndroid();
        kotlin.jvm.internal.o.f(windowAndroid, "getWindowAndroid(...)");
        return new zi1.b(windowAndroid);
    }

    public final boolean getResizable() {
        return this.resizable;
    }

    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime getRt() {
        return this.f471728rt;
    }

    @Override // xi1.s
    public float getScale() {
        return this.scale;
    }

    public abstract /* synthetic */ xi1.f getStatusBar();

    @Override // xi1.s
    public android.util.DisplayMetrics getVDisplayMetrics() {
        return getVDisplayMetrics(false);
    }

    @Override // ze.p
    public void init(com.tencent.luggage.sdk.config.AppBrandInitConfigLU initConfig) {
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        this.initConfig = initConfig;
        this.resizable = initConfig.N.f77463z;
        tuningRtContentView$default(this, true, false, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, false, 8, null);
    }

    public final boolean isFold() {
        return this.isFold;
    }

    @Override // xi1.s
    public boolean isLargeScreenWindow() {
        android.app.Activity r07 = this.f471728rt.r0();
        kotlin.jvm.internal.o.d(r07);
        return com.tencent.mm.plugin.appbrand.utils.m3.b(r07) && !shouldInLargeScreenCompatMode();
    }

    @Override // ze.p
    public void onAppConfigGot(k91.r appConfig) {
        kotlin.jvm.internal.o.g(appConfig, "appConfig");
        java.lang.String str = "portrait";
        this.orientation = "portrait";
        java.lang.String str2 = appConfig.a().f305724m;
        if (str2 == null) {
            java.lang.String str3 = appConfig.f305748r.f305550a;
            if (str3 != null) {
                if (!(str3.length() == 0)) {
                    str = str3;
                }
            }
            this.orientation = str;
        } else {
            this.orientation = str2;
        }
        boolean z17 = appConfig.f305754x;
        boolean z18 = this.resizable;
        if (z18 != z17) {
            this.resizable = z17;
            tuningRtContentView$default(this, "redundancy field check fail", false, 2, null);
            com.tencent.mars.xlog.Log.w("Luggage.AppBrandWindowLayoutManager", "setResizableToWindow: redundancy field check fail, please call complexzeng to fix, fromAttr = [%b], fromAppJson = [%b]", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        }
    }

    @Override // ze.p
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        if (this.lastOrientation != newConfig.orientation && kotlin.jvm.internal.o.b(this._softOrientation, "auto") && shouldInLargeScreenCompatMode() && !this.resizable) {
            this.windowOrientation = parseOrientation(newConfig.orientation);
        }
        int i17 = this.lastOrientation;
        int i18 = newConfig.orientation;
        if (i17 != i18 || newConfig.screenHeightDp != this.lastScreenHDp || newConfig.screenWidthDp != this.lastScreenWDp) {
            this.isFold = this.isFoldDevice || (!(newConfig.screenHeightDp == this.lastScreenHDp && newConfig.screenWidthDp == this.lastScreenWDp) && i17 == i18);
            if (this.f471728rt.getWindowAndroid().isInMultiWindowMode() || this.isLastInMultiWindowMode) {
                this.isFold = false;
            }
            this.isLastInMultiWindowMode = this.f471728rt.getWindowAndroid().isInMultiWindowMode();
            refreshDisplayInfo();
            if (this.isFold && (newConfig.screenHeightDp != this.lastScreenHDp || newConfig.screenWidthDp != this.lastScreenWDp)) {
                resetWindowOrientation();
            }
            android.view.View backgroundView = getBackgroundView();
            if (backgroundView != null) {
                backgroundView.addOnLayoutChangeListener(new ze.d(backgroundView, this));
            }
        }
        this.lastOrientation = newConfig.orientation;
        this.lastScreenHDp = newConfig.screenHeightDp;
        this.lastScreenWDp = newConfig.screenWidthDp;
    }

    @Override // ze.p
    public void onInitConfigUpdated(com.tencent.luggage.sdk.config.AppBrandInitConfigLU initConfig) {
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        this.initConfig = initConfig;
        this.resizable = initConfig.N.f77463z;
        if (shouldInLargeScreenCompatMode()) {
            android.app.Activity r07 = this.f471728rt.r0();
            kotlin.jvm.internal.o.d(r07);
            android.content.res.Configuration configuration = r07.getResources().getConfiguration();
            kotlin.jvm.internal.o.f(configuration, "getConfiguration(...)");
            onConfigurationChanged(configuration);
        }
        tuningRtContentView$default(this, true, true, "onInitConfigUpdated", false, 8, null);
    }

    public final void setInitConfig(com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU) {
        this.initConfig = appBrandInitConfigLU;
    }

    public final void setLastLandscapeVHeight(int i17) {
        this.lastLandscapeVHeight = i17;
    }

    public final void setLastLandscapeVWidth(int i17) {
        this.lastLandscapeVWidth = i17;
    }

    public final void setLastPortraitVHeight(int i17) {
        this.lastPortraitVHeight = i17;
    }

    public final void setLastPortraitVWidth(int i17) {
        this.lastPortraitVWidth = i17;
    }

    public final void setResizable(boolean z17) {
        this.resizable = z17;
    }

    @Override // xi1.s
    public void setSoftOrientation(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        set_softOrientation(name);
    }

    public boolean shouldInLargeScreenCompatMode() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return com.tencent.mm.plugin.appbrand.utils.m3.b(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if ((r14.systemRatio == -1.0d) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.util.DisplayMetrics getVDisplayMetrics(boolean r15) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.g.getVDisplayMetrics(boolean):android.util.DisplayMetrics");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tuningRtContentView(boolean z17, boolean z18, java.lang.String str, boolean z19) {
        if (!kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            ((ku5.t0) ku5.t0.f312615d).B(new ze.e(this, z17, z18, str, z19));
            return;
        }
        android.view.View backgroundView = getBackgroundView();
        if (!shouldInLargeScreenCompatMode() || backgroundView == null) {
            return;
        }
        android.util.DisplayMetrics vDisplayMetrics = getVDisplayMetrics(z19);
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandWindowLayoutManager", "tuningRtContentView[%s %s]: orientation = [%s], vdmW = [%d], vdmH = [%d]", str, this.f471728rt.f74803n, this.windowOrientation, java.lang.Integer.valueOf(vDisplayMetrics.widthPixels), java.lang.Integer.valueOf(vDisplayMetrics.heightPixels));
        this.f471728rt.f74820y1 = true;
        if ((!backgroundView.isLaidOut() && z17) || z18) {
            backgroundView.post(new ze.f(this));
            return;
        }
        int measuredWidth = backgroundView.getMeasuredWidth();
        int measuredHeight = backgroundView.getMeasuredHeight();
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandWindowLayoutManager", "tuningRtContentView[%s %s]: width [%d], height[%d]", str, this.f471728rt.f74803n, java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight));
        float f17 = (measuredWidth * 1.0f) / vDisplayMetrics.widthPixels;
        float f18 = (measuredHeight * 1.0f) / vDisplayMetrics.heightPixels;
        float min = java.lang.Math.min(f17, f18);
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandWindowLayoutManager", "tuningRtContentView[%s %s]: scaleMin = [%f], scaleMax = [%f]", str, this.f471728rt.f74803n, java.lang.Float.valueOf(min), java.lang.Float.valueOf(java.lang.Math.max(f17, f18)));
        this.scale = min;
        com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams wxaWindowLayoutParams = new com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams(vDisplayMetrics.widthPixels, vDisplayMetrics.heightPixels);
        ((android.widget.FrameLayout.LayoutParams) wxaWindowLayoutParams).gravity = 17;
        float f19 = this.scale;
        wxaWindowLayoutParams.f87570a = f19;
        if (java.lang.Float.isNaN(f19)) {
            com.tencent.mars.xlog.Log.w("Luggage.AppBrandWindowLayoutManager", "tuningRtContentView[%s %s]: scale is NaN", str, this.f471728rt.f74803n);
            this.scale = 1.0f;
            wxaWindowLayoutParams.f87570a = 1.0f;
            ((android.widget.FrameLayout.LayoutParams) wxaWindowLayoutParams).width = -1;
            ((android.widget.FrameLayout.LayoutParams) wxaWindowLayoutParams).height = -1;
        }
        if (this.dryRun) {
            return;
        }
        xi1.g windowAndroid = this.f471728rt.getWindowAndroid();
        kotlin.jvm.internal.o.e(windowAndroid, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.platform.window.WindowAndroidWxaExt");
        ((xi1.i) windowAndroid).a(wxaWindowLayoutParams, this.f471728rt);
        xi1.g windowAndroid2 = this.f471728rt.getWindowAndroid();
        kotlin.jvm.internal.o.e(windowAndroid2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.platform.window.WindowAndroidWxaExt");
        android.app.Activity r07 = this.f471728rt.r0();
        kotlin.jvm.internal.o.d(r07);
        ((xi1.i) windowAndroid2).d(b3.l.getColor(r07, getBackgroundColor()), this.f471728rt);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f471728rt;
        com.tencent.mm.plugin.appbrand.widget.q qVar = appBrandRuntime.f74810s;
        android.app.Activity r08 = appBrandRuntime.r0();
        kotlin.jvm.internal.o.d(r08);
        qVar.setBackgroundColor(b3.l.getColor(r08, getBackgroundColor()));
    }

    public static /* synthetic */ void tuningRtContentView$default(ze.g gVar, boolean z17, boolean z18, java.lang.String str, boolean z19, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tuningRtContentView");
        }
        if ((i17 & 8) != 0) {
            z19 = false;
        }
        gVar.tuningRtContentView(z17, z18, str, z19);
    }

    public /* synthetic */ g(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, xi1.p pVar, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(appBrandRuntime, pVar, (i17 & 4) != 0 ? false : z17);
    }
}
