package yz2;

/* loaded from: classes14.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.view.FaceNumberLayout f468523d;

    public b(com.tencent.mm.plugin.flash.view.FaceNumberLayout faceNumberLayout) {
        this.f468523d = faceNumberLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerNumberView", "showNumberRunnable current index:%s", java.lang.Integer.valueOf(this.f468523d.f137269d));
        com.tencent.mm.plugin.flash.view.FaceNumberLayout faceNumberLayout = this.f468523d;
        if (faceNumberLayout.getChildAt(faceNumberLayout.f137269d) != null) {
            com.tencent.mm.plugin.flash.view.FaceNumberLayout faceNumberLayout2 = this.f468523d;
            com.tencent.mm.plugin.flash.view.FaceNumberView faceNumberView = (com.tencent.mm.plugin.flash.view.FaceNumberView) faceNumberLayout2.getChildAt(faceNumberLayout2.f137269d);
            faceNumberView.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerNumberView", "show");
            android.view.View view = faceNumberView.f137273d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/flash/view/FaceNumberView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/flash/view/FaceNumberView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            faceNumberView.f137274e.clearAnimation();
            android.view.animation.Animation animation = faceNumberView.f137275f;
            animation.setFillAfter(true);
            animation.setDuration(500L);
            faceNumberView.f137274e.startAnimation(animation);
            faceNumberView.f137274e.setVisibility(0);
            com.tencent.mm.plugin.flash.view.FaceNumberLayout faceNumberLayout3 = this.f468523d;
            int i17 = faceNumberLayout3.f137269d + 1;
            faceNumberLayout3.f137269d = i17;
            if (i17 <= faceNumberLayout3.f137270e) {
                faceNumberLayout3.f137271f = ((ku5.t0) ku5.t0.f312615d).E(this.f468523d.f137272g, com.tencent.mm.plugin.flash.view.FaceNumberLayout.f137268h);
            }
        }
    }
}
