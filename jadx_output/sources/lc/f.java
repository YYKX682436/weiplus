package lc;

/* loaded from: classes14.dex */
public final class f implements jc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.g f317803a;

    public f(lc.g gVar) {
        this.f317803a = gVar;
    }

    public final void a(com.tencent.cloud.huiyan.enums.AuthState authState, final java.lang.Object obj) {
        int i17 = lc.h.f317843a[authState.ordinal()];
        final lc.g gVar = this.f317803a;
        switch (i17) {
            case 1:
                gVar.getClass();
                pc.l.f353211a.f353212a = com.tencent.cloud.huiyan.enums.HuiYanProcessStatus.Prepare;
                mc.q qVar = mc.p.f325531a;
                qVar.b("AuthingFragment", ">>>start prepare event");
                if (gVar.f317814o == null) {
                    qVar.e("AuthingFragment", "loadingFrontAnimatorView is null!");
                    return;
                }
                com.tencent.cloud.huiyan.entity.AuthUiConfig authUiConfig = gVar.B;
                if (authUiConfig != null && authUiConfig.isHideFrontCircleViewOnStart()) {
                    gVar.f317814o.setShowOutCircle(false);
                    return;
                }
                final com.tencent.cloud.huiyan.view.LoadingFrontAnimatorView loadingFrontAnimatorView = gVar.f317814o;
                loadingFrontAnimatorView.f45923r = true;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(loadingFrontAnimatorView, arrayList.toArray(), "com/tencent/cloud/huiyan/view/LoadingFrontAnimatorView", "b", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                loadingFrontAnimatorView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(loadingFrontAnimatorView, "com/tencent/cloud/huiyan/view/LoadingFrontAnimatorView", "b", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                loadingFrontAnimatorView.f45913e = ofFloat;
                ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: qc.a$$a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                        int i18 = com.tencent.cloud.huiyan.view.LoadingFrontAnimatorView.f45911v;
                        com.tencent.cloud.huiyan.view.LoadingFrontAnimatorView loadingFrontAnimatorView2 = com.tencent.cloud.huiyan.view.LoadingFrontAnimatorView.this;
                        loadingFrontAnimatorView2.getClass();
                        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (floatValue < 0.0f || floatValue > 1.0f) {
                            return;
                        }
                        loadingFrontAnimatorView2.f45912d = floatValue;
                        loadingFrontAnimatorView2.invalidate();
                    }
                });
                loadingFrontAnimatorView.f45913e.setDuration(2000L);
                loadingFrontAnimatorView.f45913e.setRepeatMode(1);
                loadingFrontAnimatorView.f45913e.setRepeatCount(-1);
                loadingFrontAnimatorView.f45913e.start();
                return;
            case 2:
                gVar.getClass();
                mc.p.f325531a.b("AuthingFragment", ">>>start auth action");
                gVar.a(new java.lang.Runnable() { // from class: lc.g$$i
                    @Override // java.lang.Runnable
                    public final void run() {
                        lc.g gVar2 = lc.g.this;
                        if (gVar2.f317820u == null) {
                            gVar2.f317820u = new com.tencent.cloud.aicamare.CameraHolder();
                        }
                        gVar2.f317820u.setLoggerCallBack(new lc.b());
                        gVar2.f317820u.setEventListener(new lc.c(gVar2));
                        com.tencent.cloud.aicamare.entity.CameraConfig cameraConfig = new com.tencent.cloud.aicamare.entity.CameraConfig();
                        cameraConfig.setMainThread(false);
                        cameraConfig.setPreWidth(640);
                        cameraConfig.setPreHeight(480);
                        int i18 = ic.d.f290281k;
                        ic.d dVar = ic.c.f290280a;
                        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig = dVar.f290290i;
                        if (huiYanSdkConfig != null) {
                            cameraConfig.setMinFps(30);
                            cameraConfig.setMaxFps(30);
                            cameraConfig.setBackCamera(huiYanSdkConfig.isUseBackCamera());
                            if (huiYanSdkConfig.isUseBackCamera()) {
                                cameraConfig.setZoom(huiYanSdkConfig.getZoomLevel());
                            }
                            cameraConfig.setMustDiffMinAndMaxFps(huiYanSdkConfig.isMustDiffMinAndMaxFps());
                        } else {
                            cameraConfig.setMinFps(30);
                            cameraConfig.setMaxFps(30);
                            cameraConfig.setBackCamera(false);
                        }
                        cameraConfig.setByteDataBuffer(true);
                        cameraConfig.setSupportZoom(false);
                        gVar2.f317820u.initCameraHolder(dVar.a(), cameraConfig);
                        gVar2.f317807e.setCameraHolder(gVar2.f317820u);
                        android.content.Context a17 = dVar.a();
                        if (gVar2.f317820u == null || a17 == null) {
                            if (gVar2.f317820u == null) {
                                mc.p.f325531a.e("AuthingFragment", "startAuthAction fail cameraHolder is null!");
                            }
                            if (a17 == null) {
                                mc.p.f325531a.e("AuthingFragment", "startAuthAction fail context is null!");
                                return;
                            }
                            return;
                        }
                        gVar2.f317820u.openCamera(a17);
                        oc.h hVar = oc.g.f344101a;
                        synchronized (hVar) {
                            hVar.f344109h = new android.os.HandlerThread("turing");
                            hVar.f344109h.start();
                            hVar.f344110i = new oc.f(hVar.f344109h.getLooper());
                        }
                    }
                });
                return;
            case 3:
                int i18 = ic.d.f290281k;
                if (ic.c.f290280a.f290289h) {
                    gVar.c(640, 480);
                    return;
                }
                return;
            case 4:
                gVar.getClass();
                gVar.a(new lc.g$$a(gVar, 255));
                return;
            case 5:
                gVar.getClass();
                mc.q qVar2 = mc.p.f325531a;
                qVar2.b("AuthingFragment", ">>>start auth end.");
                int i19 = ic.d.f290281k;
                ic.c.f290280a.getClass();
                qVar2.b("HuiYanBaseApi", "releaseLivenessSDK!");
                com.tencent.cloud.huiyan.api.HuiYanNativeApi.releaseYtLiveness();
                gVar.a(new java.lang.Runnable() { // from class: lc.g$$h
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i27;
                        lc.g gVar2 = lc.g.this;
                        android.widget.TextView textView = gVar2.f317811i;
                        if (textView != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(textView, arrayList2.toArray(), "com/tencent/cloud/huiyan/fragments/f", "i", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(textView, "com/tencent/cloud/huiyan/fragments/f", "i", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        mc.q qVar3 = mc.p.f325531a;
                        qVar3.e("AuthingFragment", "releaseDeviceRes!");
                        gVar2.f317823x = false;
                        com.tencent.cloud.aicamare.CameraHolder cameraHolder = gVar2.f317820u;
                        oc.h hVar = oc.g.f344101a;
                        if (cameraHolder != null) {
                            gVar2.f317820u.release();
                            hVar.a();
                            gVar2.f317820u = null;
                        }
                        hVar.a();
                        com.tencent.cloud.huiyan.view.LoadingFrontAnimatorView loadingFrontAnimatorView2 = gVar2.f317814o;
                        if (loadingFrontAnimatorView2 != null) {
                            loadingFrontAnimatorView2.c(true);
                        }
                        int i28 = ic.d.f290281k;
                        ic.d dVar = ic.c.f290280a;
                        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig = dVar.f290290i;
                        if (huiYanSdkConfig != null && huiYanSdkConfig.isAutoScreenBrightness() && (i27 = gVar2.f317816q) != -1) {
                            gVar2.a(new lc.g$$a(gVar2, i27));
                        }
                        mc.k.f325525a.a();
                        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig2 = dVar.f290290i;
                        if (!(huiYanSdkConfig2 == null ? false : huiYanSdkConfig2.isWaitingUserCompare())) {
                            qVar3.b("HuiYanBaseApi", "closeCurrentCheckIsHaveResultPage!");
                            com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig3 = dVar.f290290i;
                            if (huiYanSdkConfig3 == null) {
                                qVar3.b("HuiYanBaseApi", "want closeCurrentUi!");
                                pc.f.b();
                                return;
                            } else {
                                if (huiYanSdkConfig3.isHaveResultFragment()) {
                                    return;
                                }
                                qVar3.b("HuiYanBaseApi", "isHaveResultFragment close ui!");
                                qVar3.b("HuiYanBaseApi", "want closeCurrentUi!");
                                pc.f.b();
                                return;
                            }
                        }
                        if (gVar2.f317808f == null) {
                            return;
                        }
                        android.widget.TextView textView2 = gVar2.f317809g;
                        if (textView2 != null) {
                            textView2.setText(gVar2.b().getString(com.tencent.mm.R.string.pjb));
                            gVar2.f317809g.setTextColor(gVar2.b().getColor(com.tencent.mm.R.color.ana));
                        }
                        android.widget.TextView textView3 = gVar2.f317810h;
                        if (textView3 != null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                            arrayList3.add(4);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(textView3, arrayList3.toArray(), "com/tencent/cloud/huiyan/fragments/f", "i", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            textView3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(textView3, "com/tencent/cloud/huiyan/fragments/f", "i", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view = gVar2.f317844d;
                        if (view != null) {
                            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.vjl);
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                            arrayList4.add(4);
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/cloud/huiyan/fragments/f", "i", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/cloud/huiyan/fragments/f", "i", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.view.View findViewById2 = gVar2.f317844d.findViewById(com.tencent.mm.R.id.vjt);
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            arrayList5.add(4);
                            java.util.Collections.reverse(arrayList5);
                            yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/cloud/huiyan/fragments/f", "i", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                            yj0.a.f(findViewById2, "com/tencent/cloud/huiyan/fragments/f", "i", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        gVar2.f317808f.setVisibility(0);
                        qVar3.e("AuthingFragment", "animationDrawable is null!");
                    }
                });
                return;
            case 6:
                gVar.a(new java.lang.Runnable() { // from class: lc.f$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        double d17;
                        int i27;
                        int i28;
                        int i29;
                        int i37;
                        int intValue;
                        android.util.Pair pair;
                        java.lang.Object obj2 = obj;
                        mc.g gVar2 = mc.f.f325516a;
                        java.lang.String str = (java.lang.String) obj2;
                        gVar2.getClass();
                        com.tencent.cloud.component.common.ai.json.WeJson weJson = new com.tencent.cloud.component.common.ai.json.WeJson();
                        try {
                            kc.a aVar = (kc.a) weJson.fromJson(str, kc.a.class);
                            aVar.getClass();
                            int i38 = gVar2.f325520d;
                            if (i38 != 1) {
                                if (i38 == 0) {
                                    throw null;
                                }
                                com.tencent.cloud.huiyan.api.HuiYanNativeApi.callbackToPPL(23, weJson.toJson(new kc.a(i38 - 1, "camera params not support", aVar.f306258c, aVar.f306259d, aVar.f306260e, aVar.f306261f, aVar.f306262g)));
                                return;
                            }
                            if (gVar2.f325523g) {
                                float f17 = (float) aVar.f306261f;
                                float f18 = 0.0f;
                                if (f17 == 0.0f) {
                                    pair = new android.util.Pair(0, java.lang.Float.valueOf(0.0f));
                                } else if (java.lang.Math.abs(f17 - (-10.0f)) < 1.0E-6f) {
                                    pair = new android.util.Pair(0, java.lang.Float.valueOf(0.0f));
                                } else {
                                    float f19 = 99.0f;
                                    int i39 = 0;
                                    for (java.util.Map.Entry entry : gVar2.f325517a.entrySet()) {
                                        float floatValue = ((java.lang.Float) entry.getKey()).floatValue();
                                        float abs = java.lang.Math.abs(floatValue - f17);
                                        if (abs < f19) {
                                            i39 = ((java.lang.Integer) entry.getValue()).intValue();
                                            f18 = floatValue;
                                            f19 = abs;
                                        }
                                    }
                                    pair = new android.util.Pair(java.lang.Integer.valueOf(i39), java.lang.Float.valueOf(f18));
                                }
                                i27 = ((java.lang.Integer) pair.first).intValue();
                                d17 = ((java.lang.Float) pair.second).floatValue();
                            } else {
                                d17 = 0.0d;
                                i27 = 0;
                            }
                            double d18 = d17;
                            int i47 = 100;
                            if (gVar2.f325521e) {
                                int i48 = aVar.f306262g;
                                int i49 = 999;
                                int i57 = 0;
                                for (int i58 = 0; i58 < gVar2.f325518b.size() && (intValue = ((java.lang.Integer) gVar2.f325518b.get(i58)).intValue()) <= 200; i58++) {
                                    int i59 = intValue - i48;
                                    if (java.lang.Math.abs(i59) < i49) {
                                        i49 = java.lang.Math.abs(i59);
                                        i57 = i58;
                                        i47 = intValue;
                                    }
                                }
                                mc.q qVar3 = mc.p.f325531a;
                                qVar3.b("d", "zoomRatioList: " + gVar2.f325518b);
                                qVar3.b("d", "wantZoomRatios: " + i48 + ", realZoomRatios: " + i47 + ", closerZoomIndex: " + i57);
                                android.util.Pair pair2 = new android.util.Pair(java.lang.Integer.valueOf(i57), java.lang.Integer.valueOf(i47));
                                i29 = ((java.lang.Integer) pair2.first).intValue();
                                i28 = ((java.lang.Integer) pair2.second).intValue();
                            } else {
                                i28 = 100;
                                i29 = 0;
                            }
                            java.lang.String str2 = (!gVar2.f325522f || (i37 = aVar.f306260e) == 0) ? "auto" : i37 != 1 ? i37 != 2 ? i37 != 3 ? i37 != 4 ? i37 != 5 ? "" : "incandescent" : "fluorescent" : "warm-fluorescent" : "daylight" : "cloudy-daylight";
                            try {
                                if (gVar2.f325519c.get() == null || ((com.tencent.cloud.aicamare.CameraHolder) gVar2.f325519c.get()).getCurrentCamera() == null || ((com.tencent.cloud.aicamare.CameraHolder) gVar2.f325519c.get()).getCurrentCamera().getParameters() == null) {
                                    return;
                                }
                                android.hardware.Camera.Parameters parameters = ((com.tencent.cloud.aicamare.CameraHolder) gVar2.f325519c.get()).getCurrentCamera().getParameters();
                                mc.q qVar4 = mc.p.f325531a;
                                qVar4.b("d", "support exposure:" + gVar2.f325523g + ", need change:false, realExposureIndex:" + i27);
                                qVar4.b("d", "support wh:" + gVar2.f325522f + ", need change:false, realWhiteBalance:" + str2);
                                qVar4.b("d", "support zoom:" + gVar2.f325521e + ", need change:false, realZoomIndex:" + i29);
                                qVar4.b("d", "camera params changed, applying new parameters");
                                ((com.tencent.cloud.aicamare.CameraHolder) gVar2.f325519c.get()).getCurrentCamera().setParameters(parameters);
                                qVar4.b("d", "after set parameters.");
                                com.tencent.cloud.huiyan.api.HuiYanNativeApi.callbackToPPL(23, weJson.toJson(new kc.a(0, "camera params set success", aVar.f306258c, aVar.f306259d, aVar.f306260e, d18, i28)));
                            } catch (java.lang.Exception e17) {
                                mc.p.f325531a.e("d", "update camera params error: " + e17.getLocalizedMessage());
                                com.tencent.cloud.huiyan.api.HuiYanNativeApi.callbackToPPL(23, weJson.toJson(new kc.a(5, "camera params set error", aVar.f306258c, aVar.f306259d, aVar.f306260e, aVar.f306261f, aVar.f306262g)));
                            }
                        } catch (java.lang.Exception e18) {
                            mc.p.f325531a.e("d", "transform camera params to entity error: " + e18.getLocalizedMessage());
                        }
                    }
                });
                return;
            case 7:
                java.lang.String str = (java.lang.String) obj;
                gVar.getClass();
                try {
                    java.lang.String[] split = str.split("--");
                    if (split.length != 2) {
                        throw new java.lang.IllegalArgumentException("invalid format: expected 'stage--state'");
                    }
                    int a17 = mc.e.a(java.lang.Integer.parseInt(split[0]));
                    int a18 = mc.h.a(java.lang.Integer.parseInt(split[1]));
                    mc.p.f325531a.b("AuthingFragment", "stage: " + split[0] + ", state: " + split[1]);
                    if (a17 == 2 && a18 == 2) {
                        gVar.a(new java.lang.Runnable() { // from class: lc.g$$g
                            @Override // java.lang.Runnable
                            public final void run() {
                                final lc.g gVar2 = lc.g.this;
                                gVar2.f317825z = true;
                                if (gVar2.f317811i != null && gVar2.B.isShowCountdown()) {
                                    android.widget.TextView textView = gVar2.f317811i;
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                                    arrayList2.add(0);
                                    java.util.Collections.reverse(arrayList2);
                                    yj0.a.d(textView, arrayList2.toArray(), "com/tencent/cloud/huiyan/fragments/f", "f", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                    yj0.a.f(textView, "com/tencent/cloud/huiyan/fragments/f", "f", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                com.tencent.cloud.huiyan.view.LoadingFrontAnimatorView loadingFrontAnimatorView2 = gVar2.f317814o;
                                if (loadingFrontAnimatorView2 != null) {
                                    loadingFrontAnimatorView2.c(false);
                                }
                                android.widget.ImageView imageView = gVar2.f317808f;
                                if (imageView != null) {
                                    imageView.postDelayed(new java.lang.Runnable() { // from class: lc.g$$b
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            lc.g gVar3 = lc.g.this;
                                            android.widget.ImageView imageView2 = gVar3.f317808f;
                                            if (imageView2 != null) {
                                                imageView2.setVisibility(8);
                                                if (gVar3.f317808f == null) {
                                                    return;
                                                }
                                                com.tencent.cloud.huiyan.entity.AuthUiConfig authUiConfig2 = gVar3.B;
                                                if (authUiConfig2 != null && authUiConfig2.isHideAvatarGuideFrame()) {
                                                    gVar3.f317808f.setVisibility(8);
                                                    return;
                                                }
                                                gVar3.f317808f.setScaleX(0.935f);
                                                gVar3.f317808f.setScaleY(0.935f);
                                                gVar3.f317808f.setVisibility(0);
                                                gVar3.f317808f.setImageResource(com.tencent.mm.R.drawable.d_6);
                                            }
                                        }
                                    }, 150L);
                                }
                            }
                        });
                        return;
                    }
                    return;
                } catch (java.lang.NumberFormatException e17) {
                    mc.p.f325531a.e("AuthingFragment", "invalid number format in input: " + e17.getLocalizedMessage());
                    return;
                } catch (java.lang.IllegalArgumentException e18) {
                    mc.p.f325531a.e("AuthingFragment", "illegal argument in input: " + e18.getLocalizedMessage());
                    return;
                }
            case 8:
                gVar.a(new java.lang.Runnable() { // from class: lc.f$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        lc.f fVar = lc.f.this;
                        java.lang.Object obj2 = obj;
                        lc.g gVar2 = fVar.f317803a;
                        java.lang.String str2 = (java.lang.String) obj2;
                        gVar2.getClass();
                        try {
                            java.lang.String[] split2 = str2.split("--");
                            int parseInt = java.lang.Integer.parseInt(split2[0]);
                            int parseInt2 = java.lang.Integer.parseInt(split2[1]);
                            if (parseInt2 * 9 == parseInt * 16) {
                                oc.a aVar = gVar2.f317807e;
                                if (aVar instanceof com.tencent.cloud.huiyansdk.turing.view.CameraDateGatherView) {
                                    android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) ((com.tencent.cloud.huiyansdk.turing.view.CameraDateGatherView) aVar).getLayoutParams();
                                    int i27 = layoutParams.height;
                                    int i28 = ic.d.f290281k;
                                    com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig = ic.c.f290280a.f290290i;
                                    if (huiYanSdkConfig == null || !huiYanSdkConfig.isLandMode()) {
                                        layoutParams.height = (int) (layoutParams.height * 1.3d);
                                    } else {
                                        layoutParams.width = (int) (layoutParams.width * 1.3d);
                                    }
                                    ((com.tencent.cloud.huiyansdk.turing.view.CameraDateGatherView) gVar2.f317807e).setLayoutParams(layoutParams);
                                    android.view.View view = gVar2.f317844d;
                                    if (view != null) {
                                        int i29 = (layoutParams.height - i27) / 2;
                                        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.vju);
                                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
                                        marginLayoutParams.topMargin -= i29;
                                        findViewById.setLayoutParams(marginLayoutParams);
                                        mc.p.f325531a.b("AuthingFragment", "margin top offset:" + i29);
                                    } else {
                                        mc.p.f325531a.e("AuthingFragment", "fragment view is null.");
                                    }
                                }
                            }
                            gVar2.c(parseInt2, parseInt);
                            mc.r rVar = oc.g.f344101a.f344106e;
                            if (gVar2.f317820u == null || gVar2.f317820u.getCurrentCamera() == null || rVar == null) {
                                return;
                            }
                            android.hardware.Camera.Size previewSize = gVar2.f317820u.getCurrentCamera().getParameters().getPreviewSize();
                            rVar.c(previewSize.width, previewSize.height, gVar2.f317820u.getCurrentRotate());
                            rVar.k();
                        } catch (java.lang.Exception e19) {
                            mc.p.f325531a.e("AuthingFragment", "camera size error: " + e19.getLocalizedMessage());
                        }
                    }
                });
                return;
            default:
                return;
        }
    }
}
