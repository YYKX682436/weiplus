package tb2;

/* loaded from: classes3.dex */
public final class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f416972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f416973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tb2.h f416974f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f416975g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f416976h;

    public g(androidx.recyclerview.widget.k3 k3Var, boolean z17, tb2.h hVar, android.view.ViewPropertyAnimator viewPropertyAnimator, kotlin.jvm.internal.h0 h0Var) {
        this.f416972d = k3Var;
        this.f416973e = z17;
        this.f416974f = hVar;
        this.f416975g = viewPropertyAnimator;
        this.f416976h = h0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel: ");
        androidx.recyclerview.widget.k3 k3Var = this.f416972d;
        sb6.append(k3Var.hashCode());
        sb6.append(' ');
        sb6.append(k3Var.getAdapterPosition());
        sb6.append(" liveFeed: ");
        sb6.append(this.f416973e);
        com.tencent.mars.xlog.Log.i("RecyclerFadeInDownAnimator", sb6.toString());
        android.view.View itemView = k3Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        this.f416974f.K(itemView);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f416975g.setListener(null);
        tb2.h hVar = this.f416974f;
        androidx.recyclerview.widget.k3 k3Var = this.f416972d;
        hVar.y(k3Var);
        hVar.f399285q.remove(k3Var);
        hVar.G();
        android.view.View itemView = k3Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        hVar.K(itemView);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove onAnimationEnd recover animate originAnimate: ");
        kotlin.jvm.internal.h0 h0Var = this.f416976h;
        sb6.append(h0Var.f310123d);
        sb6.append("  ");
        sb6.append(k3Var.hashCode());
        sb6.append(' ');
        sb6.append(k3Var.getAdapterPosition());
        sb6.append(" liveFeed: ");
        sb6.append(this.f416973e);
        com.tencent.mars.xlog.Log.i("RecyclerFadeInDownAnimator", sb6.toString());
        hVar.f416977t.setItemAnimator((androidx.recyclerview.widget.n2) h0Var.f310123d);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationStart: ");
        androidx.recyclerview.widget.k3 k3Var = this.f416972d;
        sb6.append(k3Var.hashCode());
        sb6.append(' ');
        sb6.append(k3Var.getAdapterPosition());
        sb6.append(" liveFeed: ");
        sb6.append(this.f416973e);
        com.tencent.mars.xlog.Log.i("RecyclerFadeInDownAnimator", sb6.toString());
        this.f416974f.C(k3Var);
    }
}
