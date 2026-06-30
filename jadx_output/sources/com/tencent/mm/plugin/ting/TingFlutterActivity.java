package com.tencent.mm.plugin.ting;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/ting/TingFlutterActivity;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "Lal4/a;", "<init>", "()V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class TingFlutterActivity extends com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity implements al4.a {
    public static boolean A = false;

    /* renamed from: z, reason: collision with root package name */
    public static int f174619z = -1;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f174620u = "MicroMsg.TingFlutterActivity#" + hashCode();

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f174621v = jz5.h.b(new rk4.e5(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f174622w = jz5.h.b(new rk4.c5(this));

    /* renamed from: x, reason: collision with root package name */
    public boolean f174623x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f174624y;

    public static final void a7(com.tencent.mm.plugin.ting.TingFlutterActivity tingFlutterActivity, boolean z17) {
        tingFlutterActivity.getClass();
        rk4.k5.c("finishUI withFloatBallAnimation: " + z17, tingFlutterActivity.getB());
        super.finish();
        if (z17) {
            tingFlutterActivity.overridePendingTransition(-1, -1);
        }
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity
    public boolean V6() {
        boolean h17 = ep1.m.h(getIntent());
        com.tencent.mars.xlog.Log.i(getB(), "interceptEnterActivityStyle needEnterFloatBallAnimation " + h17);
        if (!h17) {
            return this instanceof com.tencent.mm.plugin.wenote.flutter.WeNoteFlutterUI;
        }
        overridePendingTransition(-1, com.tencent.mm.ui.uc.f211079b);
        return true;
    }

    /* renamed from: b7, reason: from getter */
    public java.lang.String getB() {
        return this.f174620u;
    }

    public java.lang.Object c7(kotlin.coroutines.Continuation continuation) {
        ((com.tencent.mm.plugin.ting.uic.p0) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.ting.uic.p0.class)).f174816s = true;
        return jz5.f0.f302826a;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return f174619z;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.ting.uic.e0.class, com.tencent.mm.plugin.ting.uic.p0.class, lm4.i0.class, com.tencent.mm.plugin.ting.uic.j0.class}));
        }
        return null;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onBusinessPermissionDenied(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(getB(), "onBusinessPermissionDenied permission: " + str);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onBusinessPermissionGranted(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(getB(), "onBusinessPermissionGranted permission: " + str);
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        rk4.k5.c("onCreate", getB());
        super.onCreate(bundle);
        rk4.k8 k8Var = (rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        rk4.k5.e("cancelDelayTerminal", "MicroMsg.TingRouter");
        ((if0.k) ((jz5.n) k8Var.f396805q).getValue()).b();
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.ting.uic.e0) zVar.a(this).a(com.tencent.mm.plugin.ting.uic.e0.class)).G((rk4.b5) ((jz5.n) this.f174622w).getValue());
        ((com.tencent.mm.plugin.ting.uic.e0) zVar.a(this).a(com.tencent.mm.plugin.ting.uic.e0.class)).r0((rk4.d5) ((jz5.n) this.f174621v).getValue());
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.TingFlutterActivity);
        aVar.Rj(this, iy1.a.Ting);
        aVar.Tj(this, 40, 5, false);
        boolean booleanExtra = getIntent().getBooleanExtra("up_down_animation", false);
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
        if (swipeBackLayout != null) {
            swipeBackLayout.setVerticalSwipe(booleanExtra);
        }
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        rk4.k5.c("onDestroy", getB());
        A = false;
        super.onDestroy();
        java.lang.String stringExtra = getIntent().getStringExtra("session_id");
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        if (stringExtra == null) {
            stringExtra = "";
        }
        rk4.k8 k8Var = (rk4.k8) aj6;
        rk4.k5.e("delayTerminal, sessionId: ".concat(stringExtra), "MicroMsg.TingRouter");
        if (kotlin.jvm.internal.o.b(stringExtra, k8Var.f396796e)) {
            if (((ov.b) ((pv.z) i95.n0.c(pv.z.class))).Ai() == null) {
                rk4.k8.f396793w = java.lang.System.currentTimeMillis();
                rk4.k5.e("delayTerminal with empty status destroyWithEmptyStatusTime=" + rk4.k8.f396793w, "MicroMsg.TingRouter");
            }
            rk4.k5.e("clearAppSessionId", "MicroMsg.TingRouter");
            k8Var.f396797f = bw5.ar0.TingScene_UnDefined;
            k8Var.f396796e = "";
            b66.x Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
            if (Zi != null) {
                java.lang.String sessionId = k8Var.f396796e;
                bw5.ar0 enterScene = k8Var.f396797f;
                kotlin.jvm.internal.o.g(sessionId, "sessionId");
                kotlin.jvm.internal.o.g(enterScene, "enterScene");
                urgen.ur_2BA9.UR_5769.UR_5DD9(((b66.y) Zi).getCppPointer(), sessionId, enterScene.f25422d);
            }
            ((if0.k) ((jz5.n) k8Var.f396805q).getValue()).c();
        } else {
            rk4.k5.e("delayTerminal, sessionId not match, return", "MicroMsg.TingRouter");
        }
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.ting.uic.e0) zVar.a(this).a(com.tencent.mm.plugin.ting.uic.e0.class)).g0((rk4.b5) ((jz5.n) this.f174622w).getValue());
        ((com.tencent.mm.plugin.ting.uic.e0) zVar.a(this).a(com.tencent.mm.plugin.ting.uic.e0.class)).O5((rk4.d5) ((jz5.n) this.f174621v).getValue());
        f174619z = -1;
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        rk4.k5.c("onPause", getB());
        A = false;
        super.onPause();
        rk4.u6 u6Var = rk4.k8.f396788r;
        if (kotlin.jvm.internal.o.b(rk4.k8.f396790t, this)) {
            rk4.k8.f396790t = null;
        }
        W6();
        this.f174623x = true;
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        rk4.k5.c("onResume", getB());
        super.onResume();
        A = true;
        rk4.u6 u6Var = rk4.k8.f396788r;
        rk4.k8.f396790t = this;
        il4.l lVar = il4.l.f292142a;
        ((ku5.t0) ku5.t0.f312615d).g(il4.i.f292138d);
        if (ep1.m.h(getIntent()) && (swipeBackLayout = getSwipeBackLayout()) != null) {
            swipeBackLayout.setNeedRequestActivityTranslucent(false);
            swipeBackLayout.d(true);
        }
        if (this.f174623x) {
            Y6();
            this.f174623x = false;
        }
        if (android.os.Build.VERSION.SDK_INT < 29 || !com.tencent.mm.ui.b4.c(this)) {
            return;
        }
        getWindow().setNavigationBarContrastEnforced(false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(outState, "outState");
        super.onSaveInstanceState(outState);
        rk4.k5.c("onSaveInstanceState", getB());
        this.f174624y = true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        rk4.k5.c("onStop", getB());
        A = false;
        super.onStop();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, pi0.o0
    public void pop() {
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new rk4.f5(this, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, pi0.w0
    public void u3(pi0.w0 host) {
        kotlin.jvm.internal.o.g(host, "host");
        super.u3(host);
        if (this.f174624y) {
            return;
        }
        finish();
    }
}
