package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class kp extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f204367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.lp f204369f;

    public kp(com.tencent.mm.ui.chatting.viewitems.lp lpVar, boolean z17, yb5.d dVar) {
        this.f204369f = lpVar;
        this.f204367d = z17;
        this.f204368e = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        yb5.d dVar = this.f204368e;
        com.tencent.mm.ui.chatting.viewitems.lp lpVar = this.f204369f;
        boolean z17 = this.f204367d;
        if (z17) {
            lpVar.B.setText(dVar.g().getString(com.tencent.mm.R.string.n7c));
        } else {
            lpVar.B.setText(dVar.g().getString(com.tencent.mm.R.string.n7d));
        }
        yd5.r.f461147a.c(z17 ^ true ? "chat_voice_message_speed_up" : "chat_voice_message_speed_reset", false, true);
    }
}
