package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes4.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149368d;

    public m2(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149368d = sightCaptureUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149368d;
        android.view.View view = sightCaptureUI.f149243s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        sightCaptureUI.f149241q.setBackgroundResource(com.tencent.mm.R.drawable.apb);
        sightCaptureUI.f149241q.setImageResource(com.tencent.mm.R.raw.mmsight_camera_preview_icon_done);
        sightCaptureUI.f149241q.setEnabled(true);
    }
}
