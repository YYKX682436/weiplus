package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.bh f118226a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.cf f118227b;

    public e5(android.app.Activity activity, android.view.ViewGroup container, gk2.e eVar) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(container, "container");
        com.tencent.mm.plugin.finder.live.widget.bh bhVar = new com.tencent.mm.plugin.finder.live.widget.bh(activity);
        com.tencent.mm.plugin.finder.live.plugin.l basePlugin = bhVar.getBasePlugin();
        if (basePlugin != null) {
            bhVar.a(basePlugin);
        }
        this.f118226a = bhVar;
        com.tencent.mm.plugin.finder.live.widget.cf cfVar = new com.tencent.mm.plugin.finder.live.widget.cf(activity, eVar);
        cfVar.f118003J = new com.tencent.mm.plugin.finder.live.widget.d5(cfVar, this);
        this.f118227b = cfVar;
    }

    public final void a(int i17, boolean z17) {
        android.widget.EditText editText;
        com.tencent.mm.plugin.finder.live.widget.bh bhVar = this.f118226a;
        com.tencent.mm.plugin.finder.live.widget.ei eiVar = bhVar.M;
        if (eiVar != null && !z17) {
            eiVar.f118256o.clearFocus();
        }
        com.tencent.mm.plugin.finder.live.widget.ri riVar = bhVar.N;
        if (riVar != null) {
            com.tencent.mm.plugin.finder.live.widget.ei eiVar2 = riVar.f119644o;
            if (eiVar2 != null && !z17) {
                eiVar2.f118256o.clearFocus();
            }
            com.tencent.mm.plugin.finder.live.widget.xh xhVar = riVar.f119645p;
            if (xhVar != null) {
                android.view.View view = xhVar.f120330p;
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (i17 <= 0 || !z17) {
                    if (marginLayoutParams != null) {
                        marginLayoutParams.bottomMargin = 0;
                    }
                } else if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = i17;
                }
                view.setLayoutParams(marginLayoutParams);
            }
        }
        com.tencent.mm.plugin.finder.live.widget.cf cfVar = this.f118227b;
        android.view.View view2 = cfVar.L;
        android.view.ViewGroup.LayoutParams layoutParams2 = view2 != null ? view2.getLayoutParams() : null;
        android.widget.LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams2 : null;
        if (i17 > com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz)) {
            if (layoutParams3 != null) {
                layoutParams3.bottomMargin = i17 - com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz);
            }
        } else if (layoutParams3 != null) {
            layoutParams3.bottomMargin = i17;
        }
        android.view.View view3 = cfVar.L;
        android.view.ViewParent parent = view3 != null ? view3.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.updateViewLayout(cfVar.L, layoutParams3);
        }
        if (z17 || (editText = cfVar.Q) == null) {
            return;
        }
        editText.clearFocus();
    }

    public final void b() {
        android.app.Activity activity;
        com.tencent.mm.plugin.finder.live.widget.bh bhVar = this.f118226a;
        if (bhVar != null) {
            java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
            if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
                java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
                activity = j17 != null ? (android.app.Activity) j17.get() : null;
            }
            if (activity instanceof com.tencent.mm.plugin.webview.core.w0) {
                activity.finish();
            }
            db5.t7.i(bhVar.getContext(), bhVar.getContext().getString(com.tencent.mm.R.string.lv8), com.tencent.mm.R.raw.icons_filled_done);
            if (bhVar.S) {
                android.view.View view = bhVar.B;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "onSuperFansUpgradeSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "onSuperFansUpgradeSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                bhVar.f117879J.setVisibility(0);
            }
        }
    }
}
