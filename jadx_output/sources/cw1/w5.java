package cw1;

/* loaded from: classes5.dex */
public final class w5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f223477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog f223478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Animation f223479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Animation f223480g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f223481h;

    public w5(android.view.View view, com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog, android.view.animation.Animation animation, android.view.animation.Animation animation2, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f223477d = view;
        this.f223478e = cleanFilterDialog;
        this.f223479f = animation;
        this.f223480g = animation2;
        this.f223481h = weImageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f223477d;
        boolean z17 = view2.getVisibility() == 0;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog = this.f223478e;
        android.view.View view3 = cleanFilterDialog.f95762f;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("background");
            throw null;
        }
        view3.callOnClick();
        if (!z17) {
            android.view.View view4 = cleanFilterDialog.f95762f;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("background");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f223477d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = cleanFilterDialog.f95763g;
            if (textView == null) {
                kotlin.jvm.internal.o.o("sortText");
                throw null;
            }
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog.a(cleanFilterDialog, textView, true);
            android.view.View view6 = cleanFilterDialog.f95762f;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("background");
                throw null;
            }
            view6.startAnimation(this.f223479f);
            view2.startAnimation(this.f223480g);
            android.view.ViewPropertyAnimator animate = this.f223481h.animate();
            animate.cancel();
            animate.rotation(180.0f);
            animate.setDuration(200L);
            animate.start();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
