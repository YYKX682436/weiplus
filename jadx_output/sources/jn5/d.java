package jn5;

/* loaded from: classes3.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f300840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f300841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jn5.i f300842f;

    public d(androidx.recyclerview.widget.k3 k3Var, android.view.View view, jn5.i iVar) {
        this.f300840d = k3Var;
        this.f300841e = view;
        this.f300842f = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        androidx.recyclerview.widget.k3 k3Var = this.f300840d;
        android.view.ViewParent parent = k3Var.itemView.getParent();
        androidx.recyclerview.widget.RecyclerView recyclerView = parent instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) parent : null;
        android.view.View view = this.f300841e;
        view.getTop();
        boolean z17 = ((float) view.getBottom()) + view.getTranslationY() > ((float) (recyclerView != null ? recyclerView.getHeight() : 0));
        yz5.p pVar = this.f300842f.f300857t;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.valueOf(z17), k3Var);
        }
    }
}
