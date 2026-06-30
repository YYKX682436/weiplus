package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class o9 extends com.tencent.mm.plugin.finder.live.plugin.l implements io0.a {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f113715p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Context f113716q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.live.core.view.LivePreviewView f113717r;

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.r2 f113718s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f113719t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.g90 f113720u;

    /* renamed from: v, reason: collision with root package name */
    public int f113721v;

    /* renamed from: w, reason: collision with root package name */
    public int f113722w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f113723x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113715p = statusMonitor;
        this.f113716q = root.getContext();
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.icy);
        ((com.tencent.mm.live.core.view.LivePreviewView) findViewById).setPluginCallback(this);
        kotlin.jvm.internal.o.f(findViewById, "apply(...)");
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView = (com.tencent.mm.live.core.view.LivePreviewView) findViewById;
        this.f113717r = livePreviewView;
        this.f113719t = root.getRootView().findViewById(com.tencent.mm.R.id.ey8);
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.f484619ex3);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f113720u = new com.tencent.mm.plugin.finder.live.plugin.g90((android.view.ViewGroup) findViewById2, this);
        this.f113721v = 1;
        this.f113722w = -1;
        root.setPadding(0, 0, 0, 0);
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorPreviewPlugin", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        com.tencent.mm.plugin.finder.live.plugin.c9 c9Var = new com.tencent.mm.plugin.finder.live.plugin.c9(this);
        com.tencent.mm.plugin.finder.live.plugin.d9 d9Var = new com.tencent.mm.plugin.finder.live.plugin.d9(this);
        com.tencent.mm.plugin.finder.live.plugin.e9 e9Var = new com.tencent.mm.plugin.finder.live.plugin.e9(this);
        livePreviewView.f68612n = c9Var;
        livePreviewView.f68613o = d9Var;
        livePreviewView.f68614p = e9Var;
        livePreviewView.setCameraOptionEnable(this.f113721v == 1);
    }

    public static void D1(com.tencent.mm.plugin.finder.live.plugin.o9 o9Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        ts0.c z19;
        ft0.d dVar;
        ms0.c cVar;
        hn0.f fVar;
        boolean z27 = (i17 & 1) != 0 ? false : z17;
        o9Var.getClass();
        boolean v27 = zl2.r4.f473950a.v2();
        vn0.c cVar2 = vn0.b.f438174a;
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView = o9Var.f113717r;
        if (v27) {
            in0.q B1 = o9Var.B1();
            if (B1 != null) {
                java.lang.String str = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).f66991o;
                lo0.b0 b0Var = ko0.c0.f309825a.b().f319996e;
                if (livePreviewView != null) {
                    if (!(str == null || str.length() == 0)) {
                        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = B1.X;
                        if (iTPPlayer != null) {
                            iTPPlayer.stop();
                        }
                        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = B1.X;
                        if (iTPPlayer2 != null) {
                            iTPPlayer2.release();
                        }
                        com.tencent.thumbplayer.api.ITPPlayer createTPPlayer = com.tencent.thumbplayer.api.TPPlayerFactory.createTPPlayer(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        B1.X = createTPPlayer;
                        if (createTPPlayer != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "startPushLocalVideo path:" + str);
                            createTPPlayer.setDataSource(str);
                            createTPPlayer.setLoopback(true);
                        }
                        B1.f420774u = livePreviewView;
                        cVar2.a().getClass();
                        cVar2.d().getClass();
                        livePreviewView.f(new tn0.d0(B1), new tn0.e0(B1));
                        go0.f0 f0Var = B1.f420771r;
                        f0Var.getClass();
                        f0Var.l(new go0.p(f0Var));
                        f0Var.l(new go0.b0(f0Var, b0Var));
                        f0Var.u(new tn0.i0(B1, str));
                    }
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.LiveCore", "startPushLocalVideo preiewView is null or path is nullOrEmpty");
            }
            o9Var.C1();
            return;
        }
        in0.q B12 = o9Var.B1();
        if (B12 != null && (fVar = B12.f420773t) != null) {
            ((hn0.p) fVar).i(dk2.ef.f233372a.F());
        }
        int A1 = o9Var.A1();
        if (z27) {
            in0.q B13 = o9Var.B1();
            if (B13 != null) {
                com.tencent.mm.plugin.finder.live.plugin.l9 l9Var = new com.tencent.mm.plugin.finder.live.plugin.l9(o9Var, A1);
                if (livePreviewView == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LiveCore", "startPreviewToRemote preiewView is null");
                } else {
                    go0.f0 f0Var2 = B13.f420771r;
                    f0Var2.getClass();
                    f0Var2.l(new go0.n(f0Var2));
                    java.lang.String debugText = "startPreview " + livePreviewView;
                    kotlin.jvm.internal.o.g(debugText, "debugText");
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", debugText);
                    B13.f420774u = livePreviewView;
                    cVar2.a().getClass();
                    cVar2.d().getClass();
                    livePreviewView.f(new tn0.a0(B13), new tn0.b0(B13));
                    ts0.r rVar = B13.f420775v;
                    if (rVar != null && ((ts0.b) rVar).G()) {
                        xn0.b b17 = cVar2.b();
                        ts0.r rVar2 = B13.f420775v;
                        b17.f455410a = rVar2 != null ? rVar2.e() : 0;
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "start preview success");
                        l9Var.invoke();
                        ts0.r rVar3 = B13.f420775v;
                        if (rVar3 == null || (z19 = rVar3.z()) == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "cameraConfig null");
                            pm0.z.b(xy2.b.f458155b, "startPreviewToRemoteButCameraConfigNull", false, null, null, false, false, null, 124, null);
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "start preview remote systemRoate: " + A1);
                            ts0.c.f421545e = A1;
                            f0Var2.w(z19);
                            ts0.r rVar4 = B13.f420775v;
                            if ((rVar4 != null && rVar4.b() == 2) && A1 == 90 && (dVar = f0Var2.f273764m) != null && (cVar = dVar.f266462c) != null) {
                                cVar.r(0);
                            }
                            B13.f420777x = true;
                            f0Var2.setOnDrawListener(new tn0.c0(B13));
                        }
                    }
                }
            }
        } else {
            in0.q B14 = o9Var.B1();
            if (B14 != null) {
                B14.D0(livePreviewView, ko0.c0.f309825a.b().f319996e, A1);
            }
            int x17 = o9Var.x1(A1);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "preview cameraRotate: " + x17 + ", contextRotate: " + A1);
            in0.q B15 = o9Var.B1();
            if (B15 != null) {
                B15.y0(x17);
            }
            o9Var.C1();
        }
        o9Var.f365323d.post(new com.tencent.mm.plugin.finder.live.plugin.m9(o9Var));
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.o9 o9Var) {
        android.view.View view = o9Var.f113719t;
        if (view != null && view.getVisibility() == 0) {
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPreviewPlugin", "hideFrameScaleTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPreviewPlugin", "hideFrameScaleTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            zl2.r4.f473950a.I0().putBoolean("FRAME_SCALE_TIPS_SHOW_KEY", false);
            kotlinx.coroutines.r2 r2Var = o9Var.f113718s;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
        }
    }

    public static final void u1(com.tencent.mm.plugin.finder.live.plugin.o9 o9Var, int i17) {
        kn0.f fVar;
        o9Var.getClass();
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.C1;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        kn0.i iVar = ((mm2.e1) o9Var.P0(mm2.e1.class)).f328990t;
        gVar.o("camera_status", iVar != null && (fVar = iVar.f309560d) != null && fVar.f309530b ? 1 : 2);
        zy2.zb.y6(zbVar, z4Var, gVar.toString(), null, 4, null);
    }

    @Override // qo0.a
    public void A0(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        com.tencent.mm.plugin.finder.live.plugin.g90 g90Var = this.f113720u;
        if ((i17 == 1 || i17 == 3) && i18 == -1) {
            if (i17 == 3) {
                g90Var.i();
            }
            ((mm2.c1) P0(mm2.c1.class)).f328856o5 = intent != null ? intent.getStringExtra(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH) : null;
            ((mm2.c1) P0(mm2.c1.class)).f328864p5 = intent != null ? intent.getStringExtra("fileExt") : null;
            ((mm2.c1) P0(mm2.c1.class)).f328870q5 = 1;
            boolean j17 = com.tencent.mm.vfs.w6.j(((mm2.c1) P0(mm2.c1.class)).f328856o5);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "REQUEST_CODE_SELECT_FILE screenShareFilePath:" + ((mm2.c1) P0(mm2.c1.class)).f328856o5 + " exist:" + j17);
            java.lang.String str = ((mm2.c1) P0(mm2.c1.class)).f328856o5;
            if ((str == null || str.length() == 0) || !j17) {
                ((mm2.c1) P0(mm2.c1.class)).f328856o5 = null;
                ((mm2.c1) P0(mm2.c1.class)).f328870q5 = 0;
            } else {
                g90Var.l(((mm2.c1) P0(mm2.c1.class)).f328870q5);
                g90Var.j();
                y1(true);
                mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
                g90Var.f(c1Var != null ? c1Var.l7() : false);
            }
        } else if ((i17 == 2 || i17 == 4) && i18 == -1) {
            if (i17 == 4) {
                g90Var.i();
            }
            ((mm2.c1) P0(mm2.c1.class)).f328856o5 = (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List")) == null) ? null : (java.lang.String) kz5.n0.Z(stringArrayListExtra);
            ((mm2.c1) P0(mm2.c1.class)).f328870q5 = 2;
            boolean j18 = com.tencent.mm.vfs.w6.j(((mm2.c1) P0(mm2.c1.class)).f328856o5);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "REQUEST_CODE_SELECT_IMAGE screenShareFilePath:" + ((mm2.c1) P0(mm2.c1.class)).f328856o5 + " exist:" + j18);
            java.lang.String str2 = ((mm2.c1) P0(mm2.c1.class)).f328856o5;
            if ((str2 == null || str2.length() == 0) || !j18) {
                ((mm2.c1) P0(mm2.c1.class)).f328856o5 = null;
                ((mm2.c1) P0(mm2.c1.class)).f328870q5 = 0;
            } else {
                g90Var.l(((mm2.c1) P0(mm2.c1.class)).f328870q5);
                g90Var.j();
                mm2.c1 c1Var2 = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
                g90Var.f(c1Var2 != null ? c1Var2.l7() : false);
                y1(true);
            }
        } else if (i17 == 5 && i18 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("finder_biz_live_article_url") : null;
            if (!(stringExtra == null || r26.n0.N(stringExtra))) {
                ((mm2.c1) P0(mm2.c1.class)).f328888t5 = stringExtra;
                ((mm2.c1) P0(mm2.c1.class)).f328870q5 = 3;
                g90Var.k(stringExtra);
            }
        }
        if (i18 == -1) {
            if (i17 == 5 || i17 == 2 || i17 == 4 || i17 == 1 || i17 == 3) {
                qo0.c.a(this.f113715p, qo0.b.R3, null, 2, null);
            }
        }
    }

    public final int A1() {
        int i17;
        android.content.Context context = this.f113716q;
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiveCoreAnchor", "Context is not Activity, using default rotation");
            return 0;
        }
        kotlin.jvm.internal.o.f(context, "context");
        int rotation = ((android.app.Activity) context).getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            i17 = 90;
        } else if (rotation == 2) {
            i17 = 180;
        } else {
            if (rotation != 3) {
                return 0;
            }
            i17 = 270;
        }
        return i17;
    }

    public final in0.q B1() {
        return dk2.ef.f233372a.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0(java.util.LinkedHashMap r6) {
        /*
            r5 = this;
            java.lang.String r0 = "micUserMap"
            kotlin.jvm.internal.o.g(r6, r0)
            int r0 = r6.size()
            r5.f113721v = r0
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            com.tencent.mm.live.core.view.LivePreviewView r3 = r5.f113717r
            r3.setCameraOptionEnable(r0)
            java.lang.Class<mm2.o4> r0 = mm2.o4.class
            androidx.lifecycle.c1 r0 = r5.P0(r0)
            mm2.o4 r0 = (mm2.o4) r0
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            xh2.c r0 = (xh2.c) r0
            if (r0 == 0) goto L2c
            int r0 = r0.f454533c
            goto L2d
        L2c:
            r0 = r1
        L2d:
            com.tencent.mm.plugin.finder.live.plugin.g90 r4 = r5.f113720u
            r4.g(r0, r6)
            r6 = 2
            r4 = 0
            if (r0 == r6) goto L45
            r6 = 3
            if (r0 == r6) goto L45
            r6 = 8
            if (r0 == r6) goto L45
            com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout r6 = r3.getRenderRatioLayout()
            r6.setBackground(r4)
            goto L5d
        L45:
            com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout r6 = r3.getRenderRatioLayout()
            android.view.ViewGroup r0 = r5.f365323d
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131101198(0x7f06060e, float:1.7814799E38)
            int r0 = r0.getColor(r3)
            r6.setBackgroundColor(r0)
        L5d:
            int r6 = r5.f113721v
            if (r6 <= r2) goto L7e
            in0.q r6 = r5.B1()
            if (r6 == 0) goto L70
            kn0.p r6 = r6.D
            if (r6 == 0) goto L70
            boolean r6 = r6.f309589i
            if (r6 != 0) goto L70
            r1 = r2
        L70:
            if (r1 == 0) goto L7e
            com.tencent.mm.plugin.finder.live.view.k0 r6 = r5.R0()
            android.widget.RelativeLayout r6 = r6.getPreviewRoot()
            r6.setBackground(r4)
            goto L8c
        L7e:
            com.tencent.mm.plugin.finder.live.view.k0 r6 = r5.R0()
            android.widget.RelativeLayout r6 = r6.getPreviewRoot()
            r0 = 2131100581(0x7f0603a5, float:1.7813547E38)
            r6.setBackgroundResource(r0)
        L8c:
            int r6 = r5.f113721v
            if (r6 != r2) goto L93
            r5.v1()
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.o9.C0(java.util.LinkedHashMap):void");
    }

    public final void C1() {
        hn0.f fVar;
        java.lang.Object obj;
        java.lang.String str;
        ko0.l0 l0Var = ko0.l0.f309878a;
        dk2.ug ugVar = dk2.ug.f234218a;
        l0Var.c(dk2.ug.f234219b);
        ugVar.c(l0Var.b());
        in0.q B1 = B1();
        if (B1 == null || (fVar = B1.f420773t) == null) {
            return;
        }
        lo0.k0 k0Var = l0Var.b().f320063d;
        if (k0Var.f320036b) {
            java.util.List<lo0.h0> list = k0Var.f320040f;
            java.util.Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((lo0.h0) obj).f320002f) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            lo0.h0 h0Var = (lo0.h0) obj;
            if (h0Var == null || (str = h0Var.f320000d) == null) {
                str = "";
            }
            hn0.p pVar = (hn0.p) fVar;
            pVar.b();
            pVar.f282400b.l(new hn0.n(pVar, k0Var.f320039e, str));
            for (lo0.h0 h0Var2 : list) {
                pVar.f(h0Var2.f320001e, h0Var2.f320006j);
            }
            if (h0Var != null) {
                hn0.f.a(fVar, h0Var.f320006j, false, false, 4, null);
            }
        }
    }

    public final void E1() {
        y1(false);
        com.tencent.mm.plugin.finder.live.plugin.g90 g90Var = this.f113720u;
        g90Var.f112651a.setVisibility(8);
        g90Var.f112653c.removeAllViews();
        tn0.w0 d17 = g90Var.d();
        if (d17 != null) {
            d17.K0(false, g90Var.f112655e, null, null);
        }
        tn0.w0 d18 = g90Var.d();
        if (d18 != null) {
            d18.b0(0, 0);
        }
        g90Var.i();
        if (zl2.r4.f473950a.x1()) {
            qo0.c cVar = g90Var.f112652b.f113325g;
            kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = (com.tencent.mm.plugin.finder.live.view.k0) cVar;
            tn0.w0 d19 = g90Var.d();
            cl0.g gVar = d19 != null ? ((in0.q) d19).T1 : null;
            tn0.w0 d27 = g90Var.d();
            org.json.JSONObject J2 = d27 != null ? d27.J() : null;
            tn0.w0 d28 = g90Var.d();
            com.tencent.mm.plugin.finder.live.view.k0.notifySEIMicUserChange$default(k0Var, gVar, J2, d28 != null ? ((in0.q) d28).W0() : null, true, null, 16, null);
        }
        com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout tRTCVideoRatioLayout = this.f113717r.renderRatioLayout;
        tRTCVideoRatioLayout.getClass();
        tRTCVideoRatioLayout.f68576o.d(false);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void I0() {
    }

    @Override // qo0.a
    public void J0() {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kn0.p pVar;
        hn0.f fVar;
        kn0.p pVar2;
        int i17;
        kn0.p pVar3;
        kn0.p pVar4;
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        boolean f76 = ((mm2.e1) P0(mm2.e1.class)).f7();
        int ordinal = status.ordinal();
        int i18 = 3;
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView = this.f113717r;
        boolean z17 = false;
        if (ordinal == 5 || ordinal == 6 || ordinal == 7) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "#statusChange status=" + status + " isScreenCaseGameMode=" + f76);
            ((mm2.o4) P0(mm2.o4.class)).A.observe(this, new com.tencent.mm.plugin.finder.live.plugin.h9(this));
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.o4) P0(mm2.o4.class)).A;
            if (liveMutableData != null && liveMutableData.getValue() == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String str = ((mm2.e1) P0(mm2.e1.class)).f328987q.f380301n;
                if (str == null) {
                    str = "DEFAULT_ANCHOR_USER_ID";
                }
                arrayList.add(new jo0.a(str, new hn5.b(0.0f, 0.0f, 1.0f, 1.0f), false));
                android.graphics.Rect rect = new android.graphics.Rect(0, 0, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y);
                in0.q B1 = B1();
                livePreviewView.d(arrayList, rect, (B1 == null || (pVar = B1.D) == null || !pVar.f309589i) ? false : true);
            }
            r45.q12 q12Var = (r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) P0(mm2.g1.class)).f329068f).getValue();
            if ((q12Var != null && q12Var.getInteger(0) == 3) || f76) {
                livePreviewView.setVisibility(8);
                return;
            } else {
                livePreviewView.setVisibility(0);
                K0(0);
                return;
            }
        }
        if (ordinal == 10) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "switchCamera");
            if (com.tencent.mm.ui.fl.e()) {
                int A1 = A1();
                in0.q B12 = B1();
                if (B12 != null) {
                    B12.J0(A1, new com.tencent.mm.plugin.finder.live.plugin.n9(this, A1));
                }
            } else {
                in0.q B13 = B1();
                if (B13 != null) {
                    if (((mm2.c1) P0(mm2.c1.class)).O7()) {
                        in0.q e17 = dk2.ef.f233372a.e();
                        if (e17 != null && !e17.W()) {
                            z17 = true;
                        }
                        if (z17) {
                            i18 = 1;
                        }
                    } else {
                        i18 = 0;
                    }
                    hn0.h.h(B13, i18, null, 2, null);
                }
            }
            in0.q B14 = B1();
            if (B14 != null && (fVar = B14.f420773t) != null) {
                ((hn0.p) fVar).j(dk2.ef.f233372a.G());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveAnchorIDKeyStat", "markAnchorSwitchCameraWhileLiveOn");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1380L, 7L, 1L);
            return;
        }
        if (ordinal == 27) {
            if (!zl2.r4.f473950a.v2()) {
                in0.q B15 = B1();
                if (B15 != null) {
                    B15.H0();
                    return;
                }
                return;
            }
            in0.q B16 = B1();
            if (B16 != null) {
                com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = B16.X;
                if (iTPPlayer != null) {
                    iTPPlayer.stop();
                }
                com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = B16.X;
                if (iTPPlayer2 != null) {
                    iTPPlayer2.release();
                }
                B16.X = null;
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.g90 g90Var = this.f113720u;
        if (ordinal == 191) {
            boolean z18 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            boolean z19 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_SWITCH_MODE_FROM_MINIWINDOW", false) : false;
            boolean f77 = ((mm2.e1) P0(mm2.e1.class)).f7();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "#checkAudioMode isAudioMode:" + z18 + ", fromMiniWindow:" + z19 + ", isScreenCaseGameMode=" + f77 + ", liveData.audioModeHolderBm:" + ((mm2.c1) P0(mm2.c1.class)).I4);
            in0.q B17 = B1();
            if (!((B17 == null || (pVar2 = B17.D) == null || pVar2.f309589i) ? false : true)) {
                in0.q B18 = B1();
                if (B18 != null) {
                    B18.f420774u = livePreviewView;
                }
            } else if (z18) {
                in0.q B19 = B1();
                if (B19 != null) {
                    B19.f420774u = livePreviewView;
                }
            } else if (f77) {
                in0.q B110 = B1();
                if (B110 != null) {
                    B110.H0();
                }
            } else {
                D1(this, z19, false, 2, null);
                com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout tRTCVideoRatioLayout = livePreviewView.renderRatioLayout;
                tRTCVideoRatioLayout.getClass();
                tRTCVideoRatioLayout.f68576o.d(false);
            }
            g90Var.f(z18);
            return;
        }
        if (ordinal != 200 && ordinal != 216) {
            if (ordinal != 248) {
                return;
            }
            boolean z27 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_CO_LIVE_CAMERA_OPEN", true) : true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FINDER_LIVE_CO_LIVE_CAMERA_TOGGLE: open=");
            sb6.append(z27);
            sb6.append(", liveCoreNull=");
            sb6.append(B1() == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", sb6.toString());
            if (z27) {
                D1(this, false, false, 3, null);
                com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout tRTCVideoRatioLayout2 = livePreviewView.renderRatioLayout;
                tRTCVideoRatioLayout2.getClass();
                tRTCVideoRatioLayout2.f68576o.d(false);
                return;
            }
            if (B1() == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LiveCoreAnchor", "FINDER_LIVE_CO_LIVE_CAMERA_TOGGLE: liveCore is null, cannot stopPreview");
            }
            in0.q B111 = B1();
            if (B111 != null) {
                B111.H0();
                return;
            }
            return;
        }
        in0.q B112 = B1();
        boolean z28 = (B112 == null || (pVar4 = B112.D) == null || !pVar4.e()) ? false : true;
        boolean f78 = ((mm2.e1) P0(mm2.e1.class)).f7();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "#recoveryLive isAudioMode:" + z28 + " isScreenCaseGameMode=" + f78 + " liveData.audioModeHolderBm:" + ((mm2.c1) P0(mm2.c1.class)).I4);
        if (f78) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "#recoveryLive is screen record game. stop preview camera");
            in0.q B113 = B1();
            if (B113 != null) {
                B113.H0();
                return;
            }
            return;
        }
        if (z28) {
            in0.q B114 = B1();
            if (B114 != null) {
                B114.f420774u = livePreviewView;
                return;
            }
            return;
        }
        D1(this, false, false, 2, null);
        com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout tRTCVideoRatioLayout3 = livePreviewView.renderRatioLayout;
        tRTCVideoRatioLayout3.getClass();
        tRTCVideoRatioLayout3.f68576o.d(false);
        in0.q B115 = B1();
        if (B115 != null && (pVar3 = B115.D) != null && pVar3.f309589i) {
            z17 = true;
        }
        if (!z17 || (i17 = ((mm2.c1) P0(mm2.c1.class)).f328870q5) == 0) {
            return;
        }
        g90Var.l(i17);
        g90Var.j();
        y1(true);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "unMount");
    }

    @Override // io0.a
    public java.lang.String getSelfUserId() {
        java.lang.String m86 = ((mm2.c1) P0(mm2.c1.class)).m8();
        return m86 == null ? "" : m86;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void v1() {
        java.lang.String str;
        kn0.p pVar;
        java.util.LinkedList linkedList;
        android.content.Context context = this.f113716q;
        int h17 = com.tencent.mm.ui.bl.h(context);
        android.view.ViewGroup viewGroup = this.f365323d;
        float a17 = com.tencent.mm.ui.zk.a(viewGroup.getContext(), 16);
        xh2.c cVar = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.getValue();
        boolean z17 = false;
        int i17 = cVar != null ? cVar.f454533c : 0;
        xh2.c cVar2 = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.getValue();
        int i18 = cVar2 != null ? cVar2.f454534d : 0;
        xh2.c cVar3 = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.getValue();
        int i19 = cVar3 != null ? cVar3.f454536f : 0;
        if (this.f113722w == -1) {
            this.f113722w = com.tencent.mm.ui.bl.c(context);
        }
        boolean z18 = (i18 == 0 && i19 == 0) || i18 == 1 || i18 == 5;
        xh2.c cVar4 = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.getValue();
        if (((cVar4 == null || (linkedList = cVar4.f454531a) == null) ? 1 : linkedList.size()) == 1 && z18 && i17 == 0 && ((mm2.c1) P0(mm2.c1.class)).f328925z2 != 1) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            zl2.r4.g(r4Var, "MicroMsg.LiveCoreAnchor", this.f365323d, false, false, this.f113722w, 8, null);
            str = "getContext(...)";
            com.tencent.mm.plugin.finder.live.plugin.l.b1(this, this.f365323d, "MicroMsg.LiveCoreAnchor", false, 4, null);
            w1(true, h17, a17);
            android.content.Context context2 = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context2, str);
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var = (com.tencent.mm.plugin.finder.live.viewmodel.b8) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.live.viewmodel.b8.class);
            b8Var.getClass();
            if (!r4Var.Y1(b8Var.getContext())) {
                if (b8Var.f116955z == -1) {
                    b8Var.f116955z = com.tencent.mm.ui.bl.c(b8Var.getActivity());
                }
                pm0.v.V(100L, new com.tencent.mm.plugin.finder.live.viewmodel.h6(b8Var));
            }
        } else {
            str = "getContext(...)";
            zl2.r4 r4Var2 = zl2.r4.f473950a;
            zl2.r4.g(r4Var2, "MicroMsg.LiveCoreAnchor", this.f365323d, true, false, this.f113722w, 8, null);
            in0.q B1 = B1();
            if (B1 != null && (pVar = B1.D) != null && !pVar.f309589i) {
                z17 = true;
            }
            w1(z17, h17, a17);
            android.content.Context context3 = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context3, str);
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var2 = (com.tencent.mm.plugin.finder.live.viewmodel.b8) zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.live.viewmodel.b8.class);
            b8Var2.getClass();
            if (r4Var2.Y1(b8Var2.getContext())) {
                pm0.v.V(100L, new com.tencent.mm.plugin.finder.live.viewmodel.i6(b8Var2));
            }
        }
        zl2.r4 r4Var3 = zl2.r4.f473950a;
        android.content.Context context4 = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context4, str);
        if (r4Var3.Y1(context4)) {
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = viewGroup instanceof com.tencent.mm.ui.widget.RoundCornerRelativeLayout ? (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) viewGroup : null;
            if (roundCornerRelativeLayout != null) {
                roundCornerRelativeLayout.c(a17, a17, a17, a17);
            }
        }
        viewGroup.requestLayout();
    }

    public final void w1(boolean z17, int i17, float f17) {
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout;
        com.tencent.mm.plugin.finder.live.plugin.g90 g90Var = this.f113720u;
        if (z17) {
            android.view.ViewGroup.LayoutParams layoutParams = g90Var.f112651a.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
            }
            android.view.ViewGroup viewGroup = g90Var.f112651a;
            roundCornerRelativeLayout = viewGroup instanceof com.tencent.mm.ui.widget.RoundCornerRelativeLayout ? (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) viewGroup : null;
            if (roundCornerRelativeLayout != null) {
                roundCornerRelativeLayout.c(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            return;
        }
        android.view.ViewGroup viewGroup2 = this.f365323d;
        float f18 = com.tencent.mm.ui.bl.b(viewGroup2.getContext()).y - (com.tencent.mm.ui.bl.b(viewGroup2.getContext()).x * 1.7777778f);
        android.view.ViewGroup.LayoutParams layoutParams3 = g90Var.f112651a.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            android.content.Context context = g90Var.f112651a.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (r4Var.Y1(context)) {
                layoutParams4.topMargin = 0;
                layoutParams4.bottomMargin = 0;
            } else {
                layoutParams4.topMargin = i17;
                layoutParams4.bottomMargin = ((int) f18) - i17;
            }
        }
        android.view.ViewGroup viewGroup3 = g90Var.f112651a;
        roundCornerRelativeLayout = viewGroup3 instanceof com.tencent.mm.ui.widget.RoundCornerRelativeLayout ? (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) viewGroup3 : null;
        if (roundCornerRelativeLayout != null) {
            roundCornerRelativeLayout.c(f17, f17, f17, f17);
        }
    }

    public final int x1(int i17) {
        in0.q e17 = dk2.ef.f233372a.e();
        boolean z17 = false;
        if (e17 != null && !e17.W()) {
            z17 = true;
        }
        return com.tencent.mm.plugin.finder.live.util.l.f115587a.a(i17, z17, ((mm2.c1) P0(mm2.c1.class)).O7());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (r4.e() == true) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1(boolean r4) {
        /*
            r3 = this;
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.fa> r0 = com.tencent.mm.plugin.finder.live.plugin.fa.class
            if (r4 == 0) goto L12
            com.tencent.mm.plugin.finder.live.plugin.l r4 = r3.X0(r0)
            com.tencent.mm.plugin.finder.live.plugin.fa r4 = (com.tencent.mm.plugin.finder.live.plugin.fa) r4
            if (r4 == 0) goto L33
            r0 = 8
            r4.K0(r0)
            goto L33
        L12:
            in0.q r4 = r3.B1()
            r1 = 0
            if (r4 == 0) goto L25
            kn0.p r4 = r4.D
            if (r4 == 0) goto L25
            boolean r4 = r4.e()
            r2 = 1
            if (r4 != r2) goto L25
            goto L26
        L25:
            r2 = r1
        L26:
            if (r2 == 0) goto L33
            com.tencent.mm.plugin.finder.live.plugin.l r4 = r3.X0(r0)
            com.tencent.mm.plugin.finder.live.plugin.fa r4 = (com.tencent.mm.plugin.finder.live.plugin.fa) r4
            if (r4 == 0) goto L33
            r4.K0(r1)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.o9.y1(boolean):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.k9(this, null), 3, null);
    }

    public final android.view.TextureView z1() {
        android.view.TextureView cameraView;
        kn0.p pVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCameraView ");
        in0.q B1 = B1();
        boolean z17 = false;
        if (B1 != null && (pVar = B1.D) != null && pVar.f309589i) {
            z17 = true;
        }
        if (z17) {
            sb6.append("from screenShare");
            cameraView = this.f113720u.f112655e;
        } else {
            sb6.append("from cameraView");
            cameraView = this.f113717r.getCameraView();
        }
        sb6.append(java.lang.String.valueOf(cameraView.hashCode()));
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", sb6.toString());
        return cameraView;
    }
}
