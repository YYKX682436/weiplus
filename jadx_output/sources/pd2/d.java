package pd2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final pd2.d f353545a = new pd2.d();

    public final void a(android.view.View itemView, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, boolean z17, boolean z18) {
        int i17;
        int i18;
        com.tencent.mm.view.RingProgressView ringProgressView;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.l0c);
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.l1j);
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.orn);
        android.view.ViewParent parent = findViewById != null ? findViewById.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (findViewById == null) {
            i17 = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            i17 = 0;
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById2 == null) {
            i18 = i17;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            i18 = i17;
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(i18)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(i18)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (viewGroup != null) {
            viewGroup.setVisibility(i18);
        }
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(itemView.getContext().getResources().getColor(com.tencent.mm.R.color.f479042o7));
        }
        if (item.getFeedObject().isPostFailed()) {
            if (findViewById != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(i18)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.dpi) : null;
            if (textView != null) {
                textView.setTextSize(i18, i65.a.b(itemView.getContext(), 14));
            }
            if (item.getFeedObject().isPostFailedCanRetry()) {
                if (textView != null) {
                    textView.setText(com.tencent.mm.R.string.exi);
                    return;
                }
                return;
            } else {
                if (textView != null) {
                    textView.setText(com.tencent.mm.R.string.f491419d13);
                    return;
                }
                return;
            }
        }
        if (!item.getFeedObject().isPostFinish()) {
            if (findViewById2 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(i18)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById2 == null || (ringProgressView = (com.tencent.mm.view.RingProgressView) findViewById2.findViewById(com.tencent.mm.R.id.f486477lc4)) == null) {
                return;
            }
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(ringProgressView.getProgress(), item.getFeedObject().getPostInfo().getInteger(4));
            ofInt.addUpdateListener(new pd2.c(ringProgressView));
            android.animation.ValueAnimator duration = ofInt.setDuration(400L);
            if (duration != null) {
                duration.start();
                return;
            }
            return;
        }
        if (z17) {
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
            return;
        }
        if (findViewById3 != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList6.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList6.get(i18)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (com.tencent.mm.ui.bk.C() || z18) {
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(itemView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_0_5));
            }
        } else if (viewGroup != null) {
            viewGroup.setBackgroundColor(itemView.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
        }
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new pd2.b(itemView));
        }
    }
}
