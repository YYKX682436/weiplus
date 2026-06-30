package mx0;

/* loaded from: classes.dex */
public final class w1 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f332409d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f332410e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f332411f;

    /* renamed from: g, reason: collision with root package name */
    public final mx0.z f332412g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f332413h;

    public w1(android.view.View moreTemplateBtn, android.view.View bottomShadow, android.view.View sideShadow, mx0.z controller) {
        kotlin.jvm.internal.o.g(moreTemplateBtn, "moreTemplateBtn");
        kotlin.jvm.internal.o.g(bottomShadow, "bottomShadow");
        kotlin.jvm.internal.o.g(sideShadow, "sideShadow");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f332409d = moreTemplateBtn;
        this.f332410e = bottomShadow;
        this.f332411f = sideShadow;
        this.f332412g = controller;
        this.f332413h = true;
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) moreTemplateBtn.findViewById(com.tencent.mm.R.id.f487256o14);
        mMRoundCornerImageView.setBackgroundColor(-16777216);
        mMRoundCornerImageView.setImageResource(com.tencent.mm.R.drawable.cpj);
        android.widget.TextView textView = (android.widget.TextView) moreTemplateBtn.findViewById(com.tencent.mm.R.id.o1a);
        textView.setText(i65.a.r(moreTemplateBtn.getContext(), com.tencent.mm.R.string.f493141ly0));
        com.tencent.mm.ui.fk.a(textView);
        moreTemplateBtn.setBackgroundColor(-16777216);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(moreTemplateBtn, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "<init>", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/IShootComposingController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        moreTemplateBtn.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(moreTemplateBtn, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "<init>", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/IShootComposingController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(bottomShadow, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "<init>", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/IShootComposingController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        bottomShadow.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(bottomShadow, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "<init>", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/IShootComposingController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(sideShadow, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "<init>", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/IShootComposingController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        sideShadow.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(sideShadow, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "<init>", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/IShootComposingController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        moreTemplateBtn.setOnClickListener(new mx0.s1(this));
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        if (this.f332413h && i17 != this.f332409d.getVisibility()) {
            if (i17 != 0) {
                sa5.d.d(this.f332409d, 0, 0L, new mx0.t1(this, i17), 3, null);
                sa5.d.d(this.f332410e, 0, 0L, new mx0.u1(this, i17), 3, null);
                sa5.d.d(this.f332411f, 0, 0L, new mx0.v1(this, i17), 3, null);
                return;
            }
            android.view.View view = this.f332409d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view2 = this.f332409d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            sa5.d.c(this.f332409d, 0.0f, 0L, null, 7, null);
            android.view.View view3 = this.f332410e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view4 = this.f332410e;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            sa5.d.c(this.f332410e, 0.0f, 0L, null, 7, null);
            android.view.View view5 = this.f332411f;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
            yj0.a.f(view5, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view6 = this.f332411f;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            sa5.d.c(this.f332411f, 0.0f, 0L, null, 7, null);
        }
    }
}
