package lj2;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f318937a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f318938b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f318939c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f318940d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f318941e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f318942f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f318943g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f318944h;

    /* renamed from: i, reason: collision with root package name */
    public int f318945i;

    /* renamed from: j, reason: collision with root package name */
    public int f318946j;

    public s(android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        this.f318937a = root;
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.eo9);
        this.f318938b = textView;
        android.widget.TextView textView2 = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.eo_);
        this.f318939c = textView2;
        android.widget.TextView textView3 = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f484564eo4);
        this.f318940d = textView3;
        android.widget.TextView textView4 = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f484567ep1);
        this.f318941e = textView4;
        this.f318942f = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.eo7);
        android.widget.TextView textView5 = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.eo6);
        this.f318943g = textView5;
        this.f318944h = root.findViewById(com.tencent.mm.R.id.eo8);
        this.f318945i = 2;
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        float f17 = (12.0f * displayMetrics.density) / context.getResources().getDisplayMetrics().density;
        textView.setTextSize(1, f17);
        textView2.setTextSize(1, f17);
        textView3.setTextSize(1, f17);
        textView5.setTextSize(1, f17);
        textView4.setVisibility(8);
        textView4.setTextSize(1, f17);
    }

    public final void a(int i17) {
        android.view.View view = this.f318937a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget$AcceptViewHolder", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget$AcceptViewHolder", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b() {
        int i17 = this.f318945i;
        android.view.View view = this.f318937a;
        this.f318939c.setText(i17 == 2 ? this.f318946j == 3 ? view.getContext().getString(com.tencent.mm.R.string.m8r) : view.getContext().getString(com.tencent.mm.R.string.f491674dw4) : view.getContext().getString(com.tencent.mm.R.string.f491672dw1));
    }
}
