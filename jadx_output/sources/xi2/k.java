package xi2;

/* loaded from: classes13.dex */
public final class k implements xi2.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ImageView f454728a;

    /* renamed from: b, reason: collision with root package name */
    public final xi2.f f454729b;

    /* renamed from: c, reason: collision with root package name */
    public u3.u f454730c;

    /* renamed from: d, reason: collision with root package name */
    public u3.u f454731d;

    public k(android.widget.ImageView battleStartView, xi2.f animateCallback) {
        kotlin.jvm.internal.o.g(battleStartView, "battleStartView");
        kotlin.jvm.internal.o.g(animateCallback, "animateCallback");
        this.f454728a = battleStartView;
        this.f454729b = animateCallback;
        battleStartView.setVisibility(8);
    }

    @Override // xi2.g
    public android.view.View a() {
        return this.f454728a;
    }

    @Override // xi2.g
    public void b(kotlinx.coroutines.y0 scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        android.widget.ImageView imageView = this.f454728a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/start/MultiNewBattlePagStartView", "doSpringAnimation", "(Landroid/view/View;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(imageView, "com/tencent/mm/plugin/finder/live/mic/pk/start/MultiNewBattlePagStartView", "doSpringAnimation", "(Landroid/view/View;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setScaleX(0.0f);
        imageView.setScaleY(0.0f);
        u3.u uVar = new u3.u(imageView, u3.s.f424219n, 1.0f);
        uVar.f424236t.b(300.0f);
        uVar.f424236t.a(0.5f);
        uVar.f424226b = 0.0f;
        uVar.f424227c = true;
        uVar.a(new xi2.j(scope, this));
        this.f454730c = uVar;
        u3.u uVar2 = new u3.u(imageView, u3.s.f424220o, 1.0f);
        uVar2.f424236t.b(300.0f);
        uVar2.f424236t.a(0.5f);
        uVar2.f424226b = 0.0f;
        uVar2.f424227c = true;
        this.f454731d = uVar2;
        u3.u uVar3 = this.f454730c;
        if (uVar3 != null) {
            uVar3.e();
        }
        u3.u uVar4 = this.f454731d;
        if (uVar4 != null) {
            uVar4.e();
        }
        this.f454729b.onAnimationStart();
    }

    @Override // xi2.g
    public int getVisibility() {
        return this.f454728a.getVisibility();
    }

    @Override // xi2.g
    public void reset() {
        u3.u uVar = this.f454730c;
        if (uVar != null) {
            uVar.b();
        }
        u3.u uVar2 = this.f454731d;
        if (uVar2 != null) {
            uVar2.b();
        }
        setVisibility(8);
    }

    @Override // xi2.g
    public void setVisibility(int i17) {
        this.f454728a.setVisibility(i17);
    }
}
