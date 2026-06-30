package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class z2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.x2 f208290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.b3 f208291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f208292f;

    public z2(com.tencent.mm.ui.conversation.x2 x2Var, com.tencent.mm.ui.conversation.b3 b3Var, android.view.View view) {
        this.f208290d = x2Var;
        this.f208291e = b3Var;
        this.f208292f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.ui.conversation.b3 b3Var = this.f208291e;
        com.tencent.mm.ui.conversation.x2 x2Var = this.f208290d;
        if (x2Var != null) {
            b3Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ConversationClickStatusController", "[resetClickStatus]");
            this.f208292f.setBackgroundResource(x2Var.a() ? com.tencent.mm.R.drawable.aj6 : com.tencent.mm.R.drawable.f481329qp);
            b3Var.f207463e = null;
            b3Var.f207460b = null;
            b3Var.f207462d = null;
            b3Var.f207464f = null;
        }
        b3Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationClickStatusController", "[dismissClickStatus] setBackground back!");
    }
}
