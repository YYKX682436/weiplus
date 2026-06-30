package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public android.animation.ValueAnimator f207459a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f207460b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.drawable.ColorDrawable f207461c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f207462d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f207463e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.conversation.x2 f207464f;

    public final void a(java.lang.String username, android.view.View view, com.tencent.mm.ui.conversation.x2 x2Var) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(view, "view");
        this.f207460b = username;
        this.f207462d = view;
        this.f207464f = x2Var;
        int color = view.getContext().getResources().getColor(com.tencent.mm.R.color.FG_3);
        int color2 = view.getContext().getResources().getColor((x2Var == null || !x2Var.a()) ? com.tencent.mm.R.color.f478491c : com.tencent.mm.R.color.f479316vw);
        if (com.tencent.mm.ui.bk.y()) {
            color2 = view.getContext().getResources().getColor((x2Var == null || !x2Var.a()) ? com.tencent.mm.R.color.f478859j5 : com.tencent.mm.R.color.f478835ik);
        }
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(com.tencent.mm.ui.uk.b(color, color2));
        this.f207461c = colorDrawable;
        view.setBackground(colorDrawable);
    }

    public final void b(int i17) {
        if (!((this.f207460b == null && this.f207462d == null) ? false : true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ConversationClickStatusController", "[requestDismissClickStatus] pass!");
            return;
        }
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
        t0Var.getClass();
        t0Var.z(new com.tencent.mm.ui.conversation.a3(this), i17, false);
    }

    public final void c(yf5.n holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.String str = this.f207460b;
        if (str != null && kotlin.jvm.internal.o.b(str, holder.f461926m) && (this.f207463e == null || this.f207462d == holder.f461930q)) {
            holder.f461930q.setBackground(this.f207461c);
            this.f207462d = holder.f461930q;
        } else if (holder.f461927n) {
            holder.f461930q.setBackgroundResource(com.tencent.mm.R.drawable.aj6);
        } else {
            holder.f461930q.setBackgroundResource(com.tencent.mm.R.drawable.f481329qp);
        }
    }
}
