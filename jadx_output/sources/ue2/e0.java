package ue2;

/* loaded from: classes3.dex */
public final class e0 extends android.widget.FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f426803n = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f426804d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f426805e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f426806f;

    /* renamed from: g, reason: collision with root package name */
    public ue2.i0 f426807g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f426808h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f426809i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.animation.AccelerateDecelerateInterpolator f426810m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f426804d = context;
        this.f426810m = new android.view.animation.AccelerateDecelerateInterpolator();
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        setVisibility(8);
        android.view.View view = new android.view.View(context);
        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        view.setBackgroundColor(Integer.MIN_VALUE);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog", "initializeShell", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog", "initializeShell", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setOnClickListener(new ue2.z(this));
        this.f426806f = view;
        addView(view);
        com.tencent.mars.xlog.Log.i("FinderLiveChatInternalDialog", "initializeShell: 弹窗壳初始化完成");
    }

    public final void a(boolean z17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator interpolator;
        android.view.ViewPropertyAnimator withEndAction;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration2;
        if (!this.f426808h || this.f426809i) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveChatInternalDialog", "dismiss: 开始隐藏内部弹窗");
        this.f426809i = true;
        android.view.View view = this.f426806f;
        if (view != null && (animate2 = view.animate()) != null && (alpha = animate2.alpha(0.0f)) != null && (duration2 = alpha.setDuration(300L)) != null) {
            duration2.start();
        }
        android.view.ViewGroup viewGroup = this.f426805e;
        if (viewGroup == null || (animate = viewGroup.animate()) == null) {
            return;
        }
        android.view.ViewPropertyAnimator translationY = animate.translationY(this.f426805e != null ? r4.getHeight() : 0.0f);
        if (translationY == null || (duration = translationY.setDuration(300L)) == null || (interpolator = duration.setInterpolator(this.f426810m)) == null || (withEndAction = interpolator.withEndAction(new ue2.y(this, z17))) == null) {
            return;
        }
        withEndAction.start();
    }

    public final void b() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator interpolator;
        android.view.ViewPropertyAnimator withStartAction;
        android.view.ViewPropertyAnimator withEndAction;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration2;
        if (this.f426808h || this.f426809i) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveChatInternalDialog", "show: 开始显示内部弹窗");
        this.f426809i = true;
        setVisibility(0);
        android.view.View view = this.f426806f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup viewGroup = this.f426805e;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        android.view.View view2 = this.f426806f;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog", "show", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/livechat/FinderLiveChatInternalDialog", "show", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.ViewGroup viewGroup2 = this.f426805e;
        if (viewGroup2 != null) {
            viewGroup2.setTranslationY(viewGroup2 != null ? viewGroup2.getHeight() : 0.0f);
        }
        android.view.View view3 = this.f426806f;
        if (view3 != null && (animate2 = view3.animate()) != null && (alpha = animate2.alpha(1.0f)) != null && (duration2 = alpha.setDuration(300L)) != null) {
            duration2.start();
        }
        android.view.ViewGroup viewGroup3 = this.f426805e;
        if (viewGroup3 == null || (animate = viewGroup3.animate()) == null || (translationY = animate.translationY(0.0f)) == null || (duration = translationY.setDuration(300L)) == null || (interpolator = duration.setInterpolator(this.f426810m)) == null || (withStartAction = interpolator.withStartAction(new ue2.c0(this))) == null || (withEndAction = withStartAction.withEndAction(new ue2.d0(this))) == null) {
            return;
        }
        withEndAction.start();
    }

    public final android.view.ViewGroup getContentView() {
        return this.f426805e;
    }

    public final void setContentView(android.view.ViewGroup contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        if (this.f426808h || this.f426809i) {
            com.tencent.mars.xlog.Log.w("FinderLiveChatInternalDialog", "setContentView: 弹窗正在显示或动画中，不能设置内容");
            return;
        }
        android.view.View view = this.f426805e;
        if (view != null) {
            removeView(view);
        }
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f426804d);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setOnClickListener(ue2.b0.f426796d);
        frameLayout.setTranslationY(frameLayout.getHeight());
        frameLayout.addView(contentView);
        this.f426805e = frameLayout;
        addView(frameLayout);
        com.tencent.mars.xlog.Log.i("FinderLiveChatInternalDialog", "setContentView: 内容视图已设置，添加了点击事件防护");
    }

    public final void setInternalDialogListener(ue2.i0 i0Var) {
        this.f426807g = i0Var;
    }
}
