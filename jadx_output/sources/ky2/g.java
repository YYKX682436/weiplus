package ky2;

/* loaded from: classes.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky2.w f313537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f313538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f313539f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f313540g;

    public g(ky2.w wVar, android.view.View view, android.widget.TextView textView, int i17) {
        this.f313537d = wVar;
        this.f313538e = view;
        this.f313539f = textView;
        this.f313540g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$SettingVoteViewHolder$_onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f313538e;
        android.content.Context context = view2.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ky2.w wVar = this.f313537d;
        wVar.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i17 = 1; i17 < 16; i17++) {
            arrayList2.add(context.getResources().getString(com.tencent.mm.R.string.eju, java.lang.String.valueOf(i17)));
        }
        com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(view2.getContext(), arrayList2);
        c0Var.i(wVar.f313592o);
        android.view.View inflate = android.view.LayoutInflater.from(view2.getContext()).inflate(com.tencent.mm.R.layout.b1s, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mnn);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        c0Var.g(inflate);
        c0Var.f212259t = new ky2.f(c0Var, this.f313539f, wVar, this.f313540g);
        java.lang.Object systemService = wVar.f313584d.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(view2.getWindowToken(), 0);
        c0Var.l();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$SettingVoteViewHolder$_onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
