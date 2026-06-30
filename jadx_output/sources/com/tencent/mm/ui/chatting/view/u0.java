package com.tencent.mm.ui.chatting.view;

/* loaded from: classes9.dex */
public final class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.c1 f203104d;

    public u0(com.tencent.mm.ui.chatting.view.c1 c1Var) {
        this.f203104d = c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/view/MMRemindDatePickerRemake$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.view.c1 c1Var = this.f203104d;
        android.content.Context context = c1Var.f202885a;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479695cu);
        android.view.ViewGroup viewGroup = c1Var.f202891g;
        int height = viewGroup != null ? viewGroup.getHeight() : context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479727dj);
        android.view.ViewGroup viewGroup2 = c1Var.f202891g;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        android.view.ViewGroup viewGroup3 = c1Var.f202893i;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(height, dimensionPixelSize);
        ofInt.setDuration(300L);
        ofInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new com.tencent.mm.ui.chatting.view.q0(c1Var));
        ofInt.addListener(new com.tencent.mm.ui.chatting.view.r0(c1Var));
        ofInt.start();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/view/MMRemindDatePickerRemake$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
