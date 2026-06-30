package com.tencent.mm.plugin.shake.ui;

@db5.a(160)
@ul5.d(0)
/* loaded from: classes11.dex */
public class ShakeReportUI extends com.tencent.mm.ui.MMActivity implements c01.y8, c34.x, l75.z0, l75.q0, x51.r0, f34.e {

    /* renamed from: r2, reason: collision with root package name */
    public static final java.util.List f162118r2 = new java.util.concurrent.CopyOnWriteArrayList();
    public android.view.animation.Animation A;
    public android.view.animation.Animation B;
    public android.view.animation.Animation C;
    public android.view.animation.Animation D;
    public android.view.animation.Animation E;
    public android.view.animation.Animation F;
    public android.app.Dialog F1;
    public android.view.animation.Animation G;
    public android.view.animation.Animation H;
    public com.tencent.mm.ui.widget.imageview.WeImageView H1;
    public android.widget.TextView I1;
    public com.tencent.mm.ui.widget.imageview.WeImageView J1;
    public android.view.View K;
    public android.widget.TextView K1;
    public android.view.View L;
    public android.widget.ImageView L1;
    public android.view.View M;
    public android.view.View N;
    public android.widget.ImageView N1;
    public android.view.View O1;
    public android.view.View P;
    public android.widget.ImageView P1;
    public android.animation.AnimatorSet Q;
    public android.widget.ImageView Q1;
    public android.animation.AnimatorSet R;
    public android.widget.ImageView R1;
    public android.animation.AnimatorSet S;
    public android.widget.ImageView S1;
    public android.view.View T1;
    public h34.t U;
    public android.view.View U1;
    public com.tencent.mm.plugin.gif.MMAnimateView V;
    public android.view.View V1;
    public com.tencent.mm.plugin.gif.MMAnimateView W;
    public android.view.View W1;
    public android.widget.ImageView X;
    public android.view.View X1;
    public boolean Y;
    public android.widget.TextView Z;
    public com.tencent.mm.plugin.shake.shakecard.ui.e Z1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f162127f;

    /* renamed from: f2, reason: collision with root package name */
    public boolean f162128f2;

    /* renamed from: h2, reason: collision with root package name */
    public i11.e f162132h2;

    /* renamed from: j2, reason: collision with root package name */
    public bw5.lp0 f162135j2;

    /* renamed from: k2, reason: collision with root package name */
    public bw5.cr0 f162136k2;

    /* renamed from: l1, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f162137l1;

    /* renamed from: l2, reason: collision with root package name */
    public int f162138l2;

    /* renamed from: m2, reason: collision with root package name */
    public boolean f162140m2;

    /* renamed from: n, reason: collision with root package name */
    public q35.d f162141n;

    /* renamed from: n2, reason: collision with root package name */
    public b66.g f162142n2;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.shake.ui.i f162143o;

    /* renamed from: o2, reason: collision with root package name */
    public long f162144o2;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.TextView f162146p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f162147p1;

    /* renamed from: p2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f162148p2;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f162149q;

    /* renamed from: q2, reason: collision with root package name */
    public final android.view.View.OnClickListener f162150q2;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f162151r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f162152s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f162153t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f162154u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f162155v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f162156w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f162157x;

    /* renamed from: x0, reason: collision with root package name */
    public int f162158x0;

    /* renamed from: x1, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f162159x1;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f162160y;

    /* renamed from: y0, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f162161y0;

    /* renamed from: z, reason: collision with root package name */
    public android.view.animation.Animation f162163z;

    /* renamed from: d, reason: collision with root package name */
    public boolean f162123d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f162125e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f162129g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f162131h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f162133i = false;

    /* renamed from: m, reason: collision with root package name */
    public int f162139m = 22;

    /* renamed from: p, reason: collision with root package name */
    public final c34.a0 f162145p = new c34.a0();
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public int f162119J = 1;
    public java.lang.Boolean T = java.lang.Boolean.FALSE;

    /* renamed from: y1, reason: collision with root package name */
    public android.view.View f162162y1 = null;

    /* renamed from: z1, reason: collision with root package name */
    public android.view.View f162164z1 = null;
    public com.tencent.mm.ui.MMImageView A1 = null;
    public android.widget.TextView B1 = null;
    public android.widget.ImageView C1 = null;
    public java.lang.String D1 = "";
    public android.graphics.Bitmap E1 = null;
    public c34.r G1 = null;
    public int M1 = 1;
    public int Y1 = 0;

    /* renamed from: a2, reason: collision with root package name */
    public boolean f162120a2 = false;

    /* renamed from: b2, reason: collision with root package name */
    public final java.util.Map f162121b2 = new java.util.HashMap();

    /* renamed from: c2, reason: collision with root package name */
    public boolean f162122c2 = false;

    /* renamed from: d2, reason: collision with root package name */
    public boolean f162124d2 = true;

    /* renamed from: e2, reason: collision with root package name */
    public boolean f162126e2 = false;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f162130g2 = false;

    /* renamed from: i2, reason: collision with root package name */
    public final i11.c f162134i2 = new i11.c() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.1
        @Override // i11.c
        public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
            com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
            if (!z17) {
                if (!shakeReportUI.f162128f2 && !com.tencent.mm.sdk.platformtools.n2.a()) {
                    com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI2 = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                    shakeReportUI2.f162128f2 = true;
                    db5.e1.C(shakeReportUI2, shakeReportUI2.getString(com.tencent.mm.R.string.fs_), shakeReportUI.getString(com.tencent.mm.R.string.f490573yv), shakeReportUI.getString(com.tencent.mm.R.string.g6z), shakeReportUI.getString(com.tencent.mm.R.string.f490347sg), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.1.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                            com.tencent.mm.sdk.platformtools.n2.c(com.tencent.mm.plugin.shake.ui.ShakeReportUI.this);
                        }
                    }, null);
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.ShakeReportUI", "getLocation fail");
                return false;
            }
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_TV_LATITUDE_STRING, f18 + "");
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_TV_LONGTITUDE_STRING, f17 + "");
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_TV_ACCURACY_STRING, d18 + "");
            shakeReportUI.f162130g2 = true;
            i11.e eVar = shakeReportUI.f162132h2;
            if (eVar == null) {
                return false;
            }
            ((i11.h) eVar).m(shakeReportUI.f162134i2);
            return false;
        }
    };

    /* loaded from: classes11.dex */
    public static class SensorListener extends q35.c {

        /* renamed from: g, reason: collision with root package name */
        public long f162208g;

        /* renamed from: h, reason: collision with root package name */
        public final java.lang.ref.WeakReference f162209h;

        /* renamed from: i, reason: collision with root package name */
        public android.os.Vibrator f162210i;

        /* renamed from: m, reason: collision with root package name */
        public final long[] f162211m;

        public SensorListener(com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f162208g = android.os.SystemClock.elapsedRealtime();
            this.f162211m = new long[]{300, 200, 300, 200};
            this.f162209h = new java.lang.ref.WeakReference(shakeReportUI);
        }

        @Override // q35.c
        public void a() {
        }

        @Override // q35.c
        public void b(boolean z17) {
            android.view.animation.Animation animation;
            android.view.animation.Animation animation2;
            java.lang.ref.WeakReference weakReference = this.f162209h;
            final com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = (com.tencent.mm.plugin.shake.ui.ShakeReportUI) weakReference.get();
            if (shakeReportUI == null) {
                return;
            }
            if (shakeReportUI.isFinishing()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ShakeReportUI", "ui finished");
                return;
            }
            if (!shakeReportUI.f162133i) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "tryShake the status is can's shake");
                return;
            }
            com.tencent.mm.plugin.shake.shakecard.ui.e eVar = shakeReportUI.Z1;
            if (eVar != null && eVar.isShowing()) {
                shakeReportUI.Z1.dismiss();
            }
            shakeReportUI.Z1 = null;
            int i17 = shakeReportUI.M1;
            if (i17 == 1 ? shakeReportUI.U6() : (i17 == 2 || i17 == 3) ? shakeReportUI.V6() : true) {
                long j17 = this.f162208g;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                if (elapsedRealtime < 1200) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "tryStartShake delay too short:" + elapsedRealtime);
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.ShakeReportUI", "tryStartShake delaytoo enough:" + elapsedRealtime);
                this.f162208g = android.os.SystemClock.elapsedRealtime();
                com.tencent.mm.plugin.shake.ui.i iVar = shakeReportUI.f162143o;
                if (iVar != null) {
                    android.view.View view = iVar.f162279a;
                    if (view != null) {
                        view.setKeepScreenOn(true);
                    }
                    iVar.f162280b.c(30000L, 30000L);
                }
                if (!shakeReportUI.f162131h) {
                    if (shakeReportUI.f162127f) {
                        com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI2 = (com.tencent.mm.plugin.shake.ui.ShakeReportUI) weakReference.get();
                        if (shakeReportUI2 != null) {
                            com.tencent.mm.sdk.platformtools.v5.b(shakeReportUI2, com.tencent.mm.R.string.j3j);
                        }
                    } else {
                        com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI3 = (com.tencent.mm.plugin.shake.ui.ShakeReportUI) weakReference.get();
                        if (shakeReportUI3 != null) {
                            if (this.f162210i == null) {
                                this.f162210i = (android.os.Vibrator) shakeReportUI3.getSystemService("vibrator");
                            }
                            android.os.Vibrator vibrator = this.f162210i;
                            if (vibrator != null) {
                                vibrator.vibrate(this.f162211m, -1);
                            }
                        }
                    }
                }
                q35.c.f359971f = 5;
                if (wo.w0.m().equals("LG-E510")) {
                    q35.c.f359971f = 4;
                }
                if (shakeReportUI.f162131h) {
                    return;
                }
                shakeReportUI.f162146p0.setText(shakeReportUI.f162158x0);
                shakeReportUI.Z.setText(shakeReportUI.f162158x0);
                int i18 = shakeReportUI.M1;
                if (i18 == 2) {
                    shakeReportUI.f162157x = shakeReportUI.f162155v;
                } else {
                    shakeReportUI.f162157x = shakeReportUI.f162160y;
                }
                android.view.animation.Animation.AnimationListener animationListener = new android.view.animation.Animation.AnimationListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.14
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(android.view.animation.Animation animation3) {
                        c34.z zVar;
                        com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI4 = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                        java.util.List list = com.tencent.mm.plugin.shake.ui.ShakeReportUI.f162118r2;
                        shakeReportUI4.n7(true);
                        com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162144o2 = java.lang.System.currentTimeMillis();
                        com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI5 = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                        if (shakeReportUI5.f162123d) {
                            return;
                        }
                        shakeReportUI5.f162129g = true;
                        shakeReportUI5.i7();
                        c34.a0 a0Var = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162145p;
                        int i19 = a0Var.f38180a;
                        if (i19 == 2) {
                            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().k0();
                            boolean nj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).nj();
                            com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI6 = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                            shakeReportUI6.f162142n2 = null;
                            if (nj6) {
                                shakeReportUI6.f162135j2 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).uj();
                                com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162136k2 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).vj();
                                com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162138l2 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Ni();
                                ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).pj();
                                com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162140m2 = true;
                            } else {
                                shakeReportUI6.f162135j2 = null;
                                shakeReportUI6.f162140m2 = false;
                                ((qk.g9) i95.n0.c(qk.g9.class)).getClass();
                                b66.h hVar = b66.i.f18167d;
                                b66.g gVar = (b66.g) urgen.ur_2BA9.UR_882D.UR_16B0();
                                if (gVar != null) {
                                    urgen.ur_2BA9.UR_C8FE.UR_39F9(((b66.q) ((b66.i) gVar).a()).getCppPointer(), null);
                                    com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162142n2 = gVar;
                                }
                            }
                        } else if (i19 == 4 && (zVar = a0Var.f38181b) != null && (zVar instanceof h34.r)) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.addAll(com.tencent.mm.plugin.shake.ui.ShakeReportUI.f162118r2);
                            ((h34.r) zVar).f278557f = arrayList;
                        }
                        c34.a0 a0Var2 = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162145p;
                        a0Var2.getClass();
                        a0Var2.f38182c = java.lang.System.currentTimeMillis();
                        com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct shakeActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct();
                        ku5.u0 u0Var = ku5.t0.f312615d;
                        y24.a aVar = new y24.a(shakeActionReportStruct, 2);
                        ku5.t0 t0Var = (ku5.t0) u0Var;
                        t0Var.getClass();
                        t0Var.w(aVar, 100L, null);
                        com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162145p.f38181b.e();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(android.view.animation.Animation animation3) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(android.view.animation.Animation animation3) {
                        com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI4 = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                        shakeReportUI4.f162123d = false;
                        shakeReportUI4.n7(false);
                        shakeReportUI4.f162131h = true;
                        shakeReportUI4.s7(true);
                        int i19 = shakeReportUI4.M1;
                        if (i19 != 2) {
                            shakeReportUI4.f162125e = true;
                        }
                        if (i19 != 2) {
                            if (shakeReportUI4.Y) {
                                return;
                            }
                            android.view.View view2 = shakeReportUI4.M;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(0);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            shakeReportUI4.V.x();
                            return;
                        }
                        if (shakeReportUI4.Y) {
                            shakeReportUI4.X.setVisibility(8);
                            shakeReportUI4.f162146p0.setVisibility(8);
                        }
                        android.view.View view3 = shakeReportUI4.K;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        shakeReportUI4.W.x();
                        if (shakeReportUI4.Q == null) {
                            shakeReportUI4.Q = new android.animation.AnimatorSet();
                            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(shakeReportUI4.N, "scaleX", 1.0f, 0.7f);
                            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(shakeReportUI4.N, "scaleY", 1.0f, 0.7f);
                            ofFloat.setRepeatCount(-1);
                            ofFloat2.setRepeatCount(-1);
                            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(shakeReportUI4.N, "alpha", 0.0f, 1.0f, 0.0f);
                            ofFloat3.setRepeatCount(-1);
                            shakeReportUI4.Q.setInterpolator(new android.view.animation.LinearInterpolator());
                            shakeReportUI4.Q.play(ofFloat3).with(ofFloat).with(ofFloat2);
                            shakeReportUI4.Q.setDuration(3000L);
                        }
                        shakeReportUI4.Q.start();
                    }
                };
                shakeReportUI.I = true;
                shakeReportUI.f162119J = i18;
                if (i18 == 2 && b21.q.c()) {
                    if (shakeReportUI.E == null) {
                        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(shakeReportUI.getContext(), com.tencent.mm.R.anim.f477912f0);
                        shakeReportUI.E = loadAnimation;
                        loadAnimation.setAnimationListener(animationListener);
                    }
                    if (shakeReportUI.G == null) {
                        shakeReportUI.G = android.view.animation.AnimationUtils.loadAnimation(shakeReportUI.getContext(), com.tencent.mm.R.anim.f477906eu);
                    }
                    animation2 = shakeReportUI.E;
                    animation = shakeReportUI.G;
                } else {
                    if (shakeReportUI.f162163z == null) {
                        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(shakeReportUI.getContext(), com.tencent.mm.R.anim.f477911ez);
                        shakeReportUI.f162163z = loadAnimation2;
                        loadAnimation2.setAnimationListener(animationListener);
                    }
                    if (shakeReportUI.A == null) {
                        shakeReportUI.A = android.view.animation.AnimationUtils.loadAnimation(shakeReportUI.getContext(), com.tencent.mm.R.anim.f477905et);
                    }
                    animation = shakeReportUI.A;
                    animation2 = shakeReportUI.f162163z;
                }
                android.view.animation.Animation animation3 = shakeReportUI.B;
                if (animation3 != null && shakeReportUI.f162153t != null) {
                    animation3.cancel();
                }
                shakeReportUI.o7(3);
                shakeReportUI.f162152s.setVisibility(4);
                shakeReportUI.f162157x.startAnimation(animation2);
                shakeReportUI.f162156w.startAnimation(animation);
                android.view.View view2 = shakeReportUI.f162149q;
                if (view2 != null && view2.getVisibility() == 0) {
                    android.view.animation.Animation loadAnimation3 = android.view.animation.AnimationUtils.loadAnimation(shakeReportUI.getContext(), com.tencent.mm.R.anim.f477873dx);
                    loadAnimation3.setFillAfter(true);
                    shakeReportUI.f162149q.startAnimation(loadAnimation3);
                    new com.tencent.mm.sdk.platformtools.n3().postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.15
                        @Override // java.lang.Runnable
                        public void run() {
                            android.view.View view3 = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162149q;
                            if (view3 != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList.add(8);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(view3, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                    }, loadAnimation3.getDuration());
                }
                new com.tencent.mm.sdk.platformtools.n3().postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.16
                    @Override // java.lang.Runnable
                    public void run() {
                        android.widget.TextView textView = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162152s;
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                    }
                }, 1200L);
            }
        }
    }

    public ShakeReportUI() {
        new java.util.concurrent.ConcurrentHashMap();
        this.f162140m2 = false;
        this.f162142n2 = null;
        this.f162148p2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.24
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                if (musicPlayerEvent.f54512g.f7036b == 0 && com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162140m2) {
                    b21.m.h(0);
                }
                return false;
            }
        };
        this.f162150q2 = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.25
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeReportUI$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162149q.getTag())) {
                    yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                c34.r rVar = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.G1;
                if (rVar == null) {
                    yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                java.lang.String str = rVar.field_username;
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
                if (n17.r2()) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("Contact_User", str);
                    intent.putExtra("Sns_from_Scene", 22);
                    if (str != null && str.length() > 0) {
                        if (n17.k2()) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, str + "," + com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162139m);
                            intent.putExtra("Contact_Scene", com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162139m);
                        }
                        intent.putExtra("CONTACT_INFO_UI_SOURCE", 31);
                        intent.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 3102);
                        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, com.tencent.mm.plugin.shake.ui.ShakeReportUI.this);
                    }
                } else {
                    if ((rVar.field_reserved1 & 8) > 0) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, rVar.field_username + "," + com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162139m);
                    }
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("Contact_User", rVar.field_username);
                    intent2.putExtra("Contact_Nick", rVar.field_nickname);
                    intent2.putExtra("Contact_Distance", rVar.field_distance);
                    intent2.putExtra("Contact_Signature", rVar.field_signature);
                    intent2.putExtra("Contact_Province", rVar.u0());
                    intent2.putExtra("Contact_City", rVar.t0());
                    intent2.putExtra("Contact_Sex", rVar.field_sex);
                    intent2.putExtra("Contact_IsLBSFriend", true);
                    intent2.putExtra("Contact_VUser_Info", rVar.field_reserved3);
                    intent2.putExtra("Contact_VUser_Info_Flag", rVar.field_reserved1);
                    intent2.putExtra("Contact_KSnsIFlag", rVar.field_snsFlag);
                    intent2.putExtra("Contact_KSnsBgUrl", rVar.field_sns_bgurl);
                    intent2.putExtra("Contact_Scene", com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162139m);
                    intent2.putExtra("Sns_from_Scene", 22);
                    intent2.putExtra("CONTACT_INFO_UI_SOURCE", 31);
                    intent2.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 3102);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent2, com.tencent.mm.plugin.shake.ui.ShakeReportUI.this);
                }
                com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct shakeActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct();
                shakeActionReportStruct.f60326f = shakeActionReportStruct.b("ToUsername", rVar.field_username, true);
                shakeActionReportStruct.f60329i = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.G1.field_sex;
                shakeActionReportStruct.f60331k = com.tencent.mm.sdk.platformtools.t8.K0(rVar.field_signature) ? 1L : 2L;
                shakeActionReportStruct.f60330j = shakeActionReportStruct.b("ToUinDistanceStr", rVar.field_distance, true);
                shakeActionReportStruct.f60328h = 1L;
                ku5.u0 u0Var = ku5.t0.f312615d;
                y24.a aVar = new y24.a(shakeActionReportStruct, 4);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.w(aVar, 100L, null);
                yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        com.tencent.mm.ui.MMImageView mMImageView;
        if (str == null || bitmap == null || bitmap.isRecycled() || (mMImageView = this.A1) == null || mMImageView.getTag() == null || !str.equals((java.lang.String) this.A1.getTag())) {
            return;
        }
        this.A1.setImageBitmap(bitmap);
    }

    public final void T6(int i17, boolean z17) {
        db5.m9.a(z17, new android.content.Intent().putExtra("classname", java.lang.String.format("%1$s-shaketype-%2$d", getClass().getName(), java.lang.Integer.valueOf(i17))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
    
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.R, new com.tencent.mm.plugin.shake.ui.ShakeReportUI.AnonymousClass23(r7)) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean U6() {
        /*
            r7 = this;
            boolean r0 = r7.f162126e2
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            r7.f162126e2 = r0
            boolean r2 = r7.f162122c2
            if (r2 == 0) goto Lf
            r7.f162124d2 = r1
        Lf:
            boolean r2 = r7.f162124d2
            if (r2 == 0) goto Ld0
            gm0.b0 r2 = gm0.j1.u()
            com.tencent.mm.storage.n3 r2 = r2.c()
            r3 = 0
            r4 = 274436(0x43004, float:3.84567E-40)
            java.lang.Object r2 = r2.l(r4, r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = u11.c.f(r2)
            r3 = 64
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.Class<tb0.j> r5 = tb0.j.class
            if (r2 == 0) goto L81
            i95.m r2 = i95.n0.c(r5)
            tb0.j r2 = (tb0.j) r2
            sb0.f r2 = (sb0.f) r2
            r2.getClass()
            boolean r2 = j35.u.d(r7, r4, r0)
            if (r2 != 0) goto L7e
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r2 = com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            java.lang.Object r1 = r1.m(r2, r6)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L6f
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.m2.d()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 2131770645(0x7f103d15, float:1.9172599E38)
            java.lang.String r1 = r7.getString(r2, r1)
            r2 = 30764(0x782c, float:4.311E-41)
            c71.b.c(r7, r1, r2, r0)
            goto Ld2
        L6f:
            i95.m r1 = i95.n0.c(r5)
            tb0.j r1 = (tb0.j) r1
            sb0.f r1 = (sb0.f) r1
            r1.getClass()
            j35.u.i(r7, r4, r3)
            goto Ld2
        L7e:
            r7.f162126e2 = r1
            goto Ld2
        L81:
            i95.m r2 = i95.n0.c(r5)
            tb0.j r2 = (tb0.j) r2
            r5 = 2131776250(0x7f1052fa, float:1.9183967E38)
            java.lang.String r5 = r7.getString(r5)
            sb0.f r2 = (sb0.f) r2
            r2.getClass()
            java.lang.String r2 = ""
            boolean r2 = j35.u.a(r7, r4, r3, r2, r5)
            if (r2 == 0) goto Lb5
            java.lang.Class<d85.m0> r2 = d85.m0.class
            i95.m r2 = i95.n0.c(r2)
            d85.m0 r2 = (d85.m0) r2
            d85.g0 r3 = d85.g0.LOCAION
            d85.f0 r4 = d85.f0.R
            com.tencent.mm.plugin.shake.ui.ShakeReportUI$23 r5 = new com.tencent.mm.plugin.shake.ui.ShakeReportUI$23
            r5.<init>()
            d85.d1 r2 = (d85.d1) r2
            boolean r2 = r2.Di(r3, r4, r5)
            if (r2 != 0) goto Lb5
            goto Lb6
        Lb5:
            r0 = r1
        Lb6:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            com.tencent.mm.sdk.platformtools.z3 r3 = new com.tencent.mm.sdk.platformtools.z3
            r3.<init>()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r7}
            java.lang.String r3 = "MicroMsg.ShakeReportUI"
            java.lang.String r4 = "summerper checkPermission checkposition[%b], stack[%s], activity[%s]"
            com.tencent.mars.xlog.Log.i(r3, r4, r2)
            if (r0 == 0) goto Lcf
            r7.f162126e2 = r1
        Lcf:
            return r0
        Ld0:
            r7.f162126e2 = r1
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.shake.ui.ShakeReportUI.U6():boolean");
    }

    public final boolean V6() {
        if (this.f162126e2) {
            return false;
        }
        this.f162126e2 = true;
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        java.lang.String string = getString(com.tencent.mm.R.string.j3p);
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(this, "android.permission.RECORD_AUDIO", 80, "", string);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), this);
        if (a17) {
            this.f162126e2 = false;
        }
        return a17;
    }

    public final void W6(android.view.View view) {
        int i17;
        i11.e eVar;
        if (view == null) {
            return;
        }
        g7("", false);
        if (this.I) {
            b7();
        }
        if (view.getId() == com.tencent.mm.R.id.mrq) {
            U6();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11722, 1);
            int i18 = this.M1;
            if (i18 != 1) {
                if (i18 == 3) {
                    T6(3, false);
                }
                this.M1 = 1;
                i7();
                p7(false);
                android.view.View view2 = this.f162149q;
                if (view2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "doTabClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "doTabClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else if (view.getId() == com.tencent.mm.R.id.mrt) {
            V6();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11722, 2);
            if (!this.f162130g2 && (eVar = this.f162132h2) != null) {
                ((i11.h) eVar).l(this.f162134i2, true, false, false);
                com.tencent.mm.plugin.report.service.b1.f(22, 10);
            }
            if (!iq.b.C(this) && !iq.b.v(this) && !iq.b.e(this) && (i17 = this.M1) != 2) {
                if (i17 == 3) {
                    T6(3, false);
                }
                this.M1 = 2;
                i7();
                p7(false);
                android.view.View view3 = this.f162149q;
                if (view3 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "doTabClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "doTabClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (b21.q.b() && c01.d9.b().p().q(4118, 0) == 0) {
                com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(getContext());
                i0Var.g(com.tencent.mm.R.string.f490573yv);
                i0Var.d(com.tencent.mm.R.string.j2l);
                i0Var.f(com.tencent.mm.R.string.j2k);
                android.content.DialogInterface.OnClickListener onClickListener = new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.6
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(android.content.DialogInterface dialogInterface, int i19) {
                        android.app.Dialog dialog = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.F1;
                        if (dialog != null) {
                            dialog.cancel();
                        }
                    }
                };
                com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
                aVar.E = onClickListener;
                aVar.A = true;
                aVar.G = new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.7
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(android.content.DialogInterface dialogInterface) {
                        c01.d9.b().p().z(4118, 1);
                        com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.L1.setVisibility(8);
                    }
                };
                com.tencent.mm.ui.widget.dialog.j0 a17 = i0Var.a();
                this.F1 = a17;
                a17.show();
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            y24.a aVar2 = new y24.a(null, 251);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.w(aVar2, 100L, null);
        }
        n7(true);
        j7(false);
        s7(true);
    }

    public final void X6() {
        int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) c01.d9.b().p().l(12290, null), 0);
        android.graphics.Bitmap bitmap = this.E1;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.E1.recycle();
        }
        if (com.tencent.mm.sdk.platformtools.t8.t1((java.lang.Boolean) c01.d9.b().p().l(4110, null))) {
            this.Y = false;
            this.X.setVisibility(8);
            this.f162146p0.setVisibility(8);
        } else {
            this.Y = true;
            this.X.setVisibility(0);
            this.E1 = ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).Ai((java.lang.String) c01.d9.b().p().l(4111, null));
            this.X.setImageDrawable(new android.graphics.drawable.BitmapDrawable(this.E1));
            this.f162146p0.setVisibility(0);
        }
        this.W.u(com.tencent.mm.vfs.w6.N("assets:///flower_song.wxam", 0, -1), "");
        this.V.u(com.tencent.mm.vfs.w6.N("assets:///flower_people_and_tv.wxam", 0, -1), "");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.mqx);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.mqw);
        weImageView.setImageResource(j17 == 2 ? com.tencent.mm.R.drawable.cfb : com.tencent.mm.R.drawable.cf6);
        weImageView2.setImageResource(j17 == 2 ? com.tencent.mm.R.drawable.cfa : com.tencent.mm.R.drawable.f482088cf5);
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.11
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeReportUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                if (!shakeReportUI.f162125e) {
                    yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                shakeReportUI.f162133i = false;
                shakeReportUI.f162123d = true;
                shakeReportUI.j7(false);
                db5.e1.g(com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.getContext(), null, new java.lang.String[]{com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.getString(com.tencent.mm.R.string.j2p)}, "", "", true, new db5.c1() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.11.1
                    @Override // db5.c1
                    public void e(int i17) {
                        com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162133i = true;
                        if (i17 != 0) {
                            return;
                        }
                        ku5.u0 u0Var = ku5.t0.f312615d;
                        y24.a aVar = new y24.a(null, 13);
                        ku5.t0 t0Var = (ku5.t0) u0Var;
                        t0Var.getClass();
                        t0Var.w(aVar, 100L, null);
                        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                        com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI2 = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                        ((ub0.r) oVar).getClass();
                        com.tencent.mm.pluginsdk.ui.tools.l7.h(shakeReportUI2, 1, null);
                    }
                }, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.11.2
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(android.content.DialogInterface dialogInterface) {
                        com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162133i = true;
                    }
                });
                ku5.u0 u0Var = ku5.t0.f312615d;
                y24.a aVar = new y24.a(null, 12);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.w(aVar, 100L, null);
                yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        weImageView.setOnClickListener(onClickListener);
        weImageView2.setOnClickListener(onClickListener);
    }

    public final void Y6() {
        boolean z17;
        android.widget.TextView textView;
        X6();
        c01.d9.b().a(this);
        c01.d9.b().p().a(this);
        c34.h0.Ni().add(this);
        c34.a0 a0Var = this.f162145p;
        c34.z zVar = a0Var.f38181b;
        if (zVar != null) {
            zVar.d();
        }
        this.f162133i = true;
        com.tencent.mm.plugin.shake.shakecard.ui.e eVar = this.Z1;
        if (eVar != null && eVar.isShowing() && !this.Z1.f162090z) {
            this.f162133i = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "tryStartShake");
        q35.d dVar = this.f162141n;
        if (dVar != null) {
            if (!(dVar.f359975b != null)) {
                dVar.a(new com.tencent.mm.plugin.shake.ui.ShakeReportUI.SensorListener(this));
                android.hardware.SensorManager sensorManager = this.f162141n.f359974a;
                if (sensorManager == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShakeSensorService", "cannot init sensor manager");
                } else {
                    java.util.List<android.hardware.Sensor> sensorList = sensorManager.getSensorList(1);
                    if (sensorList != null && sensorList.size() > 0) {
                        z17 = true;
                        if (z17 || (textView = this.f162152s) == null) {
                            this.f162152s.setText(getString(com.tencent.mm.R.string.f493120j35));
                        } else {
                            textView.setText(getString(com.tencent.mm.R.string.j1o));
                        }
                    }
                }
                z17 = false;
                if (z17) {
                }
                this.f162152s.setText(getString(com.tencent.mm.R.string.f493120j35));
            }
        }
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.3
            @Override // java.lang.Runnable
            public void run() {
                q35.d dVar2 = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162141n;
                if (dVar2 == null || dVar2.f359975b == null) {
                    return;
                }
                q35.c.f359971f = 5;
                if (wo.w0.m().equals("LG-E510")) {
                    q35.c.f359971f = 4;
                }
            }
        }, 1000L);
        q35.d dVar2 = this.f162141n;
        if (dVar2 != null && dVar2.f359975b != null) {
            q35.c.f359971f = 5;
            if (wo.w0.m().equals("LG-E510")) {
                q35.c.f359971f = 4;
            }
        }
        h7(false);
        j7(false);
        u7();
        java.lang.String str = (java.lang.String) c01.d9.b().p().l(327696, "1");
        if (str.equals("2")) {
            W6(findViewById(com.tencent.mm.R.id.mrt));
        } else if (str.equals("1")) {
            W6(findViewById(com.tencent.mm.R.id.mrq));
        }
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().b(262154, 266258);
        if (this.f162122c2) {
            this.M1 = 2;
            i7();
        } else if (getIntent().getBooleanExtra("shake_music", false) && b21.q.c() && a0Var.f38180a != 2) {
            getIntent().putExtra("shake_music", false);
            this.M1 = 2;
            i7();
        } else {
            i7();
        }
        n7(true);
        if (x51.o1.f452057j) {
            c01.d9.e().g(new f21.g0(7));
        }
        s7(true);
        t7();
    }

    public void Z6(int i17, final f34.d dVar, long j17) {
        c34.z zVar;
        this.f162120a2 = true;
        if (i17 == 1251) {
            if (dVar == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "onShakeCardReturn MMFunc_Biz_GetLbsCard");
            g34.a.a();
            t7();
            r7();
            this.Y1 = 4;
            f34.c Bi = c34.h0.Bi();
            Bi.getClass();
            if (android.text.TextUtils.isEmpty("key_shake_card_item")) {
                return;
            }
            ((java.util.HashMap) Bi.f259322a).put("key_shake_card_item", dVar);
            return;
        }
        if (i17 == 1250) {
            if (dVar == null) {
                this.G1 = null;
                k7(null);
                return;
            }
            boolean z17 = this.f162129g;
            if (z17 && !z17) {
                this.G1 = null;
                k7(null);
                return;
            }
            this.f162129g = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "onShakeCardReturn MMFunc_Biz_ShakeCard");
            c34.a0 a0Var = this.f162145p;
            if (a0Var.f38180a == 5 && (zVar = a0Var.f38181b) != null && (zVar instanceof f34.m)) {
                f34.m mVar = (f34.m) zVar;
                int i18 = (int) j17;
                if (i18 != 1) {
                    if (i18 != 2) {
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "onShakeGetReturn() ShakeCardService RETURN_ERR_REPORT");
                    k7(getString(com.tencent.mm.R.string.j1x));
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "onShakeGetReturn() ShakeCardService RETURN_OK");
                if (mVar.f259361f == 3) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "onShakeGetReturn() actionType is  MMBIZ_SHAKE_CARD_ACTION_TYPE_NO_CARD");
                    if (android.text.TextUtils.isEmpty(dVar.f259340m)) {
                        k7(getString(com.tencent.mm.R.string.j1x));
                        return;
                    } else {
                        k7(dVar.f259340m);
                        return;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "onShakeGetReturn() actionType is " + mVar.f259361f);
                o7(3);
                if (dVar.f259328a == 1) {
                    this.f162133i = false;
                }
                com.tencent.mm.plugin.shake.shakecard.ui.e eVar = this.Z1;
                if (eVar == null || !eVar.isShowing()) {
                    if (!dVar.f259343p) {
                        m7(dVar);
                        return;
                    }
                    android.view.ViewStub viewStub = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.p2i);
                    if (viewStub != null) {
                        viewStub.inflate();
                    }
                    ((com.tencent.mm.plugin.shake.ui.ShakeEggAnimFrame) findViewById(com.tencent.mm.R.id.bhk)).a(this, 30);
                    new com.tencent.mm.sdk.platformtools.n3().postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.20
                        @Override // java.lang.Runnable
                        public void run() {
                            java.util.List list = com.tencent.mm.plugin.shake.ui.ShakeReportUI.f162118r2;
                            com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.m7(dVar);
                        }
                    }, 1000L);
                }
            }
        }
    }

    @Override // c01.y8
    public void a0() {
        c34.a0 a0Var = this.f162145p;
        a0Var.getClass();
        i7();
        if (this.f162129g) {
            a0Var.getClass();
        }
    }

    public void a7(java.util.List list, long j17) {
        com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct shakeActionReportStruct;
        java.util.LinkedList linkedList;
        java.lang.String str;
        java.lang.Long valueOf;
        int i17;
        b7();
        s7(true);
        if (list == null || !this.f162129g || j17 == 6) {
            this.G1 = null;
            if (j17 == 6) {
                k7(getString(com.tencent.mm.R.string.j2j));
                return;
            }
            if (j17 == 7) {
                k7(getString(com.tencent.mm.R.string.j2h));
                return;
            }
            if (j17 == 8) {
                k7(getString(com.tencent.mm.R.string.j2f));
                return;
            }
            if (j17 == 9) {
                k7(getString(com.tencent.mm.R.string.j2e));
                return;
            } else if (j17 == 10) {
                k7(getString(com.tencent.mm.R.string.j2i));
                return;
            } else {
                k7(null);
                return;
            }
        }
        this.f162129g = false;
        if (list.size() > 0) {
            this.G1 = (c34.r) list.get(0);
        }
        int i18 = this.f162145p.f38180a;
        if (i18 != 1) {
            if (i18 != 2) {
                if (i18 == 3) {
                    s7(true);
                    int size = list.size();
                    if (size == 0) {
                        k7(getString(com.tencent.mm.R.string.j3q));
                        return;
                    }
                    if (size == 1) {
                        if (this.f162127f) {
                            com.tencent.mm.sdk.platformtools.v5.b(getContext(), com.tencent.mm.R.string.j2u);
                        }
                        o7(3);
                        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new h34.x((c34.r) list.get(0), this), 100L);
                        com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct shakeActionReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct();
                        shakeActionReportStruct2.f60328h = 1L;
                        shakeActionReportStruct2.f60334n = this.f162145p.a();
                        ku5.u0 u0Var = ku5.t0.f312615d;
                        y24.a aVar = new y24.a(shakeActionReportStruct2, 3);
                        ku5.t0 t0Var = (ku5.t0) u0Var;
                        t0Var.getClass();
                        t0Var.w(aVar, 100L, null);
                        return;
                    }
                    return;
                }
                return;
            }
            int size2 = list.size();
            if (size2 == 0) {
                k7(getString(com.tencent.mm.R.string.f493116j31));
                c7();
                return;
            }
            if (size2 == 1) {
                if (this.f162127f) {
                    com.tencent.mm.sdk.platformtools.v5.b(getContext(), com.tencent.mm.R.string.j2u);
                }
                o7(3);
                if (((c34.r) list.get(0)).field_type != 4) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ShakeReportUI", "Unexpected type, ignore.");
                    return;
                }
                r45.gh4 gh4Var = new r45.gh4();
                java.lang.String str2 = java.lang.System.currentTimeMillis() + "";
                com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct shakeActionReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct();
                shakeActionReportStruct3.f60334n = this.f162145p.a();
                shakeActionReportStruct3.f60336p = shakeActionReportStruct3.b("SharkSessionID", str2, true);
                try {
                    gh4Var.parseFrom(((c34.r) list.get(0)).field_lvbuffer);
                    java.util.LinkedList linkedList2 = gh4Var.f375251i;
                    java.lang.String str3 = ".ui.shake.MusicMainUINew";
                    if (linkedList2 != null) {
                        if (linkedList2.size() == 1) {
                            r45.eh4 eh4Var = (r45.eh4) gh4Var.f375251i.get(0);
                            b21.r a17 = h34.v.a(eh4Var);
                            android.content.Intent intent = new android.content.Intent();
                            java.lang.Long valueOf2 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f162144o2);
                            j34.e.a(a17, false);
                            if (eh4Var.f373491q != null) {
                                str = "key_hasPre";
                                intent.putExtra("key_copyright", true);
                                valueOf = java.lang.Long.valueOf(valueOf2.longValue() + 700);
                                intent.putExtra("key_copyright_report", 1);
                                shakeActionReportStruct3.f60341u = 1L;
                            } else {
                                str = "key_hasPre";
                                valueOf = java.lang.Long.valueOf(valueOf2.longValue() + 800);
                                intent.putExtra("key_copyright_report", 3);
                                shakeActionReportStruct3.f60341u = 3L;
                            }
                            java.lang.Float valueOf3 = java.lang.Float.valueOf(a17.f17347f + java.lang.Float.parseFloat(java.lang.String.valueOf(valueOf)));
                            valueOf3.intValue();
                            intent.putExtra("key_offset", valueOf3);
                            intent.putExtra("key_pure", eh4Var.f373499y);
                            intent.putExtra("key_byuser", eh4Var.f373481d);
                            intent.putExtra("key_duration", eh4Var.f373490p);
                            intent.putExtra("key_music_wrapper", a17);
                            intent.putExtra("report_sessionid", y24.b.f459122a);
                            intent.putExtra("shake_sessionid", str2);
                            if (this.f162135j2 != null) {
                                intent.putExtra(str, true);
                            }
                            j45.l.n(this, "mv", ".ui.shake.MusicMainUINew", intent, 4);
                            shakeActionReportStruct = shakeActionReportStruct3;
                            gh4Var = gh4Var;
                            linkedList = gh4Var.f375251i;
                            if (linkedList != null || linkedList.size() < 1) {
                                return;
                            }
                            r45.eh4 eh4Var2 = (r45.eh4) gh4Var.f375251i.get(0);
                            shakeActionReportStruct.f60340t = shakeActionReportStruct.b("ToSongDataurl", eh4Var2.f373491q, true);
                            shakeActionReportStruct.f60339s = shakeActionReportStruct.b("ToSongWeburl", eh4Var2.f373491q, true);
                            shakeActionReportStruct.f60337q = shakeActionReportStruct.b("ToSongName", eh4Var2.f373484g, true);
                            shakeActionReportStruct.f60338r = shakeActionReportStruct.b("ToSongSinger", eh4Var2.f373485h, true);
                            shakeActionReportStruct.f60327g = shakeActionReportStruct.b("ToSongOrTv", eh4Var2.f373482e + "", true);
                            ku5.u0 u0Var2 = ku5.t0.f312615d;
                            y24.a aVar2 = new y24.a(shakeActionReportStruct, 3);
                            ku5.t0 t0Var2 = (ku5.t0) u0Var2;
                            t0Var2.getClass();
                            t0Var2.w(aVar2, 100L, null);
                            return;
                        }
                        str3 = ".ui.shake.MusicMainUINew";
                    }
                    java.util.LinkedList linkedList3 = gh4Var.f375251i;
                    if (linkedList3 == null) {
                        shakeActionReportStruct = shakeActionReportStruct3;
                    } else if (linkedList3.size() > 1) {
                        r45.eh4 eh4Var3 = (r45.eh4) gh4Var.f375251i.get(0);
                        java.lang.String str4 = str3;
                        b21.r a18 = h34.v.a(eh4Var3);
                        j34.e.a(a18, false);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (int i19 = 1; i19 < gh4Var.f375251i.size(); i19++) {
                            arrayList.add(h34.v.a((r45.eh4) gh4Var.f375251i.get(i19)));
                        }
                        android.content.Intent intent2 = new android.content.Intent();
                        java.lang.Float valueOf4 = java.lang.Float.valueOf(a18.f17347f + java.lang.Float.parseFloat(java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f162144o2))) + 800.0f);
                        valueOf4.intValue();
                        intent2.putExtra("key_offset", valueOf4);
                        intent2.putExtra("key_pure", eh4Var3.f373499y);
                        intent2.putExtra("key_recommend_list", arrayList);
                        intent2.putExtra("key_byuser", eh4Var3.f373481d);
                        intent2.putExtra("key_duration", eh4Var3.f373490p);
                        intent2.putExtra("report_sessionid", y24.b.f459122a);
                        intent2.putExtra("shake_sessionid", str2);
                        intent2.putExtra("key_music_wrapper", a18);
                        intent2.putExtra("key_copyright_report", 2);
                        if (this.f162135j2 != null) {
                            intent2.putExtra("key_hasPre", true);
                        }
                        j45.l.n(this, "mv", str4, intent2, 4);
                        shakeActionReportStruct = shakeActionReportStruct3;
                        shakeActionReportStruct.f60341u = 2L;
                    } else {
                        shakeActionReportStruct = shakeActionReportStruct3;
                    }
                    linkedList = gh4Var.f375251i;
                    if (linkedList != null) {
                        return;
                    } else {
                        return;
                    }
                } catch (java.io.IOException unused) {
                    return;
                }
            }
            return;
        }
        if (list.size() > 0 && ((c34.r) list.get(0)).field_type != 0) {
            k7(null);
            return;
        }
        this.f162139m = ((c34.r) list.get(0)).f38238x0;
        int size3 = list.size();
        if (size3 == 0) {
            k7(null);
            return;
        }
        if (size3 != 1) {
            if (this.f162127f) {
                com.tencent.mm.sdk.platformtools.v5.b(getContext(), com.tencent.mm.R.string.j2u);
            }
            o7(3);
            p7(false);
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.shake.ui.ShakeItemListUI.class);
            intent3.putExtra("_key_show_type_", -1);
            intent3.putExtra("_key_title_", getString(com.tencent.mm.R.string.j2s));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent3);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "onShakeGetReturn", "(Ljava/util/List;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "onShakeGetReturn", "(Ljava/util/List;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        c34.r rVar = (c34.r) list.get(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "1 u:" + rVar.field_username + " n:" + rVar.field_nickname + " d:" + rVar.field_distance);
        if (this.f162127f) {
            com.tencent.mm.sdk.platformtools.v5.b(getContext(), com.tencent.mm.R.string.j2u);
        }
        o7(3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(rVar.field_username)) {
            return;
        }
        this.f162149q.setTag(rVar.field_username);
        android.view.View view = this.f162149q;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "displayResultByMatchCard", "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "displayResultByMatchCard", "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(rVar.field_username, true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(rVar.field_nickname);
        sb6.append(n17.r2() ? getString(com.tencent.mm.R.string.j2v) : "");
        java.lang.String sb7 = sb6.toString();
        int i27 = rVar.field_sex;
        if (i27 == 1) {
            this.f162149q.setContentDescription(sb7 + rVar.field_distance + getContext().getString(com.tencent.mm.R.string.j3i));
        } else if (i27 == 2) {
            this.f162149q.setContentDescription(sb7 + rVar.field_distance + getContext().getString(com.tencent.mm.R.string.j3h));
        } else {
            this.f162149q.setContentDescription(sb7 + rVar.field_distance);
        }
        android.widget.TextView textView = (android.widget.TextView) this.f162149q.findViewById(com.tencent.mm.R.id.f486882mr0);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(rVar.field_nickname);
        sb8.append(n17.r2() ? getString(com.tencent.mm.R.string.j2v) : "");
        java.lang.String sb9 = sb8.toString();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, sb9, textSize));
        if (this.N1 != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(sb7)) {
                this.N1.setContentDescription(getString(com.tencent.mm.R.string.j1v));
            } else {
                this.N1.setContentDescription(java.lang.String.format(getString(com.tencent.mm.R.string.j1u), sb7));
            }
        }
        ((android.widget.TextView) this.f162149q.findViewById(com.tencent.mm.R.id.mqy)).setText(rVar.field_distance);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) this.f162149q.findViewById(com.tencent.mm.R.id.mqz), rVar.field_username, null);
        android.widget.ImageView imageView = (android.widget.ImageView) this.f162149q.findViewById(com.tencent.mm.R.id.f486884mr2);
        if (rVar.field_reserved1 == 0 || c01.n8.b() == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageBitmap(com.tencent.mm.sdk.platformtools.j.a(((xf4.d) c01.n8.b()).b(rVar.field_reserved1, true), 2.0f));
        }
        if (rVar.field_reserved1 != 0 || (i17 = rVar.field_sex) == 0) {
            android.view.View findViewById = this.f162149q.findViewById(com.tencent.mm.R.id.f486883mr1);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "displayResultByMatchCard", "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "displayResultByMatchCard", "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.graphics.drawable.Drawable i28 = i65.a.i(this, i17 == 1 ? com.tencent.mm.R.raw.ic_sex_male : com.tencent.mm.R.raw.ic_sex_female);
            android.view.View findViewById2 = this.f162149q.findViewById(com.tencent.mm.R.id.f486883mr1);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "displayResultByMatchCard", "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "displayResultByMatchCard", "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.ImageView) this.f162149q.findViewById(com.tencent.mm.R.id.f486883mr1)).setImageDrawable(i28);
        }
        if (rVar.u0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShakeReportUI", "PROVINCE NULL");
            rVar.field_province = "";
        }
        if (rVar.t0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShakeReportUI", "CITY NULL");
            rVar.field_city = "";
        }
        this.f162149q.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477872dw));
        com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct shakeActionReportStruct4 = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct();
        shakeActionReportStruct4.f60334n = this.f162145p.a();
        shakeActionReportStruct4.f60326f = shakeActionReportStruct4.b("ToUsername", rVar.field_username, true);
        c34.r rVar2 = this.G1;
        shakeActionReportStruct4.f60329i = rVar2.field_sex;
        shakeActionReportStruct4.f60331k = com.tencent.mm.sdk.platformtools.t8.K0(rVar2.field_signature) ? 1L : 2L;
        shakeActionReportStruct4.f60330j = shakeActionReportStruct4.b("ToUinDistanceStr", rVar.field_distance, true);
        shakeActionReportStruct4.f60328h = 1L;
        shakeActionReportStruct4.f60334n = this.f162145p.a();
        ku5.u0 u0Var3 = ku5.t0.f312615d;
        y24.a aVar3 = new y24.a(shakeActionReportStruct4, 3);
        ku5.t0 t0Var3 = (ku5.t0) u0Var3;
        t0Var3.getClass();
        t0Var3.w(aVar3, 100L, null);
    }

    public final void b7() {
        if (this.f162131h) {
            android.view.animation.Animation.AnimationListener animationListener = new android.view.animation.Animation.AnimationListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.18
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(android.view.animation.Animation animation) {
                    com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                    if (shakeReportUI.f162119J == 2) {
                        if (shakeReportUI.Y) {
                            shakeReportUI.X.setVisibility(0);
                            shakeReportUI.f162146p0.setVisibility(0);
                        }
                        android.view.View view = shakeReportUI.K;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "stopShakeAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "stopShakeAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        shakeReportUI.W.y();
                        shakeReportUI.Q.cancel();
                        android.animation.AnimatorSet animatorSet = shakeReportUI.R;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                    } else if (!shakeReportUI.Y) {
                        android.view.View view2 = shakeReportUI.M;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "stopShakeAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "stopShakeAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        shakeReportUI.V.y();
                    }
                    shakeReportUI.f162125e = false;
                    shakeReportUI.f162131h = false;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(android.view.animation.Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(android.view.animation.Animation animation) {
                }
            };
            this.I = false;
            if (this.M1 == 2 && b21.q.c()) {
                if (this.H == null) {
                    android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477908ew);
                    this.H = loadAnimation;
                    loadAnimation.setAnimationListener(animationListener);
                }
                if (this.F == null) {
                    this.F = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477913f1);
                }
                this.f162157x.startAnimation(this.F);
                this.f162156w.startAnimation(this.H);
                return;
            }
            if (this.D == null) {
                android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477907ev);
                this.D = loadAnimation2;
                loadAnimation2.setAnimationListener(animationListener);
            }
            if (this.C == null) {
                this.C = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477916f4);
            }
            this.f162157x.startAnimation(this.C);
            this.f162156w.startAnimation(this.D);
        }
    }

    public final void c7() {
        if (this.f162135j2 == null) {
            b66.g gVar = this.f162142n2;
            if (gVar != null) {
                urgen.ur_2BA9.UR_C8FE.UR_2D39(((b66.q) ((b66.i) gVar).a()).getCppPointer(), null);
                return;
            }
            return;
        }
        ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Ai(true);
        il4.e eVar = new il4.e();
        eVar.f292106c = this.f162138l2;
        eVar.f292107d = true;
        bw5.cr0 cr0Var = this.f162136k2;
        if (cr0Var != null && cr0Var.f26211i[2]) {
            ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).rj(this.f162135j2, null, this.f162136k2.b(), null, eVar);
        } else {
            eVar.f292105b = 0;
            ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).qj(this.f162135j2.b(), this.f162135j2, eVar);
        }
    }

    public final void d7(boolean z17) {
        int d17 = z17 ? i65.a.d(this, com.tencent.mm.R.color.BW_100_Alpha_0_8) : i65.a.d(this, com.tencent.mm.R.color.BW_100_Alpha_0_3);
        this.H1.setIconColor(d17);
        this.I1.setTextColor(d17);
    }

    public final void e7(boolean z17) {
        if (z17) {
            i65.a.d(this, com.tencent.mm.R.color.BW_100_Alpha_0_8);
        } else {
            i65.a.d(this, com.tencent.mm.R.color.BW_100_Alpha_0_3);
        }
    }

    public final void f7(boolean z17) {
        int d17 = z17 ? i65.a.d(this, com.tencent.mm.R.color.f478553an) : i65.a.d(this, com.tencent.mm.R.color.BW_100_Alpha_0_3);
        this.K1.setTextColor(d17);
        this.J1.setIconColor(d17);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        onNotifyChange("", null);
    }

    public final void g7(java.lang.String str, boolean z17) {
        this.f162129g = false;
        if (this.B == null) {
            this.B = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477779b8);
        }
        o7(2);
        h7(true);
        if (str != null && str.length() > 1) {
            this.f162153t.setText(str);
        } else if (z17) {
            this.f162153t.setText(com.tencent.mm.R.string.j1y);
        } else {
            this.f162153t.setText("");
            h7(false);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cms;
    }

    public final void h7(boolean z17) {
        android.widget.TextView textView = this.f162153t;
        if (textView != null) {
            if (z17) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
                this.f162153t.cancelLongPress();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0183, code lost:
    
        if (r10.f38247d != null) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i7() {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.shake.ui.ShakeReportUI.i7():void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        g34.a.a();
        java.util.Map map = this.f162121b2;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        hashMap.put(1, bool);
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        hashMap.put(2, bool2);
        hashMap.put(3, bool2);
        hashMap.put(4, bool2);
        hashMap.put(5, bool2);
        new n11.a(this);
        this.X1 = findViewById(com.tencent.mm.R.id.mrk);
        this.f162152s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mro);
        this.f162151r = findViewById(com.tencent.mm.R.id.mrw);
        this.f162153t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mrf);
        this.f162154u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mrn);
        this.O1 = findViewById(com.tencent.mm.R.id.ms_);
        this.P1 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.mry);
        this.Q1 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486888ms0);
        this.R1 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486890ms2);
        this.S1 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486892ms4);
        this.T1 = findViewById(com.tencent.mm.R.id.mrz);
        this.U1 = findViewById(com.tencent.mm.R.id.f486889ms1);
        this.V1 = findViewById(com.tencent.mm.R.id.f486891ms3);
        this.W1 = findViewById(com.tencent.mm.R.id.f486893ms5);
        this.M = findViewById(com.tencent.mm.R.id.mre);
        this.V = (com.tencent.mm.plugin.gif.MMAnimateView) findViewById(com.tencent.mm.R.id.mrg);
        this.L = findViewById(com.tencent.mm.R.id.mr_);
        this.K = findViewById(com.tencent.mm.R.id.jzy);
        this.W = (com.tencent.mm.plugin.gif.MMAnimateView) findViewById(com.tencent.mm.R.id.mrm);
        this.N = findViewById(com.tencent.mm.R.id.mrb);
        this.P = findViewById(com.tencent.mm.R.id.mra);
        this.f162155v = findViewById(com.tencent.mm.R.id.msa);
        this.f162156w = findViewById(com.tencent.mm.R.id.mqn);
        this.f162160y = findViewById(com.tencent.mm.R.id.mrd);
        this.f162161y0 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.kdk);
        this.f162137l1 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.kdl);
        this.f162147p1 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.jzx);
        this.f162159x1 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.k0w);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mrl);
        this.f162149q = findViewById;
        findViewById.setOnClickListener(this.f162150q2);
        this.X = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.mrh);
        this.Z = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mrj);
        this.f162146p0 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mri);
        android.widget.ImageView imageView = (android.widget.ImageView) this.f162149q.findViewById(com.tencent.mm.R.id.mqz);
        this.N1 = imageView;
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.4
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeReportUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.M1 != 4) {
                    android.content.Intent intent = new android.content.Intent(com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.getContext(), (java.lang.Class<?>) com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg.class);
                    intent.putExtra(dm.i4.COL_USERNAME, (java.lang.String) com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162149q.getTag());
                    com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(shakeReportUI, arrayList2.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    shakeReportUI.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(shakeReportUI, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    y24.a aVar = new y24.a(null, 5);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.w(aVar, 100L, null);
                }
                yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        X6();
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.cmm, null);
        com.tencent.mm.ui.widget.dialog.k2 k2Var = new com.tencent.mm.ui.widget.dialog.k2(getContext(), com.tencent.mm.R.style.f494791wd);
        this.F1 = k2Var;
        k2Var.setContentView(inflate);
        this.F1.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.8
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(android.content.DialogInterface dialogInterface) {
                android.os.Looper.myQueue().addIdleHandler(new android.os.MessageQueue.IdleHandler() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.8.1
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                        db5.t7.p(shakeReportUI, 0, shakeReportUI.getString(com.tencent.mm.R.string.j3f), 2000L);
                        c01.d9.b().p().w(4117, java.lang.Boolean.TRUE);
                        return false;
                    }
                });
            }
        });
        ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.mqr)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.9
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeReportUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.F1.cancel();
                yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        boolean n17 = com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) c01.d9.b().p().l(4108, bool));
        boolean n18 = com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) c01.d9.b().p().l(4117, null));
        if (!n17 && !this.f162122c2) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showIntroInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showIntroInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.F1.show();
            c01.d9.b().p().w(4108, bool);
        } else if (!n18) {
            android.os.Looper.myQueue().addIdleHandler(new android.os.MessageQueue.IdleHandler() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.10
                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                    db5.t7.p(shakeReportUI, 0, shakeReportUI.getString(com.tencent.mm.R.string.j3f), 2000L);
                    c01.d9.b().p().w(4117, java.lang.Boolean.TRUE);
                    return false;
                }
            });
        }
        int k17 = i65.a.k(getContext());
        int B = i65.a.B(getContext());
        int h17 = com.tencent.mm.ui.bl.h(this);
        int i17 = B - 50;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.V.getLayoutParams();
        double d17 = k17;
        int i18 = (int) (0.35d * d17);
        layoutParams.setMargins(0, i18, 0, 0);
        this.V.setLayoutParams(layoutParams);
        int f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.by);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.Z.getLayoutParams();
        int i19 = i18 + f17;
        layoutParams2.setMargins(0, i19, 0, 0);
        this.Z.setLayoutParams(layoutParams2);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) this.L.getLayoutParams();
        layoutParams3.setMargins(0, (int) (d17 * 0.2d), 0, 0);
        layoutParams3.height = i17;
        this.L.setLayoutParams(layoutParams3);
        android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) this.f162146p0.getLayoutParams();
        layoutParams4.setMargins(0, i19, 0, 0);
        this.f162146p0.setLayoutParams(layoutParams4);
        android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) this.N.getLayoutParams();
        layoutParams5.width = i17;
        layoutParams5.height = i17;
        this.N.setLayoutParams(layoutParams5);
        this.f162155v.setPadding(0, h17, 0, 0);
        this.K.setPadding(0, h17, 0, 0);
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI$$d
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                java.util.List list = com.tencent.mm.plugin.shake.ui.ShakeReportUI.f162118r2;
                shakeReportUI.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeReportUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", shakeReportUI, array);
                if (shakeReportUI.f162129g) {
                    com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct shakeActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct();
                    shakeActionReportStruct.f60334n = shakeReportUI.f162145p.a();
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    y24.a aVar = new y24.a(shakeActionReportStruct, 15);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.w(aVar, 100L, null);
                }
                shakeReportUI.f162129g = false;
                shakeReportUI.finish();
                yj0.a.h(shakeReportUI, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        android.view.View.OnClickListener onClickListener2 = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI$$e
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                java.util.List list = com.tencent.mm.plugin.shake.ui.ShakeReportUI.f162118r2;
                shakeReportUI.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeReportUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", shakeReportUI, array);
                if (shakeReportUI.f162131h) {
                    shakeReportUI.b7();
                    c34.z zVar = shakeReportUI.f162145p.f38181b;
                    if (zVar != null) {
                        zVar.a();
                    }
                }
                shakeReportUI.f162129g = false;
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(shakeReportUI, com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI.class);
                shakeReportUI.startActivityForResult(intent, 3);
                ku5.u0 u0Var = ku5.t0.f312615d;
                y24.a aVar = new y24.a(null, 51);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.w(aVar, 100L, null);
                yj0.a.h(shakeReportUI, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        this.f162161y0.setOnClickListener(onClickListener);
        this.f162147p1.setOnClickListener(onClickListener);
        this.f162137l1.setOnClickListener(onClickListener2);
        this.f162159x1.setOnClickListener(onClickListener2);
        android.view.View.OnClickListener onClickListener3 = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.5
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeReportUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                java.util.List list = com.tencent.mm.plugin.shake.ui.ShakeReportUI.f162118r2;
                com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.W6(view);
                yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        this.H1 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.mrp);
        this.I1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mrr);
        this.J1 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.mrs);
        this.K1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mrv);
        this.L1 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.mru);
        findViewById(com.tencent.mm.R.id.mrq).setOnClickListener(onClickListener3);
        findViewById(com.tencent.mm.R.id.mrt).setOnClickListener(onClickListener3);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.r0q);
        int i27 = this.f162122c2 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void j7(boolean z17) {
        android.view.View view = this.f162151r;
        if (view != null) {
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "setShakeWaitingTVVisiblility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "setShakeWaitingTVVisiblility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "setShakeWaitingTVVisiblility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "setShakeWaitingTVVisiblility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void k7(java.lang.String str) {
        this.f162129g = false;
        if (this.f162127f) {
            com.tencent.mm.sdk.platformtools.v5.b(getContext(), com.tencent.mm.R.string.f493119j34);
        }
        if (this.B == null) {
            this.B = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477779b8);
        }
        o7(2);
        if (str == null || str.length() <= 1) {
            this.f162153t.setText(com.tencent.mm.R.string.j2b);
        } else {
            this.f162153t.setText(str);
        }
        this.f162153t.startAnimation(this.B);
        com.tencent.mm.sdk.platformtools.u3.i(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.19
            @Override // java.lang.Runnable
            public void run() {
                java.util.List list = com.tencent.mm.plugin.shake.ui.ShakeReportUI.f162118r2;
                com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                shakeReportUI.h7(false);
                shakeReportUI.j7(false);
            }
        }, this.B.getDuration());
        com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct shakeActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct();
        shakeActionReportStruct.f60334n = this.f162145p.a();
        ku5.u0 u0Var = ku5.t0.f312615d;
        y24.a aVar = new y24.a(shakeActionReportStruct, 14);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(aVar, 100L, null);
    }

    public final void l7(boolean z17) {
        android.view.View view = this.X1;
        if (view != null) {
            if (this.f162122c2) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showBottomTabLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showBottomTabLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showBottomTabLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showBottomTabLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void m7(f34.d dVar) {
        com.tencent.mm.plugin.shake.shakecard.ui.e eVar;
        android.content.DialogInterface.OnCancelListener onCancelListener = new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.21
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(android.content.DialogInterface dialogInterface) {
                dialogInterface.dismiss();
                com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                shakeReportUI.f162133i = true;
                shakeReportUI.Z1 = null;
                shakeReportUI.f162154u.setText("");
            }
        };
        com.tencent.mm.plugin.shake.shakecard.ui.d dVar2 = new com.tencent.mm.plugin.shake.shakecard.ui.d() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.22
            @Override // com.tencent.mm.plugin.shake.shakecard.ui.d
            public void a() {
                com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                shakeReportUI.f162133i = true;
                shakeReportUI.f162154u.setText("");
            }
        };
        java.lang.String str = com.tencent.mm.plugin.shake.shakecard.ui.e.f162070J;
        if (isFinishing()) {
            eVar = null;
        } else {
            com.tencent.mm.plugin.shake.shakecard.ui.e eVar2 = new com.tencent.mm.plugin.shake.shakecard.ui.e(this, com.tencent.mm.R.style.f494792we);
            eVar2.setOnCancelListener(onCancelListener);
            eVar2.setCancelable(true);
            eVar2.C = dVar;
            if (dVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ShakeCardDialog", "updateView() mCardItem == null");
            } else {
                if (android.text.TextUtils.isEmpty(dVar.f259331d)) {
                    eVar2.f162074g.setText(eVar2.C.f259331d);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardDialog", "updateView() action_type is has card");
                eVar2.G = com.tencent.mm.plugin.shake.shakecard.ui.c.PRE_ACCEPT;
                eVar2.h();
                eVar2.f();
                if (eVar2.B == 0) {
                    eVar2.f162072e.setBackgroundResource(com.tencent.mm.R.drawable.azs);
                    eVar2.f162081q.setBackgroundResource(com.tencent.mm.R.drawable.azt);
                    eVar2.f162074g.setTextColor(eVar2.F.getColor(com.tencent.mm.R.color.a0c));
                    eVar2.f162075h.setTextColor(eVar2.F.getColor(com.tencent.mm.R.color.f479460zx));
                    eVar2.f162076i.setTextColor(eVar2.F.getColor(com.tencent.mm.R.color.f479460zx));
                    eVar2.f162089y.setTextColor(eVar2.getContext().getResources().getColor(com.tencent.mm.R.color.a0c));
                    eVar2.f162077m.setBackgroundResource(com.tencent.mm.R.drawable.f481057jk);
                    eVar2.f162077m.setTextColor(eVar2.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
                    eVar2.f162078n.setTextColor(eVar2.getContext().getResources().getColor(com.tencent.mm.R.color.f479468a06));
                }
            }
            eVar2.H = dVar2;
            eVar2.show();
            db5.e1.a(this, eVar2);
            eVar = eVar2;
        }
        this.Z1 = eVar;
    }

    public final void n7(boolean z17) {
        p7(z17);
        if (this.f162164z1 == null) {
            this.f162164z1 = findViewById(com.tencent.mm.R.id.gtb);
        }
        if (!z17) {
            android.view.View view = this.f162164z1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int f17 = c34.h0.Ri().f();
        if (f17 <= 0) {
            android.view.View view2 = this.f162164z1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (this.B1 == null) {
            this.B1 = (android.widget.TextView) this.f162164z1.findViewById(com.tencent.mm.R.id.f486885mr3);
        }
        this.B1.setText(getString(com.tencent.mm.R.string.j2w, java.lang.Integer.valueOf(f17)));
        this.f162164z1.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.13
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view3) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(view3);
                java.lang.Object[] array = arrayList3.toArray();
                arrayList3.clear();
                yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeReportUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                android.content.Intent intent = new android.content.Intent(shakeReportUI, (java.lang.Class<?>) com.tencent.mm.plugin.shake.ui.ShakeMsgListUI.class);
                intent.putExtra("shake_msg_from", 1);
                intent.putExtra("shake_msg_list_title", shakeReportUI.getString(com.tencent.mm.R.string.j3o));
                com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI2 = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(intent);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(shakeReportUI2, arrayList4.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI$13", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                shakeReportUI2.startActivity((android.content.Intent) arrayList4.get(0));
                yj0.a.f(shakeReportUI2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$13", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (this.A1 == null) {
            this.A1 = (com.tencent.mm.ui.MMImageView) findViewById(com.tencent.mm.R.id.mr9);
        }
        c34.u Ri = c34.h0.Ri();
        c34.t tVar = null;
        android.database.Cursor f18 = Ri.f38243d.f("SELECT * FROM " + Ri.getTableName() + " where status != 1 ORDER BY rowid DESC LIMIT 1", null, 2);
        if (f18 != null) {
            if (f18.moveToFirst()) {
                tVar = new c34.t();
                tVar.convertFrom(f18);
            }
            f18.close();
        }
        if (tVar != null) {
            java.lang.String str = tVar.field_thumburl;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.A1.setImageResource(com.tencent.mm.R.raw.app_attach_file_icon_webpage);
            } else {
                j34.h hVar = new j34.h(str);
                ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
                android.graphics.Bitmap d17 = x51.w0.d(hVar);
                this.A1.setTag(hVar.c());
                if (d17 == null || d17.isRecycled()) {
                    this.A1.setImageResource(com.tencent.mm.R.raw.app_attach_file_icon_webpage);
                } else {
                    this.A1.setImageBitmap(d17);
                }
            }
        }
        android.view.View view3 = this.f162164z1;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void o7(int i17) {
        j7(i17 == 1);
        if (i17 == 2) {
            h7(true);
        } else {
            h7(false);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1) {
            if (intent == null) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("CropImageMode", 4);
            intent2.putExtra("CropImage_Filter", true);
            intent2.putExtra("CropImage_DirectlyIntoFilter", true);
            intent2.putExtra("CropImage_OutputPath", g83.a.a() + "custom_shake_img_filename.jpg");
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.r(intent2, 2, this, intent);
            return;
        }
        if (i17 == 2) {
            if (intent == null) {
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
            c01.d9.b().p().w(4110, java.lang.Boolean.FALSE);
            c01.d9.b().p().w(4111, stringExtra);
            X6();
            return;
        }
        if (i17 == 4) {
            if (i18 == -1) {
                c7();
                return;
            }
            return;
        }
        if (i17 != 30764) {
            return;
        }
        if (intent == null) {
            this.f162124d2 = true;
            finish();
            return;
        }
        android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
        if (bundleExtra == null || !bundleExtra.getString("go_next", "").equals("gdpr_auth_location")) {
            this.f162124d2 = true;
            finish();
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            j35.u.i(this, "android.permission.ACCESS_FINE_LOCATION", 64);
            this.f162124d2 = false;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        boolean z17 = false;
        setActionbarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        vj5.o.e(getWindow());
        hideActionbarLine();
        hideActionBarOperationArea();
        if (getSupportActionBar() != null) {
            getSupportActionBar().o();
        }
        setNavigationbarColor(0);
        y24.b.f459124c = getIntent().getIntExtra("enter_from_scene", 1);
        hideTitleView();
        hideActionbarLine();
        boolean Vi = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi();
        if (Vi) {
            this.f162122c2 = true;
        } else {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            this.f162132h2 = i11.h.e();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "enterShakeReportUI enableTingDiscoverEntry: %s", java.lang.Boolean.valueOf(Vi));
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_TV_LATITUDE_STRING, "");
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_TV_LONGTITUDE_STRING, "");
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_TV_ACCURACY_STRING, "");
        f34.i Di = c34.h0.Di();
        if (Di.f259354a == null) {
            Di.f259354a = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Di.f259354a).add(new java.lang.ref.WeakReference(this));
        initView();
        this.f162143o = new com.tencent.mm.plugin.shake.ui.i(getBodyView());
        q35.d dVar = new q35.d(this);
        this.f162141n = dVar;
        android.hardware.SensorManager sensorManager = dVar.f359974a;
        if (sensorManager == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShakeSensorService", "cannot init sensor manager");
        } else {
            java.util.List<android.hardware.Sensor> sensorList = sensorManager.getSensorList(1);
            if (sensorList != null && sensorList.size() > 0) {
                z17 = true;
            }
        }
        if (!z17) {
            db5.e1.m(this, com.tencent.mm.R.string.f493120j35, com.tencent.mm.R.string.f490573yv, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.finish();
                }
            });
        }
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        x51.w0.a(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "%s", getResources().getDisplayMetrics().toString());
        int f17 = c34.h0.Ri().f();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(11317, java.lang.Integer.valueOf(f17), com.tencent.mm.plugin.shake.ui.f1.a());
        g0Var.d(11710, 1);
        g0Var.C(834L, 0L, 1L);
        ku5.u0 u0Var = ku5.t0.f312615d;
        y24.a aVar = new y24.a(null, 1);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(aVar, 100L, null);
        this.U = new com.tencent.mm.plugin.shake.ui.ShakeReportUI$$f(this);
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ShakeReportUI)).Rj(this, iy1.a.Shake);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        f34.e eVar;
        android.graphics.Bitmap bitmap = this.E1;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.E1.recycle();
        }
        android.app.Dialog dialog = this.F1;
        if (dialog != null && dialog.isShowing()) {
            this.F1.dismiss();
            this.F1 = null;
        }
        c34.z zVar = this.f162145p.f38181b;
        if (zVar != null) {
            zVar.a();
        }
        q35.d dVar = this.f162141n;
        if (dVar != null) {
            dVar.b();
            this.f162141n = null;
        }
        h34.w wVar = h34.w.f278566g;
        if (wVar == null || wVar.f38247d == null) {
            h34.w.f278566g = new h34.w(this, null);
        }
        h34.w.f278566g.getClass();
        h34.w.f278566g = null;
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        x51.w0.e(this);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_IBEACON_PUSH_IS_IN_SHAKEUI_BOOLEAN, java.lang.Boolean.FALSE);
        int i17 = 0;
        if (g34.a.h()) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().p(262154, false);
        }
        com.tencent.mm.plugin.shake.shakecard.ui.e eVar2 = this.Z1;
        if (eVar2 != null && eVar2.isShowing()) {
            this.Z1.dismiss();
        }
        this.Z1 = null;
        f34.i Di = c34.h0.Di();
        if (Di.f259354a != null) {
            while (true) {
                if (i17 < ((java.util.ArrayList) Di.f259354a).size()) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) Di.f259354a).get(i17);
                    if (weakReference != null && (eVar = (f34.e) weakReference.get()) != null && eVar.equals(this)) {
                        ((java.util.ArrayList) Di.f259354a).remove(weakReference);
                        break;
                    }
                    i17++;
                } else {
                    break;
                }
            }
        }
        f34.c Bi = c34.h0.Bi();
        Bi.f259325d = -85.0f;
        Bi.f259326e = -1000.0f;
        i11.e eVar3 = this.f162132h2;
        if (eVar3 != null) {
            ((i11.h) eVar3).m(this.f162134i2);
        }
        this.f162148p2.dead();
        super.onDestroy();
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        u7();
        if (this.f162131h) {
            return;
        }
        n7(true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        c01.d9.b().G(this);
        c01.d9.b().p().e(this);
        c34.h0.Ni().remove(this);
        c34.z zVar = this.f162145p.f38181b;
        if (zVar != null) {
            zVar.c();
        }
        this.f162133i = false;
        q35.d dVar = this.f162141n;
        if (dVar != null) {
            dVar.b();
        }
        android.view.View view = this.f162143o.f162279a;
        if (view != null) {
            view.setKeepScreenOn(false);
        }
        if (this.M1 != 4) {
            c01.d9.b().p().w(327696, this.M1 + "");
        }
        if (this.M1 == 3) {
            T6(3, false);
        }
        this.f162148p2.dead();
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 64) {
            if (i17 != 80) {
                return;
            }
            if (iArr[0] == 0) {
                this.f162126e2 = false;
                return;
            } else {
                db5.e1.C(this, getString(com.tencent.mm.R.string.hhn), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.27
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                        dialogInterface.dismiss();
                        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                        com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                        androidx.appcompat.app.AppCompatActivity context = shakeReportUI.getContext();
                        ((sb0.f) jVar).getClass();
                        j35.u.g(context);
                        shakeReportUI.f162126e2 = false;
                    }
                }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.28
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                        dialogInterface.dismiss();
                        com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.f162126e2 = false;
                    }
                });
                return;
            }
        }
        if (iArr[0] == 0) {
            Y6();
            this.f162126e2 = false;
        } else {
            this.f162124d2 = false;
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhm), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.29
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                    com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                    androidx.appcompat.app.AppCompatActivity context = shakeReportUI.getContext();
                    ((sb0.f) jVar).getClass();
                    j35.u.g(context);
                    shakeReportUI.f162124d2 = true;
                    shakeReportUI.f162126e2 = false;
                }
            }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.30
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                    shakeReportUI.f162124d2 = true;
                    shakeReportUI.f162126e2 = false;
                }
            });
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f162148p2.alive();
        Y6();
    }

    public final void p7(boolean z17) {
        if (this.f162162y1 == null) {
            this.f162162y1 = findViewById(com.tencent.mm.R.id.gta);
        }
        int i17 = this.f162145p.f38180a;
        if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5 || !z17) {
            android.view.View view = this.f162162y1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showSayHiMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showSayHiMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int f17 = r21.w.Di().f();
        if (f17 <= 0) {
            android.view.View view2 = this.f162162y1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showSayHiMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showSayHiMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.f162162y1;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showSayHiMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showSayHiMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) this.f162162y1.findViewById(com.tencent.mm.R.id.m9z)).setText(getResources().getQuantityString(com.tencent.mm.R.plurals.f489691a1, f17, java.lang.Integer.valueOf(f17)));
        this.f162162y1.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.12
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view4) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(view4);
                java.lang.Object[] array = arrayList4.toArray();
                arrayList4.clear();
                yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeReportUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                android.content.Intent intent = new android.content.Intent(com.tencent.mm.plugin.shake.ui.ShakeReportUI.this, (java.lang.Class<?>) com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI.class);
                intent.putExtra("IntentSayHiType", 1);
                intent.putExtra("IntentNewSayHiMsg", true);
                com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(intent);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(shakeReportUI, arrayList5.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI$12", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                shakeReportUI.startActivity((android.content.Intent) arrayList5.get(0));
                yj0.a.f(shakeReportUI, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$12", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (this.C1 == null) {
            this.C1 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f485863jd0);
        }
        com.tencent.mm.storage.pa z07 = r21.w.Di().z0();
        if (z07 != null) {
            this.D1 = z07.field_sayhiuser;
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.C1, this.D1, null);
        }
    }

    public final void q7() {
        if (this.M1 == 5 && g34.a.h()) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            boolean b17 = bk0.a.g().b(262154, 266258);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            boolean b18 = bk0.a.g().b(262155, 266259);
            if (b17) {
                g7((java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_DESC_STRING_SYNC, ""), true);
                return;
            }
            if (b18) {
                g7((java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_TAB_RED_DOT_DESC_STRING_SYNC, ""), true);
                return;
            }
            if (this.f162120a2) {
                return;
            }
            com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_TIP_STRING_SYNC;
            if (android.text.TextUtils.isEmpty((java.lang.String) p17.m(u3Var, ""))) {
                g7(getString(com.tencent.mm.R.string.j1y), true);
            } else {
                g7((java.lang.String) c01.d9.b().p().m(u3Var, ""), true);
            }
        }
    }

    public final void r7() {
        boolean g17 = g34.a.g();
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean b17 = bk0.a.g().b(262154, 266258);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean b18 = bk0.a.g().b(262155, 266259);
        int intExtra = getIntent().getBooleanExtra("shake_card", false) ? getIntent().getIntExtra("shake_card", 0) : 0;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(11668, 1, java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(b17 ? 1 : 0), java.lang.Integer.valueOf(g17 ? 1 : 0), g34.a.d(), java.lang.Integer.valueOf(g34.a.c()));
        g0Var.d(11668, 2, java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(b18 ? 1 : 0), java.lang.Integer.valueOf(g17 ? 1 : 0), g34.a.d(), java.lang.Integer.valueOf(g34.a.c()));
    }

    public final void s7(boolean z17) {
        if (this.M1 != 3 || z17) {
            android.view.View view = this.O1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        h34.i0 Ui = c34.h0.Ui();
        Ui.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.database.Cursor f17 = Ui.f278543d.f("SELECT * FROM shaketvhistory ORDER BY createtime DESC LIMIT 4", null, 2);
        while (f17.moveToNext()) {
            h34.h0 h0Var = new h34.h0();
            h0Var.convertFrom(f17);
            arrayList2.add(h0Var);
        }
        f17.close();
        int size = arrayList2.size();
        if (size == 0) {
            android.view.View view2 = this.O1;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.T1;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.U1;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.V1;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view5, arrayList6.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = this.W1;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view6, arrayList7.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (size >= 1) {
            com.tencent.mm.plugin.shake.ui.f1.b(this.P1, ((h34.h0) arrayList2.get(0)).field_iconurl, 0, true);
            android.widget.ImageView imageView = this.P1;
            h34.h0 h0Var2 = (h34.h0) arrayList2.get(0);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            if (imageView != null) {
                imageView.setOnClickListener(new h34.y(h0Var2, context));
            }
            android.view.View view7 = this.T1;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view7, arrayList8.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (size >= 2) {
            com.tencent.mm.plugin.shake.ui.f1.b(this.Q1, ((h34.h0) arrayList2.get(1)).field_iconurl, 0, true);
            android.widget.ImageView imageView2 = this.Q1;
            h34.h0 h0Var3 = (h34.h0) arrayList2.get(1);
            androidx.appcompat.app.AppCompatActivity context2 = getContext();
            if (imageView2 != null) {
                imageView2.setOnClickListener(new h34.y(h0Var3, context2));
            }
            android.view.View view8 = this.U1;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view8, arrayList9.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (size >= 3) {
            com.tencent.mm.plugin.shake.ui.f1.b(this.R1, ((h34.h0) arrayList2.get(2)).field_iconurl, 0, true);
            android.widget.ImageView imageView3 = this.R1;
            h34.h0 h0Var4 = (h34.h0) arrayList2.get(2);
            androidx.appcompat.app.AppCompatActivity context3 = getContext();
            if (imageView3 != null) {
                imageView3.setOnClickListener(new h34.y(h0Var4, context3));
            }
            android.view.View view9 = this.V1;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view9, arrayList10.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (size >= 4) {
            this.S1.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.shake.ui.ShakeReportUI.26
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view10) {
                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                    arrayList11.add(view10);
                    java.lang.Object[] array = arrayList11.toArray();
                    arrayList11.clear();
                    yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeReportUI$26", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12108, "", 1, 3);
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClass(com.tencent.mm.plugin.shake.ui.ShakeReportUI.this.getContext(), com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI.class);
                    com.tencent.mm.plugin.shake.ui.ShakeReportUI shakeReportUI = com.tencent.mm.plugin.shake.ui.ShakeReportUI.this;
                    java.util.ArrayList arrayList12 = new java.util.ArrayList();
                    arrayList12.add(intent);
                    java.util.Collections.reverse(arrayList12);
                    yj0.a.d(shakeReportUI, arrayList12.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI$26", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    shakeReportUI.startActivity((android.content.Intent) arrayList12.get(0));
                    yj0.a.f(shakeReportUI, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$26", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$26", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            android.view.View view10 = this.W1;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(0);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view10, arrayList11.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view11 = this.O1;
        java.util.ArrayList arrayList12 = new java.util.ArrayList();
        arrayList12.add(0);
        java.util.Collections.reverse(arrayList12);
        yj0.a.d(view11, arrayList12.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view11.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
        yj0.a.f(view11, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(z24.a.class);
    }

    public final void t7() {
        boolean z17 = this.f162122c2;
        java.util.Map map = this.f162121b2;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "updateTabView enableTingDiscoverEntry and only show music");
            ((java.util.HashMap) map).put(2, java.lang.Boolean.TRUE);
            l7(false);
            return;
        }
        if (b21.q.c()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "is not oversea user, show shake music");
            ((java.util.HashMap) map).put(2, java.lang.Boolean.TRUE);
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.mrt);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateTabView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateTabView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (b21.q.b()) {
                if (c01.d9.b().p().q(4118, 0) == 0) {
                    this.L1.setVisibility(0);
                } else {
                    this.L1.setVisibility(8);
                }
            }
        } else {
            ((java.util.HashMap) map).put(2, java.lang.Boolean.FALSE);
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.mrt);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateTabView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateTabView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "is oversea user, hide shake music");
        }
        if (h34.z.e()) {
            ((java.util.HashMap) map).put(3, java.lang.Boolean.TRUE);
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "show shake tv tab");
        } else {
            ((java.util.HashMap) map).put(3, java.lang.Boolean.FALSE);
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "hide shake tv tab");
        }
        if (g34.a.h()) {
            ((java.util.HashMap) map).put(5, java.lang.Boolean.TRUE);
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "show shake card tab");
        } else {
            ((java.util.HashMap) map).put(5, java.lang.Boolean.FALSE);
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "hide shake card tab");
        }
        java.util.Iterator it = ((java.util.HashMap) map).values().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((java.lang.Boolean) it.next()).booleanValue()) {
                i17++;
            }
        }
        l7(i17 != 1);
        if (i17 > 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeReportUI", "show tab count is > 4 and beaconMap.size() <= 0.");
        }
    }

    public final void u7() {
        boolean t17 = com.tencent.mm.sdk.platformtools.t8.t1((java.lang.Boolean) c01.d9.b().p().l(4112, null));
        this.f162127f = t17;
        if (t17) {
            setTitleMuteIconVisibility(8);
        } else {
            setTitleMuteIconVisibility(0);
        }
    }
}
