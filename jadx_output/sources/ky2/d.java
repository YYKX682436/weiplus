package ky2;

/* loaded from: classes.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f313519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ky2.w f313520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f313521f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f313522g;

    public d(android.view.View view, ky2.w wVar, int i17, android.widget.TextView textView) {
        this.f313519d = view;
        this.f313520e = wVar;
        this.f313521f = i17;
        this.f313522g = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$SettingVoteViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f313519d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(view2.getContext(), 1, false);
        ky2.w wVar = this.f313520e;
        android.view.View view3 = this.f313519d;
        k0Var.f211872n = new ky2.b(wVar, view3);
        k0Var.f211881s = new ky2.c(wVar, this.f313521f, this.f313522g, view3, k0Var);
        java.lang.Object systemService = wVar.f313584d.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(view2.getWindowToken(), 0);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$SettingVoteViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
