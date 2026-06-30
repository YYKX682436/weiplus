package ll2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f319129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f319130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f319131f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.view.View view, android.widget.TextView textView, android.view.View view2) {
        super(1);
        this.f319129d = view;
        this.f319130e = textView;
        this.f319131f = view2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.a it = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = it.f105327a;
        android.view.View view = this.f319129d;
        android.widget.TextView textView = this.f319130e;
        if (z17) {
            r45.f03 f03Var = it.f105328b;
            java.lang.Integer valueOf = f03Var != null ? java.lang.Integer.valueOf(f03Var.f373887d) : null;
            if (valueOf != null && valueOf.intValue() == 6) {
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (textView != null) {
                    textView.setVisibility(8);
                }
                android.view.View view2 = this.f319131f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (valueOf == null || valueOf.intValue() != 2) {
                if (textView != null) {
                    textView.setVisibility(8);
                }
                if (view != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view3 = this.f319131f;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (f03Var != null) {
                int i17 = f03Var.f373888e;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                if (textView != null) {
                    ll2.e eVar = ll2.e.f319133a;
                    textView.setText(i17 <= 0 ? "0" : i17 > 99 ? "..." : java.lang.String.valueOf(i17));
                }
                if (view != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view4 = this.f319131f;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view4, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            if (view != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.view.View view5 = this.f319131f;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view5, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/reddot/FinderLiveRedDotHelper$registerRedDot$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
