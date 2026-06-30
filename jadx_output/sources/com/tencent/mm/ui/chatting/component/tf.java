package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class tf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f199995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msg.MsgIdTalker f199996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.rf f199997f;

    public tf(com.tencent.mm.ui.chatting.component.rf rfVar, boolean z17, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        this.f199997f = rfVar;
        this.f199995d = z17;
        this.f199996e = msgIdTalker;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "show animation! GoBackToHistoryMsgLayout!!!");
        com.tencent.mm.ui.chatting.component.rf rfVar = this.f199997f;
        android.view.View view = rfVar.f199829e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$10", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$10", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rfVar.f199832h = 1;
        rfVar.I0(5, true);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(rfVar.f199829e.getWidth(), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setInterpolator(android.view.animation.AnimationUtils.loadInterpolator(rfVar.f198580d.g(), android.R.anim.accelerate_interpolator));
        translateAnimation.setAnimationListener(new com.tencent.mm.ui.chatting.component.sf(this));
        rfVar.f199829e.startAnimation(translateAnimation);
    }
}
