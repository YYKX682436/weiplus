package cw1;

/* loaded from: classes3.dex */
public final class a7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI f222786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv1.g1 f222787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222788f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222789g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222790h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222791i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222792m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f222793n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222794o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ cw1.j7 f222795p;

    public a7(com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI cleanOtherAccountUI, yv1.g1 g1Var, android.view.View view, android.view.View view2, android.view.View view3, android.widget.TextView textView, android.widget.TextView textView2, int i17, android.view.View view4, cw1.j7 j7Var) {
        this.f222786d = cleanOtherAccountUI;
        this.f222787e = g1Var;
        this.f222788f = view;
        this.f222789g = view2;
        this.f222790h = view3;
        this.f222791i = textView;
        this.f222792m = textView2;
        this.f222793n = i17;
        this.f222794o = view4;
        this.f222795p = j7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI cleanOtherAccountUI = this.f222786d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) cleanOtherAccountUI, 1, true);
        yv1.g1 g1Var = this.f222787e;
        android.view.View view2 = this.f222788f;
        android.view.View view3 = this.f222789g;
        android.view.View view4 = this.f222790h;
        android.widget.TextView textView = this.f222791i;
        android.widget.TextView textView2 = this.f222792m;
        int i17 = this.f222793n;
        android.view.View view5 = this.f222794o;
        cw1.j7 j7Var = this.f222795p;
        k0Var.q(cleanOtherAccountUI.getString(com.tencent.mm.R.string.dyi), 17);
        k0Var.f211872n = new cw1.v6(cleanOtherAccountUI);
        k0Var.f211881s = new cw1.z6(cleanOtherAccountUI, g1Var, view2, view3, view4, textView, textView2, i17, view5, j7Var);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
