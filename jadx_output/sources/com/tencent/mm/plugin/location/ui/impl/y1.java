package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class y1 extends com.tencent.mm.plugin.location.ui.impl.q2 {

    /* renamed from: y1, reason: collision with root package name */
    public static final java.lang.String f144948y1 = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxu) + "/tencentMapTouch/app/download/apkForWXAndroidConf.json";
    public za3.i1 S;
    public com.tencent.mm.plugin.location.ui.impl.LocationCrossHairView T;
    public android.view.View U;
    public za3.h V;
    public android.view.View W;
    public java.util.Map X;
    public int Y;
    public zy2.q9 Z;

    /* renamed from: l1, reason: collision with root package name */
    public final java.lang.Runnable f144949l1;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f144950p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.view.View f144951p1;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f144952x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f144953x1;

    /* renamed from: y0, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f144954y0;

    public y1(android.app.Activity activity) {
        super(activity);
        this.f144950p0 = false;
        this.f144952x0 = false;
        this.f144954y0 = new com.tencent.mm.sdk.platformtools.n3();
        this.f144949l1 = new com.tencent.mm.plugin.location.ui.impl.b2(this);
        this.f144953x1 = false;
        new java.util.HashMap();
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2
    public void A() {
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2
    public void C() {
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2
    public void D() {
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2
    public void E(double d17, double d18, int i17, double d19) {
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2
    public void G(java.lang.String str) {
        if (this.Z == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", str);
        ((com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) this.Z).n7("view_clk", hashMap);
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2
    public void H() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f144728d, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.location.ui.impl.z1(this, null);
        k0Var.f211881s = new com.tencent.mm.plugin.location.ui.impl.a2(this);
        k0Var.v();
    }

    public final int J() {
        int intExtra = n().getIntExtra("type_tag", 0);
        if (intExtra != 0) {
            return com.tencent.mm.plugin.location.ui.impl.s.a(intExtra);
        }
        int i17 = this.f144730f;
        if (i17 == 10) {
            return 4;
        }
        if (i17 == 12) {
            return 5;
        }
        int i18 = 7;
        if (i17 == 7) {
            return 6;
        }
        if (i17 != 2) {
            i18 = 11;
            if (i17 == 11) {
                return 8;
            }
            if (i17 == 13) {
                return 9;
            }
            if (i17 != 14) {
                return 0;
            }
        }
        return i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b A[RETURN] */
    @Override // ab3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.view.KeyEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getKeyCode()
            r1 = 1
            r2 = 0
            r3 = 4
            if (r0 != r3) goto L5c
            int r0 = r13.getAction()
            if (r0 != 0) goto L5c
            zy2.q9 r0 = r12.Z
            if (r0 == 0) goto L5c
            com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity r0 = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) r0
            boolean r4 = r0.L
            if (r4 != 0) goto L58
            gx2.q r4 = r0.f101776J
            r5 = 0
            if (r4 == 0) goto L23
            float r4 = r4.getTranslation()
            goto L24
        L23:
            r4 = r5
        L24:
            gx2.q r6 = r0.f101776J
            if (r6 == 0) goto L2c
            float r5 = r6.getBorderPeek()
        L2c:
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L58
            gx2.q r5 = r0.f101776J
            if (r5 == 0) goto L3e
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 14
            r11 = 0
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(r5, r6, r7, r8, r9, r10, r11)
        L3e:
            ia2.n0 r4 = r0.f101782v
            if (r4 == 0) goto L4f
            com.tencent.pigeon.finder.POIFlutterAPI r4 = r4.f289955f
            if (r4 == 0) goto L4f
            java.lang.String r5 = "scrollToTop"
            yz5.l r5 = ia2.q0.a(r5)
            r4.scrollToTop(r5)
        L4f:
            boolean r4 = r0.D
            if (r4 != 0) goto L56
            r0.q7(r2)
        L56:
            r0 = r1
            goto L59
        L58:
            r0 = r2
        L59:
            if (r0 == 0) goto L5c
            return r1
        L5c:
            int r0 = r13.getKeyCode()
            if (r0 != r3) goto L71
            int r13 = r13.getAction()
            if (r13 != 0) goto L71
            r12.j()
            android.app.Activity r13 = r12.f144728d
            r13.finish()
            goto L72
        L71:
            r1 = r2
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.location.ui.impl.y1.a(android.view.KeyEvent):boolean");
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2, ab3.e
    public void c(int i17, int i18, android.content.Intent intent) {
        super.c(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2, ab3.e
    public void e(android.os.Bundle bundle) {
        java.lang.Integer num;
        boolean z17;
        java.lang.String Cj;
        int i17;
        super.e(bundle);
        this.f144950p0 = n().getBooleanExtra("key_drawer_expend", false);
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_TENCENT_MAP_COUNT_INT, 0)).intValue();
        this.Y = intValue;
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackMapUI", "count: %s", java.lang.Integer.valueOf(intValue));
        this.f144731g.f144594p = n().getStringExtra("kPoiid");
        java.util.HashMap hashMap = new java.util.HashMap();
        int J2 = J();
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = this.f144731g;
        hashMap.put("poiid", locationInfo.f144594p);
        hashMap.put("poi_biz_source", java.lang.Integer.valueOf(J2));
        java.lang.String str = locationInfo.f144594p;
        hashMap.put("is_official_poi", java.lang.Integer.valueOf((str == null || !str.startsWith("UgcPoiEx_")) ? 1 : 0));
        android.app.Activity activity = this.f144728d;
        hashMap.put("qqmap_installed", java.lang.Integer.valueOf(va3.w.c(activity, "com.tencent.map") != null ? 1 : 2));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        kotlin.jvm.internal.o.g(activity, "activity");
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(activity);
        cy1.a aVar2 = (cy1.a) aVar.ak(activity, iy1.c.TrackMapUI);
        aVar2.dk(activity, "TrackMapUI");
        aVar2.gk(activity, hashMap);
        aVar2.ik(activity, 4, 27051);
        if (q()) {
            r45.f96 f96Var = new r45.f96();
            com.tencent.mm.plugin.location.model.LocationInfo locationInfo2 = this.f144731g;
            java.lang.String str2 = locationInfo2.f144594p;
            if (str2 == null || !str2.startsWith("nearby")) {
                z17 = false;
            } else {
                str2 = str2.replace("nearby", "qqmap");
                z17 = true;
            }
            f96Var.set(5, str2);
            f96Var.set(3, locationInfo2.f144591m);
            f96Var.set(4, locationInfo2.f144589h);
            f96Var.set(0, java.lang.Float.valueOf((float) locationInfo2.f144587f));
            f96Var.set(1, java.lang.Float.valueOf((float) locationInfo2.f144586e));
            com.tencent.mars.xlog.Log.i("MicroMsg.TrackMapUI", "initFinderPoiDrawer: name=%s, locationInfo.slat=%s, locationInfo.slong=%s", locationInfo2.f144591m, java.lang.Double.valueOf(locationInfo2.f144586e), java.lang.Double.valueOf(locationInfo2.f144587f));
            f96Var.set(16, java.lang.Boolean.valueOf(n().getBooleanExtra("KIsFromPoiList", false)));
            f96Var.set(17, n().getStringExtra("KPoiCategoryTips"));
            f96Var.set(18, n().getStringExtra("kPoiBusinessHour"));
            f96Var.set(19, n().getStringExtra("KPoiPhone"));
            f96Var.set(20, java.lang.Float.valueOf(n().getFloatExtra("KPoiPriceTips", 0.0f)));
            boolean booleanExtra = n().getBooleanExtra("key_drawer_allow_no_poiid", false);
            boolean booleanExtra2 = n().getBooleanExtra("key_drawer_expend", false);
            long longExtra = n().getLongExtra("key_from_object_id", 0L);
            android.os.Bundle bundleExtra = n().getBundleExtra("poi_from_chat_report_bundle");
            if (bundleExtra != null) {
                bundleExtra.putBoolean("poi_from_chat_is_nearby", z17);
                n().putExtra("poi_from_chat_report_bundle", bundleExtra);
                com.tencent.mars.xlog.Log.i("MicroMsg.TrackMapUI", "initFinderPoiDrawer: isNearByPoi %s", java.lang.Boolean.valueOf(z17));
            }
            android.view.View view = this.V.f470921d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "initFinderPoiDrawer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "initFinderPoiDrawer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            androidx.fragment.app.FragmentActivity context = (androidx.fragment.app.FragmentActivity) this.f144728d;
            java.io.Serializable serializable = this.E;
            if (serializable == null) {
                serializable = zy2.o9.f477518f;
            }
            int J3 = J();
            kotlin.jvm.internal.o.g(context, "context");
            num = 0;
            context.getIntent().getBooleanExtra("key_enable_flutter_poi", false);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_from_type", serializable);
            intent.putExtra("key_drawer_allow_no_poiid", booleanExtra);
            intent.putExtra("key_location", f96Var.toByteArray());
            intent.putExtra("key_biz_source", J3);
            intent.putExtra("KEY_ENTER_MEDIA_TAB_TYPE", context.getIntent().getIntExtra("KEY_ENTER_MEDIA_TAB_TYPE", 0));
            intent.putExtra("key_from_object_id", longExtra);
            intent.putExtra("key_show_take_car_button", true);
            intent.putExtra("map_view_type", context.getIntent().getIntExtra("map_view_type", 0));
            intent.putExtra("poi_from_chat_report_bundle", context.getIntent().getBundleExtra("poi_from_chat_report_bundle"));
            intent.putExtra("kMsgId", context.getIntent().getLongExtra("kMsgId", -1L));
            java.lang.String stringExtra = context.getIntent().getStringExtra("map_talker_name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            intent.putExtra("map_talker_name", stringExtra);
            java.lang.String stringExtra2 = context.getIntent().getStringExtra("key_context_id");
            if (stringExtra2 == null || stringExtra2.length() == 0) {
                if (J3 != 8) {
                    intent.putExtra("key_poi_drawer_report_stay", true);
                }
                switch (J3) {
                    case 1:
                        i17 = 2;
                        break;
                    case 2:
                        i17 = 3;
                        break;
                    case 3:
                    default:
                        i17 = 0;
                        break;
                    case 4:
                        i17 = 15;
                        break;
                    case 5:
                    case 7:
                        i17 = 43;
                        break;
                    case 6:
                        i17 = 4;
                        break;
                    case 8:
                        i17 = 1;
                        break;
                }
                Cj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(i17, 36, 81, intent);
            } else {
                Cj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(stringExtra2, intent);
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderPoiService", "poi contextId %s", Cj);
            int i18 = com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.H1;
            intent.putExtra("key_half_screen_mode", la2.a.f317500d);
            intent.putExtra("key_drawer_expend", booleanExtra2);
            intent.putExtra("key_from_type", (zy2.o9) serializable);
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            frameLayout.setId(com.tencent.mm.R.id.g3u);
            com.tencent.mm.ui.vas.VASCommonFragment a17 = lk5.q0.a(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.class, intent, false, false, false, null, 60, null);
            androidx.fragment.app.i2 beginTransaction = context.getSupportFragmentManager().beginTransaction();
            kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
            beginTransaction.l(-1, -1, 0, 0);
            beginTransaction.k(com.tencent.mm.R.id.g3u, a17, null);
            beginTransaction.f();
            com.tencent.mm.ui.vas.VASActivity vASActivity = a17.f211121p;
            kotlin.jvm.internal.o.e(vASActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity");
            com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) vASActivity;
            com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.m7(finderFlutterPOIActivity, context, a17, null, frameLayout, java.lang.Integer.valueOf(android.R.id.content), java.lang.Integer.valueOf(intent.getIntExtra("key_biz_source", 0)), 0, 68, null);
            this.Z = finderFlutterPOIActivity;
            finderFlutterPOIActivity.M = new yz5.l() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$b
                @Override // yz5.l
                public final java.lang.Object invoke(java.lang.Object obj) {
                    float floatValue = ((java.lang.Float) obj).floatValue();
                    com.tencent.mm.plugin.location.ui.impl.y1 y1Var = com.tencent.mm.plugin.location.ui.impl.y1.this;
                    y1Var.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.TrackMapUI", "drawer peek height change %s", java.lang.Float.valueOf(floatValue));
                    android.view.ViewGroup.LayoutParams layoutParams = y1Var.T.getLayoutParams();
                    if (layoutParams != null) {
                        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) floatValue;
                        y1Var.T.setLayoutParams(layoutParams);
                    }
                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) y1Var.m(com.tencent.mm.R.id.jbp);
                    if (frameLayout2 != null) {
                        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) frameLayout2.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                        }
                        layoutParams2.height = (com.tencent.mm.ui.bl.b(frameLayout2.getContext()).y - com.tencent.mm.ui.bl.g(frameLayout2.getContext())) - ((int) floatValue);
                        frameLayout2.setLayoutParams(layoutParams2);
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.TrackMapUI", "handleDrawerPeekHeightChange: mapcontent null");
                    }
                    y1Var.f144741t.setLogoMargin(new int[]{24, 24});
                    return java.lang.Boolean.TRUE;
                }
            };
            finderFlutterPOIActivity.N = new yz5.p() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$c
                @Override // yz5.p
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    double floatValue = ((java.lang.Float) obj).floatValue();
                    double floatValue2 = ((java.lang.Float) obj2).floatValue();
                    com.tencent.mm.plugin.location.ui.impl.y1 y1Var = com.tencent.mm.plugin.location.ui.impl.y1.this;
                    java.io.Serializable serializable2 = y1Var.E;
                    if (serializable2 == zy2.o9.f477517e || serializable2 == zy2.o9.f477516d) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.TrackMapUI", "onLatLngUpdate: lat %s lng %s", java.lang.Double.valueOf(floatValue), java.lang.Double.valueOf(floatValue2));
                        y1Var.F = false;
                        com.tencent.mm.plugin.location.model.LocationInfo locationInfo3 = y1Var.f144731g;
                        locationInfo3.f144586e = floatValue;
                        locationInfo3.f144587f = floatValue2;
                        y1Var.f144733i.f144804f.getIController().setZoom(y1Var.f144739r);
                        y1Var.u(locationInfo3);
                        za3.l1 l1Var = y1Var.B;
                        l1Var.getClass();
                        double d17 = locationInfo3.f144586e;
                        l1Var.f470982e = d17;
                        double d18 = locationInfo3.f144587f;
                        l1Var.f470983f = d18;
                        if (va3.w.d(d17, d18)) {
                            u60.h hVar = new u60.h(locationInfo3.f144586e, locationInfo3.f144587f);
                            hVar.f424873f = locationInfo3.f144585d;
                            ((i11.g) y1Var.f144735n).b(hVar, y1Var.f144745x);
                        }
                    }
                    return java.lang.Boolean.TRUE;
                }
            };
            finderFlutterPOIActivity.P = new yz5.p() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$d
                @Override // yz5.p
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    float floatValue = ((java.lang.Float) obj).floatValue();
                    float floatValue2 = ((java.lang.Float) obj2).floatValue();
                    com.tencent.mm.plugin.location.ui.impl.y1 y1Var = com.tencent.mm.plugin.location.ui.impl.y1.this;
                    if (y1Var.f144950p0 && floatValue2 >= 0.0f) {
                        if (!y1Var.f144953x1) {
                            y1Var.f144741t.setTranslationY((-java.lang.Math.abs(floatValue2 - floatValue)) / 2.0f);
                        }
                        if (floatValue >= floatValue2) {
                            y1Var.f144953x1 = true;
                            y1Var.f144741t.setTranslationY(0.0f);
                        }
                    }
                    return jz5.f0.f302826a;
                }
            };
            finderFlutterPOIActivity.Q = new yz5.q() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$e
                @Override // yz5.q
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    android.view.View view2;
                    float floatValue = ((java.lang.Float) obj).floatValue();
                    ((java.lang.Float) obj2).floatValue();
                    boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
                    com.tencent.mm.plugin.location.ui.impl.y1 y1Var = com.tencent.mm.plugin.location.ui.impl.y1.this;
                    y1Var.getClass();
                    if (!booleanValue && floatValue >= 0.0f && (view2 = y1Var.U) != null) {
                        view2.setTranslationY(-floatValue);
                    }
                    return java.lang.Boolean.TRUE;
                }
            };
            finderFlutterPOIActivity.R = new yz5.a() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$f
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.plugin.location.ui.impl.y1.this.f144952x0 = true;
                    return java.lang.Boolean.TRUE;
                }
            };
            finderFlutterPOIActivity.S = new yz5.a() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$g
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return com.tencent.mm.plugin.location.ui.impl.y1.this.f144732h;
                }
            };
            finderFlutterPOIActivity.T = new yz5.a() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$h
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return com.tencent.mm.plugin.location.ui.impl.y1.this.f144731g;
                }
            };
            finderFlutterPOIActivity.U = new yz5.a() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$i
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(com.tencent.mm.plugin.location.ui.impl.y1.this.F);
                }
            };
            android.view.View view2 = this.V.f470921d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            num = 0;
        }
        s(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.a9e));
        this.f144733i.f144805g.setVisibility(8);
        this.f144733i.f144800b.setImageDrawable(com.tencent.mm.ui.uk.e(this.f144728d, com.tencent.mm.R.raw.icons_filled_back2, -1));
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f144733i.f144800b.getLayoutParams();
        marginLayoutParams.leftMargin = (int) this.f144728d.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        marginLayoutParams.width = (int) this.f144728d.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
        marginLayoutParams.height = (int) this.f144728d.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
        this.f144733i.f144800b.setPadding(0, 0, 0, 0);
        this.f144733i.f144800b.setLayoutParams(marginLayoutParams);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) this.f144733i.f144801c.getLayoutParams();
        marginLayoutParams2.width = 0;
        marginLayoutParams2.height = 0;
        this.f144733i.f144801c.setPadding(0, 0, 0, 0);
        this.f144733i.f144801c.setLayoutParams(marginLayoutParams2);
        this.f144733i.f144801c.setBackground(null);
        this.f144733i.f144801c.setVisibility(8);
        android.app.Activity activity2 = this.f144728d;
        int h17 = com.tencent.mm.ui.bl.h(activity2);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) this.f144733i.f144806h.getLayoutParams();
        marginLayoutParams3.topMargin += h17;
        marginLayoutParams3.height = ym5.x.a(activity2, 44.0f);
        this.f144733i.f144806h.setLayoutParams(marginLayoutParams3);
        android.view.View m17 = m(com.tencent.mm.R.id.f485689in4);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(num);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(m17, arrayList3.toArray(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(m17, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f144731g.f144600v = n().getStringExtra("kBuildingID");
        this.f144731g.f144601w = n().getStringExtra("kFloorName");
        com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker = (com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker) m(com.tencent.mm.R.id.cov);
        com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap = this.f144741t.getViewManager().getTencentMap();
        if (tencentMap != null) {
            com.tencent.mm.plugin.location.model.LocationInfo locationInfo3 = this.f144731g;
            tencentMap.setIndoorFloor(locationInfo3.f144600v, locationInfo3.f144601w);
            this.f144741t.enableIndoorLevelPick(false);
            tencentMap.setIndoorEnabled(false);
            if (n().getIntExtra("map_indoor_support", 0) == 1) {
                tencentMap.setIndoorEnabled(true);
                com.tencent.mm.plugin.location.model.LocationInfo locationInfo4 = this.f144731g;
                customIndoorPicker.h1(locationInfo4.f144600v, locationInfo4.f144601w);
                customIndoorPicker.g1(tencentMap, new com.tencent.mm.plugin.location.ui.impl.c2(this, customIndoorPicker));
            }
        }
        if (com.tencent.mm.ui.b4.c(this.f144728d)) {
            android.view.View decorView = this.f144728d.getWindow().getDecorView();
            kotlin.jvm.internal.o.g(decorView, "<this>");
            com.tencent.mm.ui.a4.e(decorView, true, false, 2, null);
        }
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2, ab3.e
    public void f() {
        super.f();
        za3.i1 i1Var = this.S;
        if (i1Var != null) {
            synchronized (za3.i1.f470942x) {
                java.util.List list = i1Var.f470944b;
                if (list != null) {
                    ((java.util.ArrayList) list).clear();
                }
                i1Var.f470954l.clean();
            }
        }
        gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.appdownload.t.CTRL_INDEX, this);
        zy2.q9 q9Var = this.Z;
        if (q9Var != null) {
            ((com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) q9Var).onDestroy();
        }
    }

    @Override // ab3.e
    public void h() {
        db5.m9.a(false, new android.content.Intent().putExtra("classname", com.tencent.mm.plugin.location.ui.impl.y1.class.getName()));
        boolean equals = j62.e.g().a("clicfg_track_map_up_is_need_delay_stop_locate_and", "1", false, false).equals("1");
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackMapUI", "onPause: hasClickTakeCarBtn:%s isNeedDelayStopLocate:%s", java.lang.Boolean.valueOf(this.f144952x0), java.lang.Boolean.valueOf(equals));
        boolean z17 = this.f144952x0;
        if (z17 && equals) {
            this.f144954y0.postDelayed(this.f144949l1, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackMapUI", "doPause: hasClickTakeCarBtn:%s", java.lang.Boolean.valueOf(z17));
        i11.e eVar = this.f144744w;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f144875J);
        }
        za3.i1 i1Var = this.S;
        if (i1Var != null) {
            i1Var.b();
        }
    }

    @Override // ab3.e
    public void i() {
        db5.m9.a(true, new android.content.Intent().putExtra("classname", com.tencent.mm.plugin.location.ui.impl.y1.class.getName()));
        this.f144952x0 = false;
        this.f144954y0.removeCallbacks(this.f144949l1);
        i11.e eVar = this.f144744w;
        if (eVar != null) {
            ((i11.h) eVar).j(this.f144875J, true);
        }
        za3.i1 i1Var = this.S;
        if (i1Var != null) {
            i1Var.c();
        }
        int i17 = this.f144730f;
        if (i17 == 2 || i17 == 12 || i17 == 13) {
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            long longExtra = n().getLongExtra("kFavInfoLocalId", -1L);
            am.z9 z9Var = favoriteOperationEvent.f54243g;
            z9Var.f8532e = longExtra;
            z9Var.f8528a = 4;
            favoriteOperationEvent.e();
            am.aa aaVar = favoriteOperationEvent.f54244h;
            if (aaVar.f6135b != null) {
                java.util.ArrayList arrayList = this.f144738q;
                if (arrayList == null) {
                    this.f144738q = new java.util.ArrayList();
                } else {
                    arrayList.clear();
                }
                this.f144738q.addAll(aaVar.f6135b);
                r();
            }
        }
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.a
    public int o() {
        return com.tencent.mm.R.layout.bie;
    }

    @Override // d85.j0
    public void onBusinessPermissionDenied(java.lang.String str) {
    }

    @Override // d85.j0
    public void onBusinessPermissionGranted(java.lang.String str) {
        this.f144728d.recreate();
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackMapUI", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2
    public void w() {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        zy2.q9 q9Var = this.Z;
        if (q9Var != null) {
            com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) q9Var;
            r45.f96 f96Var = finderFlutterPOIActivity.f101784x;
            java.lang.String str = (f96Var == null || (string3 = f96Var.getString(5)) == null) ? "" : string3;
            r45.f96 f96Var2 = finderFlutterPOIActivity.f101784x;
            java.lang.String str2 = (f96Var2 == null || (string2 = f96Var2.getString(3)) == null) ? "" : string2;
            r45.f96 f96Var3 = finderFlutterPOIActivity.f101784x;
            java.lang.String str3 = (f96Var3 == null || (string = f96Var3.getString(4)) == null) ? "" : string;
            r45.f96 f96Var4 = finderFlutterPOIActivity.f101784x;
            float f17 = f96Var4 != null ? f96Var4.getFloat(0) : 0.0f;
            r45.f96 f96Var5 = finderFlutterPOIActivity.f101784x;
            z80.q0 q0Var = new z80.q0(str, str2, str3, f17, f96Var5 != null ? f96Var5.getFloat(1) : 0.0f);
            z80.m0 m0Var = (z80.m0) i95.n0.c(z80.m0.class);
            androidx.appcompat.app.AppCompatActivity context = finderFlutterPOIActivity.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((y80.e1) m0Var).wi(context, q0Var);
        }
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.q2
    public void y() {
        super.y();
        android.widget.TextView textView = (android.widget.TextView) m(com.tencent.mm.R.id.f485937jl4);
        textView.setText(com.tencent.mm.R.string.ggj);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        android.view.View m17 = m(com.tencent.mm.R.id.f487346od5);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m17, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewStub viewStub = (android.view.ViewStub) m(com.tencent.mm.R.id.inb);
        viewStub.setOnInflateListener(new com.tencent.mm.plugin.location.ui.impl.e2(this));
        this.W = viewStub.inflate();
        android.app.Activity activity = this.f144728d;
        activity.getWindow().getDecorView().post(new com.tencent.mm.plugin.location.ui.impl.f2(this));
        za3.i1 i1Var = new za3.i1(activity, this.f144733i.f144804f, false);
        this.S = i1Var;
        i1Var.f470956n = false;
        boolean z17 = true;
        i1Var.f470952j = true;
        com.tencent.mm.plugin.location.ui.impl.TrackPoint trackPoint = i1Var.f470946d;
        if (trackPoint != null) {
            trackPoint.setOnAvatarOnClickListener(null);
            i1Var.f470946d.setOnLocationOnClickListener(null);
            i1Var.f470946d.a();
        }
        this.S.f470949g = false;
        activity.getResources();
        this.f144733i.f144800b.setOnClickListener(new com.tencent.mm.plugin.location.ui.impl.g2(this));
        com.tencent.mm.plugin.location.ui.impl.LocationCrossHairView locationCrossHairView = (com.tencent.mm.plugin.location.ui.impl.LocationCrossHairView) m(com.tencent.mm.R.id.f485687in2);
        this.T = locationCrossHairView;
        if (locationCrossHairView != null) {
            this.U = m(com.tencent.mm.R.id.ucu);
        }
        za3.i1 i1Var2 = this.S;
        com.tencent.mm.plugin.location.ui.impl.h2 h2Var = new com.tencent.mm.plugin.location.ui.impl.h2(this);
        ab3.h hVar = i1Var2.f470954l;
        if (hVar != null) {
            hVar.setMapViewOnTouchListener(h2Var);
        }
        this.T.setOnClickListener(new com.tencent.mm.plugin.location.ui.impl.j2(this));
        java.lang.String stringExtra = n().getStringExtra("kPoi_url");
        android.widget.TextView textView2 = (android.widget.TextView) m(com.tencent.mm.R.id.jr8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setOnClickListener(new com.tencent.mm.plugin.location.ui.impl.k2(this, stringExtra));
        }
        this.B.f470986i.setImageResource(j65.e.b() ? com.tencent.mm.R.drawable.c8k : com.tencent.mm.R.drawable.c8j);
        this.V = new za3.h(this.f144733i.f144804f, activity);
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = this.f144731g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(locationInfo.f144589h) && com.tencent.mm.sdk.platformtools.t8.K0(locationInfo.f144591m)) {
            z17 = false;
        }
        if (z17) {
            java.lang.String str = this.f144737p;
            if (str != null && !str.equals("")) {
                this.V.f470922e = this.f144737p;
            }
            java.lang.String str2 = android.text.TextUtils.isEmpty(locationInfo.f144589h) ? "" : locationInfo.f144589h;
            za3.h hVar2 = this.V;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            this.B.getClass();
            sb6.append(str2);
            hVar2.setText(sb6.toString());
        }
        za3.h hVar3 = this.V;
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.tencent.mm.plugin.location.ui.impl.y1 y1Var = com.tencent.mm.plugin.location.ui.impl.y1.this;
                y1Var.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", y1Var, array);
                com.tencent.mars.xlog.Log.i("MicroMsg.TrackMapUI", "newpoi old go back onclick");
                y1Var.z();
                yj0.a.h(y1Var, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        android.widget.ImageButton imageButton = hVar3.f470925h;
        imageButton.setOnClickListener(onClickListener);
        imageButton.setVisibility(0);
        android.view.ViewGroup viewGroup = hVar3.f470926i;
        viewGroup.setVisibility(0);
        viewGroup.setOnClickListener(onClickListener);
        this.f144951p1 = m(com.tencent.mm.R.id.d3i);
    }
}
