package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes9.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f0 f211992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f211993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j0 f211994f;

    public u(com.tencent.mm.ui.widget.dialog.j0 j0Var, com.tencent.mm.ui.widget.dialog.f0 f0Var, android.widget.ImageView imageView) {
        this.f211994f = j0Var;
        this.f211992d = f0Var;
        this.f211993e = imageView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.f0 f0Var = this.f211992d;
        if (f0Var != null) {
            f0Var.a(true);
        }
        android.widget.ImageView imageView = this.f211993e;
        boolean isSelected = imageView.isSelected();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f211994f;
        if (isSelected) {
            j0Var.C.startAnimation(j0Var.f211825J);
            j0Var.f211825J.setAnimationListener(new com.tencent.mm.ui.widget.dialog.m(this));
            android.animation.ObjectAnimator.ofFloat(imageView, "rotation", 180.0f, 0.0f).setDuration(200L).start();
            imageView.setSelected(false);
        } else {
            j0Var.C.startAnimation(j0Var.H);
            j0Var.H.setAnimationListener(new com.tencent.mm.ui.widget.dialog.n(this));
            android.animation.ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 180.0f).setDuration(200L).start();
            imageView.setSelected(true);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
