package sa5;

/* loaded from: classes14.dex */
public abstract class f extends sa5.j {

    /* renamed from: e, reason: collision with root package name */
    public final int f405337e;

    public f(int i17) {
        this.f405337e = i17;
    }

    @Override // sa5.j
    public void a() {
        android.view.View view = this.f405351d;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f405337e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/anim/inout/AnimOutAction", "afterAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/anim/inout/AnimOutAction", "afterAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // sa5.j
    public void c() {
    }

    @Override // sa5.j
    public boolean e() {
        android.view.View view = this.f405351d;
        return view != null && view.getVisibility() == this.f405337e;
    }

    @Override // sa5.j
    public android.view.animation.Interpolator f() {
        return super.f();
    }

    @Override // sa5.j
    public void g(android.view.ViewPropertyAnimator viewPropertyAnimator) {
        kotlin.jvm.internal.o.g(viewPropertyAnimator, "viewPropertyAnimator");
        sa5.k kVar = this.f405348a;
        if (kVar != null) {
            viewPropertyAnimator.alpha(kVar.f405353a);
        }
        sa5.p pVar = this.f405349b;
        if (pVar != null) {
            viewPropertyAnimator.scaleX(pVar.f405363a);
            viewPropertyAnimator.scaleY(pVar.f405364b);
        }
        sa5.w wVar = this.f405350c;
        if (wVar != null) {
            viewPropertyAnimator.translationX(((java.lang.Number) wVar.f405371a.invoke(java.lang.Float.valueOf(this.f405351d != null ? r1.getMeasuredWidth() : 0.0f))).floatValue());
            viewPropertyAnimator.translationY(((java.lang.Number) wVar.f405372b.invoke(java.lang.Float.valueOf(this.f405351d != null ? r1.getMeasuredHeight() : 0.0f))).floatValue());
        }
    }

    public final sa5.f i(sa5.f otherAction) {
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

    public /* synthetic */ f(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 4 : i17);
    }
}
