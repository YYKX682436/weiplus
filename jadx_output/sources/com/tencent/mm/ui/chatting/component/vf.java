package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class vf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.rf f200128e;

    public vf(com.tencent.mm.ui.chatting.component.rf rfVar, java.lang.String str) {
        this.f200128e = rfVar;
        this.f200127d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "show animation! GoBackToHistoryMsgLayout2!!!");
        com.tencent.mm.ui.chatting.component.rf rfVar = this.f200128e;
        if (!rfVar.r0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "try showRedHintTongue2, but is empty");
            return;
        }
        android.view.View view = rfVar.f199829e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$11", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$11", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rfVar.f199832h = 1;
        com.tencent.mm.ui.chatting.component.rf.m0(rfVar);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(rfVar.f199829e.getWidth(), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setInterpolator(android.view.animation.AnimationUtils.loadInterpolator(rfVar.f198580d.g(), android.R.anim.accelerate_interpolator));
        translateAnimation.setAnimationListener(new com.tencent.mm.ui.chatting.component.uf(this));
        rfVar.f199829e.startAnimation(translateAnimation);
    }
}
