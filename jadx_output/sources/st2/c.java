package st2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f412236a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingCouponCardView f412237b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f412238c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f412239d;

    public c(android.view.View rootView, if2.b controller) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f412236a = rootView;
        this.f412237b = (com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingCouponCardView) rootView.findViewById(com.tencent.mm.R.id.uez);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.rhd);
        this.f412238c = findViewById;
        new androidx.recyclerview.widget.LinearLayoutManager(rootView.getContext(), 0, false);
        findViewById.setOnClickListener(new st2.a(this));
    }

    public static final void a(st2.c cVar) {
        android.view.View view = cVar.f412236a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveCouponCardListWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/FinderLiveCouponCardListWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
