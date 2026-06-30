package zj2;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener, ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f473291d;

    /* renamed from: e, reason: collision with root package name */
    public final ak2.a f473292e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f473293f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f473294g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f473295h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f473296i;

    public c(android.view.View root, ak2.a adapter) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f473291d = root;
        this.f473292e = adapter;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.evm);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        this.f473293f = viewGroup;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.cjn);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f473294g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.f483752by4);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f473295h = findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.f486233ko0);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById4;
        this.f473296i = mMPAGView;
        findViewById3.setOnClickListener(this);
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        mMPAGView.o(ae2.in.f3688a.a(ym5.f6.I));
        android.content.res.AssetManager assets = root.getContext().getAssets();
        kotlin.jvm.internal.o.f(assets, "getAssets(...)");
        mMPAGView.k(assets, "small_mile_stone_lottery_amin.pag");
        mMPAGView.a(this);
        viewGroup.setTranslationY(-i65.a.b(root.getContext(), 16));
        viewGroup.setTranslationX(-i65.a.b(root.getContext(), 12));
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f473294g.setVisibility(0);
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/milestone/banner/LiveMilestoneBubbleWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f483752by4) {
            ((ck2.o) this.f473292e).d7();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/milestone/banner/LiveMilestoneBubbleWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
