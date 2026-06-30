package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class ar implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f111933d;

    public ar(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f111933d = etVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f111933d;
        android.view.View view = etVar.E;
        kotlin.jvm.internal.o.f(view, "access$getRoleView$p(...)");
        etVar.getClass();
        if (view.isShown()) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ROLE_CHANGE_TIPS_SHOWN_BOOLEAN_SYNC;
            if (c17.o(u3Var, false)) {
                android.view.View view2 = etVar.F;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin", "checkRoleTipsLocation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin", "checkRoleTipsLocation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
            android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i17 = b17.y;
            int i18 = b17.x;
            if (etVar.x0()) {
                i17 = i18;
            }
            int[] t17 = pm0.v.t(view);
            int i19 = t17[0];
            int i27 = t17[1];
            android.content.Context context = etVar.R;
            float dimension = (i17 - i27) - context.getResources().getDimension(com.tencent.mm.R.dimen.f479644bj);
            android.view.View view3 = etVar.F;
            view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), (int) dimension);
            float width = i19 + ((view.getWidth() / 2) - (context.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn) / 2));
            android.view.View view4 = etVar.G;
            android.view.ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = (int) width;
                view4.setLayoutParams(layoutParams2);
            }
            android.view.View view5 = etVar.F;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin", "checkRoleTipsLocation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin", "checkRoleTipsLocation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            etVar.H.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.hr(etVar));
            view3.setOnTouchListener(new com.tencent.mm.plugin.finder.live.plugin.ir(etVar));
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ((ml2.r0) c18).Cj(ml2.g5.C, null);
        }
    }
}
