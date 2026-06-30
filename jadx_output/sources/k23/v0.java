package k23;

/* loaded from: classes12.dex */
public final class v0 {
    public boolean A;

    /* renamed from: a */
    public final com.tencent.mm.ui.MMActivity f303706a;

    /* renamed from: b */
    public k23.d0 f303707b;

    /* renamed from: c */
    public z21.e f303708c;

    /* renamed from: d */
    public java.lang.String f303709d;

    /* renamed from: e */
    public java.lang.String f303710e;

    /* renamed from: f */
    public boolean f303711f;

    /* renamed from: g */
    public long f303712g;

    /* renamed from: h */
    public java.lang.Boolean f303713h;

    /* renamed from: i */
    public k23.i1 f303714i;

    /* renamed from: j */
    public k23.x f303715j;

    /* renamed from: k */
    public boolean f303716k;

    /* renamed from: l */
    public boolean f303717l;

    /* renamed from: m */
    public boolean f303718m;

    /* renamed from: n */
    public k23.g0 f303719n;

    /* renamed from: o */
    public final k23.u0 f303720o;

    /* renamed from: p */
    public final java.lang.Runnable f303721p;

    /* renamed from: q */
    public boolean f303722q;

    /* renamed from: r */
    public boolean f303723r;

    /* renamed from: s */
    public com.tencent.mm.ui.tools.f5 f303724s;

    /* renamed from: t */
    public boolean f303725t;

    /* renamed from: u */
    public boolean f303726u;

    /* renamed from: v */
    public int f303727v;

    /* renamed from: w */
    public final jz5.g f303728w;

    /* renamed from: x */
    public boolean f303729x;

    /* renamed from: y */
    public final com.tencent.mm.sdk.platformtools.b4 f303730y;

    /* renamed from: z */
    public k23.k1 f303731z;

    public v0(com.tencent.mm.ui.MMActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f303706a = activity;
        this.f303709d = "";
        this.f303710e = "";
        this.f303720o = new k23.u0(this, android.os.Looper.getMainLooper());
        this.f303721p = new k23.n0(this);
        this.f303722q = true;
        this.f303726u = true;
        this.f303728w = jz5.h.b(new k23.q0(this));
        this.f303729x = true;
        this.f303730y = new com.tencent.mm.sdk.platformtools.b4(new k23.i0(this), true);
    }

    public static final void a(k23.v0 v0Var) {
        v0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "onBtnCancelRecognize");
        v0Var.f303718m = false;
        k23.g0 g0Var = v0Var.f303719n;
        if (g0Var != null) {
            g0Var.f303575b = true;
        }
        v0Var.f303730y.d();
        k23.d0 d0Var = v0Var.f303707b;
        if (d0Var == null) {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
        k23.v2 v2Var = d0Var.f303546c;
        if (v2Var != null) {
            v2Var.onCancel();
        }
        vu4.b n17 = v0Var.n();
        k23.d0 d0Var2 = v0Var.f303707b;
        if (d0Var2 == null) {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
        int i17 = d0Var2.f303548e == k23.w0.f303737g ? 238 : d0Var2.f303550g;
        org.json.JSONObject o17 = v0Var.o();
        java.lang.String p17 = v0Var.p();
        z50.d dVar = z50.e.f470163a;
        vu4.a aVar = vu4.a.f440256z;
        k23.d0 d0Var3 = v0Var.f303707b;
        if (d0Var3 == null) {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
        dVar.a(aVar, n17, i17, d0Var3.f303549f, o17, p17);
        x(v0Var, 5, "{\"voiceId\":\"" + v0Var.f303710e + "\"}", null, 4, null);
        x(v0Var, 7, "{\"errorCode\": \"-3\"; \"voiceId\":\"\"; \"errorMsg\": \"user cancel\"}", null, 4, null);
        v0Var.s();
        v0Var.z();
    }

    public static final void b(k23.v0 v0Var) {
        z21.j0 j0Var;
        v0Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - v0Var.f303712g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBtnFinishRecognize, scene=");
        k23.d0 d0Var = v0Var.f303707b;
        if (d0Var == null) {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
        sb6.append(d0Var.f303548e);
        sb6.append(", duration=");
        sb6.append(currentTimeMillis);
        sb6.append("ms, recognizingText='");
        sb6.append(v0Var.f303709d);
        sb6.append('\'');
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb6.toString());
        k23.g0 g0Var = v0Var.f303719n;
        if (g0Var != null) {
            g0Var.f303575b = true;
        }
        v0Var.f303730y.d();
        x(v0Var, 4, null, null, 6, null);
        if (currentTimeMillis < 500) {
            if (v0Var.f303709d.length() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "Recording too short and no result, hide immediately");
                v0Var.f303718m = false;
                v0Var.s();
                x(v0Var, 7, "{\"errorCode\":-1;\"errMsg\":\"recording not started when gesture end\";\"voiceId\":\"\"}", null, 4, null);
                v0Var.z();
                return;
            }
        }
        v0Var.f303720o.sendEmptyMessageDelayed(101, 3000L);
        z21.e eVar = v0Var.f303708c;
        if (eVar != null) {
            ((z21.w) eVar).stop(true);
        }
        z21.e eVar2 = v0Var.f303708c;
        if (eVar2 != null) {
            z21.w wVar = (z21.w) eVar2;
            if (!wVar.C || (j0Var = wVar.A) == null) {
                return;
            }
            j0Var.f469640w = true;
        }
    }

    public static final void c(k23.v0 v0Var) {
        k23.q2 q2Var;
        v0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "onBtnStartRecognize");
        boolean z17 = true;
        v0Var.f303718m = true;
        v0Var.g("interrupted by new session", -4);
        long timeInMillis = java.util.Calendar.getInstance().getTimeInMillis();
        java.util.Random random = new java.util.Random();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(10);
        for (int i17 = 0; i17 < 10; i17++) {
            sb6.append(random.nextInt(10));
        }
        java.lang.String format = java.lang.String.format("vs-%d-%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(timeInMillis), sb6}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        v0Var.f303719n = new k23.g0(format);
        v0Var.f303712g = java.lang.System.currentTimeMillis();
        v0Var.f303722q = true;
        k23.d0 d0Var = v0Var.f303707b;
        if (d0Var == null) {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
        k23.v2 v2Var = d0Var.f303546c;
        if (v2Var != null) {
            v2Var.a();
        }
        com.tencent.mm.ui.MMActivity context = v0Var.f303706a;
        kotlin.jvm.internal.o.g(context, "context");
        if (iq.b.C(context) || iq.b.v(context) || iq.b.e(context) || iq.b.z(context)) {
            q2Var = k23.q2.f303671f;
        } else if (com.tencent.mars.comm.NetStatusUtil.isConnected(context)) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean d17 = j35.u.d(context, "android.permission.RECORD_AUDIO", true);
            com.tencent.mars.xlog.Log.i("FTSVoicePermission", "summerper checkPermission checkMicrophone[%s]", java.lang.Boolean.valueOf(d17));
            if (d17) {
                q2Var = k23.q2.f303670e;
            } else {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                j35.u.i(context, "android.permission.RECORD_AUDIO", 80);
                q2Var = k23.q2.f303673h;
            }
        } else {
            q2Var = k23.q2.f303672g;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "checkPermission -> " + q2Var.f303675d);
        int ordinal = q2Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "do nothing");
            } else {
                v0Var.D(context.getString(com.tencent.mm.R.string.fh9));
            }
            z17 = false;
        }
        v0Var.f303722q = z17;
        if (!z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTSFloatingVoiceInputViewModel", "something wrong with recognizing");
            return;
        }
        v0Var.z();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "showRecognizingPanel");
        k23.x xVar = v0Var.f303715j;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("recognizingPanel");
            throw null;
        }
        xVar.setVisibility(0);
        k23.x xVar2 = v0Var.f303715j;
        if (xVar2 == null) {
            kotlin.jvm.internal.o.o("recognizingPanel");
            throw null;
        }
        if (xVar2.getParent() == null) {
            k23.d0 d0Var2 = v0Var.f303707b;
            if (d0Var2 == null) {
                kotlin.jvm.internal.o.o("params");
                throw null;
            }
            android.view.ViewGroup viewGroup = d0Var2.f303544a;
            if (viewGroup != null) {
                k23.x xVar3 = v0Var.f303715j;
                if (xVar3 == null) {
                    kotlin.jvm.internal.o.o("recognizingPanel");
                    throw null;
                }
                viewGroup.addView(xVar3, d0Var2.f303545b);
            }
        }
        v0Var.H();
        k23.x xVar4 = v0Var.f303715j;
        if (xVar4 == null) {
            kotlin.jvm.internal.o.o("recognizingPanel");
            throw null;
        }
        xVar4.g();
        int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479723df);
        java.lang.Integer startButtonTopToBottomHeightPx = v0Var.q().getStartButtonTopToBottomHeightPx();
        int intValue = h17 + (startButtonTopToBottomHeightPx != null ? startButtonTopToBottomHeightPx.intValue() : pm0.v.S(90));
        k23.x xVar5 = v0Var.f303715j;
        if (xVar5 == null) {
            kotlin.jvm.internal.o.o("recognizingPanel");
            throw null;
        }
        xVar5.setSemiCircleContainerHeight(intValue);
        y50.m mVar = y50.m.f459460a;
        y50.m.f459461b.f459447c = null;
        y50.m.f459462c.f459447c = null;
        com.tencent.mm.ui.MMActivity mMActivity = v0Var.f303706a;
        k23.x xVar6 = v0Var.f303715j;
        if (xVar6 == null) {
            kotlin.jvm.internal.o.o("recognizingPanel");
            throw null;
        }
        y50.m.a(mVar, mMActivity, xVar6.getTargetActivityBarColor(), 300L, v0Var.q().getTargetActivityBarColor(), null, 16, null);
        k23.x xVar7 = v0Var.f303715j;
        if (xVar7 == null) {
            kotlin.jvm.internal.o.o("recognizingPanel");
            throw null;
        }
        xVar7.d();
        ((x90.o) ((y90.i) i95.n0.c(y90.i.class))).getClass();
        z21.w wVar = new z21.w();
        v0Var.f303708c = wVar;
        wVar.init(false, false, 1, 23, new k23.s0(v0Var));
        z21.e eVar = v0Var.f303708c;
        if (eVar != null) {
            ((z21.w) eVar).f(v0Var.f303717l, v0Var.f303716k, new k23.t0(v0Var));
        }
        z21.e eVar2 = v0Var.f303708c;
        if (eVar2 != null) {
            ((z21.w) eVar2).start();
        }
        v0Var.f303730y.c(50L, 50L);
        vu4.b n17 = v0Var.n();
        org.json.JSONObject o17 = v0Var.o();
        java.lang.String p17 = v0Var.p();
        z50.d dVar = z50.e.f470163a;
        vu4.a aVar = vu4.a.E;
        k23.d0 d0Var3 = v0Var.f303707b;
        if (d0Var3 == null) {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
        dVar.a(aVar, n17, d0Var3.f303550g, d0Var3.f303549f, o17, p17);
        x(v0Var, 1, "{\"transferType\":" + (v0Var.f303717l ? 1 : 0) + ";\"encodeType\":" + (v0Var.f303716k ? 1 : 0) + ";\"exptArg\":" + j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigWebSearchVoiceASRExptArg()) + ";}", null, 4, null);
    }

    public static /* synthetic */ void x(k23.v0 v0Var, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            str = "";
        }
        if ((i18 & 4) != 0) {
            str2 = v0Var.f303709d;
        }
        v0Var.w(i17, str, str2);
    }

    public final int A(int i17) {
        if (i17 <= 0) {
            return i17;
        }
        try {
            k23.d0 d0Var = this.f303707b;
            if (d0Var == null) {
                kotlin.jvm.internal.o.o("params");
                throw null;
            }
            android.view.ViewGroup viewGroup = d0Var.f303547d;
            if (viewGroup == null) {
                if (d0Var == null) {
                    kotlin.jvm.internal.o.o("params");
                    throw null;
                }
                viewGroup = d0Var.f303544a;
                if (viewGroup == null) {
                    return i17;
                }
            }
            android.view.View rootView = viewGroup.getRootView();
            if (rootView == null) {
                return i17;
            }
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.g3 a17 = n3.b1.a(rootView);
            if (a17 == null) {
                return i17;
            }
            int i18 = a17.a(8).f247047d;
            int i19 = a17.a(2).f247047d;
            if (i18 > 0 && i19 > 0) {
                boolean z17 = true;
                int i27 = i18 - i17;
                if (!(1 <= i27 && i27 <= i19 + 1)) {
                    return i17;
                }
                int[] iArr = new int[2];
                viewGroup.getLocationInWindow(iArr);
                if (rootView.getHeight() - (iArr[1] + viewGroup.getHeight()) > 1) {
                    z17 = false;
                }
                return z17 ? i18 : i17;
            }
            return i17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTSFloatingVoiceInputViewModel", "resolveEffectiveKeyboardHeight err: " + th6);
            return i17;
        }
    }

    public final void B(boolean z17) {
        if (this.f303729x == z17) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setGloballyEnabledByUser: ");
        sb6.append(z17);
        sb6.append(" (scene=");
        k23.d0 d0Var = this.f303707b;
        if (d0Var == null) {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
        sb6.append(d0Var.f303548e);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb6.toString());
        this.f303729x = z17;
        if (z17) {
            return;
        }
        r();
        k23.x xVar = this.f303715j;
        if (xVar != null) {
            xVar.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("recognizingPanel");
            throw null;
        }
    }

    public final void C() {
        if (!e()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "showButtonIfNeeded skipped: not allowed by global switch");
            return;
        }
        if (q().getVisibility() == 0 && this.f303711f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "showButtonIfNeeded, already show");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "showButtonIfNeeded");
        q().setVisibility(0);
        y50.m.a(y50.m.f459460a, this.f303706a, q().getTargetActivityBarColor(), 0L, null, null, 24, null);
        this.f303711f = true;
    }

    public final void D(java.lang.String str) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.g(str);
        u1Var.a(true);
        u1Var.c(null, null);
        u1Var.q(false);
    }

    public final void E() {
        k23.d0 d0Var = this.f303707b;
        if (d0Var == null) {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
        java.lang.String buttonTitle = d0Var.f303551h;
        kotlin.jvm.internal.o.g(buttonTitle, "buttonTitle");
        q().setButtonText(buttonTitle);
        C();
    }

    public final void F(float f17) {
        k23.d0 d0Var = this.f303707b;
        if (d0Var != null) {
            d0Var.f303555l = f17;
        } else {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
    }

    public final void G(boolean z17) {
        boolean z18 = z17 && e();
        q().setVisibility(z18 ? 0 : 8);
        k23.x xVar = this.f303715j;
        if (xVar != null) {
            xVar.setVisibility(z18 ? 0 : 8);
        } else {
            kotlin.jvm.internal.o.o("recognizingPanel");
            throw null;
        }
    }

    public final void H() {
        java.lang.Object systemService = this.f303706a.getSystemService("vibrator");
        android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        if (vibrator == null) {
            return;
        }
        vibrator.vibrate(30L);
    }

    public final void d(int i17) {
        k23.i1 q17 = q();
        k23.p2 p2Var = q17 instanceof k23.p2 ? (k23.p2) q17 : null;
        if (p2Var == null) {
            return;
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(p2Var.getMarginBottomPx(), i17);
        ofInt.setDuration(200L);
        android.view.animation.PathInterpolator pathInterpolator = k23.i1.f303584m;
        ofInt.setInterpolator(k23.i1.f303584m);
        ofInt.addUpdateListener(new k23.j0(p2Var, ofInt));
        ofInt.start();
    }

    public final boolean e() {
        k23.d0 d0Var = this.f303707b;
        if (d0Var == null) {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
        if (!(d0Var.f303548e == k23.w0.f303734d) || this.f303729x) {
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canShowButton=false: globally disabled by user (scene=");
        k23.d0 d0Var2 = this.f303707b;
        if (d0Var2 == null) {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
        sb6.append(d0Var2.f303548e);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb6.toString());
        return false;
    }

    public final void f() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f303724s;
        if (f5Var != null) {
            f5Var.f210400e = null;
            f5Var.d();
            this.f303724s = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "cleanupKeyboardBinding");
        }
    }

    public final void g(java.lang.String str, int i17) {
        java.lang.String str2;
        k23.g0 g0Var = this.f303719n;
        if (g0Var == null) {
            return;
        }
        if (g0Var == null || !g0Var.f303575b) {
            java.lang.String str3 = "{\"errorCode\": " + i17 + "; \"errMsg\": " + str + "; \"voiceId\":\"" + this.f303710e + "\"}";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("floating VI closeSession[");
            k23.g0 g0Var2 = this.f303719n;
            if (g0Var2 == null || (str2 = g0Var2.f303574a) == null) {
                str2 = "";
            }
            sb6.append(str2);
            sb6.append("], reason:");
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb6.toString());
            x(this, 7, str3, null, 4, null);
            k23.g0 g0Var3 = this.f303719n;
            if (g0Var3 == null) {
                return;
            }
            g0Var3.f303575b = true;
        }
    }

    public final void h() {
        if (this.f303723r) {
            this.f303723r = false;
            f();
            int j17 = j();
            k23.i1 q17 = q();
            k23.p2 p2Var = q17 instanceof k23.p2 ? (k23.p2) q17 : null;
            if (p2Var != null) {
                p2Var.setMarginBottomPx(j17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "disableKeyboardBinding, reset margin to default: " + j17);
        }
    }

    public final void i() {
        this.f303723r = true;
        f();
        this.f303725t = false;
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(this.f303706a);
        f5Var.f210400e = new k23.l0(this);
        this.f303706a.getWindow().getDecorView().post(new k23.m0(f5Var));
        this.f303724s = f5Var;
        this.f303706a.mo133getLifecycle().a(new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceInputViewModel$enableKeyboardBindingWithAutoProvider$3
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onDestroy(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                k23.v0.this.f();
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "lifecycle onDestroy, auto cleanup keyboardHeightProvider");
            }
        });
    }

    public final int j() {
        k23.d0 d0Var = this.f303707b;
        if (d0Var == null) {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
        int i17 = k23.h0.f303579a[d0Var.f303548e.ordinal()];
        com.tencent.mm.ui.MMActivity mMActivity = this.f303706a;
        return i17 == 1 ? i65.a.h(mMActivity, com.tencent.mm.R.dimen.ali) : i65.a.h(mMActivity, com.tencent.mm.R.dimen.f479724dg);
    }

    public final int k() {
        k23.i1 q17 = q();
        k23.p2 p2Var = q17 instanceof k23.p2 ? (k23.p2) q17 : null;
        if (p2Var != null) {
            return j() + p2Var.getStartBtn().getHeight();
        }
        java.lang.Integer startButtonTopToBottomHeightPx = q().getStartButtonTopToBottomHeightPx();
        if (startButtonTopToBottomHeightPx != null) {
            return startButtonTopToBottomHeightPx.intValue();
        }
        return 0;
    }

    public final int l() {
        return ((java.lang.Number) ((jz5.n) this.f303728w).getValue()).intValue();
    }

    public final k23.j2 m() {
        k23.i1 q17 = q();
        if (q17 instanceof k23.j2) {
            return (k23.j2) q17;
        }
        return null;
    }

    public final vu4.b n() {
        k23.d0 d0Var = this.f303707b;
        if (d0Var != null) {
            int ordinal = d0Var.f303548e.ordinal();
            return (ordinal == 1 || ordinal == 2) ? vu4.b.D : vu4.b.C;
        }
        kotlin.jvm.internal.o.o("params");
        throw null;
    }

    public final org.json.JSONObject o() {
        k23.d0 d0Var = this.f303707b;
        if (d0Var == null) {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
        int ordinal = d0Var.f303548e.ordinal();
        if (ordinal == 3 || ordinal == 4) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("isFromVoice", 1);
            if (!(this.f303710e.length() > 0)) {
                return jSONObject;
            }
            jSONObject.put("voiceId", this.f303710e);
            return jSONObject;
        }
        try {
            com.tencent.mm.ui.MMActivity context = this.f303706a;
            kotlin.jvm.internal.o.g(context, "context");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(context).a(z13.f.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            return ((z13.f) a17).a7();
        } catch (java.lang.Exception unused) {
            return new org.json.JSONObject();
        }
    }

    public final java.lang.String p() {
        k23.d0 d0Var = this.f303707b;
        if (d0Var == null) {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
        int ordinal = d0Var.f303548e.ordinal();
        if (ordinal == 3 || ordinal == 4) {
            return "";
        }
        try {
            com.tencent.mm.ui.MMActivity context = this.f303706a;
            kotlin.jvm.internal.o.g(context, "context");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(context).a(z13.f.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            return ((z13.f) a17).f469401g;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public final k23.i1 q() {
        k23.i1 i1Var = this.f303714i;
        if (i1Var != null) {
            return i1Var;
        }
        kotlin.jvm.internal.o.o("startRecognizeBtn");
        throw null;
    }

    public final void r() {
        if (q().getVisibility() == 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "hideFloatingButton, already hide");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "hideFloatingButton");
        q().setVisibility(8);
        this.f303711f = false;
    }

    public final void s() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "hideRecognizingPanel: clearing text");
        k23.x xVar = this.f303715j;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("recognizingPanel");
            throw null;
        }
        if (this.f303706a.isFinishing()) {
            xVar.c();
            return;
        }
        y50.m mVar = y50.m.f459460a;
        com.tencent.mm.ui.MMActivity mMActivity = this.f303706a;
        java.lang.Integer[] targetActivityBarColor = q().getTargetActivityBarColor();
        k23.x xVar2 = this.f303715j;
        if (xVar2 == null) {
            kotlin.jvm.internal.o.o("recognizingPanel");
            throw null;
        }
        y50.m.a(mVar, mMActivity, targetActivityBarColor, 150L, xVar2.getTargetActivityBarColor(), null, 16, null);
        xVar.e(new k23.o0(xVar));
    }

    public final void t(k23.d0 params) {
        k23.i1 j1Var;
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "init, parmags: " + params);
        this.f303707b = params;
        int ordinal = params.f303548e.ordinal();
        com.tencent.mm.ui.MMActivity mMActivity = this.f303706a;
        if (ordinal == 0) {
            k23.d0 d0Var = this.f303707b;
            if (d0Var == null) {
                kotlin.jvm.internal.o.o("params");
                throw null;
            }
            j1Var = new k23.j1(mMActivity, d0Var);
        } else if (ordinal == 3) {
            k23.d0 d0Var2 = this.f303707b;
            if (d0Var2 == null) {
                kotlin.jvm.internal.o.o("params");
                throw null;
            }
            j1Var = new k23.l2(mMActivity, d0Var2);
        } else if (ordinal != 4) {
            k23.d0 d0Var3 = this.f303707b;
            if (d0Var3 == null) {
                kotlin.jvm.internal.o.o("params");
                throw null;
            }
            j1Var = new k23.k2(mMActivity, d0Var3);
        } else {
            k23.d0 d0Var4 = this.f303707b;
            if (d0Var4 == null) {
                kotlin.jvm.internal.o.o("params");
                throw null;
            }
            j1Var = new k23.j2(mMActivity, d0Var4);
        }
        this.f303714i = j1Var;
        if (q().getParent() != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hitest addStartRecognizeBtnInContainerIfNeeded: already has parent=");
            android.view.ViewParent parent = q().getParent();
            sb6.append(parent != null ? parent.getClass().getSimpleName() : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb6.toString());
        } else {
            k23.d0 d0Var5 = this.f303707b;
            if (d0Var5 == null) {
                kotlin.jvm.internal.o.o("params");
                throw null;
            }
            android.view.ViewGroup viewGroup = d0Var5.f303547d;
            if (viewGroup == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "hitest addStartRecognizeBtnInContainerIfNeeded: btnContainerView is null!");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "hitest addStartRecognizeBtnInContainerIfNeeded: container=" + viewGroup.getClass().getSimpleName() + ", containerId=" + viewGroup.getId() + ", containerChildCount=" + viewGroup.getChildCount());
                if (viewGroup instanceof android.widget.RelativeLayout) {
                    android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(14);
                    layoutParams = layoutParams2;
                } else if (viewGroup instanceof android.widget.FrameLayout) {
                    android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-1, -2);
                    layoutParams3.gravity = 81;
                    layoutParams = layoutParams3;
                } else {
                    layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
                }
                viewGroup.addView(q(), layoutParams);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("hitest addStartRecognizeBtnInContainerIfNeeded: added! containerChildCount=");
                sb7.append(viewGroup.getChildCount());
                sb7.append(", btnParent=");
                android.view.ViewParent parent2 = q().getParent();
                sb7.append(parent2 != null ? parent2.getClass().getSimpleName() : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb7.toString());
            }
        }
        q().setListener(new k23.p0(this));
        k23.d0 d0Var6 = this.f303707b;
        if (d0Var6 == null) {
            kotlin.jvm.internal.o.o("params");
            throw null;
        }
        this.f303715j = new k23.x(d0Var6, mMActivity);
        boolean z17 = false;
        this.f303716k = j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigWebSearchVoiceOpus()) == 1 && j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceInputOpus()) == 1;
        if (j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigWebSearchVoiceILink()) == 1 && j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceInputIlink()) == 1) {
            z17 = true;
        }
        this.f303717l = z17;
    }

    public final void u(boolean z17) {
        this.f303726u = z17;
        if (this.f303723r) {
            k23.d0 d0Var = this.f303707b;
            if (d0Var == null) {
                kotlin.jvm.internal.o.o("params");
                throw null;
            }
            if (d0Var.f303548e != k23.w0.f303734d) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "onQueryStateChanged: queryEmpty=" + z17 + ", lastKeyboardHeight=" + this.f303727v);
            if (!z17) {
                G(false);
                return;
            }
            E();
            if (this.f303727v > 0) {
                F(0.8f);
                d(l() + A(this.f303727v));
            } else {
                F(0.6f);
                d(j());
            }
        }
    }

    public final void v() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "onViewDisappear");
        this.f303718m = false;
        k23.g0 g0Var = this.f303719n;
        if (g0Var != null) {
            g0Var.f303575b = true;
        }
        this.f303730y.d();
        x(this, 7, "{\"errorCode\":-5;\"errMsg\":\"interrupted\";\"voiceId\":\"" + this.f303710e + "\"}", null, 4, null);
        g("resign active", -5);
        s();
        z();
    }

    public final void w(int i17, java.lang.String extInfo, java.lang.String query) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        kotlin.jvm.internal.o.g(query, "query");
        com.tencent.mm.ui.MMActivity mMActivity = this.f303706a;
        com.tencent.mm.plugin.fts.ui.FTSMainUI fTSMainUI = mMActivity instanceof com.tencent.mm.plugin.fts.ui.FTSMainUI ? (com.tencent.mm.plugin.fts.ui.FTSMainUI) mMActivity : null;
        if (fTSMainUI == null) {
            su4.b1 b1Var = ((s50.l1) ((su4.c1) i95.n0.c(su4.c1.class))).f403087n;
            k23.g0 g0Var = this.f303719n;
            if (g0Var == null || (str = g0Var.f303574a) == null) {
                str = "";
            }
            com.tencent.mm.plugin.fts.ui.x2.g(i17, 3, 6, extInfo, query, str, b1Var.f412816a, b1Var.f412817b);
            return;
        }
        g23.k kVar = fTSMainUI.L1.f138153r;
        kotlin.jvm.internal.o.f(kVar, "getFtsSearchStaticsObj(...)");
        k23.g0 g0Var2 = this.f303719n;
        if (g0Var2 == null || (str2 = g0Var2.f303574a) == null) {
            str2 = "";
        }
        com.tencent.mm.plugin.fts.ui.x2.g(i17, 3, 6, extInfo, query, str2, o13.p.f342250c, kVar.B);
        su4.c1 c1Var = (su4.c1) i95.n0.c(su4.c1.class);
        long j17 = o13.p.f342250c;
        long j18 = kVar.B;
        su4.b1 b1Var2 = ((s50.l1) c1Var).f403087n;
        b1Var2.f412816a = j17;
        b1Var2.f412817b = j18;
    }

    public final void y() {
        if (this.f303718m) {
            x(this, 7, "{\"errorCode\":-5;\"errMsg\":\"interrupted\";\"voiceId\":\"" + this.f303710e + "\"}", null, 4, null);
        }
    }

    public final void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "resetRecognizing");
        z21.e eVar = this.f303708c;
        if (eVar != null) {
            eVar.cancel(true);
        }
        this.f303708c = null;
        this.f303709d = "";
        this.f303710e = "";
        this.f303720o.removeMessages(101);
    }
}
