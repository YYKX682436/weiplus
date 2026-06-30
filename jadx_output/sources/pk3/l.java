package pk3;

/* loaded from: classes8.dex */
public final class l implements jk3.f {

    /* renamed from: d, reason: collision with root package name */
    public pk3.e f356458d;

    /* renamed from: e, reason: collision with root package name */
    public ak3.c f356459e;

    @Override // kk3.c
    public void f(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, qn5.a aVar) {
        if (kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            l(multiTaskInfo, aVar);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new pk3.k(this, multiTaskInfo, aVar));
        }
    }

    public final void k() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pk3.e eVar = new pk3.e(context);
        this.f356458d = eVar;
        ak3.c cVar = this.f356459e;
        android.view.ViewGroup a17 = cVar != null ? cVar.a() : null;
        com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView = eVar.f356441a;
        if (multiTaskFloatBallView != null) {
            multiTaskFloatBallView.setVisibility(8);
        }
        eVar.f356442b = a17;
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FloatBallContainer", "attachFloatBallViewToWindow, window manager is null");
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = 0 - com.tencent.mm.plugin.multitask.q0.f150485b;
        int i17 = com.tencent.mm.plugin.multitask.q0.f150494k;
        int i18 = com.tencent.mm.plugin.multitask.q0.f150486c;
        marginLayoutParams.topMargin = i17 - i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "attachFloatBallViewToWindow success, topMargin:" + marginLayoutParams.topMargin);
        int i19 = marginLayoutParams.topMargin;
        if (i19 > 0) {
            marginLayoutParams.topMargin = i19 - i18;
        }
        com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView2 = eVar.f356441a;
        if (multiTaskFloatBallView2 != null) {
            multiTaskFloatBallView2.setLayoutParams(marginLayoutParams);
        }
        try {
            a17.addView(eVar.f356441a, a17.getChildCount());
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "attachFloatBallViewToWindow success");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallContainer", e17, "attachFloatBallViewToWindow fail", new java.lang.Object[0]);
        }
    }

    public final void l(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, qn5.a aVar) {
        try {
            if (multiTaskInfo != null) {
                if (this.f356458d != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskUIManager", "float ball already created");
                    m(multiTaskInfo, aVar);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskUIManager", "float ball did not create");
                    k();
                    m(multiTaskInfo, aVar);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskUIManager", "empty ball info list");
                com.tencent.mm.sdk.platformtools.u3.h(new pk3.i(this));
                if (aVar != null) {
                    aVar.a(null);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTaskUIManager", "doOnFloatBallInfoChanged exp:%s", e17);
            if (aVar != null) {
                aVar.a(null);
            }
        }
    }

    public final void m(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, qn5.a aVar) {
        pk3.e eVar = this.f356458d;
        if (!(eVar != null) || eVar == null) {
            return;
        }
        if (multiTaskInfo != null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView = eVar.f356441a;
            objArr[0] = multiTaskFloatBallView != null ? java.lang.Boolean.valueOf(multiTaskFloatBallView.f150522u) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, show FloatBallView %b", objArr);
            com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView2 = eVar.f356441a;
            if (multiTaskFloatBallView2 != null && !multiTaskFloatBallView2.f150522u) {
                multiTaskFloatBallView2.getVisibility();
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "show without animation");
                multiTaskFloatBallView2.setVisibility(0);
            }
        } else {
            com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView3 = eVar.f356441a;
            if (multiTaskFloatBallView3 != null && multiTaskFloatBallView3.getVisibility() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, hide FloatBallView");
                com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView4 = eVar.f356441a;
                if (multiTaskFloatBallView4 != null) {
                    multiTaskFloatBallView4.l(false, false, aVar);
                }
            }
        }
        com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView5 = eVar.f356441a;
        if (multiTaskFloatBallView5 != null) {
            multiTaskFloatBallView5.f(multiTaskInfo, aVar);
        }
    }
}
