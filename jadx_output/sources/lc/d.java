package lc;

/* loaded from: classes14.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.c f317794d;

    public d(lc.c cVar) {
        this.f317794d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.cloud.huiyan.entity.AuthUiConfig authUiConfig;
        lc.c cVar = this.f317794d;
        com.tencent.cloud.huiyan.view.LoadingFrontAnimatorView loadingFrontAnimatorView = cVar.f317792a.f317814o;
        if (loadingFrontAnimatorView != null) {
            loadingFrontAnimatorView.invalidate();
        }
        lc.g gVar = cVar.f317792a;
        gVar.getClass();
        mc.m mVar = mc.k.f325525a;
        int i17 = ic.d.f290281k;
        android.content.Context a17 = ic.c.f290280a.a();
        if (a17 != null && !mVar.f325528c) {
            mVar.f325528c = true;
            android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) a17.getApplicationContext().getSystemService("sensor");
            mVar.f325526a = sensorManager;
            if (sensorManager == null) {
                mc.p.f325531a.e("LightSensor", " 光线传感器不可用~");
            } else {
                android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(5);
                if (defaultSensor != null) {
                    mc.j jVar = new mc.j(mVar);
                    mVar.f325527b = jVar;
                    mVar.f325526a.registerListener(jVar, defaultSensor, 3);
                } else {
                    mc.p.f325531a.e("LightSensor", " 光线传感器不可用~");
                }
            }
        }
        lc.g$$k g__k = new lc.g$$k(gVar);
        if (mVar.f325527b != null) {
            mVar.f325529d = g__k;
        } else {
            mc.p.f325531a.e("LightSensor", "设备无光线传感器或者未调用start()方法");
        }
        android.app.Activity activity = gVar.getActivity();
        if (activity == null) {
            mc.p.f325531a.e("AuthingFragment", "can not get activity!");
        } else {
            try {
                gVar.f317816q = android.provider.Settings.System.getInt(activity.getContentResolver(), "screen_brightness");
            } catch (android.provider.Settings.SettingNotFoundException unused) {
                mc.p.f325531a.e("AuthingFragment", "can not get screen brightness");
            }
        }
        com.tencent.cloud.huiyan.view.LoadingFrontAnimatorView loadingFrontAnimatorView2 = cVar.f317792a.f317814o;
        if (loadingFrontAnimatorView2 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(loadingFrontAnimatorView2, arrayList.toArray(), "com/tencent/cloud/huiyan/fragments/c$a", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        loadingFrontAnimatorView2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(loadingFrontAnimatorView2, "com/tencent/cloud/huiyan/fragments/c$a", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.cloud.huiyan.entity.AuthUiConfig authUiConfig2 = cVar.f317792a.B;
        if (authUiConfig2 == null || !authUiConfig2.isHideFrontCircleViewOnCheck()) {
            cVar.f317792a.f317814o.setShowOutCircle(true);
        } else {
            cVar.f317792a.f317814o.setShowOutCircle(false);
        }
        lc.g gVar2 = cVar.f317792a;
        if (gVar2.f317811i == null || (authUiConfig = gVar2.B) == null || !authUiConfig.isShowCountdown()) {
            return;
        }
        android.widget.TextView textView = cVar.f317792a.f317811i;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(textView, arrayList2.toArray(), "com/tencent/cloud/huiyan/fragments/c$a", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/cloud/huiyan/fragments/c$a", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        cVar.f317792a.f317811i.setText((ic.c.f290280a.f290290i.getPrepareFaceTimeOutMs() / 1000) + cVar.f317792a.b().getString(com.tencent.mm.R.string.piw));
    }
}
