package cw3;

/* loaded from: classes10.dex */
public final class m extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f224178d;

    /* renamed from: e, reason: collision with root package name */
    public int f224179e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f224180f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f224181g;

    /* renamed from: h, reason: collision with root package name */
    public cw3.o f224182h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f224183i;

    public m(java.util.ArrayList resourceList) {
        kotlin.jvm.internal.o.g(resourceList, "resourceList");
        this.f224178d = resourceList;
        this.f224179e = -1;
        this.f224181g = true;
        this.f224183i = new java.util.HashMap();
    }

    public static final void x(cw3.m mVar, android.view.View view, float f17) {
        mVar.getClass();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", f17);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", f17);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(100L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f224178d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        cw3.k holder = (cw3.k) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean z17 = this.f224181g;
        android.view.View view = holder.f224174d;
        if (z17 && i17 == this.f224179e) {
            this.f224181g = false;
            view.setScaleX(1.4f);
            view.setScaleY(1.4f);
            this.f224180f = view;
        }
        java.util.HashMap hashMap = this.f224183i;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        kotlin.jvm.internal.o.f(view, "<get-outerFl>(...)");
        hashMap.put(valueOf, view);
        android.view.View view2 = holder.f224175e;
        android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) (view2 != null ? view2.getBackground() : null);
        if (gradientDrawable != null) {
            gradientDrawable.setShape(1);
        }
        if (gradientDrawable != null) {
            gradientDrawable.setColor(((cw3.n) this.f224178d.get(i17)).f224184a);
        }
        view.setOnClickListener(new cw3.l(this, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dco, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new cw3.k(inflate);
    }

    public final void y(int i17) {
        if (this.f224179e != i17) {
            android.view.View view = this.f224180f;
            if (view != null) {
                view.setScaleX(1.0f);
            }
            android.view.View view2 = this.f224180f;
            if (view2 != null) {
                view2.setScaleY(1.0f);
            }
        }
        this.f224179e = i17;
        android.view.View view3 = (android.view.View) this.f224183i.get(java.lang.Integer.valueOf(i17));
        this.f224180f = view3;
        if (view3 != null) {
            view3.setScaleX(1.4f);
        }
        android.view.View view4 = this.f224180f;
        if (view4 == null) {
            return;
        }
        view4.setScaleY(1.4f);
    }
}
