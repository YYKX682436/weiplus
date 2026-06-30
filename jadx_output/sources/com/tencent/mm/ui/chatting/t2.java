package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public class t2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingAnimFrame f202690d;

    public t2(com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame) {
        this.f202690d = chattingAnimFrame;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingAnimFrame$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAnimFrame", "lucky bag click!!!");
        b12.k.f17060a.b(4, b12.k.f17067h, "");
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setFillAfter(false);
        alphaAnimation.setAnimationListener(new com.tencent.mm.ui.chatting.s2(this));
        this.f202690d.f198204u.startAnimation(alphaAnimation);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingAnimFrame$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
