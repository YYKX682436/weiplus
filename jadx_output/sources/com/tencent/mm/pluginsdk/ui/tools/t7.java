package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes3.dex */
public class t7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f191926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.u7 f191927e;

    public t7(com.tencent.mm.pluginsdk.ui.tools.u7 u7Var, android.view.View view) {
        this.f191927e = u7Var;
        this.f191926d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f191926d;
        int height = (view.getResources().getDisplayMetrics().heightPixels - view.getHeight()) >>> 1;
        com.tencent.mm.pluginsdk.ui.tools.u7 u7Var = this.f191927e;
        int height2 = (int) ((height / 1.618d) - (u7Var.f191945d.getHeight() >>> 1));
        if (height2 >= 0) {
            if (com.tencent.mm.pluginsdk.ui.tools.v7.f191957a < 0) {
                com.tencent.mm.pluginsdk.ui.tools.v7.f191957a = com.tencent.mm.sdk.platformtools.j.d(view.getContext(), 20.0f);
            }
            if (u7Var.f191945d.getHeight() + height2 + com.tencent.mm.pluginsdk.ui.tools.v7.f191957a > height) {
                height2 -= ((u7Var.f191945d.getHeight() + height2) + com.tencent.mm.pluginsdk.ui.tools.v7.f191957a) - height;
            }
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) u7Var.f191945d.getLayoutParams();
            if (height2 <= 0 || height2 == layoutParams.bottomMargin) {
                return;
            }
            com.tencent.mars.xlog.Log.i("VideoSightHelper", "setting tip marginBottom " + height2);
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, height2);
            u7Var.f191945d.setLayoutParams(layoutParams);
        }
    }
}
