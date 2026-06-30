package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class zf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.rf f200374d;

    public zf(com.tencent.mm.ui.chatting.component.rf rfVar) {
        this.f200374d = rfVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "show animation! GoBackToHistoryMsgLayout!!!");
        com.tencent.mm.ui.chatting.component.rf rfVar = this.f200374d;
        android.view.View view = rfVar.f199829e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rfVar.f199832h = 1;
        com.tencent.mm.ui.chatting.component.rf.m0(rfVar);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(rfVar.f199829e.getWidth(), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setInterpolator(android.view.animation.AnimationUtils.loadInterpolator(rfVar.f198580d.g(), android.R.anim.accelerate_interpolator));
        rfVar.f199829e.startAnimation(translateAnimation);
        if (((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) rfVar.f198580d.f460708c.a(sb5.g.class))).n0()) {
            try {
                com.tencent.wechat.aff.brand_service.a aVar = com.tencent.wechat.aff.brand_service.a.f216045b;
                com.tencent.wechat.mm.brand_service.y yVar = new com.tencent.wechat.mm.brand_service.y();
                com.tencent.wechat.mm.brand_service.x xVar = new com.tencent.wechat.mm.brand_service.x();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                xVar.f219214f = java.lang.System.currentTimeMillis();
                xVar.f219215g = com.tencent.wechat.mm.brand_service.w.Expose;
                xVar.f219212d = aVar.b();
                xVar.f219216h = "102_1";
                xVar.f219217i = "elevator";
                cl0.g gVar = new cl0.g();
                gVar.o("new_noti_count", rfVar.f199831g);
                xVar.f219222q = gVar.toString();
                yVar.f219254d = xVar;
                aVar.f(yVar);
            } catch (cl0.f e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.HistoryMsgTongueComponent", "json error: %s", e17);
            }
        }
    }
}
