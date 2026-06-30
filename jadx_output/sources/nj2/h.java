package nj2;

/* loaded from: classes10.dex */
public final class h extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final gk2.e H;
    public final zh2.c I;

    /* renamed from: J, reason: collision with root package name */
    public final zh2.e f337835J;
    public android.view.View K;
    public android.view.View L;
    public final jz5.g M;
    public final jz5.g N;
    public android.widget.TextView P;
    public android.widget.TextView Q;
    public android.view.View R;
    public final nj2.f S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, gk2.e liveData, zh2.c pluginAbility, zh2.e userInterface) {
        super(context, false, null, 0.75f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(userInterface, "userInterface");
        this.H = liveData;
        this.I = pluginAbility;
        this.f337835J = userInterface;
        this.M = jz5.h.b(new nj2.c(this));
        this.N = jz5.h.b(new nj2.g(context, this));
        this.S = new nj2.f(this);
    }

    public static final nj2.j e0(nj2.h hVar) {
        return (nj2.j) ((jz5.n) hVar.M).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.dqs;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.R = rootView;
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.imn);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.K = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.enl);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.L = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.rmg);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.P = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.s5g);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.Q = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.gz9);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById5);
        Y(com.tencent.mm.R.color.f478489a);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void U() {
        super.U();
        zh2.c cVar = this.I;
        df2.g3 g3Var = (df2.g3) cVar.getController(df2.g3.class);
        if (g3Var != null) {
            g3Var.Z6(0, (int) ((mm2.c1) cVar.g().a(mm2.c1.class)).f328866q, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377132g, new nj2.d(this));
        }
    }

    public final void f0(boolean z17) {
        if (z17) {
            android.view.View view = this.K;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.L;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("contentView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.K;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.L;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel", "showLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View v() {
        android.view.View inflate = android.view.LayoutInflater.from(this.f118183e).inflate(com.tencent.mm.R.layout.f488951eb1, (android.view.ViewGroup) null);
        java.util.Objects.toString(inflate);
        kotlin.jvm.internal.o.d(inflate);
        return inflate;
    }
}
