package ut2;

/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f430992a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f430993b;

    /* renamed from: c, reason: collision with root package name */
    public final gk2.e f430994c;

    /* renamed from: d, reason: collision with root package name */
    public ut2.q0 f430995d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.HorizontalScrollView f430996e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f430997f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f430998g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f430999h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.LinearLayout f431000i;

    public m0(android.view.View root, boolean z17, gk2.e buContext) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f430992a = root;
        this.f430993b = z17;
        this.f430994c = buContext;
        android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) root.findViewById(com.tencent.mm.R.id.t5z);
        this.f430996e = horizontalScrollView;
        this.f430997f = new java.util.ArrayList();
        this.f430998g = kz5.p0.f313996d;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(root.getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        linearLayout.setVisibility(0);
        this.f431000i = linearLayout;
        horizontalScrollView.removeAllViews();
        horizontalScrollView.addView(linearLayout);
        horizontalScrollView.setVisibility(8);
    }

    public final void a() {
        java.util.List list = this.f430997f;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f431000i.removeView((android.widget.LinearLayout) it.next());
        }
        ((java.util.ArrayList) list).clear();
        this.f430996e.setVisibility(8);
    }
}
