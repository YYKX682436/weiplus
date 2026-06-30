package vg2;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f436483a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f436484b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f436485c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f436486d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436487e;

    public c(android.content.Context context, android.view.ViewGroup parentRoot) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parentRoot, "parentRoot");
        this.f436483a = context;
        this.f436484b = parentRoot;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(a(), (android.view.ViewGroup) null);
        this.f436485c = inflate;
        this.f436486d = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a4f);
        this.f436487e = "";
    }

    public abstract int a();

    public int b() {
        return i65.a.b(this.f436483a, 4);
    }

    public final void c() {
        android.view.View view = this.f436485c;
        if (view.getVisibility() == 0) {
            android.view.View view2 = this.f436485c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/BaseGiftWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/gift/widget/BaseGiftWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f436484b.removeView(view);
        }
    }

    public void d(android.view.ViewGroup attachView, java.lang.String giftId) {
        kotlin.jvm.internal.o.g(attachView, "attachView");
        kotlin.jvm.internal.o.g(giftId, "giftId");
        this.f436487e = giftId;
        android.view.View view = this.f436485c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/BaseGiftWidget", "showWidget", "(Landroid/view/ViewGroup;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/gift/widget/BaseGiftWidget", "showWidget", "(Landroid/view/ViewGroup;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f436485c;
        view2.getViewTreeObserver().addOnPreDrawListener(new vg2.b(this, attachView));
        android.view.ViewGroup viewGroup = this.f436484b;
        viewGroup.removeView(view2);
        viewGroup.addView(view2);
    }
}
