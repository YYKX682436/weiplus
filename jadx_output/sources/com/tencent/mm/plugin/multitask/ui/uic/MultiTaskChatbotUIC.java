package com.tencent.mm.plugin.multitask.ui.uic;

/* loaded from: classes11.dex */
public class MultiTaskChatbotUIC extends com.tencent.mm.ui.component.UIComponent implements rk3.b {

    /* renamed from: d, reason: collision with root package name */
    public int f150583d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f150584e;

    /* renamed from: f, reason: collision with root package name */
    public pi0.l1 f150585f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.y f150586g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.b0 f150587h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitask.ui.uic.MultiTaskChatbotUIC$homeTabChangedListener$1 f150588i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.multitask.ui.uic.MultiTaskChatbotUIC$homeTabChangedListener$1] */
    public MultiTaskChatbotUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        if ((4095 & 1) != 0) {
            i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        if ((4095 & 2) != 0) {
            int i17 = rk3.e.P;
            int i18 = rk3.e.P;
        }
        if ((4095 & 64) != 0) {
            int i19 = rk3.e.P;
            int i27 = rk3.e.P;
        }
        this.f150584e = kotlinx.coroutines.z0.b();
        zk3.g gVar = new zk3.g(this);
        this.f150586g = gVar;
        this.f150587h = new androidx.lifecycle.b0(gVar, true);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f150588i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HomeUITabChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.multitask.ui.uic.MultiTaskChatbotUIC$homeTabChangedListener$1
            {
                this.__eventId = -1095690568;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.HomeUITabChangeEvent homeUITabChangeEvent) {
                com.tencent.mm.autogen.events.HomeUITabChangeEvent event = homeUITabChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.nh nhVar = event.f54438g;
                if (nhVar != null) {
                    int i28 = nhVar.f7425a;
                    com.tencent.mm.plugin.multitask.ui.uic.MultiTaskChatbotUIC multiTaskChatbotUIC = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskChatbotUIC.this;
                    multiTaskChatbotUIC.getClass();
                    multiTaskChatbotUIC.O6(i28 == 0);
                }
                return false;
            }
        };
    }

    @Override // rk3.b
    public void E1(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onPanelSizeChanged, width: " + i17 + ", height: " + i18);
    }

    @Override // rk3.b
    public void E3() {
    }

    @Override // rk3.b
    public void H() {
    }

    @Override // rk3.b
    public void J5(android.view.View view, float f17) {
    }

    public final void O6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "enableSlide: " + z17);
    }

    @Override // rk3.b
    public void P() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onActivityResult");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onBeforeFinish");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onConfigurationChanged, orientation: " + newConfig.orientation);
        if (newConfig.orientation == 2) {
            O6(false);
        } else {
            O6(true);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        alive();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onCreate");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onCreateBefore");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "UIC onCreate");
        if (this.f150585f == null) {
            this.f150585f = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "chatbot", null, false, null, 28, null);
            kotlinx.coroutines.l.d(this.f150584e, null, null, new zk3.f(currentTimeMillis, this, null), 3, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onDestroy");
        dead();
        kotlinx.coroutines.z0.e(this.f150584e, null, 1, null);
        this.f150587h.f(androidx.lifecycle.m.ON_DESTROY);
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
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onPause, isPanelExpanded: false");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onRequestPermissionsResult");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onRestoreInstanceState");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onResume, isPanelExpanded: false");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onSaveInstanceState");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onStart, isPanelExpanded: false");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onStartActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onStartActivityForResult");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onStop, isPanelExpanded: false");
    }

    @Override // rk3.b
    public void p(android.view.View view, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "onPanelItemSelected, position: " + i17);
    }

    @Override // rk3.b
    public boolean q0() {
        return false;
    }

    @Override // rk3.b
    public void t1(android.view.View view, rk3.c previousState, rk3.c newState) {
        kotlin.jvm.internal.o.g(previousState, "previousState");
        kotlin.jvm.internal.o.g(newState, "newState");
        previousState.toString();
        newState.toString();
        int ordinal = newState.ordinal();
        androidx.lifecycle.b0 b0Var = this.f150587h;
        if (ordinal == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "panelLifecycle ON_RESUME");
            b0Var.f(androidx.lifecycle.m.ON_RESUME);
            this.f150583d = getActivity().getWindow().getStatusBarColor();
            getActivity().getWindow().setStatusBarColor(0);
            return;
        }
        if (ordinal == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "panelLifecycle ON_STOP");
            b0Var.f(androidx.lifecycle.m.ON_STOP);
            getActivity().getWindow().setStatusBarColor(this.f150583d);
        } else {
            if (ordinal != 4) {
                return;
            }
            if (previousState == rk3.c.f396488d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "panelLifecycle ON_PAUSE");
                b0Var.f(androidx.lifecycle.m.ON_PAUSE);
            } else if (previousState == rk3.c.f396489e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFlutterChatbotUIC", "panelLifecycle ON_START");
                b0Var.f(androidx.lifecycle.m.ON_START);
            }
        }
    }

    @Override // rk3.b
    public void y0(float f17) {
    }
}
