package wa2;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f444134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f444135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f444137g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f444138h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.view.View view, android.widget.ImageView imageView, yz5.a aVar, android.app.Activity activity, android.content.Intent intent) {
        super(1);
        this.f444134d = view;
        this.f444135e = imageView;
        this.f444136f = aVar;
        this.f444137g = activity;
        this.f444138h = intent;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.animation.Animator it = (android.animation.Animator) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.View view = this.f444134d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1$6", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1$6", "invoke", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yz5.a aVar = this.f444136f;
        android.widget.ImageView imageView = this.f444135e;
        imageView.post(new wa2.k(imageView, aVar, this.f444137g, this.f444138h));
        com.tencent.mars.xlog.Log.i("ActivityToggleAnimator", "[exitAnimation] end");
        return jz5.f0.f302826a;
    }
}
