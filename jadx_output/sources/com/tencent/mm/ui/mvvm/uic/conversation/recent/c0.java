package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 f209277d;

    public c0(com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 e0Var) {
        this.f209277d = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        em.j2 j2Var = this.f209277d.f209308n;
        if (j2Var != null) {
            if (j2Var.f254470g == null) {
                j2Var.f254470g = (android.widget.LinearLayout) j2Var.f254464a.findViewById(com.tencent.mm.R.id.gzk);
            }
            android.widget.LinearLayout linearLayout = j2Var.f254470g;
            kotlin.jvm.internal.o.f(linearLayout, "getHeaderViewRl(...)");
            if (linearLayout.getWidth() != 0) {
                if ((j2Var.a().getRight() > linearLayout.getWidth() - linearLayout.getPaddingEnd()) && j2Var.a().getOrientation() != 1 && j2Var.d().getVisibility() == 8) {
                    j2Var.a().setOrientation(1);
                    j2Var.a().setGravity(8388613);
                    android.widget.LinearLayout a17 = j2Var.a();
                    android.view.ViewGroup.LayoutParams layoutParams = j2Var.a().getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.height = -2;
                    a17.setLayoutParams(layoutParams2);
                    android.view.View c17 = j2Var.c();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/ui/mvvm/uic/conversation/recent/RecentConversationHeaderUIC", "adjustContentLayoutIfOverflow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(c17, "com/tencent/mm/ui/mvvm/uic/conversation/recent/RecentConversationHeaderUIC", "adjustContentLayoutIfOverflow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.ViewGroup.LayoutParams layoutParams3 = j2Var.b().getLayoutParams();
                    android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
                    if (layoutParams4 != null) {
                        layoutParams4.setMarginEnd(j2Var.e().getPaddingEnd());
                        j2Var.b().setLayoutParams(layoutParams4);
                    }
                    android.view.ViewGroup.LayoutParams layoutParams5 = j2Var.e().getLayoutParams();
                    android.widget.LinearLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams5 : null;
                    if (layoutParams6 != null) {
                        layoutParams6.height = -2;
                        layoutParams6.setMarginStart(0);
                        j2Var.e().setLayoutParams(layoutParams6);
                    }
                }
            }
        }
    }
}
