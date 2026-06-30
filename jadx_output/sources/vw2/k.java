package vw2;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f440856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f440857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f440858f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f440859g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.view.View view, android.widget.TextView textView, android.view.ViewGroup viewGroup, int i17) {
        super(0);
        this.f440856d = view;
        this.f440857e = textView;
        this.f440858f = viewGroup;
        this.f440859g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f440856d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/animation/btncarousel/ToolbarButtonCarouselAnimationHelper$getSingleButtonEduAnimator$onAnimationComplete$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/animation/btncarousel/ToolbarButtonCarouselAnimationHelper$getSingleButtonEduAnimator$onAnimationComplete$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f440856d.setTranslationY(0.0f);
        android.widget.TextView textView = this.f440857e;
        textView.setAlpha(0.0f);
        textView.setTranslationY(0.0f);
        textView.setVisibility(8);
        android.view.ViewGroup viewGroup = this.f440858f;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = this.f440859g;
        viewGroup.setLayoutParams(layoutParams);
        return jz5.f0.f302826a;
    }
}
