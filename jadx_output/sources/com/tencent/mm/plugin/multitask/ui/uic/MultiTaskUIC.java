package com.tencent.mm.plugin.multitask.ui.uic;

/* loaded from: classes8.dex */
public class MultiTaskUIC extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.plugin.multitask.w0, rk3.b, zk3.c {
    public static int D = 0;
    public static int E = 0;
    public static int F = 0;
    public static int G = 0;
    public static int H = 0;
    public static int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public static int f150590J = 0;
    public static int K = 0;
    public static int L = 0;
    public static int M = 0;
    public static int N = 0;
    public static int P = 0;
    public static int Q = 0;
    public static int R = 0;
    public static int S = 0;
    public static int T = 0;
    public static int U = 0;
    public static int V = 0;
    public static float W = 0.2f;
    public boolean A;
    public android.os.Bundle B;

    /* renamed from: d, reason: collision with root package name */
    public rk3.e f150591d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f150592e;

    /* renamed from: f, reason: collision with root package name */
    public yk3.i f150593f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f150594g;

    /* renamed from: h, reason: collision with root package name */
    public int f150595h;

    /* renamed from: i, reason: collision with root package name */
    public int f150596i;

    /* renamed from: m, reason: collision with root package name */
    public int f150597m;

    /* renamed from: n, reason: collision with root package name */
    public int f150598n;

    /* renamed from: o, reason: collision with root package name */
    public int f150599o;

    /* renamed from: p, reason: collision with root package name */
    public int f150600p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.multitask.ui.panel.MultiTaskContainerView f150601q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer f150602r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView f150603s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f150604t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f150605u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC$homeTabChangedListener$1 f150606v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f150607w;

    /* renamed from: x, reason: collision with root package name */
    public zk3.b f150608x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f150609y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Runnable f150610z;
    public static final zk3.h0 C = new zk3.h0(null);
    public static final float X = i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a);
    public static float Y = 1.6666666f;
    public static final float Z = 1.3333334f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC$homeTabChangedListener$1] */
    public MultiTaskUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f150595h = 6;
        this.f150596i = 6;
        this.f150597m = 9;
        this.f150598n = 3;
        this.f150604t = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f150606v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HomeUITabChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC$homeTabChangedListener$1
            {
                this.__eventId = -1095690568;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.HomeUITabChangeEvent homeUITabChangeEvent) {
                com.tencent.mm.autogen.events.HomeUITabChangeEvent event = homeUITabChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.nh nhVar = event.f54438g;
                if (nhVar != null) {
                    int i17 = nhVar.f7425a;
                    com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC multiTaskUIC = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.this;
                    multiTaskUIC.f150600p = i17;
                    if (i17 == 0) {
                        multiTaskUIC.T6(true);
                    } else {
                        multiTaskUIC.T6(false);
                    }
                }
                return false;
            }
        };
        this.f150609y = true;
    }

    public static /* synthetic */ void k7(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC multiTaskUIC, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37, boolean z38, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showHome");
        }
        multiTaskUIC.i7((i17 & 1) != 0 ? true : z17, (i17 & 2) != 0 ? false : z18, (i17 & 4) != 0 ? false : z19, (i17 & 8) != 0 ? false : z27, (i17 & 16) != 0 ? false : z28, (i17 & 32) != 0 ? false : z29, (i17 & 64) != 0 ? false : z37, (i17 & 128) == 0 ? z38 : false);
    }

    public static /* synthetic */ void p7(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC multiTaskUIC, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchToStaticBg");
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        if ((i17 & 4) != 0) {
            z19 = false;
        }
        multiTaskUIC.o7(z17, z18, z19);
    }

    @Override // rk3.b
    public void E1(int i17, int i18) {
        pk3.h a17;
        C.a(i17, i18);
        yk3.i iVar = this.f150593f;
        if (iVar == null || (a17 = iVar.a(0, "MultiTaskForMinusScreen")) == null) {
            return;
        }
        ((zk3.g0) a17).c7();
    }

    @Override // rk3.b
    public void E3() {
        com.tencent.mm.plugin.multitask.ui.panel.MultiTaskContainerView multiTaskContainerView = this.f150601q;
        if (multiTaskContainerView != null) {
            multiTaskContainerView.f150579q = 0;
            multiTaskContainerView.invalidate();
        }
    }

    @Override // rk3.b
    public void H() {
    }

    @Override // rk3.b
    public void J5(android.view.View view, float f17) {
        float f18;
        pk3.h b17;
        yk3.i iVar = this.f150593f;
        if (iVar != null && (b17 = iVar.b(1048576, "MultiTaskForSnapshotMinusScreen")) != null && (b17 instanceof zk3.w0)) {
            zk3.w0 w0Var = (zk3.w0) b17;
            if (w0Var.Y6()) {
                float f19 = 1;
                int i17 = T;
                int i18 = al3.b.f5850b;
                float width = f19 - (((i17 + i18) + 0) / w0Var.getRootView().getWidth());
                float f27 = f17 >= width ? (f17 - width) / (f19 - width) : 0.0f;
                w0Var.getRootView().setTranslationX((-r4) + ((T + i18 + 0) * f27));
            }
        }
        float width2 = ((this.f150601q != null ? r0.getWidth() : F) * W) / ((this.f150601q != null ? r4.getWidth() : F) - T);
        yk3.i iVar2 = this.f150593f;
        pk3.h a17 = iVar2 != null ? iVar2.a(0, "MultiTaskForMinusScreen") : null;
        zk3.g0 g0Var = a17 instanceof zk3.g0 ? (zk3.g0) a17 : null;
        float f28 = 1;
        float f29 = f28 - width2;
        float f37 = f17 >= f29 ? (f17 - f29) / (f28 - f29) : 0.0f;
        if (g0Var != null) {
            g0Var.b7(view, f17, f37);
        }
        if (this.f150601q != null) {
            float width3 = r9.getWidth() * 0.18f;
            float width4 = (r9.getWidth() - T) * f17;
            if (width4 < width3) {
                float f38 = width4 / width3;
                f18 = 1.0f - ((f38 * f38) * f38);
            } else {
                f18 = 0.0f;
            }
            android.widget.ImageView imageView = this.f150594g;
            if (imageView == null) {
                return;
            }
            imageView.setAlpha(f18 >= 0.0f ? f18 > 1.0f ? 1.0f : f18 : 0.0f);
        }
    }

    public boolean O6() {
        if ((com.tencent.mm.sdk.platformtools.x2.n() && !gm0.j1.a()) || Y6()) {
            return false;
        }
        zk3.b bVar = this.f150608x;
        return bVar != null ? bVar.b() : true;
    }

    @Override // rk3.b
    public void P() {
        pk3.h a17;
        com.tencent.mm.plugin.multitask.ui.panel.MultiTaskContainerView multiTaskContainerView;
        rk3.e eVar = this.f150591d;
        if (eVar != null) {
            eVar.K = 1.0f;
            eVar.f396499g = false;
        }
        if (!(!Y6()) && (multiTaskContainerView = this.f150601q) != null) {
            multiTaskContainerView.f150579q = 0;
            multiTaskContainerView.invalidate();
        }
        yk3.i iVar = this.f150593f;
        if (iVar == null || (a17 = iVar.a(0, "MultiTaskForMinusScreen")) == null) {
            return;
        }
        ((zk3.g0) a17).W6();
    }

    public final boolean P6(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup != null ? viewGroup.getChildCount() : 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup != null ? viewGroup.getChildAt(i17) : null;
            if ((childAt instanceof io.flutter.embedding.android.FlutterView) || (childAt instanceof io.flutter.embedding.android.FlutterSurfaceView) || (childAt instanceof io.flutter.embedding.android.FlutterTextureView)) {
                return true;
            }
            if ((childAt instanceof android.view.ViewGroup) && P6((android.view.ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    public boolean Q6(int i17) {
        if (!gm0.j1.a()) {
            return false;
        }
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        int hd6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).hd();
        int h47 = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
        int G8 = ((uh4.c0) i95.n0.c(uh4.c0.class)).G8();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MinusScreenPanel", "onTeenModeDataChanged isTeenMode: %b, miniProgramOption: %d, bizAcctOption: %d, finderOption: %d", java.lang.Boolean.valueOf(isTeenMode), java.lang.Integer.valueOf(hd6), java.lang.Integer.valueOf(h47), java.lang.Integer.valueOf(G8));
        return isTeenMode && ((hd6 == 2 && i17 == 1) || ((h47 == 2 && (i17 == 2 || i17 == 26)) || (G8 == 2 && i17 == 25)));
    }

    public void R6(android.view.View view, zk3.b bVar, boolean z17) {
        if (gm0.j1.a() || !com.tencent.mm.sdk.platformtools.x2.n()) {
            if ((com.tencent.mm.sdk.platformtools.x2.n() || com.tencent.mm.sdk.platformtools.x2.s() || com.tencent.mm.sdk.platformtools.x2.j()) && r26.i0.n(getActivity().getClass().getName(), "com.tencent.mm.ui.LauncherUI", false)) {
                this.f150607w = view;
                if (bVar == null) {
                    bVar = new zk3.j0();
                }
                this.f150608x = bVar;
                f7();
            }
        }
    }

    public boolean S6(android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (event.getKeyCode() != 4) {
            return false;
        }
        yk3.i iVar = this.f150593f;
        if (!Y6()) {
            return false;
        }
        k7(this, true, true, false, false, true, false, false, false, 224, null);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (b7() != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void T6(boolean r8) {
        /*
            r7 = this;
            rk3.e r0 = r7.f150591d
            if (r0 == 0) goto La8
            boolean r1 = r0.getCanSlide()
            int r2 = r7.f150599o
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L12
            int r2 = r7.f150600p
            if (r2 == 0) goto L1d
        L12:
            boolean r2 = r7.Y6()
            if (r2 != 0) goto L1d
            r7.b7()
        L1b:
            r8 = r4
            goto L24
        L1d:
            boolean r2 = r7.b7()
            if (r2 == 0) goto L24
            goto L1b
        L24:
            boolean r2 = r7.c7()
            java.lang.String r3 = "MicroMsg.MultiTask.MultiTaskUIC"
            if (r2 == 0) goto L38
            boolean r2 = r7.Y6()
            if (r2 == 0) goto L38
            java.lang.String r8 = "enableScroll false, showSnapshot Already"
            com.tencent.mars.xlog.Log.i(r3, r8)
            r8 = r4
        L38:
            zk3.b r2 = r7.f150608x
            r5 = 1
            if (r2 == 0) goto L45
            boolean r2 = r2.d()
            if (r2 != r5) goto L45
            r2 = r5
            goto L46
        L45:
            r2 = r4
        L46:
            if (r2 == 0) goto L54
            boolean r2 = r7.Y6()
            if (r2 != 0) goto L54
            java.lang.String r8 = "enableScroll false, isHeaderOpen"
            com.tencent.mars.xlog.Log.i(r3, r8)
            r8 = r4
        L54:
            if (r8 == 0) goto L6a
            zk3.b r2 = r7.f150608x
            if (r2 == 0) goto L66
            androidx.appcompat.app.AppCompatActivity r6 = r7.getActivity()
            boolean r2 = r2.c(r6)
            if (r2 != 0) goto L66
            r2 = r5
            goto L67
        L66:
            r2 = r4
        L67:
            if (r2 == 0) goto L6a
            r8 = r4
        L6a:
            if (r8 == 0) goto L86
            boolean r2 = r7.Y6()
            if (r2 != 0) goto L86
            zk3.b r2 = r7.f150608x
            if (r2 == 0) goto L7d
            boolean r2 = r2.e()
            if (r2 != r5) goto L7d
            goto L7e
        L7d:
            r5 = r4
        L7e:
            if (r5 == 0) goto L86
            java.lang.String r8 = "enableScroll false, isVasUIForeground"
            com.tencent.mars.xlog.Log.i(r3, r8)
            goto L87
        L86:
            r4 = r8
        L87:
            if (r1 != r4) goto L8a
            return
        L8a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "enableSlide: "
            r8.<init>(r1)
            r8.append(r4)
            java.lang.String r1 = ", currentTabIndex:"
            r8.append(r1)
            int r1 = r7.f150600p
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            com.tencent.mars.xlog.Log.i(r3, r8)
            r0.setCanSlide(r4)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.T6(boolean):void");
    }

    public void U6(com.tencent.mm.plugin.multitask.model.MultiTaskInfo taskInfo) {
        android.graphics.Bitmap d17;
        kotlin.jvm.internal.o.g(taskInfo, "taskInfo");
        try {
            android.view.View view = this.f150592e;
            if (view != null && (d17 = uj5.g.d(view, view.getWidth(), view.getHeight(), true, android.graphics.Bitmap.Config.RGB_565)) != null) {
                java.lang.String b17 = com.tencent.mm.plugin.multitask.u0.f150506a.b("Home");
                if (com.tencent.mm.vfs.w6.j(b17)) {
                    com.tencent.mm.vfs.w6.h(b17);
                }
                com.tencent.mm.sdk.platformtools.x.D0(d17, 100, android.graphics.Bitmap.CompressFormat.JPEG, b17, true);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTask.MultiTaskUIC", "snapshot bitmap failed", th6);
        }
        p7(this, false, true, false, 4, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "enterFullScreenMode, id:" + taskInfo.field_id);
    }

    public final com.tencent.mm.plugin.multitask.model.MultiTaskInfo V6() {
        zk3.b bVar = this.f150608x;
        java.lang.Object a17 = bVar != null ? bVar.a() : null;
        if (a17 instanceof com.tencent.mm.plugin.multitask.model.MultiTaskInfo) {
            return (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) a17;
        }
        return null;
    }

    public boolean W6() {
        pk3.h a17;
        yk3.i iVar = this.f150593f;
        if (iVar == null || (a17 = iVar.a(0, "MultiTaskForMinusScreen")) == null) {
            return false;
        }
        zk3.g0 g0Var = (zk3.g0) a17;
        return (g0Var.f473452g.isEmpty() ^ true) && g0Var.f473451f;
    }

    public final void X6(boolean z17) {
        pk3.h a17;
        yk3.i iVar = this.f150593f;
        if (iVar == null || (a17 = iVar.a(1048576, "MultiTaskForSnapshotMinusScreen")) == null || !(a17 instanceof zk3.w0)) {
            return;
        }
        zk3.w0 w0Var = (zk3.w0) a17;
        w0Var.W6();
        w0Var.X6();
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).B(new zk3.l0(this));
        }
    }

    public boolean Y6() {
        rk3.e eVar = this.f150591d;
        return eVar != null && eVar.getCurItem() == 0;
    }

    public void Z6(int i17) {
        boolean c76 = c7();
        r45.kr4 kr4Var = (r45.kr4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(getActivity(), 5, r45.kr4.class);
        if (kr4Var != null) {
            if (i17 == 1) {
                kr4Var.set(10, new r45.hr4());
                r45.hr4 hr4Var = (r45.hr4) kr4Var.getCustom(10);
                if (hr4Var != null) {
                    hr4Var.set(1, java.lang.Long.valueOf(i17));
                }
                r45.hr4 hr4Var2 = (r45.hr4) kr4Var.getCustom(10);
                if (hr4Var2 != null) {
                    hr4Var2.set(0, java.lang.Long.valueOf(c01.id.c()));
                }
                r45.hr4 hr4Var3 = (r45.hr4) kr4Var.getCustom(10);
                if (hr4Var3 == null) {
                    return;
                }
                hr4Var3.set(5, java.lang.Boolean.valueOf(!c76));
                return;
            }
            if (i17 == 2) {
                kr4Var.set(11, new r45.hr4());
                r45.hr4 hr4Var4 = (r45.hr4) kr4Var.getCustom(11);
                if (hr4Var4 != null) {
                    hr4Var4.set(1, java.lang.Long.valueOf(i17));
                }
                r45.hr4 hr4Var5 = (r45.hr4) kr4Var.getCustom(11);
                if (hr4Var5 != null) {
                    hr4Var5.set(0, java.lang.Long.valueOf(c01.id.c()));
                }
                r45.hr4 hr4Var6 = (r45.hr4) kr4Var.getCustom(11);
                if (hr4Var6 == null) {
                    return;
                }
                hr4Var6.set(5, java.lang.Boolean.valueOf(!c76));
                return;
            }
            if (i17 != 3) {
                return;
            }
            kr4Var.set(12, new r45.hr4());
            r45.hr4 hr4Var7 = (r45.hr4) kr4Var.getCustom(12);
            if (hr4Var7 != null) {
                hr4Var7.set(1, java.lang.Long.valueOf(i17));
            }
            r45.hr4 hr4Var8 = (r45.hr4) kr4Var.getCustom(12);
            if (hr4Var8 != null) {
                hr4Var8.set(0, java.lang.Long.valueOf(c01.id.c()));
            }
            r45.hr4 hr4Var9 = (r45.hr4) kr4Var.getCustom(12);
            if (hr4Var9 == null) {
                return;
            }
            hr4Var9.set(5, java.lang.Boolean.valueOf(!c76));
        }
    }

    public void a7(int i17) {
        r45.hr4 hr4Var;
        if (this.f150597m == 9) {
            this.f150597m = 3;
        }
        yk3.i iVar = this.f150593f;
        pk3.h a17 = iVar != null ? iVar.a(0, "MultiTaskForMinusScreen") : null;
        zk3.g0 g0Var = a17 instanceof zk3.g0 ? (zk3.g0) a17 : null;
        this.f150598n = g0Var != null && (((long) g0Var.f473452g.size()) > 1L ? 1 : (((long) g0Var.f473452g.size()) == 1L ? 0 : -1)) == 0 ? 2 : 1;
        r45.kr4 kr4Var = (r45.kr4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(getActivity(), 5, r45.kr4.class);
        if (kr4Var != null) {
            if (i17 == 1) {
                r45.hr4 hr4Var2 = (r45.hr4) kr4Var.getCustom(10);
                if (hr4Var2 != null) {
                    hr4Var2.set(1, java.lang.Long.valueOf(i17));
                    hr4Var2.set(4, java.lang.Long.valueOf(this.f150598n));
                    hr4Var2.set(2, java.lang.Long.valueOf(this.f150597m));
                    if (c01.id.c() >= hr4Var2.getLong(0)) {
                        hr4Var2.set(3, java.lang.Long.valueOf(hr4Var2.getLong(3) + (c01.id.c() - hr4Var2.getLong(0))));
                        hr4Var2.set(0, java.lang.Long.valueOf(c01.id.c()));
                    }
                    nk3.f.f338041a.b(hr4Var2);
                    kr4Var.set(10, null);
                    return;
                }
                return;
            }
            if (i17 != 2) {
                if (i17 == 3 && (hr4Var = (r45.hr4) kr4Var.getCustom(12)) != null) {
                    hr4Var.set(1, java.lang.Long.valueOf(i17));
                    hr4Var.set(4, java.lang.Long.valueOf(this.f150598n));
                    hr4Var.set(2, java.lang.Long.valueOf(this.f150597m));
                    if (c01.id.c() >= hr4Var.getLong(0)) {
                        hr4Var.set(3, java.lang.Long.valueOf(hr4Var.getLong(3) + (c01.id.c() - hr4Var.getLong(0))));
                        hr4Var.set(0, java.lang.Long.valueOf(c01.id.c()));
                    }
                    nk3.f.f338041a.b(hr4Var);
                    kr4Var.set(12, null);
                    return;
                }
                return;
            }
            r45.hr4 hr4Var3 = (r45.hr4) kr4Var.getCustom(11);
            if (hr4Var3 != null) {
                if (!hr4Var3.getBoolean(5)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "EduTypeEnterReport is skip");
                    return;
                }
                hr4Var3.set(1, java.lang.Long.valueOf(i17));
                hr4Var3.set(4, java.lang.Long.valueOf(this.f150598n));
                hr4Var3.set(2, java.lang.Long.valueOf(this.f150597m));
                if (this.f150597m != 7 && c01.id.c() >= hr4Var3.getLong(0)) {
                    hr4Var3.set(3, java.lang.Long.valueOf(hr4Var3.getLong(3) + (c01.id.c() - hr4Var3.getLong(0))));
                    hr4Var3.set(0, java.lang.Long.valueOf(c01.id.c()));
                }
                nk3.f.f338041a.b(hr4Var3);
                kr4Var.set(11, null);
            }
        }
    }

    public final boolean b7() {
        return ((com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class))).ij();
    }

    public final boolean c7() {
        pk3.h a17;
        yk3.i iVar = this.f150593f;
        if (iVar == null || (a17 = iVar.a(1048576, "MultiTaskForSnapshotMinusScreen")) == null) {
            return false;
        }
        return ((zk3.w0) a17).Y6();
    }

    public final void d7(boolean z17) {
        if (Y6()) {
            if (z17) {
                r45.kr4 kr4Var = (r45.kr4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(getActivity(), 5, r45.kr4.class);
                if (kr4Var != null) {
                    r45.hr4 hr4Var = (r45.hr4) kr4Var.getCustom(11);
                    if (hr4Var != null) {
                        hr4Var.set(0, java.lang.Long.valueOf(c01.id.c()));
                        hr4Var.set(5, java.lang.Boolean.TRUE);
                    }
                    r45.hr4 hr4Var2 = (r45.hr4) kr4Var.getCustom(10);
                    if (hr4Var2 != null) {
                        hr4Var2.set(0, java.lang.Long.valueOf(c01.id.c()));
                        hr4Var2.set(5, java.lang.Boolean.TRUE);
                    }
                    r45.hr4 hr4Var3 = (r45.hr4) kr4Var.getCustom(12);
                    if (hr4Var3 != null) {
                        hr4Var3.set(0, java.lang.Long.valueOf(c01.id.c()));
                        hr4Var3.set(5, java.lang.Boolean.TRUE);
                        return;
                    }
                    return;
                }
                return;
            }
            r45.kr4 kr4Var2 = (r45.kr4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(getActivity(), 5, r45.kr4.class);
            if (kr4Var2 != null) {
                r45.hr4 hr4Var4 = (r45.hr4) kr4Var2.getCustom(11);
                if (hr4Var4 != null && c01.id.c() >= hr4Var4.getLong(0) && !kr4Var2.getBoolean(9) && hr4Var4.getBoolean(5)) {
                    hr4Var4.set(3, java.lang.Long.valueOf(hr4Var4.getLong(3) + (c01.id.c() - hr4Var4.getLong(0))));
                    hr4Var4.set(0, java.lang.Long.valueOf(c01.id.c()));
                }
                r45.hr4 hr4Var5 = (r45.hr4) kr4Var2.getCustom(10);
                if (hr4Var5 != null && c01.id.c() >= hr4Var5.getLong(0) && !kr4Var2.getBoolean(9)) {
                    hr4Var5.set(3, java.lang.Long.valueOf(hr4Var5.getLong(3) + (c01.id.c() - hr4Var5.getLong(0))));
                    hr4Var5.set(0, java.lang.Long.valueOf(c01.id.c()));
                }
                r45.hr4 hr4Var6 = (r45.hr4) kr4Var2.getCustom(12);
                if (hr4Var6 == null || c01.id.c() < hr4Var6.getLong(0) || kr4Var2.getBoolean(9)) {
                    return;
                }
                hr4Var6.set(3, java.lang.Long.valueOf(hr4Var6.getLong(3) + (c01.id.c() - hr4Var6.getLong(0))));
                hr4Var6.set(0, java.lang.Long.valueOf(c01.id.c()));
            }
        }
    }

    public void e7(boolean z17) {
        r45.ir4 ir4Var;
        if (Y6()) {
            if (z17) {
                r45.kr4 kr4Var = (r45.kr4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(getActivity(), 5, r45.kr4.class);
                if (kr4Var == null || ((r45.ir4) kr4Var.getCustom(7)) == null) {
                    return;
                }
                kr4Var.set(1, java.lang.Long.valueOf(c01.id.c()));
                return;
            }
            r45.kr4 kr4Var2 = (r45.kr4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(getActivity(), 5, r45.kr4.class);
            if (kr4Var2 == null || (ir4Var = (r45.ir4) kr4Var2.getCustom(7)) == null || c01.id.c() < kr4Var2.getLong(1) || kr4Var2.getBoolean(9)) {
                return;
            }
            ir4Var.set(5, java.lang.Long.valueOf(ir4Var.getLong(5) + (c01.id.c() - kr4Var2.getLong(1))));
            kr4Var2.set(1, java.lang.Long.valueOf(c01.id.c()));
        }
    }

    public final boolean f7() {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        android.view.View j17;
        android.view.View view = this.f150607w;
        android.view.View view2 = null;
        if ((view != null ? view.getParent() : null) != null) {
            android.view.View view3 = this.f150607w;
            if (((view3 != null ? view3.getParent() : null) instanceof android.view.ViewGroup) && this.f150592e == null) {
                android.view.View view4 = this.f150607w;
                android.view.ViewParent parent = view4 != null ? view4.getParent() : null;
                kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getActivity());
                frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
                android.view.View view5 = this.f150607w;
                android.view.ViewParent parent2 = view5 != null ? view5.getParent() : null;
                kotlin.jvm.internal.o.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                java.util.Iterator it = q26.h0.y(new n3.r1((android.view.ViewGroup) parent2)).iterator();
                while (it.hasNext()) {
                    ym5.v6.b(frameLayout, (android.view.View) it.next());
                }
                ia0.n nVar = (ia0.n) i95.n0.c(ia0.n.class);
                androidx.appcompat.app.AppCompatActivity context = getActivity();
                ((ia0.o) nVar).getClass();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer dynamicBgContainer = new com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer(context, null, 0, 6, null);
                dynamicBgContainer.setVisibility(8);
                dynamicBgContainer.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
                viewGroup.addView(dynamicBgContainer);
                com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientColorBackgroundView = new com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView(getActivity());
                gradientColorBackgroundView.setBackground(null);
                gradientColorBackgroundView.setVisibility(8);
                gradientColorBackgroundView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
                viewGroup.addView(gradientColorBackgroundView);
                dynamicBgContainer.setGradientBgView(gradientColorBackgroundView);
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "create panel launcher");
                this.f150592e = frameLayout;
                this.f150602r = dynamicBgContainer;
                this.f150603s = dynamicBgContainer.getGradientBgView();
                androidx.appcompat.app.b supportActionBar = getActivity().getSupportActionBar();
                this.f150594g = (supportActionBar == null || (j17 = supportActionBar.j()) == null) ? null : (android.widget.ImageView) j17.findViewById(com.tencent.mm.R.id.actionbar_up_indicator_btn);
                ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).mj(2, zk3.x0.class);
                ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).mj(26, zk3.x0.class);
                ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).mj(0, zk3.g0.class);
                ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).mj(1, zk3.a.class);
                ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).mj(28, zk3.e.class);
                ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).mj(29, zk3.e.class);
                ((sy.x) ((ty.i0) i95.n0.c(ty.i0.class))).getClass();
                ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).mj(4, nd5.b.class);
                ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).mj(1048576, zk3.w0.class);
                ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Zi(getActivity(), new o04.c(kz5.c0.i("WebViewUI", "FinderLongVideoTimelineUI", "NoteEditorUI", "MiniQBReaderUI", "AppAttachDownloadUI", "ChooseMsgFileShowUI", "TopStoryFSVideoUI", "TopStoryMultiTaskListVideoUI", "LuggageGameWebViewUI"), r45.kr4.class, 5, true));
                ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).getClass();
                com.tencent.mm.plugin.multitask.i1.f150443w = this;
                if (this.f150591d == null) {
                    rk3.e eVar = new rk3.e(getActivity());
                    eVar.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
                    com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "create panel view");
                    C.a(i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a), i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a));
                    if (this.f150593f == null) {
                        this.f150593f = new yk3.i(getActivity(), this.B);
                    }
                    android.view.View inflate = getActivity().getLayoutInflater().inflate(com.tencent.mm.R.layout.f489320c46, (android.view.ViewGroup) null);
                    kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) inflate;
                    com.tencent.mm.plugin.multitask.ui.panel.MultiTaskContainerView multiTaskContainerView = (com.tencent.mm.plugin.multitask.ui.panel.MultiTaskContainerView) frameLayout2.findViewById(com.tencent.mm.R.id.jxo);
                    this.f150601q = multiTaskContainerView;
                    if (multiTaskContainerView != null) {
                        androidx.appcompat.app.AppCompatActivity activity = getActivity();
                        kotlin.jvm.internal.o.g(activity, "activity");
                        multiTaskContainerView.f150574i = com.tencent.mm.ui.zk.a(multiTaskContainerView.getContext(), 4);
                        multiTaskContainerView.f150575m = com.tencent.mm.ui.zk.a(multiTaskContainerView.getContext(), 8);
                        multiTaskContainerView.f150577o = com.tencent.mm.ui.zk.a(multiTaskContainerView.getContext(), 5) + multiTaskContainerView.f150575m;
                        multiTaskContainerView.f150578p = com.tencent.mm.ui.zk.a(multiTaskContainerView.getContext(), 20) + multiTaskContainerView.f150575m;
                        multiTaskContainerView.f150576n = (com.tencent.mm.ui.zk.a(multiTaskContainerView.getContext(), 48) / 2) + com.tencent.mm.ui.bl.i(com.tencent.mm.sdk.platformtools.x2.f193071a, -1);
                        android.graphics.Paint paint = multiTaskContainerView.f150571f;
                        paint.setColor(multiTaskContainerView.getResources().getColor(com.tencent.mm.R.color.f479446zj));
                        paint.setStyle(android.graphics.Paint.Style.STROKE);
                        paint.setStrokeWidth(com.tencent.mm.ui.zk.a(multiTaskContainerView.getContext(), 1));
                        paint.setFlags(1);
                        android.graphics.Paint paint2 = multiTaskContainerView.f150572g;
                        paint2.setColor(multiTaskContainerView.getResources().getColor(com.tencent.mm.R.color.f479446zj));
                        paint2.setStyle(android.graphics.Paint.Style.FILL);
                        paint2.setFlags(1);
                    }
                    frameLayout2.setDrawingCacheEnabled(false);
                    yk3.i iVar = this.f150593f;
                    if (iVar != null) {
                        if (iVar.f462806h == null) {
                            android.view.View inflate2 = iVar.f462802d.getLayoutInflater().inflate(com.tencent.mm.R.layout.c47, (android.view.ViewGroup) null);
                            com.tencent.mm.plugin.multitask.ui.MultiTaskPanelContainer multiTaskPanelContainer = (com.tencent.mm.plugin.multitask.ui.MultiTaskPanelContainer) inflate2.findViewById(com.tencent.mm.R.id.jv6);
                            iVar.f462805g = multiTaskPanelContainer;
                            if (multiTaskPanelContainer != null) {
                                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
                                multiTaskInfo.field_id = "MultiTaskForMinusScreen";
                                pk3.h c17 = iVar.c(multiTaskInfo);
                                if (c17 != null) {
                                    c17.getRootView().setPadding(0, 0, T, 0);
                                    ((zk3.g0) c17).f473459q = iVar;
                                }
                                lk3.b aj6 = ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).aj();
                                if (aj6 != null) {
                                    aj6.Q6(iVar.f462802d, iVar);
                                }
                                ((uh4.c0) i95.n0.c(uh4.c0.class)).Kb(iVar.f462828p);
                                iVar.f462827o.alive();
                                pk3.h a17 = iVar.a(0, "MultiTaskForMinusScreen");
                                if (a17 != null) {
                                }
                                iVar.onStart();
                                iVar.onResume();
                            }
                            iVar.f462806h = inflate2;
                        }
                        view2 = iVar.f462806h;
                    }
                    frameLayout2.addView(view2, new android.view.ViewGroup.LayoutParams(-1, -1));
                    int i17 = (int) ((F - T) * 1.0f);
                    frameLayout2.setPadding(0, 0, i17, 0);
                    eVar.addView(frameLayout, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
                    eVar.addView(frameLayout2, 1, new android.view.ViewGroup.LayoutParams(-1, -1));
                    android.view.animation.Interpolator loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(eVar.getContext(), com.tencent.mm.R.anim.f477822cg);
                    rk3.d dVar = new rk3.d(eVar);
                    kotlin.jvm.internal.o.d(loadInterpolator);
                    android.content.Context context2 = eVar.getContext();
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    eVar.f396496d = new ek3.d(context2, eVar, dVar, loadInterpolator, null);
                    android.content.Context context3 = eVar.getContext();
                    float g17 = (context3 == null || (resources = context3.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? i65.a.g(eVar.getContext()) : displayMetrics.density;
                    float f17 = 100 * g17;
                    float f18 = 300 * g17;
                    ek3.d dVar2 = eVar.f396496d;
                    if (dVar2 != null) {
                        dVar2.f253599n = f17;
                    }
                    if (dVar2 != null) {
                        dVar2.f253598m = f18;
                    }
                    java.lang.Object systemService = eVar.getContext().getSystemService("vibrator");
                    kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                    eVar.f396500h = (android.os.Vibrator) systemService;
                    eVar.setSlideLeft(false);
                    eVar.setPanelWidth(F);
                    eVar.setPanelExpose(T);
                    eVar.setExtraSlideRange(i17);
                    if (com.tencent.mm.ui.bk.C()) {
                        eVar.setCoveredFadeColor(5066061);
                    } else {
                        eVar.setCoveredFadeColor(3618127);
                    }
                    eVar.setOverlayed(true);
                    synchronized (eVar.f396502m) {
                        eVar.f396502m.add(this);
                    }
                    eVar.setFadeOnClickListener(new zk3.i0(this));
                    eVar.i(1, false);
                    this.f150591d = eVar;
                }
                viewGroup.addView(this.f150591d);
            }
        }
        return this.f150592e != null;
    }

    public final void g7() {
        if (Y6()) {
            getActivity().setRequestedOrientation(1);
            return;
        }
        android.content.SharedPreferences sharedPreferences = getActivity().getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
        kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "set ScreenOrientation，now is ： %s", java.lang.Boolean.valueOf(sharedPreferences.getBoolean("settings_landscape_mode", false)));
        if (sharedPreferences.getBoolean("settings_landscape_mode", false)) {
            getActivity().setRequestedOrientation(-1);
        } else {
            getActivity().setRequestedOrientation(1);
        }
    }

    public void h7(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "showHome, smoothScroll:" + z17);
        k7(this, z17, false, false, false, false, false, false, false, 252, null);
    }

    public final void i7(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37, boolean z38) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "showHome, smoothScroll:" + z17 + ", fromClick:" + z18 + ", fromSwipe:" + z18 + ", fromFullSwipe:" + z27 + ", fromSysClick:" + z28 + ", fromFadeClick:" + z29 + ", fromDeleteAll:" + z37);
        if (z18) {
            if (z28) {
                this.f150596i = 8;
            } else if (z38) {
                this.f150596i = 2;
            } else {
                this.f150596i = 4;
            }
        } else if (z19) {
            this.f150596i = 1;
        } else {
            this.f150596i = 3;
        }
        if (z28) {
            this.f150597m = 8;
        } else if (z29) {
            this.f150597m = 2;
        } else if (z38) {
            this.f150597m = 5;
        } else if (z27) {
            this.f150597m = 7;
        } else if (z37) {
            this.f150597m = 6;
        } else if (z18) {
            this.f150597m = 1;
        } else if (z19) {
            this.f150597m = 3;
        } else {
            this.f150597m = 9;
        }
        com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientColorBackgroundView = this.f150603s;
        if (gradientColorBackgroundView != null) {
            gradientColorBackgroundView.setVisibility(0);
        }
        com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientColorBackgroundView2 = this.f150603s;
        if (gradientColorBackgroundView2 != null) {
            gradientColorBackgroundView2.setAlpha(1.0f);
        }
        rk3.e eVar = this.f150591d;
        if (eVar != null) {
            eVar.i(1, z17);
        }
        if (z17) {
            return;
        }
        m7();
    }

    public boolean l7(boolean z17, int i17) {
        android.content.res.Configuration configuration;
        android.content.res.Resources resources = getActivity().getResources();
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            int i18 = configuration.orientation;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "showPanel, smoothScroll:" + z17);
        boolean f76 = f7();
        this.f150604t.postUI(new zk3.n0(this, i17, z17));
        return f76;
    }

    public final void m7() {
        jz5.f0 f0Var;
        pk3.h b17;
        pk3.h a17;
        yk3.i iVar = this.f150593f;
        if (iVar == null || (b17 = iVar.b(1048576, "MultiTaskForSnapshotMinusScreen")) == null) {
            f0Var = null;
        } else {
            yk3.i iVar2 = this.f150593f;
            if (iVar2 != null && (a17 = iVar2.a(0, "MultiTaskForMinusScreen")) != null) {
                ((zk3.g0) a17).d7(((zk3.w0) b17).f473518e, false, false);
                X6(false);
            }
            ((zk3.w0) b17).X6();
            T6(true);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            X6(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n7() {
        /*
            r5 = this;
            rk3.e r0 = r5.f150591d
            boolean r0 = r5.P6(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L27
            zk3.b r0 = r5.f150608x
            if (r0 == 0) goto L13
            boolean r0 = r0.b()
            goto L14
        L13:
            r0 = r2
        L14:
            if (r0 == 0) goto L27
            j62.e r0 = j62.e.g()
            com.tencent.mm.repairer.config.multitask.RepairerConfigGlobalDynamicBg r3 = new com.tencent.mm.repairer.config.multitask.RepairerConfigGlobalDynamicBg
            r3.<init>()
            int r0 = r0.c(r3)
            if (r0 != r2) goto L27
            r0 = r2
            goto L28
        L27:
            r0 = r1
        L28:
            r5.f150609y = r0
            wk3.a r0 = wk3.a.f446957a
            androidx.appcompat.app.AppCompatActivity r0 = r5.getActivity()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.util.Set r3 = wk3.a.f446958b
            boolean r0 = kz5.n0.O(r3, r0)
            if (r0 == 0) goto L42
            r5.f150609y = r1
        L42:
            boolean r0 = r5.f150609y
            java.lang.String r3 = "MicroMsg.MultiTask.MultiTaskUIC"
            if (r0 != 0) goto L51
            java.lang.String r0 = "force switchToStaticBg"
            com.tencent.mars.xlog.Log.i(r3, r0)
            r5.o7(r1, r2, r2)
            return
        L51:
            boolean r0 = r5.A
            if (r0 != 0) goto L83
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r4 = e42.d0.clicfg_multitask_minimize_disable_dynamic_bg
            h62.d r0 = (h62.d) r0
            int r0 = r0.Ni(r4, r1)
            if (r0 != r2) goto L68
            goto L83
        L68:
            java.lang.String r0 = "virbg: switchToDynamicBg"
            com.tencent.mars.xlog.Log.i(r3, r0)
            r5.A = r2
            java.lang.Runnable r0 = r5.f150610z
            if (r0 == 0) goto L7c
            com.tencent.mm.sdk.platformtools.n3 r1 = r5.f150604t
            r1.removeCallbacks(r0)
            r0 = 0
            r5.f150610z = r0
        L7c:
            com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer r0 = r5.f150602r
            if (r0 == 0) goto L83
            r0.a()
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.n7():void");
    }

    public void o7(boolean z17, boolean z18, boolean z19) {
        if (this.A || z19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "virbg: switchToStaticBg");
            this.A = false;
            if (this.f150602r != null) {
                com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientColorBackgroundView = this.f150603s;
                if (gradientColorBackgroundView != null) {
                    gradientColorBackgroundView.setVisibility(0);
                }
                com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientColorBackgroundView2 = this.f150603s;
                if (gradientColorBackgroundView2 != null) {
                    gradientColorBackgroundView2.setAlpha(1.0f);
                }
            }
            if (!z17) {
                com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer dynamicBgContainer = this.f150602r;
                if (dynamicBgContainer != null) {
                    dynamicBgContainer.b(z18);
                    return;
                }
                return;
            }
            java.lang.Runnable runnable = this.f150610z;
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f150604t;
            if (runnable != null) {
                n3Var.removeCallbacks(runnable);
                this.f150610z = null;
            }
            zk3.k0 k0Var = new zk3.k0(this);
            this.f150610z = k0Var;
            n3Var.postDelayed(k0Var, 500L);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "onBeforeFinish");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        C.a(i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a), i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a));
        int i17 = newConfig.orientation;
        this.f150599o = i17;
        if (i17 != 2 || Y6()) {
            T6(true);
            if (newConfig.orientation != 2 && O6()) {
                com.tencent.mm.plugin.multitask.m0.b(((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ni(), null, null, 3, null);
            }
        } else {
            T6(false);
            rk3.e eVar = this.f150591d;
            if (eVar != null && eVar.f()) {
                k7(this, false, false, false, false, false, true, false, false, 192, null);
            }
            if (!com.tencent.mm.sdk.platformtools.x2.n()) {
                com.tencent.mm.plugin.multitask.m0.d(((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ni(), null, null, 3, null);
            }
        }
        yk3.i iVar = this.f150593f;
        if (iVar != null) {
            iVar.onConfigurationChanged(newConfig);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "onConfigurationChanged, orientation: " + this.f150599o);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "onCreateBefore");
        this.B = bundle;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "onDestroy, isMultiTaskPanel:" + Y6() + ", page:" + getActivity().getClass().getName());
        yk3.i iVar = this.f150593f;
        if (iVar != null) {
            iVar.onDestroy();
        }
        dead();
        rk3.e eVar = this.f150591d;
        if (eVar != null) {
            synchronized (eVar.f396502m) {
                eVar.f396502m.remove(this);
            }
        }
        if (((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)) != null) {
            com.tencent.mm.plugin.multitask.i1.f150443w = null;
        }
        com.tencent.mm.plugin.multitask.i1 i1Var = (com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class);
        if (i1Var != null) {
            com.tencent.mm.ipcinvoker.extension.l.c(i1Var.f150456r);
            i1Var.f150456r = null;
        }
        com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer dynamicBgContainer = this.f150602r;
        if (dynamicBgContainer != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgContainer.", "release");
            dynamicBgContainer.released = true;
            if (dynamicBgContainer.dynamicBgSurfaceView != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgContainer.", "removed");
                dynamicBgContainer.removeView(dynamicBgContainer.dynamicBgSurfaceView);
                dynamicBgContainer.dynamicBgSurfaceView = null;
            }
        }
        this.f150604t.removeCallbacksAndMessages(null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onKeyUp(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "onPause, isMultiTaskPanel:%b", java.lang.Boolean.valueOf(Y6()));
        if (Y6()) {
            yk3.i iVar = this.f150593f;
            if (iVar != null) {
                iVar.onPause();
            }
            p7(this, false, false, false, 6, null);
        }
        d7(false);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        yk3.i iVar = this.f150593f;
        if (iVar != null) {
            iVar.onRequestPermissionsResult(i17, permissions, grantResults);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "onRestoreInstanceState");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        pk3.h a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "onResume, isMultiTaskPanel:" + Y6() + ", page:" + getActivity().getClass().getName());
        this.f150605u = true;
        if (Y6()) {
            yk3.i iVar = this.f150593f;
            if (iVar != null) {
                iVar.onResume();
            }
            if ((this.f150593f != null) && !c7()) {
                n7();
            }
            yk3.i iVar2 = this.f150593f;
            if (iVar2 != null && (a17 = iVar2.a(0, "MultiTaskForMinusScreen")) != null) {
                zk3.g0 g0Var = (zk3.g0) a17;
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = g0Var.f473462t;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.z0();
                }
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = g0Var.f473462t;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.A0();
                }
            }
            g7();
        } else {
            m7();
        }
        d7(true);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "onSaveInstanceState");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        yk3.i iVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "onStart, isMultiTaskPanel:%b", java.lang.Boolean.valueOf(Y6()));
        if (!Y6() || (iVar = this.f150593f) == null) {
            return;
        }
        iVar.onStart();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onStartActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "onStop, isMultiTaskPanel:%b", java.lang.Boolean.valueOf(Y6()));
        this.f150605u = false;
        if (Y6()) {
            yk3.i iVar = this.f150593f;
            if (iVar != null) {
                iVar.onStop();
            }
            p7(this, false, false, false, 6, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x033e, code lost:
    
        if ((r0 != null && (r0.f462807i instanceof zk3.g0)) != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x045c, code lost:
    
        if ((r0 != null && (r0.f462807i instanceof zk3.g0)) != false) goto L251;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02f3  */
    @Override // rk3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(android.view.View r25, int r26) {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.p(android.view.View, int):void");
    }

    @Override // rk3.b
    public boolean q0() {
        return !b7() || Y6();
    }

    public final void q7(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "updateLoadingMode, loadingMode:" + i17);
        com.tencent.mm.plugin.multitask.ui.panel.MultiTaskContainerView multiTaskContainerView = this.f150601q;
        if (multiTaskContainerView != null) {
            multiTaskContainerView.f150579q = i17;
            multiTaskContainerView.invalidate();
        }
    }

    @Override // rk3.b
    public void t1(android.view.View view, rk3.c previousState, rk3.c newState) {
        com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer dynamicBgContainer;
        android.content.res.Resources resources;
        android.content.res.Configuration configuration;
        kotlin.jvm.internal.o.g(previousState, "previousState");
        kotlin.jvm.internal.o.g(newState, "newState");
        previousState.toString();
        newState.toString();
        if (newState != previousState) {
            int i17 = 2;
            if (!Y6()) {
                rk3.c cVar = rk3.c.f396489e;
                if (previousState == cVar && (resources = getActivity().getResources()) != null && (configuration = resources.getConfiguration()) != null) {
                    int i18 = configuration.orientation;
                }
                if (!c7() && previousState == cVar && newState == rk3.c.f396492h) {
                    n7();
                }
            }
            int ordinal = newState.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                i17 = 0;
            } else if (ordinal == 4) {
                i17 = 1;
            }
            zk3.b bVar = this.f150608x;
            if (bVar != null) {
                bVar.g(i17, 1 ^ (Y6() ? 1 : 0));
            }
        }
        if (newState != previousState && newState == rk3.c.f396489e) {
            p7(this, false, false, false, 6, null);
        }
        if (newState != previousState && c7()) {
            if (newState == rk3.c.f396488d) {
                com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer dynamicBgContainer2 = this.f150602r;
                if (dynamicBgContainer2 != null) {
                    dynamicBgContainer2.setGradientBgViewVisibility(0);
                }
            } else if (newState == rk3.c.f396489e && (dynamicBgContainer = this.f150602r) != null) {
                dynamicBgContainer.setGradientBgViewVisibility(8);
            }
        }
        yk3.i iVar = this.f150593f;
        pk3.h a17 = iVar != null ? iVar.a(0, "MultiTaskForMinusScreen") : null;
        zk3.g0 g0Var = a17 instanceof zk3.g0 ? (zk3.g0) a17 : null;
        if (newState == rk3.c.f396489e && !b7()) {
            com.tencent.mm.plugin.multitask.ui.panel.MultiTaskContainerView multiTaskContainerView = this.f150601q;
            if (multiTaskContainerView != null) {
                multiTaskContainerView.f150573h = 0.0f;
                multiTaskContainerView.invalidate();
            }
            android.widget.ImageView imageView = this.f150594g;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            if (g0Var != null) {
                g0Var.b7(view, 0.0f, 0.0f);
                return;
            }
            return;
        }
        if (newState == rk3.c.f396488d) {
            com.tencent.mm.plugin.multitask.ui.panel.MultiTaskContainerView multiTaskContainerView2 = this.f150601q;
            if (multiTaskContainerView2 != null) {
                multiTaskContainerView2.f150573h = 1.0f;
                multiTaskContainerView2.invalidate();
            }
            android.widget.ImageView imageView2 = this.f150594g;
            if (imageView2 != null) {
                imageView2.setAlpha(0.0f);
            }
            if (g0Var != null) {
                g0Var.b7(view, 1.0f, 0.0f);
            }
        }
    }

    @Override // rk3.b
    public void y0(float f17) {
        com.tencent.mm.plugin.multitask.ui.panel.MultiTaskContainerView multiTaskContainerView;
        if (!(!Y6()) || (multiTaskContainerView = this.f150601q) == null) {
            return;
        }
        multiTaskContainerView.f150573h = f17;
        multiTaskContainerView.invalidate();
    }
}
