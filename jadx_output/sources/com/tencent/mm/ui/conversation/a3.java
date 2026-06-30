package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.b3 f207431d;

    public a3(com.tencent.mm.ui.conversation.b3 b3Var) {
        this.f207431d = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.conversation.b3 b3Var = this.f207431d;
        com.tencent.mm.ui.conversation.x2 x2Var = b3Var.f207464f;
        if (!((b3Var.f207460b == null && b3Var.f207462d == null) ? false : true)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ConversationClickStatusController", "is not need dismissClickStatus");
            return;
        }
        android.animation.ValueAnimator valueAnimator = b3Var.f207459a;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ConversationClickStatusController", "[dismissClickStatus] animation is running! %s", b3Var.f207460b);
            return;
        }
        android.view.View view = b3Var.f207462d;
        if (view == null) {
            b3Var.f207460b = null;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationClickStatusController", "[dismissClickStatus] %s username:%s", java.lang.Integer.valueOf(view.hashCode()), b3Var.f207460b);
        int color = view.getContext().getResources().getColor(com.tencent.mm.R.color.FG_3);
        int color2 = view.getContext().getResources().getColor((x2Var == null || !x2Var.a()) ? com.tencent.mm.R.color.f478491c : com.tencent.mm.R.color.f479316vw);
        b3Var.f207461c = new android.graphics.drawable.ColorDrawable(com.tencent.mm.ui.uk.b(color, color2));
        jl1.a aVar = new jl1.a(com.tencent.mm.ui.uk.b(color, color2), color2);
        view.setBackgroundColor(com.tencent.mm.ui.uk.b(color, color2));
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("ratio", 0.0f, 1.0f));
        ofPropertyValuesHolder.addUpdateListener(new com.tencent.mm.ui.conversation.y2(aVar, view, b3Var));
        ofPropertyValuesHolder.addListener(new com.tencent.mm.ui.conversation.z2(x2Var, b3Var, view));
        ofPropertyValuesHolder.setDuration(60L);
        if (b3Var.f207461c != null) {
            b3Var.f207463e = b3Var.f207462d;
            ofPropertyValuesHolder.start();
            b3Var.f207459a = ofPropertyValuesHolder;
        }
    }
}
