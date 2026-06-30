package com.tencent.mm.pluginsdk.ui.tools;

@db5.a(3)
/* loaded from: classes8.dex */
public class MiniQBReaderUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements com.tencent.mm.pluginsdk.ui.tools.w3 {
    public static final /* synthetic */ int R = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f191397o;

    /* renamed from: r, reason: collision with root package name */
    public gc5.b f191400r;

    /* renamed from: s, reason: collision with root package name */
    public md5.b f191401s;

    /* renamed from: t, reason: collision with root package name */
    public md5.a f191402t;

    /* renamed from: w, reason: collision with root package name */
    public boolean f191405w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.handoff.model.HandOffFile f191406x;

    /* renamed from: d, reason: collision with root package name */
    public long f191389d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f191390e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f191391f = false;

    /* renamed from: g, reason: collision with root package name */
    public long f191392g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f191393h = false;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f191394i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f191395m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f191396n = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f191398p = "";

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f191399q = java.lang.Integer.toString(hashCode());

    /* renamed from: u, reason: collision with root package name */
    public boolean f191403u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f191404v = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f191407y = false;

    /* renamed from: z, reason: collision with root package name */
    public int f191408z = 0;
    public boolean A = false;
    public boolean B = false;
    public android.view.View C = null;
    public com.tencent.mm.pluginsdk.ui.tools.g6 D = null;
    public com.tencent.mm.pluginsdk.model.m2 E = null;
    public com.tencent.mm.pluginsdk.model.g2 F = null;
    public final com.tencent.mm.sdk.event.IListener G = new com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI.AnonymousClass1(com.tencent.mm.app.a0.f53288d);
    public final android.webkit.ValueCallback H = new com.tencent.mm.pluginsdk.ui.tools.x4(this);
    public uh0.v I = null;

    /* renamed from: J, reason: collision with root package name */
    public final android.webkit.ValueCallback f191388J = new com.tencent.mm.pluginsdk.ui.tools.z4(this);
    public java.lang.String K = null;
    public com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection L = null;
    public zh1.v0 M = null;
    public zh1.z0 N = null;
    public zh1.w0 P = null;
    public boolean Q = false;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI$1, reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MiniQbFloatBallMenuActionEvent> {
        public AnonymousClass1(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 1644922434;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.MiniQbFloatBallMenuActionEvent miniQbFloatBallMenuActionEvent) {
            am.sj sjVar;
            com.tencent.mm.autogen.events.MiniQbFloatBallMenuActionEvent miniQbFloatBallMenuActionEvent2 = miniQbFloatBallMenuActionEvent;
            if (miniQbFloatBallMenuActionEvent2 != null && (sjVar = miniQbFloatBallMenuActionEvent2.f54495g) != null) {
                com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI = com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI.this;
                if (miniQBReaderUI.f191401s != null) {
                    boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0(sjVar.f7901b, miniQBReaderUI.f191394i);
                    java.lang.String str = miniQBReaderUI.f191399q;
                    if (D0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "MiniQbFloatBallMenuActionEvent event.data.action:%s", java.lang.Integer.valueOf(sjVar.f7900a));
                        switch (sjVar.f7900a) {
                            case 1:
                            case 8:
                                miniQBReaderUI.f191401s.B(true);
                                break;
                            case 2:
                                miniQBReaderUI.f191401s.B(false);
                                boolean z17 = miniQBReaderUI.f191404v;
                                android.webkit.ValueCallback valueCallback = miniQBReaderUI.f191388J;
                                if (!z17) {
                                    miniQBReaderUI.f191403u = false;
                                    com.tencent.mm.xwebutil.i.a(miniQBReaderUI, str, miniQBReaderUI.f191394i);
                                    vt0.c.d(false, false, miniQBReaderUI.f191405w, false, miniQBReaderUI, miniQBReaderUI.f191394i, miniQBReaderUI.f191398p, miniQBReaderUI.f191395m, miniQBReaderUI.f191399q, miniQBReaderUI.f191397o, valueCallback, com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI.V6(miniQBReaderUI, false), miniQBReaderUI.f191397o, miniQBReaderUI.f191407y);
                                    break;
                                } else {
                                    vt0.c.g(miniQBReaderUI.f191405w, false, false, miniQBReaderUI, miniQBReaderUI.f191394i, miniQBReaderUI.f191398p, miniQBReaderUI.f191395m, miniQBReaderUI.f191399q, miniQBReaderUI.f191397o, valueCallback, miniQBReaderUI.H, false, "", miniQBReaderUI.f191407y);
                                    break;
                                }
                            case 4:
                                zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                                java.lang.String str2 = miniQBReaderUI.f191394i;
                                java.lang.String str3 = miniQBReaderUI.f191398p;
                                com.tencent.mm.pluginsdk.ui.tools.u4 u4Var = new com.tencent.mm.pluginsdk.ui.tools.u4(this);
                                ((yb0.g) b0Var).getClass();
                                com.tencent.mm.platformtools.ExportFileUtil.e(miniQBReaderUI, str2, str3, u4Var);
                                break;
                            case 5:
                                if (miniQBReaderUI.f191406x != null) {
                                    ((d73.i) i95.n0.c(d73.i.class)).f6(miniQBReaderUI.f191406x);
                                    break;
                                }
                                break;
                            case 6:
                                com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "MiniQbFloatBallMenuActionEvent.UPDATE_READ_PROGRESS readState:%d", java.lang.Integer.valueOf(sjVar.f7902c));
                                if (miniQBReaderUI.f191401s == null) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.MiniQBReaderUI", "MiniQbFloatBallMenuActionEvent.UPDATE_READ_PROGRESS mFloatBallHelper==null");
                                }
                                int i17 = sjVar.f7902c;
                                if (i17 != 0) {
                                    if (i17 == 1) {
                                        miniQBReaderUI.f191401s.f325883y = true;
                                        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "setEnded ended:%b", java.lang.Boolean.TRUE);
                                        break;
                                    }
                                } else {
                                    md5.b bVar = miniQBReaderUI.f191401s;
                                    ak3.c cVar = bVar.f300111d;
                                    bVar.m(bVar.h(cVar != null ? cVar.getBitmap() : null));
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "setStart");
                                    break;
                                }
                                break;
                            case 7:
                                miniQBReaderUI.W6(new com.tencent.mm.pluginsdk.ui.tools.h5(null));
                                break;
                            case 9:
                                if (miniQBReaderUI.f191407y) {
                                    miniQBReaderUI.W6(new com.tencent.mm.pluginsdk.ui.tools.f5(null));
                                    break;
                                }
                                break;
                            case 10:
                                if (miniQBReaderUI.f191407y) {
                                    miniQBReaderUI.Y6(1);
                                    break;
                                }
                                break;
                            case 11:
                                miniQBReaderUI.f191408z = 2;
                                miniQBReaderUI.A = true;
                                miniQBReaderUI.f191403u = false;
                                if (com.tencent.mm.ui.fl.a(com.tencent.mm.ui.fl.f208605a, miniQBReaderUI.getTaskId()) == 1) {
                                    miniQBReaderUI.B = true;
                                }
                                com.tencent.mm.ui.ee.g(miniQBReaderUI.getTaskId(), 2);
                                break;
                            case 12:
                                miniQBReaderUI.f191408z = 0;
                                miniQBReaderUI.A = true;
                                miniQBReaderUI.f191403u = false;
                                com.tencent.mm.ui.ee.g(miniQBReaderUI.getTaskId(), 0);
                                break;
                        }
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MiniQBReaderUI", "MiniQbFloatBallMenuActionEvent event.data.action:%s event.data.filePath:%s filePath:%s", java.lang.Integer.valueOf(sjVar.f7900a), sjVar.f7901b, miniQBReaderUI.f191394i);
                        if (sjVar.f7900a == 3) {
                            com.tencent.mm.xwebutil.i.a(miniQBReaderUI, str, miniQBReaderUI.f191394i);
                            md5.b bVar2 = miniQBReaderUI.f191401s;
                            if (bVar2 != null) {
                                bVar2.A();
                            }
                            gc5.b bVar3 = miniQBReaderUI.f191400r;
                            if (bVar3 != null) {
                                bVar3.z();
                            }
                        }
                    }
                    return false;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MiniQBReaderUI", "MiniQbFloatBallMenuActionEvent fail");
            return false;
        }
    }

    public static uh0.v V6(com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI, boolean z17) {
        uh0.v vVar;
        if (!z17 && (vVar = miniQBReaderUI.I) != null) {
            return vVar;
        }
        uh0.v vVar2 = miniQBReaderUI.I;
        if (vVar2 != null) {
            vVar2.f427739a = true;
        }
        com.tencent.mm.pluginsdk.ui.tools.y4 y4Var = new com.tencent.mm.pluginsdk.ui.tools.y4(miniQBReaderUI);
        miniQBReaderUI.I = y4Var;
        return y4Var;
    }

    public final void W6(com.tencent.mm.pluginsdk.ui.tools.e5 e5Var) {
        com.tencent.mm.plugin.appbrand.service.k5 k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class);
        android.util.Pair pair = null;
        if (k5Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MiniQBReaderUI", "prepareServiceAndMaterialModel, openMaterialService is null");
        } else {
            zh1.p pVar = (zh1.p) k5Var;
            if (!pVar.Vi(bi1.g.ATTACH)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "prepareServiceAndMaterialModel, openMaterialService is not enabled");
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f191394i)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "prepareServiceAndMaterialModel, filePath is empty");
            } else {
                pair = new android.util.Pair(pVar, com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel.b(this.f191394i, this.f191395m));
            }
        }
        if (pair == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MiniQBReaderUI", "doSomeOpenMaterialTask, serviceAndMaterialModel is null");
            return;
        }
        com.tencent.mm.plugin.appbrand.service.k5 k5Var2 = (com.tencent.mm.plugin.appbrand.service.k5) pair.first;
        com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel = (com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel) pair.second;
        java.lang.String str = this.f191394i;
        if (str == null || !str.equals(this.K) || this.L == null) {
            ((zh1.p) k5Var2).Ni(materialModel, new com.tencent.mm.pluginsdk.ui.tools.d5(this, materialModel, k5Var2, e5Var));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "doSomeOpenMaterialTask, already fetchOpenMaterials");
            e5Var.a(this, k5Var2, this.L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x010e, code lost:
    
        if (r5.getStringArray("u") != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X6() {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI.X6():void");
    }

    public final void Y6(int i17) {
        zh1.w0 w0Var = this.P;
        if (w0Var != null) {
            ((di1.f) w0Var).d();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "tryReportOpenMaterialEntranceExposure, openMaterialReporter is null");
        if (10 > i17) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.pluginsdk.ui.tools.b5 b5Var = new com.tencent.mm.pluginsdk.ui.tools.b5(this, i17 + 1);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(b5Var, 100L, false);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        gc5.b bVar = this.f191400r;
        if (bVar == null) {
            super.finish();
            return;
        }
        bVar.p();
        if (!this.f191400r.s0()) {
            super.finish();
        } else {
            ep1.m.e(this);
            this.f191400r.g0(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI$$b
                @Override // java.lang.Runnable
                public final void run() {
                    super/*com.tencent.mm.ui.vas.VASActivity*/.finish();
                }
            });
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 2;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.w3
    public ty.l0 i5() {
        return new ty.l0(true, "", "", "", false, false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
        com.tencent.mm.pluginsdk.ui.tools.f.f(this, i17, i18, intent, true, com.tencent.mm.R.string.brq, com.tencent.mm.R.string.brr, 1);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f191394i = getIntent().getStringExtra("file_path");
        W6(new com.tencent.mm.pluginsdk.ui.tools.i5(null));
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "onCreate filePath:%s %s", this.f191394i, toString());
        com.tencent.mm.autogen.events.MiniQbFloatBallMenuActionEvent miniQbFloatBallMenuActionEvent = new com.tencent.mm.autogen.events.MiniQbFloatBallMenuActionEvent();
        am.sj sjVar = miniQbFloatBallMenuActionEvent.f54495g;
        sjVar.f7900a = 3;
        sjVar.f7901b = getIntent().getStringExtra("file_path");
        miniQbFloatBallMenuActionEvent.b(android.os.Looper.getMainLooper());
        ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.pluginsdk.ui.tools.v4(this), 300L);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "onDestroy %s", toString());
        com.tencent.mm.xwebutil.i.a(this, this.f191399q, this.f191394i);
        if (com.tencent.mm.ui.fj.b(this)) {
            com.tencent.mm.ui.fj.d(com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI.class, 0);
        }
        super.onDestroy();
        com.tencent.mm.sdk.event.IListener iListener = this.G;
        if (iListener != null) {
            iListener.dead();
        }
        md5.b bVar = this.f191401s;
        if (bVar != null) {
            bVar.getClass();
        }
        gc5.b bVar2 = this.f191400r;
        if (bVar2 != null) {
            bVar2.o0();
        }
        if (this.f191406x != null) {
            ((d73.i) i95.n0.c(d73.i.class)).a9(this.f191406x);
        }
        ((v02.f0) ((a00.j) i95.n0.c(a00.j.class))).ij();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        md5.b bVar;
        if (i17 == 4 && (bVar = this.f191401s) != null && bVar.U(2, bVar.f325883y)) {
            return true;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "onNewIntent %s", toString());
        setIntent(intent);
        java.lang.String stringExtra = getIntent().getStringExtra("file_path");
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "onNewIntent() newFilePath:%s filePath:%s", stringExtra, this.f191394i);
        if (com.tencent.mm.sdk.platformtools.t8.D0(stringExtra, this.f191394i)) {
            return;
        }
        this.f191403u = false;
        com.tencent.mm.xwebutil.i.a(this, this.f191399q, this.f191394i);
        md5.b bVar = this.f191401s;
        if (bVar != null) {
            bVar.A();
            this.f191401s.getClass();
        }
        gc5.b bVar2 = this.f191400r;
        if (bVar2 != null) {
            bVar2.z();
            this.f191400r.o0();
        }
        X6();
        W6(new com.tencent.mm.pluginsdk.ui.tools.i5(null));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "onPause %s", toString());
        super.onPause();
        md5.b bVar = this.f191401s;
        if (bVar != null) {
            this.Q = false;
            bVar.A();
        }
        gc5.b bVar2 = this.f191400r;
        if (bVar2 != null) {
            bVar2.z();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "onResume %s", toString());
        super.onResume();
        gc5.b bVar = this.f191400r;
        if (bVar != null) {
            bVar.x();
        }
        md5.b bVar2 = this.f191401s;
        if (bVar2 != null) {
            bVar2.z();
        } else {
            this.Q = true;
        }
        if (this.A) {
            if (this.B) {
                X6();
                this.B = false;
            }
            com.tencent.mm.ui.ee.g(getTaskId(), this.f191408z);
            this.A = false;
        }
    }
}
