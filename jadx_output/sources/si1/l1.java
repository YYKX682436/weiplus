package si1;

/* loaded from: classes7.dex */
public final class l1 extends fl1.o {
    public final ui1.y D;
    public final si1.f1 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(android.content.Context context, xi1.g windowAndroid, ui1.y listener, si1.f1 scopeProvider) {
        super(context, windowAndroid, listener);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(windowAndroid, "windowAndroid");
        kotlin.jvm.internal.o.g(listener, "listener");
        kotlin.jvm.internal.o.g(scopeProvider, "scopeProvider");
        this.D = listener;
        this.E = scopeProvider;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f263817e.findViewById(com.tencent.mm.R.id.o6r);
        android.widget.Button button = (android.widget.Button) this.f263817e.findViewById(com.tencent.mm.R.id.f482342bw);
        android.widget.Button button2 = (android.widget.Button) this.f263817e.findViewById(com.tencent.mm.R.id.f482948sl);
        android.widget.Button button3 = (android.widget.Button) this.f263817e.findViewById(com.tencent.mm.R.id.lsr);
        java.lang.String str = ((ui1.u) scopeProvider).f428086a;
        if (str == null || str.length() == 0) {
            android.view.View view = this.f263829t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/permission/ThreeStateAuthorizePromptPresenterView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/platform/window/WindowAndroid;Lcom/tencent/mm/plugin/appbrand/permission/jsauth/IJsAuthorizePromptPresenterView$Listener;Lcom/tencent/mm/plugin/appbrand/permission/ScopeProvider;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/permission/ThreeStateAuthorizePromptPresenterView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/platform/window/WindowAndroid;Lcom/tencent/mm/plugin/appbrand/permission/jsauth/IJsAuthorizePromptPresenterView$Listener;Lcom/tencent/mm/plugin/appbrand/permission/ScopeProvider;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            this.f263820h.setOnClickListener(new si1.g1(this));
            this.f263821i.setOnClickListener(new si1.h1(this));
            return;
        }
        android.view.View view2 = this.f263829t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/permission/ThreeStateAuthorizePromptPresenterView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/platform/window/WindowAndroid;Lcom/tencent/mm/plugin/appbrand/permission/jsauth/IJsAuthorizePromptPresenterView$Listener;Lcom/tencent/mm/plugin/appbrand/permission/ScopeProvider;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/permission/ThreeStateAuthorizePromptPresenterView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/platform/window/WindowAndroid;Lcom/tencent/mm/plugin/appbrand/permission/jsauth/IJsAuthorizePromptPresenterView$Listener;Lcom/tencent/mm/plugin/appbrand/permission/ScopeProvider;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        if (button != null) {
            button.setOnClickListener(new si1.i1(this));
        }
        if (button2 != null) {
            button2.setOnClickListener(new si1.j1(this));
        }
        if (button3 != null) {
            button3.setOnClickListener(new si1.k1(this));
        }
    }

    @Override // fl1.o, ui1.z
    public void setSelectListItem(java.util.List list) {
    }
}
