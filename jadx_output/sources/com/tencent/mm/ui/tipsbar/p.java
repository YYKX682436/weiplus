package com.tencent.mm.ui.tipsbar;

/* loaded from: classes3.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tipsbar.ChatTipsBarGroup f209948d;

    public p(com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup) {
        this.f209948d = chatTipsBarGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/ChatTipsBarGroup$selfClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.tipsbar.ChatTipsBarGroup tipsBarList = this.f209948d;
        if (tipsBarList.f209912n || tipsBarList.f209913o) {
            yj0.a.h(this, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup$selfClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int ordinal = tipsBarList.f209914p.f209925a.ordinal();
        if (ordinal == 0) {
            android.widget.RelativeLayout relativeLayout = tipsBarList.f209906e;
            int height = relativeLayout.getHeight();
            tipsBarList.c();
            relativeLayout.setClipToOutline(true);
            android.view.View view2 = tipsBarList.f209910i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "animToExpandMode", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "animToExpandMode", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            tipsBarList.f209913o = true;
            android.view.ViewPropertyAnimator alpha = tipsBarList.f209910i.animate().alpha(1.0f);
            alpha.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            alpha.setDuration(250L);
            alpha.start();
            alpha.setUpdateListener(new com.tencent.mm.ui.tipsbar.g(tipsBarList, height));
            alpha.setListener(new com.tencent.mm.ui.tipsbar.h(tipsBarList, alpha));
            kotlin.jvm.internal.o.g(tipsBarList, "tipsBarList");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("group_msg_set_top_list_open", tipsBarList, null, 26356);
        } else if (ordinal == 1) {
            int height2 = tipsBarList.f209906e.getHeight();
            tipsBarList.d();
            android.view.View view3 = tipsBarList.f209910i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "animToFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "animToFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = tipsBarList.f209911m;
            android.view.ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = height2;
                view4.setLayoutParams(layoutParams);
            }
            tipsBarList.f209912n = true;
            tipsBarList.f209910i.post(new com.tencent.mm.ui.tipsbar.l(tipsBarList, height2));
            kotlin.jvm.internal.o.g(tipsBarList, "tipsBarList");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("group_msg_set_top_list_close", tipsBarList, null, 26356);
        }
        yj0.a.h(this, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup$selfClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
