package lc;

/* loaded from: classes14.dex */
public final class g extends lc.i {
    public final com.tencent.cloud.huiyan.entity.AuthUiConfig B;

    /* renamed from: e, reason: collision with root package name */
    public oc.a f317807e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f317808f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f317809g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f317810h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f317811i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f317812m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.cloud.huiyan.view.HuiYanReflectLayout f317813n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.cloud.huiyan.view.LoadingFrontAnimatorView f317814o;

    /* renamed from: t, reason: collision with root package name */
    public pc.o f317819t;

    /* renamed from: u, reason: collision with root package name */
    public volatile com.tencent.cloud.aicamare.CameraHolder f317820u;

    /* renamed from: v, reason: collision with root package name */
    public android.hardware.Camera.Size f317821v;

    /* renamed from: w, reason: collision with root package name */
    public qc.b f317822w;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f317815p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f317816q = -1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f317817r = false;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f317818s = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f317823x = false;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f317824y = false;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f317825z = false;
    public int A = 0;

    public g() {
        int i17 = ic.d.f290281k;
        ic.d dVar = ic.c.f290280a;
        this.B = dVar.e();
        dVar.getClass();
    }

    public final void c(int i17, int i18) {
        if (!this.f317820u.setResolution(i17, i18)) {
            mc.p.f325531a.e("AuthingFragment", "failed to set resolution.");
        }
        mc.p.f325531a.b("AuthingFragment", ">>>start camera preview(get light data ok)");
        a(new java.lang.Runnable() { // from class: lc.g$$j
            @Override // java.lang.Runnable
            public final void run() {
                android.view.SurfaceHolder surfaceHolder;
                lc.g gVar = lc.g.this;
                java.lang.Object obj = gVar.f317807e;
                if (obj != null && (obj instanceof android.view.View)) {
                    android.view.View view = (android.view.View) obj;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/cloud/huiyan/fragments/f", "g", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/cloud/huiyan/fragments/f", "g", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    com.tencent.cloud.huiyansdk.turing.view.CameraDateGatherView cameraDateGatherView = (com.tencent.cloud.huiyansdk.turing.view.CameraDateGatherView) gVar.f317807e;
                    com.tencent.cloud.aicamare.CameraHolder cameraHolder = cameraDateGatherView.f45933m;
                    if (cameraHolder != null && (surfaceHolder = cameraDateGatherView.f45932i) != null) {
                        cameraHolder.startPreview(surfaceHolder);
                    }
                    try {
                        java.lang.Class<?> cls = java.lang.Class.forName("com.tencent.turingcam.view.TuringPreviewDisplay");
                        if (cls.isInstance(gVar.f317807e)) {
                            android.view.TextureView textureView = (android.view.TextureView) cls.getMethod("getChildAt", java.lang.Integer.TYPE).invoke(cls.cast(gVar.f317807e), 0);
                            if (textureView != null) {
                                int i19 = ic.d.f290281k;
                                ic.c.f290280a.getClass();
                                com.tencent.cloud.huiyan.api.HuiYanNativeApi.setCurrentTextureView(textureView);
                            } else {
                                mc.p.f325531a.b("AuthingFragment", "currentTexture view is null.");
                            }
                        } else {
                            mc.q qVar = mc.p.f325531a;
                            oc.a aVar = gVar.f317807e;
                            qVar.e("AuthingFragment", "cameraDateGatherView is not instance of TuringPreviewDisplay: ".concat(aVar != null ? aVar.getClass().getName() : "null"));
                        }
                    } catch (java.lang.ClassNotFoundException e17) {
                        mc.p.f325531a.e("AuthingFragment", "TuringPreviewDisplay not found: " + e17.getLocalizedMessage());
                    } catch (java.lang.Exception e18) {
                        mc.p.f325531a.e("AuthingFragment", "Error accessing TuringPreviewDisplay methods: " + e18.getLocalizedMessage());
                    }
                }
                gVar.f317817r = true;
            }
        });
    }

    @Override // android.app.Fragment
    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        mc.p.f325531a.b("AuthingFragment", "on attach.");
    }

    @Override // lc.i, android.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        int i17;
        boolean z17;
        mc.q qVar = mc.p.f325531a;
        qVar.e("AuthingFragment", "onCreateView!");
        if (this.f317844d == null) {
            int i18 = ic.d.f290281k;
            com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig = ic.c.f290280a.f290290i;
            if (huiYanSdkConfig == null || !huiYanSdkConfig.isLandMode()) {
                i17 = com.tencent.mm.R.layout.eq8;
                z17 = false;
            } else {
                i17 = com.tencent.mm.R.layout.eq9;
                z17 = true;
            }
            com.tencent.cloud.huiyan.entity.AuthUiConfig authUiConfig = this.B;
            if (authUiConfig != null && !z17 && authUiConfig.getAuthLayoutResId() != -1) {
                i17 = this.B.getAuthLayoutResId();
            }
            com.tencent.cloud.huiyan.entity.AuthUiConfig authUiConfig2 = this.B;
            if (authUiConfig2 != null && z17 && authUiConfig2.getLandAuthLayoutResId() != -1) {
                i17 = this.B.getLandAuthLayoutResId();
            }
            android.view.View inflate = layoutInflater.inflate(i17, viewGroup, false);
            this.f317844d = inflate;
            this.f317807e = (oc.a) inflate.findViewById(com.tencent.mm.R.id.vjr);
            this.f317844d.findViewById(com.tencent.mm.R.id.vjt).setOnClickListener(new android.view.View.OnClickListener() { // from class: lc.g$$e
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lc.g gVar = lc.g.this;
                    gVar.getClass();
                    mc.p.f325531a.b("AuthingFragment", "user cancel the auth check.");
                    java.lang.String string = gVar.b().getString(com.tencent.mm.R.string.piu);
                    int i19 = ic.d.f290281k;
                    ic.c.f290280a.getClass();
                    pc.l.f353211a.f353212a.name();
                    mc.k.f325525a.a();
                    pc.o oVar = gVar.f317819t;
                    if (oVar != null) {
                        oVar.a();
                    }
                    mc.d.f325515a.f325498b = null;
                    pc.f.c(212, string);
                }
            });
            this.f317808f = (android.widget.ImageView) this.f317844d.findViewById(com.tencent.mm.R.id.vjs);
            this.f317809g = (android.widget.TextView) this.f317844d.findViewById(com.tencent.mm.R.id.vjo);
            this.f317810h = (android.widget.TextView) this.f317844d.findViewById(com.tencent.mm.R.id.vjn);
            this.f317814o = (com.tencent.cloud.huiyan.view.LoadingFrontAnimatorView) this.f317844d.findViewById(com.tencent.mm.R.id.vjq);
            this.f317811i = (android.widget.TextView) this.f317844d.findViewById(com.tencent.mm.R.id.vjv);
            this.f317812m = (android.widget.TextView) this.f317844d.findViewById(com.tencent.mm.R.id.vjt);
            pc.o oVar = new pc.o();
            this.f317819t = oVar;
            android.widget.TextView textView = this.f317810h;
            oVar.f353218e.clear();
            oVar.f353216c = textView;
            if (oVar.f353214a == null) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("showTips");
                oVar.f353214a = handlerThread;
                handlerThread.start();
                oVar.f353215b = new pc.n(oVar, oVar.f353214a.getLooper());
                if (oVar.f353215b != null) {
                    try {
                        android.os.Message obtainMessage = oVar.f353215b.obtainMessage();
                        obtainMessage.what = 1;
                        oVar.f353215b.sendMessageDelayed(obtainMessage, 1000L);
                    } catch (java.lang.Exception e17) {
                        mc.p.f325531a.e("ShowTipsHelper", "failed to send wait extra tips event" + e17.getLocalizedMessage());
                    }
                }
            }
            this.f317809g.setText(com.tencent.mm.R.string.piz);
            com.tencent.cloud.huiyan.view.CommonAuthBackView commonAuthBackView = (com.tencent.cloud.huiyan.view.CommonAuthBackView) this.f317844d.findViewById(com.tencent.mm.R.id.vjl);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(commonAuthBackView, arrayList.toArray(), "com/tencent/cloud/huiyan/fragments/f", "d", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            commonAuthBackView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(commonAuthBackView, "com/tencent/cloud/huiyan/fragments/f", "d", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f317823x = false;
            com.tencent.cloud.huiyan.view.HuiYanReflectLayout huiYanReflectLayout = (com.tencent.cloud.huiyan.view.HuiYanReflectLayout) this.f317844d.findViewById(com.tencent.mm.R.id.vjp);
            this.f317813n = huiYanReflectLayout;
            huiYanReflectLayout.setBackgroundColor(b().getColor(com.tencent.mm.R.color.ane));
            if (this.f317807e instanceof android.view.View) {
                if (this.f317817r) {
                    if (this.f317808f != null) {
                        com.tencent.cloud.huiyan.entity.AuthUiConfig authUiConfig3 = this.B;
                        if (authUiConfig3 == null || !authUiConfig3.isHideAvatarGuideFrame()) {
                            this.f317808f.setScaleX(0.935f);
                            this.f317808f.setScaleY(0.935f);
                            this.f317808f.setVisibility(0);
                            this.f317808f.setImageResource(com.tencent.mm.R.drawable.d_6);
                        } else {
                            this.f317808f.setVisibility(8);
                        }
                    }
                    android.view.View view = (android.view.View) this.f317807e;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/cloud/huiyan/fragments/f", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/cloud/huiyan/fragments/f", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    this.f317808f.setVisibility(0);
                    android.view.View view2 = (android.view.View) this.f317807e;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(4);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/cloud/huiyan/fragments/f", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/cloud/huiyan/fragments/f", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            mc.d.f325515a.f325498b = new lc.e(this);
            oc.h hVar = oc.g.f344101a;
            if (!hVar.f344107f || hVar.f344105d == null) {
                qVar.e("TuringSdkHelper", "init turing sdk logic, turing is not create!");
            } else {
                hVar.f344102a = false;
                oc.e eVar = new oc.e();
                if (!hVar.f344107f || hVar.f344105d == null) {
                    qVar.e("TuringSdkHelper", "set event listener, turing is not create!");
                } else {
                    hVar.f344105d.f344100a = eVar;
                }
                hVar.f344106e = new mc.r();
            }
            pc.c.f353202a.f353203a = new com.tencent.cloud.component.common.ai.utils.SimplePool(20, "FrameCreatePool");
            pc.a.f353200a.f353201a = new com.tencent.cloud.component.common.ai.utils.SimplePool(10, "ChangeBytePool");
            com.tencent.cloud.huiyan.entity.AuthUiConfig authUiConfig4 = this.B;
            if (authUiConfig4 != null) {
                if (this.f317813n != null && authUiConfig4.getAuthLayoutBgColor() != 0) {
                    this.f317813n.setBackgroundColor(this.B.getAuthLayoutBgColor());
                }
                if (this.f317809g != null && this.B.getFeedBackTxtColor() != 0) {
                    this.f317809g.setTextColor(this.B.getFeedBackTxtColor());
                }
                if (this.f317810h != null && this.B.getFeedBackExtraTipColor() != 0) {
                    this.f317810h.setTextColor(this.B.getFeedBackExtraTipColor());
                }
                if (this.B.isTransparentStatusBar()) {
                    android.widget.TextView textView2 = this.f317812m;
                    if (textView2 != null) {
                        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) textView2.getLayoutParams();
                        layoutParams.topMargin = java.lang.Math.round(this.f317812m.getResources().getDisplayMetrics().density * this.B.getTransparentStatusBarMoveHeight()) + layoutParams.topMargin;
                        this.f317812m.setLayoutParams(layoutParams);
                    }
                    android.widget.TextView textView3 = this.f317811i;
                    if (textView3 != null) {
                        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) textView3.getLayoutParams();
                        layoutParams2.topMargin = java.lang.Math.round(this.f317811i.getResources().getDisplayMetrics().density * this.B.getTransparentStatusBarMoveHeight()) + layoutParams2.topMargin;
                        this.f317811i.setLayoutParams(layoutParams2);
                    }
                }
            }
            android.app.Activity activity = getActivity();
            if (activity == null) {
                qVar.e("AuthingFragment", "activity is null!");
            } else {
                nc.c cVar = nc.b.f336091a;
                java.lang.String[] strArr = pc.k.f353210a;
                lc.a aVar = new lc.a(this);
                cVar.f336092a = aVar;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                if (activity.checkSelfPermission(strArr[0]) != 0) {
                    arrayList4.add(strArr[0]);
                }
                java.lang.String[] strArr2 = (java.lang.String[]) arrayList4.toArray(new java.lang.String[arrayList4.size()]);
                if (strArr2.length > 0) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(119);
                    arrayList5.add(strArr2);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(activity, arrayList5.toArray(), "com/tencent/cloud/huiyan/permission/b", "a", "(Landroid/app/Activity;[Ljava/lang/String;Lcom/tencent/cloud/huiyan/fragments/a;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                    activity.requestPermissions((java.lang.String[]) arrayList5.get(0), ((java.lang.Integer) arrayList5.get(1)).intValue());
                    yj0.a.f(activity, "com/tencent/cloud/huiyan/permission/b", "a", "(Landroid/app/Activity;[Ljava/lang/String;Lcom/tencent/cloud/huiyan/fragments/a;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                } else {
                    aVar.a();
                }
            }
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // lc.i, android.app.Fragment
    public final void onDestroy() {
        int i17;
        super.onDestroy();
        mc.q qVar = mc.p.f325531a;
        qVar.b("AuthingFragment", "on destroy.");
        this.f317823x = false;
        qc.b bVar = this.f317822w;
        if (bVar != null) {
            bVar.dismiss();
            this.f317822w = null;
        }
        if (this.f317807e != null) {
            this.f317807e = null;
        }
        if (this.f317814o != null) {
            this.f317814o = null;
        }
        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig = ic.c.f290280a.f290290i;
        if (huiYanSdkConfig != null && huiYanSdkConfig.isAutoScreenBrightness() && (i17 = this.f317816q) != -1) {
            a(new lc.g$$a(this, i17));
        }
        com.tencent.cloud.aicamare.CameraHolder cameraHolder = this.f317820u;
        oc.h hVar = oc.g.f344101a;
        if (cameraHolder != null) {
            this.f317820u.release();
            hVar.a();
        }
        mc.k.f325525a.a();
        mc.c cVar = mc.d.f325515a;
        cVar.getClass();
        qVar.b("AuthStateManager", "doReleaseListenerAndCacheObj");
        if (cVar.f325498b != null) {
            cVar.f325498b = null;
        }
        if (cVar.f325497a != null) {
            cVar.f325497a = null;
        }
        if (cVar.f325503g != null) {
            cVar.f325503g = null;
        }
        cVar.f325499c = false;
        cVar.f325512p = false;
        cVar.f325506j = com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NONE;
        com.tencent.cloud.huiyan.view.LoadingFrontAnimatorView loadingFrontAnimatorView = this.f317814o;
        if (loadingFrontAnimatorView != null) {
            loadingFrontAnimatorView.c(true);
        }
        pc.o oVar = this.f317819t;
        if (oVar != null) {
            oVar.a();
        }
        mc.r rVar = hVar.f344106e;
        if (rVar != null) {
            qVar.b("VideoRecorderManager", "freeAndRelease!");
            while (rVar.f325540a.size() > 0) {
                pc.c.f353202a.a((byte[]) rVar.f325540a.poll());
            }
            rVar.f325549j = true;
            rVar.f325550k = true;
            rVar.f325555p = false;
            rVar.f325556q = true;
        }
        hVar.f344103b = false;
        hVar.f344102a = false;
        hVar.a();
        this.f317808f = null;
        this.f317809g = null;
        this.f317810h = null;
        this.f317811i = null;
        this.f317812m = null;
        this.f317813n = null;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f317807e instanceof android.view.View) {
            if (!this.f317817r) {
                this.f317808f.setVisibility(0);
                android.view.View view = (android.view.View) this.f317807e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/cloud/huiyan/fragments/f", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/cloud/huiyan/fragments/f", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (this.f317808f != null) {
                com.tencent.cloud.huiyan.entity.AuthUiConfig authUiConfig = this.B;
                if (authUiConfig == null || !authUiConfig.isHideAvatarGuideFrame()) {
                    this.f317808f.setScaleX(0.935f);
                    this.f317808f.setScaleY(0.935f);
                    this.f317808f.setVisibility(0);
                    this.f317808f.setImageResource(com.tencent.mm.R.drawable.d_6);
                } else {
                    this.f317808f.setVisibility(8);
                }
            }
            android.view.View view2 = (android.view.View) this.f317807e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/cloud/huiyan/fragments/f", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/cloud/huiyan/fragments/f", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        int i17 = ic.d.f290281k;
        ic.d dVar = ic.c.f290280a;
        android.content.Context a17 = dVar.a();
        boolean z17 = false;
        if (a17 != null) {
            java.lang.String[] strArr = pc.k.f353210a;
            android.content.pm.PackageManager packageManager = a17.getPackageManager();
            if (packageManager == null) {
                com.tencent.cloud.component.common.ai.log.AiLog.error("PermissionUtils", "checkPermissions packageManager is null");
            } else {
                if (packageManager.checkPermission(strArr[0], a17.getPackageName()) == 0) {
                    z17 = true;
                }
            }
        }
        if (!z17) {
            super.onStop();
            return;
        }
        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig = dVar.f290290i;
        if (huiYanSdkConfig == null || !huiYanSdkConfig.isBackgroundStopAuth()) {
            super.onStop();
            return;
        }
        if (dVar.f290285d) {
            super.onStop();
            return;
        }
        if (!this.f317818s) {
            super.onStop();
            return;
        }
        if (this.f317820u != null) {
            this.f317820u.release();
        }
        if (getContext() != null) {
            pc.l.f353211a.f353212a.name();
            java.lang.String string = b().getString(com.tencent.mm.R.string.piy);
            com.tencent.cloud.huiyan.entity.AuthUiConfig authUiConfig = this.B;
            boolean isShowErrorDialog = authUiConfig != null ? authUiConfig.isShowErrorDialog() : true;
            int i18 = 214;
            if (isShowErrorDialog) {
                a(new lc.g$$f(this, i18, string));
            } else {
                pc.f.c(214, string);
            }
        }
        super.onStop();
    }
}
