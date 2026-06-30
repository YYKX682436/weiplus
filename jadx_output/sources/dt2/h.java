package dt2;

/* loaded from: classes3.dex */
public final class h extends android.widget.FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f243179h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f243180d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f243181e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f243182f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f243183g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aye, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f243181e = inflate;
        addView(inflate);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.l47);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f243180d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.cut);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.l3x);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f243182f = (android.view.ViewGroup) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.kwq);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f243183g = findViewById4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDimension(float f17) {
        android.view.ViewGroup viewGroup = this.f243182f;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (f17 > 1.0f) {
            layoutParams.width = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479670c7);
            layoutParams.height = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.by);
        } else {
            layoutParams.width = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.by);
            layoutParams.height = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479670c7);
        }
        viewGroup.setLayoutParams(layoutParams);
    }

    public final void setFragment(r45.w94 fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        android.view.View view = this.f243183g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayFragmentThumbView", "setFragment", "(Lcom/tencent/mm/protocal/protobuf/LiveReplayWonderfulFragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayFragmentThumbView", "setFragment", "(Lcom/tencent/mm/protocal/protobuf/LiveReplayWonderfulFragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(fragment.getString(2), com.tencent.mm.plugin.finder.storage.y90.f128356f));
        dt2.g gVar = new dt2.g(this, fragment);
        a17.getClass();
        a17.f447873d = gVar;
        a17.f();
    }
}
