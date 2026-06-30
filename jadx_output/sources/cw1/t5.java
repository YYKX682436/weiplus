package cw1;

/* loaded from: classes12.dex */
public final class t5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f223336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog f223337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f223338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f223339g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Animation f223340h;

    public t5(android.view.View view, com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.view.View view2, android.view.animation.Animation animation) {
        this.f223336d = view;
        this.f223337e = cleanFilterDialog;
        this.f223338f = weImageView;
        this.f223339g = view2;
        this.f223340h = animation;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.widget.TextView textView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View filterPanel = this.f223336d;
        int visibility = filterPanel.getVisibility();
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog = this.f223337e;
        if (visibility == 0) {
            kotlin.jvm.internal.o.f(filterPanel, "$sortPanel");
            textView = cleanFilterDialog.f95763g;
            if (textView == null) {
                kotlin.jvm.internal.o.o("sortText");
                throw null;
            }
            android.view.ViewPropertyAnimator animate = this.f223338f.animate();
            animate.cancel();
            animate.rotation(0.0f);
            animate.setDuration(200L);
            animate.start();
        } else {
            filterPanel = this.f223339g;
            if (filterPanel.getVisibility() != 0) {
                yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            kotlin.jvm.internal.o.f(filterPanel, "$filterPanel");
            textView = cleanFilterDialog.f95764h;
            if (textView == null) {
                kotlin.jvm.internal.o.o("filterText");
                throw null;
            }
            if (cleanFilterDialog.f95767n) {
                cw1.r5 onFilterChangeListener = cleanFilterDialog.getOnFilterChangeListener();
                if (onFilterChangeListener != null) {
                    ((cw1.w2$$u) onFilterChangeListener).a(cleanFilterDialog.f95768o, cleanFilterDialog.f95769p);
                }
                cleanFilterDialog.f95767n = false;
            }
        }
        cw1.s5 s5Var = new cw1.s5(filterPanel);
        android.view.animation.Animation animation = this.f223340h;
        animation.setAnimationListener(s5Var);
        filterPanel.startAnimation(animation);
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog.a(cleanFilterDialog, textView, false);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
