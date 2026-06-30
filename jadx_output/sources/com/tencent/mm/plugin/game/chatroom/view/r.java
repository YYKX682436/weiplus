package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.t f139273d;

    public r(com.tencent.mm.plugin.game.chatroom.view.t tVar) {
        this.f139273d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.chatroom.view.t tVar = this.f139273d;
        com.tencent.mm.plugin.game.chatroom.view.u uVar = tVar.f139296s;
        android.widget.TextView textView = tVar.f139290m;
        java.lang.String str = tVar.f139293p.username;
        uVar.getClass();
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setIntValues(textView.getWidth(), 0);
        valueAnimator.addUpdateListener(new com.tencent.mm.plugin.game.chatroom.view.p(uVar, textView));
        valueAnimator.setDuration(350L);
        valueAnimator.addListener(new com.tencent.mm.plugin.game.chatroom.view.q(uVar, textView, str));
        valueAnimator.start();
        if (tVar.f139290m.getTag() instanceof com.tencent.mm.plugin.game.chatroom.view.w) {
            com.tencent.mm.plugin.game.chatroom.view.w wVar = (com.tencent.mm.plugin.game.chatroom.view.w) tVar.f139290m.getTag();
            java.lang.String str2 = wVar.f139325a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.equals(tVar.f139293p.username)) {
                wVar.f139327c = valueAnimator;
                tVar.f139290m.setTag(wVar);
            }
        }
    }
}
