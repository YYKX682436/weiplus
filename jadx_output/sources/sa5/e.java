package sa5;

/* loaded from: classes14.dex */
public abstract class e extends sa5.j {

    /* renamed from: e, reason: collision with root package name */
    public float f405335e;

    @Override // sa5.j
    public void a() {
    }

    @Override // sa5.j
    public void c() {
        sa5.p pVar;
        android.view.View view = this.f405351d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f405351d;
        this.f405335e = view2 != null ? view2.getAlpha() : 0.0f;
        android.view.View view3 = this.f405351d;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view4 = this.f405351d;
        if (view4 == null || (pVar = this.f405349b) == null) {
            return;
        }
        view4.setScaleX(pVar.f405363a);
        view4.setScaleY(pVar.f405364b);
    }

    @Override // sa5.j
    public void d() {
        super.d();
        android.view.View view = this.f405351d;
        if (view != null) {
            float f17 = this.f405335e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnimExt", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnimExt", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            sa5.k kVar = this.f405348a;
            if (kVar != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(kVar.f405353a));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnimExt", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/ui/anim/inout/AnimInAction", "beforeAnimExt", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            float measuredWidth = this.f405351d != null ? r0.getMeasuredWidth() : 0.0f;
            float measuredHeight = this.f405351d != null ? r2.getMeasuredHeight() : 0.0f;
            sa5.w wVar = this.f405350c;
            if (wVar != null) {
                view.setTranslationX(((java.lang.Number) wVar.f405371a.invoke(java.lang.Float.valueOf(measuredWidth))).floatValue());
                view.setTranslationY(((java.lang.Number) wVar.f405372b.invoke(java.lang.Float.valueOf(measuredHeight))).floatValue());
            }
        }
    }

    @Override // sa5.j
    public boolean e() {
        return false;
    }

    @Override // sa5.j
    public void g(android.view.ViewPropertyAnimator viewPropertyAnimator) {
        kotlin.jvm.internal.o.g(viewPropertyAnimator, "viewPropertyAnimator");
        viewPropertyAnimator.alpha(1.0f);
        viewPropertyAnimator.scaleX(1.0f);
        viewPropertyAnimator.scaleY(1.0f);
        viewPropertyAnimator.translationX(0.0f);
        viewPropertyAnimator.translationY(0.0f);
    }

    public final sa5.e i(sa5.e otherAction) {
        kotlin.jvm.internal.o.g(otherAction, "otherAction");
        sa5.k kVar = this.f405348a;
        if (kVar == null) {
            kVar = otherAction.f405348a;
        }
        this.f405348a = kVar;
        sa5.p pVar = this.f405349b;
        if (pVar == null) {
            pVar = otherAction.f405349b;
        }
        this.f405349b = pVar;
        sa5.w wVar = this.f405350c;
        if (wVar == null) {
            wVar = otherAction.f405350c;
        }
        this.f405350c = wVar;
        return this;
    }
}
