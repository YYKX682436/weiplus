package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.a0 f137191d;

    public y(com.tencent.mm.plugin.flash.action.a0 a0Var) {
        this.f137191d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.flash.action.a0 a0Var = this.f137191d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) a0Var.f137115e.f137072n.getLayoutParams();
        layoutParams.topMargin = (int) (a0Var.f137115e.f137066e.getCircleY() - (a0Var.f137115e.f137072n.getWidth() / 2));
        a0Var.f137115e.f137072n.setLayoutParams(layoutParams);
        a0Var.f137115e.f137072n.setVisibility(0);
        android.view.View view = a0Var.f137115e.f137074p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/flash/action/FaceFlashActionPreviewLayout$8$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/flash/action/FaceFlashActionPreviewLayout$8$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
