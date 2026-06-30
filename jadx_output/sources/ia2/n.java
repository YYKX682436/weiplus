package ia2;

/* loaded from: classes2.dex */
public final class n implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity f289952d;

    public n(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity) {
        this.f289952d = finderFlutterPOIActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String string;
        int i17;
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = this.f289952d;
        if (!finderFlutterPOIActivity.V) {
            finderFlutterPOIActivity.V = true;
            finderFlutterPOIActivity.setBounceEnabled(false);
            if (finderFlutterPOIActivity.C && !finderFlutterPOIActivity.D) {
                java.lang.ref.WeakReference weakReference = finderFlutterPOIActivity.f101781u;
                android.app.Activity activity = weakReference != null ? (androidx.fragment.app.FragmentActivity) weakReference.get() : null;
                if (activity == null) {
                    activity = finderFlutterPOIActivity.getContainerActivity();
                }
                com.tencent.mm.ui.bl.c(activity == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : activity);
                com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
                java.lang.System.nanoTime();
                if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.bk.Q()) {
                    com.tencent.mm.ui.bk.A();
                }
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                com.tencent.mm.ui.bl.b(activity);
                com.tencent.mm.ui.bl.c(activity);
                com.tencent.mm.ui.bl.g(activity);
                gx2.q qVar = finderFlutterPOIActivity.f101776J;
                if (qVar != null) {
                    qVar.setExpandHeightAndLayoutIfNeeded(finderFlutterPOIActivity.j7(activity));
                }
            }
            double d17 = finderFlutterPOIActivity.f101791z1;
            float a17 = d17 <= 0.0d ? ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 191.0f) : (float) (ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 86.0f) + d17);
            if (!finderFlutterPOIActivity.D) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "initViews: updatePeekHeight " + a17);
                gx2.q qVar2 = finderFlutterPOIActivity.f101776J;
                if (qVar2 != null) {
                    qVar2.p(a17);
                }
                gx2.q qVar3 = finderFlutterPOIActivity.f101776J;
                if (qVar3 != null) {
                    com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(qVar3, false, null, false, null, 14, null);
                }
                android.view.View view = new android.view.View(finderFlutterPOIActivity.getContainerActivity());
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 58.0f));
                layoutParams.gravity = 80;
                view.setLayoutParams(layoutParams);
                view.setBackground(finderFlutterPOIActivity.getResources().getDrawable(com.tencent.mm.R.drawable.cyh, null));
                finderFlutterPOIActivity.K = view;
                gx2.q qVar4 = finderFlutterPOIActivity.f101776J;
                if (qVar4 != null) {
                    qVar4.addView(view);
                }
            }
            if (finderFlutterPOIActivity.L && !finderFlutterPOIActivity.D) {
                android.content.Context containerActivity = finderFlutterPOIActivity.getContainerActivity();
                if (containerActivity == null) {
                    containerActivity = com.tencent.mm.sdk.platformtools.x2.f193071a;
                }
                int c17 = com.tencent.mm.ui.bl.c(containerActivity);
                android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
                int i18 = b17.x;
                int i19 = b17.y;
                java.lang.System.nanoTime();
                boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (z17) {
                    i17 = i19 - c17;
                } else {
                    if (i19 >= i18) {
                        i18 = i19;
                    }
                    i17 = i18 - c17;
                }
                float f17 = i17 * 0.25f;
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "initViews: setTran " + f17);
                gx2.q qVar5 = finderFlutterPOIActivity.f101776J;
                if (qVar5 != null) {
                    qVar5.isSettling = true;
                    android.view.animation.Interpolator loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(qVar5.getContext(), com.tencent.mm.R.anim.f477822cg);
                    qVar5.a();
                    android.view.View view2 = qVar5.f131932d;
                    if (view2 == null) {
                        kotlin.jvm.internal.o.o("contentView");
                        throw null;
                    }
                    android.view.ViewPropertyAnimator translationX = qVar5.c() ? view2.animate().translationX(f17) : view2.animate().translationY(f17);
                    kotlin.jvm.internal.o.d(translationX);
                    translationX.setDuration(0L).setInterpolator(loadInterpolator).setUpdateListener(new gx2.t(qVar5, f17)).setListener(new gx2.u(qVar5)).start();
                }
                finderFlutterPOIActivity.q7(true);
            }
            yz5.l lVar = finderFlutterPOIActivity.M;
            if (lVar != null) {
            }
            if (finderFlutterPOIActivity.f101782v == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "setupFlutter: isFinderHalfScreen=" + finderFlutterPOIActivity.D + ", showTakeCar=" + finderFlutterPOIActivity.E + ", showETA=" + finderFlutterPOIActivity.F);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                byte[] p76 = finderFlutterPOIActivity.p7();
                if (p76 != null) {
                    linkedHashMap.put(java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.POI_INFO.getRaw()), p76);
                }
                bw5.ah0 ah0Var = finderFlutterPOIActivity.f101790z;
                byte[] byteArray = ah0Var != null ? ah0Var.toByteArray() : null;
                if (byteArray != null) {
                    linkedHashMap.put(java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.POI_SERVICE_INFO.getRaw()), byteArray);
                }
                linkedHashMap.put(java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.POI_FAV_SELECTED.getRaw()), java.lang.Boolean.valueOf(finderFlutterPOIActivity.A));
                linkedHashMap.put(java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.POI_IS_FINDER_HALF_SCREEN.getRaw()), java.lang.Boolean.valueOf(finderFlutterPOIActivity.D));
                linkedHashMap.put(java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.POI_SHOW_TAKE_CAR_BTN.getRaw()), java.lang.Boolean.valueOf(finderFlutterPOIActivity.E));
                linkedHashMap.put(java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.POI_DATA_REPORT_JSON.getRaw()), finderFlutterPOIActivity.i7(false));
                linkedHashMap.put(java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.POI_DATA_REPORT_JSON_FOR_PAGE.getRaw()), finderFlutterPOIActivity.i7(true));
                linkedHashMap.put(java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.POI_ENABLE_SHOW_ETA.getRaw()), java.lang.Boolean.valueOf(finderFlutterPOIActivity.F));
                linkedHashMap.put(java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.POI_AUTH_SCENE.getRaw()), java.lang.Integer.valueOf(finderFlutterPOIActivity.G));
                java.lang.String valueOf = java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.POI_DETAIL_REPORT_MODEL.getRaw());
                bw5.yg0 yg0Var = new bw5.yg0();
                r45.f96 f96Var = finderFlutterPOIActivity.f101784x;
                java.lang.String str6 = "";
                if (f96Var == null || (str = f96Var.getString(17)) == null) {
                    str = "";
                }
                yg0Var.f35480e = str;
                boolean[] zArr = yg0Var.f35484i;
                int i27 = 2;
                zArr[2] = true;
                yg0Var.f35482g = finderFlutterPOIActivity.D1;
                zArr[4] = true;
                java.lang.Integer num = finderFlutterPOIActivity.E1;
                yg0Var.f35483h = num != null ? num.intValue() : 0;
                zArr[5] = true;
                r45.f96 f96Var2 = finderFlutterPOIActivity.f101784x;
                if (f96Var2 == null || (str2 = f96Var2.getString(5)) == null) {
                    str2 = "";
                }
                yg0Var.f35479d = str2;
                zArr[1] = true;
                yg0Var.f35481f = finderFlutterPOIActivity.D ? 2 : 1;
                zArr[3] = true;
                byte[] byteArray2 = yg0Var.toByteArray();
                kotlin.jvm.internal.o.f(byteArray2, "toByteArray(...)");
                linkedHashMap.put(valueOf, byteArray2);
                java.lang.String valueOf2 = java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.POI_ETAREPORT_MODEL.getRaw());
                r45.f96 f96Var3 = finderFlutterPOIActivity.f101784x;
                if (f96Var3 == null || (str3 = f96Var3.getString(5)) == null) {
                    str3 = "";
                }
                bw5.zg0 zg0Var = new bw5.zg0();
                android.os.Bundle bundleExtra = finderFlutterPOIActivity.getIntent().getBundleExtra("poi_from_chat_report_bundle");
                if (bundleExtra != null && (string = bundleExtra.getString("poi_from_chat_name")) != null) {
                    str6 = string;
                }
                zg0Var.f35982d = str6;
                boolean[] zArr2 = zg0Var.f35990o;
                zArr2[1] = true;
                zg0Var.f35984f = bundleExtra != null ? bundleExtra.getInt("poi_from_chat_type") : 0;
                zArr2[3] = true;
                zg0Var.f35983e = bundleExtra != null ? bundleExtra.getInt("poi_from_user_type") : 0;
                zArr2[2] = true;
                boolean z18 = bundleExtra != null ? bundleExtra.getBoolean("poi_from_chat_is_nearby", false) : false;
                finderFlutterPOIActivity.f101777l1 = z18;
                if (z18) {
                    i27 = 1;
                } else if (r26.i0.y(str3, "UgcPoiEx_", false)) {
                    i27 = 3;
                }
                zg0Var.f35986h = i27;
                zArr2[5] = true;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("poiAttrType:");
                sb6.append(i27);
                sb6.append(", poiId=");
                sb6.append(str3);
                sb6.append(", poiName=");
                r45.f96 f96Var4 = finderFlutterPOIActivity.f101784x;
                sb6.append(f96Var4 != null ? f96Var4.getString(3) : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", sb6.toString());
                byte[] byteArray3 = zg0Var.toByteArray();
                kotlin.jvm.internal.o.f(byteArray3, "toByteArray(...)");
                linkedHashMap.put(valueOf2, byteArray3);
                linkedHashMap.put(java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.POI_DETAIL_SHOW_FINDER_STREAM_CONTENT.getRaw()), java.lang.Boolean.valueOf(finderFlutterPOIActivity.C));
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a), null, null, new ia2.b0(finderFlutterPOIActivity, linkedHashMap, null), 3, null);
            }
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) finderFlutterPOIActivity.findViewById(com.tencent.mm.R.id.rl7);
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(finderFlutterPOIActivity.f101788y0);
        }
        finderFlutterPOIActivity.f101788y0 = null;
    }
}
