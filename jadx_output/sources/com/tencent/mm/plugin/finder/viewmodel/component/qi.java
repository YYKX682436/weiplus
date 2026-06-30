package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class qi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f135715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        super(0);
        this.f135715d = blVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup.LayoutParams layoutParams;
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f135715d;
        android.view.View inflate = com.tencent.mm.ui.id.b(blVar.getActivity()).inflate(com.tencent.mm.R.layout.ak9, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.eh9);
        if (textView != null) {
            int P6 = ((com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) pf5.u.f353936a.e(zy2.b6.class).a(com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM.class)).P6();
            java.lang.String string = blVar.getActivity().getString(com.tencent.mm.R.string.d0q);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            if (P6 > 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(string);
                sb6.append(" · ");
                sb6.append(P6 >= 18 ? blVar.getActivity().getString(com.tencent.mm.R.string.js9) : blVar.getActivity().getString(com.tencent.mm.R.string.js8, java.lang.Integer.valueOf(P6)));
                textView.setText(sb6.toString());
            } else if (P6 == 0) {
                textView.setText(string + " · " + blVar.getActivity().getString(com.tencent.mm.R.string.js_));
            } else {
                textView.setText(string);
            }
            d92.f fVar = d92.f.f227470a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            textView.setTextSize(1, fVar.d(context, 14.0f, false));
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            textView.setMaxWidth((int) fVar.d(context2, blVar.getActivity().getResources().getDimension(com.tencent.mm.R.dimen.f479686cl), false));
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) blVar.findViewById(com.tencent.mm.R.id.e5c);
        if (frameLayout != null) {
            android.view.View findViewById = blVar.findViewById(com.tencent.mm.R.id.e5b);
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, (findViewById == null || (layoutParams = findViewById.getLayoutParams()) == null) ? -1 : layoutParams.height - com.tencent.mm.ui.bl.h(blVar.getActivity()));
            layoutParams2.gravity = 8388693;
            android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            float dimension = blVar.getActivity().getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
            java.lang.Object systemService = context3.getSystemService("window");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            layoutParams2.setMarginEnd((int) ((dimension * displayMetrics.density) / context3.getResources().getDisplayMetrics().density));
            frameLayout.addView(inflate, layoutParams2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            float f17 = 0.0f;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showTeenModeAnimLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            inflate.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showTeenModeAnimLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (!n3.x0.c(inflate) || inflate.isLayoutRequested()) {
                inflate.addOnLayoutChangeListener(new com.tencent.mm.plugin.finder.viewmodel.component.yk(blVar, inflate, frameLayout));
            } else {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) blVar.findViewById(com.tencent.mm.R.id.nzl);
                if (weImageView != null) {
                    weImageView.setIconColor(-1);
                }
                android.view.View findViewById2 = blVar.findViewById(com.tencent.mm.R.id.nzm);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Float.valueOf(0.5f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showTeenModeAnimLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    findViewById2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showTeenModeAnimLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    findViewById2.animate().translationX(-(inflate.getWidth() + blVar.getActivity().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl))).alpha(0.8f).setDuration(250L).start();
                }
                android.view.View findViewById3 = blVar.findViewById(com.tencent.mm.R.id.nfb);
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showTeenModeAnimLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    findViewById3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "showTeenModeAnimLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView finderEdgeTransparentView = (com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView) blVar.findViewById(com.tencent.mm.R.id.nuq);
                if (finderEdgeTransparentView != null) {
                    finderEdgeTransparentView.setEnable(true);
                    f17 = finderEdgeTransparentView.getWidth() - ((finderEdgeTransparentView.getX() - inflate.getX()) - blVar.getActivity().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479723df));
                }
                inflate.animate().alpha(1.0f).setDuration(250L).setUpdateListener(new com.tencent.mm.plugin.finder.viewmodel.component.vk(blVar, f17)).setListener(new com.tencent.mm.plugin.finder.viewmodel.component.xk(inflate, blVar, frameLayout)).start();
            }
        }
        return jz5.f0.f302826a;
    }
}
