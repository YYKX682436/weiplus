package com.tencent.mm.plugin.flutter.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/flutter/ui/MegaVideoFlutterActivity;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public class MegaVideoFlutterActivity extends com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity {
    public static android.graphics.Bitmap B;
    public boolean A;

    /* renamed from: x, reason: collision with root package name */
    public boolean f137322x;

    /* renamed from: z, reason: collision with root package name */
    public z41.c f137324z;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f137319u = jz5.h.b(new w03.x(this));

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f137320v = jz5.h.b(new w03.z(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f137321w = jz5.h.b(new w03.y(this));

    /* renamed from: y, reason: collision with root package name */
    public z41.a f137323y = z41.a.NONE;

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity
    public boolean V6() {
        boolean h17 = ep1.m.h(((w03.u) pf5.z.f353948a.a(this).a(w03.u.class)).getActivity().getIntent());
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterActivity", "interceptEnterActivityStyle needEnterFloatBallAnimation " + h17);
        if (h17) {
            overridePendingTransition(-1, com.tencent.mm.ui.uc.f211079b);
            return true;
        }
        if (!((java.lang.Boolean) ((jz5.n) this.f137321w).getValue()).booleanValue()) {
            return this instanceof com.tencent.mm.plugin.wenote.flutter.WeNoteFlutterUI;
        }
        overridePendingTransition(-1, -1);
        return true;
    }

    public final void a7(boolean z17) {
        super.finish();
        if (z17) {
            overridePendingTransition(-1, -1);
        }
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(w03.u.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        w03.u uVar = (w03.u) a17;
        if (!uVar.f441913q && uVar.f441907h && uVar.f441908i && !kd2.p1.N.a().u()) {
            boolean z17 = this.f137322x;
            w03.u.S6(uVar, z17, z17, false, null, 12, null);
        } else {
            super.finish();
            if (((java.lang.Boolean) ((jz5.n) this.f137320v).getValue()).booleanValue()) {
                overridePendingTransition(-1, -1);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return getRequestedOrientation();
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.z.D0(new java.lang.Class[]{w03.u.class, w03.n.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.sb0.class, com.tencent.mm.plugin.finder.viewmodel.component.ny.class}));
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.Window window;
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterActivity", "onCreate");
        pf5.z zVar = pf5.z.f353948a;
        ((w03.n) zVar.a(this).a(w03.n.class)).P6("PlayerDetailF", hashCode());
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.ny.l7(nyVar, 162, 6, null, 4, null);
        }
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) this.f137319u).getValue()).booleanValue();
        z41.a aVar = z41.a.LANDSCAPE;
        if (booleanValue) {
            setRequestedOrientation(0);
        } else {
            setRequestedOrientation(getIntent().getIntExtra("from_page_orientation", 1));
            if (getRequestedOrientation() != 0) {
                aVar = z41.a.PORTRAIT;
            }
        }
        this.f137323y = aVar;
        if (this.f137324z == null) {
            this.f137324z = new z41.c(this, new w03.w(this));
        }
        z41.c cVar = this.f137324z;
        if (cVar != null) {
            cVar.enable();
        }
        try {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            if (!(context instanceof android.app.Activity)) {
                context = null;
            }
            if (context != null && (window = context.getWindow()) != null) {
                window.addFlags(128);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MegaVideoFlutterActivity", e17, "keepScreenOn", new java.lang.Object[0]);
        }
        android.graphics.Bitmap bitmap = B;
        jz5.g gVar = this.f137320v;
        if (bitmap != null) {
            if (((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue() && !bitmap.isRecycled()) {
                U6().setBackground(new android.graphics.drawable.BitmapDrawable(getResources(), bitmap));
            }
            B = null;
        }
        if (((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue()) {
            overridePendingTransition(-1, -1);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        fc2.d a76 = nyVar2 != null ? nyVar2.a7(-1) : null;
        com.tencent.mm.plugin.finder.report.c1 c1Var = a76 instanceof com.tencent.mm.plugin.finder.report.c1 ? (com.tencent.mm.plugin.finder.report.c1) a76 : null;
        if (c1Var == null) {
            return;
        }
        c1Var.f124976z = true;
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.view.Window window;
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterActivity", "onDestroy");
        try {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            if (!(context instanceof android.app.Activity)) {
                context = null;
            }
            if (context != null && (window = context.getWindow()) != null) {
                window.clearFlags(128);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MegaVideoFlutterActivity", e17, "releaseScreenOn", new java.lang.Object[0]);
        }
        ((a03.h0) ((n40.o) i95.n0.c(n40.o.class))).f427o = null;
        z41.c cVar = this.f137324z;
        if (cVar != null) {
            cVar.disable();
        }
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterActivity", "onPause");
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.o.g(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterActivity", "onRestoreInstanceState");
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterActivity", "onResume");
        super.onResume();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(outState, "outState");
        super.onSaveInstanceState(outState);
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterActivity", "onSaveInstanceState");
        this.A = true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).zj(this);
        super.onStart();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).yj(this);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean onSwipeBackFinish() {
        this.f137322x = true;
        return super.onSwipeBackFinish();
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, pi0.w0
    public void u3(pi0.w0 host) {
        kotlin.jvm.internal.o.g(host, "host");
        super.u3(host);
        if (this.A) {
            return;
        }
        finish();
    }
}
